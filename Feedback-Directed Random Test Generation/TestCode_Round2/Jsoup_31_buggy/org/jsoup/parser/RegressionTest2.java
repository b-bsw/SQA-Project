package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeValue("<</hi!>>");
        boolean boolean5 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("</<!---->>");
        java.lang.String str8 = startTag0.tokenType();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.Class<?> wildcardClass15 = startTag14.getClass();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        org.jsoup.nodes.Attributes attributes14 = startTag13.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment15 = startTag13.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder0.initialiseParse("< >", "</<4>Doctype>", parseErrorList37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        xmlTreeBuilder0.initialiseParse("<StartTag>", "</hi!>", parseErrorList41);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(endTag11);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isComment();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("<Doctype>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        org.jsoup.nodes.Attributes attributes5 = tag2.attributes;
        tag2.appendAttributeValue("");
        boolean boolean8 = tag2.isStartTag();
        tag2.tagName = "</<4>>";
        tag2.tagName = "</hi!>";
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        org.jsoup.parser.Token.Doctype doctype35 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str36 = doctype35.tokenType();
        boolean boolean37 = doctype35.isForceQuirks();
        java.lang.String str38 = doctype35.getPublicIdentifier();
        boolean boolean39 = doctype35.isForceQuirks();
        doctype35.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype42 = doctype35.asDoctype();
        java.lang.StringBuilder stringBuilder43 = doctype42.systemIdentifier;
        boolean boolean44 = doctype42.isCharacter();
        java.lang.String str45 = doctype42.getName();
        java.lang.StringBuilder stringBuilder46 = doctype42.name;
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Doctype" + "'", str36, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doctype42);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.tokenType();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.Class<?> wildcardClass7 = comment0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        java.lang.String str8 = comment0.toString();
        boolean boolean9 = comment0.isCharacter();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypeName;
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("", attributes34);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag38 = startTag36.name("hi!");
        org.jsoup.nodes.Attributes attributes39 = tag38.attributes;
        startTag35.attributes = attributes39;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag("Doctype", attributes39);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag("", attributes39);
        startTag42.appendAttributeValue("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType45 = startTag42.type;
        startTag42.appendTagName(' ');
        startTag42.appendTagName('a');
        boolean boolean50 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag42);
        java.lang.String str51 = startTag42.name();
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
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + " a" + "'", str51, " a");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag2.name("<</hi!>>");
        org.jsoup.nodes.Attributes attributes6 = tag2.attributes;
        org.jsoup.nodes.Attributes attributes7 = tag2.attributes;
        boolean boolean8 = tag2.isEndTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.appendAttributeName('a');
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<hi!a>");
        org.jsoup.nodes.Attributes attributes8 = startTag7.attributes;
        tag2.attributes = attributes8;
        tag2.finaliseTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        boolean boolean16 = startTag9.selfClosing;
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        startTag17.newAttribute();
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        org.jsoup.nodes.Attributes attributes5 = tag2.attributes;
        tag2.appendAttributeValue("");
        tag2.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes2);
        startTag3.tagName = "</hi!>4";
        startTag3.newAttribute();
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isEOF();
        endTag1.appendAttributeName("<Doctype>");
        java.lang.String str6 = endTag1.tagName;
        org.jsoup.parser.Token.Tag tag8 = endTag1.name("<Doctype>");
        org.jsoup.parser.Token.TokenType tokenType9 = tag8.type;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</hi! >");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!a");
        startTag1.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag4 = startTag1.asStartTag();
        org.junit.Assert.assertNotNull(startTag4);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("< >");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        org.jsoup.parser.Token.Comment comment62 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("", attributes23);
        boolean boolean25 = startTag24.isDoctype();
        java.lang.String str26 = startTag24.tagName;
        startTag24.newAttribute();
        org.jsoup.nodes.Attributes attributes28 = startTag24.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = xmlTreeBuilder0.insert(startTag24);
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
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        boolean boolean5 = tag3.isEndTag();
        org.jsoup.nodes.Attributes attributes6 = tag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi! >", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendAttributeName("EOF");
        java.lang.String str11 = startTag7.toString();
        java.lang.String str12 = startTag7.toString();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi! >>" + "'", str11, "<</hi! >>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<</hi! >>" + "'", str12, "<</hi! >>");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        org.jsoup.parser.Token.Doctype doctype34 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str35 = doctype34.tokenType();
        java.lang.StringBuilder stringBuilder36 = doctype34.systemIdentifier;
        doctype34.forceQuirks = true;
        doctype34.forceQuirks = false;
        boolean boolean41 = doctype34.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Doctype" + "'", str35, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        startTag3.appendTagName('4');
        java.lang.String str6 = startTag3.name();
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("hi!", attributes7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("Comment", attributes7);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("</hi!<4>>", attributes7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        boolean boolean45 = startTag38.selfClosing;
        java.lang.String str46 = startTag38.tagName;
        java.lang.String str47 = startTag38.name();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "</<4>Doctype>" + "'", str46, "</<4>Doctype>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "</<4>Doctype>" + "'", str47, "</<4>Doctype>");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype17 = startTag10.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        startTag2.newAttribute();
        startTag2.appendAttributeValue("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        boolean boolean2 = endTag1.selfClosing;
        boolean boolean3 = endTag1.isCharacter();
        boolean boolean4 = endTag1.isStartTag();
        endTag1.appendAttributeName('#');
        boolean boolean7 = endTag1.isEOF();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        startTag17.selfClosing = true;
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        boolean boolean52 = doctype51.forceQuirks;
        java.lang.StringBuilder stringBuilder53 = doctype51.systemIdentifier;
        boolean boolean54 = doctype51.isCharacter();
        doctype51.forceQuirks = false;
        java.lang.StringBuilder stringBuilder57 = doctype51.publicIdentifier;
        boolean boolean58 = doctype51.isStartTag();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = startTag9.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("hi!4#");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        startTag14.appendAttributeName('a');
        startTag14.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        java.lang.String str8 = startTag2.tokenType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str2 = startTag1.toString();
        startTag1.selfClosing = false;
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("hi!");
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag9.selfClosing = false;
        startTag9.newAttribute();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag13.name("hi!");
        tag15.finaliseTag();
        tag15.newAttribute();
        org.jsoup.nodes.Attributes attributes18 = tag15.attributes;
        startTag9.attributes = attributes18;
        endTag6.attributes = attributes18;
        endTag6.appendAttributeName("<!---->");
        endTag6.appendAttributeValue('4');
        endTag6.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes27 = endTag6.getAttributes();
        startTag1.attributes = attributes27;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment29 = startTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<</hi!>>" + "'", str2, "<</hi!>>");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendAttributeValue("</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = startTag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        startTag18.appendTagName("</<4>Doctype>");
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
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        boolean boolean10 = doctype0.isForceQuirks();
        java.lang.String str11 = doctype0.getPublicIdentifier();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isSelfClosing();
        org.jsoup.parser.Token.TokenType tokenType7 = null;
        endTag1.type = tokenType7;
        endTag1.appendTagName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        boolean boolean15 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        startTag2.appendAttributeName("Doctype");
        startTag2.appendAttributeName("StartTag");
        org.jsoup.parser.Token.Tag tag14 = startTag2.name("Character");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = tag14.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        boolean boolean9 = endTag1.isSelfClosing();
        endTag1.finaliseTag();
        endTag1.appendTagName(' ');
        java.lang.String str13 = endTag1.name();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<4> " + "'", str13, "<4> ");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        endTag1.appendAttributeValue('4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!a");
        startTag1.newAttribute();
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        boolean boolean8 = endTag1.isSelfClosing();
        java.lang.String str9 = endTag1.toString();
        java.lang.String str10 = endTag1.tokenType();
        endTag1.appendAttributeName("Character");
        endTag1.appendTagName(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</Doctype>" + "'", str9, "</Doctype>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EndTag" + "'", str10, "EndTag");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder0.initialiseParse("<</hi!>>", "<</hi!>>", parseErrorList22);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("");
        org.jsoup.parser.Token.TokenType tokenType26 = startTag25.type;
        startTag25.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = xmlTreeBuilder0.insert(startTag25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        org.jsoup.parser.Token.Character character77 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str78 = character77.getData();
        boolean boolean79 = character77.isComment();
        org.jsoup.parser.Token.Comment comment80 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder81 = comment80.data;
        org.jsoup.parser.Token.TokenType tokenType82 = org.jsoup.parser.Token.TokenType.Comment;
        comment80.type = tokenType82;
        character77.type = tokenType82;
        java.lang.String str85 = character77.toString();
        xmlTreeBuilder0.insert(character77);
        org.jsoup.parser.Token.Doctype doctype87 = new org.jsoup.parser.Token.Doctype();
        boolean boolean88 = doctype87.forceQuirks;
        java.lang.StringBuilder stringBuilder89 = doctype87.systemIdentifier;
        boolean boolean90 = doctype87.isEndTag();
        java.lang.StringBuilder stringBuilder91 = doctype87.systemIdentifier;
        java.lang.StringBuilder stringBuilder92 = doctype87.publicIdentifier;
        java.lang.String str93 = doctype87.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype87);
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "EOF" + "'", str78, "EOF");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType82 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType82.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "EOF" + "'", str85, "EOF");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(stringBuilder89);
        org.junit.Assert.assertEquals(stringBuilder89.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(stringBuilder91);
        org.junit.Assert.assertEquals(stringBuilder91.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder92);
        org.junit.Assert.assertEquals(stringBuilder92.toString(), "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<</Doctype>>");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        startTag2.appendAttributeName(" a");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("Character", "hi!", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder20.initialiseParse("</hi!>4", "StartTag", parseErrorList27);
        org.jsoup.parser.Token.Character character30 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str31 = character30.getData();
        java.lang.String str32 = character30.toString();
        boolean boolean33 = character30.isStartTag();
        java.lang.String str34 = character30.toString();
        java.lang.String str35 = character30.toString();
        org.jsoup.parser.Token.TokenType tokenType36 = org.jsoup.parser.Token.TokenType.Comment;
        character30.type = tokenType36;
        java.lang.String str38 = character30.getData();
        boolean boolean39 = character30.isStartTag();
        xmlTreeBuilder20.insert(character30);
        java.lang.String str41 = character30.tokenType();
        java.lang.String str42 = character30.toString();
        java.lang.String str43 = character30.getData();
        java.lang.String str44 = character30.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EOF" + "'", str35, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "EOF" + "'", str38, "EOF");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Character" + "'", str41, "Character");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EOF" + "'", str42, "EOF");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "EOF" + "'", str43, "EOF");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EOF" + "'", str44, "EOF");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        boolean boolean5 = doctype0.isComment();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag1.type;
        org.jsoup.nodes.Attributes attributes5 = endTag1.getAttributes();
        java.lang.String str6 = endTag1.toString();
        java.lang.Class<?> wildcardClass7 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        startTag5.appendAttributeName('a');
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        startTag5.appendAttributeName("StartTag");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</Character>");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        endTag1.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment21 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
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
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isEOF();
        startTag2.appendTagName('a');
        java.lang.String str6 = startTag2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<a>" + "'", str6, "<a>");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.toString();
        endTag1.appendTagName("");
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("</hi!>4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isEOF();
        endTag1.appendAttributeName("<Doctype>");
        boolean boolean6 = endTag1.isCharacter();
        endTag1.tagName = "";
        endTag1.appendAttributeValue("<4</hi!>4>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = endTag1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendTagName('#');
        org.jsoup.nodes.Attributes attributes10 = startTag2.getAttributes();
        boolean boolean11 = startTag2.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.toString();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.forceQuirks;
        java.lang.StringBuilder stringBuilder16 = doctype14.systemIdentifier;
        boolean boolean17 = doctype14.isCharacter();
        doctype14.forceQuirks = false;
        java.lang.StringBuilder stringBuilder20 = doctype14.publicIdentifier;
        boolean boolean21 = doctype14.isForceQuirks();
        boolean boolean22 = doctype14.forceQuirks;
        java.lang.StringBuilder stringBuilder23 = doctype14.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType24 = doctype14.type;
        java.lang.String str25 = doctype14.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendTagName('4');
        java.lang.String str5 = startTag2.name();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        startTag8.appendAttributeValue('#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Data;
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        org.jsoup.nodes.Attributes attributes9 = startTag2.attributes;
        boolean boolean10 = startTag2.isEOF();
        java.lang.String str11 = startTag2.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype9.name;
        java.lang.StringBuilder stringBuilder11 = doctype9.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        startTag9.selfClosing = true;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag21);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        java.lang.String str6 = startTag0.tagName;
        boolean boolean7 = startTag0.isSelfClosing();
        startTag0.appendTagName("<<hi!>>");
        startTag0.appendAttributeName('#');
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        startTag1.tagName = "";
        org.jsoup.parser.Token.TokenType tokenType4 = startTag1.type;
        boolean boolean5 = startTag1.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = startTag1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName('#');
        org.jsoup.parser.Token.Tag tag6 = endTag1.name("Doctype");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        org.jsoup.parser.Token.StartTag startTag80 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element81 = xmlTreeBuilder0.insert(startTag80);
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes6);
        java.lang.String str10 = startTag9.tokenType();
        java.lang.String str11 = startTag9.tokenType();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.lang.String str17 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "</Character4>" + "'", str17, "</Character4>");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.newAttribute();
        startTag3.finaliseTag();
        org.jsoup.nodes.Attributes attributes8 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("</<4>Doctype>", attributes8);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        boolean boolean30 = doctype29.forceQuirks;
        java.lang.String str31 = doctype29.getName();
        boolean boolean32 = doctype29.forceQuirks;
        boolean boolean33 = doctype29.forceQuirks;
        java.lang.StringBuilder stringBuilder34 = doctype29.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType35 = doctype29.type;
        boolean boolean36 = doctype29.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype29);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        startTag50.appendTagName(' ');
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.tokenType();
        boolean boolean4 = character1.isCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Character" + "'", str3, "Character");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        xmlTreeBuilder6.initialiseParse("Character", "hi!", parseErrorList9);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendTagName('a');
        startTag11.newAttribute();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder6.insert(startTag11);
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
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str34 = startTag33.name();
        boolean boolean35 = xmlTreeBuilder16.process((org.jsoup.parser.Token) startTag33);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder37 = comment36.data;
        java.lang.String str38 = comment36.getData();
        java.lang.StringBuilder stringBuilder39 = comment36.data;
        xmlTreeBuilder16.insert(comment36);
        xmlTreeBuilder6.insert(comment36);
        org.jsoup.parser.Token.TokenType tokenType42 = comment36.type;
        doctype0.type = tokenType42;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Doctype" + "'", str34, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType42 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType42.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = doctype8.asEndTag();
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
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.Class<?> wildcardClass8 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        tag8.selfClosing = false;
        boolean boolean12 = tag8.isSelfClosing();
        boolean boolean13 = tag8.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag2.tagName = "EndTag";
        org.jsoup.nodes.Attributes attributes5 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!4#", attributes5);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        startTag4.appendTagName('4');
        org.jsoup.nodes.Attributes attributes7 = startTag4.getAttributes();
        startTag4.appendAttributeValue("<hi!a>");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        startTag4.tagName = "Doctype";
        startTag4.newAttribute();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag4);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = doctype7.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        java.lang.String str53 = comment45.getData();
        java.lang.String str54 = comment45.tokenType();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Comment" + "'", str54, "Comment");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        startTag2.appendAttributeName("Doctype");
        startTag2.appendAttributeName("StartTag");
        org.jsoup.parser.Token.Tag tag14 = startTag2.name("Character");
        java.lang.Class<?> wildcardClass15 = startTag2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isSelfClosing();
        startTag2.appendAttributeName("</hi!>");
        startTag2.appendAttributeValue("Doctype");
        startTag2.tagName = "hi! ";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        java.lang.StringBuilder stringBuilder13 = doctype0.name;
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
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        java.lang.String str6 = startTag0.tagName;
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        boolean boolean9 = startTag0.isEOF();
        startTag0.selfClosing = false;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendAttributeName('a');
        java.lang.String str8 = endTag1.toString();
        org.jsoup.parser.Token.Tag tag10 = endTag1.name("hi!4#");
        java.lang.String str11 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi! >" + "'", str8, "</hi! >");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!4#>" + "'", str11, "</hi!4#>");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        endTag1.tagName = "hi!";
        endTag1.appendTagName("hi!a");
        boolean boolean9 = endTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        org.jsoup.nodes.Attributes attributes17 = tag16.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("", attributes17);
        startTag0.attributes = attributes17;
        boolean boolean20 = startTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        boolean boolean18 = startTag14.isComment();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getSystemIdentifier();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.appendAttributeName('a');
        tag2.appendAttributeValue("<Doctype>");
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        doctype0.forceQuirks = true;
        java.lang.String str10 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</hi!>4");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        boolean boolean5 = tag2.isEOF();
        tag2.newAttribute();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        startTag8.appendAttributeName('a');
        java.lang.String str11 = startTag8.tokenType();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        org.jsoup.parser.Token.Tag tag17 = tag14.name("<</hi!>>");
        org.jsoup.nodes.Attributes attributes18 = tag14.attributes;
        org.jsoup.nodes.Attributes attributes19 = tag14.attributes;
        startTag8.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes19);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<hi!>");
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag3 = startTag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("</hi!>", "EOF", parseErrorList15);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag17.name("hi!");
        boolean boolean20 = xmlTreeBuilder12.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder21.initialiseParse("Character", "hi!", parseErrorList24);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder27 = comment26.data;
        java.lang.String str28 = comment26.getData();
        xmlTreeBuilder21.insert(comment26);
        xmlTreeBuilder12.insert(comment26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("Character", "hi!", parseErrorList34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder31.initialiseParse("</hi!>", "Doctype", parseErrorList38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder31.initialiseParse("", "<4>", parseErrorList42);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        xmlTreeBuilder44.initialiseParse("</hi!>", "EOF", parseErrorList47);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag51 = startTag49.name("hi!");
        boolean boolean52 = xmlTreeBuilder44.process((org.jsoup.parser.Token) startTag49);
        org.jsoup.parser.Token.Comment comment53 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder54 = comment53.data;
        java.lang.String str55 = comment53.toString();
        xmlTreeBuilder44.insert(comment53);
        java.lang.String str57 = comment53.toString();
        java.lang.String str58 = comment53.getData();
        xmlTreeBuilder31.insert(comment53);
        org.jsoup.parser.Token.TokenType tokenType60 = comment53.type;
        xmlTreeBuilder12.insert(comment53);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        startTag62.appendTagName('a');
        boolean boolean65 = xmlTreeBuilder12.process((org.jsoup.parser.Token) startTag62);
        org.jsoup.parser.Token.EndTag endTag67 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean68 = endTag67.selfClosing;
        org.jsoup.parser.Token.Tag tag70 = endTag67.name("");
        boolean boolean71 = endTag67.isEndTag();
        org.jsoup.parser.Token.Tag tag73 = endTag67.name("<4>");
        java.lang.String str74 = endTag67.tokenType();
        boolean boolean75 = xmlTreeBuilder12.process((org.jsoup.parser.Token) endTag67);
        boolean boolean76 = endTag67.isComment();
        org.jsoup.parser.Token.TokenType tokenType77 = endTag67.type;
        doctype0.type = tokenType77;
        boolean boolean79 = doctype0.isComment();
        java.lang.String str80 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!---->" + "'", str55, "<!---->");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!---->" + "'", str57, "<!---->");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + tokenType60 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType60.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "EndTag" + "'", str74, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + tokenType77 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType77.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        java.lang.String str20 = character16.toString();
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        endTag1.appendAttributeName('a');
        boolean boolean9 = endTag1.isDoctype();
        org.jsoup.nodes.Attributes attributes10 = endTag1.attributes;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        java.lang.StringBuilder stringBuilder26 = comment20.data;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        startTag10.appendTagName(' ');
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        tag8.selfClosing = false;
        boolean boolean12 = tag8.selfClosing;
        tag8.appendTagName('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = tag8.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        java.lang.String str9 = endTag1.tagName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        startTag2.appendAttributeName("<hi!>");
        java.lang.String str18 = startTag2.toString();
        startTag2.appendTagName("hi!a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "< >" + "'", str18, "< >");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        endTag1.tagName = "hi!";
        boolean boolean7 = endTag1.isStartTag();
        endTag1.appendAttributeValue("</Comment>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.selfClosing = false;
        endTag1.newAttribute();
        boolean boolean9 = endTag1.isComment();
        java.lang.String str10 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStart;
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        endTag1.appendTagName('4');
        endTag1.appendTagName("Character");
        boolean boolean12 = endTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        endTag1.appendTagName('4');
        java.lang.String str10 = endTag1.toString();
        boolean boolean11 = endTag1.isDoctype();
        boolean boolean12 = endTag1.isDoctype();
        endTag1.appendAttributeName("hi!4#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</Doctype4>" + "'", str10, "</Doctype4>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        org.jsoup.nodes.Attributes attributes5 = tag2.attributes;
        tag2.tagName = "<Doctype>";
        org.jsoup.parser.Token.StartTag startTag8 = tag2.asStartTag();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str11 = endTag10.toString();
        java.lang.String str12 = endTag10.toString();
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag10.type = tokenType13;
        boolean boolean15 = endTag10.isStartTag();
        boolean boolean16 = endTag10.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag18.appendAttributeValue("</hi!>");
        org.jsoup.nodes.Attributes attributes21 = startTag18.attributes;
        endTag10.attributes = attributes21;
        startTag8.attributes = attributes21;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.Comment;
        comment0.type = tokenType2;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token.Comment comment5 = comment0.asComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(comment5);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.toString();
        boolean boolean5 = character1.isEOF();
        boolean boolean6 = character1.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = character1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = startTag33.attributes;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes34);
        org.jsoup.nodes.Element element36 = xmlTreeBuilder0.insert(startTag35);
        org.jsoup.parser.Token.Character character38 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str39 = character38.getData();
        java.lang.String str40 = character38.toString();
        boolean boolean41 = character38.isStartTag();
        java.lang.String str42 = character38.toString();
        java.lang.String str43 = character38.toString();
        org.jsoup.parser.Token.TokenType tokenType44 = org.jsoup.parser.Token.TokenType.Comment;
        character38.type = tokenType44;
        java.lang.String str46 = character38.getData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EOF" + "'", str40, "EOF");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EOF" + "'", str42, "EOF");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "EOF" + "'", str43, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EOF" + "'", str46, "EOF");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isEOF();
        endTag1.appendAttributeValue("</Character4>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        startTag3.appendTagName('4');
        java.lang.String str6 = startTag3.name();
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("StartTag", attributes7);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("4", attributes7);
        startTag10.appendTagName('#');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("</hi!>");
        boolean boolean8 = tag7.isCharacter();
        boolean boolean9 = tag7.isComment();
        java.lang.String str10 = tag7.tokenType();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("", attributes12);
        startTag13.selfClosing = false;
        startTag13.newAttribute();
        startTag13.finaliseTag();
        org.jsoup.nodes.Attributes attributes18 = startTag13.getAttributes();
        tag7.attributes = attributes18;
        tag7.appendAttributeName("</hi!>4");
        tag7.appendAttributeName("hi!4#");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        java.lang.String str9 = endTag1.tagName;
        endTag1.appendTagName("Doctype");
        boolean boolean12 = endTag1.selfClosing;
        endTag1.appendTagName(' ');
        boolean boolean15 = endTag1.isCharacter();
        endTag1.appendAttributeName("<</Doctype>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<4>" + "'", str9, "<4>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.name;
        java.lang.StringBuilder stringBuilder4 = doctype2.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype2.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype2.name;
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
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        org.jsoup.nodes.Attributes attributes22 = endTag1.attributes;
        boolean boolean23 = endTag1.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.getName();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        boolean boolean10 = doctype0.isForceQuirks();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        boolean boolean11 = doctype0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        org.jsoup.parser.Token.Tag tag52 = startTag50.name("hi!");
        startTag50.finaliseTag();
        startTag50.appendAttributeValue("</hi!>");
        org.jsoup.nodes.Element element56 = xmlTreeBuilder0.insert(startTag50);
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag("", attributes58);
        startTag59.selfClosing = false;
        startTag59.appendAttributeValue('a');
        boolean boolean64 = startTag59.isSelfClosing();
        startTag59.appendTagName('#');
        org.jsoup.parser.Token.Tag tag68 = startTag59.name("StartTag");
        startTag59.appendAttributeName('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(tag68);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType8 = tag7.type;
        org.jsoup.parser.Token.Tag tag10 = tag7.name("Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        endTag1.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag10 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        boolean boolean26 = comment20.isCharacter();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("Doctype");
        boolean boolean2 = endTag1.isStartTag();
        endTag1.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag6 = endTag1.name("<<</hi!>>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = tag6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        tag4.selfClosing = false;
        tag4.selfClosing = true;
        tag4.appendAttributeName('4');
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("", attributes13);
        startTag14.selfClosing = false;
        startTag14.appendTagName("</hi!>");
        startTag14.newAttribute();
        org.jsoup.nodes.Attributes attributes20 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("hi!", attributes20);
        org.jsoup.parser.Token.TokenType tokenType22 = startTag21.type;
        tag4.type = tokenType22;
        boolean boolean24 = tag4.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.lang.String str14 = doctype0.tokenType();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        startTag5.selfClosing = false;
        startTag5.appendTagName("</hi!>");
        startTag5.newAttribute();
        org.jsoup.nodes.Attributes attributes11 = startTag5.getAttributes();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("Doctype", attributes11);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("</hi!>4", attributes11);
        startTag14.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean9 = endTag8.selfClosing;
        endTag8.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType11 = endTag8.type;
        doctype0.type = tokenType11;
        java.lang.String str13 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = startTag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        java.lang.StringBuilder stringBuilder18 = comment9.data;
        java.lang.String str19 = comment9.getData();
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
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        boolean boolean2 = eOF0.isComment();
        boolean boolean3 = eOF0.isEOF();
        boolean boolean4 = eOF0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<StartTag>");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        startTag2.appendAttributeValue("StartTag");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        doctype0.forceQuirks = true;
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendTagName("</hi!>");
        startTag2.newAttribute();
        startTag2.appendTagName('4');
        java.lang.String str10 = startTag2.name();
        java.lang.String str11 = startTag2.name();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>4" + "'", str10, "</hi!>4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>4" + "'", str11, "</hi!>4");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendTagName('4');
        endTag1.appendAttributeName('4');
        org.jsoup.parser.Token.TokenType tokenType10 = endTag1.type;
        boolean boolean11 = endTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        startTag5.appendAttributeName('a');
        java.lang.String str11 = startTag5.toString();
        java.lang.String str12 = startTag5.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!>" + "'", str11, "<hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!>" + "'", str12, "<hi!>");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        xmlTreeBuilder52.initialiseParse("</hi!>", "EOF", parseErrorList55);
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag59 = startTag57.name("hi!");
        boolean boolean60 = xmlTreeBuilder52.process((org.jsoup.parser.Token) startTag57);
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder62 = comment61.data;
        java.lang.String str63 = comment61.toString();
        xmlTreeBuilder52.insert(comment61);
        boolean boolean65 = comment61.isEndTag();
        boolean boolean66 = comment61.isStartTag();
        xmlTreeBuilder0.insert(comment61);
        java.lang.String str68 = comment61.toString();
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
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(stringBuilder62);
        org.junit.Assert.assertEquals(stringBuilder62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<!---->" + "'", str63, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "<!---->" + "'", str68, "<!---->");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        startTag4.appendTagName('4');
        org.jsoup.nodes.Attributes attributes7 = startTag4.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = startTag4.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        endTag1.appendAttributeValue('#');
        boolean boolean11 = endTag1.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        startTag1.appendAttributeName(' ');
        java.lang.String str6 = startTag1.tokenType();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("", attributes9);
        startTag10.selfClosing = false;
        startTag10.newAttribute();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        org.jsoup.nodes.Attributes attributes18 = tag17.attributes;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes18);
        startTag10.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<!---->", attributes18);
        startTag1.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("</<4>Doctype>", attributes18);
        java.lang.String str24 = startTag23.toString();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<</<4>Doctype>>" + "'", str24, "<</<4>Doctype>>");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        boolean boolean8 = startTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str12 = endTag11.toString();
        java.lang.String str13 = endTag11.toString();
        boolean boolean14 = endTag11.isDoctype();
        endTag11.appendAttributeName("EOF");
        boolean boolean17 = endTag11.isStartTag();
        endTag11.tagName = "Character";
        java.lang.String str20 = endTag11.tagName;
        endTag11.appendTagName('4');
        endTag11.newAttribute();
        org.jsoup.nodes.Attributes attributes24 = endTag11.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("", attributes24);
        startTag0.attributes = attributes24;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</hi!>" + "'", str13, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Character" + "'", str20, "Character");
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        boolean boolean15 = startTag14.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</hi!>" + "'", str13, "</hi!>");
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        boolean boolean11 = doctype0.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        java.lang.String str9 = endTag1.name();
        java.lang.String str10 = endTag1.tagName;
        endTag1.selfClosing = true;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("4");
        startTag1.appendAttributeValue('a');
        startTag1.appendAttributeValue('a');
        java.lang.Class<?> wildcardClass6 = startTag1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("hi!");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes6);
        java.lang.String str10 = startTag9.tokenType();
        java.lang.String str11 = startTag9.toString();
        boolean boolean12 = startTag9.isStartTag();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<<hi!>>" + "'", str11, "<<hi!>>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.jsoup.parser.Token.Character character85 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str86 = character85.getData();
        java.lang.String str87 = character85.toString();
        java.lang.String str88 = character85.getData();
        java.lang.String str89 = character85.getData();
        java.lang.String str90 = character85.toString();
        java.lang.String str91 = character85.toString();
        boolean boolean92 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character85);
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
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "EOF" + "'", str86, "EOF");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "EOF" + "'", str87, "EOF");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "EOF" + "'", str88, "EOF");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "EOF" + "'", str89, "EOF");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "EOF" + "'", str90, "EOF");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "EOF" + "'", str91, "EOF");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        startTag0.tagName = "hi!";
        startTag0.appendAttributeValue("");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        boolean boolean31 = character26.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType8 = tag7.type;
        boolean boolean9 = tag7.isComment();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        startTag2.appendTagName("");
        org.jsoup.parser.Token.StartTag startTag19 = startTag2.asStartTag();
        org.jsoup.parser.Token.StartTag startTag20 = startTag2.asStartTag();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(startTag20);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        boolean boolean5 = startTag0.isDoctype();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.lang.String str15 = endTag1.toString();
        endTag1.selfClosing = false;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        boolean boolean40 = startTag38.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        startTag7.appendAttributeName('a');
        java.lang.String str10 = startTag7.tokenType();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag11.name("hi!");
        org.jsoup.nodes.Attributes attributes14 = tag13.attributes;
        org.jsoup.parser.Token.Tag tag16 = tag13.name("<</hi!>>");
        org.jsoup.nodes.Attributes attributes17 = tag13.attributes;
        org.jsoup.nodes.Attributes attributes18 = tag13.attributes;
        startTag7.attributes = attributes18;
        org.jsoup.nodes.Attributes attributes20 = startTag7.attributes;
        java.lang.Class<?> wildcardClass21 = attributes20.getClass();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        endTag1.appendAttributeValue("Character");
        org.jsoup.parser.Token.Tag tag10 = endTag1.name("Comment");
        boolean boolean11 = tag10.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        java.lang.String str53 = comment45.getData();
        boolean boolean54 = comment45.isStartTag();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.lang.String str15 = startTag14.name();
        java.lang.String str16 = startTag14.toString();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<Doctype>" + "'", str15, "<Doctype>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<<Doctype>>" + "'", str16, "<<Doctype>>");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("", attributes33);
        startTag34.selfClosing = false;
        startTag34.appendTagName("</hi!>");
        startTag34.newAttribute();
        org.jsoup.nodes.Attributes attributes40 = startTag34.getAttributes();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag("hi!", attributes40);
        startTag41.selfClosing = false;
        startTag41.appendAttributeValue("EndTag");
        startTag41.appendAttributeName('#');
        java.lang.String str48 = startTag41.tokenType();
        org.jsoup.parser.Token.TokenType tokenType49 = startTag41.type;
        boolean boolean50 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag41);
        org.jsoup.parser.Token.Doctype doctype51 = new org.jsoup.parser.Token.Doctype();
        boolean boolean52 = doctype51.forceQuirks;
        java.lang.StringBuilder stringBuilder53 = doctype51.systemIdentifier;
        boolean boolean54 = doctype51.forceQuirks;
        boolean boolean55 = doctype51.isForceQuirks();
        java.lang.StringBuilder stringBuilder56 = doctype51.publicIdentifier;
        java.lang.String str57 = doctype51.getSystemIdentifier();
        boolean boolean58 = doctype51.isForceQuirks();
        java.lang.StringBuilder stringBuilder59 = doctype51.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype51);
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
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "StartTag" + "'", str48, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        boolean boolean5 = doctype0.isCharacter();
        java.lang.Class<?> wildcardClass6 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        boolean boolean5 = endTag1.isEOF();
        org.jsoup.nodes.Attributes attributes6 = endTag1.getAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.nodes.Attributes attributes5 = tag2.getAttributes();
        tag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag8 = tag2.asStartTag();
        boolean boolean9 = tag2.isSelfClosing();
        boolean boolean10 = tag2.isDoctype();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        org.jsoup.parser.Token.TokenType tokenType59 = org.jsoup.parser.Token.TokenType.Comment;
        character53.type = tokenType59;
        java.lang.String str61 = character53.getData();
        xmlTreeBuilder0.insert(character53);
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
        org.junit.Assert.assertTrue("'" + tokenType59 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType59.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "EOF" + "'", str61, "EOF");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
            org.jsoup.parser.Token.Character character14 = tag13.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.name;
        java.lang.StringBuilder stringBuilder4 = doctype2.systemIdentifier;
        boolean boolean5 = doctype2.isCharacter();
        java.lang.String str6 = doctype2.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = doctype2.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendTagName("</hi!>");
        startTag2.newAttribute();
        startTag2.appendTagName('4');
        boolean boolean10 = startTag2.isStartTag();
        startTag2.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.lang.StringBuilder stringBuilder63 = comment54.data;
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
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.finaliseTag();
        org.jsoup.nodes.Element element13 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.forceQuirks;
        java.lang.StringBuilder stringBuilder16 = doctype14.systemIdentifier;
        boolean boolean17 = doctype14.isCharacter();
        doctype14.forceQuirks = false;
        java.lang.StringBuilder stringBuilder20 = doctype14.publicIdentifier;
        boolean boolean21 = doctype14.forceQuirks;
        doctype14.forceQuirks = true;
        java.lang.StringBuilder stringBuilder24 = doctype14.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType25 = doctype14.type;
        boolean boolean26 = doctype14.forceQuirks;
        doctype14.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<4>");
        boolean boolean2 = startTag1.selfClosing;
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag("4");
        boolean boolean5 = endTag4.selfClosing;
        endTag4.newAttribute();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean9 = endTag8.selfClosing;
        java.lang.String str10 = endTag8.toString();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag11.name("hi!");
        tag13.finaliseTag();
        tag13.newAttribute();
        org.jsoup.nodes.Attributes attributes16 = tag13.attributes;
        endTag8.attributes = attributes16;
        endTag4.attributes = attributes16;
        startTag1.attributes = attributes16;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        java.lang.String str18 = startTag11.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "</<4>Doctype>" + "'", str17, "</<4>Doctype>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<</<4>Doctype>>" + "'", str18, "<</<4>Doctype>>");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        java.lang.String str9 = comment5.getData();
        boolean boolean10 = comment5.isEndTag();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        org.jsoup.parser.Token.StartTag startTag32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = xmlTreeBuilder0.insert(startTag32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        boolean boolean7 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType10 = doctype0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("<</hi!>>");
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character9);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag12.appendAttributeName(' ');
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag12);
        org.jsoup.parser.Token.Doctype doctype16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        boolean boolean5 = tag3.isEndTag();
        org.jsoup.nodes.Attributes attributes6 = tag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi! >", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        java.lang.String str9 = startTag7.tokenType();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        tag4.tagName = "</hi!>";
        boolean boolean7 = tag4.isEOF();
        java.lang.String str8 = tag4.tagName;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        java.lang.StringBuilder stringBuilder49 = comment44.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype50 = comment44.asDoctype();
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
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!---->" + "'", str46, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        boolean boolean5 = endTag1.isEOF();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder7 = doctype6.name;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype6.type = tokenType8;
        endTag1.type = tokenType8;
        endTag1.appendAttributeValue('a');
        java.lang.String str13 = endTag1.tokenType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EndTag" + "'", str13, "EndTag");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        startTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Character" + "'", str14, "Character");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        boolean boolean20 = tag19.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment21 = tag19.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        boolean boolean5 = startTag2.isCharacter();
        boolean boolean6 = startTag2.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!a", attributes2);
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("</hi!>4");
        startTag3.appendAttributeName('4');
        startTag3.appendAttributeName("<hi!4>");
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        xmlTreeBuilder42.initialiseParse("</hi!>", "EOF", parseErrorList45);
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag49 = startTag47.name("hi!");
        boolean boolean50 = xmlTreeBuilder42.process((org.jsoup.parser.Token) startTag47);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        startTag51.appendTagName('4');
        org.jsoup.nodes.Element element54 = xmlTreeBuilder42.insert(startTag51);
        org.jsoup.parser.Token.Character character56 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str57 = character56.getData();
        java.lang.String str58 = character56.toString();
        boolean boolean59 = character56.isStartTag();
        java.lang.String str60 = character56.getData();
        java.lang.String str61 = character56.toString();
        org.jsoup.parser.Token.Character character62 = character56.asCharacter();
        java.lang.String str63 = character56.toString();
        java.lang.String str64 = character56.toString();
        xmlTreeBuilder42.insert(character56);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        xmlTreeBuilder66.initialiseParse("Character", "hi!", parseErrorList69);
        org.jsoup.parser.Token.Comment comment71 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder72 = comment71.data;
        java.lang.String str73 = comment71.getData();
        xmlTreeBuilder66.insert(comment71);
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag77 = startTag75.name("hi!");
        startTag75.appendAttributeName(' ');
        boolean boolean80 = startTag75.isComment();
        org.jsoup.nodes.Element element81 = xmlTreeBuilder66.insert(startTag75);
        org.jsoup.parser.Token.StartTag startTag83 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str84 = startTag83.name();
        boolean boolean85 = xmlTreeBuilder66.process((org.jsoup.parser.Token) startTag83);
        org.jsoup.parser.Token.Comment comment86 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder87 = comment86.data;
        java.lang.String str88 = comment86.getData();
        java.lang.StringBuilder stringBuilder89 = comment86.data;
        xmlTreeBuilder66.insert(comment86);
        org.jsoup.parser.Token.Comment comment91 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder92 = comment91.data;
        java.lang.String str93 = comment91.toString();
        xmlTreeBuilder66.insert(comment91);
        xmlTreeBuilder42.insert(comment91);
        xmlTreeBuilder0.insert(comment91);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype97 = comment91.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "EOF" + "'", str57, "EOF");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "EOF" + "'", str58, "EOF");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "EOF" + "'", str60, "EOF");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "EOF" + "'", str61, "EOF");
        org.junit.Assert.assertNotNull(character62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "EOF" + "'", str63, "EOF");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "EOF" + "'", str64, "EOF");
        org.junit.Assert.assertNotNull(stringBuilder72);
        org.junit.Assert.assertEquals(stringBuilder72.toString(), "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Doctype" + "'", str84, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(stringBuilder87);
        org.junit.Assert.assertEquals(stringBuilder87.toString(), "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(stringBuilder89);
        org.junit.Assert.assertEquals(stringBuilder89.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder92);
        org.junit.Assert.assertEquals(stringBuilder92.toString(), "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "<!---->" + "'", str93, "<!---->");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        java.lang.String str7 = character1.getData();
        java.lang.String str8 = character1.getData();
        java.lang.String str9 = character1.toString();
        boolean boolean10 = character1.isCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        boolean boolean9 = startTag5.isDoctype();
        startTag5.appendTagName("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype12 = startTag5.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        endTag1.finaliseTag();
        endTag1.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        java.lang.String str6 = startTag0.tagName;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag0.attributes;
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        boolean boolean10 = doctype9.forceQuirks;
        java.lang.String str11 = doctype9.getName();
        boolean boolean12 = doctype9.forceQuirks;
        boolean boolean13 = doctype9.isForceQuirks();
        java.lang.StringBuilder stringBuilder14 = doctype9.publicIdentifier;
        java.lang.StringBuilder stringBuilder15 = doctype9.systemIdentifier;
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean18 = endTag17.selfClosing;
        endTag17.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType20 = endTag17.type;
        doctype9.type = tokenType20;
        startTag0.type = tokenType20;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        boolean boolean2 = endTag1.selfClosing;
        boolean boolean3 = endTag1.isCharacter();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.name();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</<!---->>" + "'", str4, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        java.lang.String str19 = comment14.toString();
        boolean boolean20 = comment14.isComment();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        org.jsoup.nodes.Attributes attributes5 = startTag0.attributes;
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        org.jsoup.parser.Token.Character character30 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str31 = character30.getData();
        java.lang.String str32 = character30.toString();
        xmlTreeBuilder0.insert(character30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment34 = character30.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "</hi!>" + "'", str31, "</hi!>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</hi!>" + "'", str32, "</hi!>");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName('4');
        boolean boolean6 = endTag1.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType7 = endTag1.type;
        endTag1.appendAttributeName(' ');
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("", attributes12);
        startTag13.selfClosing = false;
        startTag13.appendTagName("</hi!>");
        startTag13.newAttribute();
        org.jsoup.nodes.Attributes attributes19 = startTag13.getAttributes();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        boolean boolean21 = startTag20.isComment();
        startTag20.appendTagName(' ');
        org.jsoup.parser.Token.TokenType tokenType24 = startTag20.type;
        org.jsoup.nodes.Attributes attributes25 = startTag20.attributes;
        endTag1.attributes = attributes25;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        java.lang.String str2 = startTag0.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.parser.Token.Tag tag6 = tag2.name("");
        tag6.appendAttributeName('4');
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        org.jsoup.parser.Token.Doctype doctype21 = new org.jsoup.parser.Token.Doctype();
        boolean boolean22 = doctype21.forceQuirks;
        java.lang.StringBuilder stringBuilder23 = doctype21.systemIdentifier;
        boolean boolean24 = doctype21.forceQuirks;
        boolean boolean25 = doctype21.isStartTag();
        java.lang.StringBuilder stringBuilder26 = doctype21.systemIdentifier;
        java.lang.String str27 = doctype21.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder28 = doctype21.name;
        java.lang.String str29 = doctype21.getPublicIdentifier();
        java.lang.String str30 = doctype21.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder31 = doctype21.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType32 = doctype21.type;
        java.lang.String str33 = doctype21.getSystemIdentifier();
        boolean boolean34 = doctype21.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        endTag1.tagName = "</Doctype>";
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes10);
        startTag2.attributes = attributes10;
        boolean boolean13 = startTag2.isEOF();
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        java.lang.String str8 = endTag1.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EndTag" + "'", str8, "EndTag");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        java.lang.String str6 = startTag2.tagName;
        startTag2.appendAttributeName(' ');
        org.jsoup.nodes.Attributes attributes9 = startTag2.getAttributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        endTag1.appendAttributeName('a');
        java.lang.String str9 = endTag1.toString();
        endTag1.appendAttributeValue("</hi!#>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("a");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName('a');
        boolean boolean3 = endTag0.isCharacter();
        endTag0.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        org.jsoup.nodes.Attributes attributes5 = tag2.attributes;
        tag2.appendAttributeValue("");
        boolean boolean8 = tag2.isStartTag();
        tag2.tagName = "</<4>>";
        tag2.appendAttributeValue("<4> ");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes4 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.tokenType();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendTagName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("StartTag");
        startTag2.appendAttributeName(' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        java.lang.String str15 = startTag14.toString();
        boolean boolean16 = startTag14.isSelfClosing();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<EndTag>" + "'", str15, "<EndTag>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isEOF();
        endTag1.appendAttributeName("<Doctype>");
        java.lang.String str6 = endTag1.tagName;
        java.lang.Class<?> wildcardClass7 = endTag1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendTagName('a');
        startTag5.newAttribute();
        org.jsoup.nodes.Element element9 = xmlTreeBuilder0.insert(startTag5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder10.initialiseParse("Character", "hi!", parseErrorList13);
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder16 = comment15.data;
        java.lang.String str17 = comment15.getData();
        xmlTreeBuilder10.insert(comment15);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag21 = startTag19.name("hi!");
        startTag19.appendAttributeName(' ');
        boolean boolean24 = startTag19.isComment();
        org.jsoup.nodes.Element element25 = xmlTreeBuilder10.insert(startTag19);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str28 = startTag27.name();
        boolean boolean29 = xmlTreeBuilder10.process((org.jsoup.parser.Token) startTag27);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder31 = comment30.data;
        java.lang.String str32 = comment30.getData();
        java.lang.StringBuilder stringBuilder33 = comment30.data;
        xmlTreeBuilder10.insert(comment30);
        xmlTreeBuilder0.insert(comment30);
        org.jsoup.parser.Token.Doctype doctype36 = new org.jsoup.parser.Token.Doctype();
        boolean boolean37 = doctype36.forceQuirks;
        java.lang.StringBuilder stringBuilder38 = doctype36.systemIdentifier;
        boolean boolean39 = doctype36.isCharacter();
        doctype36.forceQuirks = false;
        java.lang.StringBuilder stringBuilder42 = doctype36.publicIdentifier;
        boolean boolean43 = doctype36.isStartTag();
        java.lang.StringBuilder stringBuilder44 = doctype36.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Doctype" + "'", str28, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.toString();
        boolean boolean5 = character1.isEOF();
        boolean boolean6 = character1.isDoctype();
        java.lang.String str7 = character1.getData();
        java.lang.String str8 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character13 = doctype0.asCharacter();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        boolean boolean21 = doctype0.forceQuirks;
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
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isEOF();
        endTag1.appendAttributeName("hi! ");
        boolean boolean12 = endTag1.isComment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        boolean boolean11 = startTag10.isComment();
        startTag10.appendTagName(' ');
        startTag10.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        boolean boolean7 = startTag0.isComment();
        startTag0.newAttribute();
        boolean boolean9 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag("", attributes46);
        boolean boolean48 = startTag47.isDoctype();
        java.lang.String str49 = startTag47.tagName;
        startTag47.selfClosing = false;
        org.jsoup.parser.Token.Tag tag53 = startTag47.name("</hi!>");
        java.lang.String str54 = tag53.name();
        tag53.selfClosing = false;
        boolean boolean57 = tag53.selfClosing;
        tag53.appendAttributeValue('#');
        tag53.appendTagName('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag53);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "</hi!>" + "'", str54, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("</Doctype>");
        java.lang.String str10 = tag9.name();
        boolean boolean11 = tag9.isStartTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</Doctype>" + "'", str10, "</Doctype>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        startTag2.selfClosing = false;
        boolean boolean10 = startTag2.isDoctype();
        java.lang.String str11 = startTag2.toString();
        startTag2.appendAttributeName('4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi!>>" + "'", str11, "<</hi!>>");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        boolean boolean6 = comment0.isEndTag();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.newAttribute();
        boolean boolean2 = startTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character19 = startTag14.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.forceQuirks;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("", attributes12);
        startTag13.selfClosing = false;
        startTag13.appendTagName("</hi!>");
        startTag13.newAttribute();
        org.jsoup.nodes.Attributes attributes19 = startTag13.getAttributes();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        org.jsoup.parser.Token.TokenType tokenType21 = startTag20.type;
        doctype0.type = tokenType21;
        boolean boolean23 = doctype0.isForceQuirks();
        java.lang.String str24 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.Class<?> wildcardClass6 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.selfClosing;
        java.lang.String str10 = endTag1.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getName();
        java.lang.Class<?> wildcardClass8 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        org.jsoup.parser.ParseErrorList parseErrorList94 = null;
        xmlTreeBuilder0.initialiseParse("<4</hi!>4>", "Character", parseErrorList94);
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        xmlTreeBuilder0.initialiseParse("Comment", "</<4>Doctype>", parseErrorList25);
        org.jsoup.parser.Token.Doctype doctype27 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str28 = doctype27.tokenType();
        java.lang.String str29 = doctype27.getSystemIdentifier();
        java.lang.String str30 = doctype27.tokenType();
        boolean boolean31 = doctype27.forceQuirks;
        doctype27.forceQuirks = false;
        java.lang.StringBuilder stringBuilder34 = doctype27.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype27);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Doctype" + "'", str28, "Doctype");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Doctype" + "'", str30, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        boolean boolean21 = doctype20.forceQuirks;
        java.lang.StringBuilder stringBuilder22 = doctype20.systemIdentifier;
        boolean boolean23 = doctype20.isCharacter();
        doctype20.forceQuirks = false;
        java.lang.StringBuilder stringBuilder26 = doctype20.publicIdentifier;
        boolean boolean27 = doctype20.forceQuirks;
        java.lang.StringBuilder stringBuilder28 = doctype20.publicIdentifier;
        java.lang.String str29 = doctype20.getSystemIdentifier();
        java.lang.String str30 = doctype20.getPublicIdentifier();
        boolean boolean31 = doctype20.isForceQuirks();
        doctype20.forceQuirks = false;
        java.lang.String str34 = doctype20.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<Doctype>");
        boolean boolean2 = endTag1.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = endTag1.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("", attributes34);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag38 = startTag36.name("hi!");
        org.jsoup.nodes.Attributes attributes39 = tag38.attributes;
        startTag35.attributes = attributes39;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag("Doctype", attributes39);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag("", attributes39);
        startTag42.appendAttributeValue("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType45 = startTag42.type;
        startTag42.appendTagName(' ');
        startTag42.appendTagName('a');
        boolean boolean50 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag42);
        org.jsoup.parser.Token token51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = xmlTreeBuilder0.process(token51);
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
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Comment" + "'", str29, "Comment");
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("Comment");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.appendAttributeValue('#');
        java.lang.String str5 = endTag1.toString();
        java.lang.String str6 = endTag1.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</Comment>" + "'", str5, "</Comment>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Comment" + "'", str6, "Comment");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        startTag11.appendTagName("</Doctype>");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        startTag0.appendAttributeName("<Doctype>");
        org.jsoup.nodes.Attributes attributes17 = startTag0.attributes;
        boolean boolean18 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!>" + "'", str14, "<hi!>");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        org.jsoup.parser.Token.TokenType tokenType17 = startTag11.type;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<</hi!>>");
        boolean boolean2 = startTag1.selfClosing;
        boolean boolean3 = startTag1.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        startTag40.appendAttributeName(' ');
        boolean boolean45 = startTag40.isComment();
        java.lang.String str46 = startTag40.tagName;
        boolean boolean47 = startTag40.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag48 = startTag40.asStartTag();
        org.jsoup.nodes.Element element49 = xmlTreeBuilder0.insert(startTag48);
        java.lang.String str50 = startTag48.tagName;
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
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        boolean boolean3 = tag2.isComment();
        org.jsoup.parser.Token.Tag tag5 = tag2.name("</Doctype>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        startTag2.appendAttributeName("</Doctype>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = startTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        org.jsoup.parser.Token.Doctype doctype58 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str59 = doctype58.tokenType();
        org.jsoup.parser.Token.Doctype doctype60 = doctype58.asDoctype();
        doctype60.forceQuirks = true;
        boolean boolean63 = doctype60.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype60);
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
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Doctype" + "'", str59, "Doctype");
        org.junit.Assert.assertNotNull(doctype60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.selfClosing;
        org.jsoup.nodes.Attributes attributes10 = endTag1.getAttributes();
        boolean boolean11 = endTag1.selfClosing;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        startTag12.appendAttributeName(' ');
        java.lang.String str17 = startTag12.tokenType();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes20);
        startTag21.selfClosing = false;
        startTag21.newAttribute();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag26.name("hi!");
        org.jsoup.nodes.Attributes attributes29 = tag28.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("", attributes29);
        startTag21.attributes = attributes29;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("<!---->", attributes29);
        startTag12.attributes = attributes29;
        endTag1.attributes = attributes29;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        boolean boolean2 = endTag1.selfClosing;
        boolean boolean3 = endTag1.isEndTag();
        boolean boolean4 = endTag1.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("4", attributes9);
        org.jsoup.parser.Token.Tag tag12 = startTag10.name("<Doctype>");
        tag12.finaliseTag();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.parser.Token.Tag tag6 = tag2.name("");
        org.jsoup.nodes.Attributes attributes7 = tag6.attributes;
        tag6.appendTagName("</Doctype>");
        tag6.selfClosing = true;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        java.lang.StringBuilder stringBuilder15 = doctype0.name;
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
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<hi!>");
        boolean boolean2 = character1.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("", attributes37);
        startTag38.selfClosing = false;
        startTag38.appendTagName("</hi!>");
        startTag38.newAttribute();
        org.jsoup.nodes.Attributes attributes44 = startTag38.getAttributes();
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag("Doctype", attributes44);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("hi!", attributes44);
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag("</hi!>4", attributes44);
        org.jsoup.nodes.Element element48 = xmlTreeBuilder0.insert(startTag47);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</Character>", parseErrorList51);
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
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        boolean boolean8 = startTag0.isComment();
        boolean boolean9 = startTag0.isCharacter();
        startTag0.appendAttributeValue("#");
        startTag0.appendAttributeValue("<a>");
        boolean boolean14 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        java.lang.String str19 = doctype0.getName();
        boolean boolean20 = doctype0.isEOF();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes4);
        java.lang.String str6 = startTag5.toString();
        startTag5.appendAttributeName('#');
        startTag5.tagName = "</hi!#>";
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<</hi!>>" + "'", str6, "<</hi!>>");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        java.lang.String str7 = character1.getData();
        java.lang.String str8 = character1.toString();
        java.lang.String str9 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendTagName('a');
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag9.selfClosing = false;
        startTag9.appendTagName("</hi!>");
        startTag9.newAttribute();
        org.jsoup.nodes.Attributes attributes15 = startTag9.getAttributes();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("Doctype", attributes15);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("</hi!>4", attributes15);
        startTag1.attributes = attributes15;
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType2;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.Class<?> wildcardClass8 = doctype0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        java.lang.String str11 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        endTag1.finaliseTag();
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        boolean boolean17 = startTag11.isComment();
        org.jsoup.nodes.Attributes attributes18 = startTag11.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character19 = startTag11.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getName();
        java.lang.String str12 = doctype0.getSystemIdentifier();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.lang.String str29 = comment20.getData();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("EOF");
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!a");
        java.lang.String str4 = tag3.name();
        boolean boolean5 = tag3.isSelfClosing();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        doctype7.forceQuirks = false;
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
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        boolean boolean3 = character1.isComment();
        java.lang.String str4 = character1.toString();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.toString();
        java.lang.String str7 = character1.getData();
        java.lang.String str8 = character1.toString();
        java.lang.String str9 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes9 = startTag2.getAttributes();
        boolean boolean10 = startTag2.selfClosing;
        boolean boolean11 = startTag2.isStartTag();
        startTag2.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.Comment;
        comment0.type = tokenType2;
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        java.lang.String str21 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder22 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.Class<?> wildcardClass1 = comment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        startTag2.appendAttributeName("EOF");
        startTag2.appendAttributeName('4');
        java.lang.String str12 = startTag2.toString();
        startTag2.tagName = "<StartTag>";
        boolean boolean15 = startTag2.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<</hi!>>" + "'", str12, "<</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        java.lang.String str10 = doctype0.getName();
        java.lang.String str11 = doctype0.getName();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        xmlTreeBuilder52.initialiseParse("Character", "hi!", parseErrorList55);
        org.jsoup.parser.Token.Comment comment57 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder58 = comment57.data;
        java.lang.String str59 = comment57.getData();
        xmlTreeBuilder52.insert(comment57);
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag63 = startTag61.name("hi!");
        startTag61.appendAttributeName(' ');
        boolean boolean66 = startTag61.isComment();
        org.jsoup.nodes.Element element67 = xmlTreeBuilder52.insert(startTag61);
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str70 = startTag69.name();
        boolean boolean71 = xmlTreeBuilder52.process((org.jsoup.parser.Token) startTag69);
        org.jsoup.nodes.Element element72 = xmlTreeBuilder0.insert(startTag69);
        boolean boolean73 = startTag69.isSelfClosing();
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
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Doctype" + "'", str70, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        startTag9.appendAttributeValue("<<hi!>>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.lang.String str26 = character20.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4</hi!>4>");
        endTag1.finaliseTag();
        endTag1.appendAttributeName("</Comment>");
        endTag1.selfClosing = true;
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("</hi!>", "EOF", parseErrorList15);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag17.name("hi!");
        boolean boolean20 = xmlTreeBuilder12.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder21.initialiseParse("Character", "hi!", parseErrorList24);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder27 = comment26.data;
        java.lang.String str28 = comment26.getData();
        xmlTreeBuilder21.insert(comment26);
        xmlTreeBuilder12.insert(comment26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("Character", "hi!", parseErrorList34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder31.initialiseParse("</hi!>", "Doctype", parseErrorList38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder31.initialiseParse("", "<4>", parseErrorList42);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        xmlTreeBuilder44.initialiseParse("</hi!>", "EOF", parseErrorList47);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag51 = startTag49.name("hi!");
        boolean boolean52 = xmlTreeBuilder44.process((org.jsoup.parser.Token) startTag49);
        org.jsoup.parser.Token.Comment comment53 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder54 = comment53.data;
        java.lang.String str55 = comment53.toString();
        xmlTreeBuilder44.insert(comment53);
        java.lang.String str57 = comment53.toString();
        java.lang.String str58 = comment53.getData();
        xmlTreeBuilder31.insert(comment53);
        org.jsoup.parser.Token.TokenType tokenType60 = comment53.type;
        xmlTreeBuilder12.insert(comment53);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        startTag62.appendTagName('a');
        boolean boolean65 = xmlTreeBuilder12.process((org.jsoup.parser.Token) startTag62);
        org.jsoup.parser.Token.EndTag endTag67 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean68 = endTag67.selfClosing;
        org.jsoup.parser.Token.Tag tag70 = endTag67.name("");
        boolean boolean71 = endTag67.isEndTag();
        org.jsoup.parser.Token.Tag tag73 = endTag67.name("<4>");
        java.lang.String str74 = endTag67.tokenType();
        boolean boolean75 = xmlTreeBuilder12.process((org.jsoup.parser.Token) endTag67);
        boolean boolean76 = endTag67.isComment();
        org.jsoup.parser.Token.TokenType tokenType77 = endTag67.type;
        doctype0.type = tokenType77;
        boolean boolean79 = doctype0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character80 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!---->" + "'", str55, "<!---->");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!---->" + "'", str57, "<!---->");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + tokenType60 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType60.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "EndTag" + "'", str74, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + tokenType77 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType77.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.finaliseTag();
        org.jsoup.nodes.Element element13 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token token14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.process(token14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        java.lang.String str11 = character1.getData();
        org.jsoup.parser.Token.TokenType tokenType12 = character1.type;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EOF" + "'", str10, "EOF");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        boolean boolean41 = character35.isEndTag();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder15.initialiseParse("Character", "hi!", parseErrorList18);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        xmlTreeBuilder15.insert(comment20);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str26 = character25.getData();
        java.lang.String str27 = character25.toString();
        boolean boolean28 = character25.isStartTag();
        java.lang.String str29 = character25.getData();
        java.lang.String str30 = character25.toString();
        org.jsoup.parser.Token.Character character31 = character25.asCharacter();
        xmlTreeBuilder15.insert(character31);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag35 = startTag33.name("hi!");
        startTag33.finaliseTag();
        startTag33.finaliseTag();
        startTag33.appendTagName(' ');
        org.jsoup.nodes.Element element40 = xmlTreeBuilder15.insert(startTag33);
        org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag42 = startTag33.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertNotNull(character31);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        java.lang.String str18 = endTag1.toString();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "</hi!>" + "'", str18, "</hi!>");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        java.lang.String str6 = startTag0.tagName;
        startTag0.newAttribute();
        startTag0.tagName = "<</hi!>>";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEndBang;
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
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype6.systemIdentifier;
        boolean boolean9 = doctype6.isCharacter();
        doctype6.forceQuirks = false;
        boolean boolean12 = doctype6.isEOF();
        java.lang.String str13 = doctype6.tokenType();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("", attributes15);
        startTag16.selfClosing = false;
        startTag16.newAttribute();
        org.jsoup.parser.Token.Tag tag21 = startTag16.name("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType22 = tag21.type;
        doctype6.type = tokenType22;
        doctype0.type = tokenType22;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Doctype" + "'", str13, "Doctype");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype45 = startTag38.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName("<hi!>");
        boolean boolean3 = startTag0.isDoctype();
        startTag0.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        xmlTreeBuilder0.initialiseParse("</hi!<4>>", "<</hi!>>hi!", parseErrorList70);
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<4>", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("</Comment>", "StartTag", parseErrorList15);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype3 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype3.systemIdentifier;
        java.lang.String str5 = doctype3.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype3.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(doctype3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str27 = doctype26.tokenType();
        boolean boolean28 = doctype26.isForceQuirks();
        java.lang.String str29 = doctype26.getPublicIdentifier();
        boolean boolean30 = doctype26.isForceQuirks();
        doctype26.forceQuirks = true;
        doctype26.forceQuirks = false;
        doctype26.forceQuirks = false;
        java.lang.String str37 = doctype26.getPublicIdentifier();
        boolean boolean38 = doctype26.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Doctype" + "'", str27, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = endTag1.name();
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isEOF();
        endTag1.appendAttributeName("<Doctype>");
        boolean boolean6 = endTag1.isCharacter();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder7.initialiseParse("</hi!>", "EOF", parseErrorList10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        boolean boolean15 = xmlTreeBuilder7.process((org.jsoup.parser.Token) startTag12);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendTagName('4');
        org.jsoup.nodes.Element element19 = xmlTreeBuilder7.insert(startTag16);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder7.initialiseParse("Character", "Doctype", parseErrorList22);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str26 = character25.getData();
        boolean boolean27 = character25.isComment();
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder29 = comment28.data;
        org.jsoup.parser.Token.TokenType tokenType30 = org.jsoup.parser.Token.TokenType.Comment;
        comment28.type = tokenType30;
        character25.type = tokenType30;
        java.lang.String str33 = character25.toString();
        java.lang.String str34 = character25.toString();
        xmlTreeBuilder7.insert(character25);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder37 = comment36.data;
        org.jsoup.parser.Token.TokenType tokenType38 = org.jsoup.parser.Token.TokenType.Comment;
        comment36.type = tokenType38;
        java.lang.StringBuilder stringBuilder40 = comment36.data;
        java.lang.StringBuilder stringBuilder41 = comment36.data;
        java.lang.StringBuilder stringBuilder42 = comment36.data;
        xmlTreeBuilder7.insert(comment36);
        org.jsoup.parser.Token.TokenType tokenType44 = org.jsoup.parser.Token.TokenType.EndTag;
        comment36.type = tokenType44;
        endTag1.type = tokenType44;
        boolean boolean47 = endTag1.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EOF" + "'", str33, "EOF");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        org.jsoup.parser.Token.Doctype doctype75 = new org.jsoup.parser.Token.Doctype();
        boolean boolean76 = doctype75.forceQuirks;
        java.lang.String str77 = doctype75.getName();
        boolean boolean78 = doctype75.isEndTag();
        boolean boolean79 = doctype75.isForceQuirks();
        boolean boolean80 = doctype75.forceQuirks;
        java.lang.String str81 = doctype75.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isDoctype();
        startTag0.appendAttributeValue("<StartTag>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        org.jsoup.parser.Token.TokenType tokenType22 = comment17.type;
        java.lang.StringBuilder stringBuilder23 = comment17.data;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = doctype0.asComment();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        java.lang.String str6 = startTag4.tagName;
        startTag4.selfClosing = false;
        org.jsoup.parser.Token.Tag tag10 = startTag4.name("</hi!>");
        java.lang.String str11 = tag10.name();
        tag10.selfClosing = false;
        org.jsoup.nodes.Attributes attributes14 = tag10.getAttributes();
        java.lang.String str15 = tag10.name();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes18);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag20.name("hi!");
        org.jsoup.nodes.Attributes attributes23 = tag22.attributes;
        startTag19.attributes = attributes23;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("Doctype", attributes23);
        tag10.attributes = attributes23;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("</Character>", attributes23);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("", attributes23);
        boolean boolean29 = startTag28.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        java.lang.String str8 = endTag1.tokenType();
        java.lang.String str9 = endTag1.toString();
        endTag1.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag12 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EndTag" + "'", str8, "EndTag");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</<4>>" + "'", str9, "</<4>>");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        java.lang.String str8 = startTag2.tagName;
        startTag2.appendAttributeValue("<a>");
        boolean boolean11 = startTag2.isEOF();
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.isStartTag();
        endTag1.appendTagName('#');
        java.lang.String str5 = endTag1.name();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!#" + "'", str5, "hi!#");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        boolean boolean9 = tag8.isStartTag();
        tag8.appendAttributeValue("");
        tag8.appendTagName('a');
        tag8.appendAttributeName("</Comment>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        startTag9.finaliseTag();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        startTag2.appendAttributeValue('a');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.lang.String str30 = comment22.getData();
        java.lang.String str31 = comment22.toString();
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        boolean boolean9 = tag8.isStartTag();
        tag8.appendAttributeValue("");
        tag8.appendTagName('a');
        tag8.appendAttributeValue("hi! ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype29 = character23.asDoctype();
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
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EOF" + "'", str28, "EOF");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        boolean boolean5 = tag2.isSelfClosing();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        xmlTreeBuilder0.initialiseParse("<hi!4>", "", parseErrorList53);
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
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        tag2.appendAttributeName("<a>");
        tag2.tagName = "<hi!>";
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        org.jsoup.parser.Token.Character character55 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str56 = character55.getData();
        java.lang.String str57 = character55.toString();
        boolean boolean58 = character55.isStartTag();
        java.lang.String str59 = character55.toString();
        java.lang.String str60 = character55.getData();
        boolean boolean61 = character55.isEndTag();
        java.lang.String str62 = character55.getData();
        java.lang.String str63 = character55.getData();
        xmlTreeBuilder0.insert(character55);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder65 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        xmlTreeBuilder65.initialiseParse("Character", "hi!", parseErrorList68);
        org.jsoup.parser.Token.Comment comment70 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder71 = comment70.data;
        java.lang.String str72 = comment70.getData();
        xmlTreeBuilder65.insert(comment70);
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag76 = startTag74.name("hi!");
        startTag74.appendAttributeName(' ');
        boolean boolean79 = startTag74.isComment();
        org.jsoup.nodes.Element element80 = xmlTreeBuilder65.insert(startTag74);
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        xmlTreeBuilder65.initialiseParse("Character", "<Doctype>", parseErrorList83);
        org.jsoup.parser.ParseErrorList parseErrorList87 = null;
        xmlTreeBuilder65.initialiseParse("<hi!>", "</hi!>", parseErrorList87);
        org.jsoup.parser.Token.Comment comment89 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder90 = comment89.data;
        java.lang.String str91 = comment89.getData();
        java.lang.StringBuilder stringBuilder92 = comment89.data;
        java.lang.String str93 = comment89.toString();
        java.lang.String str94 = comment89.tokenType();
        xmlTreeBuilder65.insert(comment89);
        xmlTreeBuilder0.insert(comment89);
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "EOF" + "'", str56, "EOF");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "EOF" + "'", str57, "EOF");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "EOF" + "'", str59, "EOF");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "EOF" + "'", str60, "EOF");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "EOF" + "'", str62, "EOF");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "EOF" + "'", str63, "EOF");
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(stringBuilder90);
        org.junit.Assert.assertEquals(stringBuilder90.toString(), "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(stringBuilder92);
        org.junit.Assert.assertEquals(stringBuilder92.toString(), "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "<!---->" + "'", str93, "<!---->");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Comment" + "'", str94, "Comment");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeValue("");
        boolean boolean9 = endTag1.isStartTag();
        endTag1.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag12 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<hi!4>");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder24.initialiseParse("</hi!>", "EOF", parseErrorList27);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag31 = startTag29.name("hi!");
        boolean boolean32 = xmlTreeBuilder24.process((org.jsoup.parser.Token) startTag29);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.appendTagName('4');
        org.jsoup.nodes.Element element36 = xmlTreeBuilder24.insert(startTag33);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        xmlTreeBuilder24.initialiseParse("<4>", "</hi!>", parseErrorList39);
        org.jsoup.parser.Token.Character character42 = new org.jsoup.parser.Token.Character("<!---->");
        xmlTreeBuilder24.insert(character42);
        java.lang.String str44 = character42.toString();
        boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character42);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!---->" + "'", str44, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEndDash;
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
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character20 = comment17.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        java.lang.String str19 = doctype0.getName();
        java.lang.String str20 = doctype0.getName();
        java.lang.StringBuilder stringBuilder21 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("EndTag", attributes34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.lang.String str29 = character23.toString();
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
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<</hi!>>", parseErrorList3);
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
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str23 = startTag22.name();
        boolean boolean24 = xmlTreeBuilder5.process((org.jsoup.parser.Token) startTag22);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder26 = comment25.data;
        java.lang.String str27 = comment25.getData();
        java.lang.StringBuilder stringBuilder28 = comment25.data;
        xmlTreeBuilder5.insert(comment25);
        java.lang.StringBuilder stringBuilder30 = comment25.data;
        java.lang.String str31 = comment25.getData();
        xmlTreeBuilder0.insert(comment25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag33 = comment25.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Doctype" + "'", str23, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = startTag10.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        startTag2.appendTagName(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<StartTag>");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("</hi!>4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = tag11.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment20 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        boolean boolean33 = endTag30.isEOF();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("<</hi!>>");
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character9);
        java.lang.String str11 = character9.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi!>>" + "'", str11, "<</hi!>>");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype0.type;
        org.jsoup.parser.Token.Doctype doctype10 = doctype0.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType11 = doctype0.type;
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
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        startTag9.appendTagName('4');
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<4>" + "'", str13, "<4>");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        boolean boolean9 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment2 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        startTag56.appendTagName('4');
        org.jsoup.nodes.Element element59 = xmlTreeBuilder47.insert(startTag56);
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        xmlTreeBuilder47.initialiseParse("Character", "Doctype", parseErrorList62);
        org.jsoup.parser.Token.Comment comment64 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder65 = comment64.data;
        xmlTreeBuilder47.insert(comment64);
        org.jsoup.parser.Token.Comment comment67 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder68 = comment67.data;
        org.jsoup.parser.Token.TokenType tokenType69 = org.jsoup.parser.Token.TokenType.Comment;
        comment67.type = tokenType69;
        xmlTreeBuilder47.insert(comment67);
        java.lang.String str72 = comment67.getData();
        java.lang.String str73 = comment67.toString();
        java.lang.String str74 = comment67.toString();
        xmlTreeBuilder0.insert(comment67);
        org.jsoup.parser.Token.Comment comment76 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment76);
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
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType69 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType69.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "<!---->" + "'", str73, "<!---->");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "<!---->" + "'", str74, "<!---->");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.Comment;
        comment0.type = tokenType2;
        java.lang.String str4 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype5 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        java.lang.String str42 = character25.toString();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder43.initialiseParse("Character", "hi!", parseErrorList46);
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        startTag48.appendTagName('a');
        startTag48.newAttribute();
        org.jsoup.nodes.Element element52 = xmlTreeBuilder43.insert(startTag48);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        xmlTreeBuilder53.initialiseParse("Character", "hi!", parseErrorList56);
        org.jsoup.parser.Token.Comment comment58 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder59 = comment58.data;
        java.lang.String str60 = comment58.getData();
        xmlTreeBuilder53.insert(comment58);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag64 = startTag62.name("hi!");
        startTag62.appendAttributeName(' ');
        boolean boolean67 = startTag62.isComment();
        org.jsoup.nodes.Element element68 = xmlTreeBuilder53.insert(startTag62);
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str71 = startTag70.name();
        boolean boolean72 = xmlTreeBuilder53.process((org.jsoup.parser.Token) startTag70);
        org.jsoup.parser.Token.Comment comment73 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder74 = comment73.data;
        java.lang.String str75 = comment73.getData();
        java.lang.StringBuilder stringBuilder76 = comment73.data;
        xmlTreeBuilder53.insert(comment73);
        xmlTreeBuilder43.insert(comment73);
        org.jsoup.parser.Token.TokenType tokenType79 = comment73.type;
        character25.type = tokenType79;
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EOF" + "'", str42, "EOF");
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Doctype" + "'", str71, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(stringBuilder76);
        org.junit.Assert.assertEquals(stringBuilder76.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType79 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType79.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isEOF();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("4");
        endTag1.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character12 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        java.lang.String str7 = character1.getData();
        java.lang.String str8 = character1.getData();
        java.lang.String str9 = character1.getData();
        boolean boolean10 = character1.isComment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        startTag9.appendAttributeValue("</hi!>4");
        startTag9.finaliseTag();
        boolean boolean18 = startTag9.isComment();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        java.lang.String str4 = startTag0.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype5 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.tagName = "EndTag";
        boolean boolean4 = startTag1.selfClosing;
        startTag1.newAttribute();
        java.lang.String str6 = startTag1.toString();
        startTag1.appendAttributeName('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = startTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<EndTag>" + "'", str6, "<EndTag>");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.appendTagName("</hi!>");
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes10 = startTag4.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("Doctype", attributes10);
        startTag11.selfClosing = true;
        startTag11.appendAttributeName('4');
        boolean boolean16 = startTag11.isSelfClosing();
        org.jsoup.nodes.Attributes attributes17 = startTag11.getAttributes();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("</Comment>", attributes17);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        boolean boolean4 = doctype0.isStartTag();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.name();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getName();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag37 = startTag35.name("hi!");
        startTag35.finaliseTag();
        startTag35.appendAttributeValue("</hi!>");
        org.jsoup.nodes.Attributes attributes41 = startTag35.attributes;
        startTag35.selfClosing = false;
        org.jsoup.parser.Token.Tag tag45 = startTag35.name("<4>");
        boolean boolean46 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag35);
        boolean boolean47 = startTag35.isComment();
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
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        java.lang.String str30 = doctype28.getName();
        boolean boolean31 = doctype28.isEndTag();
        boolean boolean32 = doctype28.isForceQuirks();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        org.jsoup.nodes.Attributes attributes15 = tag8.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character16 = tag8.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(attributes15);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        java.lang.String str36 = startTag33.tokenType();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "StartTag" + "'", str36, "StartTag");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        java.lang.String str4 = startTag0.name();
        startTag0.finaliseTag();
        boolean boolean6 = startTag0.isStartTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        java.lang.String str6 = startTag2.tagName;
        boolean boolean7 = startTag2.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = startTag2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype1 = doctype0.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag2 = doctype1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype1);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.newAttribute();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!");
        tag9.finaliseTag();
        tag9.newAttribute();
        org.jsoup.nodes.Attributes attributes12 = tag9.attributes;
        startTag3.attributes = attributes12;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        org.jsoup.parser.Token.Doctype doctype15 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str16 = doctype15.tokenType();
        boolean boolean17 = doctype15.isForceQuirks();
        java.lang.String str18 = doctype15.getPublicIdentifier();
        boolean boolean19 = doctype15.isForceQuirks();
        doctype15.forceQuirks = true;
        doctype15.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType24 = doctype15.type;
        startTag14.type = tokenType24;
        org.jsoup.parser.Token.StartTag startTag26 = startTag14.asStartTag();
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Doctype" + "'", str16, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(startTag26);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        startTag33.appendTagName(" a");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        xmlTreeBuilder0.initialiseParse("<</hi!>>hi!", "<EndTag>", parseErrorList37);
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

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isEOF();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("4");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        boolean boolean11 = tag9.isStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.selfClosing;
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.nodes.Attributes attributes8 = startTag7.getAttributes();
        startTag0.attributes = attributes8;
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendTagName('4');
        endTag1.appendAttributeName('4');
        org.jsoup.parser.Token.TokenType tokenType10 = endTag1.type;
        endTag1.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        startTag2.appendAttributeName("EOF");
        org.jsoup.parser.Token.StartTag startTag10 = startTag2.asStartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        startTag10.attributes = attributes11;
        boolean boolean13 = startTag10.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        startTag2.appendAttributeName(' ');
        java.lang.String str7 = startTag2.tokenType();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes10);
        startTag11.selfClosing = false;
        startTag11.newAttribute();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag16.name("hi!");
        org.jsoup.nodes.Attributes attributes19 = tag18.attributes;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("", attributes19);
        startTag11.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("<!---->", attributes19);
        startTag2.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("</<4>Doctype>", attributes19);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("</<4>Doctype>", attributes19);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("EndTag");
        startTag1.tagName = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = startTag1.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag18.name("hi!");
        startTag18.appendAttributeName(' ');
        boolean boolean23 = startTag18.isComment();
        org.jsoup.nodes.Element element24 = xmlTreeBuilder9.insert(startTag18);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str27 = startTag26.name();
        boolean boolean28 = xmlTreeBuilder9.process((org.jsoup.parser.Token) startTag26);
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder30 = comment29.data;
        java.lang.String str31 = comment29.getData();
        java.lang.StringBuilder stringBuilder32 = comment29.data;
        xmlTreeBuilder9.insert(comment29);
        java.lang.String str34 = comment29.getData();
        xmlTreeBuilder0.insert(comment29);
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("", attributes38);
        startTag39.selfClosing = false;
        startTag39.newAttribute();
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag46 = startTag44.name("hi!");
        org.jsoup.nodes.Attributes attributes47 = tag46.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag("", attributes47);
        startTag39.attributes = attributes47;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("EndTag", attributes47);
        boolean boolean51 = startTag50.isCharacter();
        boolean boolean52 = startTag50.isDoctype();
        java.lang.String str53 = startTag50.tokenType();
        org.jsoup.nodes.Element element54 = xmlTreeBuilder0.insert(startTag50);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Doctype" + "'", str27, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "StartTag" + "'", str53, "StartTag");
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        boolean boolean3 = comment0.isDoctype();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        boolean boolean11 = character1.isEndTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EOF" + "'", str10, "EOF");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        org.jsoup.parser.Token.Doctype doctype50 = new org.jsoup.parser.Token.Doctype();
        boolean boolean51 = doctype50.forceQuirks;
        java.lang.StringBuilder stringBuilder52 = doctype50.systemIdentifier;
        boolean boolean53 = doctype50.isCharacter();
        doctype50.forceQuirks = false;
        java.lang.StringBuilder stringBuilder56 = doctype50.publicIdentifier;
        boolean boolean57 = doctype50.forceQuirks;
        java.lang.StringBuilder stringBuilder58 = doctype50.name;
        org.jsoup.parser.Token.Doctype doctype59 = doctype50.asDoctype();
        boolean boolean60 = doctype59.isForceQuirks();
        java.lang.String str61 = doctype59.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype59);
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
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
        org.junit.Assert.assertNotNull(doctype59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
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
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType9 = endTag1.type;
        java.lang.String str10 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        endTag1.appendAttributeValue("Character");
        endTag1.newAttribute();
        endTag1.appendTagName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        org.jsoup.parser.Token.Character character51 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str52 = character51.getData();
        java.lang.String str53 = character51.toString();
        boolean boolean54 = character51.isStartTag();
        java.lang.String str55 = character51.toString();
        java.lang.String str56 = character51.toString();
        boolean boolean57 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character51);
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "EOF" + "'", str52, "EOF");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "EOF" + "'", str53, "EOF");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "EOF" + "'", str55, "EOF");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "EOF" + "'", str56, "EOF");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("</hi!>");
        startTag2.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("<Doctype>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("</hi!>");
        boolean boolean8 = tag7.isCharacter();
        boolean boolean9 = tag7.isComment();
        java.lang.String str10 = tag7.tokenType();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("", attributes12);
        startTag13.selfClosing = false;
        startTag13.newAttribute();
        startTag13.finaliseTag();
        org.jsoup.nodes.Attributes attributes18 = startTag13.getAttributes();
        tag7.attributes = attributes18;
        boolean boolean20 = tag7.isSelfClosing();
        tag7.tagName = "<4</hi!>4>";
        tag7.selfClosing = false;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag52 = character50.asEndTag();
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
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        tag3.finaliseTag();
        tag3.newAttribute();
        java.lang.String str6 = tag3.tagName;
        org.jsoup.nodes.Attributes attributes7 = tag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<</hi!>>", attributes7);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype5.name;
        java.lang.StringBuilder stringBuilder8 = doctype5.systemIdentifier;
        java.lang.String str9 = doctype5.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType8 = tag7.type;
        tag7.appendTagName("hi!");
        java.lang.String str11 = tag7.tokenType();
        tag7.appendAttributeValue('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EndTag" + "'", str11, "EndTag");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.lang.String str10 = doctype0.getPublicIdentifier();
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        java.lang.String str2 = startTag0.tokenType();
        startTag0.appendAttributeValue('#');
        boolean boolean5 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        boolean boolean2 = startTag1.isComment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        java.lang.String str22 = character10.toString();
        java.lang.String str23 = character10.getData();
        java.lang.String str24 = character10.toString();
        java.lang.String str25 = character10.getData();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Character" + "'", str21, "Character");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isSelfClosing();
        startTag2.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        org.jsoup.parser.Token.StartTag startTag17 = startTag9.asStartTag();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(startTag17);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        java.lang.String str9 = endTag1.toString();
        java.lang.String str10 = endTag1.name();
        java.lang.String str11 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RCDATAEndTagOpen;
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
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        boolean boolean17 = comment9.isComment();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        boolean boolean28 = endTag15.isDoctype();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        boolean boolean7 = startTag2.selfClosing;
        boolean boolean8 = startTag2.isEndTag();
        org.jsoup.nodes.Attributes attributes9 = startTag2.getAttributes();
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        org.jsoup.parser.Token.TokenType tokenType26 = comment20.type;
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
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        boolean boolean4 = startTag1.isComment();
        boolean boolean5 = startTag1.isEndTag();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        endTag1.newAttribute();
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
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        tag8.appendTagName('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        boolean boolean2 = endTag1.isEndTag();
        endTag1.selfClosing = false;
        org.jsoup.nodes.Attributes attributes5 = endTag1.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        java.lang.String str27 = comment20.toString();
        java.lang.StringBuilder stringBuilder28 = comment20.data;
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("#");
        boolean boolean2 = startTag1.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        startTag40.appendAttributeName(' ');
        boolean boolean45 = startTag40.isComment();
        java.lang.String str46 = startTag40.tagName;
        boolean boolean47 = startTag40.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag48 = startTag40.asStartTag();
        org.jsoup.nodes.Element element49 = xmlTreeBuilder0.insert(startTag48);
        org.jsoup.nodes.Attributes attributes50 = startTag48.attributes;
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
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(attributes50);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType10 = doctype0.type;
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
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag(" a");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        boolean boolean17 = tag16.isStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        boolean boolean27 = startTag26.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</hi!>" + "'", str14, "</hi!>");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.selfClosing;
        org.jsoup.nodes.Attributes attributes10 = endTag1.getAttributes();
        boolean boolean11 = endTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendTagName('a');
        java.lang.String str4 = startTag1.tagName;
        startTag1.tagName = "";
        java.lang.String str7 = startTag1.tokenType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        boolean boolean3 = character1.isComment();
        java.lang.String str4 = character1.toString();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.toString();
        java.lang.String str7 = character1.getData();
        java.lang.String str8 = character1.getData();
        java.lang.String str9 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.String str21 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "</<4>>" + "'", str21, "</<4>>");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        java.lang.StringBuilder stringBuilder27 = comment20.data;
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
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        tag4.selfClosing = false;
        tag4.appendTagName("hi!a");
        tag4.tagName = "";
        java.lang.String str11 = tag4.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        java.lang.String str53 = startTag44.tagName;
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("", attributes33);
        startTag34.selfClosing = false;
        startTag34.appendTagName("</hi!>");
        startTag34.newAttribute();
        org.jsoup.nodes.Attributes attributes40 = startTag34.getAttributes();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag("hi!", attributes40);
        startTag41.selfClosing = false;
        startTag41.appendAttributeValue("EndTag");
        startTag41.appendAttributeName('#');
        java.lang.String str48 = startTag41.tokenType();
        org.jsoup.parser.Token.TokenType tokenType49 = startTag41.type;
        boolean boolean50 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag41);
        java.lang.String str51 = startTag41.toString();
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
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "StartTag" + "'", str48, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<hi!>" + "'", str51, "<hi!>");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        startTag26.appendTagName('4');
        startTag26.appendAttributeValue('#');
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
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str18 = endTag17.toString();
        java.lang.String str19 = endTag17.toString();
        boolean boolean20 = endTag17.isDoctype();
        java.lang.String str21 = endTag17.tagName;
        endTag17.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType24 = endTag17.type;
        startTag9.type = tokenType24;
        java.lang.String str26 = startTag9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype27 = startTag9.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "</hi!>" + "'", str18, "</hi!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "</hi!>" + "'", str19, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<4>" + "'", str26, "<4>");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        java.lang.String str6 = startTag0.tagName;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag0.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        tag33.appendAttributeValue("EOF");
        boolean boolean38 = tag33.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        boolean boolean4 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        org.jsoup.parser.Token.EOF eOF8 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType9 = eOF8.type;
        org.jsoup.parser.Token.TokenType tokenType10 = eOF8.type;
        startTag0.type = tokenType10;
        org.jsoup.parser.Token.TokenType tokenType12 = startTag0.type;
        boolean boolean13 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName('4');
        org.jsoup.nodes.Element element21 = xmlTreeBuilder9.insert(startTag18);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder9.initialiseParse("<4>", "</hi!>", parseErrorList24);
        org.jsoup.parser.Token.Character character27 = new org.jsoup.parser.Token.Character("<!---->");
        xmlTreeBuilder9.insert(character27);
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder30 = comment29.data;
        java.lang.String str31 = comment29.getData();
        java.lang.StringBuilder stringBuilder32 = comment29.data;
        java.lang.String str33 = comment29.toString();
        java.lang.String str34 = comment29.tokenType();
        java.lang.StringBuilder stringBuilder35 = comment29.data;
        xmlTreeBuilder9.insert(comment29);
        xmlTreeBuilder0.insert(comment29);
        org.jsoup.parser.Token.Doctype doctype38 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str39 = doctype38.tokenType();
        org.jsoup.parser.Token.Doctype doctype40 = doctype38.asDoctype();
        boolean boolean41 = doctype38.isForceQuirks();
        java.lang.String str42 = doctype38.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Comment" + "'", str34, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Doctype" + "'", str39, "Doctype");
        org.junit.Assert.assertNotNull(doctype40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        boolean boolean22 = tag2.selfClosing;
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        doctype0.forceQuirks = false;
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
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype5.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag18 = startTag2.asEndTag();
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
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes9 = startTag2.getAttributes();
        startTag2.tagName = "EOF";
        startTag2.appendAttributeName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        boolean boolean5 = endTag1.isComment();
        endTag1.appendTagName("<hi!  =\"#\">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        startTag7.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType10 = null;
        startTag7.type = tokenType10;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        org.jsoup.parser.Token.Tag tag52 = startTag50.name("hi!");
        startTag50.finaliseTag();
        startTag50.appendAttributeValue("</hi!>");
        org.jsoup.nodes.Element element56 = xmlTreeBuilder0.insert(startTag50);
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag59 = startTag57.name("hi!");
        startTag57.appendAttributeName(' ');
        boolean boolean62 = startTag57.isComment();
        boolean boolean63 = startTag57.selfClosing;
        boolean boolean64 = startTag57.isComment();
        java.lang.String str65 = startTag57.tagName;
        org.jsoup.nodes.Element element66 = xmlTreeBuilder0.insert(startTag57);
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
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(element66);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName('a');
        java.lang.String str3 = startTag0.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        java.lang.Class<?> wildcardClass16 = startTag10.getClass();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        org.jsoup.nodes.Attributes attributes19 = startTag11.attributes;
        startTag11.appendAttributeValue("</hi!<4>>");
        startTag11.tagName = "<</hi!>>";
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        tag15.appendTagName("</Doctype4>");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<4>" + "'", str13, "<4>");
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        endTag1.appendAttributeName('a');
        java.lang.String str9 = endTag1.tokenType();
        endTag1.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EndTag" + "'", str9, "EndTag");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.parser.Token.Tag tag6 = tag2.name("");
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
        tag2.attributes = attributes35;
        tag2.newAttribute();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        startTag7.appendAttributeName("<<Doctype>>");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi! >>" + "'", str11, "<</hi! >>");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType2 = eOF0.type;
        boolean boolean3 = eOF0.isDoctype();
        boolean boolean4 = eOF0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = eOF0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        java.lang.String str21 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder22 = doctype0.publicIdentifier;
        boolean boolean23 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder24 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<4> ");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.tokenType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Comment" + "'", str3, "Comment");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        boolean boolean4 = startTag0.isEndTag();
        java.lang.String str5 = startTag0.tagName;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BeforeAttributeName;
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
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype46 = character40.asDoctype();
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
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.lang.String str10 = doctype0.getName();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder0.initialiseParse("<</hi!>>", "", parseErrorList13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendAttributeValue('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag15);
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
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        java.lang.String str65 = endTag55.name();
        org.jsoup.parser.Token.EndTag endTag66 = endTag55.asEndTag();
        org.jsoup.parser.Token.Tag tag68 = endTag55.name("Character");
        boolean boolean69 = endTag55.isStartTag();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "<4>" + "'", str65, "<4>");
        org.junit.Assert.assertNotNull(endTag66);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        endTag1.tagName = "hi!";
        endTag1.appendTagName("hi!a");
        endTag1.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        startTag30.appendAttributeValue("</hi!>4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character34 = startTag30.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<Comment>");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("Character");
        boolean boolean2 = character1.isStartTag();
        boolean boolean3 = character1.isEndTag();
        java.lang.String str4 = character1.getData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Character" + "'", str4, "Character");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        boolean boolean2 = endTag1.selfClosing;
        boolean boolean3 = endTag1.isCharacter();
        boolean boolean4 = endTag1.isCharacter();
        org.jsoup.parser.Token.Tag tag6 = endTag1.name("<</<4>Doctype>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.nodes.Attributes attributes6 = endTag1.attributes;
        endTag1.tagName = "</hi!>";
        boolean boolean9 = endTag1.isDoctype();
        endTag1.appendAttributeName(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        endTag1.tagName = "hi!";
        endTag1.appendTagName("hi!a");
        java.lang.String str9 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!hi!a>" + "'", str9, "</hi!hi!a>");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        org.jsoup.parser.Token.TokenType tokenType27 = startTag26.type;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</hi!>" + "'", str14, "</hi!>");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("<<hi!>>");
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        endTag1.selfClosing = true;
        endTag1.appendAttributeName("4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("Comment");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.appendAttributeName("<EndTag>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        boolean boolean14 = startTag9.isSelfClosing();
        java.lang.String str15 = startTag9.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<4>" + "'", str15, "<4>");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        startTag1.appendAttributeName(' ');
        java.lang.String str6 = startTag1.tokenType();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("", attributes9);
        startTag10.selfClosing = false;
        startTag10.newAttribute();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        org.jsoup.nodes.Attributes attributes18 = tag17.attributes;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes18);
        startTag10.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<!---->", attributes18);
        startTag1.attributes = attributes18;
        startTag1.appendTagName('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag5 = endTag1.asEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("</Doctype4>");
        boolean boolean8 = endTag1.isStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertNotNull(endTag5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        java.lang.String str37 = startTag33.tokenType();
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "StartTag" + "'", str37, "StartTag");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.toString();
        java.lang.String str5 = character1.getData();
        org.jsoup.parser.Token.Character character6 = character1.asCharacter();
        java.lang.String str7 = character6.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
    }
}

