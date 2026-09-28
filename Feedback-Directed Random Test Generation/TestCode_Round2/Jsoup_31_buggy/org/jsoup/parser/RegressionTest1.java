package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        boolean boolean2 = endTag1.selfClosing;
        boolean boolean3 = endTag1.isCharacter();
        boolean boolean4 = endTag1.isCharacter();
        boolean boolean5 = endTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataLessthanSign;
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</Doctype4>");
        java.lang.String str2 = startTag1.name();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</Doctype4>" + "'", str2, "</Doctype4>");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag1.type;
        org.jsoup.nodes.Attributes attributes5 = endTag1.getAttributes();
        java.lang.String str6 = endTag1.toString();
        endTag1.appendAttributeName("<4>");
        boolean boolean9 = endTag1.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.toString();
        java.lang.String str5 = character1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = character1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        boolean boolean3 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("<</hi!>>");
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character9);
        org.jsoup.parser.Token.TokenType tokenType11 = character9.type;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder0.initialiseParse("EOF", "4", parseErrorList23);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        endTag1.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        java.lang.String str30 = comment22.toString();
        java.lang.StringBuilder stringBuilder31 = comment22.data;
        java.lang.String str32 = comment22.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character33 = comment22.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!---->" + "'", str30, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        org.jsoup.nodes.Attributes attributes7 = startTag0.attributes;
        boolean boolean8 = startTag0.isDoctype();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        startTag2.attributes = attributes6;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = startTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</hi!>", "EOF", parseErrorList32);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag34.name("hi!");
        boolean boolean37 = xmlTreeBuilder29.process((org.jsoup.parser.Token) startTag34);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendTagName('4');
        org.jsoup.nodes.Element element41 = xmlTreeBuilder29.insert(startTag38);
        org.jsoup.parser.Token.Character character43 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str44 = character43.getData();
        java.lang.String str45 = character43.toString();
        boolean boolean46 = character43.isStartTag();
        java.lang.String str47 = character43.getData();
        java.lang.String str48 = character43.toString();
        org.jsoup.parser.Token.Character character49 = character43.asCharacter();
        java.lang.String str50 = character43.toString();
        java.lang.String str51 = character43.toString();
        xmlTreeBuilder29.insert(character43);
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str55 = character54.getData();
        java.lang.String str56 = character54.toString();
        boolean boolean57 = character54.isStartTag();
        java.lang.String str58 = character54.getData();
        java.lang.String str59 = character54.toString();
        xmlTreeBuilder29.insert(character54);
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder29.insert(comment61);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        xmlTreeBuilder63.initialiseParse("</hi!>", "EOF", parseErrorList66);
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag70 = startTag68.name("hi!");
        boolean boolean71 = xmlTreeBuilder63.process((org.jsoup.parser.Token) startTag68);
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.appendTagName('4');
        org.jsoup.nodes.Element element75 = xmlTreeBuilder63.insert(startTag72);
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        xmlTreeBuilder63.initialiseParse("Character", "Doctype", parseErrorList78);
        org.jsoup.parser.Token.Comment comment80 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder81 = comment80.data;
        xmlTreeBuilder63.insert(comment80);
        org.jsoup.parser.Token.Comment comment83 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder84 = comment83.data;
        org.jsoup.parser.Token.TokenType tokenType85 = org.jsoup.parser.Token.TokenType.Comment;
        comment83.type = tokenType85;
        xmlTreeBuilder63.insert(comment83);
        java.lang.String str88 = comment83.getData();
        java.lang.String str89 = comment83.toString();
        xmlTreeBuilder29.insert(comment83);
        xmlTreeBuilder0.insert(comment83);
        org.jsoup.parser.Token.Doctype doctype92 = new org.jsoup.parser.Token.Doctype();
        boolean boolean93 = doctype92.forceQuirks;
        java.lang.StringBuilder stringBuilder94 = doctype92.systemIdentifier;
        boolean boolean95 = doctype92.isEndTag();
        java.lang.StringBuilder stringBuilder96 = doctype92.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype97 = doctype92.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype97);
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
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EOF" + "'", str44, "EOF");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EOF" + "'", str45, "EOF");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EOF" + "'", str48, "EOF");
        org.junit.Assert.assertNotNull(character49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "EOF" + "'", str50, "EOF");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EOF" + "'", str51, "EOF");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "EOF" + "'", str55, "EOF");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "EOF" + "'", str56, "EOF");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "EOF" + "'", str58, "EOF");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "EOF" + "'", str59, "EOF");
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder84);
        org.junit.Assert.assertEquals(stringBuilder84.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType85 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType85.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "<!---->" + "'", str89, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(stringBuilder94);
        org.junit.Assert.assertEquals(stringBuilder94.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(stringBuilder96);
        org.junit.Assert.assertEquals(stringBuilder96.toString(), "");
        org.junit.Assert.assertNotNull(doctype97);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        boolean boolean2 = eOF0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = eOF0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        startTag9.appendAttributeValue("<hi!>");
        startTag9.appendAttributeValue('#');
        java.lang.String str18 = startTag9.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<4>" + "'", str13, "<4>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<4>" + "'", str18, "<4>");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        startTag18.appendAttributeName(' ');
        java.lang.String str23 = startTag18.tokenType();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("", attributes26);
        startTag27.selfClosing = false;
        startTag27.newAttribute();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag27.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("<!---->", attributes35);
        startTag18.attributes = attributes35;
        boolean boolean40 = startTag18.isEndTag();
        org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag18);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str43 = doctype42.tokenType();
        java.lang.StringBuilder stringBuilder44 = doctype42.publicIdentifier;
        java.lang.String str45 = doctype42.getName();
        java.lang.String str46 = doctype42.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Doctype" + "'", str43, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        boolean boolean9 = doctype8.forceQuirks;
        java.lang.StringBuilder stringBuilder10 = doctype8.systemIdentifier;
        boolean boolean11 = doctype8.isCharacter();
        doctype8.forceQuirks = false;
        java.lang.StringBuilder stringBuilder14 = doctype8.publicIdentifier;
        java.lang.StringBuilder stringBuilder15 = doctype8.systemIdentifier;
        java.lang.String str16 = doctype8.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        boolean boolean9 = startTag5.isDoctype();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder10.initialiseParse("</hi!>", "EOF", parseErrorList13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        boolean boolean18 = xmlTreeBuilder10.process((org.jsoup.parser.Token) startTag15);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName('4');
        org.jsoup.nodes.Element element22 = xmlTreeBuilder10.insert(startTag19);
        startTag19.newAttribute();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        org.jsoup.nodes.Attributes attributes28 = tag27.attributes;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("", attributes28);
        startTag19.attributes = attributes28;
        startTag5.attributes = attributes28;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character32 = startTag5.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.Class<?> wildcardClass6 = attributes5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        endTag1.appendAttributeName('4');
        org.jsoup.parser.Token.Tag tag12 = endTag1.name("hi!a");
        org.jsoup.nodes.Attributes attributes13 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(attributes13);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        boolean boolean9 = endTag1.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEOF();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<Doctype>" + "'", str2, "<Doctype>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<</hi!>>>");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeValue('4');
        org.jsoup.parser.Token.EndTag endTag9 = endTag1.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag9);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str38 = doctype37.tokenType();
        boolean boolean39 = doctype37.isForceQuirks();
        java.lang.String str40 = doctype37.getPublicIdentifier();
        java.lang.String str41 = doctype37.getSystemIdentifier();
        java.lang.String str42 = doctype37.tokenType();
        java.lang.String str43 = doctype37.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType44 = doctype37.type;
        java.lang.StringBuilder stringBuilder45 = doctype37.name;
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
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(comment35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Doctype" + "'", str38, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Doctype" + "'", str42, "Doctype");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("", attributes39);
        boolean boolean41 = startTag40.isDoctype();
        java.lang.String str42 = startTag40.tagName;
        org.jsoup.parser.Token.TokenType tokenType43 = startTag40.type;
        startTag40.appendTagName(' ');
        boolean boolean46 = startTag40.isDoctype();
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag50 = startTag48.name("hi!");
        org.jsoup.nodes.Attributes attributes51 = tag50.attributes;
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag("", attributes51);
        startTag40.attributes = attributes51;
        startTag40.appendAttributeValue('#');
        startTag40.appendAttributeName("<</hi!>>");
        boolean boolean58 = startTag40.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag40);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + tokenType43 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType43.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.name();
        endTag1.appendAttributeValue('#');
        java.lang.Class<?> wildcardClass8 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        boolean boolean4 = startTag0.isEndTag();
        startTag0.appendAttributeName('a');
        java.lang.String str7 = startTag0.tokenType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendAttributeValue("</hi!>");
        startTag1.selfClosing = true;
        java.lang.String str6 = startTag1.tokenType();
        startTag1.appendAttributeValue('#');
        org.jsoup.parser.Token.TokenType tokenType9 = startTag1.type;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        boolean boolean30 = doctype29.forceQuirks;
        java.lang.StringBuilder stringBuilder31 = doctype29.systemIdentifier;
        boolean boolean32 = doctype29.isCharacter();
        java.lang.String str33 = doctype29.getName();
        org.jsoup.parser.Token.TokenType tokenType34 = null;
        doctype29.type = tokenType34;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype18 = tag16.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        boolean boolean5 = startTag0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        org.jsoup.parser.Token.Doctype doctype53 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isStartTag();
        boolean boolean3 = eOF1.isDoctype();
        boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        startTag8.selfClosing = false;
        startTag8.newAttribute();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag13.name("hi!");
        org.jsoup.nodes.Attributes attributes16 = tag15.attributes;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("", attributes16);
        startTag8.attributes = attributes16;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes16);
        startTag19.tagName = "EOF";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = xmlTreeBuilder0.insert(startTag19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeEnd;
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        endTag1.tagName = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("Doctype");
        startTag30.tagName = "";
        startTag30.finaliseTag();
        java.lang.String str34 = startTag30.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = xmlTreeBuilder0.insert(startTag30);
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
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        endTag1.appendAttributeName("</hi!>");
        org.jsoup.nodes.Attributes attributes11 = endTag1.attributes;
        java.lang.String str12 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        java.lang.String str5 = tag2.tagName;
        org.jsoup.nodes.Attributes attributes6 = tag2.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = tag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType8 = tag7.type;
        tag7.appendTagName("hi!");
        tag7.tagName = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype13 = tag7.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        boolean boolean25 = doctype24.forceQuirks;
        java.lang.StringBuilder stringBuilder26 = doctype24.systemIdentifier;
        boolean boolean27 = doctype24.isCharacter();
        doctype24.forceQuirks = false;
        java.lang.StringBuilder stringBuilder30 = doctype24.publicIdentifier;
        boolean boolean31 = doctype24.forceQuirks;
        java.lang.StringBuilder stringBuilder32 = doctype24.name;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        startTag2.appendAttributeName("EOF");
        boolean boolean10 = startTag2.isSelfClosing();
        boolean boolean11 = startTag2.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        boolean boolean5 = tag3.isEndTag();
        org.jsoup.nodes.Attributes attributes6 = tag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi! >", attributes6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = startTag7.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        tag4.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        boolean boolean2 = character1.isEOF();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        org.jsoup.parser.Token.Doctype doctype62 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype62);
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
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        startTag2.newAttribute();
        boolean boolean8 = startTag2.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = endTag1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str6 = doctype5.tokenType();
        boolean boolean7 = doctype5.isForceQuirks();
        java.lang.String str8 = doctype5.getPublicIdentifier();
        java.lang.String str9 = doctype5.getSystemIdentifier();
        java.lang.String str10 = doctype5.tokenType();
        boolean boolean11 = doctype5.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        java.lang.String str20 = character16.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag21 = character16.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EOF" + "'", str20, "EOF");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = startTag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        org.jsoup.parser.Token.StartTag startTag47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element48 = xmlTreeBuilder0.insert(startTag47);
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
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        boolean boolean27 = character21.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character23 = endTag14.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        boolean boolean17 = startTag14.isEOF();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        java.lang.String str9 = endTag1.tagName;
        endTag1.appendTagName("Doctype");
        endTag1.appendAttributeValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<4>" + "'", str9, "<4>");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Character");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype17 = startTag9.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        org.jsoup.parser.Token.Character character17 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str18 = character17.getData();
        boolean boolean19 = character17.isComment();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.Token.Doctype doctype21 = new org.jsoup.parser.Token.Doctype();
        boolean boolean22 = doctype21.forceQuirks;
        java.lang.StringBuilder stringBuilder23 = doctype21.systemIdentifier;
        boolean boolean24 = doctype21.isCharacter();
        doctype21.forceQuirks = false;
        java.lang.StringBuilder stringBuilder27 = doctype21.publicIdentifier;
        boolean boolean28 = doctype21.isStartTag();
        java.lang.StringBuilder stringBuilder29 = doctype21.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype21);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        org.jsoup.parser.Token.Doctype doctype38 = new org.jsoup.parser.Token.Doctype();
        boolean boolean39 = doctype38.forceQuirks;
        java.lang.String str40 = doctype38.getName();
        boolean boolean41 = doctype38.forceQuirks;
        boolean boolean42 = doctype38.forceQuirks;
        java.lang.StringBuilder stringBuilder43 = doctype38.systemIdentifier;
        java.lang.String str44 = doctype38.getName();
        java.lang.StringBuilder stringBuilder45 = doctype38.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype38);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        java.lang.String str2 = eOF0.tokenType();
        boolean boolean3 = eOF0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = eOF0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
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
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        startTag18.appendAttributeName(' ');
        java.lang.String str23 = startTag18.tokenType();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("", attributes26);
        startTag27.selfClosing = false;
        startTag27.newAttribute();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag27.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("<!---->", attributes35);
        startTag18.attributes = attributes35;
        boolean boolean40 = startTag18.isEndTag();
        org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag18);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        boolean boolean43 = doctype42.forceQuirks;
        java.lang.StringBuilder stringBuilder44 = doctype42.systemIdentifier;
        boolean boolean45 = doctype42.isCharacter();
        java.lang.String str46 = doctype42.getName();
        doctype42.forceQuirks = true;
        java.lang.String str49 = doctype42.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        org.jsoup.parser.Token.Doctype doctype47 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str48 = doctype47.tokenType();
        boolean boolean49 = doctype47.isForceQuirks();
        java.lang.String str50 = doctype47.getPublicIdentifier();
        boolean boolean51 = doctype47.isForceQuirks();
        doctype47.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype54 = doctype47.asDoctype();
        java.lang.StringBuilder stringBuilder55 = doctype54.systemIdentifier;
        java.lang.String str56 = doctype54.getPublicIdentifier();
        java.lang.String str57 = doctype54.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype54);
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Doctype" + "'", str48, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(doctype54);
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isSelfClosing();
        endTag1.appendAttributeValue('4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</<4>Doctype>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag2 = character1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        endTag1.tagName = "<<</hi!>>>";
        org.jsoup.nodes.Attributes attributes25 = endTag1.getAttributes();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<</hi!>>");
        boolean boolean2 = startTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        startTag18.appendAttributeName(' ');
        java.lang.String str23 = startTag18.tokenType();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("", attributes26);
        startTag27.selfClosing = false;
        startTag27.newAttribute();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag27.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("<!---->", attributes35);
        startTag18.attributes = attributes35;
        boolean boolean40 = startTag18.isEndTag();
        org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag18);
        java.lang.Class<?> wildcardClass42 = startTag18.getClass();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag26 = startTag24.name("hi!");
        startTag24.finaliseTag();
        startTag24.appendAttributeValue("</hi!>");
        boolean boolean30 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        startTag0.finaliseTag();
        startTag0.appendTagName(' ');
        startTag0.appendAttributeValue(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        java.lang.String str5 = tag2.tagName;
        org.jsoup.nodes.Attributes attributes6 = tag2.getAttributes();
        boolean boolean7 = tag2.isEOF();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.forceQuirks;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        startTag0.appendAttributeName('a');
        java.lang.String str10 = startTag0.toString();
        java.lang.String str11 = startTag0.toString();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!  =\"#\">" + "'", str10, "<hi!  =\"#\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!  =\"#\">" + "'", str11, "<hi!  =\"#\">");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendTagName('4');
        java.lang.String str5 = startTag2.name();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("Comment", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = startTag8.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = startTag9.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(startTag9);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        boolean boolean5 = tag3.isEndTag();
        org.jsoup.nodes.Attributes attributes6 = tag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi! >", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendAttributeName("EOF");
        java.lang.String str11 = startTag7.toString();
        startTag7.selfClosing = false;
        boolean boolean14 = startTag7.isComment();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi! >>" + "'", str11, "<</hi! >>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        java.lang.String str5 = startTag0.tagName;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        java.lang.String str9 = endTag1.tagName;
        org.jsoup.parser.Token.TokenType tokenType10 = null;
        endTag1.type = tokenType10;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<4>" + "'", str9, "<4>");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendAttributeName('a');
        java.lang.String str8 = endTag1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi! >" + "'", str8, "</hi! >");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendTagName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("StartTag");
        org.jsoup.parser.Token.Tag tag13 = tag11.name("<hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype14 = tag11.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        boolean boolean26 = doctype25.forceQuirks;
        java.lang.String str27 = doctype25.getName();
        doctype25.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype25);
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
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeValue('4');
        org.jsoup.parser.Token.EndTag endTag9 = endTag1.asEndTag();
        endTag1.appendAttributeValue("</<4>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag9);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag19 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
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
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        startTag11.selfClosing = true;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder46 = comment45.data;
        org.jsoup.parser.Token.TokenType tokenType47 = org.jsoup.parser.Token.TokenType.Comment;
        comment45.type = tokenType47;
        java.lang.StringBuilder stringBuilder49 = comment45.data;
        org.jsoup.parser.Token.Comment comment50 = comment45.asComment();
        xmlTreeBuilder0.insert(comment45);
        java.lang.String str52 = comment45.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype53 = comment45.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType47 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType47.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertNotNull(comment50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted;
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag5 = endTag1.asEndTag();
        boolean boolean6 = endTag5.isDoctype();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertNotNull(endTag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("4");
        startTag1.appendAttributeValue('a');
        startTag1.appendTagName("</hi!>4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag11 = doctype9.asStartTag();
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
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendTagName('4');
        endTag1.appendAttributeName('4');
        endTag1.appendTagName(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.lang.String str31 = character26.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag32 = character26.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("< >");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        boolean boolean6 = doctype0.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.name;
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype2.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        java.lang.String str13 = comment9.toString();
        java.lang.String str14 = comment9.getData();
        org.jsoup.parser.Token.Comment comment15 = comment9.asComment();
        java.lang.String str16 = comment9.toString();
        java.lang.String str17 = comment9.getData();
        java.lang.StringBuilder stringBuilder18 = comment9.data;
        java.lang.String str19 = comment9.getData();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        boolean boolean8 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        startTag5.appendAttributeName('a');
        org.jsoup.parser.Token.Tag tag12 = startTag5.name("<</hi! >>");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.toString();
        endTag1.appendTagName("");
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("</hi!>4");
        tag9.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str11 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName('4');
        boolean boolean6 = endTag1.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType7 = endTag1.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isCharacter();
        endTag1.appendTagName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName('a');
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        org.jsoup.nodes.Attributes attributes5 = null;
        startTag0.attributes = attributes5;
        org.junit.Assert.assertNotNull(startTag4);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.tokenType();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.String str7 = comment0.getData();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        startTag18.appendAttributeName(' ');
        java.lang.String str23 = startTag18.tokenType();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("", attributes26);
        startTag27.selfClosing = false;
        startTag27.newAttribute();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag27.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("<!---->", attributes35);
        startTag18.attributes = attributes35;
        boolean boolean40 = startTag18.isEndTag();
        org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag18);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        boolean boolean43 = doctype42.forceQuirks;
        java.lang.String str44 = doctype42.getName();
        boolean boolean45 = doctype42.forceQuirks;
        boolean boolean46 = doctype42.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype42.systemIdentifier;
        java.lang.String str48 = doctype42.getName();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        boolean boolean4 = startTag0.isEndTag();
        boolean boolean5 = startTag0.isEndTag();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        org.jsoup.parser.Token.TokenType tokenType24 = character18.type;
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
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        java.lang.String str26 = comment20.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character27 = comment20.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag2.name("<</hi!>>");
        tag2.appendTagName("hi!");
        java.lang.String str8 = tag2.tagName;
        tag2.tagName = "hi!4#";
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<</hi!>>hi!" + "'", str8, "<</hi!>>hi!");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        doctype2.forceQuirks = true;
        doctype2.forceQuirks = false;
        boolean boolean7 = doctype2.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        boolean boolean46 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype45.systemIdentifier;
        boolean boolean48 = doctype45.isEndTag();
        boolean boolean49 = doctype45.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype50 = doctype45.asDoctype();
        boolean boolean51 = doctype50.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype50);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doctype50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        boolean boolean5 = tag3.isEndTag();
        org.jsoup.nodes.Attributes attributes6 = tag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi! >", attributes6);
        org.jsoup.nodes.Attributes attributes8 = startTag7.attributes;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        boolean boolean50 = tag47.isSelfClosing();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        boolean boolean9 = endTag1.selfClosing;
        org.jsoup.nodes.Attributes attributes10 = endTag1.attributes;
        boolean boolean11 = endTag1.isEndTag();
        boolean boolean12 = endTag1.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.selfClosing = false;
        org.jsoup.parser.Token.EndTag endTag8 = endTag1.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(endTag8);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        org.jsoup.parser.ParseErrorList parseErrorList70 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "hi!a", parseErrorList70);
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
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str2 = startTag1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = startTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<</hi!>>" + "'", str2, "<</hi!>>");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        boolean boolean13 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</Character>");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<4>");
        java.lang.String str2 = character1.toString();
        boolean boolean3 = character1.isDoctype();
        java.lang.Class<?> wildcardClass4 = character1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<4>" + "'", str2, "<4>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "<hi!>", parseErrorList47);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        xmlTreeBuilder0.initialiseParse("<Doctype>", "Doctype", parseErrorList51);
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag("", attributes54);
        boolean boolean56 = startTag55.isDoctype();
        java.lang.String str57 = startTag55.tagName;
        org.jsoup.parser.Token.TokenType tokenType58 = startTag55.type;
        startTag55.appendTagName(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element61 = xmlTreeBuilder0.insert(startTag55);
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + tokenType58 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType58.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        startTag41.appendAttributeName('a');
        startTag41.newAttribute();
        boolean boolean45 = startTag41.isDoctype();
        boolean boolean46 = startTag41.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element47 = xmlTreeBuilder0.insert(startTag41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EOF" + "'", str35, "EOF");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EOF" + "'", str36, "EOF");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EOF" + "'", str37, "EOF");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "EOF" + "'", str38, "EOF");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        boolean boolean9 = startTag5.isDoctype();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder10.initialiseParse("</hi!>", "EOF", parseErrorList13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        boolean boolean18 = xmlTreeBuilder10.process((org.jsoup.parser.Token) startTag15);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendTagName('4');
        org.jsoup.nodes.Element element22 = xmlTreeBuilder10.insert(startTag19);
        startTag19.newAttribute();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        org.jsoup.nodes.Attributes attributes28 = tag27.attributes;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("", attributes28);
        startTag19.attributes = attributes28;
        startTag5.attributes = attributes28;
        boolean boolean32 = startTag5.isComment();
        boolean boolean33 = startTag5.isCharacter();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean22 = endTag21.selfClosing;
        endTag21.finaliseTag();
        java.lang.String str24 = endTag21.toString();
        java.lang.String str25 = endTag21.tokenType();
        endTag21.tagName = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag21);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "</hi!>" + "'", str24, "</hi!>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EndTag" + "'", str25, "EndTag");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder0.initialiseParse("EOF", "</Doctype>", parseErrorList34);
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
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        org.jsoup.parser.Token.Tag tag16 = endTag1.name("< >");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag17 = tag16.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.lang.String str13 = comment9.toString();
        java.lang.String str14 = comment9.getData();
        org.jsoup.parser.Token.Comment comment15 = comment9.asComment();
        boolean boolean16 = comment15.isStartTag();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        boolean boolean21 = doctype20.forceQuirks;
        java.lang.StringBuilder stringBuilder22 = doctype20.systemIdentifier;
        boolean boolean23 = doctype20.isEndTag();
        boolean boolean24 = doctype20.isForceQuirks();
        java.lang.StringBuilder stringBuilder25 = doctype20.name;
        boolean boolean26 = doctype20.isComment();
        java.lang.StringBuilder stringBuilder27 = doctype20.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype20);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        java.lang.String str19 = comment14.getData();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        startTag2.appendAttributeName("EOF");
        boolean boolean10 = startTag2.isSelfClosing();
        java.lang.String str11 = startTag2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi!>>" + "'", str11, "<</hi!>>");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str2 = startTag1.toString();
        startTag1.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype5 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<</hi!>>" + "'", str2, "<</hi!>>");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        endTag1.tagName = "<<hi!>>";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character22 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str9 = doctype0.getName();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getSystemIdentifier();
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
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag43 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        boolean boolean5 = endTag1.isComment();
        endTag1.finaliseTag();
        endTag1.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</hi!>", "EOF", parseErrorList32);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag34.name("hi!");
        boolean boolean37 = xmlTreeBuilder29.process((org.jsoup.parser.Token) startTag34);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendTagName('4');
        org.jsoup.nodes.Element element41 = xmlTreeBuilder29.insert(startTag38);
        org.jsoup.parser.Token.Character character43 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str44 = character43.getData();
        java.lang.String str45 = character43.toString();
        boolean boolean46 = character43.isStartTag();
        java.lang.String str47 = character43.getData();
        java.lang.String str48 = character43.toString();
        org.jsoup.parser.Token.Character character49 = character43.asCharacter();
        java.lang.String str50 = character43.toString();
        java.lang.String str51 = character43.toString();
        xmlTreeBuilder29.insert(character43);
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str55 = character54.getData();
        java.lang.String str56 = character54.toString();
        boolean boolean57 = character54.isStartTag();
        java.lang.String str58 = character54.getData();
        java.lang.String str59 = character54.toString();
        xmlTreeBuilder29.insert(character54);
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder29.insert(comment61);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        xmlTreeBuilder63.initialiseParse("</hi!>", "EOF", parseErrorList66);
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag70 = startTag68.name("hi!");
        boolean boolean71 = xmlTreeBuilder63.process((org.jsoup.parser.Token) startTag68);
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.appendTagName('4');
        org.jsoup.nodes.Element element75 = xmlTreeBuilder63.insert(startTag72);
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        xmlTreeBuilder63.initialiseParse("Character", "Doctype", parseErrorList78);
        org.jsoup.parser.Token.Comment comment80 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder81 = comment80.data;
        xmlTreeBuilder63.insert(comment80);
        org.jsoup.parser.Token.Comment comment83 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder84 = comment83.data;
        org.jsoup.parser.Token.TokenType tokenType85 = org.jsoup.parser.Token.TokenType.Comment;
        comment83.type = tokenType85;
        xmlTreeBuilder63.insert(comment83);
        java.lang.String str88 = comment83.getData();
        java.lang.String str89 = comment83.toString();
        xmlTreeBuilder29.insert(comment83);
        xmlTreeBuilder0.insert(comment83);
        org.jsoup.parser.Token token92 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = xmlTreeBuilder0.process(token92);
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
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EOF" + "'", str44, "EOF");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EOF" + "'", str45, "EOF");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EOF" + "'", str48, "EOF");
        org.junit.Assert.assertNotNull(character49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "EOF" + "'", str50, "EOF");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EOF" + "'", str51, "EOF");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "EOF" + "'", str55, "EOF");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "EOF" + "'", str56, "EOF");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "EOF" + "'", str58, "EOF");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "EOF" + "'", str59, "EOF");
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder84);
        org.junit.Assert.assertEquals(stringBuilder84.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType85 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType85.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "<!---->" + "'", str89, "<!---->");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isComment();
        endTag1.appendAttributeValue('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        java.lang.String str6 = startTag2.tagName;
        startTag2.appendAttributeName("<Doctype>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = startTag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        startTag14.finaliseTag();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.isCharacter();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.Comment;
        comment0.type = tokenType2;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        org.jsoup.parser.Token.Doctype doctype28 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str29 = doctype28.tokenType();
        boolean boolean30 = doctype28.isForceQuirks();
        java.lang.String str31 = doctype28.getPublicIdentifier();
        java.lang.String str32 = doctype28.getSystemIdentifier();
        java.lang.String str33 = doctype28.tokenType();
        org.jsoup.parser.Token.EndTag endTag35 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean36 = endTag35.selfClosing;
        java.lang.String str37 = endTag35.toString();
        java.lang.String str38 = endTag35.toString();
        boolean boolean39 = endTag35.isEOF();
        org.jsoup.parser.Token.Doctype doctype40 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder41 = doctype40.name;
        org.jsoup.parser.Token.TokenType tokenType42 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype40.type = tokenType42;
        endTag35.type = tokenType42;
        doctype28.type = tokenType42;
        boolean boolean46 = doctype28.forceQuirks;
        boolean boolean47 = doctype28.isComment();
        boolean boolean48 = doctype28.isStartTag();
        java.lang.String str49 = doctype28.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Doctype" + "'", str29, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Doctype" + "'", str33, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "</hi!>" + "'", str37, "</hi!>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "</hi!>" + "'", str38, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType42 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType42.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        java.lang.String str15 = startTag14.tagName;
        startTag14.selfClosing = true;
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EndTag" + "'", str15, "EndTag");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.Character character7 = character1.asCharacter();
        java.lang.String str8 = character7.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi! >");
        startTag1.appendAttributeName("<4</hi!>4>");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        java.lang.String str20 = comment17.toString();
        java.lang.String str21 = comment17.toString();
        java.lang.String str22 = comment17.toString();
        java.lang.StringBuilder stringBuilder23 = comment17.data;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!---->" + "'", str22, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        endTag1.appendAttributeName('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        java.lang.String str13 = comment9.toString();
        java.lang.String str14 = comment9.getData();
        org.jsoup.parser.Token.Comment comment15 = comment9.asComment();
        java.lang.String str16 = comment9.toString();
        java.lang.String str17 = comment9.getData();
        java.lang.StringBuilder stringBuilder18 = comment9.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag19 = comment9.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        org.jsoup.parser.Token.TokenType tokenType29 = comment22.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype30 = comment22.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        xmlTreeBuilder0.initialiseParse("hi!", "<hi!>", parseErrorList15);
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str18 = doctype17.tokenType();
        boolean boolean19 = doctype17.isForceQuirks();
        java.lang.String str20 = doctype17.getPublicIdentifier();
        boolean boolean21 = doctype17.isForceQuirks();
        java.lang.String str22 = doctype17.getName();
        boolean boolean23 = doctype17.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.parser.Token.Tag tag6 = tag2.name("");
        org.jsoup.nodes.Attributes attributes7 = tag6.attributes;
        java.lang.String str8 = tag6.tokenType();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        boolean boolean18 = tag16.isSelfClosing();
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.forceQuirks;
        java.lang.String str21 = doctype19.getName();
        boolean boolean22 = doctype19.forceQuirks;
        boolean boolean23 = doctype19.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Character;
        doctype19.type = tokenType24;
        tag16.type = tokenType24;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        org.jsoup.parser.Token.Comment comment26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = tag8.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isForceQuirks();
        boolean boolean10 = doctype0.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        java.lang.String str28 = comment20.getData();
        java.lang.StringBuilder stringBuilder29 = comment20.data;
        org.jsoup.parser.Token.Comment comment30 = comment20.asComment();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(comment30);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        boolean boolean5 = startTag0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag("", attributes55);
        startTag56.selfClosing = false;
        startTag56.newAttribute();
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag63 = startTag61.name("hi!");
        org.jsoup.nodes.Attributes attributes64 = tag63.attributes;
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag("", attributes64);
        startTag56.attributes = attributes64;
        boolean boolean67 = startTag56.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element68 = xmlTreeBuilder0.insert(startTag56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
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
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        boolean boolean2 = doctype0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("");
        org.jsoup.parser.Token.TokenType tokenType2 = startTag1.type;
        startTag1.newAttribute();
        boolean boolean4 = startTag1.isEOF();
        startTag1.finaliseTag();
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.newAttribute();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        org.jsoup.nodes.Attributes attributes12 = tag11.attributes;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("", attributes12);
        startTag4.attributes = attributes12;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("<!---->", attributes12);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("Comment", attributes12);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        java.lang.String str17 = startTag9.tagName;
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<hi!>" + "'", str17, "<hi!>");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.finaliseTag();
        org.jsoup.nodes.Element element13 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag16.name("hi!");
        org.jsoup.nodes.Attributes attributes19 = tag18.attributes;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes19);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes19);
        java.lang.String str22 = startTag21.tokenType();
        org.jsoup.parser.Token.TokenType tokenType23 = startTag21.type;
        java.lang.String str24 = startTag21.tagName;
        java.lang.String str25 = startTag21.tagName;
        org.jsoup.nodes.Attributes attributes26 = startTag21.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = xmlTreeBuilder0.insert(startTag21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "StartTag" + "'", str22, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<<hi!>>");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        startTag18.appendAttributeName(' ');
        java.lang.String str23 = startTag18.tokenType();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("", attributes26);
        startTag27.selfClosing = false;
        startTag27.newAttribute();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag27.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("<!---->", attributes35);
        startTag18.attributes = attributes35;
        boolean boolean40 = startTag18.isEndTag();
        org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag18);
        startTag18.appendTagName("EndTag");
        startTag18.appendAttributeName("</Doctype4>");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = character1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        boolean boolean20 = startTag17.isDoctype();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag23 = startTag21.name("hi!");
        tag23.finaliseTag();
        tag23.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = tag23.attributes;
        tag23.tagName = "<Doctype>";
        org.jsoup.parser.Token.StartTag startTag29 = tag23.asStartTag();
        org.jsoup.nodes.Attributes attributes30 = startTag29.getAttributes();
        startTag17.attributes = attributes30;
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes2);
        startTag3.tagName = "</hi!>4";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = startTag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        boolean boolean9 = endTag1.isEOF();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes11);
        startTag12.selfClosing = false;
        startTag12.appendTagName("</hi!>");
        startTag12.newAttribute();
        org.jsoup.nodes.Attributes attributes18 = startTag12.getAttributes();
        endTag1.attributes = attributes18;
        org.jsoup.nodes.Attributes attributes20 = endTag1.getAttributes();
        java.lang.String str21 = endTag1.name();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("", attributes24);
        startTag25.selfClosing = false;
        startTag25.newAttribute();
        startTag25.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean32 = endTag31.selfClosing;
        org.jsoup.parser.Token.Tag tag34 = endTag31.name("");
        boolean boolean35 = endTag31.isEndTag();
        org.jsoup.parser.Token.Tag tag37 = endTag31.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType38 = tag37.type;
        startTag25.type = tokenType38;
        boolean boolean40 = startTag25.isDoctype();
        org.jsoup.nodes.Attributes attributes41 = startTag25.getAttributes();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag("Comment", attributes41);
        endTag1.attributes = attributes41;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes11);
        startTag3.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("<!---->", attributes11);
        startTag14.selfClosing = false;
        startTag14.newAttribute();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.lang.Class<?> wildcardClass34 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("", attributes19);
        boolean boolean21 = startTag20.isDoctype();
        java.lang.String str22 = startTag20.tagName;
        startTag20.selfClosing = false;
        startTag20.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes27 = startTag20.getAttributes();
        boolean boolean28 = startTag20.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = xmlTreeBuilder0.insert(startTag20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        boolean boolean8 = comment0.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag5 = startTag0.name("EndTag");
        org.jsoup.parser.Token.TokenType tokenType6 = tag5.type;
        tag5.tagName = "<!---->";
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder10.initialiseParse("</hi!>", "EOF", parseErrorList13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        boolean boolean18 = xmlTreeBuilder10.process((org.jsoup.parser.Token) startTag15);
        boolean boolean19 = startTag15.isDoctype();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("</hi!>", "EOF", parseErrorList23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        boolean boolean28 = xmlTreeBuilder20.process((org.jsoup.parser.Token) startTag25);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName('4');
        org.jsoup.nodes.Element element32 = xmlTreeBuilder20.insert(startTag29);
        startTag29.newAttribute();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag37 = startTag35.name("hi!");
        org.jsoup.nodes.Attributes attributes38 = tag37.attributes;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("", attributes38);
        startTag29.attributes = attributes38;
        startTag15.attributes = attributes38;
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag("4", attributes38);
        tag5.attributes = attributes38;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        startTag5.appendAttributeName('a');
        java.lang.String str11 = startTag5.toString();
        startTag5.appendTagName("</<!---->>");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!>" + "'", str11, "<hi!>");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("<<</hi!>>>", attributes13);
        startTag15.newAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isSelfClosing();
        java.lang.String str8 = endTag1.toString();
        boolean boolean9 = endTag1.isStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        tag14.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        java.lang.String str26 = comment20.toString();
        java.lang.String str27 = comment20.getData();
        java.lang.String str28 = comment20.toString();
        java.lang.StringBuilder stringBuilder29 = comment20.data;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = endTag1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("</hi!>");
        java.lang.String str8 = startTag2.name();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        java.lang.String str34 = character27.getData();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str19 = doctype18.tokenType();
        boolean boolean20 = doctype18.isForceQuirks();
        java.lang.String str21 = doctype18.getPublicIdentifier();
        boolean boolean22 = doctype18.isForceQuirks();
        doctype18.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype25 = doctype18.asDoctype();
        boolean boolean26 = doctype25.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype25);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Doctype" + "'", str19, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doctype25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag24 = character18.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
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
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Doctype;
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = startTag10.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        xmlTreeBuilder41.initialiseParse("</hi!>", "EOF", parseErrorList44);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag48 = startTag46.name("hi!");
        boolean boolean49 = xmlTreeBuilder41.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.parser.Token.Comment comment50 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder51 = comment50.data;
        java.lang.String str52 = comment50.toString();
        xmlTreeBuilder41.insert(comment50);
        boolean boolean54 = comment50.isEndTag();
        xmlTreeBuilder0.insert(comment50);
        org.jsoup.parser.Token.Doctype doctype56 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str57 = doctype56.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EOF" + "'", str35, "EOF");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EOF" + "'", str36, "EOF");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EOF" + "'", str37, "EOF");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "EOF" + "'", str38, "EOF");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Doctype" + "'", str57, "Doctype");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        java.lang.String str13 = comment9.toString();
        java.lang.String str14 = comment9.getData();
        org.jsoup.parser.Token.Comment comment15 = comment9.asComment();
        java.lang.String str16 = comment9.toString();
        java.lang.String str17 = comment9.getData();
        java.lang.StringBuilder stringBuilder18 = comment9.data;
        java.lang.Class<?> wildcardClass19 = comment9.getClass();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        org.jsoup.parser.Token.Tag tag33 = startTag30.name("");
        tag33.appendTagName("<<hi!>>");
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
        org.junit.Assert.assertNotNull(tag33);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str25 = doctype24.tokenType();
        boolean boolean26 = doctype24.isForceQuirks();
        java.lang.String str27 = doctype24.getPublicIdentifier();
        java.lang.String str28 = doctype24.getSystemIdentifier();
        java.lang.String str29 = doctype24.tokenType();
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean32 = endTag31.selfClosing;
        org.jsoup.parser.Token.Tag tag34 = endTag31.name("");
        boolean boolean35 = endTag31.isEndTag();
        org.jsoup.parser.Token.Tag tag37 = endTag31.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType38 = tag37.type;
        doctype24.type = tokenType38;
        boolean boolean40 = doctype24.forceQuirks;
        doctype24.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype24);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Doctype" + "'", str25, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Doctype" + "'", str29, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendAttributeValue("#");
        boolean boolean8 = startTag2.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str21 = character20.toString();
        java.lang.String str22 = character20.toString();
        java.lang.String str23 = character20.toString();
        java.lang.String str24 = character20.getData();
        xmlTreeBuilder0.insert(character20);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder0.initialiseParse("hi!4#", "4", parseErrorList28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder0.initialiseParse("</Doctype>", "", parseErrorList32);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</hi!>", "EOF", parseErrorList32);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag34.name("hi!");
        boolean boolean37 = xmlTreeBuilder29.process((org.jsoup.parser.Token) startTag34);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendTagName('4');
        org.jsoup.nodes.Element element41 = xmlTreeBuilder29.insert(startTag38);
        org.jsoup.parser.Token.Character character43 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str44 = character43.getData();
        java.lang.String str45 = character43.toString();
        boolean boolean46 = character43.isStartTag();
        java.lang.String str47 = character43.getData();
        java.lang.String str48 = character43.toString();
        org.jsoup.parser.Token.Character character49 = character43.asCharacter();
        java.lang.String str50 = character43.toString();
        java.lang.String str51 = character43.toString();
        xmlTreeBuilder29.insert(character43);
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str55 = character54.getData();
        java.lang.String str56 = character54.toString();
        boolean boolean57 = character54.isStartTag();
        java.lang.String str58 = character54.getData();
        java.lang.String str59 = character54.toString();
        xmlTreeBuilder29.insert(character54);
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder29.insert(comment61);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        xmlTreeBuilder63.initialiseParse("</hi!>", "EOF", parseErrorList66);
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag70 = startTag68.name("hi!");
        boolean boolean71 = xmlTreeBuilder63.process((org.jsoup.parser.Token) startTag68);
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.appendTagName('4');
        org.jsoup.nodes.Element element75 = xmlTreeBuilder63.insert(startTag72);
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        xmlTreeBuilder63.initialiseParse("Character", "Doctype", parseErrorList78);
        org.jsoup.parser.Token.Comment comment80 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder81 = comment80.data;
        xmlTreeBuilder63.insert(comment80);
        org.jsoup.parser.Token.Comment comment83 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder84 = comment83.data;
        org.jsoup.parser.Token.TokenType tokenType85 = org.jsoup.parser.Token.TokenType.Comment;
        comment83.type = tokenType85;
        xmlTreeBuilder63.insert(comment83);
        java.lang.String str88 = comment83.getData();
        java.lang.String str89 = comment83.toString();
        xmlTreeBuilder29.insert(comment83);
        xmlTreeBuilder0.insert(comment83);
        java.lang.String str92 = comment83.getData();
        java.lang.StringBuilder stringBuilder93 = comment83.data;
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
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EOF" + "'", str44, "EOF");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EOF" + "'", str45, "EOF");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EOF" + "'", str48, "EOF");
        org.junit.Assert.assertNotNull(character49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "EOF" + "'", str50, "EOF");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EOF" + "'", str51, "EOF");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "EOF" + "'", str55, "EOF");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "EOF" + "'", str56, "EOF");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "EOF" + "'", str58, "EOF");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "EOF" + "'", str59, "EOF");
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder84);
        org.junit.Assert.assertEquals(stringBuilder84.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType85 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType85.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "<!---->" + "'", str89, "<!---->");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(stringBuilder93);
        org.junit.Assert.assertEquals(stringBuilder93.toString(), "");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isStartTag();
        boolean boolean8 = doctype0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        boolean boolean26 = comment20.isEOF();
        java.lang.String str27 = comment20.getData();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        org.jsoup.parser.Token.Tag tag33 = startTag30.name("");
        boolean boolean34 = startTag30.isSelfClosing();
        boolean boolean35 = startTag30.isStartTag();
        startTag30.appendTagName('a');
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
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendTagName('a');
        endTag1.appendAttributeName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        boolean boolean23 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendTagName('4');
        java.lang.String str5 = startTag2.name();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        boolean boolean9 = startTag8.isCharacter();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        java.lang.String str21 = startTag9.tagName;
        boolean boolean22 = startTag9.isComment();
        startTag9.selfClosing = false;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4" + "'", str21, "4");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = startTag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<Doctype>" + "'", str2, "<Doctype>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder30 = comment29.data;
        org.jsoup.parser.Token.TokenType tokenType31 = org.jsoup.parser.Token.TokenType.Comment;
        comment29.type = tokenType31;
        java.lang.StringBuilder stringBuilder33 = comment29.data;
        java.lang.StringBuilder stringBuilder34 = comment29.data;
        java.lang.StringBuilder stringBuilder35 = comment29.data;
        xmlTreeBuilder0.insert(comment29);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("Doctype");
        startTag38.tagName = "";
        startTag38.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = xmlTreeBuilder0.insert(startTag38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        org.jsoup.parser.Token.TokenType tokenType11 = startTag10.type;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        org.jsoup.nodes.Attributes attributes17 = tag16.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes17);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes17);
        java.lang.String str20 = startTag19.tokenType();
        org.jsoup.parser.Token.TokenType tokenType21 = startTag19.type;
        java.lang.String str22 = startTag19.tagName;
        java.lang.String str23 = startTag19.tagName;
        org.jsoup.nodes.Attributes attributes24 = startTag19.getAttributes();
        startTag10.attributes = attributes24;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "StartTag" + "'", str20, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        boolean boolean10 = doctype0.forceQuirks;
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        java.lang.String str8 = endTag1.tagName;
        java.lang.String str9 = endTag1.tagName;
        boolean boolean10 = endTag1.isComment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        org.jsoup.nodes.Attributes attributes18 = startTag9.attributes;
        java.lang.String str19 = startTag9.tokenType();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "StartTag" + "'", str19, "StartTag");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        org.jsoup.nodes.Attributes attributes5 = tag4.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.isEndTag();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        boolean boolean5 = startTag0.isStartTag();
        startTag0.finaliseTag();
        java.lang.String str7 = startTag0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!>" + "'", str7, "<hi!>");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("</hi!>");
        boolean boolean8 = tag7.isCharacter();
        boolean boolean9 = tag7.isEOF();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        endTag1.appendTagName('4');
        java.lang.String str10 = endTag1.toString();
        org.jsoup.parser.Token.Tag tag12 = endTag1.name("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</Doctype4>" + "'", str10, "</Doctype4>");
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        java.lang.StringBuilder stringBuilder18 = doctype0.name;
        java.lang.String str19 = doctype0.tokenType();
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
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Doctype" + "'", str19, "Doctype");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        startTag9.appendAttributeValue("");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!>" + "'", str12, "<hi!>");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        boolean boolean18 = startTag2.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        org.jsoup.parser.Token.Character character41 = character35.asCharacter();
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
        org.junit.Assert.assertNotNull(character41);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder30 = comment29.data;
        org.jsoup.parser.Token.TokenType tokenType31 = org.jsoup.parser.Token.TokenType.Comment;
        comment29.type = tokenType31;
        java.lang.StringBuilder stringBuilder33 = comment29.data;
        java.lang.StringBuilder stringBuilder34 = comment29.data;
        java.lang.StringBuilder stringBuilder35 = comment29.data;
        xmlTreeBuilder0.insert(comment29);
        java.lang.Class<?> wildcardClass37 = comment29.getClass();
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
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.selfClosing = false;
        org.jsoup.parser.Token.EndTag endTag8 = endTag1.asEndTag();
        java.lang.String str9 = endTag8.toString();
        boolean boolean10 = endTag8.isStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(endTag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.lang.String str24 = character14.getData();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        boolean boolean5 = doctype0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        boolean boolean15 = startTag11.isComment();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        startTag17.finaliseTag();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        org.jsoup.parser.Token.Doctype doctype33 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str34 = doctype33.tokenType();
        boolean boolean35 = doctype33.isForceQuirks();
        java.lang.String str36 = doctype33.getPublicIdentifier();
        boolean boolean37 = doctype33.isForceQuirks();
        doctype33.forceQuirks = true;
        doctype33.forceQuirks = false;
        doctype33.forceQuirks = false;
        java.lang.String str44 = doctype33.getPublicIdentifier();
        boolean boolean45 = doctype33.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype46 = doctype33.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Doctype" + "'", str34, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doctype46);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemKeyword;
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        endTag1.appendAttributeName("hi!4#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        boolean boolean29 = startTag25.isDoctype();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder30.initialiseParse("</hi!>", "EOF", parseErrorList33);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag37 = startTag35.name("hi!");
        boolean boolean38 = xmlTreeBuilder30.process((org.jsoup.parser.Token) startTag35);
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        startTag39.appendTagName('4');
        org.jsoup.nodes.Element element42 = xmlTreeBuilder30.insert(startTag39);
        startTag39.newAttribute();
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag47 = startTag45.name("hi!");
        org.jsoup.nodes.Attributes attributes48 = tag47.attributes;
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag("", attributes48);
        startTag39.attributes = attributes48;
        startTag25.attributes = attributes48;
        java.lang.String str52 = startTag25.toString();
        org.jsoup.nodes.Element element53 = xmlTreeBuilder0.insert(startTag25);
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag("", attributes55);
        startTag56.selfClosing = false;
        startTag56.newAttribute();
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag63 = startTag61.name("hi!");
        org.jsoup.nodes.Attributes attributes64 = tag63.attributes;
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag("", attributes64);
        startTag56.attributes = attributes64;
        startTag56.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element68 = xmlTreeBuilder0.insert(startTag56);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<hi!>" + "'", str52, "<hi!>");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(attributes64);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.selfClosing = false;
        endTag1.newAttribute();
        endTag1.selfClosing = true;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        java.lang.String str8 = startTag2.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = startTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        java.lang.String str5 = startTag2.toString();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>" + "'", str5, "<hi!>");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        boolean boolean20 = character18.isDoctype();
        java.lang.String str21 = character18.getData();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.lang.String str15 = startTag0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character16 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!>" + "'", str14, "<hi!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!>" + "'", str15, "<hi!>");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        xmlTreeBuilder0.initialiseParse("hi!", "<!---->", parseErrorList26);
        org.jsoup.parser.Token.Character character29 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str30 = character29.getData();
        java.lang.String str31 = character29.tokenType();
        java.lang.String str32 = character29.toString();
        xmlTreeBuilder0.insert(character29);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Character" + "'", str31, "Character");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        boolean boolean2 = eOF0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype3 = eOF0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        doctype0.forceQuirks = true;
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("");
        endTag1.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = endTag1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        java.lang.String str13 = doctype0.getName();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        startTag10.appendAttributeName('4');
        org.jsoup.parser.Token.Tag tag16 = startTag10.name("StartTag");
        boolean boolean17 = startTag10.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment18 = startTag10.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        java.lang.String str8 = startTag0.toString();
        boolean boolean9 = startTag0.isEndTag();
        java.lang.Class<?> wildcardClass10 = startTag0.getClass();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag29 = comment20.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        doctype0.forceQuirks = false;
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
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isComment();
        boolean boolean7 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        org.jsoup.nodes.Attributes attributes6 = endTag1.getAttributes();
        org.jsoup.parser.Token.EndTag endTag7 = endTag1.asEndTag();
        endTag7.appendTagName('#');
        java.lang.String str10 = endTag7.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!#>" + "'", str10, "</hi!#>");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        tag16.appendAttributeName("Character");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        startTag0.tagName = "hi!";
        startTag0.appendTagName('a');
        startTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendTagName('4');
        java.lang.String str5 = startTag2.name();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        startTag8.appendTagName("</<!---->>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName('a');
        boolean boolean3 = endTag0.isCharacter();
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        boolean boolean5 = endTag0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        boolean boolean8 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder21.initialiseParse("</hi!>", "EOF", parseErrorList24);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag26.name("hi!");
        boolean boolean29 = xmlTreeBuilder21.process((org.jsoup.parser.Token) startTag26);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendTagName('4');
        org.jsoup.nodes.Element element33 = xmlTreeBuilder21.insert(startTag30);
        java.lang.String str34 = startTag30.toString();
        org.jsoup.parser.Token.Tag tag36 = startTag30.name("<hi!>");
        java.lang.String str37 = startTag30.toString();
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag30);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        xmlTreeBuilder0.initialiseParse("</hi!<4>>", "</<4>>", parseErrorList41);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<4>" + "'", str34, "<4>");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<<hi!>>" + "'", str37, "<<hi!>>");
        org.junit.Assert.assertNotNull(element38);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.toString();
        endTag1.appendTagName("");
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("</hi!>4");
        java.lang.String str10 = endTag1.tagName;
        boolean boolean11 = endTag1.isStartTag();
        boolean boolean12 = endTag1.isStartTag();
        endTag1.tagName = "#";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>4" + "'", str10, "</hi!>4");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.nodes.Attributes attributes5 = tag2.getAttributes();
        tag2.appendTagName('4');
        boolean boolean8 = tag2.isCharacter();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        org.jsoup.parser.Token.Doctype doctype33 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str34 = doctype33.tokenType();
        doctype33.forceQuirks = true;
        java.lang.String str37 = doctype33.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Doctype" + "'", str34, "Doctype");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        java.lang.String str6 = endTag1.name();
        endTag1.appendAttributeValue("Character");
        boolean boolean9 = endTag1.isSelfClosing();
        boolean boolean10 = endTag1.isEOF();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        java.lang.Class<?> wildcardClass22 = endTag1.getClass();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "</hi!>" + "'", str21, "</hi!>");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
            org.jsoup.parser.Token.EndTag endTag29 = character26.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        boolean boolean31 = character25.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        org.jsoup.parser.Token.Doctype doctype27 = doctype25.asDoctype();
        java.lang.String str28 = doctype25.tokenType();
        java.lang.StringBuilder stringBuilder29 = doctype25.systemIdentifier;
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
        org.junit.Assert.assertNotNull(doctype27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Doctype" + "'", str28, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = startTag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isEOF();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag5 = endTag1.asEndTag();
        endTag1.selfClosing = true;
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertNotNull(endTag5);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName('a');
        boolean boolean3 = endTag0.isCharacter();
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendAttributeName('a');
        endTag0.appendAttributeName("EndTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        java.lang.String str31 = character25.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</hi!>", "EOF", parseErrorList32);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag34.name("hi!");
        boolean boolean37 = xmlTreeBuilder29.process((org.jsoup.parser.Token) startTag34);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendTagName('4');
        org.jsoup.nodes.Element element41 = xmlTreeBuilder29.insert(startTag38);
        org.jsoup.parser.Token.Character character43 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str44 = character43.getData();
        java.lang.String str45 = character43.toString();
        boolean boolean46 = character43.isStartTag();
        java.lang.String str47 = character43.getData();
        java.lang.String str48 = character43.toString();
        org.jsoup.parser.Token.Character character49 = character43.asCharacter();
        java.lang.String str50 = character43.toString();
        java.lang.String str51 = character43.toString();
        xmlTreeBuilder29.insert(character43);
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str55 = character54.getData();
        java.lang.String str56 = character54.toString();
        boolean boolean57 = character54.isStartTag();
        java.lang.String str58 = character54.getData();
        java.lang.String str59 = character54.toString();
        xmlTreeBuilder29.insert(character54);
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder29.insert(comment61);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        xmlTreeBuilder63.initialiseParse("</hi!>", "EOF", parseErrorList66);
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag70 = startTag68.name("hi!");
        boolean boolean71 = xmlTreeBuilder63.process((org.jsoup.parser.Token) startTag68);
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.appendTagName('4');
        org.jsoup.nodes.Element element75 = xmlTreeBuilder63.insert(startTag72);
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        xmlTreeBuilder63.initialiseParse("Character", "Doctype", parseErrorList78);
        org.jsoup.parser.Token.Comment comment80 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder81 = comment80.data;
        xmlTreeBuilder63.insert(comment80);
        org.jsoup.parser.Token.Comment comment83 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder84 = comment83.data;
        org.jsoup.parser.Token.TokenType tokenType85 = org.jsoup.parser.Token.TokenType.Comment;
        comment83.type = tokenType85;
        xmlTreeBuilder63.insert(comment83);
        java.lang.String str88 = comment83.getData();
        java.lang.String str89 = comment83.toString();
        xmlTreeBuilder29.insert(comment83);
        xmlTreeBuilder0.insert(comment83);
        java.lang.StringBuilder stringBuilder92 = comment83.data;
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
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EOF" + "'", str44, "EOF");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EOF" + "'", str45, "EOF");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EOF" + "'", str48, "EOF");
        org.junit.Assert.assertNotNull(character49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "EOF" + "'", str50, "EOF");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EOF" + "'", str51, "EOF");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "EOF" + "'", str55, "EOF");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "EOF" + "'", str56, "EOF");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "EOF" + "'", str58, "EOF");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "EOF" + "'", str59, "EOF");
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder84);
        org.junit.Assert.assertEquals(stringBuilder84.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType85 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType85.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "<!---->" + "'", str89, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder92);
        org.junit.Assert.assertEquals(stringBuilder92.toString(), "");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        boolean boolean5 = tag3.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = tag3.name("");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!a", attributes8);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        boolean boolean14 = doctype0.forceQuirks;
        boolean boolean15 = doctype0.isEndTag();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.Class<?> wildcardClass9 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        endTag1.appendAttributeName('a');
        org.jsoup.parser.Token.EOF eOF9 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType10 = eOF9.type;
        endTag1.type = tokenType10;
        org.jsoup.nodes.Attributes attributes12 = endTag1.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        org.jsoup.parser.Token.Doctype doctype21 = new org.jsoup.parser.Token.Doctype();
        boolean boolean22 = doctype21.forceQuirks;
        java.lang.StringBuilder stringBuilder23 = doctype21.systemIdentifier;
        boolean boolean24 = doctype21.isCharacter();
        doctype21.forceQuirks = false;
        boolean boolean27 = doctype21.isEOF();
        doctype21.forceQuirks = true;
        java.lang.StringBuilder stringBuilder30 = doctype21.publicIdentifier;
        java.lang.StringBuilder stringBuilder31 = doctype21.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype21);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "StartTag", parseErrorList7);
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes10);
        startTag11.selfClosing = false;
        startTag11.newAttribute();
        org.jsoup.parser.Token.Tag tag16 = startTag11.name("</hi!>");
        startTag11.appendAttributeValue('#');
        org.jsoup.nodes.Element element19 = xmlTreeBuilder0.insert(startTag11);
        startTag11.selfClosing = true;
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        boolean boolean5 = startTag0.isStartTag();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<Doctype>");
        tag8.tagName = "<</hi!>>";
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        java.lang.String str16 = character12.getData();
        java.lang.String str17 = character12.toString();
        org.jsoup.parser.Token.Character character18 = character12.asCharacter();
        java.lang.String str19 = character12.toString();
        java.lang.String str20 = character12.toString();
        xmlTreeBuilder0.insert(character12);
        org.jsoup.parser.Token.Doctype doctype22 = new org.jsoup.parser.Token.Doctype();
        boolean boolean23 = doctype22.forceQuirks;
        java.lang.StringBuilder stringBuilder24 = doctype22.systemIdentifier;
        boolean boolean25 = doctype22.isCharacter();
        doctype22.forceQuirks = false;
        java.lang.StringBuilder stringBuilder28 = doctype22.publicIdentifier;
        java.lang.StringBuilder stringBuilder29 = doctype22.systemIdentifier;
        java.lang.String str30 = doctype22.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertNotNull(character18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EOF" + "'", str20, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        xmlTreeBuilder26.initialiseParse("</hi!>", "EOF", parseErrorList29);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag31.name("hi!");
        boolean boolean34 = xmlTreeBuilder26.process((org.jsoup.parser.Token) startTag31);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder36 = comment35.data;
        java.lang.String str37 = comment35.toString();
        xmlTreeBuilder26.insert(comment35);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("Character", "hi!", parseErrorList42);
        org.jsoup.parser.Token.Comment comment44 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder45 = comment44.data;
        java.lang.String str46 = comment44.getData();
        xmlTreeBuilder39.insert(comment44);
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag50 = startTag48.name("hi!");
        startTag48.appendAttributeName(' ');
        boolean boolean53 = startTag48.isComment();
        org.jsoup.nodes.Element element54 = xmlTreeBuilder39.insert(startTag48);
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        xmlTreeBuilder39.initialiseParse("Character", "<Doctype>", parseErrorList57);
        org.jsoup.parser.Token.EOF eOF59 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType60 = eOF59.type;
        java.lang.String str61 = eOF59.tokenType();
        boolean boolean62 = xmlTreeBuilder39.process((org.jsoup.parser.Token) eOF59);
        org.jsoup.parser.Token.Comment comment63 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder64 = comment63.data;
        java.lang.String str65 = comment63.getData();
        java.lang.StringBuilder stringBuilder66 = comment63.data;
        java.lang.String str67 = comment63.toString();
        java.lang.String str68 = comment63.getData();
        xmlTreeBuilder39.insert(comment63);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder70 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF71 = new org.jsoup.parser.Token.EOF();
        java.lang.String str72 = eOF71.tokenType();
        boolean boolean73 = xmlTreeBuilder70.process((org.jsoup.parser.Token) eOF71);
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        xmlTreeBuilder70.initialiseParse("", "EndTag", parseErrorList76);
        org.jsoup.parser.Token.Character character79 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str80 = character79.getData();
        java.lang.String str81 = character79.toString();
        xmlTreeBuilder70.insert(character79);
        xmlTreeBuilder39.insert(character79);
        org.jsoup.parser.Token.Comment comment84 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder85 = comment84.data;
        org.jsoup.parser.Token.TokenType tokenType86 = org.jsoup.parser.Token.TokenType.Comment;
        comment84.type = tokenType86;
        java.lang.StringBuilder stringBuilder88 = comment84.data;
        org.jsoup.parser.Token.Comment comment89 = comment84.asComment();
        xmlTreeBuilder39.insert(comment84);
        java.lang.String str91 = comment84.getData();
        java.lang.String str92 = comment84.toString();
        xmlTreeBuilder26.insert(comment84);
        xmlTreeBuilder0.insert(comment84);
        org.jsoup.parser.ParseErrorList parseErrorList97 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "a", parseErrorList97);
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
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!---->" + "'", str37, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertTrue("'" + tokenType60 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType60.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "EOF" + "'", str61, "EOF");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertEquals(stringBuilder66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "<!---->" + "'", str67, "<!---->");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "EOF" + "'", str72, "EOF");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "</hi!>" + "'", str80, "</hi!>");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "</hi!>" + "'", str81, "</hi!>");
        org.junit.Assert.assertNotNull(stringBuilder85);
        org.junit.Assert.assertEquals(stringBuilder85.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType86 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType86.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder88);
        org.junit.Assert.assertEquals(stringBuilder88.toString(), "");
        org.junit.Assert.assertNotNull(comment89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "<!---->" + "'", str92, "<!---->");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("Doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment2 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        java.lang.StringBuilder stringBuilder42 = comment36.data;
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
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isComment();
        endTag1.appendAttributeValue("Comment");
        endTag1.appendAttributeName('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        doctype0.forceQuirks = true;
        boolean boolean10 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendTagName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("StartTag");
        org.jsoup.parser.Token.Tag tag13 = tag11.name("<hi!>");
        org.jsoup.nodes.Attributes attributes14 = tag13.attributes;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.Class<?> wildcardClass6 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi! >");
        java.lang.String str2 = startTag1.name();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi! >" + "'", str2, "</hi! >");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "</hi! >", parseErrorList11);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.EndTag endTag4 = endTag1.asEndTag();
        endTag1.appendAttributeName("< >");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertNotNull(endTag4);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendTagName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("StartTag");
        java.lang.String str12 = tag11.tagName;
        boolean boolean13 = tag11.isComment();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEndTag();
        org.jsoup.nodes.Attributes attributes4 = startTag1.getAttributes();
        startTag1.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<Doctype>" + "'", str2, "<Doctype>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "StartTag", parseErrorList7);
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes10);
        startTag11.selfClosing = false;
        startTag11.newAttribute();
        org.jsoup.parser.Token.Tag tag16 = startTag11.name("</hi!>");
        startTag11.appendAttributeValue('#');
        org.jsoup.nodes.Element element19 = xmlTreeBuilder0.insert(startTag11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag20 = startTag11.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = startTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        xmlTreeBuilder41.initialiseParse("</hi!>", "EOF", parseErrorList44);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag48 = startTag46.name("hi!");
        boolean boolean49 = xmlTreeBuilder41.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.parser.Token.Comment comment50 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder51 = comment50.data;
        java.lang.String str52 = comment50.toString();
        xmlTreeBuilder41.insert(comment50);
        boolean boolean54 = comment50.isEndTag();
        xmlTreeBuilder0.insert(comment50);
        java.lang.String str56 = comment50.getData();
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
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<hi!  =\"#\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType8 = tag7.type;
        boolean boolean9 = tag7.isSelfClosing();
        boolean boolean10 = tag7.isEOF();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        xmlTreeBuilder54.initialiseParse("</hi!>", "EOF", parseErrorList57);
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag61 = startTag59.name("hi!");
        boolean boolean62 = xmlTreeBuilder54.process((org.jsoup.parser.Token) startTag59);
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        startTag63.appendTagName('4');
        org.jsoup.nodes.Element element66 = xmlTreeBuilder54.insert(startTag63);
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        xmlTreeBuilder54.initialiseParse("<4>", "</hi!>", parseErrorList69);
        org.jsoup.parser.Token.Character character72 = new org.jsoup.parser.Token.Character("<!---->");
        xmlTreeBuilder54.insert(character72);
        boolean boolean74 = character72.isDoctype();
        xmlTreeBuilder0.insert(character72);
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
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes2);
        startTag3.appendAttributeValue("</hi!>");
        java.lang.String str6 = startTag3.name();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<Doctype>" + "'", str6, "<Doctype>");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag6.name("hi!");
        org.jsoup.nodes.Attributes attributes9 = tag8.attributes;
        startTag5.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes9);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("EOF", attributes9);
        startTag13.appendAttributeName('#');
        boolean boolean16 = startTag13.isStartTag();
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        boolean boolean2 = endTag1.selfClosing;
        boolean boolean3 = endTag1.isEndTag();
        endTag1.appendTagName('#');
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("EndTag");
        boolean boolean8 = tag7.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        java.lang.StringBuilder stringBuilder25 = comment20.data;
        java.lang.String str26 = comment20.getData();
        java.lang.String str27 = comment20.getData();
        java.lang.StringBuilder stringBuilder28 = comment20.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag29 = comment20.asEndTag();
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
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
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
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        java.lang.String str9 = startTag0.toString();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendAttributeName('a');
        java.lang.String str13 = startTag10.tagName;
        org.jsoup.parser.Token.Tag tag15 = startTag10.name("EndTag");
        org.jsoup.nodes.Attributes attributes16 = startTag10.getAttributes();
        startTag0.attributes = attributes16;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.finaliseTag();
        org.jsoup.nodes.Element element13 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean16 = endTag15.selfClosing;
        org.jsoup.parser.Token.Tag tag18 = endTag15.name("");
        boolean boolean19 = endTag15.isEndTag();
        org.jsoup.parser.Token.Tag tag21 = endTag15.name("<4>");
        org.jsoup.nodes.Attributes attributes22 = endTag15.getAttributes();
        java.lang.String str23 = endTag15.tagName;
        endTag15.appendTagName("Doctype");
        java.lang.String str26 = endTag15.toString();
        boolean boolean27 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag15);
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("", attributes29);
        boolean boolean31 = startTag30.isSelfClosing();
        startTag30.appendAttributeName("</hi!>");
        startTag30.appendAttributeValue("Doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = xmlTreeBuilder0.insert(startTag30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNull(attributes22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<4>" + "'", str23, "<4>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</<4>Doctype>" + "'", str26, "</<4>Doctype>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        org.jsoup.nodes.Attributes attributes16 = tag15.getAttributes();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<4>" + "'", str13, "<4>");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        endTag1.tagName = "Character";
        java.lang.String str10 = endTag1.toString();
        boolean boolean11 = endTag1.isDoctype();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</Character>" + "'", str10, "</Character>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        boolean boolean5 = tag3.isEndTag();
        org.jsoup.nodes.Attributes attributes6 = tag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi! >", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendAttributeName("EOF");
        startTag7.selfClosing = false;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        java.lang.String str2 = eOF0.tokenType();
        boolean boolean3 = eOF0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        java.lang.String str13 = startTag10.toString();
        boolean boolean14 = startTag10.selfClosing;
        java.lang.String str15 = startTag10.toString();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<Doctype>" + "'", str13, "<Doctype>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<Doctype>" + "'", str15, "<Doctype>");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("Doctype");
        boolean boolean2 = endTag1.isStartTag();
        endTag1.appendAttributeValue(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        startTag10.newAttribute();
        boolean boolean14 = startTag10.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character15 = startTag10.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        boolean boolean6 = doctype0.isDoctype();
        boolean boolean7 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.nodes.Element element31 = xmlTreeBuilder0.insert(startTag30);
        startTag30.finaliseTag();
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        java.lang.String str9 = endTag1.tagName;
        endTag1.appendTagName("Doctype");
        java.lang.String str12 = endTag1.toString();
        boolean boolean13 = endTag1.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<4>" + "'", str9, "<4>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</<4>Doctype>" + "'", str12, "</<4>Doctype>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        org.jsoup.parser.Token.TokenType tokenType3 = comment0.type;
        java.lang.String str4 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        startTag0.appendTagName('a');
        java.lang.String str7 = startTag0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<a>" + "'", str7, "<a>");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendTagName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        boolean boolean20 = startTag2.isSelfClosing();
        boolean boolean21 = startTag2.isCharacter();
        startTag2.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<a>");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment17 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Character" + "'", str14, "Character");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        startTag5.appendAttributeName("EOF");
        startTag5.selfClosing = true;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isEOF();
        boolean boolean5 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.appendAttributeName('#');
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean9 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        java.lang.Class<?> wildcardClass27 = character21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        endTag1.appendAttributeName('4');
        org.jsoup.parser.Token.Tag tag12 = endTag1.name("hi!a");
        tag12.newAttribute();
        boolean boolean14 = tag12.isEndTag();
        tag12.appendTagName(' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        tag4.selfClosing = false;
        tag4.appendTagName("hi!a");
        tag4.tagName = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = tag4.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        boolean boolean10 = doctype9.forceQuirks;
        java.lang.StringBuilder stringBuilder11 = doctype9.systemIdentifier;
        boolean boolean12 = doctype9.forceQuirks;
        boolean boolean13 = doctype9.isStartTag();
        java.lang.StringBuilder stringBuilder14 = doctype9.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType15 = doctype9.type;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        java.lang.String str13 = comment9.toString();
        boolean boolean14 = comment9.isDoctype();
        java.lang.String str15 = comment9.getData();
        java.lang.String str16 = comment9.toString();
        java.lang.String str17 = comment9.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character18 = comment9.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.EndTag endTag4 = endTag1.asEndTag();
        org.jsoup.nodes.Attributes attributes5 = endTag4.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = endTag4.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertNotNull(endTag4);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        java.lang.String str5 = tag2.tagName;
        tag2.appendTagName(' ');
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        java.lang.String str17 = startTag10.tokenType();
        boolean boolean18 = startTag10.isDoctype();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        boolean boolean8 = startTag0.isComment();
        startTag0.appendAttributeName("EndTag");
        boolean boolean11 = startTag0.isEOF();
        boolean boolean12 = startTag0.isEOF();
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.lang.String str27 = character25.toString();
        boolean boolean28 = character25.isStartTag();
        java.lang.String str29 = character25.toString();
        java.lang.String str30 = character25.toString();
        java.lang.String str31 = character25.getData();
        java.lang.String str32 = character25.getData();
        java.lang.String str33 = character25.toString();
        xmlTreeBuilder0.insert(character25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder35.initialiseParse("Character", "hi!", parseErrorList38);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder41 = comment40.data;
        java.lang.String str42 = comment40.getData();
        xmlTreeBuilder35.insert(comment40);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str46 = character45.getData();
        java.lang.String str47 = character45.toString();
        boolean boolean48 = character45.isStartTag();
        java.lang.String str49 = character45.getData();
        java.lang.String str50 = character45.toString();
        org.jsoup.parser.Token.Character character51 = character45.asCharacter();
        xmlTreeBuilder35.insert(character51);
        java.lang.String str53 = character51.getData();
        xmlTreeBuilder0.insert(character51);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EOF" + "'", str33, "EOF");
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EOF" + "'", str46, "EOF");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "EOF" + "'", str49, "EOF");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "EOF" + "'", str50, "EOF");
        org.junit.Assert.assertNotNull(character51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "EOF" + "'", str53, "EOF");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        org.jsoup.parser.Token.Doctype doctype33 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str34 = doctype33.tokenType();
        java.lang.String str35 = doctype33.getSystemIdentifier();
        java.lang.String str36 = doctype33.tokenType();
        java.lang.String str37 = doctype33.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype33);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Doctype" + "'", str34, "Doctype");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Doctype" + "'", str36, "Doctype");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi! ");
        boolean boolean2 = startTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        java.lang.String str2 = startTag0.tokenType();
        startTag0.appendAttributeValue('a');
        java.lang.Class<?> wildcardClass5 = startTag0.getClass();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        startTag2.appendAttributeName("Doctype");
        startTag2.appendAttributeName("StartTag");
        org.jsoup.parser.Token.StartTag startTag13 = startTag2.asStartTag();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        org.jsoup.nodes.Attributes attributes18 = tag17.attributes;
        boolean boolean19 = tag17.isEndTag();
        org.jsoup.nodes.Attributes attributes20 = tag17.getAttributes();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("</hi! >", attributes20);
        startTag2.attributes = attributes20;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        boolean boolean10 = doctype0.isDoctype();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str11 = startTag10.toString();
        startTag10.appendAttributeName('#');
        org.jsoup.nodes.Element element14 = xmlTreeBuilder0.insert(startTag10);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder0.initialiseParse("Character", "</<!---->>", parseErrorList17);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.forceQuirks;
        java.lang.StringBuilder stringBuilder21 = doctype19.systemIdentifier;
        boolean boolean22 = doctype19.isCharacter();
        doctype19.forceQuirks = false;
        java.lang.String str25 = doctype19.getName();
        doctype19.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi!>>" + "'", str11, "<</hi!>>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        boolean boolean5 = tag3.isEndTag();
        org.jsoup.nodes.Attributes attributes6 = tag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi! >", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendAttributeName("EOF");
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Character;
        startTag7.type = tokenType11;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        startTag38.appendAttributeName('a');
        startTag38.newAttribute();
        boolean boolean42 = startTag38.isDoctype();
        startTag38.finaliseTag();
        org.jsoup.parser.Token.Doctype doctype44 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str45 = doctype44.tokenType();
        boolean boolean46 = doctype44.isForceQuirks();
        java.lang.String str47 = doctype44.getPublicIdentifier();
        boolean boolean48 = doctype44.isForceQuirks();
        java.lang.String str49 = doctype44.getName();
        java.lang.String str50 = doctype44.getSystemIdentifier();
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean53 = endTag52.selfClosing;
        endTag52.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType55 = endTag52.type;
        org.jsoup.nodes.Attributes attributes56 = endTag52.getAttributes();
        java.lang.String str57 = endTag52.toString();
        endTag52.appendAttributeName("<4>");
        org.jsoup.parser.Token.TokenType tokenType60 = endTag52.type;
        doctype44.type = tokenType60;
        startTag38.type = tokenType60;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element63 = xmlTreeBuilder0.insert(startTag38);
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
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Doctype" + "'", str45, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + tokenType55 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType55.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "</hi!>" + "'", str57, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType60 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType60.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        boolean boolean20 = startTag2.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<4>", parseErrorList11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder13.initialiseParse("Character", "hi!", parseErrorList16);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder19 = comment18.data;
        java.lang.String str20 = comment18.getData();
        xmlTreeBuilder13.insert(comment18);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag22.name("hi!");
        startTag22.appendAttributeName(' ');
        boolean boolean27 = startTag22.isComment();
        org.jsoup.nodes.Element element28 = xmlTreeBuilder13.insert(startTag22);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str31 = startTag30.name();
        boolean boolean32 = xmlTreeBuilder13.process((org.jsoup.parser.Token) startTag30);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder34 = comment33.data;
        java.lang.String str35 = comment33.getData();
        java.lang.StringBuilder stringBuilder36 = comment33.data;
        xmlTreeBuilder13.insert(comment33);
        java.lang.String str38 = comment33.getData();
        xmlTreeBuilder0.insert(comment33);
        org.jsoup.parser.Token.Doctype doctype40 = new org.jsoup.parser.Token.Doctype();
        boolean boolean41 = doctype40.forceQuirks;
        java.lang.String str42 = doctype40.getName();
        boolean boolean43 = doctype40.forceQuirks;
        boolean boolean44 = doctype40.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype45 = doctype40.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Doctype" + "'", str31, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doctype45);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        endTag1.appendAttributeName('#');
        boolean boolean10 = endTag1.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean10 = endTag9.selfClosing;
        java.lang.String str11 = endTag9.toString();
        java.lang.String str12 = endTag9.toString();
        endTag9.appendAttributeValue("<4>");
        java.lang.String str15 = endTag9.toString();
        org.jsoup.parser.Token.TokenType tokenType16 = endTag9.type;
        doctype0.type = tokenType16;
        java.lang.StringBuilder stringBuilder18 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("");
        org.jsoup.parser.Token.TokenType tokenType2 = startTag1.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = startTag1.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        boolean boolean8 = endTag1.selfClosing;
        endTag1.selfClosing = false;
        boolean boolean11 = endTag1.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag12 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        java.lang.String str35 = character32.getData();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "</hi!>" + "'", str35, "</hi!>");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag25 = startTag17.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
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
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        org.jsoup.parser.Token.EndTag endTag55 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean56 = endTag55.selfClosing;
        org.jsoup.parser.Token.Tag tag58 = endTag55.name("");
        boolean boolean59 = endTag55.isEndTag();
        org.jsoup.parser.Token.Tag tag61 = endTag55.name("<4>");
        java.lang.String str62 = endTag55.tokenType();
        boolean boolean63 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag55);
        endTag55.newAttribute();
        endTag55.selfClosing = false;
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "EndTag" + "'", str62, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<4</hi!>4>", parseErrorList54);
        org.jsoup.parser.Token.Doctype doctype56 = new org.jsoup.parser.Token.Doctype();
        boolean boolean57 = doctype56.forceQuirks;
        java.lang.StringBuilder stringBuilder58 = doctype56.systemIdentifier;
        java.lang.String str59 = doctype56.getName();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype56);
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
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!---->" + "'", str46, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        java.lang.String str25 = startTag17.name();
        boolean boolean26 = startTag17.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment27 = startTag17.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4" + "'", str25, "4");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.Class<?> wildcardClass5 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        java.lang.String str13 = doctype0.getName();
        boolean boolean14 = doctype0.forceQuirks;
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
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        org.jsoup.parser.Token.Doctype doctype28 = new org.jsoup.parser.Token.Doctype();
        boolean boolean29 = doctype28.forceQuirks;
        java.lang.StringBuilder stringBuilder30 = doctype28.systemIdentifier;
        boolean boolean31 = doctype28.isCharacter();
        doctype28.forceQuirks = false;
        java.lang.StringBuilder stringBuilder34 = doctype28.publicIdentifier;
        boolean boolean35 = doctype28.isForceQuirks();
        boolean boolean36 = doctype28.forceQuirks;
        java.lang.StringBuilder stringBuilder37 = doctype28.systemIdentifier;
        java.lang.String str38 = doctype28.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Doctype" + "'", str38, "Doctype");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("a");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<</hi! >>");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        java.lang.String str20 = comment17.toString();
        java.lang.String str21 = comment17.toString();
        java.lang.String str22 = comment17.toString();
        boolean boolean23 = comment17.isEndTag();
        boolean boolean24 = comment17.isComment();
        java.lang.StringBuilder stringBuilder25 = comment17.data;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!---->" + "'", str22, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterAttributeName;
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<</hi!>>hi!", parseErrorList11);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        boolean boolean4 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        org.jsoup.parser.Token.Comment comment50 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        java.lang.String str6 = endTag1.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        org.jsoup.parser.Token token64 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = xmlTreeBuilder0.process(token64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes9 = startTag2.getAttributes();
        boolean boolean10 = startTag2.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = startTag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        startTag2.appendTagName(' ');
        boolean boolean8 = startTag2.isDoctype();
        boolean boolean9 = startTag2.isCharacter();
        boolean boolean10 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "StartTag", parseErrorList7);
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str10 = doctype9.tokenType();
        java.lang.StringBuilder stringBuilder11 = doctype9.systemIdentifier;
        doctype9.forceQuirks = true;
        doctype9.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        org.jsoup.parser.Token.Tag tag14 = startTag10.name("Character");
        java.lang.String str15 = startTag10.tokenType();
        org.jsoup.nodes.Attributes attributes16 = startTag10.attributes;
        java.lang.String str17 = startTag10.name();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Character" + "'", str17, "Character");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.lang.String str28 = comment20.toString();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        org.jsoup.parser.Token.StartTag startTag68 = startTag62.asStartTag();
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
        org.junit.Assert.assertNotNull(startTag68);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isDoctype();
        startTag0.newAttribute();
        startTag0.appendAttributeName("<4>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        org.jsoup.nodes.Attributes attributes5 = tag2.attributes;
        tag2.tagName = "<Doctype>";
        org.jsoup.parser.Token.StartTag startTag8 = tag2.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = startTag8.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        boolean boolean17 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        startTag10.finaliseTag();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        boolean boolean24 = endTag23.selfClosing;
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "</hi!>" + "'", str21, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(endTag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        java.lang.StringBuilder stringBuilder25 = comment20.data;
        java.lang.String str26 = comment20.getData();
        java.lang.String str27 = comment20.getData();
        java.lang.StringBuilder stringBuilder28 = comment20.data;
        java.lang.String str29 = comment20.toString();
        java.lang.String str30 = comment20.toString();
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
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!---->" + "'", str30, "<!---->");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        org.jsoup.parser.Token.StartTag startTag15 = startTag11.asStartTag();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(startTag15);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        org.jsoup.parser.Token.Tag tag33 = startTag30.name("");
        tag33.tagName = "<</hi!>>hi!";
        tag33.tagName = "</Doctype>";
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
        org.junit.Assert.assertNotNull(tag33);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        boolean boolean10 = doctype0.isForceQuirks();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.String str6 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        java.lang.String str7 = endTag1.name();
        java.lang.String str8 = endTag1.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        startTag10.appendAttributeName('4');
        org.jsoup.parser.Token.Tag tag16 = startTag10.name("StartTag");
        org.jsoup.nodes.Attributes attributes17 = startTag10.getAttributes();
        startTag10.appendTagName("<hi!  =\"#\">");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = startTag2.tokenType();
        startTag2.appendAttributeName(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.name;
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype7.type = tokenType9;
        startTag2.type = tokenType9;
        boolean boolean12 = startTag2.isEOF();
        startTag2.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</Doctype>");
        startTag1.selfClosing = true;
        java.lang.String str4 = startTag1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<</Doctype>>" + "'", str4, "<</Doctype>>");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        startTag2.appendTagName(' ');
        boolean boolean8 = startTag2.isDoctype();
        boolean boolean9 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        endTag1.appendTagName('#');
        org.jsoup.parser.Token.TokenType tokenType7 = endTag1.type;
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("EndTag");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName("<hi!  =\"#\">");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype5.type = tokenType7;
        doctype0.type = tokenType7;
        java.lang.Class<?> wildcardClass10 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName('4');
        boolean boolean6 = endTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
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
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        boolean boolean10 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeName('a');
        startTag1.newAttribute();
        boolean boolean5 = startTag1.isDoctype();
        startTag1.finaliseTag();
        boolean boolean7 = startTag1.isDoctype();
        org.jsoup.nodes.Attributes attributes8 = startTag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("EOF", attributes8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = startTag9.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName('a');
        boolean boolean3 = endTag0.isCharacter();
        java.lang.String str4 = endTag0.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeName("<4>");
        endTag1.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        boolean boolean9 = tag8.isStartTag();
        tag8.appendAttributeValue("");
        org.jsoup.nodes.Attributes attributes12 = tag8.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag1.type;
        org.jsoup.nodes.Attributes attributes5 = endTag1.getAttributes();
        java.lang.String str6 = endTag1.toString();
        endTag1.appendAttributeName("<4>");
        org.jsoup.parser.Token.TokenType tokenType9 = endTag1.type;
        endTag1.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        startTag0.appendAttributeValue("</hi!>");
        java.lang.String str6 = startTag0.tokenType();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        endTag1.finaliseTag();
        boolean boolean10 = endTag1.isEndTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        java.lang.String str15 = startTag14.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag16 = startTag14.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EndTag" + "'", str15, "EndTag");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder0.initialiseParse("</Doctype4>", "<4</hi!>4>", parseErrorList36);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "<<hi!>>", parseErrorList40);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str43 = doctype42.tokenType();
        boolean boolean44 = doctype42.isForceQuirks();
        java.lang.String str45 = doctype42.getPublicIdentifier();
        boolean boolean46 = doctype42.isForceQuirks();
        doctype42.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype49 = doctype42.asDoctype();
        boolean boolean50 = doctype49.isForceQuirks();
        java.lang.StringBuilder stringBuilder51 = doctype49.systemIdentifier;
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Doctype" + "'", str43, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doctype49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.lang.StringBuilder stringBuilder25 = comment20.data;
        java.lang.String str26 = comment20.toString();
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
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "StartTag", parseErrorList7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("</hi!>", "EOF", parseErrorList12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        boolean boolean17 = xmlTreeBuilder9.process((org.jsoup.parser.Token) startTag14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder18.initialiseParse("Character", "hi!", parseErrorList21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder24 = comment23.data;
        java.lang.String str25 = comment23.getData();
        xmlTreeBuilder18.insert(comment23);
        xmlTreeBuilder9.insert(comment23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        xmlTreeBuilder28.initialiseParse("Character", "hi!", parseErrorList31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        xmlTreeBuilder28.initialiseParse("</hi!>", "Doctype", parseErrorList35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        xmlTreeBuilder28.initialiseParse("", "<4>", parseErrorList39);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        xmlTreeBuilder41.initialiseParse("</hi!>", "EOF", parseErrorList44);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag48 = startTag46.name("hi!");
        boolean boolean49 = xmlTreeBuilder41.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.parser.Token.Comment comment50 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder51 = comment50.data;
        java.lang.String str52 = comment50.toString();
        xmlTreeBuilder41.insert(comment50);
        java.lang.String str54 = comment50.toString();
        java.lang.String str55 = comment50.getData();
        xmlTreeBuilder28.insert(comment50);
        org.jsoup.parser.Token.TokenType tokenType57 = comment50.type;
        xmlTreeBuilder9.insert(comment50);
        boolean boolean59 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment50);
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        xmlTreeBuilder0.initialiseParse("</<4>Doctype>", "EndTag", parseErrorList62);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!---->" + "'", str54, "<!---->");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + tokenType57 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType57.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendTagName('a');
        endTag1.appendAttributeName("hi!");
        boolean boolean8 = endTag1.isEOF();
        java.lang.String str9 = endTag1.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!a" + "'", str9, "hi!a");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BogusComment;
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendTagName("</hi!>");
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag2.getAttributes();
        startTag2.appendTagName('#');
        startTag2.appendAttributeValue("<<hi!>>");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<4</hi!>4>", parseErrorList54);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        xmlTreeBuilder56.initialiseParse("Character", "hi!", parseErrorList59);
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder62 = comment61.data;
        java.lang.String str63 = comment61.getData();
        xmlTreeBuilder56.insert(comment61);
        org.jsoup.parser.Token.Character character66 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str67 = character66.getData();
        java.lang.String str68 = character66.toString();
        boolean boolean69 = character66.isStartTag();
        java.lang.String str70 = character66.getData();
        java.lang.String str71 = character66.toString();
        org.jsoup.parser.Token.Character character72 = character66.asCharacter();
        xmlTreeBuilder56.insert(character72);
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag76 = startTag74.name("hi!");
        startTag74.finaliseTag();
        startTag74.finaliseTag();
        startTag74.appendTagName(' ');
        org.jsoup.nodes.Element element81 = xmlTreeBuilder56.insert(startTag74);
        org.jsoup.parser.Token.Character character83 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str84 = character83.getData();
        java.lang.String str85 = character83.toString();
        boolean boolean86 = character83.isStartTag();
        java.lang.String str87 = character83.getData();
        java.lang.String str88 = character83.toString();
        xmlTreeBuilder56.insert(character83);
        org.jsoup.parser.ParseErrorList parseErrorList92 = null;
        xmlTreeBuilder56.initialiseParse("</Doctype4>", "<4</hi!>4>", parseErrorList92);
        org.jsoup.parser.Token.Character character95 = new org.jsoup.parser.Token.Character("<hi!>");
        xmlTreeBuilder56.insert(character95);
        xmlTreeBuilder0.insert(character95);
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
        org.junit.Assert.assertNotNull(stringBuilder62);
        org.junit.Assert.assertEquals(stringBuilder62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "EOF" + "'", str67, "EOF");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "EOF" + "'", str68, "EOF");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "EOF" + "'", str70, "EOF");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "EOF" + "'", str71, "EOF");
        org.junit.Assert.assertNotNull(character72);
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "EOF" + "'", str84, "EOF");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "EOF" + "'", str85, "EOF");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "EOF" + "'", str87, "EOF");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "EOF" + "'", str88, "EOF");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        boolean boolean11 = startTag10.isComment();
        startTag10.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        boolean boolean6 = doctype0.forceQuirks;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        xmlTreeBuilder0.initialiseParse("<Doctype>", "</Doctype4>", parseErrorList56);
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
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        startTag42.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element44 = xmlTreeBuilder0.insert(startTag42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendTagName('4');
        java.lang.String str5 = startTag2.name();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("Comment", attributes6);
        boolean boolean9 = startTag8.isEOF();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.tagName;
        boolean boolean5 = endTag1.isComment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        org.jsoup.parser.Token.Tag tag33 = startTag30.name("");
        tag33.appendAttributeName("Doctype");
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
        org.junit.Assert.assertNotNull(tag33);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        doctype2.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = doctype2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<!---->", parseErrorList29);
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
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder0.initialiseParse("</Doctype4>", "<4</hi!>4>", parseErrorList36);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "<<hi!>>", parseErrorList40);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        xmlTreeBuilder42.initialiseParse("</hi!>", "EOF", parseErrorList45);
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag49 = startTag47.name("hi!");
        boolean boolean50 = xmlTreeBuilder42.process((org.jsoup.parser.Token) startTag47);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        startTag51.appendTagName('4');
        org.jsoup.nodes.Element element54 = xmlTreeBuilder42.insert(startTag51);
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        xmlTreeBuilder42.initialiseParse("Character", "Doctype", parseErrorList57);
        org.jsoup.parser.Token.Comment comment59 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder60 = comment59.data;
        xmlTreeBuilder42.insert(comment59);
        java.lang.String str62 = comment59.toString();
        java.lang.String str63 = comment59.toString();
        java.lang.StringBuilder stringBuilder64 = comment59.data;
        xmlTreeBuilder0.insert(comment59);
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
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!---->" + "'", str62, "<!---->");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<!---->" + "'", str63, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendTagName("</hi!>");
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag2.getAttributes();
        java.lang.String str9 = startTag2.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName('4');
        java.lang.String str3 = startTag0.name();
        java.lang.String str4 = startTag0.name();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = doctype0.asEndTag();
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
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        startTag9.newAttribute();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag21);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype3 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype3.name;
        java.lang.String str5 = doctype3.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(doctype3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        startTag5.appendAttributeName('a');
        java.lang.String str11 = startTag5.toString();
        org.jsoup.nodes.Attributes attributes12 = startTag5.attributes;
        java.lang.String str13 = startTag5.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!>" + "'", str11, "<hi!>");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!>" + "'", str13, "<hi!>");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        startTag1.newAttribute();
        startTag1.selfClosing = true;
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        org.jsoup.nodes.Attributes attributes9 = endTag1.attributes;
        endTag1.tagName = "</<!---->>";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("<<hi!>>");
        org.jsoup.parser.Token.Tag tag6 = tag4.name("<!---->");
        tag6.tagName = "</hi!#>";
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        boolean boolean18 = startTag2.selfClosing;
        boolean boolean19 = startTag2.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        org.jsoup.parser.Token token32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = xmlTreeBuilder0.process(token32);
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
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.nodes.Attributes attributes5 = tag2.getAttributes();
        tag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag8 = tag2.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = tag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes6);
        boolean boolean10 = startTag9.isComment();
        boolean boolean11 = startTag9.isEOF();
        java.lang.String str12 = startTag9.toString();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<<hi!>>" + "'", str12, "<<hi!>>");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str19 = doctype18.tokenType();
        boolean boolean20 = doctype18.isForceQuirks();
        java.lang.String str21 = doctype18.getPublicIdentifier();
        java.lang.String str22 = doctype18.getSystemIdentifier();
        java.lang.String str23 = doctype18.tokenType();
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean26 = endTag25.selfClosing;
        org.jsoup.parser.Token.Tag tag28 = endTag25.name("");
        boolean boolean29 = endTag25.isEndTag();
        org.jsoup.parser.Token.Tag tag31 = endTag25.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType32 = tag31.type;
        doctype18.type = tokenType32;
        boolean boolean34 = doctype18.forceQuirks;
        doctype18.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Doctype" + "'", str19, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Doctype" + "'", str23, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        org.jsoup.parser.Token.Tag tag33 = startTag30.name("");
        boolean boolean34 = startTag30.isSelfClosing();
        boolean boolean35 = startTag30.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag36 = startTag30.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isSelfClosing();
        startTag2.appendAttributeName("</hi!>");
        startTag2.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendAttributeName('a');
        startTag8.newAttribute();
        boolean boolean12 = startTag8.isDoctype();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendTagName('4');
        java.lang.String str17 = startTag14.name();
        org.jsoup.nodes.Attributes attributes18 = startTag14.attributes;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("hi!", attributes18);
        startTag8.attributes = attributes18;
        startTag2.attributes = attributes18;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str3 = endTag2.toString();
        java.lang.String str4 = endTag2.toString();
        boolean boolean5 = endTag2.isDoctype();
        endTag2.appendAttributeName("EOF");
        boolean boolean8 = endTag2.isStartTag();
        endTag2.tagName = "Character";
        java.lang.String str11 = endTag2.tagName;
        endTag2.appendTagName('4');
        endTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes15 = endTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("", attributes15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = startTag16.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Character" + "'", str11, "Character");
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype5.type = tokenType7;
        doctype0.type = tokenType7;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        java.lang.String str6 = startTag0.tagName;
        startTag0.newAttribute();
        startTag0.appendTagName("</Doctype4>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        startTag7.appendAttributeName('a');
        java.lang.String str10 = startTag7.tokenType();
        java.lang.String str11 = startTag7.tokenType();
        startTag7.finaliseTag();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        startTag0.finaliseTag();
        boolean boolean5 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        startTag1.tagName = "";
        startTag1.selfClosing = true;
        startTag1.newAttribute();
        boolean boolean7 = startTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.name;
        java.lang.Class<?> wildcardClass4 = stringBuilder3.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        java.lang.String str30 = comment20.getData();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        endTag14.appendAttributeName('a');
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
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        org.jsoup.parser.Token.Doctype doctype64 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str65 = doctype64.tokenType();
        java.lang.StringBuilder stringBuilder66 = doctype64.systemIdentifier;
        doctype64.forceQuirks = false;
        java.lang.String str69 = doctype64.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Doctype" + "'", str65, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertEquals(stringBuilder66.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        boolean boolean38 = doctype37.forceQuirks;
        java.lang.StringBuilder stringBuilder39 = doctype37.systemIdentifier;
        boolean boolean40 = doctype37.isCharacter();
        doctype37.forceQuirks = false;
        java.lang.StringBuilder stringBuilder43 = doctype37.publicIdentifier;
        boolean boolean44 = doctype37.forceQuirks;
        java.lang.StringBuilder stringBuilder45 = doctype37.name;
        org.jsoup.parser.Token.Doctype doctype46 = doctype37.asDoctype();
        java.lang.StringBuilder stringBuilder47 = doctype37.publicIdentifier;
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
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(comment35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertNotNull(doctype46);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        java.lang.String str28 = character26.toString();
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        endTag1.appendAttributeName('a');
        org.jsoup.parser.Token.EOF eOF9 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType10 = eOF9.type;
        endTag1.type = tokenType10;
        org.jsoup.nodes.Attributes attributes12 = endTag1.attributes;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        boolean boolean19 = startTag14.isSelfClosing();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        startTag2.appendAttributeName("Doctype");
        startTag2.appendAttributeName("StartTag");
        org.jsoup.parser.Token.Tag tag14 = startTag2.name("Character");
        boolean boolean15 = tag14.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = startTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.tagName = "EndTag";
        boolean boolean4 = startTag1.selfClosing;
        boolean boolean5 = startTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName('a');
        boolean boolean3 = endTag0.isCharacter();
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendAttributeName('a');
        endTag0.appendAttributeName("</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType9 = doctype0.type;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("", attributes25);
        startTag26.selfClosing = false;
        startTag26.appendAttributeValue('a');
        boolean boolean31 = startTag26.isSelfClosing();
        startTag26.appendTagName('#');
        org.jsoup.parser.Token.Tag tag35 = startTag26.name("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = xmlTreeBuilder0.insert(startTag26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.getData();
        boolean boolean7 = character1.isEndTag();
        java.lang.String str8 = character1.getData();
        boolean boolean9 = character1.isStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        org.jsoup.nodes.Attributes attributes22 = endTag1.getAttributes();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "</hi!>" + "'", str21, "</hi!>");
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        boolean boolean25 = endTag1.isDoctype();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.isStartTag();
        boolean boolean3 = endTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

