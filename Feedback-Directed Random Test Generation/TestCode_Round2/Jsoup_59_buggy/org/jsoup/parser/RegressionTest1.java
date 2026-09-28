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
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.jsoup.parser.Token token9 = comment0.reset();
        boolean boolean10 = comment0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag3.type = tokenType8;
        org.jsoup.nodes.Attributes attributes10 = startTag3.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = startTag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        startTag7.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes11 = startTag7.attributes;
        java.lang.Class<?> wildcardClass12 = startTag7.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        doctype10.pubSysKey = "";
        java.lang.String str13 = doctype10.pubSysKey;
        doctype10.forceQuirks = false;
        boolean boolean16 = doctype10.isCharacter();
        java.lang.String str17 = doctype10.pubSysKey;
        boolean boolean18 = doctype10.isForceQuirks();
        boolean boolean19 = doctype10.isEOF();
        org.jsoup.parser.Token token20 = doctype10.reset();
        org.jsoup.parser.Token.TokenType tokenType21 = token20.type;
        tag9.type = tokenType21;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        boolean boolean11 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag12 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        java.lang.String str11 = comment0.getData();
        comment0.bogus = false;
        java.lang.String str14 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token token7 = startTag3.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = startTag3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeValue("hi!</hi!>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("hi!#");
        org.jsoup.parser.Token token7 = character0.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        java.lang.String str12 = endTag0.toString();
        endTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag7 = tag6.asStartTag();
        java.lang.String str8 = tag6.tokenType();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        boolean boolean10 = startTag6.selfClosing;
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = endTag11.name("hi!");
        tag21.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag24 = tag21.asEndTag();
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag();
        endTag25.finaliseTag();
        boolean boolean27 = endTag25.isCharacter();
        int[] intArray29 = new int[] { (short) 1 };
        endTag25.appendAttributeValue(intArray29);
        endTag24.appendAttributeValue(intArray29);
        startTag6.appendAttributeValue(intArray29);
        java.lang.String str33 = startTag6.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(endTag24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<EOF>" + "'", str33, "<EOF>");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        endTag0.normalName = "Character";
        org.jsoup.parser.Token.Tag tag11 = endTag0.name("<!---->");
        java.lang.String str12 = endTag0.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character13 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        endTag0.tagName = "eof";
        java.lang.String str17 = endTag0.name();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        startTag22.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        endTag18.attributes = attributes26;
        endTag0.attributes = attributes26;
        org.jsoup.parser.Token.TokenType tokenType29 = endTag0.type;
        endTag0.appendTagName(' ');
        boolean boolean32 = endTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token token7 = startTag3.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = token7.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = token6.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        boolean boolean10 = startTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.finaliseTag();
        endTag12.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.parser.Token.Tag tag28 = startTag26.reset();
        startTag26.newAttribute();
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        endTag22.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag32 = startTag19.nameAttr("eof", attributes30);
        endTag12.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag34 = startTag0.nameAttr("</hi!>", attributes30);
        org.jsoup.parser.Token.Tag tag36 = startTag34.name("<starttag>");
        java.lang.String str37 = startTag34.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<<starttag>>" + "'", str37, "<<starttag>>");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes3 = endTag0.getAttributes();
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        endTag0.tagName = "eof";
        java.lang.String str17 = endTag0.name();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        startTag22.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        endTag18.attributes = attributes26;
        endTag0.attributes = attributes26;
        org.jsoup.parser.Token.TokenType tokenType29 = endTag0.type;
        endTag0.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes32 = endTag0.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName(' ');
        endTag0.appendAttributeName('a');
        boolean boolean6 = endTag0.selfClosing;
        endTag0.appendTagName('4');
        java.lang.String str9 = endTag0.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.tagName;
        endTag0.appendAttributeValue("#");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.pubSysKey = "</hi!#>";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.appendAttributeName("");
        // The following exception was thrown during execution in test generation
        try {
            endTag0.finaliseTag();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = token4.tokenType();
        boolean boolean6 = token4.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Character" + "'", str5, "Character");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        java.lang.String str9 = endTag0.tagName;
        endTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        boolean boolean10 = comment0.bogus;
        org.jsoup.parser.Token token11 = comment0.reset();
        org.jsoup.parser.Token token12 = comment0.reset();
        java.lang.String str13 = comment0.getData();
        java.lang.StringBuilder stringBuilder14 = comment0.data;
        org.jsoup.parser.Token.Comment comment15 = comment0.asComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag16 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(comment15);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("<starttag>");
        org.jsoup.parser.Token.Character character10 = character8.data("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag11 = character8.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        startTag7.selfClosing = false;
        boolean boolean13 = startTag7.isEndTag();
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        boolean boolean15 = endTag14.isSelfClosing();
        endTag14.normalName = "";
        endTag14.finaliseTag();
        boolean boolean19 = endTag14.selfClosing;
        endTag14.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = startTag22.nameAttr("EOF", attributes27);
        java.lang.String str29 = startTag22.normalName();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = startTag30.nameAttr("EOF", attributes32);
        boolean boolean34 = startTag33.isDoctype();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag33.nameAttr("", attributes36);
        org.jsoup.parser.Token.TokenType tokenType38 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag33.type = tokenType38;
        startTag22.type = tokenType38;
        endTag14.type = tokenType38;
        startTag7.type = tokenType38;
        boolean boolean43 = startTag7.isDoctype();
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes47 = null;
        org.jsoup.parser.Token.StartTag startTag48 = startTag45.nameAttr("EOF", attributes47);
        boolean boolean49 = startTag48.isDoctype();
        org.jsoup.parser.Token.Tag tag50 = startTag48.reset();
        org.jsoup.parser.Token.StartTag startTag51 = tag50.asStartTag();
        org.jsoup.parser.Token.EndTag endTag53 = new org.jsoup.parser.Token.EndTag();
        endTag53.finaliseTag();
        endTag53.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes59 = null;
        org.jsoup.parser.Token.StartTag startTag60 = startTag57.nameAttr("EOF", attributes59);
        boolean boolean61 = startTag60.isDoctype();
        org.jsoup.parser.Token.EndTag endTag63 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes66 = null;
        org.jsoup.parser.Token.StartTag startTag67 = startTag64.nameAttr("EOF", attributes66);
        boolean boolean68 = startTag67.isDoctype();
        org.jsoup.parser.Token.Tag tag69 = startTag67.reset();
        startTag67.newAttribute();
        org.jsoup.nodes.Attributes attributes71 = startTag67.attributes;
        endTag63.attributes = attributes71;
        org.jsoup.parser.Token.StartTag startTag73 = startTag60.nameAttr("eof", attributes71);
        endTag53.attributes = attributes71;
        org.jsoup.parser.Token.StartTag startTag75 = startTag51.nameAttr("<!---->", attributes71);
        org.jsoup.parser.Token.StartTag startTag76 = startTag7.nameAttr("Doctype", attributes71);
        org.jsoup.parser.Token.Tag tag77 = startTag76.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "eof" + "'", str29, "eof");
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(startTag67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertNotNull(startTag73);
        org.junit.Assert.assertNotNull(startTag75);
        org.junit.Assert.assertNotNull(startTag76);
        org.junit.Assert.assertNotNull(tag77);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.parser.Token.StartTag startTag8 = startTag5.nameAttr("EOF", attributes7);
        boolean boolean9 = startTag8.isDoctype();
        org.jsoup.parser.Token.Tag tag10 = startTag8.reset();
        org.jsoup.parser.Token.StartTag startTag11 = tag10.asStartTag();
        org.jsoup.parser.Token.Tag tag12 = tag10.reset();
        org.jsoup.nodes.Attributes attributes13 = tag10.attributes;
        org.jsoup.parser.Token.StartTag startTag14 = startTag3.nameAttr("starttag", attributes13);
        org.jsoup.parser.Token.TokenType tokenType15 = startTag14.type;
        startTag14.appendTagName('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.finaliseTag();
        boolean boolean16 = endTag14.isCharacter();
        int[] intArray18 = new int[] { (short) 1 };
        endTag14.appendAttributeValue(intArray18);
        endTag13.appendAttributeValue(intArray18);
        endTag13.appendTagName('4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1 });
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        boolean boolean14 = endTag0.isEndTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        endTag0.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        endTag15.appendAttributeValue(' ');
        endTag15.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(' ');
        char[] charArray25 = new char[] { ' ', ' ' };
        endTag20.appendAttributeValue(charArray25);
        endTag20.selfClosing = true;
        org.jsoup.parser.Token.Tag tag30 = endTag20.name("hi!");
        endTag20.appendAttributeName('a');
        int[] intArray37 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag20.appendAttributeValue(intArray37);
        endTag15.appendAttributeValue(intArray37);
        endTag0.appendAttributeValue(intArray37);
        endTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        endTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag11 = tag9.name("<!---->");
        org.jsoup.parser.Token.EndTag endTag12 = tag11.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character13 = endTag12.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(endTag12);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes9 = startTag0.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        java.lang.String str8 = tag7.tagName;
        tag7.appendTagName('4');
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes8 = endTag0.getAttributes();
        endTag0.tagName = "<EOF>";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag10.nameAttr("", attributes13);
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag10.type = tokenType15;
        endTag4.type = tokenType15;
        comment0.type = tokenType15;
        comment0.bogus = false;
        comment0.bogus = false;
        java.lang.String str23 = comment0.getData();
        boolean boolean24 = comment0.bogus;
        java.lang.String str25 = comment0.getData();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        org.jsoup.parser.Token.StartTag startTag32 = tag31.asStartTag();
        startTag32.selfClosing = false;
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.Character;
        startTag32.type = tokenType35;
        comment0.type = tokenType35;
        java.lang.Class<?> wildcardClass38 = tokenType35.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getName();
        doctype0.pubSysKey = "<!---->4";
        java.lang.StringBuilder stringBuilder14 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType9 = endTag0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.pubSysKey;
        java.lang.String str9 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag3.nameAttr("EOF", attributes5);
        boolean boolean7 = startTag6.isDoctype();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag6.nameAttr("", attributes9);
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag6.type = tokenType11;
        endTag0.type = tokenType11;
        boolean boolean14 = endTag0.isEOF();
        endTag0.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        boolean boolean14 = tag10.isDoctype();
        java.lang.String str15 = tag10.tagName;
        java.lang.String str16 = tag10.tokenType();
        tag10.finaliseTag();
        tag10.appendAttributeValue("<eof>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EndTag" + "'", str16, "EndTag");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        endTag14.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag19.selfClosing = true;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("hi!");
        endTag19.appendAttributeName('a');
        int[] intArray36 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag19.appendAttributeValue(intArray36);
        endTag14.appendAttributeValue(intArray36);
        endTag0.appendAttributeValue(intArray36);
        org.jsoup.parser.Token token40 = endTag0.reset();
        java.lang.String str41 = endTag0.normalName();
        boolean boolean42 = endTag0.isSelfClosing();
        endTag0.appendAttributeValue("</hi!#>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token token8 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        boolean boolean9 = startTag6.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = startTag6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        doctype0.pubSysKey = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        tag6.finaliseTag();
        boolean boolean9 = tag6.isEOF();
        org.jsoup.parser.Token.TokenType tokenType10 = tag6.type;
        org.jsoup.parser.Token token11 = tag6.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag3.toString();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = startTag3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<EOF>" + "'", str4, "<EOF>");
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token token7 = character0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = token7.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType8;
        boolean boolean10 = doctype0.forceQuirks;
        boolean boolean11 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        java.lang.String str13 = doctype0.getName();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.finaliseTag();
        endTag8.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        startTag22.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        endTag18.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = startTag15.nameAttr("eof", attributes26);
        endTag8.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag30 = startTag6.nameAttr("<!---->", attributes26);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag32.nameAttr("EOF", attributes34);
        boolean boolean36 = startTag35.isDoctype();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag39.nameAttr("EOF", attributes41);
        boolean boolean43 = startTag42.isDoctype();
        org.jsoup.parser.Token.Tag tag44 = startTag42.reset();
        startTag42.newAttribute();
        org.jsoup.nodes.Attributes attributes46 = startTag42.attributes;
        endTag38.attributes = attributes46;
        org.jsoup.parser.Token.StartTag startTag48 = startTag35.nameAttr("eof", attributes46);
        org.jsoup.parser.Token.StartTag startTag49 = startTag6.nameAttr("hi!", attributes46);
        org.jsoup.parser.Token.Doctype doctype50 = new org.jsoup.parser.Token.Doctype();
        doctype50.pubSysKey = "";
        java.lang.StringBuilder stringBuilder53 = doctype50.name;
        java.lang.String str54 = doctype50.getName();
        java.lang.StringBuilder stringBuilder55 = doctype50.systemIdentifier;
        java.lang.StringBuilder stringBuilder56 = doctype50.publicIdentifier;
        java.lang.StringBuilder stringBuilder57 = doctype50.publicIdentifier;
        org.jsoup.parser.Token token58 = doctype50.reset();
        doctype50.forceQuirks = false;
        java.lang.String str61 = doctype50.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType62 = doctype50.type;
        startTag49.type = tokenType62;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag64 = startTag49.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertNotNull(token58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + tokenType62 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType62.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token token8 = endTag0.reset();
        endTag0.tagName = "";
        java.lang.Class<?> wildcardClass11 = endTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.Comment;
        endTag0.type = tokenType15;
        endTag0.appendAttributeName("</hi!#>");
        endTag0.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token token7 = startTag3.reset();
        boolean boolean8 = startTag3.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag8.nameAttr("EOF", attributes10);
        boolean boolean12 = startTag11.isDoctype();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag11.nameAttr("", attributes14);
        org.jsoup.parser.Token.TokenType tokenType16 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag11.type = tokenType16;
        startTag0.type = tokenType16;
        org.jsoup.parser.Token.Tag tag19 = startTag0.reset();
        startTag0.appendAttributeValue("StartTag");
        org.jsoup.nodes.Attributes attributes22 = startTag0.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isStartTag();
        java.lang.String str10 = startTag6.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        boolean boolean7 = startTag6.isStartTag();
        startTag6.finaliseTag();
        java.lang.String str9 = startTag6.name();
        java.lang.String str10 = startTag6.toString();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.Tag tag17 = startTag15.reset();
        org.jsoup.parser.Token.StartTag startTag18 = tag17.asStartTag();
        org.jsoup.parser.Token.Tag tag19 = tag17.reset();
        org.jsoup.nodes.Attributes attributes20 = tag17.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = startTag6.nameAttr("", attributes20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = startTag6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<EOF>" + "'", str10, "<EOF>");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        java.lang.String str12 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.String str3 = comment0.toString();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character4 = character2.data("Doctype");
        java.lang.String str5 = character4.toString();
        org.jsoup.parser.Token.Character character7 = character4.data("hi!</hi!>");
        org.jsoup.parser.Token token8 = character7.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.tagName = "<!---->";
        java.lang.String str7 = startTag3.tagName;
        java.lang.String str8 = startTag3.tokenType();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("</hi!>");
        java.lang.String str7 = character0.toString();
        java.lang.String str8 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        org.jsoup.parser.Token.Tag tag8 = startTag3.reset();
        tag8.normalName = "EndTag";
        tag8.appendAttributeValue("<eof>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        java.lang.String str9 = startTag7.tagName;
        boolean boolean10 = startTag7.isEndTag();
        org.jsoup.parser.Token.Tag tag11 = startTag7.reset();
        startTag7.appendAttributeName("Character");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = startTag7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag6.reset();
        startTag6.appendTagName('a');
        startTag6.appendTagName("<starttag>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.finaliseTag();
        endTag5.appendAttributeName('#');
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        endTag9.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        char[] charArray19 = new char[] { ' ', ' ' };
        endTag14.appendAttributeValue(charArray19);
        endTag14.selfClosing = true;
        org.jsoup.parser.Token.Tag tag24 = endTag14.name("hi!");
        endTag14.appendAttributeName('a');
        int[] intArray31 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag14.appendAttributeValue(intArray31);
        endTag9.appendAttributeValue(intArray31);
        endTag5.appendAttributeValue(intArray31);
        endTag0.appendAttributeValue(intArray31);
        endTag0.appendAttributeName('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getName();
        org.jsoup.parser.Token token11 = doctype0.reset();
        doctype0.pubSysKey = "Doctype";
        java.lang.String str14 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token15 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(token15);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        boolean boolean10 = tag9.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        comment0.bogus = false;
        java.lang.Class<?> wildcardClass5 = comment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.tagName = "<!---->";
        java.lang.String str7 = startTag3.tagName;
        boolean boolean8 = startTag3.isEOF();
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        endTag9.selfClosing = true;
        org.jsoup.parser.Token.Tag tag19 = endTag9.name("hi!");
        tag19.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag22 = tag19.asEndTag();
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        endTag23.finaliseTag();
        boolean boolean25 = endTag23.isCharacter();
        int[] intArray27 = new int[] { (short) 1 };
        endTag23.appendAttributeValue(intArray27);
        endTag22.appendAttributeValue(intArray27);
        startTag3.appendAttributeValue(intArray27);
        startTag3.appendAttributeName("eof");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(endTag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1 });
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        tag10.normalName = "</hi!>";
        boolean boolean16 = tag10.isCharacter();
        tag10.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        org.jsoup.parser.Token.Character character3 = character0.data("starttag");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character3);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        boolean boolean14 = endTag0.isEOF();
        endTag0.appendAttributeValue("EOF");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag17 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        boolean boolean2 = token1.isCharacter();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        tag8.finaliseTag();
        java.lang.String str10 = tag8.tagName;
        java.lang.String str11 = tag8.normalName();
        org.jsoup.parser.Token.TokenType tokenType12 = tag8.type;
        org.jsoup.nodes.Attributes attributes13 = tag8.attributes;
        java.lang.String str14 = tag8.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        endTag14.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag19.selfClosing = true;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("hi!");
        endTag19.appendAttributeName('a');
        int[] intArray36 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag19.appendAttributeValue(intArray36);
        endTag14.appendAttributeValue(intArray36);
        endTag0.appendAttributeValue(intArray36);
        org.jsoup.parser.Token token40 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag42 = endTag0.name("Comment");
        boolean boolean43 = tag42.selfClosing;
        tag42.appendAttributeValue(' ');
        tag42.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character48 = tag42.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.tagName;
        startTag7.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag13 = startTag7.reset();
        tag13.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag16.nameAttr("EOF", attributes21);
        org.jsoup.parser.Token.Tag tag23 = startTag16.reset();
        boolean boolean24 = startTag16.isSelfClosing();
        org.jsoup.parser.Token.Tag tag25 = startTag16.reset();
        boolean boolean26 = startTag16.isComment();
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.finaliseTag();
        endTag28.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag32.nameAttr("EOF", attributes34);
        boolean boolean36 = startTag35.isDoctype();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag39.nameAttr("EOF", attributes41);
        boolean boolean43 = startTag42.isDoctype();
        org.jsoup.parser.Token.Tag tag44 = startTag42.reset();
        startTag42.newAttribute();
        org.jsoup.nodes.Attributes attributes46 = startTag42.attributes;
        endTag38.attributes = attributes46;
        org.jsoup.parser.Token.StartTag startTag48 = startTag35.nameAttr("eof", attributes46);
        endTag28.attributes = attributes46;
        org.jsoup.parser.Token.StartTag startTag50 = startTag16.nameAttr("</hi!>", attributes46);
        tag13.attributes = attributes46;
        tag13.tagName = " ";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(startTag50);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.Class<?> wildcardClass10 = token9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.String str9 = doctype0.getPubSysKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendTagName("EndTag");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("EndTag");
        endTag0.appendTagName("EOF");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        boolean boolean14 = tag10.isDoctype();
        java.lang.String str15 = tag10.normalName;
        tag10.appendAttributeName("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token.Character character8 = character0.asCharacter();
        org.jsoup.parser.Token token9 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        int[] intArray17 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag0.appendAttributeValue(intArray17);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.finaliseTag();
        boolean boolean21 = endTag19.isCharacter();
        int[] intArray23 = new int[] { (short) 1 };
        endTag19.appendAttributeValue(intArray23);
        endTag0.appendAttributeValue(intArray23);
        endTag0.appendTagName("EndTag");
        endTag0.appendAttributeValue('a');
        endTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1 });
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName(' ');
        endTag0.appendAttributeName('a');
        boolean boolean6 = endTag0.selfClosing;
        endTag0.appendTagName('4');
        java.lang.String str9 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = character0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        tag8.finaliseTag();
        java.lang.String str10 = tag8.tagName;
        java.lang.String str11 = tag8.normalName();
        tag8.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        boolean boolean17 = startTag16.isDoctype();
        org.jsoup.parser.Token.Tag tag18 = startTag16.reset();
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag22 = endTag19.reset();
        endTag19.appendAttributeValue(' ');
        endTag19.newAttribute();
        int[] intArray29 = new int[] { 1, 10, 10 };
        endTag19.appendAttributeValue(intArray29);
        org.jsoup.parser.Token.Tag tag32 = endTag19.name("StartTag");
        org.jsoup.parser.Token.TokenType tokenType33 = tag32.type;
        tag18.type = tokenType33;
        tag8.type = tokenType33;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        tag10.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        boolean boolean10 = comment0.bogus;
        org.jsoup.parser.Token token11 = comment0.reset();
        org.jsoup.parser.Token token12 = comment0.reset();
        java.lang.String str13 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder10);
        org.jsoup.parser.Token.reset(stringBuilder10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = startTag1.nameAttr("EOF", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        org.jsoup.parser.Token.Tag tag6 = startTag4.reset();
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        endTag0.attributes = attributes8;
        endTag0.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        endTag0.appendAttributeName("EOF");
        endTag0.appendTagName('#');
        boolean boolean18 = endTag0.isSelfClosing();
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        doctype0.pubSysKey = " ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.finaliseTag();
        boolean boolean16 = endTag14.isCharacter();
        int[] intArray18 = new int[] { (short) 1 };
        endTag14.appendAttributeValue(intArray18);
        endTag13.appendAttributeValue(intArray18);
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag();
        endTag21.appendAttributeValue(' ');
        char[] charArray26 = new char[] { ' ', ' ' };
        endTag21.appendAttributeValue(charArray26);
        endTag21.selfClosing = true;
        org.jsoup.parser.Token.Tag tag31 = endTag21.name("hi!");
        boolean boolean32 = endTag21.isStartTag();
        endTag21.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag35 = new org.jsoup.parser.Token.EndTag();
        endTag35.appendAttributeValue(' ');
        endTag35.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag40 = new org.jsoup.parser.Token.EndTag();
        endTag40.appendAttributeValue(' ');
        char[] charArray45 = new char[] { ' ', ' ' };
        endTag40.appendAttributeValue(charArray45);
        endTag40.selfClosing = true;
        org.jsoup.parser.Token.Tag tag50 = endTag40.name("hi!");
        endTag40.appendAttributeName('a');
        int[] intArray57 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag40.appendAttributeValue(intArray57);
        endTag35.appendAttributeValue(intArray57);
        endTag21.appendAttributeValue(intArray57);
        org.jsoup.parser.Token token61 = endTag21.reset();
        java.lang.String str62 = endTag21.normalName();
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes65 = null;
        org.jsoup.parser.Token.StartTag startTag66 = startTag63.nameAttr("EOF", attributes65);
        boolean boolean67 = startTag66.isDoctype();
        org.jsoup.nodes.Attributes attributes69 = null;
        org.jsoup.parser.Token.StartTag startTag70 = startTag66.nameAttr("", attributes69);
        org.jsoup.parser.Token.Tag tag71 = startTag70.reset();
        org.jsoup.parser.Token.EndTag endTag72 = new org.jsoup.parser.Token.EndTag();
        boolean boolean73 = endTag72.isSelfClosing();
        endTag72.normalName = "";
        java.lang.String str76 = endTag72.normalName();
        char[] charArray79 = new char[] { 'a', 'a' };
        endTag72.appendAttributeValue(charArray79);
        tag71.appendAttributeValue(charArray79);
        endTag21.appendAttributeValue(charArray79);
        endTag13.appendAttributeValue(charArray79);
        boolean boolean84 = endTag13.isComment();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1 });
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(startTag70);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.finaliseTag();
        endTag8.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        startTag22.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        endTag18.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = startTag15.nameAttr("eof", attributes26);
        endTag8.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag30 = startTag6.nameAttr("<!---->", attributes26);
        java.lang.String str31 = startTag30.tokenType();
        startTag30.appendAttributeValue("Comment");
        org.jsoup.nodes.Attributes attributes34 = startTag30.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype35 = startTag30.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertNotNull(attributes34);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType8;
        boolean boolean10 = doctype0.forceQuirks;
        boolean boolean11 = doctype0.isStartTag();
        boolean boolean12 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        boolean boolean7 = startTag3.isComment();
        startTag3.normalName = "<#>";
        startTag3.appendTagName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str12 = doctype0.pubSysKey;
        org.jsoup.parser.Token.EOF eOF13 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType14 = eOF13.type;
        doctype0.type = tokenType14;
        org.jsoup.parser.Token token16 = doctype0.reset();
        org.jsoup.parser.Token token17 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(token17);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        java.lang.String str5 = startTag3.toString();
        java.lang.String str6 = startTag3.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = startTag3.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<EOF>" + "'", str5, "<EOF>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "eof" + "'", str6, "eof");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        endTag14.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag19.selfClosing = true;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("hi!");
        endTag19.appendAttributeName('a');
        int[] intArray36 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag19.appendAttributeValue(intArray36);
        endTag14.appendAttributeValue(intArray36);
        endTag0.appendAttributeValue(intArray36);
        org.jsoup.parser.Token token40 = endTag0.reset();
        endTag0.normalName = "<!---->4";
        org.jsoup.nodes.Attributes attributes43 = endTag0.attributes;
        endTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertNull(attributes43);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        startTag3.tagName = "EndTag";
        startTag3.normalName = "hi!";
        java.lang.String str14 = startTag3.normalName;
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag3.nameAttr("Character", attributes16);
        startTag17.appendAttributeName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(startTag17);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getName();
        doctype0.pubSysKey = "<!---->4";
        org.jsoup.parser.Token.TokenType tokenType14 = doctype0.type;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        startTag7.selfClosing = false;
        java.lang.String str13 = startTag7.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = startTag7.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag10.nameAttr("EOF", attributes12);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag15.nameAttr("EOF", attributes17);
        boolean boolean19 = startTag18.isDoctype();
        org.jsoup.parser.Token.Tag tag20 = startTag18.reset();
        org.jsoup.parser.Token.StartTag startTag21 = tag20.asStartTag();
        org.jsoup.parser.Token.Tag tag22 = tag20.reset();
        org.jsoup.nodes.Attributes attributes23 = tag20.attributes;
        org.jsoup.parser.Token.StartTag startTag24 = startTag13.nameAttr("starttag", attributes23);
        org.jsoup.parser.Token.StartTag startTag25 = startTag3.nameAttr("", attributes23);
        org.jsoup.nodes.Attributes attributes26 = startTag3.getAttributes();
        java.lang.Class<?> wildcardClass27 = attributes26.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        org.jsoup.parser.Token token9 = startTag7.reset();
        org.jsoup.nodes.Attributes attributes10 = startTag7.attributes;
        org.jsoup.nodes.Attributes attributes11 = startTag7.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = startTag7.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        java.lang.String str9 = doctype8.getSystemIdentifier();
        java.lang.String str10 = doctype8.getName();
        boolean boolean11 = doctype8.isStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        java.lang.String str10 = startTag0.toString();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        startTag22.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        endTag18.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = startTag15.nameAttr("eof", attributes26);
        org.jsoup.parser.Token.StartTag startTag29 = startTag0.nameAttr("<hi!>", attributes26);
        org.jsoup.parser.Token.Tag tag30 = startTag29.reset();
        org.jsoup.parser.Token.Tag tag32 = tag30.name("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character33 = tag32.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag32);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        doctype0.pubSysKey = "hi!</hi!>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        java.lang.String str10 = tag9.tagName;
        java.lang.String str11 = tag9.tokenType();
        boolean boolean12 = tag9.isComment();
        boolean boolean13 = tag9.selfClosing;
        tag9.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EndTag" + "'", str11, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.appendAttributeName('a');
        java.lang.String str10 = startTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        java.lang.String str8 = comment0.toString();
        java.lang.String str9 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        endTag0.appendTagName('4');
        org.jsoup.parser.Token.Tag tag16 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character17 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag6.reset();
        startTag6.appendTagName('a');
        java.lang.String str13 = startTag6.normalName;
        startTag6.appendAttributeName('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        boolean boolean3 = character0.isCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        startTag3.tagName = "EndTag";
        startTag3.normalName = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = startTag3.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        comment0.bogus = false;
        org.jsoup.parser.Token.Comment comment5 = comment0.asComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(comment5);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.pubSysKey;
        doctype0.pubSysKey = "#";
        java.lang.String str12 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#" + "'", str12, "#");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.finaliseTag();
        endTag8.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        startTag22.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        endTag18.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = startTag15.nameAttr("eof", attributes26);
        endTag8.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag30 = startTag6.nameAttr("<!---->", attributes26);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag32.nameAttr("EOF", attributes34);
        boolean boolean36 = startTag35.isDoctype();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag39.nameAttr("EOF", attributes41);
        boolean boolean43 = startTag42.isDoctype();
        org.jsoup.parser.Token.Tag tag44 = startTag42.reset();
        startTag42.newAttribute();
        org.jsoup.nodes.Attributes attributes46 = startTag42.attributes;
        endTag38.attributes = attributes46;
        org.jsoup.parser.Token.StartTag startTag48 = startTag35.nameAttr("eof", attributes46);
        org.jsoup.parser.Token.StartTag startTag49 = startTag6.nameAttr("hi!", attributes46);
        java.lang.String str50 = startTag49.normalName();
        boolean boolean51 = startTag49.isDoctype();
        java.lang.String str52 = startTag49.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        endTag0.newAttribute();
        boolean boolean8 = endTag0.isDoctype();
        java.lang.String str9 = endTag0.toString();
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</ >" + "'", str9, "</ >");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        org.jsoup.parser.Token token8 = endTag0.reset();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag9.nameAttr("EOF", attributes11);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag9.nameAttr("EOF", attributes14);
        java.lang.String str16 = startTag9.normalName();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag17.nameAttr("EOF", attributes19);
        boolean boolean21 = startTag20.isDoctype();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag20.nameAttr("", attributes23);
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag20.type = tokenType25;
        startTag9.type = tokenType25;
        org.jsoup.parser.Token.Tag tag28 = startTag9.reset();
        org.jsoup.nodes.Attributes attributes29 = startTag9.attributes;
        org.jsoup.nodes.Attributes attributes30 = startTag9.getAttributes();
        endTag0.attributes = attributes30;
        java.lang.String str32 = endTag0.tagName;
        char[] charArray33 = null;
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(charArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "eof" + "'", str16, "eof");
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token token8 = comment7.reset();
        java.lang.StringBuilder stringBuilder9 = comment7.data;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendTagName("</ >");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str12 = doctype0.pubSysKey;
        boolean boolean13 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        java.lang.String str12 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        org.jsoup.parser.Token token9 = startTag7.reset();
        boolean boolean10 = startTag7.selfClosing;
        boolean boolean11 = startTag7.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.tokenType();
        doctype0.pubSysKey = "4";
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        endTag0.finaliseTag();
        endTag0.tagName = "</hi!#>";
        endTag0.setEmptyAttributeValue();
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName(' ');
        java.lang.String str4 = endTag0.normalName();
        java.lang.Class<?> wildcardClass5 = endTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        org.jsoup.parser.Token.Tag tag13 = endTag0.reset();
        tag13.selfClosing = false;
        tag13.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        endTag14.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag19.selfClosing = true;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("hi!");
        endTag19.appendAttributeName('a');
        int[] intArray36 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag19.appendAttributeValue(intArray36);
        endTag14.appendAttributeValue(intArray36);
        endTag0.appendAttributeValue(intArray36);
        org.jsoup.parser.Token token40 = endTag0.reset();
        java.lang.String str41 = endTag0.normalName();
        org.jsoup.parser.Token.Tag tag42 = endTag0.reset();
        java.lang.String str43 = endTag0.tagName;
        endTag0.appendAttributeValue("hi!#");
        endTag0.appendTagName(' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        startTag0.normalName = "<EOF >";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isEOF();
        org.jsoup.parser.Token token10 = doctype0.reset();
        org.jsoup.parser.Token.TokenType tokenType11 = token10.type;
        java.lang.Class<?> wildcardClass12 = tokenType11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.finaliseTag();
        endTag8.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        startTag22.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        endTag18.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = startTag15.nameAttr("eof", attributes26);
        endTag8.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag30 = startTag6.nameAttr("<!---->", attributes26);
        startTag6.normalName = " ";
        startTag6.selfClosing = true;
        java.lang.String str35 = startTag6.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<<!---->>" + "'", str35, "<<!---->>");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        org.jsoup.parser.Token token10 = comment0.reset();
        org.jsoup.parser.Token token11 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag8 = tag5.asStartTag();
        startTag8.appendAttributeName(' ');
        int[] intArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            startTag8.appendAttributeValue(intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.toString();
        java.lang.String str7 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag6.reset();
        java.lang.String str11 = startTag6.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isComment();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue(' ');
        char[] charArray10 = new char[] { ' ', ' ' };
        endTag5.appendAttributeValue(charArray10);
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag5.type = tokenType12;
        endTag0.type = tokenType12;
        endTag0.finaliseTag();
        endTag0.tagName = "4";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        boolean boolean10 = doctype0.isForceQuirks();
        boolean boolean11 = doctype0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        java.lang.String str10 = startTag0.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        boolean boolean9 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag12 = tag10.name("<EOF>");
        boolean boolean13 = tag10.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype14 = tag10.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        tag6.finaliseTag();
        boolean boolean9 = tag6.isStartTag();
        java.lang.String str10 = tag6.tagName;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        startTag14.tagName = "<!---->";
        java.lang.String str18 = startTag14.tagName;
        boolean boolean19 = startTag14.isEOF();
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(' ');
        char[] charArray25 = new char[] { ' ', ' ' };
        endTag20.appendAttributeValue(charArray25);
        endTag20.selfClosing = true;
        org.jsoup.parser.Token.Tag tag30 = endTag20.name("hi!");
        tag30.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag33 = tag30.asEndTag();
        org.jsoup.parser.Token.EndTag endTag34 = new org.jsoup.parser.Token.EndTag();
        endTag34.finaliseTag();
        boolean boolean36 = endTag34.isCharacter();
        int[] intArray38 = new int[] { (short) 1 };
        endTag34.appendAttributeValue(intArray38);
        endTag33.appendAttributeValue(intArray38);
        startTag14.appendAttributeValue(intArray38);
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        boolean boolean43 = endTag42.isSelfClosing();
        endTag42.normalName = "";
        endTag42.finaliseTag();
        org.jsoup.nodes.Attributes attributes47 = endTag42.attributes;
        endTag42.appendAttributeValue('#');
        endTag42.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes52 = endTag42.getAttributes();
        java.lang.String str53 = endTag42.name();
        org.jsoup.parser.Token.EndTag endTag54 = new org.jsoup.parser.Token.EndTag();
        endTag54.appendAttributeValue(' ');
        char[] charArray59 = new char[] { ' ', ' ' };
        endTag54.appendAttributeValue(charArray59);
        endTag54.selfClosing = true;
        org.jsoup.parser.Token.Tag tag64 = endTag54.name("hi!");
        endTag54.appendAttributeName('a');
        int[] intArray71 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag54.appendAttributeValue(intArray71);
        endTag42.appendAttributeValue(intArray71);
        startTag14.appendAttributeValue(intArray71);
        tag6.appendAttributeValue(intArray71);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character76 = tag6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(endTag33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(attributes47);
        org.junit.Assert.assertNull(attributes52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        tag10.normalName = "</hi!>";
        tag10.appendAttributeValue("</StartTag>");
        org.jsoup.parser.Token.TokenType tokenType18 = tag10.type;
        tag10.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        tag8.finaliseTag();
        java.lang.String str10 = tag8.tagName;
        tag8.normalName = "</hi!#>";
        tag8.appendAttributeName("#");
        tag8.tagName = "hi!#";
        java.lang.String str17 = tag8.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "</hi!#>" + "'", str17, "</hi!#>");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        boolean boolean10 = tag9.isCharacter();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("#");
        org.jsoup.parser.Token.Character character11 = character9.data("eof");
        java.lang.String str12 = character11.toString();
        java.lang.String str13 = character11.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eof" + "'", str13, "eof");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag14 = endTag0.reset();
        boolean boolean15 = endTag0.isDoctype();
        org.jsoup.parser.Token token16 = endTag0.reset();
        boolean boolean17 = endTag0.isEOF();
        boolean boolean18 = endTag0.isEndTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.tokenType();
        boolean boolean10 = doctype0.forceQuirks;
        doctype0.pubSysKey = "</eof>";
        java.lang.String str13 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        int[] intArray4 = new int[] { (short) 1 };
        endTag0.appendAttributeValue(intArray4);
        endTag0.tagName = "<!---->";
        endTag0.finaliseTag();
        endTag0.appendTagName('4');
        boolean boolean11 = endTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.EOF;
        endTag0.type = tokenType12;
        org.jsoup.nodes.Attributes attributes14 = null;
        endTag0.attributes = attributes14;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag9 = endTag0.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType10 = endTag0.type;
        boolean boolean11 = endTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(endTag9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        boolean boolean9 = tag8.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "</hi!#>";
        java.lang.Class<?> wildcardClass8 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        org.jsoup.parser.Token.TokenType tokenType16 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag9.type = tokenType16;
        org.jsoup.parser.Token.Tag tag19 = endTag9.name("eof");
        java.lang.String str20 = tag19.name();
        java.lang.String str21 = tag19.tagName;
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        endTag22.appendAttributeValue(' ');
        char[] charArray27 = new char[] { ' ', ' ' };
        endTag22.appendAttributeValue(charArray27);
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.appendAttributeValue(' ');
        char[] charArray34 = new char[] { ' ', ' ' };
        endTag29.appendAttributeValue(charArray34);
        endTag22.appendAttributeValue(charArray34);
        endTag22.tagName = "eof";
        java.lang.String str39 = endTag22.name();
        org.jsoup.parser.Token.EndTag endTag40 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag41.nameAttr("EOF", attributes43);
        boolean boolean45 = startTag44.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag44.reset();
        startTag44.newAttribute();
        org.jsoup.nodes.Attributes attributes48 = startTag44.attributes;
        endTag40.attributes = attributes48;
        endTag22.attributes = attributes48;
        tag19.attributes = attributes48;
        tag7.attributes = attributes48;
        boolean boolean53 = tag7.isEndTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eof" + "'", str20, "eof");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "eof" + "'", str21, "eof");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "eof" + "'", str39, "eof");
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        endTag0.tagName = "hi!";
        java.lang.String str10 = endTag0.toString();
        endTag0.tagName = "hi!";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag9.nameAttr("EOF", attributes11);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag9.nameAttr("EOF", attributes14);
        org.jsoup.parser.Token.Tag tag16 = startTag9.reset();
        java.lang.String str17 = tag16.tagName;
        boolean boolean18 = tag16.isCharacter();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        java.lang.String str25 = startTag22.normalName;
        java.lang.String str26 = startTag22.normalName();
        boolean boolean27 = startTag22.selfClosing;
        java.lang.String str28 = startTag22.tagName;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = startTag30.nameAttr("EOF", attributes32);
        boolean boolean34 = startTag33.isDoctype();
        org.jsoup.parser.Token.Tag tag35 = startTag33.reset();
        org.jsoup.parser.Token.StartTag startTag36 = tag35.asStartTag();
        org.jsoup.parser.Token.Tag tag37 = tag35.reset();
        org.jsoup.nodes.Attributes attributes38 = tag35.attributes;
        org.jsoup.parser.Token.StartTag startTag39 = startTag22.nameAttr("", attributes38);
        startTag22.normalName = "";
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        endTag42.appendAttributeValue(' ');
        char[] charArray47 = new char[] { ' ', ' ' };
        endTag42.appendAttributeValue(charArray47);
        org.jsoup.parser.Token.EndTag endTag49 = endTag42.asEndTag();
        char[] charArray55 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag42.appendAttributeValue(charArray55);
        startTag22.appendAttributeValue(charArray55);
        tag16.appendAttributeValue(charArray55);
        startTag6.appendAttributeValue(charArray55);
        startTag6.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag49);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        endTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = endTag0.getAttributes();
        java.lang.String str11 = endTag0.name();
        java.lang.String str12 = endTag0.tagName;
        java.lang.String str13 = endTag0.normalName();
        java.lang.String str14 = endTag0.normalName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        org.jsoup.nodes.Attributes attributes8 = tag5.attributes;
        tag5.appendAttributeValue('4');
        tag5.appendTagName('4');
        java.lang.Class<?> wildcardClass13 = tag5.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        boolean boolean5 = startTag3.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag10.nameAttr("", attributes13);
        boolean boolean15 = startTag14.isSelfClosing();
        java.lang.String str16 = startTag14.tagName;
        boolean boolean17 = startTag14.isEndTag();
        boolean boolean18 = startTag14.isEndTag();
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag21.nameAttr("EOF", attributes23);
        boolean boolean25 = startTag24.isDoctype();
        org.jsoup.parser.Token.Tag tag26 = startTag24.reset();
        startTag24.newAttribute();
        org.jsoup.nodes.Attributes attributes28 = startTag24.attributes;
        endTag20.attributes = attributes28;
        org.jsoup.parser.Token.StartTag startTag30 = startTag14.nameAttr("<!---->4", attributes28);
        org.jsoup.parser.Token.StartTag startTag31 = startTag3.nameAttr("Comment", attributes28);
        java.lang.String str32 = startTag3.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<Comment>" + "'", str32, "<Comment>");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = tag10.isEndTag();
        java.lang.String str12 = tag10.name();
        tag10.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        boolean boolean4 = tag3.isSelfClosing();
        java.lang.String str5 = tag3.tagName;
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag7.type;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        endTag0.tagName = "eof";
        org.jsoup.parser.Token token17 = endTag0.reset();
        endTag0.tagName = "hi!#";
        endTag0.finaliseTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token17);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = startTag1.nameAttr("EOF", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        org.jsoup.parser.Token.Tag tag6 = startTag4.reset();
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        endTag0.attributes = attributes8;
        boolean boolean10 = endTag0.isEndTag();
        org.jsoup.parser.Token.Tag tag11 = endTag0.reset();
        endTag0.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes3 = endTag0.getAttributes();
        boolean boolean4 = endTag0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        endTag0.tagName = "eof";
        endTag0.newAttribute();
        java.lang.String str18 = endTag0.toString();
        java.lang.String str19 = endTag0.tagName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "</eof>" + "'", str18, "</eof>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "eof" + "'", str19, "eof");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        java.lang.String str9 = doctype8.getSystemIdentifier();
        java.lang.String str10 = doctype8.getName();
        boolean boolean11 = doctype8.forceQuirks;
        java.lang.String str12 = doctype8.tokenType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag0.normalName();
        startTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes7 = startTag0.attributes;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eof" + "'", str4, "eof");
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        tag7.finaliseTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        startTag3.tagName = "";
        org.jsoup.parser.Token token11 = startTag3.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = startTag3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.newAttribute();
        org.jsoup.parser.Token.EndTag endTag6 = endTag0.asEndTag();
        endTag6.appendAttributeName("</<!---->4>");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertNotNull(endTag6);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        boolean boolean11 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.appendAttributeValue(' ');
        char[] charArray18 = new char[] { ' ', ' ' };
        endTag13.appendAttributeValue(charArray18);
        endTag13.selfClosing = true;
        org.jsoup.parser.Token.Tag tag23 = endTag13.name("hi!");
        endTag13.appendAttributeValue("</ >");
        boolean boolean26 = endTag13.isEOF();
        org.jsoup.parser.Token.TokenType tokenType27 = endTag13.type;
        doctype0.type = tokenType27;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        boolean boolean11 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        java.lang.String str13 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean16 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character0.data("<hi!>");
        java.lang.String str9 = character8.toString();
        org.jsoup.parser.Token.Character character11 = character8.data("<EOF>");
        java.lang.String str12 = character8.getData();
        org.jsoup.parser.Token token13 = character8.reset();
        org.jsoup.parser.Token token14 = token13.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<EOF>" + "'", str12, "<EOF>");
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        org.jsoup.parser.Token token9 = startTag7.reset();
        org.jsoup.nodes.Attributes attributes10 = startTag7.attributes;
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag14 = endTag11.reset();
        endTag11.appendAttributeValue(' ');
        endTag11.newAttribute();
        int[] intArray21 = new int[] { 1, 10, 10 };
        endTag11.appendAttributeValue(intArray21);
        org.jsoup.parser.Token.Tag tag24 = endTag11.name("StartTag");
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        startTag29.newAttribute();
        org.jsoup.nodes.Attributes attributes33 = startTag29.attributes;
        endTag25.attributes = attributes33;
        org.jsoup.parser.Token.EndTag endTag35 = new org.jsoup.parser.Token.EndTag();
        endTag35.appendAttributeValue(' ');
        char[] charArray40 = new char[] { ' ', ' ' };
        endTag35.appendAttributeValue(charArray40);
        endTag35.selfClosing = true;
        org.jsoup.parser.Token.Tag tag45 = endTag35.name("hi!");
        boolean boolean46 = tag45.isEndTag();
        org.jsoup.parser.Token token47 = tag45.reset();
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        boolean boolean49 = endTag48.isSelfClosing();
        endTag48.normalName = "";
        endTag48.finaliseTag();
        org.jsoup.nodes.Attributes attributes53 = endTag48.attributes;
        endTag48.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag56 = endTag48.reset();
        org.jsoup.parser.Token.Tag tag57 = endTag48.reset();
        org.jsoup.parser.Token.EndTag endTag58 = new org.jsoup.parser.Token.EndTag();
        boolean boolean59 = endTag58.isSelfClosing();
        endTag58.normalName = "";
        boolean boolean62 = endTag58.selfClosing;
        org.jsoup.parser.Token.Tag tag64 = endTag58.name("eof");
        org.jsoup.parser.Token.Tag tag66 = endTag58.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag67 = new org.jsoup.parser.Token.EndTag();
        endTag67.appendAttributeValue(' ');
        char[] charArray72 = new char[] { ' ', ' ' };
        endTag67.appendAttributeValue(charArray72);
        endTag67.selfClosing = true;
        org.jsoup.parser.Token.Tag tag77 = endTag67.name("hi!");
        endTag67.appendAttributeName('a');
        int[] intArray84 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag67.appendAttributeValue(intArray84);
        org.jsoup.parser.Token.EndTag endTag86 = new org.jsoup.parser.Token.EndTag();
        endTag86.finaliseTag();
        boolean boolean88 = endTag86.isCharacter();
        int[] intArray90 = new int[] { (short) 1 };
        endTag86.appendAttributeValue(intArray90);
        endTag67.appendAttributeValue(intArray90);
        tag66.appendAttributeValue(intArray90);
        tag57.appendAttributeValue(intArray90);
        tag45.appendAttributeValue(intArray90);
        endTag25.appendAttributeValue(intArray90);
        endTag11.appendAttributeValue(intArray90);
        startTag7.appendAttributeValue(intArray90);
        org.jsoup.parser.Token.Tag tag99 = startTag7.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(token47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(attributes53);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { 1 });
        org.junit.Assert.assertNotNull(tag99);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        startTag3.tagName = "EndTag";
        startTag3.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag14 = startTag3.reset();
        startTag3.appendTagName("starttag");
        startTag3.tagName = "starttag";
        java.lang.String str19 = startTag3.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<starttag>" + "'", str19, "<starttag>");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        endTag7.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag7);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        boolean boolean13 = endTag0.selfClosing;
        boolean boolean14 = endTag0.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType15 = null;
        endTag0.type = tokenType15;
        org.jsoup.parser.Token token17 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes18 = endTag0.attributes;
        endTag0.appendAttributeName("</hi!>");
        java.lang.String str21 = endTag0.tagName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.tagName;
        endTag0.appendAttributeValue("#");
        endTag0.appendTagName("#");
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        java.lang.String str20 = endTag11.tagName;
        endTag11.setEmptyAttributeValue();
        endTag11.appendAttributeName("EOF");
        java.lang.String str24 = endTag11.normalName;
        java.lang.String str25 = endTag11.tagName;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        java.lang.String str32 = startTag29.normalName;
        java.lang.String str33 = startTag29.normalName();
        boolean boolean34 = startTag29.selfClosing;
        java.lang.String str35 = startTag29.tagName;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = startTag37.nameAttr("EOF", attributes39);
        boolean boolean41 = startTag40.isDoctype();
        org.jsoup.parser.Token.Tag tag42 = startTag40.reset();
        org.jsoup.parser.Token.StartTag startTag43 = tag42.asStartTag();
        org.jsoup.parser.Token.Tag tag44 = tag42.reset();
        org.jsoup.nodes.Attributes attributes45 = tag42.attributes;
        org.jsoup.parser.Token.StartTag startTag46 = startTag29.nameAttr("", attributes45);
        startTag29.normalName = "";
        org.jsoup.parser.Token.EndTag endTag49 = new org.jsoup.parser.Token.EndTag();
        endTag49.appendAttributeValue(' ');
        char[] charArray54 = new char[] { ' ', ' ' };
        endTag49.appendAttributeValue(charArray54);
        org.jsoup.parser.Token.EndTag endTag56 = endTag49.asEndTag();
        char[] charArray62 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag49.appendAttributeValue(charArray62);
        startTag29.appendAttributeValue(charArray62);
        endTag11.appendAttributeValue(charArray62);
        endTag0.appendAttributeValue(charArray62);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag56);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.tagName = "<!---->";
        java.lang.String str7 = startTag3.tagName;
        boolean boolean8 = startTag3.isEOF();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        tag9.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        endTag0.tagName = "eof";
        org.jsoup.parser.Token.Tag tag18 = endTag0.name("<!---->");
        endTag0.appendTagName("");
        org.jsoup.nodes.Attributes attributes21 = null;
        endTag0.attributes = attributes21;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.tokenType();
        boolean boolean10 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.tagName;
        org.jsoup.parser.Token.Tag tag11 = startTag7.reset();
        startTag7.appendAttributeValue("<EOF>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        endTag14.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag19.selfClosing = true;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("hi!");
        endTag19.appendAttributeName('a');
        int[] intArray36 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag19.appendAttributeValue(intArray36);
        endTag14.appendAttributeValue(intArray36);
        endTag0.appendAttributeValue(intArray36);
        org.jsoup.parser.Token token40 = endTag0.reset();
        endTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token40);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character4 = character2.data("Doctype");
        java.lang.String str5 = character4.toString();
        org.jsoup.parser.Token.Character character7 = character4.data("hi!</hi!>");
        java.lang.String str8 = character7.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!</hi!>" + "'", str8, "hi!</hi!>");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isEndTag();
        org.jsoup.parser.Token token2 = eOF0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment3 = token2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        boolean boolean9 = startTag3.isDoctype();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        boolean boolean17 = startTag16.isDoctype();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag16.nameAttr("", attributes19);
        org.jsoup.parser.Token.TokenType tokenType21 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag16.type = tokenType21;
        endTag10.type = tokenType21;
        boolean boolean24 = endTag10.isEOF();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = startTag25.nameAttr("EOF", attributes27);
        boolean boolean29 = startTag28.isDoctype();
        org.jsoup.parser.Token.Tag tag30 = startTag28.reset();
        java.lang.String str31 = startTag28.normalName;
        java.lang.String str32 = startTag28.normalName();
        boolean boolean33 = startTag28.selfClosing;
        java.lang.String str34 = startTag28.tagName;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        boolean boolean40 = startTag39.isDoctype();
        org.jsoup.parser.Token.Tag tag41 = startTag39.reset();
        org.jsoup.parser.Token.StartTag startTag42 = tag41.asStartTag();
        org.jsoup.parser.Token.Tag tag43 = tag41.reset();
        org.jsoup.nodes.Attributes attributes44 = tag41.attributes;
        org.jsoup.parser.Token.StartTag startTag45 = startTag28.nameAttr("", attributes44);
        startTag28.normalName = "";
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        endTag48.appendAttributeValue(' ');
        char[] charArray53 = new char[] { ' ', ' ' };
        endTag48.appendAttributeValue(charArray53);
        org.jsoup.parser.Token.EndTag endTag55 = endTag48.asEndTag();
        char[] charArray61 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag48.appendAttributeValue(charArray61);
        startTag28.appendAttributeValue(charArray61);
        endTag10.appendAttributeValue(charArray61);
        startTag3.appendAttributeValue(charArray61);
        startTag3.appendTagName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag55);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        endTag0.appendAttributeName("EOF");
        endTag0.appendAttributeName("Doctype");
        boolean boolean18 = endTag0.selfClosing;
        java.lang.String str19 = endTag0.name();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        boolean boolean8 = endTag0.isCharacter();
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        boolean boolean10 = comment9.isComment();
        org.jsoup.parser.Token token11 = comment9.reset();
        org.jsoup.parser.Token.TokenType tokenType12 = token11.type;
        endTag0.type = tokenType12;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        java.lang.String str10 = tag9.normalName();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.finaliseTag();
        boolean boolean13 = endTag11.isCharacter();
        int[] intArray15 = new int[] { (short) 1 };
        endTag11.appendAttributeValue(intArray15);
        endTag11.tagName = "<!---->";
        endTag11.finaliseTag();
        endTag11.appendTagName('4');
        endTag11.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag23.nameAttr("EOF", attributes28);
        startTag29.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag32.nameAttr("EOF", attributes34);
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = startTag32.nameAttr("EOF", attributes37);
        org.jsoup.parser.Token.Tag tag39 = startTag32.reset();
        java.lang.String str40 = tag39.tagName;
        boolean boolean41 = tag39.isCharacter();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag42.nameAttr("EOF", attributes44);
        boolean boolean46 = startTag45.isDoctype();
        org.jsoup.parser.Token.Tag tag47 = startTag45.reset();
        java.lang.String str48 = startTag45.normalName;
        java.lang.String str49 = startTag45.normalName();
        boolean boolean50 = startTag45.selfClosing;
        java.lang.String str51 = startTag45.tagName;
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag53.nameAttr("EOF", attributes55);
        boolean boolean57 = startTag56.isDoctype();
        org.jsoup.parser.Token.Tag tag58 = startTag56.reset();
        org.jsoup.parser.Token.StartTag startTag59 = tag58.asStartTag();
        org.jsoup.parser.Token.Tag tag60 = tag58.reset();
        org.jsoup.nodes.Attributes attributes61 = tag58.attributes;
        org.jsoup.parser.Token.StartTag startTag62 = startTag45.nameAttr("", attributes61);
        startTag45.normalName = "";
        org.jsoup.parser.Token.EndTag endTag65 = new org.jsoup.parser.Token.EndTag();
        endTag65.appendAttributeValue(' ');
        char[] charArray70 = new char[] { ' ', ' ' };
        endTag65.appendAttributeValue(charArray70);
        org.jsoup.parser.Token.EndTag endTag72 = endTag65.asEndTag();
        char[] charArray78 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag65.appendAttributeValue(charArray78);
        startTag45.appendAttributeValue(charArray78);
        tag39.appendAttributeValue(charArray78);
        startTag29.appendAttributeValue(charArray78);
        endTag11.appendAttributeValue(charArray78);
        tag9.appendAttributeValue(charArray78);
        tag9.appendAttributeName("eof");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1 });
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag72);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token.Character character7 = character0.data("Character");
        java.lang.String str8 = character7.getData();
        java.lang.String str9 = character7.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Character" + "'", str8, "Character");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Character" + "'", str9, "Character");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("</hi!>");
        java.lang.String str7 = character0.tokenType();
        boolean boolean8 = character0.isComment();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Character" + "'", str7, "Character");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue(' ');
        char[] charArray10 = new char[] { ' ', ' ' };
        endTag5.appendAttributeValue(charArray10);
        endTag5.selfClosing = true;
        org.jsoup.parser.Token.Tag tag15 = endTag5.name("hi!");
        endTag5.appendAttributeName('a');
        int[] intArray22 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag5.appendAttributeValue(intArray22);
        endTag0.appendAttributeValue(intArray22);
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag();
        endTag25.finaliseTag();
        boolean boolean27 = endTag25.isCharacter();
        int[] intArray29 = new int[] { (short) 1 };
        endTag25.appendAttributeValue(intArray29);
        endTag0.appendAttributeValue(intArray29);
        boolean boolean32 = endTag0.isDoctype();
        endTag0.normalName = "</eof>";
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        java.lang.String str7 = character0.getData();
        java.lang.String str8 = character0.getData();
        org.jsoup.parser.Token token9 = character0.reset();
        java.lang.String str10 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        startTag3.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag11 = startTag3.asStartTag();
        java.lang.String str12 = startTag11.tagName;
        boolean boolean13 = startTag11.isComment();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.nameAttr("EOF", attributes16);
        boolean boolean18 = startTag17.isDoctype();
        org.jsoup.parser.Token.Tag tag19 = startTag17.reset();
        java.lang.String str20 = startTag17.normalName;
        java.lang.String str21 = startTag17.normalName();
        boolean boolean22 = startTag17.selfClosing;
        boolean boolean23 = startTag17.isDoctype();
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag27.nameAttr("EOF", attributes29);
        boolean boolean31 = startTag30.isDoctype();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag30.nameAttr("", attributes33);
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag30.type = tokenType35;
        endTag24.type = tokenType35;
        boolean boolean38 = endTag24.isEOF();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag39.nameAttr("EOF", attributes41);
        boolean boolean43 = startTag42.isDoctype();
        org.jsoup.parser.Token.Tag tag44 = startTag42.reset();
        java.lang.String str45 = startTag42.normalName;
        java.lang.String str46 = startTag42.normalName();
        boolean boolean47 = startTag42.selfClosing;
        java.lang.String str48 = startTag42.tagName;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = startTag50.nameAttr("EOF", attributes52);
        boolean boolean54 = startTag53.isDoctype();
        org.jsoup.parser.Token.Tag tag55 = startTag53.reset();
        org.jsoup.parser.Token.StartTag startTag56 = tag55.asStartTag();
        org.jsoup.parser.Token.Tag tag57 = tag55.reset();
        org.jsoup.nodes.Attributes attributes58 = tag55.attributes;
        org.jsoup.parser.Token.StartTag startTag59 = startTag42.nameAttr("", attributes58);
        startTag42.normalName = "";
        org.jsoup.parser.Token.EndTag endTag62 = new org.jsoup.parser.Token.EndTag();
        endTag62.appendAttributeValue(' ');
        char[] charArray67 = new char[] { ' ', ' ' };
        endTag62.appendAttributeValue(charArray67);
        org.jsoup.parser.Token.EndTag endTag69 = endTag62.asEndTag();
        char[] charArray75 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag62.appendAttributeValue(charArray75);
        startTag42.appendAttributeValue(charArray75);
        endTag24.appendAttributeValue(charArray75);
        startTag17.appendAttributeValue(charArray75);
        startTag11.appendAttributeValue(charArray75);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag69);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.Class<?> wildcardClass9 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        java.lang.String str9 = startTag3.tagName;
        boolean boolean10 = startTag3.isEOF();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = endTag11.name("hi!");
        endTag11.appendAttributeName('a');
        int[] intArray28 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag11.appendAttributeValue(intArray28);
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        endTag30.finaliseTag();
        boolean boolean32 = endTag30.isCharacter();
        int[] intArray34 = new int[] { (short) 1 };
        endTag30.appendAttributeValue(intArray34);
        endTag11.appendAttributeValue(intArray34);
        startTag3.appendAttributeValue(intArray34);
        java.lang.String str38 = startTag3.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1 });
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag9 = startTag6.name("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = startTag6.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        boolean boolean7 = startTag0.isDoctype();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag7.setEmptyAttributeValue();
        org.jsoup.parser.Token token15 = endTag7.reset();
        org.jsoup.parser.Token.TokenType tokenType16 = endTag7.type;
        character0.type = tokenType16;
        org.jsoup.parser.Token.Character character19 = character0.data("</hi!>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(character19);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        java.lang.String str9 = endTag0.tagName;
        endTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        boolean boolean9 = endTag0.isDoctype();
        endTag0.finaliseTag();
        endTag0.appendAttributeName("EndTag");
        endTag0.finaliseTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        org.jsoup.parser.Token.Tag tag9 = tag7.reset();
        tag7.tagName = "hi!";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        org.jsoup.nodes.Attributes attributes6 = endTag0.getAttributes();
        java.lang.String str7 = endTag0.normalName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isEOF();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder12 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        boolean boolean5 = endTag0.isEndTag();
        endTag0.appendAttributeName('4');
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        boolean boolean15 = endTag0.isDoctype();
        endTag0.newAttribute();
        java.lang.String str17 = endTag0.normalName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        java.lang.String str9 = startTag7.tagName;
        boolean boolean10 = startTag7.isEndTag();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.Tag tag17 = startTag15.reset();
        org.jsoup.parser.Token.StartTag startTag18 = tag17.asStartTag();
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.finaliseTag();
        endTag20.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag24.nameAttr("EOF", attributes26);
        boolean boolean28 = startTag27.isDoctype();
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag31.nameAttr("EOF", attributes33);
        boolean boolean35 = startTag34.isDoctype();
        org.jsoup.parser.Token.Tag tag36 = startTag34.reset();
        startTag34.newAttribute();
        org.jsoup.nodes.Attributes attributes38 = startTag34.attributes;
        endTag30.attributes = attributes38;
        org.jsoup.parser.Token.StartTag startTag40 = startTag27.nameAttr("eof", attributes38);
        endTag20.attributes = attributes38;
        org.jsoup.parser.Token.StartTag startTag42 = startTag18.nameAttr("<!---->", attributes38);
        org.jsoup.parser.Token.StartTag startTag43 = startTag7.nameAttr("starttag", attributes38);
        java.lang.String str44 = startTag43.toString();
        org.jsoup.nodes.Attributes attributes45 = startTag43.getAttributes();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag46.nameAttr("EOF", attributes48);
        boolean boolean50 = startTag49.isDoctype();
        org.jsoup.parser.Token.Tag tag51 = startTag49.reset();
        java.lang.String str52 = startTag49.normalName;
        java.lang.String str53 = startTag49.normalName();
        startTag49.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag55 = startTag49.reset();
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes59 = null;
        org.jsoup.parser.Token.StartTag startTag60 = startTag57.nameAttr("EOF", attributes59);
        boolean boolean61 = startTag60.isDoctype();
        org.jsoup.parser.Token.Tag tag62 = startTag60.reset();
        java.lang.String str63 = startTag60.normalName;
        java.lang.String str64 = startTag60.normalName();
        boolean boolean65 = startTag60.selfClosing;
        java.lang.String str66 = startTag60.tagName;
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes70 = null;
        org.jsoup.parser.Token.StartTag startTag71 = startTag68.nameAttr("EOF", attributes70);
        boolean boolean72 = startTag71.isDoctype();
        org.jsoup.parser.Token.Tag tag73 = startTag71.reset();
        org.jsoup.parser.Token.StartTag startTag74 = tag73.asStartTag();
        org.jsoup.parser.Token.Tag tag75 = tag73.reset();
        org.jsoup.nodes.Attributes attributes76 = tag73.attributes;
        org.jsoup.parser.Token.StartTag startTag77 = startTag60.nameAttr("", attributes76);
        org.jsoup.parser.Token.StartTag startTag78 = startTag49.nameAttr("", attributes76);
        org.jsoup.nodes.Attributes attributes79 = startTag49.attributes;
        startTag43.attributes = attributes79;
        boolean boolean81 = startTag43.isSelfClosing();
        startTag43.appendTagName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<starttag>" + "'", str44, "<starttag>");
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(startTag71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNotNull(startTag74);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.getData();
        java.lang.String str7 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        boolean boolean8 = tag5.selfClosing;
        java.lang.String str9 = tag5.normalName;
        boolean boolean10 = tag5.isStartTag();
        java.lang.String str11 = tag5.tagName;
        tag5.appendAttributeName("4");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = startTag7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isComment();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.appendAttributeName(' ');
        tag10.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = startTag19.nameAttr("", attributes22);
        boolean boolean24 = startTag23.isSelfClosing();
        java.lang.String str25 = startTag23.tagName;
        boolean boolean26 = startTag23.isEndTag();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag28.nameAttr("EOF", attributes30);
        boolean boolean32 = startTag31.isDoctype();
        org.jsoup.parser.Token.Tag tag33 = startTag31.reset();
        org.jsoup.parser.Token.StartTag startTag34 = tag33.asStartTag();
        org.jsoup.parser.Token.EndTag endTag36 = new org.jsoup.parser.Token.EndTag();
        endTag36.finaliseTag();
        endTag36.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = startTag40.nameAttr("EOF", attributes42);
        boolean boolean44 = startTag43.isDoctype();
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = startTag47.nameAttr("EOF", attributes49);
        boolean boolean51 = startTag50.isDoctype();
        org.jsoup.parser.Token.Tag tag52 = startTag50.reset();
        startTag50.newAttribute();
        org.jsoup.nodes.Attributes attributes54 = startTag50.attributes;
        endTag46.attributes = attributes54;
        org.jsoup.parser.Token.StartTag startTag56 = startTag43.nameAttr("eof", attributes54);
        endTag36.attributes = attributes54;
        org.jsoup.parser.Token.StartTag startTag58 = startTag34.nameAttr("<!---->", attributes54);
        org.jsoup.parser.Token.StartTag startTag59 = startTag23.nameAttr("starttag", attributes54);
        startTag23.appendAttributeValue("</StartTag>");
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes64 = null;
        org.jsoup.parser.Token.StartTag startTag65 = startTag62.nameAttr("EOF", attributes64);
        boolean boolean66 = startTag65.isDoctype();
        org.jsoup.parser.Token.Tag tag67 = startTag65.reset();
        org.jsoup.parser.Token.StartTag startTag68 = tag67.asStartTag();
        startTag68.selfClosing = false;
        org.jsoup.parser.Token.Tag tag71 = startTag68.reset();
        org.jsoup.parser.Token.Tag tag72 = startTag68.reset();
        startTag68.appendTagName('a');
        org.jsoup.parser.Token.EndTag endTag75 = new org.jsoup.parser.Token.EndTag();
        endTag75.appendAttributeValue(' ');
        char[] charArray80 = new char[] { ' ', ' ' };
        endTag75.appendAttributeValue(charArray80);
        endTag75.selfClosing = true;
        org.jsoup.parser.Token.Tag tag85 = endTag75.name("hi!");
        tag85.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag88 = tag85.asEndTag();
        org.jsoup.parser.Token.EndTag endTag89 = new org.jsoup.parser.Token.EndTag();
        endTag89.finaliseTag();
        boolean boolean91 = endTag89.isCharacter();
        int[] intArray93 = new int[] { (short) 1 };
        endTag89.appendAttributeValue(intArray93);
        endTag88.appendAttributeValue(intArray93);
        startTag68.appendAttributeValue(intArray93);
        startTag23.appendAttributeValue(intArray93);
        tag10.appendAttributeValue(intArray93);
        java.lang.String str99 = tag10.normalName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertNotNull(endTag88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "hi!" + "'", str99, "hi!");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue(' ');
        char[] charArray10 = new char[] { ' ', ' ' };
        endTag5.appendAttributeValue(charArray10);
        endTag5.selfClosing = true;
        org.jsoup.parser.Token.Tag tag15 = endTag5.name("hi!");
        endTag5.appendAttributeName('a');
        int[] intArray22 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag5.appendAttributeValue(intArray22);
        endTag0.appendAttributeValue(intArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        java.lang.String str10 = tag9.normalName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        boolean boolean10 = comment0.bogus;
        java.lang.StringBuilder stringBuilder11 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.String str4 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str7 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str10 = doctype0.getPubSysKey();
        java.lang.String str11 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "#";
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        org.jsoup.parser.Token.EndTag endTag11 = endTag0.asEndTag();
        org.jsoup.nodes.Attributes attributes12 = endTag11.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag11);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        org.jsoup.parser.Token.Tag tag8 = startTag3.reset();
        tag8.selfClosing = true;
        tag8.appendAttributeValue('#');
        tag8.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("</ >");
        boolean boolean5 = character0.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        boolean boolean14 = tag10.isDoctype();
        java.lang.String str15 = tag10.tagName;
        java.lang.String str16 = tag10.tokenType();
        tag10.finaliseTag();
        tag10.appendAttributeName('4');
        tag10.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EndTag" + "'", str16, "EndTag");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType8;
        boolean boolean10 = doctype0.forceQuirks;
        java.lang.String str11 = doctype0.pubSysKey;
        boolean boolean12 = doctype0.isStartTag();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder12 = doctype0.name;
        org.jsoup.parser.Token token13 = doctype0.reset();
        java.lang.StringBuilder stringBuilder14 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        boolean boolean3 = comment0.bogus;
        org.jsoup.parser.Token token4 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.tokenType();
        boolean boolean10 = doctype0.isStartTag();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        java.lang.String str11 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        boolean boolean13 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("<starttag>");
        org.jsoup.parser.Token.Character character10 = character8.data("");
        org.jsoup.parser.Token token11 = character8.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        java.lang.String str10 = startTag6.normalName();
        startTag6.finaliseTag();
        boolean boolean12 = startTag6.isStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "eof" + "'", str10, "eof");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token.Character character9 = character0.data("EndTag");
        java.lang.String str10 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EndTag" + "'", str10, "EndTag");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        boolean boolean10 = startTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.finaliseTag();
        endTag12.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.parser.Token.Tag tag28 = startTag26.reset();
        startTag26.newAttribute();
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        endTag22.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag32 = startTag19.nameAttr("eof", attributes30);
        endTag12.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag34 = startTag0.nameAttr("</hi!>", attributes30);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        java.lang.String str36 = comment35.getData();
        java.lang.StringBuilder stringBuilder37 = comment35.data;
        java.lang.String str38 = comment35.toString();
        org.jsoup.parser.Token.EndTag endTag39 = new org.jsoup.parser.Token.EndTag();
        endTag39.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag42.nameAttr("EOF", attributes44);
        boolean boolean46 = startTag45.isDoctype();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag45.nameAttr("", attributes48);
        org.jsoup.parser.Token.TokenType tokenType50 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag45.type = tokenType50;
        endTag39.type = tokenType50;
        comment35.type = tokenType50;
        org.jsoup.parser.Token token54 = comment35.reset();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = startTag55.nameAttr("EOF", attributes57);
        org.jsoup.nodes.Attributes attributes60 = null;
        org.jsoup.parser.Token.StartTag startTag61 = startTag55.nameAttr("EOF", attributes60);
        java.lang.String str62 = startTag55.normalName();
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes65 = null;
        org.jsoup.parser.Token.StartTag startTag66 = startTag63.nameAttr("EOF", attributes65);
        boolean boolean67 = startTag66.isDoctype();
        org.jsoup.nodes.Attributes attributes69 = null;
        org.jsoup.parser.Token.StartTag startTag70 = startTag66.nameAttr("", attributes69);
        org.jsoup.parser.Token.TokenType tokenType71 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag66.type = tokenType71;
        startTag55.type = tokenType71;
        token54.type = tokenType71;
        startTag0.type = tokenType71;
        java.lang.String str76 = startTag0.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag77 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token54);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "eof" + "'", str62, "eof");
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(startTag70);
        org.junit.Assert.assertTrue("'" + tokenType71 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType71.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "</hi!>" + "'", str76, "</hi!>");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        java.lang.String str9 = startTag3.tagName;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        org.jsoup.parser.Token.Tag tag16 = startTag14.reset();
        org.jsoup.parser.Token.StartTag startTag17 = tag16.asStartTag();
        org.jsoup.parser.Token.Tag tag18 = tag16.reset();
        org.jsoup.nodes.Attributes attributes19 = tag16.attributes;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("", attributes19);
        startTag20.finaliseTag();
        org.jsoup.parser.Token token22 = startTag20.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(token22);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        boolean boolean10 = startTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.finaliseTag();
        endTag12.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.parser.Token.Tag tag28 = startTag26.reset();
        startTag26.newAttribute();
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        endTag22.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag32 = startTag19.nameAttr("eof", attributes30);
        endTag12.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag34 = startTag0.nameAttr("</hi!>", attributes30);
        org.jsoup.parser.Token.Tag tag36 = startTag34.name("<starttag>");
        java.lang.String str37 = tag36.normalName();
        tag36.appendTagName('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<starttag>" + "'", str37, "<starttag>");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        boolean boolean7 = token6.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag10.nameAttr("", attributes13);
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag10.type = tokenType15;
        endTag4.type = tokenType15;
        comment0.type = tokenType15;
        comment0.bogus = false;
        comment0.bogus = false;
        java.lang.String str23 = comment0.getData();
        boolean boolean24 = comment0.bogus;
        org.jsoup.parser.Token token25 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(token25);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        endTag9.selfClosing = true;
        org.jsoup.parser.Token.Tag tag19 = endTag9.name("hi!");
        endTag9.appendAttributeName('a');
        int[] intArray26 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag9.appendAttributeValue(intArray26);
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.finaliseTag();
        boolean boolean30 = endTag28.isCharacter();
        int[] intArray32 = new int[] { (short) 1 };
        endTag28.appendAttributeValue(intArray32);
        endTag9.appendAttributeValue(intArray32);
        tag8.appendAttributeValue(intArray32);
        tag8.appendAttributeName('a');
        java.lang.Class<?> wildcardClass38 = tag8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        boolean boolean10 = endTag0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType12 = endTag0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.appendAttributeName(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag10.nameAttr("EOF", attributes12);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag15.nameAttr("EOF", attributes17);
        boolean boolean19 = startTag18.isDoctype();
        org.jsoup.parser.Token.Tag tag20 = startTag18.reset();
        org.jsoup.parser.Token.StartTag startTag21 = tag20.asStartTag();
        org.jsoup.parser.Token.Tag tag22 = tag20.reset();
        org.jsoup.nodes.Attributes attributes23 = tag20.attributes;
        org.jsoup.parser.Token.StartTag startTag24 = startTag13.nameAttr("starttag", attributes23);
        org.jsoup.parser.Token.StartTag startTag25 = startTag3.nameAttr("", attributes23);
        java.lang.String str26 = startTag25.tokenType();
        org.jsoup.parser.Token.Tag tag27 = startTag25.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "StartTag" + "'", str26, "StartTag");
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag3.toString();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<EOF>" + "'", str4, "<EOF>");
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType9 = endTag0.type;
        endTag0.tagName = "starttag";
        java.lang.String str12 = endTag0.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</starttag>" + "'", str12, "</starttag>");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        boolean boolean13 = endTag0.selfClosing;
        boolean boolean14 = endTag0.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType15 = null;
        endTag0.type = tokenType15;
        endTag0.appendAttributeValue("StartTag");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        java.lang.String str8 = endTag0.tagName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag10.nameAttr("", attributes13);
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag10.type = tokenType15;
        endTag4.type = tokenType15;
        comment0.type = tokenType15;
        comment0.bogus = false;
        org.jsoup.parser.Token token21 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token21);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag15.nameAttr("EOF", attributes17);
        boolean boolean19 = startTag18.isDoctype();
        org.jsoup.parser.Token.Tag tag20 = startTag18.reset();
        java.lang.String str21 = startTag18.normalName;
        java.lang.String str22 = startTag18.normalName();
        boolean boolean23 = startTag18.selfClosing;
        boolean boolean24 = startTag18.isEOF();
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        endTag26.appendAttributeValue(' ');
        char[] charArray31 = new char[] { ' ', ' ' };
        endTag26.appendAttributeValue(charArray31);
        endTag26.selfClosing = true;
        org.jsoup.parser.Token.Tag tag36 = endTag26.name("hi!");
        tag36.appendAttributeValue("eof");
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag39.nameAttr("EOF", attributes41);
        boolean boolean43 = startTag42.isDoctype();
        org.jsoup.parser.Token.Tag tag44 = startTag42.reset();
        org.jsoup.parser.Token.StartTag startTag45 = tag44.asStartTag();
        org.jsoup.parser.Token.Tag tag46 = tag44.reset();
        org.jsoup.nodes.Attributes attributes47 = tag44.attributes;
        tag36.attributes = attributes47;
        org.jsoup.parser.Token.StartTag startTag49 = startTag18.nameAttr("EndTag", attributes47);
        endTag13.attributes = attributes47;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(startTag49);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        java.lang.String str11 = endTag0.tagName;
        java.lang.String str12 = endTag0.normalName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        boolean boolean9 = startTag3.isDoctype();
        boolean boolean10 = startTag3.isComment();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        endTag0.appendAttributeValue("<#>");
        java.lang.String str11 = endTag0.normalName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        java.lang.String str11 = doctype0.getSystemIdentifier();
        java.lang.String str12 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        endTag0.appendAttributeName("EOF");
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = startTag19.nameAttr("", attributes22);
        org.jsoup.parser.Token.Tag tag24 = startTag23.reset();
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag();
        boolean boolean26 = endTag25.isSelfClosing();
        endTag25.normalName = "";
        java.lang.String str29 = endTag25.normalName();
        char[] charArray32 = new char[] { 'a', 'a' };
        endTag25.appendAttributeValue(charArray32);
        startTag23.appendAttributeValue(charArray32);
        endTag0.appendAttributeValue(charArray32);
        boolean boolean36 = endTag0.isEndTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        java.lang.String str4 = character0.getData();
        org.jsoup.parser.Token.Character character6 = character0.data(" ");
        boolean boolean7 = character0.isStartTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag10.nameAttr("", attributes13);
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag10.type = tokenType15;
        endTag4.type = tokenType15;
        comment0.type = tokenType15;
        comment0.bogus = false;
        comment0.bogus = false;
        java.lang.String str23 = comment0.getData();
        boolean boolean24 = comment0.bogus;
        java.lang.String str25 = comment0.getData();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        org.jsoup.parser.Token.StartTag startTag32 = tag31.asStartTag();
        startTag32.selfClosing = false;
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.Character;
        startTag32.type = tokenType35;
        comment0.type = tokenType35;
        java.lang.String str38 = comment0.getData();
        java.lang.String str39 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.finaliseTag();
        boolean boolean6 = endTag4.isCharacter();
        int[] intArray8 = new int[] { (short) 1 };
        endTag4.appendAttributeValue(intArray8);
        endTag0.appendAttributeValue(intArray8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 1 });
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        boolean boolean10 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isEndTag();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.jsoup.parser.Token token8 = eOF0.reset();
        org.jsoup.parser.Token token9 = eOF0.reset();
        org.jsoup.parser.Token token10 = eOF0.reset();
        boolean boolean11 = token10.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        tag9.tagName = "";
        boolean boolean12 = tag9.isDoctype();
        org.jsoup.parser.Token.Tag tag13 = tag9.reset();
        tag9.normalName = "hi! ";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("eof");
        java.lang.String str11 = tag10.name();
        java.lang.String str12 = tag10.tagName;
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.appendAttributeValue(' ');
        char[] charArray18 = new char[] { ' ', ' ' };
        endTag13.appendAttributeValue(charArray18);
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(' ');
        char[] charArray25 = new char[] { ' ', ' ' };
        endTag20.appendAttributeValue(charArray25);
        endTag13.appendAttributeValue(charArray25);
        endTag13.tagName = "eof";
        java.lang.String str30 = endTag13.name();
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag32.nameAttr("EOF", attributes34);
        boolean boolean36 = startTag35.isDoctype();
        org.jsoup.parser.Token.Tag tag37 = startTag35.reset();
        startTag35.newAttribute();
        org.jsoup.nodes.Attributes attributes39 = startTag35.attributes;
        endTag31.attributes = attributes39;
        endTag13.attributes = attributes39;
        tag10.attributes = attributes39;
        tag10.appendTagName("</hi!#>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "eof" + "'", str30, "eof");
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.getData();
        boolean boolean6 = comment0.bogus;
        boolean boolean7 = comment0.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName('#');
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.appendAttributeValue(' ');
        endTag4.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        endTag9.selfClosing = true;
        org.jsoup.parser.Token.Tag tag19 = endTag9.name("hi!");
        endTag9.appendAttributeName('a');
        int[] intArray26 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag9.appendAttributeValue(intArray26);
        endTag4.appendAttributeValue(intArray26);
        endTag0.appendAttributeValue(intArray26);
        org.jsoup.parser.Token.Tag tag30 = endTag0.reset();
        endTag0.tagName = "EndTag";
        endTag0.appendAttributeValue("eof");
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = startTag35.nameAttr("EOF", attributes37);
        boolean boolean39 = startTag38.isDoctype();
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag38.nameAttr("", attributes41);
        boolean boolean43 = startTag42.isSelfClosing();
        startTag42.newAttribute();
        java.lang.String str45 = startTag42.tagName;
        startTag42.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag48 = startTag42.reset();
        tag48.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes53 = null;
        org.jsoup.parser.Token.StartTag startTag54 = startTag51.nameAttr("EOF", attributes53);
        org.jsoup.nodes.Attributes attributes56 = null;
        org.jsoup.parser.Token.StartTag startTag57 = startTag51.nameAttr("EOF", attributes56);
        org.jsoup.parser.Token.Tag tag58 = startTag51.reset();
        boolean boolean59 = startTag51.isSelfClosing();
        org.jsoup.parser.Token.Tag tag60 = startTag51.reset();
        boolean boolean61 = startTag51.isComment();
        org.jsoup.parser.Token.EndTag endTag63 = new org.jsoup.parser.Token.EndTag();
        endTag63.finaliseTag();
        endTag63.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes69 = null;
        org.jsoup.parser.Token.StartTag startTag70 = startTag67.nameAttr("EOF", attributes69);
        boolean boolean71 = startTag70.isDoctype();
        org.jsoup.parser.Token.EndTag endTag73 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes76 = null;
        org.jsoup.parser.Token.StartTag startTag77 = startTag74.nameAttr("EOF", attributes76);
        boolean boolean78 = startTag77.isDoctype();
        org.jsoup.parser.Token.Tag tag79 = startTag77.reset();
        startTag77.newAttribute();
        org.jsoup.nodes.Attributes attributes81 = startTag77.attributes;
        endTag73.attributes = attributes81;
        org.jsoup.parser.Token.StartTag startTag83 = startTag70.nameAttr("eof", attributes81);
        endTag63.attributes = attributes81;
        org.jsoup.parser.Token.StartTag startTag85 = startTag51.nameAttr("</hi!>", attributes81);
        tag48.attributes = attributes81;
        endTag0.attributes = attributes81;
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(startTag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(attributes81);
        org.junit.Assert.assertNotNull(startTag83);
        org.junit.Assert.assertNotNull(startTag85);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        boolean boolean15 = endTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag17 = endTag0.name("");
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        endTag18.finaliseTag();
        endTag18.appendAttributeName('#');
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        endTag22.appendAttributeValue(' ');
        endTag22.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        endTag27.appendAttributeValue(' ');
        char[] charArray32 = new char[] { ' ', ' ' };
        endTag27.appendAttributeValue(charArray32);
        endTag27.selfClosing = true;
        org.jsoup.parser.Token.Tag tag37 = endTag27.name("hi!");
        endTag27.appendAttributeName('a');
        int[] intArray44 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag27.appendAttributeValue(intArray44);
        endTag22.appendAttributeValue(intArray44);
        endTag18.appendAttributeValue(intArray44);
        tag17.appendAttributeValue(intArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = tag17.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        tag6.appendTagName("starttag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = tag6.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.tagName = "<!---->";
        java.lang.Class<?> wildcardClass7 = startTag3.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        org.jsoup.nodes.Attributes attributes8 = tag5.attributes;
        tag5.appendAttributeValue('4');
        boolean boolean11 = tag5.isDoctype();
        tag5.appendTagName('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        doctype0.pubSysKey = " ";
        doctype0.pubSysKey = " ";
        java.lang.String str14 = doctype0.pubSysKey;
        doctype0.pubSysKey = "Doctype";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag17 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        int[] intArray17 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag0.appendAttributeValue(intArray17);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.finaliseTag();
        boolean boolean21 = endTag19.isCharacter();
        int[] intArray23 = new int[] { (short) 1 };
        endTag19.appendAttributeValue(intArray23);
        endTag0.appendAttributeValue(intArray23);
        endTag0.appendTagName("EndTag");
        endTag0.appendAttributeValue('a');
        java.lang.String str30 = endTag0.tagName;
        boolean boolean31 = endTag0.isEOF();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!EndTag" + "'", str30, "hi!EndTag");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        startTag7.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes11 = startTag7.attributes;
        org.jsoup.parser.Token.Tag tag12 = startTag7.reset();
        boolean boolean13 = startTag7.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.tagName;
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        boolean boolean10 = endTag0.isSelfClosing();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        int[] intArray4 = new int[] { (short) 1 };
        endTag0.appendAttributeValue(intArray4);
        endTag0.tagName = "<!---->";
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        endTag0.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getName();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token7 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token6 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token token8 = endTag0.reset();
        boolean boolean9 = endTag0.isStartTag();
        endTag0.appendTagName('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str12 = doctype0.pubSysKey;
        org.jsoup.parser.Token.EOF eOF13 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType14 = eOF13.type;
        doctype0.type = tokenType14;
        boolean boolean16 = doctype0.isComment();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        boolean boolean10 = tag9.isCharacter();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        startTag3.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        boolean boolean11 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag7 = tag6.asStartTag();
        boolean boolean8 = tag6.isComment();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        boolean boolean10 = comment0.bogus;
        org.jsoup.parser.Token token11 = comment0.reset();
        org.jsoup.parser.Token token12 = comment0.reset();
        java.lang.String str13 = comment0.getData();
        java.lang.StringBuilder stringBuilder14 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character15 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        boolean boolean17 = startTag16.isDoctype();
        org.jsoup.parser.Token.Tag tag18 = startTag16.reset();
        org.jsoup.parser.Token.StartTag startTag19 = tag18.asStartTag();
        org.jsoup.parser.Token.Tag tag20 = tag18.reset();
        org.jsoup.nodes.Attributes attributes21 = tag18.attributes;
        tag10.attributes = attributes21;
        boolean boolean23 = tag10.isEOF();
        tag10.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment26 = tag10.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        endTag0.finaliseTag();
        java.lang.String str15 = endTag0.normalName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eof" + "'", str15, "eof");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag0.tagName = "</<!---->4>";
        org.junit.Assert.assertNotNull(startTag3);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isComment();
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        comment0.bogus = false;
        java.lang.String str10 = comment0.toString();
        java.lang.StringBuilder stringBuilder11 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        startTag6.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.Tag tag12 = startTag6.reset();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.nameAttr("EOF", attributes16);
        boolean boolean18 = startTag17.isDoctype();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag17.nameAttr("", attributes20);
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        startTag21.appendTagName('4');
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        boolean boolean27 = endTag26.isSelfClosing();
        endTag26.normalName = "";
        endTag26.finaliseTag();
        boolean boolean31 = endTag26.selfClosing;
        endTag26.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("EOF", attributes36);
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = startTag34.nameAttr("EOF", attributes39);
        java.lang.String str41 = startTag34.normalName();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag42.nameAttr("EOF", attributes44);
        boolean boolean46 = startTag45.isDoctype();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag45.nameAttr("", attributes48);
        org.jsoup.parser.Token.TokenType tokenType50 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag45.type = tokenType50;
        startTag34.type = tokenType50;
        endTag26.type = tokenType50;
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes56 = null;
        org.jsoup.parser.Token.StartTag startTag57 = startTag54.nameAttr("EOF", attributes56);
        boolean boolean58 = startTag57.isDoctype();
        org.jsoup.parser.Token.EndTag endTag60 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes63 = null;
        org.jsoup.parser.Token.StartTag startTag64 = startTag61.nameAttr("EOF", attributes63);
        boolean boolean65 = startTag64.isDoctype();
        org.jsoup.parser.Token.Tag tag66 = startTag64.reset();
        startTag64.newAttribute();
        org.jsoup.nodes.Attributes attributes68 = startTag64.attributes;
        endTag60.attributes = attributes68;
        org.jsoup.parser.Token.StartTag startTag70 = startTag57.nameAttr("eof", attributes68);
        endTag26.attributes = attributes68;
        org.jsoup.parser.Token.StartTag startTag72 = startTag21.nameAttr("EOF", attributes68);
        org.jsoup.parser.Token.StartTag startTag73 = startTag6.nameAttr("</ >", attributes68);
        startTag73.appendTagName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "eof" + "'", str41, "eof");
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(startTag70);
        org.junit.Assert.assertNotNull(startTag72);
        org.junit.Assert.assertNotNull(startTag73);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        endTag0.tagName = "eof";
        java.lang.String str17 = endTag0.name();
        boolean boolean18 = endTag0.isComment();
        endTag0.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag21.nameAttr("EOF", attributes23);
        boolean boolean25 = startTag24.isDoctype();
        org.jsoup.parser.Token.Tag tag26 = startTag24.reset();
        java.lang.String str27 = startTag24.normalName;
        java.lang.String str28 = startTag24.normalName();
        startTag24.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag31.nameAttr("EOF", attributes33);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        boolean boolean40 = startTag39.isDoctype();
        org.jsoup.parser.Token.Tag tag41 = startTag39.reset();
        org.jsoup.parser.Token.StartTag startTag42 = tag41.asStartTag();
        org.jsoup.parser.Token.Tag tag43 = tag41.reset();
        org.jsoup.nodes.Attributes attributes44 = tag41.attributes;
        org.jsoup.parser.Token.StartTag startTag45 = startTag34.nameAttr("starttag", attributes44);
        org.jsoup.parser.Token.StartTag startTag46 = startTag24.nameAttr("", attributes44);
        endTag0.attributes = attributes44;
        endTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(startTag46);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        boolean boolean10 = comment0.bogus;
        org.jsoup.parser.Token token11 = comment0.reset();
        org.jsoup.parser.Token token12 = comment0.reset();
        java.lang.String str13 = comment0.getData();
        java.lang.StringBuilder stringBuilder14 = comment0.data;
        org.jsoup.parser.Token.Comment comment15 = comment0.asComment();
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(comment15);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        endTag9.selfClosing = true;
        org.jsoup.parser.Token.Tag tag19 = endTag9.name("hi!");
        endTag9.appendAttributeName('a');
        int[] intArray26 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag9.appendAttributeValue(intArray26);
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.finaliseTag();
        boolean boolean30 = endTag28.isCharacter();
        int[] intArray32 = new int[] { (short) 1 };
        endTag28.appendAttributeValue(intArray32);
        endTag9.appendAttributeValue(intArray32);
        tag8.appendAttributeValue(intArray32);
        boolean boolean36 = tag8.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        boolean boolean9 = startTag3.isEOF();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = endTag11.name("hi!");
        tag21.appendAttributeValue("eof");
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag24.nameAttr("EOF", attributes26);
        boolean boolean28 = startTag27.isDoctype();
        org.jsoup.parser.Token.Tag tag29 = startTag27.reset();
        org.jsoup.parser.Token.StartTag startTag30 = tag29.asStartTag();
        org.jsoup.parser.Token.Tag tag31 = tag29.reset();
        org.jsoup.nodes.Attributes attributes32 = tag29.attributes;
        tag21.attributes = attributes32;
        org.jsoup.parser.Token.StartTag startTag34 = startTag3.nameAttr("EndTag", attributes32);
        org.jsoup.parser.Token.Tag tag35 = startTag3.reset();
        startTag3.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = startTag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        boolean boolean9 = startTag6.isComment();
        java.lang.String str10 = startTag6.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EOF" + "'", str10, "EOF");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        int[] intArray4 = new int[] { (short) 1 };
        endTag0.appendAttributeValue(intArray4);
        endTag0.tagName = "<!---->";
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tag8.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = false;
        boolean boolean6 = comment0.bogus;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        int[] intArray10 = new int[] { 1, 10, 10 };
        endTag0.appendAttributeValue(intArray10);
        org.jsoup.parser.Token.Tag tag13 = endTag0.name("StartTag");
        endTag0.appendAttributeValue("eof");
        endTag0.appendTagName("</starttag>");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag8.nameAttr("EOF", attributes10);
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag8.nameAttr("EOF", attributes13);
        java.lang.String str15 = startTag8.normalName();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = startTag19.nameAttr("", attributes22);
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag19.type = tokenType24;
        startTag8.type = tokenType24;
        endTag0.type = tokenType24;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag28.nameAttr("EOF", attributes30);
        boolean boolean32 = startTag31.isDoctype();
        org.jsoup.parser.Token.Tag tag33 = startTag31.reset();
        java.lang.String str34 = startTag31.normalName;
        java.lang.String str35 = startTag31.normalName();
        startTag31.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes40 = null;
        org.jsoup.parser.Token.StartTag startTag41 = startTag38.nameAttr("EOF", attributes40);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = startTag43.nameAttr("EOF", attributes45);
        boolean boolean47 = startTag46.isDoctype();
        org.jsoup.parser.Token.Tag tag48 = startTag46.reset();
        org.jsoup.parser.Token.StartTag startTag49 = tag48.asStartTag();
        org.jsoup.parser.Token.Tag tag50 = tag48.reset();
        org.jsoup.nodes.Attributes attributes51 = tag48.attributes;
        org.jsoup.parser.Token.StartTag startTag52 = startTag41.nameAttr("starttag", attributes51);
        org.jsoup.parser.Token.StartTag startTag53 = startTag31.nameAttr("", attributes51);
        endTag0.attributes = attributes51;
        endTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes56 = endTag0.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment57 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eof" + "'", str15, "eof");
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertNotNull(attributes56);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token6 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        boolean boolean8 = endTag0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            endTag0.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.finaliseTag();
        endTag8.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        startTag22.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        endTag18.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = startTag15.nameAttr("eof", attributes26);
        endTag8.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag30 = startTag6.nameAttr("<!---->", attributes26);
        java.lang.String str31 = startTag30.tokenType();
        startTag30.appendAttributeValue("Comment");
        org.jsoup.nodes.Attributes attributes34 = startTag30.getAttributes();
        org.jsoup.parser.Token.Tag tag35 = startTag30.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character36 = startTag30.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.pubSysKey;
        boolean boolean9 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        tag10.normalName = "</hi!>";
        boolean boolean16 = tag10.isCharacter();
        java.lang.String str17 = tag10.name();
        tag10.appendTagName(' ');
        tag10.normalName = "</hi!#>";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token7 = doctype0.reset();
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        boolean boolean10 = comment0.bogus;
        org.jsoup.parser.Token token11 = comment0.reset();
        org.jsoup.parser.Token token12 = comment0.reset();
        java.lang.String str13 = comment0.getData();
        boolean boolean14 = comment0.bogus;
        java.lang.StringBuilder stringBuilder15 = comment0.data;
        java.lang.StringBuilder stringBuilder16 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        boolean boolean10 = comment0.bogus;
        org.jsoup.parser.Token token11 = comment0.reset();
        org.jsoup.parser.Token token12 = comment0.reset();
        java.lang.String str13 = comment0.getData();
        java.lang.StringBuilder stringBuilder14 = comment0.data;
        boolean boolean15 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("<starttag>");
        org.jsoup.parser.Token.Character character10 = character8.data("");
        boolean boolean11 = character8.isEOF();
        org.jsoup.parser.Token.Character character13 = character8.data("eof");
        org.jsoup.parser.Token.Character character15 = character13.data("</hi!#>");
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertNotNull(character15);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token8 = doctype0.reset();
        boolean boolean9 = token8.isEndTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        endTag0.normalName = "</ >";
        org.jsoup.parser.Token token9 = endTag0.reset();
        boolean boolean10 = token9.isEOF();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType4 = tag3.type;
        java.lang.String str5 = tag3.name();
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        boolean boolean9 = startTag3.isEOF();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = endTag11.name("hi!");
        tag21.appendAttributeValue("eof");
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag24.nameAttr("EOF", attributes26);
        boolean boolean28 = startTag27.isDoctype();
        org.jsoup.parser.Token.Tag tag29 = startTag27.reset();
        org.jsoup.parser.Token.StartTag startTag30 = tag29.asStartTag();
        org.jsoup.parser.Token.Tag tag31 = tag29.reset();
        org.jsoup.nodes.Attributes attributes32 = tag29.attributes;
        tag21.attributes = attributes32;
        org.jsoup.parser.Token.StartTag startTag34 = startTag3.nameAttr("EndTag", attributes32);
        org.jsoup.parser.Token.Tag tag35 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = startTag37.nameAttr("EOF", attributes39);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag42.nameAttr("EOF", attributes44);
        boolean boolean46 = startTag45.isDoctype();
        org.jsoup.parser.Token.Tag tag47 = startTag45.reset();
        org.jsoup.parser.Token.StartTag startTag48 = tag47.asStartTag();
        org.jsoup.parser.Token.Tag tag49 = tag47.reset();
        org.jsoup.nodes.Attributes attributes50 = tag47.attributes;
        org.jsoup.parser.Token.StartTag startTag51 = startTag40.nameAttr("starttag", attributes50);
        org.jsoup.parser.Token.StartTag startTag52 = startTag3.nameAttr("Comment", attributes50);
        startTag3.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertNotNull(startTag52);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.appendAttributeValue("eof");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        endTag9.selfClosing = true;
        org.jsoup.parser.Token.Tag tag19 = endTag9.name("hi!");
        endTag9.appendAttributeName('a');
        int[] intArray26 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag9.appendAttributeValue(intArray26);
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.finaliseTag();
        boolean boolean30 = endTag28.isCharacter();
        int[] intArray32 = new int[] { (short) 1 };
        endTag28.appendAttributeValue(intArray32);
        endTag9.appendAttributeValue(intArray32);
        tag8.appendAttributeValue(intArray32);
        tag8.appendAttributeName('a');
        tag8.tagName = "Doctype";
        java.lang.String str40 = tag8.tokenType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EndTag" + "'", str40, "EndTag");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName(' ');
        endTag0.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType6 = endTag0.type;
        endTag0.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str7 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str10 = doctype0.getPubSysKey();
        java.lang.String str11 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder13 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getName();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType8;
        boolean boolean10 = doctype0.forceQuirks;
        java.lang.String str11 = doctype0.pubSysKey;
        boolean boolean12 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character13 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag0.selfClosing = true;
        startTag0.appendTagName('4');
        org.junit.Assert.assertNotNull(startTag3);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.tagName = "<!---->";
        java.lang.String str7 = startTag3.tagName;
        startTag3.appendAttributeName('a');
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag14.nameAttr("", attributes17);
        boolean boolean19 = startTag18.isSelfClosing();
        java.lang.String str20 = startTag18.tagName;
        boolean boolean21 = startTag18.isEndTag();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.parser.Token.Tag tag28 = startTag26.reset();
        org.jsoup.parser.Token.StartTag startTag29 = tag28.asStartTag();
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.finaliseTag();
        endTag31.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = startTag35.nameAttr("EOF", attributes37);
        boolean boolean39 = startTag38.isDoctype();
        org.jsoup.parser.Token.EndTag endTag41 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag42.nameAttr("EOF", attributes44);
        boolean boolean46 = startTag45.isDoctype();
        org.jsoup.parser.Token.Tag tag47 = startTag45.reset();
        startTag45.newAttribute();
        org.jsoup.nodes.Attributes attributes49 = startTag45.attributes;
        endTag41.attributes = attributes49;
        org.jsoup.parser.Token.StartTag startTag51 = startTag38.nameAttr("eof", attributes49);
        endTag31.attributes = attributes49;
        org.jsoup.parser.Token.StartTag startTag53 = startTag29.nameAttr("<!---->", attributes49);
        org.jsoup.parser.Token.StartTag startTag54 = startTag18.nameAttr("starttag", attributes49);
        java.lang.String str55 = startTag54.toString();
        org.jsoup.nodes.Attributes attributes56 = startTag54.getAttributes();
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes59 = null;
        org.jsoup.parser.Token.StartTag startTag60 = startTag57.nameAttr("EOF", attributes59);
        boolean boolean61 = startTag60.isDoctype();
        org.jsoup.parser.Token.Tag tag62 = startTag60.reset();
        java.lang.String str63 = startTag60.normalName;
        java.lang.String str64 = startTag60.normalName();
        startTag60.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag66 = startTag60.reset();
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes70 = null;
        org.jsoup.parser.Token.StartTag startTag71 = startTag68.nameAttr("EOF", attributes70);
        boolean boolean72 = startTag71.isDoctype();
        org.jsoup.parser.Token.Tag tag73 = startTag71.reset();
        java.lang.String str74 = startTag71.normalName;
        java.lang.String str75 = startTag71.normalName();
        boolean boolean76 = startTag71.selfClosing;
        java.lang.String str77 = startTag71.tagName;
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes81 = null;
        org.jsoup.parser.Token.StartTag startTag82 = startTag79.nameAttr("EOF", attributes81);
        boolean boolean83 = startTag82.isDoctype();
        org.jsoup.parser.Token.Tag tag84 = startTag82.reset();
        org.jsoup.parser.Token.StartTag startTag85 = tag84.asStartTag();
        org.jsoup.parser.Token.Tag tag86 = tag84.reset();
        org.jsoup.nodes.Attributes attributes87 = tag84.attributes;
        org.jsoup.parser.Token.StartTag startTag88 = startTag71.nameAttr("", attributes87);
        org.jsoup.parser.Token.StartTag startTag89 = startTag60.nameAttr("", attributes87);
        org.jsoup.nodes.Attributes attributes90 = startTag60.attributes;
        startTag54.attributes = attributes90;
        org.jsoup.parser.Token.StartTag startTag92 = startTag3.nameAttr("<Comment>", attributes90);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<starttag>" + "'", str55, "<starttag>");
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(startTag71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(startTag82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertNotNull(startTag85);
        org.junit.Assert.assertNotNull(tag86);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(startTag88);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertNotNull(attributes90);
        org.junit.Assert.assertNotNull(startTag92);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.Comment;
        endTag0.type = tokenType15;
        endTag0.appendAttributeName("</hi!#>");
        endTag0.appendAttributeName(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.appendAttributeName("");
        org.jsoup.parser.Token token14 = endTag0.reset();
        boolean boolean15 = token14.isCharacter();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        tag6.appendTagName("starttag");
        tag6.newAttribute();
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.appendAttributeName(' ');
        tag10.setEmptyAttributeValue();
        tag10.appendTagName('4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        java.lang.String str11 = comment0.getData();
        boolean boolean12 = comment0.bogus;
        boolean boolean13 = comment0.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        boolean boolean15 = endTag0.isDoctype();
        endTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag18 = endTag0.name(" ");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        org.jsoup.parser.Token.StartTag startTag25 = tag24.asStartTag();
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        endTag27.finaliseTag();
        endTag27.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag31.nameAttr("EOF", attributes33);
        boolean boolean35 = startTag34.isDoctype();
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes40 = null;
        org.jsoup.parser.Token.StartTag startTag41 = startTag38.nameAttr("EOF", attributes40);
        boolean boolean42 = startTag41.isDoctype();
        org.jsoup.parser.Token.Tag tag43 = startTag41.reset();
        startTag41.newAttribute();
        org.jsoup.nodes.Attributes attributes45 = startTag41.attributes;
        endTag37.attributes = attributes45;
        org.jsoup.parser.Token.StartTag startTag47 = startTag34.nameAttr("eof", attributes45);
        endTag27.attributes = attributes45;
        org.jsoup.parser.Token.StartTag startTag49 = startTag25.nameAttr("<!---->", attributes45);
        startTag25.normalName = " ";
        org.jsoup.parser.Token.Tag tag52 = startTag25.reset();
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes56 = null;
        org.jsoup.parser.Token.StartTag startTag57 = startTag54.nameAttr("EOF", attributes56);
        boolean boolean58 = startTag57.isDoctype();
        org.jsoup.parser.Token.Tag tag59 = startTag57.reset();
        java.lang.String str60 = startTag57.normalName;
        java.lang.String str61 = startTag57.normalName();
        boolean boolean62 = startTag57.selfClosing;
        java.lang.String str63 = startTag57.tagName;
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = startTag65.nameAttr("EOF", attributes67);
        boolean boolean69 = startTag68.isDoctype();
        org.jsoup.parser.Token.Tag tag70 = startTag68.reset();
        org.jsoup.parser.Token.StartTag startTag71 = tag70.asStartTag();
        org.jsoup.parser.Token.Tag tag72 = tag70.reset();
        org.jsoup.nodes.Attributes attributes73 = tag70.attributes;
        org.jsoup.parser.Token.StartTag startTag74 = startTag57.nameAttr("", attributes73);
        org.jsoup.parser.Token.StartTag startTag75 = startTag25.nameAttr("EndTag", attributes73);
        endTag0.attributes = attributes73;
        endTag0.normalName = "EOF";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(startTag71);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(startTag74);
        org.junit.Assert.assertNotNull(startTag75);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        boolean boolean7 = tag5.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tag5.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.tagName;
        startTag7.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag13 = startTag7.reset();
        tag13.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag16.nameAttr("EOF", attributes21);
        org.jsoup.parser.Token.Tag tag23 = startTag16.reset();
        boolean boolean24 = startTag16.isSelfClosing();
        org.jsoup.parser.Token.Tag tag25 = startTag16.reset();
        boolean boolean26 = startTag16.isComment();
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.finaliseTag();
        endTag28.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag32.nameAttr("EOF", attributes34);
        boolean boolean36 = startTag35.isDoctype();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag39.nameAttr("EOF", attributes41);
        boolean boolean43 = startTag42.isDoctype();
        org.jsoup.parser.Token.Tag tag44 = startTag42.reset();
        startTag42.newAttribute();
        org.jsoup.nodes.Attributes attributes46 = startTag42.attributes;
        endTag38.attributes = attributes46;
        org.jsoup.parser.Token.StartTag startTag48 = startTag35.nameAttr("eof", attributes46);
        endTag28.attributes = attributes46;
        org.jsoup.parser.Token.StartTag startTag50 = startTag16.nameAttr("</hi!>", attributes46);
        tag13.attributes = attributes46;
        tag13.appendAttributeName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(startTag50);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        tag8.finaliseTag();
        java.lang.String str10 = tag8.tagName;
        java.lang.String str11 = tag8.normalName();
        org.jsoup.parser.Token.TokenType tokenType12 = tag8.type;
        tag8.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token.Character character7 = character0.data("Character");
        org.jsoup.parser.Token.Character character9 = character0.data("</hi!#>");
        boolean boolean10 = character0.isStartTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.String str8 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.TokenType tokenType2 = character0.type;
        java.lang.String str3 = character0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        doctype0.pubSysKey = " ";
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.toString();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</ >" + "'", str6, "</ >");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        int[] intArray10 = new int[] { 1, 10, 10 };
        endTag0.appendAttributeValue(intArray10);
        org.jsoup.parser.Token.Tag tag13 = endTag0.name("StartTag");
        org.jsoup.parser.Token.TokenType tokenType14 = tag13.type;
        tag13.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag();
        endTag17.appendAttributeValue(' ');
        char[] charArray22 = new char[] { ' ', ' ' };
        endTag17.appendAttributeValue(charArray22);
        org.jsoup.parser.Token.EndTag endTag24 = endTag17.asEndTag();
        char[] charArray30 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag17.appendAttributeValue(charArray30);
        tag13.appendAttributeValue(charArray30);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag24);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        boolean boolean10 = startTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.finaliseTag();
        endTag12.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.parser.Token.Tag tag28 = startTag26.reset();
        startTag26.newAttribute();
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        endTag22.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag32 = startTag19.nameAttr("eof", attributes30);
        endTag12.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag34 = startTag0.nameAttr("</hi!>", attributes30);
        org.jsoup.parser.Token.Tag tag35 = startTag34.reset();
        startTag34.appendTagName("<eof>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.pubSysKey;
        doctype0.pubSysKey = "starttag";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        java.lang.String str4 = comment0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype5 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        org.jsoup.nodes.Attributes attributes15 = endTag0.attributes;
        endTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(attributes15);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        java.lang.String str13 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        int[] intArray10 = new int[] { 1, 10, 10 };
        endTag0.appendAttributeValue(intArray10);
        org.jsoup.parser.Token.Tag tag13 = endTag0.name("StartTag");
        endTag0.appendAttributeValue("eof");
        java.lang.String str16 = endTag0.toString();
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "</StartTag>" + "'", str16, "</StartTag>");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.String str2 = comment0.getData();
        org.jsoup.parser.Token token3 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = token3.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(token3);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        startTag3.appendTagName('a');
        java.lang.String str11 = startTag3.normalName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        org.jsoup.parser.Token token9 = startTag7.reset();
        boolean boolean10 = startTag7.selfClosing;
        org.jsoup.nodes.Attributes attributes11 = startTag7.attributes;
        startTag7.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        boolean boolean2 = endTag0.selfClosing;
        org.jsoup.parser.Token.Character character3 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token4 = character3.reset();
        java.lang.String str5 = character3.toString();
        java.lang.String str6 = character3.getData();
        org.jsoup.parser.Token token7 = character3.reset();
        java.lang.String str8 = character3.toString();
        org.jsoup.parser.Token token9 = character3.reset();
        org.jsoup.parser.Token.Character character11 = character3.data("<!---->");
        org.jsoup.parser.Token token12 = character11.reset();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.appendAttributeValue(' ');
        char[] charArray18 = new char[] { ' ', ' ' };
        endTag13.appendAttributeValue(charArray18);
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag13.type = tokenType20;
        token12.type = tokenType20;
        endTag0.type = tokenType20;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        java.lang.String str9 = comment0.getData();
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes3 = endTag0.getAttributes();
        boolean boolean4 = endTag0.isDoctype();
        boolean boolean5 = endTag0.isEndTag();
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.appendAttributeName("</starttag>");
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str9 = doctype0.tokenType();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag3.toString();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.nodes.Attributes attributes6 = startTag3.getAttributes();
        org.jsoup.parser.Token.Tag tag7 = startTag3.reset();
        tag7.appendTagName("<!---->");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<EOF>" + "'", str4, "<EOF>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("hi!#");
        java.lang.String str7 = character6.getData();
        org.jsoup.parser.Token.Character character9 = character6.data("hi!#");
        org.jsoup.parser.Token token10 = character9.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!#" + "'", str7, "hi!#");
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName('#');
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.appendAttributeValue(' ');
        endTag4.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        endTag9.selfClosing = true;
        org.jsoup.parser.Token.Tag tag19 = endTag9.name("hi!");
        endTag9.appendAttributeName('a');
        int[] intArray26 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag9.appendAttributeValue(intArray26);
        endTag4.appendAttributeValue(intArray26);
        endTag0.appendAttributeValue(intArray26);
        org.jsoup.parser.Token.Tag tag30 = endTag0.reset();
        endTag0.tagName = "EndTag";
        org.jsoup.nodes.Attributes attributes33 = endTag0.getAttributes();
        java.lang.String str34 = endTag0.name();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        startTag35.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes38 = startTag35.attributes;
        endTag0.attributes = attributes38;
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(attributes33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EndTag" + "'", str34, "EndTag");
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        java.lang.String str4 = endTag0.normalName();
        char[] charArray7 = new char[] { 'a', 'a' };
        endTag0.appendAttributeValue(charArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a' });
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        boolean boolean2 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean5 = endTag0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag3.toString();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.nodes.Attributes attributes6 = startTag3.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = startTag3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<EOF>" + "'", str4, "<EOF>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        boolean boolean5 = character0.isDoctype();
        org.jsoup.parser.Token.Character character7 = character0.data("<starttag>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(character7);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        org.jsoup.nodes.Attributes attributes8 = tag5.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = tag5.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag12 = tag10.name("<EOF>");
        boolean boolean13 = tag10.isStartTag();
        tag10.selfClosing = true;
        java.lang.String str16 = tag10.name();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<EOF>" + "'", str16, "<EOF>");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.appendAttributeName(' ');
        tag10.setEmptyAttributeValue();
        boolean boolean16 = tag10.isSelfClosing();
        tag10.appendAttributeName("<EOF >");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        tag10.normalName = "</hi!>";
        boolean boolean16 = tag10.isCharacter();
        boolean boolean17 = tag10.isStartTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isComment();
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token token4 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype5 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        doctype0.pubSysKey = " ";
        java.lang.String str8 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        org.jsoup.parser.Token token9 = startTag7.reset();
        org.jsoup.nodes.Attributes attributes10 = startTag7.attributes;
        startTag7.appendAttributeName('4');
        java.lang.String str13 = startTag7.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag3.type = tokenType8;
        org.jsoup.nodes.Attributes attributes10 = startTag3.getAttributes();
        boolean boolean11 = startTag3.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = startTag3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        org.jsoup.parser.Token token9 = character8.reset();
        java.lang.String str10 = character8.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token8 = doctype0.reset();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.finaliseTag();
        endTag8.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        startTag22.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        endTag18.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = startTag15.nameAttr("eof", attributes26);
        endTag8.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag30 = startTag6.nameAttr("<!---->", attributes26);
        java.lang.String str31 = startTag30.tokenType();
        org.jsoup.parser.Token.Tag tag32 = startTag30.reset();
        startTag30.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = startTag30.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertNotNull(tag32);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        boolean boolean11 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        java.lang.String str13 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        java.lang.String str16 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.appendAttributeValue("4");
        boolean boolean9 = endTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag10 = endTag0.asEndTag();
        boolean boolean11 = endTag10.isComment();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(endTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = startTag1.nameAttr("EOF", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        org.jsoup.parser.Token.Tag tag6 = startTag4.reset();
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        endTag0.attributes = attributes8;
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.appendAttributeValue(' ');
        char[] charArray15 = new char[] { ' ', ' ' };
        endTag10.appendAttributeValue(charArray15);
        endTag10.selfClosing = true;
        org.jsoup.parser.Token.Tag tag20 = endTag10.name("hi!");
        boolean boolean21 = tag20.isEndTag();
        org.jsoup.parser.Token token22 = tag20.reset();
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        boolean boolean24 = endTag23.isSelfClosing();
        endTag23.normalName = "";
        endTag23.finaliseTag();
        org.jsoup.nodes.Attributes attributes28 = endTag23.attributes;
        endTag23.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag31 = endTag23.reset();
        org.jsoup.parser.Token.Tag tag32 = endTag23.reset();
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        boolean boolean34 = endTag33.isSelfClosing();
        endTag33.normalName = "";
        boolean boolean37 = endTag33.selfClosing;
        org.jsoup.parser.Token.Tag tag39 = endTag33.name("eof");
        org.jsoup.parser.Token.Tag tag41 = endTag33.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        endTag42.appendAttributeValue(' ');
        char[] charArray47 = new char[] { ' ', ' ' };
        endTag42.appendAttributeValue(charArray47);
        endTag42.selfClosing = true;
        org.jsoup.parser.Token.Tag tag52 = endTag42.name("hi!");
        endTag42.appendAttributeName('a');
        int[] intArray59 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag42.appendAttributeValue(intArray59);
        org.jsoup.parser.Token.EndTag endTag61 = new org.jsoup.parser.Token.EndTag();
        endTag61.finaliseTag();
        boolean boolean63 = endTag61.isCharacter();
        int[] intArray65 = new int[] { (short) 1 };
        endTag61.appendAttributeValue(intArray65);
        endTag42.appendAttributeValue(intArray65);
        tag41.appendAttributeValue(intArray65);
        tag32.appendAttributeValue(intArray65);
        tag20.appendAttributeValue(intArray65);
        endTag0.appendAttributeValue(intArray65);
        endTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(token22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(attributes28);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 1 });
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isComment();
        org.jsoup.parser.Token token6 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = token6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        boolean boolean8 = doctype6.isForceQuirks();
        java.lang.String str9 = doctype6.getSystemIdentifier();
        org.jsoup.parser.Token token10 = doctype6.reset();
        boolean boolean11 = token10.isComment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getName();
        org.jsoup.parser.Token token11 = doctype0.reset();
        doctype0.pubSysKey = "Doctype";
        java.lang.StringBuilder stringBuilder14 = doctype0.systemIdentifier;
        java.lang.String str15 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.newAttribute();
        boolean boolean6 = endTag0.isCharacter();
        endTag0.appendTagName('#');
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        endTag0.tagName = "eof";
        endTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag19 = endTag0.name("#");
        endTag0.appendAttributeValue("a");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character22 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        endTag0.appendAttributeName("");
        endTag0.appendAttributeName('a');
        java.lang.String str7 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        boolean boolean10 = startTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.finaliseTag();
        endTag12.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.parser.Token.Tag tag28 = startTag26.reset();
        startTag26.newAttribute();
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        endTag22.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag32 = startTag19.nameAttr("eof", attributes30);
        endTag12.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag34 = startTag0.nameAttr("</hi!>", attributes30);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        java.lang.String str36 = comment35.getData();
        java.lang.StringBuilder stringBuilder37 = comment35.data;
        java.lang.String str38 = comment35.toString();
        org.jsoup.parser.Token.EndTag endTag39 = new org.jsoup.parser.Token.EndTag();
        endTag39.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag42.nameAttr("EOF", attributes44);
        boolean boolean46 = startTag45.isDoctype();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag45.nameAttr("", attributes48);
        org.jsoup.parser.Token.TokenType tokenType50 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag45.type = tokenType50;
        endTag39.type = tokenType50;
        comment35.type = tokenType50;
        org.jsoup.parser.Token token54 = comment35.reset();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = startTag55.nameAttr("EOF", attributes57);
        org.jsoup.nodes.Attributes attributes60 = null;
        org.jsoup.parser.Token.StartTag startTag61 = startTag55.nameAttr("EOF", attributes60);
        java.lang.String str62 = startTag55.normalName();
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes65 = null;
        org.jsoup.parser.Token.StartTag startTag66 = startTag63.nameAttr("EOF", attributes65);
        boolean boolean67 = startTag66.isDoctype();
        org.jsoup.nodes.Attributes attributes69 = null;
        org.jsoup.parser.Token.StartTag startTag70 = startTag66.nameAttr("", attributes69);
        org.jsoup.parser.Token.TokenType tokenType71 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag66.type = tokenType71;
        startTag55.type = tokenType71;
        token54.type = tokenType71;
        startTag0.type = tokenType71;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype76 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token54);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "eof" + "'", str62, "eof");
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(startTag70);
        org.junit.Assert.assertTrue("'" + tokenType71 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType71.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        boolean boolean9 = tag7.isCharacter();
        org.jsoup.parser.Token.Tag tag10 = tag7.reset();
        tag7.normalName = "eof";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        boolean boolean5 = character0.isDoctype();
        java.lang.String str6 = character0.toString();
        java.lang.String str7 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token token8 = endTag0.reset();
        endTag0.tagName = "";
        boolean boolean11 = endTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag10.nameAttr("EOF", attributes12);
        boolean boolean14 = startTag13.isDoctype();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag13.nameAttr("", attributes16);
        boolean boolean18 = startTag17.isSelfClosing();
        java.lang.String str19 = startTag17.tagName;
        boolean boolean20 = startTag17.isEndTag();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.isDoctype();
        org.jsoup.parser.Token.Tag tag27 = startTag25.reset();
        org.jsoup.parser.Token.StartTag startTag28 = tag27.asStartTag();
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        endTag30.finaliseTag();
        endTag30.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("EOF", attributes36);
        boolean boolean38 = startTag37.isDoctype();
        org.jsoup.parser.Token.EndTag endTag40 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag41.nameAttr("EOF", attributes43);
        boolean boolean45 = startTag44.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag44.reset();
        startTag44.newAttribute();
        org.jsoup.nodes.Attributes attributes48 = startTag44.attributes;
        endTag40.attributes = attributes48;
        org.jsoup.parser.Token.StartTag startTag50 = startTag37.nameAttr("eof", attributes48);
        endTag30.attributes = attributes48;
        org.jsoup.parser.Token.StartTag startTag52 = startTag28.nameAttr("<!---->", attributes48);
        org.jsoup.parser.Token.StartTag startTag53 = startTag17.nameAttr("starttag", attributes48);
        org.jsoup.parser.Token.StartTag startTag54 = startTag7.nameAttr("EOF", attributes48);
        org.jsoup.nodes.Attributes attributes55 = startTag7.getAttributes();
        startTag7.appendAttributeName('#');
        startTag7.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertNotNull(attributes55);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes8 = endTag0.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        endTag14.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag19.selfClosing = true;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("hi!");
        endTag19.appendAttributeName('a');
        int[] intArray36 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag19.appendAttributeValue(intArray36);
        endTag14.appendAttributeValue(intArray36);
        endTag0.appendAttributeValue(intArray36);
        org.jsoup.parser.Token token40 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag42 = endTag0.name("Comment");
        boolean boolean43 = tag42.selfClosing;
        tag42.appendAttributeValue(' ');
        tag42.appendAttributeValue('4');
        boolean boolean48 = tag42.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        endTag0.appendAttributeName("EOF");
        endTag0.appendAttributeName("Doctype");
        boolean boolean18 = endTag0.selfClosing;
        java.lang.String str19 = endTag0.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "</hi!>" + "'", str19, "</hi!>");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        java.lang.String str9 = endTag0.tagName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName("EOF");
        org.jsoup.nodes.Attributes attributes13 = endTag0.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(attributes13);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isCharacter();
        boolean boolean7 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        comment0.bogus = false;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        java.lang.String str9 = startTag7.tagName;
        boolean boolean10 = startTag7.isEndTag();
        java.lang.String str11 = startTag7.normalName();
        startTag7.setEmptyAttributeValue();
        java.lang.Class<?> wildcardClass13 = startTag7.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        boolean boolean4 = doctype0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        endTag14.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag19.selfClosing = true;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("hi!");
        endTag19.appendAttributeName('a');
        int[] intArray36 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag19.appendAttributeValue(intArray36);
        endTag14.appendAttributeValue(intArray36);
        endTag0.appendAttributeValue(intArray36);
        org.jsoup.parser.Token token40 = endTag0.reset();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag41.nameAttr("EOF", attributes43);
        boolean boolean45 = startTag44.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag44.reset();
        java.lang.String str47 = startTag44.normalName;
        java.lang.String str48 = startTag44.normalName();
        boolean boolean49 = startTag44.selfClosing;
        java.lang.String str50 = startTag44.tagName;
        boolean boolean51 = startTag44.isEOF();
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag();
        endTag52.appendAttributeValue(' ');
        char[] charArray57 = new char[] { ' ', ' ' };
        endTag52.appendAttributeValue(charArray57);
        endTag52.selfClosing = true;
        org.jsoup.parser.Token.Tag tag62 = endTag52.name("hi!");
        endTag52.appendAttributeName('a');
        int[] intArray69 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag52.appendAttributeValue(intArray69);
        org.jsoup.parser.Token.EndTag endTag71 = new org.jsoup.parser.Token.EndTag();
        endTag71.finaliseTag();
        boolean boolean73 = endTag71.isCharacter();
        int[] intArray75 = new int[] { (short) 1 };
        endTag71.appendAttributeValue(intArray75);
        endTag52.appendAttributeValue(intArray75);
        startTag44.appendAttributeValue(intArray75);
        endTag0.appendAttributeValue(intArray75);
        endTag0.appendAttributeName(' ');
        endTag0.appendAttributeName("Character");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 1 });
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        boolean boolean10 = startTag6.selfClosing;
        startTag6.appendAttributeName("");
        startTag6.appendAttributeName("<EOF >");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        endTag14.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag19.selfClosing = true;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("hi!");
        endTag19.appendAttributeName('a');
        int[] intArray36 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag19.appendAttributeValue(intArray36);
        endTag14.appendAttributeValue(intArray36);
        endTag0.appendAttributeValue(intArray36);
        org.jsoup.parser.Token token40 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag42 = endTag0.name("Comment");
        boolean boolean43 = tag42.selfClosing;
        tag42.appendAttributeValue(' ');
        tag42.selfClosing = false;
        org.jsoup.nodes.Attributes attributes48 = tag42.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(attributes48);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType5 = doctype0.type;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.tagName;
        startTag7.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag13.nameAttr("EOF", attributes18);
        java.lang.String str20 = startTag13.normalName();
        java.lang.String str21 = startTag13.tokenType();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.isDoctype();
        org.jsoup.parser.Token.Tag tag27 = startTag25.reset();
        java.lang.String str28 = startTag25.normalName;
        java.lang.String str29 = startTag25.normalName();
        boolean boolean30 = startTag25.selfClosing;
        java.lang.String str31 = startTag25.tagName;
        boolean boolean32 = startTag25.isEOF();
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        endTag33.appendAttributeValue(' ');
        char[] charArray38 = new char[] { ' ', ' ' };
        endTag33.appendAttributeValue(charArray38);
        endTag33.selfClosing = true;
        org.jsoup.parser.Token.Tag tag43 = endTag33.name("hi!");
        endTag33.appendAttributeName('a');
        int[] intArray50 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag33.appendAttributeValue(intArray50);
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag();
        endTag52.finaliseTag();
        boolean boolean54 = endTag52.isCharacter();
        int[] intArray56 = new int[] { (short) 1 };
        endTag52.appendAttributeValue(intArray56);
        endTag33.appendAttributeValue(intArray56);
        startTag25.appendAttributeValue(intArray56);
        startTag13.appendAttributeValue(intArray56);
        startTag7.appendAttributeValue(intArray56);
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes65 = null;
        org.jsoup.parser.Token.StartTag startTag66 = startTag63.nameAttr("EOF", attributes65);
        boolean boolean67 = startTag66.isDoctype();
        org.jsoup.parser.Token.Tag tag68 = startTag66.reset();
        org.jsoup.parser.Token.StartTag startTag69 = tag68.asStartTag();
        org.jsoup.parser.Token.EndTag endTag71 = new org.jsoup.parser.Token.EndTag();
        endTag71.finaliseTag();
        endTag71.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes77 = null;
        org.jsoup.parser.Token.StartTag startTag78 = startTag75.nameAttr("EOF", attributes77);
        boolean boolean79 = startTag78.isDoctype();
        org.jsoup.parser.Token.EndTag endTag81 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag82 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes84 = null;
        org.jsoup.parser.Token.StartTag startTag85 = startTag82.nameAttr("EOF", attributes84);
        boolean boolean86 = startTag85.isDoctype();
        org.jsoup.parser.Token.Tag tag87 = startTag85.reset();
        startTag85.newAttribute();
        org.jsoup.nodes.Attributes attributes89 = startTag85.attributes;
        endTag81.attributes = attributes89;
        org.jsoup.parser.Token.StartTag startTag91 = startTag78.nameAttr("eof", attributes89);
        endTag71.attributes = attributes89;
        org.jsoup.parser.Token.StartTag startTag93 = startTag69.nameAttr("<!---->", attributes89);
        org.jsoup.parser.Token.StartTag startTag94 = startTag7.nameAttr("</starttag>", attributes89);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eof" + "'", str20, "eof");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "StartTag" + "'", str21, "StartTag");
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 1 });
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertNotNull(startTag69);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(startTag85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(tag87);
        org.junit.Assert.assertNotNull(attributes89);
        org.junit.Assert.assertNotNull(startTag91);
        org.junit.Assert.assertNotNull(startTag93);
        org.junit.Assert.assertNotNull(startTag94);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token token8 = endTag0.reset();
        org.jsoup.parser.Token.TokenType tokenType9 = endTag0.type;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag10.nameAttr("EOF", attributes12);
        boolean boolean14 = startTag13.isDoctype();
        java.lang.String str15 = startTag13.toString();
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        endTag16.appendAttributeValue(' ');
        endTag16.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag();
        endTag21.appendAttributeValue(' ');
        char[] charArray26 = new char[] { ' ', ' ' };
        endTag21.appendAttributeValue(charArray26);
        endTag21.selfClosing = true;
        org.jsoup.parser.Token.Tag tag31 = endTag21.name("hi!");
        endTag21.appendAttributeName('a');
        int[] intArray38 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag21.appendAttributeValue(intArray38);
        endTag16.appendAttributeValue(intArray38);
        org.jsoup.parser.Token.EndTag endTag41 = new org.jsoup.parser.Token.EndTag();
        endTag41.finaliseTag();
        boolean boolean43 = endTag41.isCharacter();
        int[] intArray45 = new int[] { (short) 1 };
        endTag41.appendAttributeValue(intArray45);
        endTag16.appendAttributeValue(intArray45);
        startTag13.appendAttributeValue(intArray45);
        endTag0.appendAttributeValue(intArray45);
        boolean boolean50 = endTag0.isStartTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<EOF>" + "'", str15, "<EOF>");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        java.lang.Class<?> wildcardClass11 = stringBuilder10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        tag3.selfClosing = false;
        tag3.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = token5.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag7.reset();
        org.jsoup.nodes.Attributes attributes12 = startTag7.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag10.nameAttr("EOF", attributes12);
        boolean boolean14 = startTag13.isDoctype();
        org.jsoup.parser.Token.Tag tag15 = startTag13.reset();
        java.lang.String str16 = startTag13.normalName;
        java.lang.String str17 = startTag13.normalName();
        boolean boolean18 = startTag13.selfClosing;
        java.lang.String str19 = startTag13.tagName;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag21.nameAttr("EOF", attributes23);
        boolean boolean25 = startTag24.isDoctype();
        org.jsoup.parser.Token.Tag tag26 = startTag24.reset();
        org.jsoup.parser.Token.StartTag startTag27 = tag26.asStartTag();
        org.jsoup.parser.Token.Tag tag28 = tag26.reset();
        org.jsoup.nodes.Attributes attributes29 = tag26.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = startTag13.nameAttr("", attributes29);
        org.jsoup.parser.Token.StartTag startTag31 = startTag0.nameAttr("eof", attributes29);
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("EOF", attributes36);
        boolean boolean38 = startTag37.isDoctype();
        org.jsoup.parser.Token.Tag tag39 = startTag37.reset();
        startTag37.newAttribute();
        org.jsoup.nodes.Attributes attributes41 = startTag37.attributes;
        endTag33.attributes = attributes41;
        org.jsoup.parser.Token.StartTag startTag43 = startTag31.nameAttr("</StartTag>", attributes41);
        startTag31.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(startTag43);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName("Doctype");
        java.lang.String str3 = startTag0.normalName();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.bogus;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.appendAttributeValue("4");
        boolean boolean9 = endTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag10 = endTag0.asEndTag();
        endTag0.appendAttributeName('#');
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(endTag10);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token token5 = character0.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        endTag0.appendTagName("<hi!>");
        endTag0.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        boolean boolean15 = endTag0.isDoctype();
        endTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag18 = endTag0.name(" ");
        endTag0.appendTagName("<<!---->>");
        boolean boolean21 = endTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        org.jsoup.parser.Token token9 = character8.reset();
        java.lang.String str10 = character8.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.parser.Token.Tag tag12 = startTag10.reset();
        startTag10.newAttribute();
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        endTag6.attributes = attributes14;
        org.jsoup.parser.Token.StartTag startTag16 = startTag3.nameAttr("eof", attributes14);
        boolean boolean17 = startTag3.isEOF();
        org.jsoup.nodes.Attributes attributes18 = startTag3.attributes;
        startTag3.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag20 = startTag3.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes10 = endTag0.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        boolean boolean6 = comment0.bogus;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        boolean boolean10 = startTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.finaliseTag();
        endTag12.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.parser.Token.Tag tag28 = startTag26.reset();
        startTag26.newAttribute();
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        endTag22.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag32 = startTag19.nameAttr("eof", attributes30);
        endTag12.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag34 = startTag0.nameAttr("</hi!>", attributes30);
        org.jsoup.parser.Token.Tag tag36 = startTag34.name("<starttag>");
        java.lang.String str37 = tag36.normalName();
        java.lang.String str38 = tag36.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<starttag>" + "'", str37, "<starttag>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<starttag>" + "'", str38, "<starttag>");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character4 = character2.data("Doctype");
        java.lang.String str5 = character2.getData();
        boolean boolean6 = character2.isComment();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        endTag0.appendTagName('a');
        boolean boolean12 = endTag0.isCharacter();
        boolean boolean13 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag15 = endTag0.name("EndTag");
        tag15.appendAttributeName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        boolean boolean14 = tag10.isDoctype();
        org.jsoup.nodes.Attributes attributes15 = tag10.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(attributes15);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        java.lang.String str10 = doctype0.pubSysKey;
        boolean boolean11 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName("Doctype");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.jsoup.parser.Token token9 = comment0.reset();
        boolean boolean10 = comment0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        boolean boolean5 = character0.isDoctype();
        java.lang.String str6 = character0.getData();
        java.lang.String str7 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("eof");
        java.lang.String str11 = tag10.name();
        tag10.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = tag10.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getName();
        org.jsoup.parser.Token token11 = doctype0.reset();
        doctype0.pubSysKey = "Doctype";
        java.lang.String str14 = doctype0.getSystemIdentifier();
        java.lang.String str15 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder16 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token17 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(token17);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        java.lang.String str9 = character8.toString();
        java.lang.String str10 = character8.getData();
        org.jsoup.parser.Token.Character character11 = character8.asCharacter();
        org.jsoup.parser.Token.Character character13 = character8.data(" ");
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(character13);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        boolean boolean7 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        endTag9.selfClosing = true;
        org.jsoup.parser.Token.Tag tag19 = endTag9.name("hi!");
        endTag9.appendAttributeName('a');
        int[] intArray26 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag9.appendAttributeValue(intArray26);
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.finaliseTag();
        boolean boolean30 = endTag28.isCharacter();
        int[] intArray32 = new int[] { (short) 1 };
        endTag28.appendAttributeValue(intArray32);
        endTag9.appendAttributeValue(intArray32);
        tag8.appendAttributeValue(intArray32);
        tag8.tagName = "Character";
        org.jsoup.parser.Token token38 = tag8.reset();
        tag8.normalName = "eof";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1 });
        org.junit.Assert.assertNotNull(token38);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        org.jsoup.nodes.Attributes attributes14 = tag10.attributes;
        tag10.appendAttributeName('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.pubSysKey;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType8;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        java.lang.String str11 = doctype0.getSystemIdentifier();
        java.lang.String str12 = doctype0.getName();
        java.lang.String str13 = doctype0.getName();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag7.setEmptyAttributeValue();
        org.jsoup.parser.Token token15 = endTag7.reset();
        org.jsoup.parser.Token.TokenType tokenType16 = endTag7.type;
        character0.type = tokenType16;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment18 = character0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        boolean boolean4 = comment3.bogus;
        java.lang.String str5 = comment3.getData();
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        boolean boolean8 = endTag7.selfClosing;
        boolean boolean9 = endTag7.selfClosing;
        endTag7.setEmptyAttributeValue();
        endTag7.tagName = " ";
        java.lang.String str13 = endTag7.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</ >" + "'", str13, "</ >");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag11 = tag9.name("<!---->");
        org.jsoup.parser.Token.EndTag endTag12 = tag11.asEndTag();
        boolean boolean13 = endTag12.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(endTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendTagName("EndTag");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("EndTag");
        tag8.appendAttributeName('4');
        char[] charArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tag8.appendAttributeValue(charArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        java.lang.String str9 = startTag3.tagName;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        org.jsoup.parser.Token.Tag tag16 = startTag14.reset();
        org.jsoup.parser.Token.StartTag startTag17 = tag16.asStartTag();
        org.jsoup.parser.Token.Tag tag18 = tag16.reset();
        org.jsoup.nodes.Attributes attributes19 = tag16.attributes;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("", attributes19);
        startTag3.normalName = "";
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        endTag23.appendAttributeValue(' ');
        char[] charArray28 = new char[] { ' ', ' ' };
        endTag23.appendAttributeValue(charArray28);
        org.jsoup.parser.Token.EndTag endTag30 = endTag23.asEndTag();
        char[] charArray36 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag23.appendAttributeValue(charArray36);
        startTag3.appendAttributeValue(charArray36);
        org.jsoup.nodes.Attributes attributes39 = startTag3.attributes;
        boolean boolean40 = startTag3.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = startTag3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag30);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#', '#', ' ', 'a', ' ' });
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("#");
        org.jsoup.parser.Token.Character character11 = character9.data("eof");
        org.jsoup.parser.Token.Character character13 = character9.data("4");
        org.jsoup.parser.Token token14 = character13.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        org.jsoup.parser.Token token10 = comment0.reset();
        java.lang.String str11 = comment0.toString();
        comment0.bogus = false;
        boolean boolean14 = comment0.isDoctype();
        java.lang.String str15 = comment0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype16 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.toString();
        comment0.bogus = true;
        java.lang.String str11 = comment0.toString();
        java.lang.String str12 = comment0.toString();
        java.lang.StringBuilder stringBuilder13 = comment0.data;
        java.lang.StringBuilder stringBuilder14 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = startTag1.nameAttr("EOF", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        org.jsoup.parser.Token.Tag tag6 = startTag4.reset();
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        endTag0.attributes = attributes8;
        boolean boolean10 = endTag0.isEndTag();
        endTag0.appendAttributeName("eof");
        boolean boolean13 = endTag0.isEndTag();
        endTag0.appendAttributeValue("");
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        boolean boolean2 = comment0.bogus;
        org.jsoup.parser.Token token3 = comment0.reset();
        boolean boolean4 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("eof");
        java.lang.String str11 = tag10.name();
        java.lang.String str12 = tag10.tagName;
        boolean boolean13 = tag10.isStartTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        org.jsoup.parser.Token token9 = startTag7.reset();
        java.lang.String str10 = startTag7.normalName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = startTag7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token8 = doctype0.reset();
        doctype0.forceQuirks = false;
        java.lang.String str11 = doctype0.getPublicIdentifier();
        java.lang.String str12 = doctype0.getName();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.appendAttributeName(' ');
        tag10.setEmptyAttributeValue();
        boolean boolean16 = tag10.isSelfClosing();
        java.lang.String str17 = tag10.normalName();
        boolean boolean18 = tag10.isComment();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = endTag0.reset();
        tag6.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = tag6.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token token8 = endTag0.reset();
        boolean boolean9 = endTag0.isStartTag();
        org.jsoup.parser.Token.EndTag endTag10 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(endTag10);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.appendAttributeValue(' ');
        char[] charArray15 = new char[] { ' ', ' ' };
        endTag10.appendAttributeValue(charArray15);
        endTag10.selfClosing = true;
        org.jsoup.parser.Token.Tag tag20 = endTag10.name("hi!");
        boolean boolean21 = endTag10.isStartTag();
        endTag10.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(' ');
        endTag24.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.appendAttributeValue(' ');
        char[] charArray34 = new char[] { ' ', ' ' };
        endTag29.appendAttributeValue(charArray34);
        endTag29.selfClosing = true;
        org.jsoup.parser.Token.Tag tag39 = endTag29.name("hi!");
        endTag29.appendAttributeName('a');
        int[] intArray46 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag29.appendAttributeValue(intArray46);
        endTag24.appendAttributeValue(intArray46);
        endTag10.appendAttributeValue(intArray46);
        org.jsoup.parser.Token token50 = endTag10.reset();
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes53 = null;
        org.jsoup.parser.Token.StartTag startTag54 = startTag51.nameAttr("EOF", attributes53);
        boolean boolean55 = startTag54.isDoctype();
        org.jsoup.parser.Token.Tag tag56 = startTag54.reset();
        java.lang.String str57 = startTag54.normalName;
        org.jsoup.parser.Token token58 = startTag54.reset();
        org.jsoup.parser.Token.TokenType tokenType59 = startTag54.type;
        token50.type = tokenType59;
        startTag0.type = tokenType59;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token50);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(token58);
        org.junit.Assert.assertTrue("'" + tokenType59 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType59.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        boolean boolean5 = startTag3.isSelfClosing();
        java.lang.String str6 = startTag3.tagName;
        java.lang.String str7 = startTag3.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        endTag0.appendAttributeName("");
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("<EOF>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.String str9 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token9 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag10 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        boolean boolean6 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        tag6.normalName = "hi!";
        tag6.setEmptyAttributeValue();
        tag6.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }
}

