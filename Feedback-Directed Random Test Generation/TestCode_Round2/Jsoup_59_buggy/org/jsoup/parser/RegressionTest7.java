package org.jsoup.parser;

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
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        boolean boolean7 = comment0.isCharacter();
        boolean boolean8 = comment0.bogus;
        java.lang.String str9 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        boolean boolean2 = endTag0.selfClosing;
        boolean boolean3 = endTag0.isDoctype();
        endTag0.appendAttributeName(" ");
        endTag0.normalName = "Doctype";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        endTag0.normalName = "EOF";
        boolean boolean19 = endTag0.isSelfClosing();
        org.jsoup.parser.Token token20 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag21 = endTag0.reset();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token10 = doctype0.reset();
        boolean boolean11 = doctype0.isComment();
        java.lang.String str12 = doctype0.pubSysKey;
        boolean boolean13 = doctype0.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        java.lang.String str19 = endTag0.normalName;
        java.lang.String str20 = endTag0.toString();
        org.jsoup.parser.Token.Tag tag22 = endTag0.name("</eofa>");
        org.jsoup.parser.Token token23 = tag22.reset();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "</hi!>" + "'", str20, "</hi!>");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(token23);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.isStartTag();
        java.lang.String str8 = endTag0.tokenType();
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag10 = endTag0.reset();
        endTag0.appendAttributeValue("<hi!>");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EndTag" + "'", str8, "EndTag");
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        org.jsoup.parser.Token token4 = comment3.reset();
        comment3.bogus = false;
        java.lang.StringBuilder stringBuilder7 = comment3.data;
        boolean boolean8 = comment3.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        startTag0.selfClosing = false;
        boolean boolean32 = startTag0.isSelfClosing();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        org.jsoup.parser.Token token12 = doctype0.reset();
        java.lang.String str13 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder14 = doctype0.systemIdentifier;
        doctype0.pubSysKey = "</eofa>";
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
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.tagName;
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        endTag0.appendAttributeName("</ >");
        endTag0.appendTagName("EOF ");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        boolean boolean2 = endTag0.selfClosing;
        endTag0.setEmptyAttributeValue();
        boolean boolean4 = endTag0.isSelfClosing();
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        tag8.finaliseTag();
        tag8.appendTagName("</hi!>");
        java.lang.String str12 = tag8.normalName;
        tag8.appendTagName("a");
        tag8.appendAttributeName("hi!endtag");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!</hi!>" + "'", str12, "hi!</hi!>");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.pubSysKey;
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.finaliseTag();
        endTag8.appendAttributeName('#');
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.appendAttributeValue(' ');
        endTag12.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag();
        endTag17.appendAttributeValue(' ');
        char[] charArray22 = new char[] { ' ', ' ' };
        endTag17.appendAttributeValue(charArray22);
        endTag17.selfClosing = true;
        org.jsoup.parser.Token.Tag tag27 = endTag17.name("hi!");
        endTag17.appendAttributeName('a');
        int[] intArray34 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag17.appendAttributeValue(intArray34);
        endTag12.appendAttributeValue(intArray34);
        endTag8.appendAttributeValue(intArray34);
        org.jsoup.parser.Token.Tag tag38 = endTag8.reset();
        endTag8.tagName = "EndTag";
        org.jsoup.nodes.Attributes attributes41 = endTag8.getAttributes();
        org.jsoup.parser.Token.Comment comment42 = new org.jsoup.parser.Token.Comment();
        java.lang.String str43 = comment42.toString();
        comment42.bogus = false;
        org.jsoup.parser.Token token46 = comment42.reset();
        org.jsoup.parser.Token token47 = comment42.reset();
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.getData();
        java.lang.StringBuilder stringBuilder50 = comment48.data;
        java.lang.String str51 = comment48.toString();
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag();
        endTag52.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = startTag55.nameAttr("EOF", attributes57);
        boolean boolean59 = startTag58.isDoctype();
        org.jsoup.nodes.Attributes attributes61 = null;
        org.jsoup.parser.Token.StartTag startTag62 = startTag58.nameAttr("", attributes61);
        org.jsoup.parser.Token.TokenType tokenType63 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag58.type = tokenType63;
        endTag52.type = tokenType63;
        comment48.type = tokenType63;
        comment42.type = tokenType63;
        endTag8.type = tokenType63;
        doctype0.type = tokenType63;
        org.jsoup.parser.Token token70 = doctype0.reset();
        java.lang.String str71 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder74 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNull(attributes41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertNotNull(token46);
        org.junit.Assert.assertNotNull(token47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<!---->" + "'", str51, "<!---->");
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertTrue("'" + tokenType63 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType63.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        java.lang.String str9 = doctype8.getSystemIdentifier();
        java.lang.String str10 = doctype8.getName();
        boolean boolean11 = doctype8.isComment();
        java.lang.StringBuilder stringBuilder12 = doctype8.name;
        boolean boolean13 = doctype8.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        org.jsoup.parser.Token.Tag tag35 = startTag30.reset();
        tag35.appendAttributeName(" hi!");
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
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.Tag tag10 = tag8.name("<starttag>");
        tag10.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        boolean boolean9 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        java.lang.String str11 = doctype0.getPubSysKey();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag12.nameAttr("EOF", attributes17);
        org.jsoup.parser.Token.Tag tag19 = startTag12.reset();
        boolean boolean20 = startTag12.isSelfClosing();
        org.jsoup.parser.Token.Tag tag21 = startTag12.reset();
        boolean boolean22 = startTag12.isComment();
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.finaliseTag();
        endTag24.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag28.nameAttr("EOF", attributes30);
        boolean boolean32 = startTag31.isDoctype();
        org.jsoup.parser.Token.EndTag endTag34 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = startTag35.nameAttr("EOF", attributes37);
        boolean boolean39 = startTag38.isDoctype();
        org.jsoup.parser.Token.Tag tag40 = startTag38.reset();
        startTag38.newAttribute();
        org.jsoup.nodes.Attributes attributes42 = startTag38.attributes;
        endTag34.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag44 = startTag31.nameAttr("eof", attributes42);
        endTag24.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag46 = startTag12.nameAttr("</hi!>", attributes42);
        org.jsoup.parser.Token.Comment comment47 = new org.jsoup.parser.Token.Comment();
        java.lang.String str48 = comment47.getData();
        java.lang.StringBuilder stringBuilder49 = comment47.data;
        java.lang.String str50 = comment47.toString();
        org.jsoup.parser.Token.EndTag endTag51 = new org.jsoup.parser.Token.EndTag();
        endTag51.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes56 = null;
        org.jsoup.parser.Token.StartTag startTag57 = startTag54.nameAttr("EOF", attributes56);
        boolean boolean58 = startTag57.isDoctype();
        org.jsoup.nodes.Attributes attributes60 = null;
        org.jsoup.parser.Token.StartTag startTag61 = startTag57.nameAttr("", attributes60);
        org.jsoup.parser.Token.TokenType tokenType62 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag57.type = tokenType62;
        endTag51.type = tokenType62;
        comment47.type = tokenType62;
        org.jsoup.parser.Token token66 = comment47.reset();
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes69 = null;
        org.jsoup.parser.Token.StartTag startTag70 = startTag67.nameAttr("EOF", attributes69);
        org.jsoup.nodes.Attributes attributes72 = null;
        org.jsoup.parser.Token.StartTag startTag73 = startTag67.nameAttr("EOF", attributes72);
        java.lang.String str74 = startTag67.normalName();
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes77 = null;
        org.jsoup.parser.Token.StartTag startTag78 = startTag75.nameAttr("EOF", attributes77);
        boolean boolean79 = startTag78.isDoctype();
        org.jsoup.nodes.Attributes attributes81 = null;
        org.jsoup.parser.Token.StartTag startTag82 = startTag78.nameAttr("", attributes81);
        org.jsoup.parser.Token.TokenType tokenType83 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag78.type = tokenType83;
        startTag67.type = tokenType83;
        token66.type = tokenType83;
        startTag12.type = tokenType83;
        doctype0.type = tokenType83;
        boolean boolean89 = doctype0.isEOF();
        doctype0.pubSysKey = "</##>";
        boolean boolean92 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!---->" + "'", str50, "<!---->");
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertTrue("'" + tokenType62 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType62.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token66);
        org.junit.Assert.assertNotNull(startTag70);
        org.junit.Assert.assertNotNull(startTag73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "eof" + "'", str74, "eof");
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(startTag82);
        org.junit.Assert.assertTrue("'" + tokenType83 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType83.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        startTag0.newAttribute();
        boolean boolean11 = startTag0.selfClosing;
        startTag0.selfClosing = true;
        java.lang.String str14 = startTag0.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        endTag0.appendAttributeName("eof");
        endTag0.appendAttributeName('a');
        endTag0.tagName = "eof";
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(' ');
        char[] charArray25 = new char[] { ' ', ' ' };
        endTag20.appendAttributeValue(charArray25);
        endTag20.selfClosing = true;
        org.jsoup.parser.Token.Tag tag30 = endTag20.name("hi!");
        endTag20.appendAttributeName('a');
        endTag20.appendTagName(' ');
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
        endTag20.appendAttributeValue(intArray57);
        endTag0.appendAttributeValue(intArray57);
        endTag0.appendAttributeName("</<!---->4>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag64 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        boolean boolean10 = startTag3.isDoctype();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag7.reset();
        startTag7.appendAttributeName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        tag10.normalName = "</hi!>";
        tag10.newAttribute();
        tag10.appendTagName("</hi!>");
        java.lang.String str19 = tag10.tagName;
        java.lang.String str20 = tag10.normalName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!</hi!>" + "'", str19, "hi!</hi!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!</hi!>" + "'", str20, "hi!</hi!>");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        java.lang.String str11 = doctype6.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag27.nameAttr("EOF", attributes29);
        boolean boolean31 = startTag30.isDoctype();
        org.jsoup.parser.Token.Tag tag32 = startTag30.reset();
        startTag30.newAttribute();
        org.jsoup.nodes.Attributes attributes34 = startTag30.attributes;
        endTag26.attributes = attributes34;
        org.jsoup.parser.Token.EndTag endTag36 = new org.jsoup.parser.Token.EndTag();
        endTag36.appendAttributeValue(' ');
        char[] charArray41 = new char[] { ' ', ' ' };
        endTag36.appendAttributeValue(charArray41);
        endTag36.selfClosing = true;
        org.jsoup.parser.Token.Tag tag46 = endTag36.name("hi!");
        boolean boolean47 = tag46.isEndTag();
        org.jsoup.parser.Token token48 = tag46.reset();
        org.jsoup.parser.Token.EndTag endTag49 = new org.jsoup.parser.Token.EndTag();
        boolean boolean50 = endTag49.isSelfClosing();
        endTag49.normalName = "";
        endTag49.finaliseTag();
        org.jsoup.nodes.Attributes attributes54 = endTag49.attributes;
        endTag49.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag57 = endTag49.reset();
        org.jsoup.parser.Token.Tag tag58 = endTag49.reset();
        org.jsoup.parser.Token.EndTag endTag59 = new org.jsoup.parser.Token.EndTag();
        boolean boolean60 = endTag59.isSelfClosing();
        endTag59.normalName = "";
        boolean boolean63 = endTag59.selfClosing;
        org.jsoup.parser.Token.Tag tag65 = endTag59.name("eof");
        org.jsoup.parser.Token.Tag tag67 = endTag59.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag68 = new org.jsoup.parser.Token.EndTag();
        endTag68.appendAttributeValue(' ');
        char[] charArray73 = new char[] { ' ', ' ' };
        endTag68.appendAttributeValue(charArray73);
        endTag68.selfClosing = true;
        org.jsoup.parser.Token.Tag tag78 = endTag68.name("hi!");
        endTag68.appendAttributeName('a');
        int[] intArray85 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag68.appendAttributeValue(intArray85);
        org.jsoup.parser.Token.EndTag endTag87 = new org.jsoup.parser.Token.EndTag();
        endTag87.finaliseTag();
        boolean boolean89 = endTag87.isCharacter();
        int[] intArray91 = new int[] { (short) 1 };
        endTag87.appendAttributeValue(intArray91);
        endTag68.appendAttributeValue(intArray91);
        tag67.appendAttributeValue(intArray91);
        tag58.appendAttributeValue(intArray91);
        tag46.appendAttributeValue(intArray91);
        endTag26.appendAttributeValue(intArray91);
        endTag0.appendAttributeValue(intArray91);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1 });
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(token48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(attributes54);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { 1 });
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.appendAttributeValue("4");
        endTag0.setEmptyAttributeValue();
        java.lang.String str10 = endTag0.tokenType();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EndTag" + "'", str10, "EndTag");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        boolean boolean16 = comment0.bogus;
        java.lang.String str17 = comment0.getData();
        java.lang.String str18 = comment0.getData();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        startTag0.appendAttributeValue("</</hi!#>>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        java.lang.String str10 = startTag0.toString();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        boolean boolean12 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.nameAttr("EOF", attributes16);
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag14.nameAttr("EOF", attributes19);
        startTag20.selfClosing = false;
        java.lang.String str23 = startTag20.tokenType();
        java.lang.String str24 = startTag20.normalName();
        startTag20.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag27.nameAttr("EOF", attributes29);
        boolean boolean31 = startTag30.isDoctype();
        boolean boolean32 = startTag30.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag33 = startTag30.asStartTag();
        org.jsoup.parser.Token.TokenType tokenType34 = startTag33.type;
        org.jsoup.parser.Token.EndTag endTag36 = new org.jsoup.parser.Token.EndTag();
        endTag36.finaliseTag();
        boolean boolean38 = endTag36.isCharacter();
        int[] intArray40 = new int[] { (short) 1 };
        endTag36.appendAttributeValue(intArray40);
        endTag36.tagName = "<!---->";
        endTag36.finaliseTag();
        endTag36.appendTagName('4');
        boolean boolean47 = endTag36.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType48 = org.jsoup.parser.Token.TokenType.EOF;
        endTag36.type = tokenType48;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = startTag50.nameAttr("EOF", attributes52);
        boolean boolean54 = startTag53.isDoctype();
        org.jsoup.parser.Token.Tag tag55 = startTag53.reset();
        org.jsoup.parser.Token.StartTag startTag56 = tag55.asStartTag();
        startTag56.selfClosing = false;
        org.jsoup.parser.Token.Tag tag59 = startTag56.reset();
        org.jsoup.parser.Token.Tag tag60 = startTag56.reset();
        org.jsoup.nodes.Attributes attributes61 = tag60.getAttributes();
        endTag36.attributes = attributes61;
        org.jsoup.parser.Token.StartTag startTag63 = startTag33.nameAttr("comment", attributes61);
        org.jsoup.parser.Token.StartTag startTag64 = startTag20.nameAttr("</eof>", attributes61);
        org.jsoup.parser.Token.StartTag startTag65 = startTag0.nameAttr("<#>", attributes61);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "eof" + "'", str24, "eof");
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + tokenType48 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType48.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(startTag65);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPubSysKey();
        doctype0.pubSysKey = "";
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        startTag6.appendTagName("<!---->4");
        boolean boolean11 = startTag6.isComment();
        boolean boolean12 = startTag6.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = startTag6.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        endTag0.appendTagName(" ");
        boolean boolean18 = endTag0.isDoctype();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        boolean boolean12 = endTag11.isSelfClosing();
        endTag11.normalName = "";
        endTag11.finaliseTag();
        boolean boolean16 = endTag11.selfClosing;
        endTag11.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag19.nameAttr("EOF", attributes24);
        java.lang.String str26 = startTag19.normalName();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag27.nameAttr("EOF", attributes29);
        boolean boolean31 = startTag30.isDoctype();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag30.nameAttr("", attributes33);
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag30.type = tokenType35;
        startTag19.type = tokenType35;
        endTag11.type = tokenType35;
        endTag11.tagName = "";
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag41.nameAttr("EOF", attributes43);
        boolean boolean45 = startTag44.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag44.reset();
        org.jsoup.parser.Token.StartTag startTag47 = tag46.asStartTag();
        org.jsoup.parser.Token.Tag tag48 = tag46.reset();
        org.jsoup.nodes.Attributes attributes49 = tag46.attributes;
        endTag11.attributes = attributes49;
        org.jsoup.nodes.Attributes attributes51 = endTag11.attributes;
        org.jsoup.parser.Token.StartTag startTag52 = startTag6.nameAttr("<<starttag>>", attributes51);
        org.jsoup.parser.Token.TokenType tokenType53 = startTag6.type;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "eof" + "'", str26, "eof");
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        endTag0.appendAttributeName("eof");
        endTag0.appendAttributeName('a');
        boolean boolean18 = endTag0.isDoctype();
        boolean boolean19 = endTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        tag6.appendTagName("starttag");
        org.jsoup.parser.Token.Tag tag10 = tag6.name("</ >");
        tag6.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getName();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean13 = doctype0.isForceQuirks();
        java.lang.String str14 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token9 = doctype0.reset();
        boolean boolean10 = token9.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        java.lang.String str7 = comment6.getData();
        org.jsoup.parser.Token token8 = comment6.reset();
        java.lang.String str9 = comment6.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        boolean boolean11 = comment0.bogus;
        org.jsoup.parser.Token token12 = comment0.reset();
        java.lang.String str13 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        java.lang.String str21 = comment0.toString();
        java.lang.String str22 = comment0.getData();
        java.lang.String str23 = comment0.toString();
        java.lang.StringBuilder stringBuilder24 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        startTag3.appendAttributeName('a');
        java.lang.String str17 = startTag3.toString();
        java.lang.String str18 = startTag3.tokenType();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<starttag>" + "'", str17, "<starttag>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StartTag" + "'", str18, "StartTag");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        java.lang.String str9 = doctype8.getSystemIdentifier();
        java.lang.String str10 = doctype8.getPubSysKey();
        java.lang.String str11 = doctype8.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token9 = doctype0.reset();
        boolean boolean10 = doctype0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getName();
        org.jsoup.parser.Token token10 = doctype0.reset();
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        boolean boolean44 = startTag43.selfClosing;
        org.jsoup.parser.Token.Tag tag45 = startTag43.reset();
        org.jsoup.parser.Token.Tag tag46 = startTag43.reset();
        startTag43.appendAttributeName("<<!---->>");
        startTag43.tagName = "comment";
        boolean boolean51 = startTag43.selfClosing;
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag7 = tag6.asStartTag();
        startTag7.appendAttributeName("<hi!>");
        org.jsoup.parser.Token.Tag tag10 = startTag7.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        java.lang.StringBuilder stringBuilder13 = doctype0.systemIdentifier;
        java.lang.String str14 = doctype0.pubSysKey;
        boolean boolean15 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "eof" + "'", str14, "eof");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.String str2 = comment0.getData();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        boolean boolean4 = character0.isEndTag();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.toString();
        boolean boolean7 = character0.isEndTag();
        java.lang.String str8 = character0.getData();
        org.jsoup.parser.Token.Character character10 = character0.data("<a>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(character10);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token6 = doctype0.reset();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getName();
        java.lang.String str9 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType12 = endTag0.type;
        boolean boolean13 = endTag0.isCharacter();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        boolean boolean36 = tag8.isSelfClosing();
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
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.appendAttributeValue(' ');
        boolean boolean14 = endTag0.isSelfClosing();
        endTag0.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag();
        endTag17.appendAttributeValue(' ');
        char[] charArray22 = new char[] { ' ', ' ' };
        endTag17.appendAttributeValue(charArray22);
        endTag17.selfClosing = true;
        org.jsoup.parser.Token.Tag tag27 = endTag17.name("hi!");
        tag27.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag30 = tag27.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType31 = endTag30.type;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag32.nameAttr("EOF", attributes34);
        boolean boolean36 = startTag35.isDoctype();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag35.nameAttr("", attributes38);
        org.jsoup.parser.Token.Tag tag40 = startTag39.reset();
        startTag39.appendTagName('4');
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        boolean boolean45 = endTag44.isSelfClosing();
        endTag44.normalName = "";
        endTag44.finaliseTag();
        boolean boolean49 = endTag44.selfClosing;
        endTag44.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = startTag52.nameAttr("EOF", attributes54);
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = startTag52.nameAttr("EOF", attributes57);
        java.lang.String str59 = startTag52.normalName();
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes62 = null;
        org.jsoup.parser.Token.StartTag startTag63 = startTag60.nameAttr("EOF", attributes62);
        boolean boolean64 = startTag63.isDoctype();
        org.jsoup.nodes.Attributes attributes66 = null;
        org.jsoup.parser.Token.StartTag startTag67 = startTag63.nameAttr("", attributes66);
        org.jsoup.parser.Token.TokenType tokenType68 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag63.type = tokenType68;
        startTag52.type = tokenType68;
        endTag44.type = tokenType68;
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes74 = null;
        org.jsoup.parser.Token.StartTag startTag75 = startTag72.nameAttr("EOF", attributes74);
        boolean boolean76 = startTag75.isDoctype();
        org.jsoup.parser.Token.EndTag endTag78 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes81 = null;
        org.jsoup.parser.Token.StartTag startTag82 = startTag79.nameAttr("EOF", attributes81);
        boolean boolean83 = startTag82.isDoctype();
        org.jsoup.parser.Token.Tag tag84 = startTag82.reset();
        startTag82.newAttribute();
        org.jsoup.nodes.Attributes attributes86 = startTag82.attributes;
        endTag78.attributes = attributes86;
        org.jsoup.parser.Token.StartTag startTag88 = startTag75.nameAttr("eof", attributes86);
        endTag44.attributes = attributes86;
        org.jsoup.parser.Token.StartTag startTag90 = startTag39.nameAttr("EOF", attributes86);
        endTag30.attributes = attributes86;
        endTag0.attributes = attributes86;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(endTag30);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "eof" + "'", str59, "eof");
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(startTag67);
        org.junit.Assert.assertTrue("'" + tokenType68 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType68.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(startTag82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertNotNull(attributes86);
        org.junit.Assert.assertNotNull(startTag88);
        org.junit.Assert.assertNotNull(startTag90);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag6.reset();
        org.jsoup.nodes.Attributes attributes11 = tag10.getAttributes();
        org.jsoup.parser.Token token12 = tag10.reset();
        tag10.tagName = "<!---->";
        tag10.appendTagName("doctype");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag3.toString();
        startTag3.selfClosing = false;
        org.jsoup.nodes.Attributes attributes7 = startTag3.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<EOF>" + "'", str4, "<EOF>");
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        tag10.appendTagName("EndTag");
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.finaliseTag();
        boolean boolean21 = endTag19.isCharacter();
        int[] intArray23 = new int[] { (short) 1 };
        endTag19.appendAttributeValue(intArray23);
        tag10.appendAttributeValue(intArray23);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1 });
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        startTag0.tagName = "Comment";
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        boolean boolean9 = doctype0.isComment();
        doctype0.pubSysKey = "<</StartTag>>";
        java.lang.String str12 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("<starttag>");
        org.jsoup.parser.Token.Character character10 = character8.data("");
        java.lang.String str11 = character8.toString();
        org.jsoup.parser.Token.Character character13 = character8.data("</StartTag>");
        org.jsoup.parser.Token.Character character15 = character13.data("<!---->");
        java.lang.String str16 = character13.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertNotNull(character15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getName();
        org.jsoup.parser.Token token9 = doctype0.reset();
        doctype0.pubSysKey = "</a>";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag53.nameAttr("EOF", attributes55);
        boolean boolean57 = startTag56.isDoctype();
        org.jsoup.parser.Token.Tag tag58 = startTag56.reset();
        org.jsoup.parser.Token.Tag tag59 = tag58.reset();
        tag59.setEmptyAttributeValue();
        tag59.finaliseTag();
        boolean boolean62 = tag59.isEOF();
        org.jsoup.parser.Token.TokenType tokenType63 = tag59.type;
        startTag52.type = tokenType63;
        org.jsoup.parser.Token.StartTag startTag65 = startTag52.asStartTag();
        startTag65.appendAttributeName('a');
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
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + tokenType63 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType63.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag65);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        tag6.finaliseTag();
        tag6.appendAttributeName('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = tag6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        boolean boolean15 = endTag0.isEndTag();
        org.jsoup.parser.Token.Tag tag16 = endTag0.reset();
        java.lang.String str17 = tag16.normalName;
        tag16.appendAttributeName(" ");
        tag16.selfClosing = true;
        tag16.appendAttributeName("</hi!>");
        boolean boolean24 = tag16.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag7.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        java.lang.String str8 = doctype6.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
        boolean boolean8 = doctype0.isStartTag();
        boolean boolean9 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token token12 = doctype0.reset();
        java.lang.String str13 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token token7 = startTag3.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        org.jsoup.parser.Token.Tag tag16 = startTag14.reset();
        org.jsoup.parser.Token.StartTag startTag17 = tag16.asStartTag();
        startTag17.selfClosing = false;
        org.jsoup.parser.Token.Tag tag20 = startTag17.reset();
        org.jsoup.parser.Token.Tag tag21 = startTag17.reset();
        org.jsoup.nodes.Attributes attributes22 = tag21.getAttributes();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag23.nameAttr("EOF", attributes28);
        java.lang.String str30 = startTag23.normalName();
        startTag23.newAttribute();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag33.nameAttr("EOF", attributes35);
        boolean boolean37 = startTag36.isDoctype();
        org.jsoup.parser.Token.Tag tag38 = startTag36.reset();
        java.lang.String str39 = startTag36.normalName;
        java.lang.String str40 = startTag36.normalName();
        boolean boolean41 = startTag36.selfClosing;
        java.lang.String str42 = startTag36.tagName;
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.parser.Token.StartTag startTag47 = startTag44.nameAttr("EOF", attributes46);
        boolean boolean48 = startTag47.isDoctype();
        org.jsoup.parser.Token.Tag tag49 = startTag47.reset();
        org.jsoup.parser.Token.StartTag startTag50 = tag49.asStartTag();
        org.jsoup.parser.Token.Tag tag51 = tag49.reset();
        org.jsoup.nodes.Attributes attributes52 = tag49.attributes;
        org.jsoup.parser.Token.StartTag startTag53 = startTag36.nameAttr("", attributes52);
        org.jsoup.parser.Token.StartTag startTag54 = startTag23.nameAttr("eof", attributes52);
        org.jsoup.parser.Token.EndTag endTag56 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes59 = null;
        org.jsoup.parser.Token.StartTag startTag60 = startTag57.nameAttr("EOF", attributes59);
        boolean boolean61 = startTag60.isDoctype();
        org.jsoup.parser.Token.Tag tag62 = startTag60.reset();
        startTag60.newAttribute();
        org.jsoup.nodes.Attributes attributes64 = startTag60.attributes;
        endTag56.attributes = attributes64;
        org.jsoup.parser.Token.StartTag startTag66 = startTag54.nameAttr("</StartTag>", attributes64);
        tag21.attributes = attributes64;
        org.jsoup.parser.Token.StartTag startTag68 = startTag3.nameAttr("</hi!>", attributes64);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "eof" + "'", str30, "eof");
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertNotNull(startTag68);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isEOF();
        doctype0.forceQuirks = true;
        java.lang.String str12 = doctype0.getSystemIdentifier();
        java.lang.String str13 = doctype0.getName();
        boolean boolean14 = doctype0.isEndTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        boolean boolean12 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        boolean boolean12 = doctype8.isDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("<starttag>");
        org.jsoup.parser.Token.Character character10 = character8.data("");
        boolean boolean11 = character8.isEOF();
        org.jsoup.parser.Token.Character character13 = character8.data("eof");
        org.jsoup.parser.Token token14 = character13.reset();
        org.jsoup.parser.Token.Character character16 = character13.data("<<</hi!>>>");
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNotNull(character16);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        java.lang.String str12 = doctype0.getName();
        doctype0.forceQuirks = false;
        java.lang.String str15 = doctype0.getPublicIdentifier();
        java.lang.String str16 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        tag5.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        java.lang.String str31 = startTag6.normalName();
        startTag6.tagName = "</</hi!#>>";
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        org.jsoup.parser.Token token8 = endTag0.reset();
        endTag0.appendTagName('#');
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        org.jsoup.parser.Token.EndTag endTag18 = endTag11.asEndTag();
        char[] charArray24 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag11.appendAttributeValue(charArray24);
        endTag0.appendAttributeValue(charArray24);
        java.lang.Class<?> wildcardClass27 = charArray24.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#', '#', ' ', 'a', ' ' });
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character5 = token4.asCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = token4.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character5);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        boolean boolean9 = tag7.isCharacter();
        tag7.appendAttributeValue("character");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        endTag0.appendAttributeName(' ');
        endTag0.selfClosing = true;
        endTag0.tagName = "hi!";
        endTag0.normalName = "eof";
        java.lang.String str24 = endTag0.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "</hi!>" + "'", str24, "</hi!>");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getName();
        boolean boolean10 = doctype0.isForceQuirks();
        java.lang.String str11 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        java.lang.String str13 = doctype0.pubSysKey;
        java.lang.String str14 = doctype0.getName();
        java.lang.String str15 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        boolean boolean3 = comment0.bogus;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.getData();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        java.lang.StringBuilder stringBuilder13 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder13);
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
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.tagName = "<!---->";
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.parser.Token.Tag tag12 = startTag10.reset();
        java.lang.String str13 = startTag10.normalName;
        java.lang.String str14 = startTag10.normalName();
        boolean boolean15 = startTag10.selfClosing;
        java.lang.String str16 = startTag10.tagName;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag18.nameAttr("EOF", attributes20);
        boolean boolean22 = startTag21.isDoctype();
        org.jsoup.parser.Token.Tag tag23 = startTag21.reset();
        org.jsoup.parser.Token.StartTag startTag24 = tag23.asStartTag();
        org.jsoup.parser.Token.Tag tag25 = tag23.reset();
        org.jsoup.nodes.Attributes attributes26 = tag23.attributes;
        org.jsoup.parser.Token.StartTag startTag27 = startTag10.nameAttr("", attributes26);
        startTag10.normalName = "";
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        endTag30.appendAttributeValue(' ');
        char[] charArray35 = new char[] { ' ', ' ' };
        endTag30.appendAttributeValue(charArray35);
        org.jsoup.parser.Token.EndTag endTag37 = endTag30.asEndTag();
        char[] charArray43 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag30.appendAttributeValue(charArray43);
        startTag10.appendAttributeValue(charArray43);
        startTag3.appendAttributeValue(charArray43);
        org.jsoup.parser.Token.TokenType tokenType47 = startTag3.type;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag37);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '#', '#', ' ', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType47 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType47.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        org.jsoup.nodes.Attributes attributes8 = endTag0.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType9 = endTag0.type;
        org.jsoup.nodes.Attributes attributes10 = endTag0.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        tag10.normalName = "";
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
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.String str7 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.forceQuirks;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        java.lang.String str11 = doctype0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Doctype" + "'", str11, "Doctype");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        org.jsoup.parser.Token.Tag tag33 = startTag6.reset();
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
        org.junit.Assert.assertNotNull(tag33);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isComment();
        java.lang.String str3 = comment0.toString();
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        org.jsoup.parser.Token.Doctype doctype12 = token10.asDoctype();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.appendAttributeValue(' ');
        char[] charArray18 = new char[] { ' ', ' ' };
        endTag13.appendAttributeValue(charArray18);
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag13.type = tokenType20;
        org.jsoup.parser.Token.TokenType tokenType22 = endTag13.type;
        doctype12.type = tokenType22;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        doctype6.forceQuirks = false;
        java.lang.String str10 = doctype6.getName();
        boolean boolean11 = doctype6.forceQuirks;
        doctype6.pubSysKey = "<</hi!>>";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        org.jsoup.parser.Token.Tag tag16 = tag14.name("EOF");
        java.lang.String str17 = tag14.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        java.lang.String str9 = endTag0.normalName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.appendAttributeName('#');
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType3 = comment0.type;
        java.lang.String str4 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character0.data("<hi!>");
        java.lang.String str9 = character8.toString();
        org.jsoup.parser.Token.Character character11 = character8.data("<EOF>");
        org.jsoup.parser.Token token12 = character11.reset();
        org.jsoup.parser.Token.Character character14 = character11.data("<4>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(character14);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token1 = eOF0.reset();
        org.jsoup.parser.Token token2 = eOF0.reset();
        boolean boolean3 = eOF0.isEOF();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        boolean boolean10 = endTag9.isSelfClosing();
        endTag9.normalName = "";
        java.lang.String str13 = endTag9.normalName();
        char[] charArray16 = new char[] { 'a', 'a' };
        endTag9.appendAttributeValue(charArray16);
        tag8.appendAttributeValue(charArray16);
        org.jsoup.nodes.Attributes attributes19 = tag8.attributes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tag8.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        tag17.selfClosing = false;
        boolean boolean20 = tag17.selfClosing;
        tag17.tagName = "<eof4>";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.Class<?> wildcardClass7 = stringBuilder6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        boolean boolean9 = endTag0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        boolean boolean10 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
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
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token.Character character8 = character0.asCharacter();
        java.lang.String str9 = character8.getData();
        java.lang.String str10 = character8.toString();
        org.jsoup.parser.Token.Character character11 = character8.asCharacter();
        java.lang.String str12 = character11.toString();
        org.jsoup.parser.Token token13 = character11.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag20 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        endTag0.appendAttributeValue('4');
        endTag0.appendAttributeName('4');
        endTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character24 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        java.lang.String str16 = tag13.name();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag17.nameAttr("EOF", attributes19);
        boolean boolean21 = startTag20.isDoctype();
        org.jsoup.parser.Token.Tag tag22 = startTag20.reset();
        java.lang.String str23 = startTag20.normalName;
        java.lang.String str24 = startTag20.normalName();
        boolean boolean25 = startTag20.selfClosing;
        boolean boolean26 = startTag20.isDoctype();
        startTag20.appendTagName('4');
        boolean boolean29 = startTag20.isEndTag();
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        endTag30.appendAttributeValue(' ');
        char[] charArray35 = new char[] { ' ', ' ' };
        endTag30.appendAttributeValue(charArray35);
        endTag30.selfClosing = true;
        org.jsoup.parser.Token.Tag tag40 = endTag30.name("hi!");
        endTag30.appendAttributeName('a');
        endTag30.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag();
        endTag45.appendAttributeValue(' ');
        endTag45.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag50 = new org.jsoup.parser.Token.EndTag();
        endTag50.appendAttributeValue(' ');
        char[] charArray55 = new char[] { ' ', ' ' };
        endTag50.appendAttributeValue(charArray55);
        endTag50.selfClosing = true;
        org.jsoup.parser.Token.Tag tag60 = endTag50.name("hi!");
        endTag50.appendAttributeName('a');
        int[] intArray67 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag50.appendAttributeValue(intArray67);
        endTag45.appendAttributeValue(intArray67);
        endTag30.appendAttributeValue(intArray67);
        startTag20.appendAttributeValue(intArray67);
        tag13.appendAttributeValue(intArray67);
        tag13.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#" + "'", str16, "#");
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        boolean boolean14 = startTag7.isEOF();
        java.lang.String str15 = startTag7.name();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#" + "'", str15, "#");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        org.jsoup.parser.Token token19 = comment0.reset();
        java.lang.StringBuilder stringBuilder20 = comment0.data;
        org.jsoup.parser.Token token21 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(token21);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        java.lang.String str50 = startTag6.toString();
        startTag6.appendAttributeValue(' ');
        startTag6.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag56 = startTag6.name("</eofa>");
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<hi!>" + "'", str50, "<hi!>");
        org.junit.Assert.assertNotNull(tag56);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        startTag11.appendAttributeName("");
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag17.nameAttr("EOF", attributes19);
        boolean boolean21 = startTag20.isDoctype();
        org.jsoup.parser.Token.Tag tag22 = startTag20.reset();
        org.jsoup.parser.Token.StartTag startTag23 = tag22.asStartTag();
        startTag23.appendAttributeValue('4');
        startTag23.appendTagName("<!---->4");
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.appendAttributeValue(' ');
        char[] charArray33 = new char[] { ' ', ' ' };
        endTag28.appendAttributeValue(charArray33);
        endTag28.selfClosing = true;
        org.jsoup.parser.Token.Tag tag38 = endTag28.name("hi!");
        tag38.appendAttributeValue("eof");
        boolean boolean41 = tag38.isEOF();
        tag38.normalName = "</hi!>";
        tag38.appendAttributeValue("</StartTag>");
        org.jsoup.parser.Token.TokenType tokenType46 = tag38.type;
        startTag23.type = tokenType46;
        startTag23.finaliseTag();
        boolean boolean49 = startTag23.selfClosing;
        org.jsoup.nodes.Attributes attributes50 = startTag23.getAttributes();
        org.jsoup.parser.Token.StartTag startTag51 = startTag11.nameAttr("</</eof>>", attributes50);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(startTag51);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        org.jsoup.nodes.Attributes attributes43 = null;
        tag42.attributes = attributes43;
        boolean boolean45 = tag42.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype46 = tag42.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        java.lang.String str35 = startTag34.toString();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<EndTag>" + "'", str35, "<EndTag>");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
        boolean boolean8 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype10 = doctype0.asDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype10);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        org.jsoup.parser.Token token33 = startTag6.reset();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = startTag35.nameAttr("EOF", attributes37);
        boolean boolean39 = startTag38.isDoctype();
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag38.nameAttr("", attributes41);
        org.jsoup.parser.Token.Tag tag43 = startTag42.reset();
        org.jsoup.parser.Token.Tag tag44 = startTag42.reset();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag46.nameAttr("EOF", attributes48);
        org.jsoup.nodes.Attributes attributes51 = null;
        org.jsoup.parser.Token.StartTag startTag52 = startTag46.nameAttr("EOF", attributes51);
        java.lang.String str53 = startTag46.normalName();
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes56 = null;
        org.jsoup.parser.Token.StartTag startTag57 = startTag54.nameAttr("EOF", attributes56);
        boolean boolean58 = startTag57.isDoctype();
        org.jsoup.nodes.Attributes attributes60 = null;
        org.jsoup.parser.Token.StartTag startTag61 = startTag57.nameAttr("", attributes60);
        org.jsoup.parser.Token.TokenType tokenType62 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag57.type = tokenType62;
        startTag46.type = tokenType62;
        org.jsoup.parser.Token.Tag tag65 = startTag46.reset();
        org.jsoup.nodes.Attributes attributes66 = startTag46.attributes;
        org.jsoup.parser.Token.StartTag startTag67 = startTag42.nameAttr("</hi!#>", attributes66);
        startTag42.selfClosing = false;
        startTag42.newAttribute();
        startTag42.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag73 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes75 = null;
        org.jsoup.parser.Token.StartTag startTag76 = startTag73.nameAttr("EOF", attributes75);
        boolean boolean77 = startTag76.isDoctype();
        org.jsoup.nodes.Attributes attributes79 = null;
        org.jsoup.parser.Token.StartTag startTag80 = startTag76.nameAttr("", attributes79);
        boolean boolean81 = startTag80.isSelfClosing();
        org.jsoup.parser.Token token82 = startTag80.reset();
        org.jsoup.nodes.Attributes attributes83 = startTag80.attributes;
        org.jsoup.parser.Token.StartTag startTag84 = startTag42.nameAttr("<<!---->>", attributes83);
        org.jsoup.parser.Token.StartTag startTag85 = startTag6.nameAttr("", attributes83);
        java.lang.String str86 = startTag6.normalName;
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
        org.junit.Assert.assertNotNull(token33);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "eof" + "'", str53, "eof");
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertTrue("'" + tokenType62 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType62.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(startTag67);
        org.junit.Assert.assertNotNull(startTag76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(startTag80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(token82);
        org.junit.Assert.assertNotNull(attributes83);
        org.junit.Assert.assertNotNull(startTag84);
        org.junit.Assert.assertNotNull(startTag85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        startTag0.normalName = "<starttag>";
        org.jsoup.parser.Token.Tag tag26 = startTag0.name("</ >");
        tag26.setEmptyAttributeValue();
        boolean boolean28 = tag26.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        doctype0.pubSysKey = "</</hi!>>";
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        org.jsoup.parser.Token token10 = comment0.reset();
        java.lang.StringBuilder stringBuilder11 = comment0.data;
        java.lang.String str12 = comment0.toString();
        org.jsoup.parser.Token token13 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.tagName = "<!---->";
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.parser.Token.Tag tag12 = startTag10.reset();
        java.lang.String str13 = startTag10.normalName;
        java.lang.String str14 = startTag10.normalName();
        boolean boolean15 = startTag10.selfClosing;
        java.lang.String str16 = startTag10.tagName;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag18.nameAttr("EOF", attributes20);
        boolean boolean22 = startTag21.isDoctype();
        org.jsoup.parser.Token.Tag tag23 = startTag21.reset();
        org.jsoup.parser.Token.StartTag startTag24 = tag23.asStartTag();
        org.jsoup.parser.Token.Tag tag25 = tag23.reset();
        org.jsoup.nodes.Attributes attributes26 = tag23.attributes;
        org.jsoup.parser.Token.StartTag startTag27 = startTag10.nameAttr("", attributes26);
        startTag10.normalName = "";
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        endTag30.appendAttributeValue(' ');
        char[] charArray35 = new char[] { ' ', ' ' };
        endTag30.appendAttributeValue(charArray35);
        org.jsoup.parser.Token.EndTag endTag37 = endTag30.asEndTag();
        char[] charArray43 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag30.appendAttributeValue(charArray43);
        startTag10.appendAttributeValue(charArray43);
        startTag3.appendAttributeValue(charArray43);
        startTag3.appendTagName("endtag");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag37);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        java.lang.String str8 = comment0.getData();
        java.lang.String str9 = comment0.tokenType();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        doctype10.pubSysKey = "";
        java.lang.StringBuilder stringBuilder13 = doctype10.name;
        java.lang.String str14 = doctype10.getName();
        java.lang.StringBuilder stringBuilder15 = doctype10.systemIdentifier;
        java.lang.StringBuilder stringBuilder16 = doctype10.publicIdentifier;
        java.lang.StringBuilder stringBuilder17 = doctype10.publicIdentifier;
        org.jsoup.parser.Token token18 = doctype10.reset();
        doctype10.forceQuirks = false;
        java.lang.String str21 = doctype10.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType22 = doctype10.type;
        comment0.type = tokenType22;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Comment" + "'", str9, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        doctype0.pubSysKey = "";
        org.jsoup.parser.Token token13 = doctype0.reset();
        doctype0.forceQuirks = false;
        java.lang.String str16 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment17 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        boolean boolean12 = startTag7.isCharacter();
        startTag7.selfClosing = false;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        org.jsoup.parser.Token token12 = character11.reset();
        org.jsoup.parser.Token.Character character14 = character11.data("<EOF>");
        org.jsoup.parser.Token.Character character16 = character14.data("<<!---->>");
        org.jsoup.parser.Token.Character character17 = character16.asCharacter();
        org.jsoup.parser.Token token18 = character16.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(character14);
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertNotNull(character17);
        org.junit.Assert.assertNotNull(token18);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        doctype0.pubSysKey = "</hi!>";
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName(' ');
        endTag0.appendAttributeName('a');
        boolean boolean6 = endTag0.selfClosing;
        endTag0.appendTagName('4');
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        java.lang.String str10 = tag9.normalName();
        tag9.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        java.lang.String str9 = startTag3.tagName;
        startTag3.selfClosing = false;
        org.jsoup.nodes.Attributes attributes12 = startTag3.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        org.jsoup.parser.Token.Tag tag43 = tag42.reset();
        boolean boolean44 = tag42.isCharacter();
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
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        boolean boolean4 = comment3.isComment();
        boolean boolean5 = comment3.bogus;
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        org.jsoup.parser.Token.Tag tag9 = startTag7.reset();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag11.nameAttr("EOF", attributes16);
        java.lang.String str18 = startTag11.normalName();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag22.nameAttr("", attributes25);
        org.jsoup.parser.Token.TokenType tokenType27 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag22.type = tokenType27;
        startTag11.type = tokenType27;
        org.jsoup.parser.Token.Tag tag30 = startTag11.reset();
        org.jsoup.nodes.Attributes attributes31 = startTag11.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = startTag7.nameAttr("</hi!#>", attributes31);
        startTag7.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        boolean boolean40 = startTag39.isDoctype();
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = startTag43.nameAttr("EOF", attributes45);
        boolean boolean47 = startTag46.isDoctype();
        org.jsoup.parser.Token.Tag tag48 = startTag46.reset();
        startTag46.newAttribute();
        org.jsoup.nodes.Attributes attributes50 = startTag46.attributes;
        endTag42.attributes = attributes50;
        org.jsoup.parser.Token.StartTag startTag52 = startTag39.nameAttr("eof", attributes50);
        boolean boolean53 = startTag39.isEOF();
        org.jsoup.nodes.Attributes attributes54 = startTag39.attributes;
        org.jsoup.parser.Token.StartTag startTag55 = startTag7.nameAttr("a", attributes54);
        org.jsoup.parser.Token.Tag tag56 = startTag55.reset();
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        endTag57.appendAttributeValue(' ');
        char[] charArray62 = new char[] { ' ', ' ' };
        endTag57.appendAttributeValue(charArray62);
        endTag57.selfClosing = true;
        org.jsoup.parser.Token.Tag tag67 = endTag57.name("hi!");
        boolean boolean68 = tag67.isEndTag();
        org.jsoup.parser.Token token69 = tag67.reset();
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes72 = null;
        org.jsoup.parser.Token.StartTag startTag73 = startTag70.nameAttr("EOF", attributes72);
        boolean boolean74 = startTag73.isDoctype();
        org.jsoup.nodes.Attributes attributes76 = null;
        org.jsoup.parser.Token.StartTag startTag77 = startTag73.nameAttr("", attributes76);
        org.jsoup.parser.Token.Tag tag78 = startTag77.reset();
        org.jsoup.parser.Token.EndTag endTag79 = new org.jsoup.parser.Token.EndTag();
        boolean boolean80 = endTag79.isSelfClosing();
        endTag79.normalName = "";
        java.lang.String str83 = endTag79.normalName();
        char[] charArray86 = new char[] { 'a', 'a' };
        endTag79.appendAttributeValue(charArray86);
        tag78.appendAttributeValue(charArray86);
        tag67.appendAttributeValue(charArray86);
        tag56.appendAttributeValue(charArray86);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "eof" + "'", str18, "eof");
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(token69);
        org.junit.Assert.assertNotNull(startTag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertArrayEquals(charArray86, new char[] { 'a', 'a' });
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        tag6.normalName = "hi!";
        tag6.setEmptyAttributeValue();
        tag6.setEmptyAttributeValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNull(attributes18);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("hi!EndTag");
        boolean boolean10 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character10 = character8.data("Character");
        org.jsoup.parser.Token.Character character12 = character8.data("< >");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(character12);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getPubSysKey();
        java.lang.String str10 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        boolean boolean10 = endTag0.isSelfClosing();
        boolean boolean11 = endTag0.isEOF();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.appendAttributeValue(' ');
        char[] charArray17 = new char[] { ' ', ' ' };
        endTag12.appendAttributeValue(charArray17);
        endTag12.selfClosing = true;
        org.jsoup.parser.Token.Tag tag22 = endTag12.name("hi!");
        boolean boolean23 = endTag12.isStartTag();
        endTag12.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        endTag26.appendAttributeValue(' ');
        endTag26.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.appendAttributeValue(' ');
        char[] charArray36 = new char[] { ' ', ' ' };
        endTag31.appendAttributeValue(charArray36);
        endTag31.selfClosing = true;
        org.jsoup.parser.Token.Tag tag41 = endTag31.name("hi!");
        endTag31.appendAttributeName('a');
        int[] intArray48 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag31.appendAttributeValue(intArray48);
        endTag26.appendAttributeValue(intArray48);
        endTag12.appendAttributeValue(intArray48);
        org.jsoup.nodes.Attributes attributes52 = endTag12.getAttributes();
        org.jsoup.parser.Token.EndTag endTag53 = new org.jsoup.parser.Token.EndTag();
        boolean boolean54 = endTag53.isSelfClosing();
        endTag53.normalName = "";
        endTag53.finaliseTag();
        org.jsoup.nodes.Attributes attributes58 = endTag53.attributes;
        endTag53.appendAttributeValue('#');
        endTag53.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes63 = endTag53.getAttributes();
        java.lang.String str64 = endTag53.name();
        org.jsoup.parser.Token.EndTag endTag65 = new org.jsoup.parser.Token.EndTag();
        endTag65.appendAttributeValue(' ');
        char[] charArray70 = new char[] { ' ', ' ' };
        endTag65.appendAttributeValue(charArray70);
        endTag65.selfClosing = true;
        org.jsoup.parser.Token.Tag tag75 = endTag65.name("hi!");
        endTag65.appendAttributeName('a');
        int[] intArray82 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag65.appendAttributeValue(intArray82);
        endTag53.appendAttributeValue(intArray82);
        endTag12.appendAttributeValue(intArray82);
        endTag0.appendAttributeValue(intArray82);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNull(attributes52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(attributes58);
        org.junit.Assert.assertNull(attributes63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        tag6.finaliseTag();
        tag6.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag11 = tag6.reset();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.appendAttributeValue(' ');
        char[] charArray17 = new char[] { ' ', ' ' };
        endTag12.appendAttributeValue(charArray17);
        endTag12.selfClosing = true;
        org.jsoup.parser.Token.Tag tag22 = endTag12.name("hi!");
        boolean boolean23 = endTag12.isStartTag();
        endTag12.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        endTag26.appendAttributeValue(' ');
        endTag26.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.appendAttributeValue(' ');
        char[] charArray36 = new char[] { ' ', ' ' };
        endTag31.appendAttributeValue(charArray36);
        endTag31.selfClosing = true;
        org.jsoup.parser.Token.Tag tag41 = endTag31.name("hi!");
        endTag31.appendAttributeName('a');
        int[] intArray48 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag31.appendAttributeValue(intArray48);
        endTag26.appendAttributeValue(intArray48);
        endTag12.appendAttributeValue(intArray48);
        org.jsoup.parser.Token token52 = endTag12.reset();
        java.lang.String str53 = endTag12.normalName();
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes56 = null;
        org.jsoup.parser.Token.StartTag startTag57 = startTag54.nameAttr("EOF", attributes56);
        boolean boolean58 = startTag57.isDoctype();
        org.jsoup.nodes.Attributes attributes60 = null;
        org.jsoup.parser.Token.StartTag startTag61 = startTag57.nameAttr("", attributes60);
        org.jsoup.parser.Token.Tag tag62 = startTag61.reset();
        org.jsoup.parser.Token.EndTag endTag63 = new org.jsoup.parser.Token.EndTag();
        boolean boolean64 = endTag63.isSelfClosing();
        endTag63.normalName = "";
        java.lang.String str67 = endTag63.normalName();
        char[] charArray70 = new char[] { 'a', 'a' };
        endTag63.appendAttributeValue(charArray70);
        tag62.appendAttributeValue(charArray70);
        endTag12.appendAttributeValue(charArray70);
        tag11.appendAttributeValue(charArray70);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { 'a', 'a' });
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag9 = startTag6.name("StartTag");
        java.lang.String str10 = startTag6.name();
        java.lang.String str11 = startTag6.toString();
        java.lang.String str12 = startTag6.name();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<StartTag>" + "'", str11, "<StartTag>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        java.lang.String str8 = startTag0.tokenType();
        startTag0.newAttribute();
        boolean boolean10 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag14.nameAttr("", attributes17);
        boolean boolean19 = startTag18.isSelfClosing();
        java.lang.String str20 = startTag18.tagName;
        boolean boolean21 = startTag18.isEndTag();
        java.lang.String str22 = startTag18.normalName();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag23.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isStartTag();
        startTag29.finaliseTag();
        java.lang.String str32 = startTag29.name();
        java.lang.String str33 = startTag29.toString();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = startTag35.nameAttr("EOF", attributes37);
        boolean boolean39 = startTag38.isDoctype();
        org.jsoup.parser.Token.Tag tag40 = startTag38.reset();
        org.jsoup.parser.Token.StartTag startTag41 = tag40.asStartTag();
        org.jsoup.parser.Token.Tag tag42 = tag40.reset();
        org.jsoup.nodes.Attributes attributes43 = tag40.attributes;
        org.jsoup.parser.Token.StartTag startTag44 = startTag29.nameAttr("", attributes43);
        startTag18.attributes = attributes43;
        startTag0.attributes = attributes43;
        boolean boolean47 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<EOF>" + "'", str33, "<EOF>");
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getPubSysKey();
        doctype0.pubSysKey = "";
        java.lang.String str11 = doctype0.pubSysKey;
        org.jsoup.parser.Token token12 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.toString();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        java.lang.String str8 = comment0.toString();
        java.lang.String str9 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        doctype0.pubSysKey = "";
        boolean boolean9 = doctype0.isDoctype();
        boolean boolean10 = doctype0.isCharacter();
        org.jsoup.parser.Token.Doctype doctype11 = doctype0.asDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doctype11);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        boolean boolean11 = doctype0.isCharacter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
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
        org.jsoup.parser.Token.Tag tag22 = endTag0.name("<<starttag>>");
        java.lang.Class<?> wildcardClass23 = tag22.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        org.jsoup.parser.Token.EndTag endTag48 = endTag0.asEndTag();
        endTag0.appendTagName("</StartTag>");
        endTag0.appendAttributeValue('a');
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
        org.junit.Assert.assertNotNull(endTag48);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        boolean boolean5 = comment0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token6 = doctype0.reset();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        char[] charArray5 = new char[] { ' ', '#', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag8 = endTag0.asEndTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', ' ' });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(endTag8);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        boolean boolean5 = endTag0.isEndTag();
        boolean boolean6 = endTag0.selfClosing;
        endTag0.appendTagName("EndTag");
        endTag0.appendAttributeName("<!---->4");
        java.lang.String str11 = endTag0.toString();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</EndTag>" + "'", str11, "</EndTag>");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        startTag0.tagName = "Comment";
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        boolean boolean17 = startTag16.isDoctype();
        org.jsoup.parser.Token.Tag tag18 = startTag16.reset();
        org.jsoup.parser.Token.StartTag startTag19 = tag18.asStartTag();
        org.jsoup.parser.Token.Tag tag20 = tag18.reset();
        org.jsoup.parser.Token.StartTag startTag21 = tag18.asStartTag();
        startTag21.newAttribute();
        org.jsoup.nodes.Attributes attributes23 = startTag21.getAttributes();
        org.jsoup.parser.Token.StartTag startTag24 = startTag0.nameAttr("", attributes23);
        startTag24.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag24);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token.Character character5 = character0.data("</hi!>");
        java.lang.String str6 = character5.getData();
        org.jsoup.parser.Token token7 = character5.reset();
        org.jsoup.parser.Token.Character character9 = character5.data("<EndTag>");
        boolean boolean10 = character5.isDoctype();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag42.nameAttr("EOF", attributes44);
        boolean boolean46 = startTag45.isDoctype();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag45.nameAttr("", attributes48);
        org.jsoup.parser.Token.Tag tag50 = startTag49.reset();
        org.jsoup.parser.Token.EndTag endTag51 = new org.jsoup.parser.Token.EndTag();
        boolean boolean52 = endTag51.isSelfClosing();
        endTag51.normalName = "";
        java.lang.String str55 = endTag51.normalName();
        char[] charArray58 = new char[] { 'a', 'a' };
        endTag51.appendAttributeValue(charArray58);
        tag50.appendAttributeValue(charArray58);
        endTag0.appendAttributeValue(charArray58);
        org.jsoup.nodes.Attributes attributes62 = endTag0.getAttributes();
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
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { 'a', 'a' });
        org.junit.Assert.assertNull(attributes62);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        org.jsoup.parser.Token token8 = tag3.reset();
        org.jsoup.parser.Token.EndTag endTag9 = token8.asEndTag();
        endTag9.finaliseTag();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(endTag9);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeValue("</ >");
        boolean boolean13 = endTag0.isEOF();
        java.lang.String str14 = endTag0.tokenType();
        endTag0.tagName = "<<<hi!>>>";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EndTag" + "'", str14, "EndTag");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        org.jsoup.parser.Token.TokenType tokenType3 = comment0.type;
        boolean boolean4 = comment0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        endTag0.appendTagName('a');
        boolean boolean12 = endTag0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        boolean boolean13 = doctype0.forceQuirks;
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.jsoup.parser.Token token9 = doctype0.reset();
        boolean boolean10 = doctype0.isForceQuirks();
        java.lang.String str11 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token12 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        java.lang.String str9 = character0.getData();
        java.lang.String str10 = character0.tokenType();
        java.lang.String str11 = character0.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        java.lang.String str10 = startTag0.toString();
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeName("EndTag");
        org.jsoup.parser.Token.StartTag startTag15 = startTag0.asStartTag();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        startTag19.appendTagName('4');
        org.jsoup.parser.Token.Tag tag22 = startTag19.reset();
        org.jsoup.parser.Token.Doctype doctype23 = new org.jsoup.parser.Token.Doctype();
        doctype23.pubSysKey = "";
        boolean boolean26 = doctype23.isEOF();
        java.lang.String str27 = doctype23.getPubSysKey();
        java.lang.String str28 = doctype23.getPublicIdentifier();
        doctype23.pubSysKey = "eof";
        java.lang.String str31 = doctype23.getPubSysKey();
        java.lang.String str32 = doctype23.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder33 = doctype23.name;
        java.lang.String str34 = doctype23.getPublicIdentifier();
        org.jsoup.parser.Token token35 = doctype23.reset();
        boolean boolean36 = doctype23.forceQuirks;
        java.lang.String str37 = doctype23.getPublicIdentifier();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag41 = endTag38.reset();
        endTag38.appendTagName(' ');
        java.lang.String str44 = endTag38.normalName;
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes47 = null;
        org.jsoup.parser.Token.StartTag startTag48 = startTag45.nameAttr("EOF", attributes47);
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = startTag50.nameAttr("EOF", attributes52);
        boolean boolean54 = startTag53.isDoctype();
        org.jsoup.parser.Token.Tag tag55 = startTag53.reset();
        org.jsoup.parser.Token.StartTag startTag56 = tag55.asStartTag();
        org.jsoup.parser.Token.Tag tag57 = tag55.reset();
        org.jsoup.nodes.Attributes attributes58 = tag55.attributes;
        org.jsoup.parser.Token.StartTag startTag59 = startTag48.nameAttr("starttag", attributes58);
        org.jsoup.parser.Token.TokenType tokenType60 = startTag59.type;
        endTag38.type = tokenType60;
        doctype23.type = tokenType60;
        startTag19.type = tokenType60;
        startTag0.type = tokenType60;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "eof" + "'", str31, "eof");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(token35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " " + "'", str44, " ");
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertTrue("'" + tokenType60 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType60.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        boolean boolean13 = endTag0.isEndTag();
        endTag0.appendTagName("hi!");
        java.lang.String str16 = endTag0.normalName();
        boolean boolean17 = endTag0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " hi!" + "'", str16, " hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag53.nameAttr("EOF", attributes55);
        boolean boolean57 = startTag56.isDoctype();
        org.jsoup.parser.Token.Tag tag58 = startTag56.reset();
        org.jsoup.parser.Token.Tag tag59 = tag58.reset();
        tag59.setEmptyAttributeValue();
        tag59.finaliseTag();
        boolean boolean62 = tag59.isEOF();
        org.jsoup.parser.Token.TokenType tokenType63 = tag59.type;
        startTag52.type = tokenType63;
        org.jsoup.parser.Token.StartTag startTag65 = startTag52.asStartTag();
        org.jsoup.parser.Token.Tag tag66 = startTag52.reset();
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
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + tokenType63 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType63.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertNotNull(tag66);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        org.jsoup.parser.Token token8 = doctype6.reset();
        java.lang.String str9 = doctype6.getPubSysKey();
        java.lang.String str10 = doctype6.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        org.jsoup.parser.Token.Tag tag83 = endTag0.name(" ");
        endTag0.tagName = "endtag";
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
        org.junit.Assert.assertNotNull(tag83);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isDoctype();
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token token8 = comment7.reset();
        comment7.bogus = false;
        org.jsoup.parser.Token token11 = comment7.reset();
        boolean boolean12 = comment7.bogus;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        startTag14.setEmptyAttributeValue();
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
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        org.jsoup.parser.Token token2 = comment0.reset();
        comment0.bogus = false;
        boolean boolean5 = comment0.isStartTag();
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag8 = tag5.asStartTag();
        startTag8.appendAttributeName(' ');
        java.lang.String str11 = startTag8.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName("Doctype");
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        boolean boolean4 = tag3.isStartTag();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isDoctype();
        java.lang.String str9 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.tagName;
        int[] intArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        boolean boolean2 = endTag0.selfClosing;
        boolean boolean3 = endTag0.isDoctype();
        endTag0.appendAttributeName(" ");
        java.lang.String str6 = endTag0.normalName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        doctype0.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        comment0.bogus = true;
        java.lang.String str9 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("<starttag>");
        org.jsoup.parser.Token.Character character10 = character0.data("StartTag");
        org.jsoup.parser.Token.Character character12 = character10.data("a");
        java.lang.String str13 = character10.getData();
        java.lang.String str14 = character10.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        comment0.bogus = true;
        java.lang.String str27 = comment0.getData();
        org.jsoup.parser.Token token28 = comment0.reset();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(token28);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        java.lang.String str15 = doctype0.getPubSysKey();
        java.lang.String str16 = doctype0.getName();
        java.lang.StringBuilder stringBuilder17 = doctype0.systemIdentifier;
        java.lang.String str18 = doctype0.pubSysKey;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        startTag3.appendAttributeValue("<!---->");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        startTag11.appendAttributeName("");
        org.jsoup.parser.Token.Tag tag17 = startTag11.name("");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        java.lang.String str25 = startTag22.normalName;
        java.lang.String str26 = startTag22.normalName();
        startTag22.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = startTag29.nameAttr("EOF", attributes31);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("EOF", attributes36);
        boolean boolean38 = startTag37.isDoctype();
        org.jsoup.parser.Token.Tag tag39 = startTag37.reset();
        org.jsoup.parser.Token.StartTag startTag40 = tag39.asStartTag();
        org.jsoup.parser.Token.Tag tag41 = tag39.reset();
        org.jsoup.nodes.Attributes attributes42 = tag39.attributes;
        org.jsoup.parser.Token.StartTag startTag43 = startTag32.nameAttr("starttag", attributes42);
        org.jsoup.parser.Token.StartTag startTag44 = startTag22.nameAttr("", attributes42);
        org.jsoup.nodes.Attributes attributes45 = startTag22.getAttributes();
        org.jsoup.parser.Token.StartTag startTag46 = startTag11.nameAttr("< >", attributes45);
        startTag11.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(startTag46);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag3.type = tokenType8;
        org.jsoup.nodes.Attributes attributes10 = startTag3.getAttributes();
        java.lang.String str11 = startTag3.normalName;
        org.jsoup.parser.Token.Tag tag12 = startTag3.reset();
        java.lang.String str13 = startTag3.normalName();
        startTag3.selfClosing = true;
        org.jsoup.parser.Token.Tag tag16 = startTag3.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        startTag7.appendTagName('4');
        startTag7.tagName = " ";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        startTag6.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag15.nameAttr("", attributes18);
        boolean boolean20 = startTag19.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.isDoctype();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag25.nameAttr("", attributes28);
        boolean boolean30 = startTag29.isSelfClosing();
        java.lang.String str31 = startTag29.tagName;
        boolean boolean32 = startTag29.isEndTag();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("EOF", attributes36);
        boolean boolean38 = startTag37.isDoctype();
        org.jsoup.parser.Token.Tag tag39 = startTag37.reset();
        org.jsoup.parser.Token.StartTag startTag40 = tag39.asStartTag();
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        endTag42.finaliseTag();
        endTag42.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag46.nameAttr("EOF", attributes48);
        boolean boolean50 = startTag49.isDoctype();
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag53.nameAttr("EOF", attributes55);
        boolean boolean57 = startTag56.isDoctype();
        org.jsoup.parser.Token.Tag tag58 = startTag56.reset();
        startTag56.newAttribute();
        org.jsoup.nodes.Attributes attributes60 = startTag56.attributes;
        endTag52.attributes = attributes60;
        org.jsoup.parser.Token.StartTag startTag62 = startTag49.nameAttr("eof", attributes60);
        endTag42.attributes = attributes60;
        org.jsoup.parser.Token.StartTag startTag64 = startTag40.nameAttr("<!---->", attributes60);
        org.jsoup.parser.Token.StartTag startTag65 = startTag29.nameAttr("starttag", attributes60);
        org.jsoup.parser.Token.StartTag startTag66 = startTag19.nameAttr("EOF", attributes60);
        org.jsoup.nodes.Attributes attributes67 = startTag19.getAttributes();
        startTag6.attributes = attributes67;
        startTag6.normalName = "<<<hi!>>>";
        boolean boolean71 = startTag6.isSelfClosing();
        java.lang.String str72 = startTag6.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<EOF>" + "'", str72, "<EOF>");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.bogus;
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.getData();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        tag7.selfClosing = true;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        doctype0.pubSysKey = "";
        boolean boolean12 = doctype0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eof" + "'", str9, "eof");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getPubSysKey();
        doctype0.pubSysKey = "Character";
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getName();
        org.jsoup.parser.Token token9 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        java.lang.String str8 = comment0.getData();
        boolean boolean9 = comment0.isDoctype();
        boolean boolean10 = comment0.isDoctype();
        java.lang.String str11 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag8 = endTag0.asEndTag();
        java.lang.Class<?> wildcardClass9 = endTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(endTag8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        boolean boolean15 = endTag0.isSelfClosing();
        boolean boolean16 = endTag0.isStartTag();
        org.jsoup.nodes.Attributes attributes17 = endTag0.getAttributes();
        java.lang.Class<?> wildcardClass18 = endTag0.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        java.lang.String str9 = endTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag10.nameAttr("EOF", attributes12);
        boolean boolean14 = startTag13.isDoctype();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag13.nameAttr("", attributes16);
        boolean boolean18 = startTag17.selfClosing;
        org.jsoup.parser.Token.Tag tag19 = startTag17.reset();
        org.jsoup.nodes.Attributes attributes20 = tag19.attributes;
        endTag0.attributes = attributes20;
        boolean boolean22 = endTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes23 = endTag0.attributes;
        java.lang.String str24 = endTag0.tagName;
        java.lang.String str25 = endTag0.tagName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        java.lang.String str4 = endTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getName();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        org.jsoup.parser.Token token15 = doctype0.reset();
        boolean boolean16 = doctype0.isForceQuirks();
        java.lang.String str17 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.String str10 = doctype0.getPubSysKey();
        java.lang.String str11 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        startTag0.appendTagName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        endTag0.appendAttributeName("eof");
        endTag0.appendAttributeName('a');
        endTag0.tagName = "eof";
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(' ');
        char[] charArray25 = new char[] { ' ', ' ' };
        endTag20.appendAttributeValue(charArray25);
        endTag20.selfClosing = true;
        org.jsoup.parser.Token.Tag tag30 = endTag20.name("hi!");
        endTag20.appendAttributeName('a');
        endTag20.appendTagName(' ');
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
        endTag20.appendAttributeValue(intArray57);
        endTag0.appendAttributeValue(intArray57);
        boolean boolean62 = endTag0.isStartTag();
        endTag0.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        boolean boolean44 = startTag43.selfClosing;
        org.jsoup.parser.Token.Tag tag45 = startTag43.reset();
        startTag43.finaliseTag();
        startTag43.appendAttributeName('a');
        org.jsoup.parser.Token.Tag tag49 = startTag43.reset();
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag49);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        java.lang.String str7 = character0.getData();
        java.lang.String str8 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
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
        endTag0.tagName = "<<starttag>>";
        java.lang.String str18 = endTag0.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "</<<starttag>>>" + "'", str18, "</<<starttag>>>");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        org.jsoup.nodes.Attributes attributes18 = endTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes19 = endTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes20 = endTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes21 = endTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertNull(attributes19);
        org.junit.Assert.assertNull(attributes20);
        org.junit.Assert.assertNull(attributes21);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token token5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = startTag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(startTag7);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
        org.jsoup.parser.Token token12 = doctype0.reset();
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        java.lang.String str14 = doctype0.getPubSysKey();
        java.lang.String str15 = doctype0.getName();
        boolean boolean16 = doctype0.isForceQuirks();
        doctype0.pubSysKey = "<4>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        org.jsoup.parser.Token token12 = doctype0.reset();
        boolean boolean13 = doctype0.forceQuirks;
        org.jsoup.parser.Token token14 = doctype0.reset();
        java.lang.String str15 = doctype0.pubSysKey;
        boolean boolean16 = doctype0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder21 = comment0.data;
        org.jsoup.parser.Token token22 = comment0.reset();
        java.lang.String str23 = comment0.toString();
        boolean boolean24 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(token22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        boolean boolean7 = doctype0.isEOF();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        boolean boolean9 = doctype0.isComment();
        java.lang.String str10 = doctype0.pubSysKey;
        org.jsoup.parser.Token token11 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        doctype9.pubSysKey = "";
        java.lang.String str12 = doctype9.pubSysKey;
        doctype9.forceQuirks = true;
        java.lang.StringBuilder stringBuilder15 = doctype9.systemIdentifier;
        org.jsoup.parser.Token token16 = doctype9.reset();
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        doctype17.pubSysKey = "";
        java.lang.StringBuilder stringBuilder20 = doctype17.name;
        java.lang.String str21 = doctype17.getPublicIdentifier();
        java.lang.String str22 = doctype17.getPubSysKey();
        java.lang.String str23 = doctype17.pubSysKey;
        java.lang.String str24 = doctype17.getPublicIdentifier();
        java.lang.String str25 = doctype17.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType26 = doctype17.type;
        token16.type = tokenType26;
        token8.type = tokenType26;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        boolean boolean16 = doctype0.isEOF();
        org.jsoup.parser.Token token17 = doctype0.reset();
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
        org.junit.Assert.assertNotNull(token17);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        org.jsoup.parser.Token token7 = startTag3.reset();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag11 = endTag8.reset();
        tag11.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag15 = tag11.name("StartTag");
        org.jsoup.parser.Token token16 = tag11.reset();
        org.jsoup.parser.Token.TokenType tokenType17 = token16.type;
        startTag3.type = tokenType17;
        org.jsoup.nodes.Attributes attributes19 = startTag3.attributes;
        startTag3.finaliseTag();
        org.jsoup.nodes.Attributes attributes21 = startTag3.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token token8 = endTag0.reset();
        endTag0.tagName = "";
        endTag0.appendAttributeName("</<!---->4>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag7.reset();
        org.jsoup.parser.Token.Tag tag13 = tag11.name("</StartTag>");
        boolean boolean14 = tag13.isComment();
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        endTag15.appendAttributeValue(' ');
        java.lang.String str18 = endTag15.tagName;
        org.jsoup.nodes.Attributes attributes19 = endTag15.attributes;
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(' ');
        char[] charArray25 = new char[] { ' ', ' ' };
        endTag20.appendAttributeValue(charArray25);
        org.jsoup.parser.Token.TokenType tokenType27 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag20.type = tokenType27;
        endTag15.type = tokenType27;
        tag13.type = tokenType27;
        java.lang.String str31 = tag13.normalName();
        org.jsoup.nodes.Attributes attributes32 = tag13.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(attributes19);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "</starttag>" + "'", str31, "</starttag>");
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType9 = endTag0.type;
        java.lang.String str10 = endTag0.normalName();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.tagName = "<!---->";
        java.lang.String str7 = startTag3.tagName;
        startTag3.appendAttributeName('a');
        java.lang.String str10 = startTag3.toString();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.Tag tag17 = startTag15.reset();
        java.lang.String str18 = startTag15.normalName;
        java.lang.String str19 = startTag15.normalName();
        boolean boolean20 = startTag15.selfClosing;
        boolean boolean21 = startTag15.isEOF();
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        endTag23.appendAttributeValue(' ');
        char[] charArray28 = new char[] { ' ', ' ' };
        endTag23.appendAttributeValue(charArray28);
        endTag23.selfClosing = true;
        org.jsoup.parser.Token.Tag tag33 = endTag23.name("hi!");
        tag33.appendAttributeValue("eof");
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        boolean boolean40 = startTag39.isDoctype();
        org.jsoup.parser.Token.Tag tag41 = startTag39.reset();
        org.jsoup.parser.Token.StartTag startTag42 = tag41.asStartTag();
        org.jsoup.parser.Token.Tag tag43 = tag41.reset();
        org.jsoup.nodes.Attributes attributes44 = tag41.attributes;
        tag33.attributes = attributes44;
        org.jsoup.parser.Token.StartTag startTag46 = startTag15.nameAttr("EndTag", attributes44);
        org.jsoup.parser.Token.TokenType tokenType47 = null;
        startTag15.type = tokenType47;
        startTag15.selfClosing = false;
        org.jsoup.nodes.Attributes attributes51 = startTag15.attributes;
        org.jsoup.parser.Token.StartTag startTag52 = startTag3.nameAttr("", attributes51);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(startTag52);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.tagName;
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        java.lang.String str9 = tag8.normalName;
        org.jsoup.nodes.Attributes attributes10 = tag8.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag11.nameAttr("EOF", attributes16);
        org.jsoup.parser.Token.Tag tag18 = startTag11.reset();
        boolean boolean19 = startTag11.isSelfClosing();
        org.jsoup.parser.Token.Tag tag20 = startTag11.reset();
        boolean boolean21 = startTag11.isComment();
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        endTag23.finaliseTag();
        endTag23.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag27.nameAttr("EOF", attributes29);
        boolean boolean31 = startTag30.isDoctype();
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("EOF", attributes36);
        boolean boolean38 = startTag37.isDoctype();
        org.jsoup.parser.Token.Tag tag39 = startTag37.reset();
        startTag37.newAttribute();
        org.jsoup.nodes.Attributes attributes41 = startTag37.attributes;
        endTag33.attributes = attributes41;
        org.jsoup.parser.Token.StartTag startTag43 = startTag30.nameAttr("eof", attributes41);
        endTag23.attributes = attributes41;
        org.jsoup.parser.Token.StartTag startTag45 = startTag11.nameAttr("</hi!>", attributes41);
        org.jsoup.parser.Token.Tag tag46 = startTag11.reset();
        org.jsoup.parser.Token.Tag tag47 = startTag11.reset();
        org.jsoup.nodes.Attributes attributes48 = startTag11.getAttributes();
        tag8.attributes = attributes48;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag14 = endTag0.reset();
        java.lang.String str15 = endTag0.tokenType();
        boolean boolean16 = endTag0.isEOF();
        java.lang.String str17 = endTag0.tokenType();
        endTag0.appendAttributeValue("</a>");
        boolean boolean20 = endTag0.isStartTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EndTag" + "'", str15, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EndTag" + "'", str17, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        boolean boolean6 = comment0.bogus;
        java.lang.String str7 = comment0.getData();
        boolean boolean8 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        int[] intArray10 = new int[] { 1, 10, 10 };
        endTag0.appendAttributeValue(intArray10);
        org.jsoup.parser.Token.Tag tag13 = endTag0.name("StartTag");
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag15.nameAttr("EOF", attributes17);
        boolean boolean19 = startTag18.isDoctype();
        org.jsoup.parser.Token.Tag tag20 = startTag18.reset();
        startTag18.newAttribute();
        org.jsoup.nodes.Attributes attributes22 = startTag18.attributes;
        endTag14.attributes = attributes22;
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(' ');
        char[] charArray29 = new char[] { ' ', ' ' };
        endTag24.appendAttributeValue(charArray29);
        endTag24.selfClosing = true;
        org.jsoup.parser.Token.Tag tag34 = endTag24.name("hi!");
        boolean boolean35 = tag34.isEndTag();
        org.jsoup.parser.Token token36 = tag34.reset();
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag();
        boolean boolean38 = endTag37.isSelfClosing();
        endTag37.normalName = "";
        endTag37.finaliseTag();
        org.jsoup.nodes.Attributes attributes42 = endTag37.attributes;
        endTag37.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag45 = endTag37.reset();
        org.jsoup.parser.Token.Tag tag46 = endTag37.reset();
        org.jsoup.parser.Token.EndTag endTag47 = new org.jsoup.parser.Token.EndTag();
        boolean boolean48 = endTag47.isSelfClosing();
        endTag47.normalName = "";
        boolean boolean51 = endTag47.selfClosing;
        org.jsoup.parser.Token.Tag tag53 = endTag47.name("eof");
        org.jsoup.parser.Token.Tag tag55 = endTag47.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag56 = new org.jsoup.parser.Token.EndTag();
        endTag56.appendAttributeValue(' ');
        char[] charArray61 = new char[] { ' ', ' ' };
        endTag56.appendAttributeValue(charArray61);
        endTag56.selfClosing = true;
        org.jsoup.parser.Token.Tag tag66 = endTag56.name("hi!");
        endTag56.appendAttributeName('a');
        int[] intArray73 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag56.appendAttributeValue(intArray73);
        org.jsoup.parser.Token.EndTag endTag75 = new org.jsoup.parser.Token.EndTag();
        endTag75.finaliseTag();
        boolean boolean77 = endTag75.isCharacter();
        int[] intArray79 = new int[] { (short) 1 };
        endTag75.appendAttributeValue(intArray79);
        endTag56.appendAttributeValue(intArray79);
        tag55.appendAttributeValue(intArray79);
        tag46.appendAttributeValue(intArray79);
        tag34.appendAttributeValue(intArray79);
        endTag14.appendAttributeValue(intArray79);
        endTag0.appendAttributeValue(intArray79);
        org.jsoup.parser.Token token87 = endTag0.reset();
        endTag0.tagName = "EndTag";
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(token36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(attributes42);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 1 });
        org.junit.Assert.assertNotNull(token87);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        org.jsoup.parser.Token.Tag tag35 = startTag6.reset();
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
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        endTag0.tagName = "a";
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag18.nameAttr("EOF", attributes20);
        boolean boolean22 = startTag21.isDoctype();
        startTag21.tagName = "<!---->";
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
        startTag21.appendAttributeValue(charArray61);
        endTag0.appendAttributeValue(charArray61);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment66 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
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
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        boolean boolean7 = startTag3.isComment();
        startTag3.normalName = "<#>";
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.finaliseTag();
        boolean boolean12 = endTag10.isCharacter();
        int[] intArray14 = new int[] { (short) 1 };
        endTag10.appendAttributeValue(intArray14);
        endTag10.tagName = "<!---->";
        endTag10.finaliseTag();
        endTag10.appendTagName('4');
        endTag10.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = startTag22.nameAttr("EOF", attributes27);
        startTag28.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag31.nameAttr("EOF", attributes33);
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag31.nameAttr("EOF", attributes36);
        org.jsoup.parser.Token.Tag tag38 = startTag31.reset();
        java.lang.String str39 = tag38.tagName;
        boolean boolean40 = tag38.isCharacter();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag41.nameAttr("EOF", attributes43);
        boolean boolean45 = startTag44.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag44.reset();
        java.lang.String str47 = startTag44.normalName;
        java.lang.String str48 = startTag44.normalName();
        boolean boolean49 = startTag44.selfClosing;
        java.lang.String str50 = startTag44.tagName;
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = startTag52.nameAttr("EOF", attributes54);
        boolean boolean56 = startTag55.isDoctype();
        org.jsoup.parser.Token.Tag tag57 = startTag55.reset();
        org.jsoup.parser.Token.StartTag startTag58 = tag57.asStartTag();
        org.jsoup.parser.Token.Tag tag59 = tag57.reset();
        org.jsoup.nodes.Attributes attributes60 = tag57.attributes;
        org.jsoup.parser.Token.StartTag startTag61 = startTag44.nameAttr("", attributes60);
        startTag44.normalName = "";
        org.jsoup.parser.Token.EndTag endTag64 = new org.jsoup.parser.Token.EndTag();
        endTag64.appendAttributeValue(' ');
        char[] charArray69 = new char[] { ' ', ' ' };
        endTag64.appendAttributeValue(charArray69);
        org.jsoup.parser.Token.EndTag endTag71 = endTag64.asEndTag();
        char[] charArray77 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag64.appendAttributeValue(charArray77);
        startTag44.appendAttributeValue(charArray77);
        tag38.appendAttributeValue(charArray77);
        startTag28.appendAttributeValue(charArray77);
        endTag10.appendAttributeValue(charArray77);
        startTag3.appendAttributeValue(charArray77);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1 });
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag71);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getName();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isComment();
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token token4 = comment0.reset();
        org.jsoup.parser.Token.Comment comment5 = comment0.asComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(comment5);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        endTag0.normalName = "EOF";
        endTag0.selfClosing = false;
        java.lang.Class<?> wildcardClass21 = endTag0.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        org.jsoup.parser.Token token2 = comment0.reset();
        org.jsoup.parser.Token token3 = comment0.reset();
        java.lang.String str4 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        startTag43.normalName = "<eof>";
        org.jsoup.parser.Token.Tag tag47 = startTag43.name("");
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        boolean boolean49 = endTag48.isSelfClosing();
        endTag48.normalName = "";
        boolean boolean52 = endTag48.isDoctype();
        org.jsoup.parser.Token.EndTag endTag53 = new org.jsoup.parser.Token.EndTag();
        endTag53.finaliseTag();
        endTag53.appendAttributeName('#');
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        endTag57.appendAttributeValue(' ');
        endTag57.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag62 = new org.jsoup.parser.Token.EndTag();
        endTag62.appendAttributeValue(' ');
        char[] charArray67 = new char[] { ' ', ' ' };
        endTag62.appendAttributeValue(charArray67);
        endTag62.selfClosing = true;
        org.jsoup.parser.Token.Tag tag72 = endTag62.name("hi!");
        endTag62.appendAttributeName('a');
        int[] intArray79 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag62.appendAttributeValue(intArray79);
        endTag57.appendAttributeValue(intArray79);
        endTag53.appendAttributeValue(intArray79);
        endTag48.appendAttributeValue(intArray79);
        tag47.appendAttributeValue(intArray79);
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
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str8 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        org.jsoup.parser.Token.StartTag startTag17 = startTag16.asStartTag();
        java.lang.String str18 = startTag16.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment19 = startTag16.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "eof" + "'", str18, "eof");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token.TokenType tokenType8 = null;
        character0.type = tokenType8;
        java.lang.String str10 = character0.getData();
        org.jsoup.parser.Token.Character character12 = character0.data("4");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(character12);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        doctype0.pubSysKey = "</hi!#>";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        boolean boolean8 = doctype0.isEOF();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        startTag30.appendAttributeValue("</hi!#>");
        org.jsoup.parser.Token.Tag tag37 = startTag30.name("");
        boolean boolean38 = tag37.isEndTag();
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
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
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
        tag35.newAttribute();
        boolean boolean37 = tag35.isSelfClosing();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        tag12.appendAttributeName(' ');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag15.nameAttr("EOF", attributes17);
        boolean boolean19 = startTag18.isDoctype();
        org.jsoup.parser.Token.Tag tag20 = startTag18.reset();
        org.jsoup.parser.Token.StartTag startTag21 = tag20.asStartTag();
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        endTag23.finaliseTag();
        endTag23.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag27.nameAttr("EOF", attributes29);
        boolean boolean31 = startTag30.isDoctype();
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("EOF", attributes36);
        boolean boolean38 = startTag37.isDoctype();
        org.jsoup.parser.Token.Tag tag39 = startTag37.reset();
        startTag37.newAttribute();
        org.jsoup.nodes.Attributes attributes41 = startTag37.attributes;
        endTag33.attributes = attributes41;
        org.jsoup.parser.Token.StartTag startTag43 = startTag30.nameAttr("eof", attributes41);
        endTag23.attributes = attributes41;
        org.jsoup.parser.Token.StartTag startTag45 = startTag21.nameAttr("<!---->", attributes41);
        java.lang.String str46 = startTag45.tokenType();
        startTag45.appendAttributeValue("Comment");
        java.lang.String str49 = startTag45.name();
        java.lang.String str50 = startTag45.toString();
        org.jsoup.nodes.Attributes attributes51 = startTag45.attributes;
        tag12.attributes = attributes51;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "StartTag" + "'", str46, "StartTag");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!---->" + "'", str49, "<!---->");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<<!---->>" + "'", str50, "<<!---->>");
        org.junit.Assert.assertNotNull(attributes51);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        boolean boolean12 = startTag3.selfClosing;
        java.lang.String str13 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.nameAttr("EOF", attributes16);
        boolean boolean18 = startTag17.isDoctype();
        org.jsoup.parser.Token.Tag tag19 = startTag17.reset();
        org.jsoup.parser.Token.StartTag startTag20 = tag19.asStartTag();
        startTag20.selfClosing = false;
        org.jsoup.parser.Token.Tag tag23 = startTag20.reset();
        org.jsoup.parser.Token.Tag tag24 = startTag20.reset();
        startTag20.appendTagName('a');
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        endTag27.appendAttributeValue(' ');
        char[] charArray32 = new char[] { ' ', ' ' };
        endTag27.appendAttributeValue(charArray32);
        endTag27.selfClosing = true;
        org.jsoup.parser.Token.Tag tag37 = endTag27.name("hi!");
        tag37.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag40 = tag37.asEndTag();
        org.jsoup.parser.Token.EndTag endTag41 = new org.jsoup.parser.Token.EndTag();
        endTag41.finaliseTag();
        boolean boolean43 = endTag41.isCharacter();
        int[] intArray45 = new int[] { (short) 1 };
        endTag41.appendAttributeValue(intArray45);
        endTag40.appendAttributeValue(intArray45);
        startTag20.appendAttributeValue(intArray45);
        startTag3.appendAttributeValue(intArray45);
        java.lang.String str50 = startTag3.name();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(endTag40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "EndTag" + "'", str50, "EndTag");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
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
        java.lang.StringBuilder stringBuilder15 = comment0.data;
        org.jsoup.parser.Token.Comment comment16 = comment0.asComment();
        boolean boolean17 = comment0.isEndTag();
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
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(comment16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
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
        org.jsoup.parser.Token.Tag tag33 = startTag6.reset();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = startTag35.nameAttr("EOF", attributes37);
        boolean boolean39 = startTag38.isDoctype();
        org.jsoup.parser.Token.Tag tag40 = startTag38.reset();
        java.lang.String str41 = startTag38.normalName;
        java.lang.String str42 = startTag38.normalName();
        boolean boolean43 = startTag38.selfClosing;
        java.lang.String str44 = startTag38.tagName;
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag46.nameAttr("EOF", attributes48);
        boolean boolean50 = startTag49.isDoctype();
        org.jsoup.parser.Token.Tag tag51 = startTag49.reset();
        org.jsoup.parser.Token.StartTag startTag52 = tag51.asStartTag();
        org.jsoup.parser.Token.Tag tag53 = tag51.reset();
        org.jsoup.nodes.Attributes attributes54 = tag51.attributes;
        org.jsoup.parser.Token.StartTag startTag55 = startTag38.nameAttr("", attributes54);
        org.jsoup.parser.Token.StartTag startTag56 = startTag6.nameAttr("EndTag", attributes54);
        startTag56.appendTagName('#');
        java.lang.String str59 = startTag56.toString();
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
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "<EndTag#>" + "'", str59, "<EndTag#>");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        startTag43.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag46 = startTag43.asStartTag();
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
        org.junit.Assert.assertNotNull(startTag46);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        boolean boolean14 = doctype0.isForceQuirks();
        java.lang.String str15 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder16 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        java.lang.String str7 = tag6.tokenType();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag8.nameAttr("EOF", attributes10);
        boolean boolean12 = startTag11.isDoctype();
        org.jsoup.parser.Token.Tag tag13 = startTag11.reset();
        org.jsoup.parser.Token.StartTag startTag14 = tag13.asStartTag();
        org.jsoup.parser.Token.Tag tag15 = tag13.reset();
        org.jsoup.nodes.Attributes attributes16 = tag13.attributes;
        tag6.attributes = attributes16;
        tag6.selfClosing = false;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        java.lang.String str20 = tag10.name();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EndTag" + "'", str16, "EndTag");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.String str7 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.String str10 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.String str13 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        java.lang.String str21 = endTag0.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "</eofa>" + "'", str21, "</eofa>");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        tag7.appendAttributeName("EndTag");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        tag6.appendTagName("starttag");
        org.jsoup.parser.Token.Tag tag10 = tag6.name("<eof4>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("EndTag");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        org.jsoup.parser.Token.Character character10 = character0.data("<hi!>");
        java.lang.String str11 = character10.getData();
        org.jsoup.parser.Token.Character character13 = character10.data("<<EOF>>");
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!>" + "'", str11, "<hi!>");
        org.junit.Assert.assertNotNull(character13);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        java.lang.String str9 = doctype8.getSystemIdentifier();
        java.lang.String str10 = doctype8.getName();
        doctype8.pubSysKey = "<EOF>";
        org.jsoup.parser.Token token13 = doctype8.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        boolean boolean10 = comment0.isEOF();
        java.lang.String str11 = comment0.toString();
        java.lang.String str12 = comment0.tokenType();
        boolean boolean13 = comment0.isEOF();
        org.jsoup.parser.Token token14 = comment0.reset();
        java.lang.String str15 = comment0.getData();
        java.lang.String str16 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Comment" + "'", str12, "Comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        org.jsoup.parser.Token token2 = eOF0.reset();
        boolean boolean3 = eOF0.isCharacter();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        boolean boolean9 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
        boolean boolean44 = startTag43.selfClosing;
        java.lang.String str45 = startTag43.name();
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "starttag" + "'", str45, "starttag");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = tag10.isEndTag();
        org.jsoup.parser.Token token12 = tag10.reset();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        boolean boolean17 = startTag16.isDoctype();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag16.nameAttr("", attributes19);
        org.jsoup.parser.Token.Tag tag21 = startTag20.reset();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        boolean boolean23 = endTag22.isSelfClosing();
        endTag22.normalName = "";
        java.lang.String str26 = endTag22.normalName();
        char[] charArray29 = new char[] { 'a', 'a' };
        endTag22.appendAttributeValue(charArray29);
        tag21.appendAttributeValue(charArray29);
        tag10.appendAttributeValue(charArray29);
        tag10.appendTagName("hi!");
        org.jsoup.parser.Token.TokenType tokenType35 = tag10.type;
        tag10.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag();
        endTag37.appendAttributeValue(' ');
        endTag37.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        endTag42.appendAttributeValue(' ');
        char[] charArray47 = new char[] { ' ', ' ' };
        endTag42.appendAttributeValue(charArray47);
        endTag42.selfClosing = true;
        org.jsoup.parser.Token.Tag tag52 = endTag42.name("hi!");
        endTag42.appendAttributeName('a');
        int[] intArray59 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag42.appendAttributeValue(intArray59);
        endTag37.appendAttributeValue(intArray59);
        org.jsoup.parser.Token.TokenType tokenType62 = endTag37.type;
        tag10.type = tokenType62;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a', 'a' });
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + tokenType62 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType62.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
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
        startTag30.tagName = "</hi!>";
        startTag30.appendAttributeName("</ >");
        org.jsoup.parser.Token.Tag tag39 = startTag30.name("<StartTag>");
        tag39.normalName = "a";
        java.lang.String str42 = tag39.normalName();
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
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "a" + "'", str42, "a");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.appendAttributeValue(' ');
        char[] charArray43 = new char[] { ' ', ' ' };
        endTag38.appendAttributeValue(charArray43);
        endTag38.selfClosing = true;
        org.jsoup.parser.Token.Tag tag48 = endTag38.name("hi!");
        boolean boolean49 = endTag38.isStartTag();
        endTag38.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag();
        endTag52.appendAttributeValue(' ');
        endTag52.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        endTag57.appendAttributeValue(' ');
        char[] charArray62 = new char[] { ' ', ' ' };
        endTag57.appendAttributeValue(charArray62);
        endTag57.selfClosing = true;
        org.jsoup.parser.Token.Tag tag67 = endTag57.name("hi!");
        endTag57.appendAttributeName('a');
        int[] intArray74 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag57.appendAttributeValue(intArray74);
        endTag52.appendAttributeValue(intArray74);
        endTag38.appendAttributeValue(intArray74);
        startTag3.appendAttributeValue(intArray74);
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
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        java.lang.String str21 = endTag0.normalName();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isComment();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        org.jsoup.parser.Token token8 = endTag0.reset();
        endTag0.appendTagName('#');
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        org.jsoup.parser.Token.EndTag endTag18 = endTag11.asEndTag();
        char[] charArray24 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag11.appendAttributeValue(charArray24);
        endTag0.appendAttributeValue(charArray24);
        endTag0.appendAttributeValue("<!---->#");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName("Doctype");
        java.lang.String str3 = startTag0.tokenType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StartTag" + "'", str3, "StartTag");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        java.lang.String str14 = doctype0.getPubSysKey();
        java.lang.String str15 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->4" + "'", str14, "<!---->4");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        boolean boolean5 = startTag3.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag6 = startTag3.asStartTag();
        startTag6.appendAttributeValue('4');
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getName();
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.getData();
        comment0.bogus = false;
        java.lang.String str9 = comment0.getData();
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        boolean boolean10 = doctype0.forceQuirks;
        java.lang.String str11 = doctype0.getPubSysKey();
        java.lang.String str12 = doctype0.pubSysKey;
        doctype0.pubSysKey = "</<!---->4>";
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag5 = startTag0.asStartTag();
        startTag5.appendAttributeValue('a');
        startTag5.appendTagName('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag5);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        org.jsoup.parser.Token.Tag tag19 = startTag3.name("<!---->");
        java.lang.String str20 = startTag3.normalName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType8;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.String str12 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder13 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        boolean boolean21 = startTag3.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = startTag3.toString();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        java.lang.String str6 = comment0.getData();
        boolean boolean7 = comment0.isDoctype();
        java.lang.String str8 = comment0.getData();
        java.lang.String str9 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.appendAttributeValue("4");
        boolean boolean9 = endTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag10 = endTag0.asEndTag();
        endTag10.normalName = "</hi!#>";
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(endTag10);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        boolean boolean9 = endTag0.isDoctype();
        endTag0.finaliseTag();
        endTag0.appendAttributeName("EndTag");
        boolean boolean13 = endTag0.isCharacter();
        org.jsoup.nodes.Attributes attributes14 = endTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag15.nameAttr("EOF", attributes17);
        boolean boolean19 = startTag18.isDoctype();
        startTag18.tagName = "<!---->";
        java.lang.String str22 = startTag18.tagName;
        boolean boolean23 = startTag18.isEOF();
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(' ');
        char[] charArray29 = new char[] { ' ', ' ' };
        endTag24.appendAttributeValue(charArray29);
        endTag24.selfClosing = true;
        org.jsoup.parser.Token.Tag tag34 = endTag24.name("hi!");
        tag34.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag37 = tag34.asEndTag();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.finaliseTag();
        boolean boolean40 = endTag38.isCharacter();
        int[] intArray42 = new int[] { (short) 1 };
        endTag38.appendAttributeValue(intArray42);
        endTag37.appendAttributeValue(intArray42);
        startTag18.appendAttributeValue(intArray42);
        endTag0.appendAttributeValue(intArray42);
        java.lang.String str47 = endTag0.tagName;
        java.lang.String str48 = endTag0.normalName();
        endTag0.normalName = "#";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!---->" + "'", str22, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(endTag37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1 });
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.isEOF();
        boolean boolean9 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        boolean boolean10 = doctype0.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        boolean boolean10 = tag9.isStartTag();
        tag9.newAttribute();
        boolean boolean12 = tag9.isDoctype();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        doctype0.pubSysKey = "";
        org.jsoup.parser.Token token13 = doctype0.reset();
        java.lang.Class<?> wildcardClass14 = doctype0.getClass();
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
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
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
        org.jsoup.parser.Token.Tag tag33 = startTag6.reset();
        tag33.tagName = "starttag";
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag36.nameAttr("EOF", attributes41);
        startTag42.selfClosing = false;
        java.lang.String str45 = startTag42.tokenType();
        boolean boolean46 = startTag42.selfClosing;
        startTag42.appendAttributeName("");
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = startTag50.nameAttr("EOF", attributes52);
        boolean boolean54 = startTag53.isDoctype();
        org.jsoup.nodes.Attributes attributes56 = null;
        org.jsoup.parser.Token.StartTag startTag57 = startTag53.nameAttr("", attributes56);
        boolean boolean58 = startTag57.isSelfClosing();
        startTag57.normalName = "";
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes64 = null;
        org.jsoup.parser.Token.StartTag startTag65 = startTag62.nameAttr("EOF", attributes64);
        boolean boolean66 = startTag65.isDoctype();
        org.jsoup.parser.Token.EndTag endTag68 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes71 = null;
        org.jsoup.parser.Token.StartTag startTag72 = startTag69.nameAttr("EOF", attributes71);
        boolean boolean73 = startTag72.isDoctype();
        org.jsoup.parser.Token.Tag tag74 = startTag72.reset();
        startTag72.newAttribute();
        org.jsoup.nodes.Attributes attributes76 = startTag72.attributes;
        endTag68.attributes = attributes76;
        org.jsoup.parser.Token.StartTag startTag78 = startTag65.nameAttr("eof", attributes76);
        org.jsoup.parser.Token.StartTag startTag79 = startTag57.nameAttr("<EOF>", attributes76);
        org.jsoup.parser.Token.StartTag startTag80 = startTag42.nameAttr("Doctype", attributes76);
        tag33.attributes = attributes76;
        java.lang.String str82 = tag33.normalName;
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
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "StartTag" + "'", str45, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(startTag72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertNotNull(startTag79);
        org.junit.Assert.assertNotNull(startTag80);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType32 = startTag0.type;
        startTag0.tagName = "Doctype";
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
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        org.jsoup.nodes.Attributes attributes17 = startTag3.attributes;
        startTag3.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        boolean boolean6 = tag3.selfClosing;
        tag3.newAttribute();
        boolean boolean8 = tag3.isSelfClosing();
        boolean boolean9 = tag3.selfClosing;
        java.lang.String str10 = tag3.normalName();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token8 = doctype0.reset();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        doctype0.pubSysKey = "</<!---->4>";
        java.lang.StringBuilder stringBuilder14 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType15 = doctype0.type;
        java.lang.StringBuilder stringBuilder16 = doctype0.name;
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
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        org.jsoup.parser.Token.EndTag endTag4 = endTag0.asEndTag();
        boolean boolean5 = endTag4.selfClosing;
        org.jsoup.nodes.Attributes attributes6 = endTag4.attributes;
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        boolean boolean8 = endTag7.isSelfClosing();
        endTag7.normalName = "";
        endTag7.finaliseTag();
        boolean boolean12 = endTag7.selfClosing;
        endTag7.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag15.nameAttr("EOF", attributes17);
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag15.nameAttr("EOF", attributes20);
        java.lang.String str22 = startTag15.normalName();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag26.nameAttr("", attributes29);
        org.jsoup.parser.Token.TokenType tokenType31 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag26.type = tokenType31;
        startTag15.type = tokenType31;
        endTag7.type = tokenType31;
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
        endTag7.attributes = attributes49;
        boolean boolean53 = endTag7.isEOF();
        org.jsoup.nodes.Attributes attributes54 = endTag7.attributes;
        endTag4.attributes = attributes54;
        org.junit.Assert.assertNotNull(endTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "eof" + "'", str22, "eof");
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(attributes54);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        doctype0.forceQuirks = true;
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
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.Tag tag10 = tag8.name("<starttag>");
        tag10.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token token6 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        org.jsoup.parser.Token.Tag tag19 = startTag3.name("<!---->");
        tag19.newAttribute();
        tag19.setEmptyAttributeValue();
        tag19.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getName();
        boolean boolean10 = doctype0.isForceQuirks();
        java.lang.String str11 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        java.lang.String str13 = doctype0.pubSysKey;
        java.lang.String str14 = doctype0.getName();
        java.lang.String str15 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder16 = doctype0.systemIdentifier;
        java.lang.String str17 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        boolean boolean12 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token13 = doctype0.reset();
        java.lang.StringBuilder stringBuilder14 = doctype0.name;
        java.lang.StringBuilder stringBuilder15 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        boolean boolean10 = startTag6.selfClosing;
        startTag6.appendAttributeName("");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.nameAttr("EOF", attributes16);
        boolean boolean18 = startTag17.isDoctype();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag17.nameAttr("", attributes20);
        boolean boolean22 = startTag21.isSelfClosing();
        startTag21.normalName = "";
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag33.nameAttr("EOF", attributes35);
        boolean boolean37 = startTag36.isDoctype();
        org.jsoup.parser.Token.Tag tag38 = startTag36.reset();
        startTag36.newAttribute();
        org.jsoup.nodes.Attributes attributes40 = startTag36.attributes;
        endTag32.attributes = attributes40;
        org.jsoup.parser.Token.StartTag startTag42 = startTag29.nameAttr("eof", attributes40);
        org.jsoup.parser.Token.StartTag startTag43 = startTag21.nameAttr("<EOF>", attributes40);
        org.jsoup.parser.Token.StartTag startTag44 = startTag6.nameAttr("Doctype", attributes40);
        org.jsoup.parser.Token.Tag tag46 = startTag44.name("<<hi!>>");
        startTag44.appendTagName(' ');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(tag46);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
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
        boolean boolean12 = doctype8.isEOF();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        boolean boolean9 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token10 = doctype0.reset();
        org.jsoup.parser.Token.Doctype doctype11 = doctype0.asDoctype();
        java.lang.String str12 = doctype11.getName();
        boolean boolean13 = doctype11.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isEOF();
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        org.jsoup.parser.Token.TokenType tokenType35 = startTag30.type;
        org.jsoup.parser.Token.Tag tag36 = startTag30.reset();
        org.jsoup.parser.Token.Tag tag37 = startTag30.reset();
        boolean boolean38 = tag37.isEOF();
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
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        boolean boolean10 = doctype0.forceQuirks;
        doctype0.pubSysKey = "eof4";
        java.lang.String str13 = doctype0.getSystemIdentifier();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        org.jsoup.nodes.Attributes attributes9 = endTag0.getAttributes();
        endTag0.appendAttributeName("hi!</hi!>");
        endTag0.appendTagName("</hi!>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        endTag0.finaliseTag();
        java.lang.String str27 = endTag0.name();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token.Character character7 = character0.data("Character");
        org.jsoup.parser.Token.Character character9 = character0.data("</hi!#>");
        org.jsoup.parser.Token.Character character11 = character0.data("<Comment>");
        java.lang.String str12 = character11.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<Comment>" + "'", str12, "<Comment>");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
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
        boolean boolean29 = endTag0.isCharacter();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = startTag30.nameAttr("EOF", attributes32);
        boolean boolean34 = startTag33.isDoctype();
        org.jsoup.parser.Token.Tag tag35 = startTag33.reset();
        org.jsoup.parser.Token.StartTag startTag36 = tag35.asStartTag();
        startTag36.selfClosing = false;
        org.jsoup.parser.Token.Tag tag39 = startTag36.reset();
        org.jsoup.parser.Token.Tag tag40 = startTag36.reset();
        org.jsoup.nodes.Attributes attributes41 = tag40.getAttributes();
        endTag0.attributes = attributes41;
        endTag0.appendTagName('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
        java.lang.String str13 = doctype0.getName();
        java.lang.String str14 = doctype0.getPublicIdentifier();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag13 = endTag0.reset();
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.pubSysKey;
        doctype0.pubSysKey = "</<<starttag>>>";
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
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
        org.jsoup.parser.Token.StartTag startTag74 = startTag73.asStartTag();
        boolean boolean75 = startTag73.isDoctype();
        org.jsoup.parser.Token.EndTag endTag76 = new org.jsoup.parser.Token.EndTag();
        endTag76.appendAttributeValue(' ');
        char[] charArray81 = new char[] { ' ', ' ' };
        endTag76.appendAttributeValue(charArray81);
        endTag76.selfClosing = true;
        org.jsoup.parser.Token.Tag tag86 = endTag76.name("hi!");
        tag86.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag89 = tag86.asEndTag();
        org.jsoup.parser.Token.EndTag endTag90 = new org.jsoup.parser.Token.EndTag();
        endTag90.finaliseTag();
        boolean boolean92 = endTag90.isCharacter();
        int[] intArray94 = new int[] { (short) 1 };
        endTag90.appendAttributeValue(intArray94);
        endTag89.appendAttributeValue(intArray94);
        startTag73.appendAttributeValue(intArray94);
        boolean boolean98 = startTag73.isDoctype();
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
        org.junit.Assert.assertNotNull(startTag74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag86);
        org.junit.Assert.assertNotNull(endTag89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertArrayEquals(intArray94, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        endTag0.appendAttributeName("");
        endTag0.appendAttributeName('a');
        endTag0.appendAttributeValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        startTag7.newAttribute();
        java.lang.String str12 = startTag7.toString();
        startTag7.appendTagName(' ');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<#>" + "'", str12, "<#>");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.selfClosing;
        org.jsoup.parser.Token.Tag tag9 = startTag7.reset();
        tag9.setEmptyAttributeValue();
        boolean boolean11 = tag9.isSelfClosing();
        tag9.tagName = "<</ >>";
        tag9.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        startTag43.tagName = "Doctype";
        org.jsoup.nodes.Attributes attributes46 = startTag43.attributes;
        org.jsoup.parser.Token.Tag tag47 = startTag43.reset();
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
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(tag47);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = endTag0.reset();
        tag6.appendAttributeName('a');
        boolean boolean9 = tag6.isEOF();
        java.lang.Class<?> wildcardClass10 = tag6.getClass();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
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
        org.jsoup.parser.Token token12 = doctype0.reset();
        boolean boolean13 = doctype0.forceQuirks;
        java.lang.String str14 = doctype0.getPublicIdentifier();
        java.lang.String str15 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        boolean boolean6 = comment0.bogus;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        tag3.normalName = "#";
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        boolean boolean10 = startTag6.selfClosing;
        startTag6.appendAttributeName("");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.nameAttr("EOF", attributes16);
        boolean boolean18 = startTag17.isDoctype();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag17.nameAttr("", attributes20);
        boolean boolean22 = startTag21.isSelfClosing();
        startTag21.normalName = "";
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag33.nameAttr("EOF", attributes35);
        boolean boolean37 = startTag36.isDoctype();
        org.jsoup.parser.Token.Tag tag38 = startTag36.reset();
        startTag36.newAttribute();
        org.jsoup.nodes.Attributes attributes40 = startTag36.attributes;
        endTag32.attributes = attributes40;
        org.jsoup.parser.Token.StartTag startTag42 = startTag29.nameAttr("eof", attributes40);
        org.jsoup.parser.Token.StartTag startTag43 = startTag21.nameAttr("<EOF>", attributes40);
        org.jsoup.parser.Token.StartTag startTag44 = startTag6.nameAttr("Doctype", attributes40);
        org.jsoup.parser.Token.Tag tag46 = startTag44.name("<<hi!>>");
        java.lang.String str47 = startTag44.toString();
        startTag44.normalName = "<Comment>";
        org.jsoup.parser.Token.Tag tag50 = startTag44.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<<<hi!>>>" + "'", str47, "<<<hi!>>>");
        org.junit.Assert.assertNotNull(tag50);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPubSysKey();
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        java.lang.String str4 = character0.getData();
        org.jsoup.parser.Token.Character character6 = character0.data(" ");
        org.jsoup.parser.Token token7 = character6.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        endTag0.newAttribute();
        endTag0.newAttribute();
        endTag0.newAttribute();
        java.lang.Class<?> wildcardClass22 = endTag0.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        org.jsoup.nodes.Attributes attributes9 = endTag0.getAttributes();
        endTag0.appendAttributeName("hi!</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "Doctype";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.appendAttributeName(' ');
        tag10.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes16 = tag10.getAttributes();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        java.lang.String str34 = startTag30.name();
        org.jsoup.parser.Token.Tag tag35 = startTag30.reset();
        org.jsoup.nodes.Attributes attributes36 = startTag30.attributes;
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.finaliseTag();
        endTag38.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag42.nameAttr("EOF", attributes44);
        boolean boolean46 = startTag45.isDoctype();
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes51 = null;
        org.jsoup.parser.Token.StartTag startTag52 = startTag49.nameAttr("EOF", attributes51);
        boolean boolean53 = startTag52.isDoctype();
        org.jsoup.parser.Token.Tag tag54 = startTag52.reset();
        startTag52.newAttribute();
        org.jsoup.nodes.Attributes attributes56 = startTag52.attributes;
        endTag48.attributes = attributes56;
        org.jsoup.parser.Token.StartTag startTag58 = startTag45.nameAttr("eof", attributes56);
        endTag38.attributes = attributes56;
        org.jsoup.parser.Token.StartTag startTag60 = startTag30.nameAttr("</starttag>", attributes56);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(startTag60);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        java.lang.String str7 = character0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = character0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        boolean boolean35 = startTag3.isEOF();
        org.jsoup.parser.Token.Tag tag36 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = startTag37.nameAttr("EOF", attributes39);
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = startTag37.nameAttr("EOF", attributes42);
        startTag43.selfClosing = false;
        java.lang.String str46 = startTag43.tokenType();
        boolean boolean47 = startTag43.selfClosing;
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        endTag48.appendAttributeValue(' ');
        char[] charArray53 = new char[] { ' ', ' ' };
        endTag48.appendAttributeValue(charArray53);
        endTag48.selfClosing = true;
        org.jsoup.parser.Token.Tag tag58 = endTag48.name("hi!");
        tag58.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag61 = tag58.asEndTag();
        org.jsoup.parser.Token.EndTag endTag62 = new org.jsoup.parser.Token.EndTag();
        endTag62.finaliseTag();
        boolean boolean64 = endTag62.isCharacter();
        int[] intArray66 = new int[] { (short) 1 };
        endTag62.appendAttributeValue(intArray66);
        endTag61.appendAttributeValue(intArray66);
        startTag43.appendAttributeValue(intArray66);
        tag36.appendAttributeValue(intArray66);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "StartTag" + "'", str46, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(endTag61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 1 });
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
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
        java.lang.String str13 = tag8.normalName;
        boolean boolean14 = tag8.isSelfClosing();
        java.lang.String str15 = tag8.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.String str10 = doctype0.getName();
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.String str12 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doctype9);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        java.lang.String str9 = doctype8.getSystemIdentifier();
        java.lang.String str10 = doctype8.getPubSysKey();
        java.lang.String str11 = doctype8.getPublicIdentifier();
        org.jsoup.parser.Token token12 = doctype8.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
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
        startTag6.normalName = "eof4";
        java.lang.String str76 = startTag6.normalName();
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
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "eof4" + "'", str76, "eof4");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag14 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag15 = tag14.asEndTag();
        org.jsoup.nodes.Attributes attributes16 = endTag15.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName('#');
        endTag0.appendTagName("StartTag");
        org.jsoup.parser.Token.Tag tag7 = endTag0.name("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        org.jsoup.parser.Token token8 = doctype0.reset();
        boolean boolean9 = doctype0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        boolean boolean5 = comment4.isComment();
        org.jsoup.parser.Token token6 = comment4.reset();
        org.jsoup.parser.Token.TokenType tokenType7 = token6.type;
        endTag0.type = tokenType7;
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
        endTag0.appendAttributeValue(intArray27);
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(endTag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1 });
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        doctype5.pubSysKey = "";
        java.lang.String str8 = doctype5.pubSysKey;
        java.lang.String str9 = doctype5.getPublicIdentifier();
        boolean boolean10 = doctype5.isForceQuirks();
        doctype5.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype13 = doctype5.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType14 = doctype5.type;
        doctype0.type = tokenType14;
        java.lang.String str16 = doctype0.pubSysKey;
        boolean boolean17 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder18 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        boolean boolean2 = doctype0.isEndTag();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isStartTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.String str6 = doctype5.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType9 = endTag0.type;
        endTag0.tagName = "starttag";
        org.jsoup.parser.Token.Tag tag12 = endTag0.reset();
        boolean boolean13 = endTag0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag8 = tag5.asStartTag();
        startTag8.appendAttributeName(' ');
        boolean boolean11 = startTag8.isStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("</ >");
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token.Character character7 = character0.data("<#>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</ >" + "'", str5, "</ >");
        org.junit.Assert.assertNotNull(character7);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
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
        boolean boolean10 = token9.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isEndTag();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag3.type = tokenType8;
        startTag3.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.tokenType();
        doctype0.pubSysKey = "</hi!#>";
        org.jsoup.parser.Token.Doctype doctype12 = doctype0.asDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertNotNull(doctype12);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        boolean boolean9 = startTag3.isEOF();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag3.nameAttr(" ", attributes11);
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        boolean boolean14 = endTag13.isSelfClosing();
        endTag13.normalName = "";
        endTag13.finaliseTag();
        boolean boolean18 = endTag13.selfClosing;
        endTag13.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag21.nameAttr("EOF", attributes23);
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag21.nameAttr("EOF", attributes26);
        java.lang.String str28 = startTag21.normalName();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = startTag29.nameAttr("EOF", attributes31);
        boolean boolean33 = startTag32.isDoctype();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag32.nameAttr("", attributes35);
        org.jsoup.parser.Token.TokenType tokenType37 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag32.type = tokenType37;
        startTag21.type = tokenType37;
        endTag13.type = tokenType37;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag41.nameAttr("EOF", attributes43);
        boolean boolean45 = startTag44.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag44.reset();
        java.lang.String str47 = startTag44.normalName;
        java.lang.String str48 = startTag44.normalName();
        startTag44.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes53 = null;
        org.jsoup.parser.Token.StartTag startTag54 = startTag51.nameAttr("EOF", attributes53);
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = startTag56.nameAttr("EOF", attributes58);
        boolean boolean60 = startTag59.isDoctype();
        org.jsoup.parser.Token.Tag tag61 = startTag59.reset();
        org.jsoup.parser.Token.StartTag startTag62 = tag61.asStartTag();
        org.jsoup.parser.Token.Tag tag63 = tag61.reset();
        org.jsoup.nodes.Attributes attributes64 = tag61.attributes;
        org.jsoup.parser.Token.StartTag startTag65 = startTag54.nameAttr("starttag", attributes64);
        org.jsoup.parser.Token.StartTag startTag66 = startTag44.nameAttr("", attributes64);
        endTag13.attributes = attributes64;
        startTag3.attributes = attributes64;
        java.lang.String str69 = startTag3.name();
        org.jsoup.parser.Token.Tag tag70 = startTag3.reset();
        boolean boolean71 = tag70.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "eof" + "'", str28, "eof");
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + " " + "'", str69, " ");
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        doctype5.pubSysKey = "";
        java.lang.String str8 = doctype5.pubSysKey;
        java.lang.String str9 = doctype5.getPublicIdentifier();
        boolean boolean10 = doctype5.isForceQuirks();
        doctype5.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype13 = doctype5.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType14 = doctype5.type;
        doctype0.type = tokenType14;
        java.lang.String str16 = doctype0.pubSysKey;
        java.lang.String str17 = doctype0.getName();
        boolean boolean18 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.parser.Token.Tag tag12 = startTag10.reset();
        startTag10.newAttribute();
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = startTag19.nameAttr("", attributes22);
        boolean boolean24 = startTag23.isSelfClosing();
        startTag23.normalName = "";
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag28.nameAttr("EOF", attributes30);
        boolean boolean32 = startTag31.isDoctype();
        org.jsoup.parser.Token.EndTag endTag34 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = startTag35.nameAttr("EOF", attributes37);
        boolean boolean39 = startTag38.isDoctype();
        org.jsoup.parser.Token.Tag tag40 = startTag38.reset();
        startTag38.newAttribute();
        org.jsoup.nodes.Attributes attributes42 = startTag38.attributes;
        endTag34.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag44 = startTag31.nameAttr("eof", attributes42);
        org.jsoup.parser.Token.StartTag startTag45 = startTag23.nameAttr("<EOF>", attributes42);
        org.jsoup.parser.Token.StartTag startTag46 = startTag10.nameAttr("eof", attributes42);
        startTag3.attributes = attributes42;
        org.jsoup.nodes.Attributes attributes48 = startTag3.attributes;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag14 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        endTag15.appendAttributeValue(' ');
        char[] charArray20 = new char[] { ' ', ' ' };
        endTag15.appendAttributeValue(charArray20);
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag15.type = tokenType22;
        org.jsoup.parser.Token.Tag tag25 = endTag15.name("eof");
        java.lang.String str26 = tag25.name();
        java.lang.String str27 = tag25.tagName;
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.appendAttributeValue(' ');
        char[] charArray33 = new char[] { ' ', ' ' };
        endTag28.appendAttributeValue(charArray33);
        org.jsoup.parser.Token.EndTag endTag35 = new org.jsoup.parser.Token.EndTag();
        endTag35.appendAttributeValue(' ');
        char[] charArray40 = new char[] { ' ', ' ' };
        endTag35.appendAttributeValue(charArray40);
        endTag28.appendAttributeValue(charArray40);
        endTag28.tagName = "eof";
        java.lang.String str45 = endTag28.name();
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = startTag47.nameAttr("EOF", attributes49);
        boolean boolean51 = startTag50.isDoctype();
        org.jsoup.parser.Token.Tag tag52 = startTag50.reset();
        startTag50.newAttribute();
        org.jsoup.nodes.Attributes attributes54 = startTag50.attributes;
        endTag46.attributes = attributes54;
        endTag28.attributes = attributes54;
        tag25.attributes = attributes54;
        tag14.attributes = attributes54;
        boolean boolean59 = tag14.isComment();
        org.jsoup.parser.Token.EndTag endTag60 = tag14.asEndTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "eof" + "'", str26, "eof");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "eof" + "'", str27, "eof");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "eof" + "'", str45, "eof");
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(endTag60);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.tokenType();
        java.lang.String str8 = comment0.toString();
        boolean boolean9 = comment0.bogus;
        org.jsoup.parser.Token token10 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Comment" + "'", str7, "Comment");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        boolean boolean10 = tag9.isComment();
        tag9.appendTagName("<starttag>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.String str8 = doctype0.getName();
        org.jsoup.parser.Token token9 = doctype0.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype0.type;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        java.lang.String str8 = startTag0.tokenType();
        startTag0.appendAttributeName('#');
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        org.jsoup.parser.Token.Tag tag16 = startTag14.reset();
        java.lang.String str17 = startTag14.normalName;
        java.lang.String str18 = startTag14.normalName();
        boolean boolean19 = startTag14.selfClosing;
        java.lang.String str20 = startTag14.tagName;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.isDoctype();
        org.jsoup.parser.Token.Tag tag27 = startTag25.reset();
        org.jsoup.parser.Token.StartTag startTag28 = tag27.asStartTag();
        org.jsoup.parser.Token.Tag tag29 = tag27.reset();
        org.jsoup.nodes.Attributes attributes30 = tag27.attributes;
        org.jsoup.parser.Token.StartTag startTag31 = startTag14.nameAttr("", attributes30);
        org.jsoup.parser.Token.StartTag startTag32 = startTag3.nameAttr("", attributes30);
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        boolean boolean34 = endTag33.isSelfClosing();
        endTag33.normalName = "";
        endTag33.finaliseTag();
        org.jsoup.nodes.Attributes attributes38 = endTag33.attributes;
        endTag33.appendAttributeValue('#');
        endTag33.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes43 = endTag33.getAttributes();
        java.lang.String str44 = endTag33.name();
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag();
        endTag45.appendAttributeValue(' ');
        char[] charArray50 = new char[] { ' ', ' ' };
        endTag45.appendAttributeValue(charArray50);
        endTag45.selfClosing = true;
        org.jsoup.parser.Token.Tag tag55 = endTag45.name("hi!");
        endTag45.appendAttributeName('a');
        int[] intArray62 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag45.appendAttributeValue(intArray62);
        endTag33.appendAttributeValue(intArray62);
        startTag3.appendAttributeValue(intArray62);
        boolean boolean66 = startTag3.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str67 = startTag3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(attributes38);
        org.junit.Assert.assertNull(attributes43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType8;
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token token12 = doctype0.reset();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag13.nameAttr("EOF", attributes18);
        java.lang.String str20 = startTag13.normalName();
        startTag13.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType22 = startTag13.type;
        java.lang.String str23 = startTag13.toString();
        org.jsoup.parser.Token.Tag tag25 = startTag13.name("<<hi!>>");
        startTag13.appendAttributeName("<</hi!>>");
        boolean boolean28 = startTag13.isComment();
        startTag13.appendAttributeName('4');
        org.jsoup.parser.Token.TokenType tokenType31 = startTag13.type;
        doctype0.type = tokenType31;
        java.lang.String str33 = doctype0.getPublicIdentifier();
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
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eof" + "'", str20, "eof");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<EOF>" + "'", str23, "<EOF>");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token token4 = comment0.reset();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        startTag6.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.Tag tag12 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag14 = tag12.name("eof");
        tag14.normalName = "comment";
        tag14.appendAttributeName('#');
        org.jsoup.parser.Token token19 = tag14.reset();
        java.lang.String str20 = tag14.tokenType();
        boolean boolean21 = tag14.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "StartTag" + "'", str20, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
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
        org.jsoup.parser.Token.TokenType tokenType51 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag49.type = tokenType51;
        boolean boolean53 = startTag49.isComment();
        startTag49.appendTagName("</</hi!>>");
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
        org.junit.Assert.assertTrue("'" + tokenType51 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType51.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
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
        java.lang.String str16 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        startTag6.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag15.nameAttr("", attributes18);
        boolean boolean20 = startTag19.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.isDoctype();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag25.nameAttr("", attributes28);
        boolean boolean30 = startTag29.isSelfClosing();
        java.lang.String str31 = startTag29.tagName;
        boolean boolean32 = startTag29.isEndTag();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("EOF", attributes36);
        boolean boolean38 = startTag37.isDoctype();
        org.jsoup.parser.Token.Tag tag39 = startTag37.reset();
        org.jsoup.parser.Token.StartTag startTag40 = tag39.asStartTag();
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        endTag42.finaliseTag();
        endTag42.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag46.nameAttr("EOF", attributes48);
        boolean boolean50 = startTag49.isDoctype();
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag53.nameAttr("EOF", attributes55);
        boolean boolean57 = startTag56.isDoctype();
        org.jsoup.parser.Token.Tag tag58 = startTag56.reset();
        startTag56.newAttribute();
        org.jsoup.nodes.Attributes attributes60 = startTag56.attributes;
        endTag52.attributes = attributes60;
        org.jsoup.parser.Token.StartTag startTag62 = startTag49.nameAttr("eof", attributes60);
        endTag42.attributes = attributes60;
        org.jsoup.parser.Token.StartTag startTag64 = startTag40.nameAttr("<!---->", attributes60);
        org.jsoup.parser.Token.StartTag startTag65 = startTag29.nameAttr("starttag", attributes60);
        org.jsoup.parser.Token.StartTag startTag66 = startTag19.nameAttr("EOF", attributes60);
        org.jsoup.nodes.Attributes attributes67 = startTag19.getAttributes();
        startTag6.attributes = attributes67;
        org.jsoup.parser.Token.TokenType tokenType69 = startTag6.type;
        java.lang.Class<?> wildcardClass70 = tokenType69.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertTrue("'" + tokenType69 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType69.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isComment();
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.getData();
        boolean boolean6 = comment0.isEOF();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
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
        org.jsoup.parser.Token token15 = doctype0.reset();
        boolean boolean16 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder17 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype18 = doctype0.asDoctype();
        boolean boolean19 = doctype0.isCharacter();
        java.lang.String str20 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(doctype18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
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
        endTag0.appendAttributeName('a');
        boolean boolean19 = endTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag3.type = tokenType8;
        org.jsoup.nodes.Attributes attributes10 = startTag3.getAttributes();
        java.lang.String str11 = startTag3.normalName;
        org.jsoup.nodes.Attributes attributes12 = startTag3.attributes;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
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
        tag8.tagName = "</EndTag>";
        org.jsoup.nodes.Attributes attributes41 = tag8.attributes;
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
        org.junit.Assert.assertNull(attributes41);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("hi!EndTag");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag0.name("Comment");
        java.lang.String str13 = startTag0.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<Comment>" + "'", str13, "<Comment>");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.appendAttributeValue(' ');
        char[] charArray15 = new char[] { ' ', ' ' };
        endTag10.appendAttributeValue(charArray15);
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag();
        endTag17.appendAttributeValue(' ');
        char[] charArray22 = new char[] { ' ', ' ' };
        endTag17.appendAttributeValue(charArray22);
        endTag10.appendAttributeValue(charArray22);
        endTag10.tagName = "eof";
        java.lang.String str27 = endTag10.name();
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = startTag29.nameAttr("EOF", attributes31);
        boolean boolean33 = startTag32.isDoctype();
        org.jsoup.parser.Token.Tag tag34 = startTag32.reset();
        startTag32.newAttribute();
        org.jsoup.nodes.Attributes attributes36 = startTag32.attributes;
        endTag28.attributes = attributes36;
        endTag10.attributes = attributes36;
        startTag6.attributes = attributes36;
        boolean boolean40 = startTag6.isComment();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "eof" + "'", str27, "eof");
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag18.nameAttr("EOF", attributes20);
        boolean boolean22 = startTag21.isDoctype();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag21.nameAttr("", attributes24);
        org.jsoup.parser.Token.Tag tag26 = startTag25.reset();
        startTag25.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes29 = startTag25.attributes;
        endTag0.attributes = attributes29;
        endTag0.appendTagName('4');
        endTag0.appendAttributeName("hi!#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment35 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        java.lang.String str7 = tag6.tokenType();
        tag6.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag10 = tag6.asStartTag();
        startTag10.appendTagName("<</hi!>>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertNotNull(startTag10);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        java.lang.String str4 = character0.getData();
        java.lang.String str5 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes12 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag14 = startTag0.name("</starttag>");
        tag14.tagName = "hi!</hi!>";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        java.lang.StringBuilder stringBuilder13 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        startTag0.selfClosing = false;
        startTag0.appendTagName('#');
        startTag0.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag37 = startTag0.name("<starttag>");
        tag37.appendTagName("EndTag");
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
        org.junit.Assert.assertNotNull(tag37);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendTagName("EndTag");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("EndTag");
        tag8.appendAttributeName('4');
        tag8.appendTagName('a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        java.lang.String str13 = doctype0.getPubSysKey();
        boolean boolean14 = doctype0.isComment();
        doctype0.pubSysKey = "a";
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.toString();
        java.lang.String str9 = comment0.tokenType();
        org.jsoup.parser.Token token10 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Comment" + "'", str9, "Comment");
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        org.jsoup.parser.Token.reset(stringBuilder13);
        org.jsoup.parser.Token.reset(stringBuilder13);
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
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        boolean boolean15 = endTag0.isEndTag();
        org.jsoup.parser.Token.Tag tag16 = endTag0.reset();
        endTag0.appendTagName('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        boolean boolean8 = endTag0.isStartTag();
        boolean boolean9 = endTag0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.tagName;
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        endTag0.appendTagName('4');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        java.lang.String str10 = startTag0.toString();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag14.nameAttr("", attributes17);
        boolean boolean19 = startTag18.isSelfClosing();
        startTag18.newAttribute();
        java.lang.String str21 = startTag18.tagName;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag23.nameAttr("EOF", attributes28);
        org.jsoup.parser.Token.Tag tag31 = startTag23.name("hi!");
        java.lang.String str32 = startTag23.toString();
        java.lang.String str33 = startTag23.toString();
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
        org.jsoup.parser.Token.StartTag startTag52 = startTag23.nameAttr("<hi!>", attributes49);
        org.jsoup.parser.Token.StartTag startTag53 = startTag18.nameAttr("</eof>", attributes49);
        org.jsoup.parser.Token.EndTag endTag54 = new org.jsoup.parser.Token.EndTag();
        endTag54.appendAttributeValue(' ');
        endTag54.newAttribute();
        java.lang.String str58 = endTag54.tagName;
        org.jsoup.parser.Token.EndTag endTag59 = new org.jsoup.parser.Token.EndTag();
        endTag59.finaliseTag();
        endTag59.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes65 = null;
        org.jsoup.parser.Token.StartTag startTag66 = startTag63.nameAttr("EOF", attributes65);
        boolean boolean67 = startTag66.isDoctype();
        org.jsoup.parser.Token.EndTag endTag69 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes72 = null;
        org.jsoup.parser.Token.StartTag startTag73 = startTag70.nameAttr("EOF", attributes72);
        boolean boolean74 = startTag73.isDoctype();
        org.jsoup.parser.Token.Tag tag75 = startTag73.reset();
        startTag73.newAttribute();
        org.jsoup.nodes.Attributes attributes77 = startTag73.attributes;
        endTag69.attributes = attributes77;
        org.jsoup.parser.Token.StartTag startTag79 = startTag66.nameAttr("eof", attributes77);
        endTag59.attributes = attributes77;
        endTag54.attributes = attributes77;
        startTag53.attributes = attributes77;
        startTag0.attributes = attributes77;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<hi!>" + "'", str32, "<hi!>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<hi!>" + "'", str33, "<hi!>");
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(startTag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertNotNull(startTag79);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
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
        org.jsoup.parser.Token.TokenType tokenType48 = null;
        tag42.type = tokenType48;
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
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token.Character character8 = character0.data("<!---->");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token.Character character11 = character8.data("EOF");
        org.jsoup.parser.Token token12 = character11.reset();
        org.jsoup.parser.Token.Character character14 = character11.data("</eof>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(character14);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
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
        endTag0.tagName = "";
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = startTag30.nameAttr("EOF", attributes32);
        boolean boolean34 = startTag33.isDoctype();
        org.jsoup.parser.Token.Tag tag35 = startTag33.reset();
        org.jsoup.parser.Token.StartTag startTag36 = tag35.asStartTag();
        org.jsoup.parser.Token.Tag tag37 = tag35.reset();
        org.jsoup.nodes.Attributes attributes38 = tag35.attributes;
        endTag0.attributes = attributes38;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = startTag40.nameAttr("EOF", attributes42);
        boolean boolean44 = startTag43.isDoctype();
        org.jsoup.parser.Token.Tag tag45 = startTag43.reset();
        java.lang.String str46 = startTag43.normalName;
        java.lang.String str47 = startTag43.normalName();
        boolean boolean48 = startTag43.selfClosing;
        java.lang.String str49 = startTag43.tagName;
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes53 = null;
        org.jsoup.parser.Token.StartTag startTag54 = startTag51.nameAttr("EOF", attributes53);
        boolean boolean55 = startTag54.isDoctype();
        org.jsoup.parser.Token.Tag tag56 = startTag54.reset();
        org.jsoup.parser.Token.StartTag startTag57 = tag56.asStartTag();
        org.jsoup.parser.Token.Tag tag58 = tag56.reset();
        org.jsoup.nodes.Attributes attributes59 = tag56.attributes;
        org.jsoup.parser.Token.StartTag startTag60 = startTag43.nameAttr("", attributes59);
        startTag43.normalName = "";
        org.jsoup.parser.Token.EndTag endTag63 = new org.jsoup.parser.Token.EndTag();
        endTag63.appendAttributeValue(' ');
        char[] charArray68 = new char[] { ' ', ' ' };
        endTag63.appendAttributeValue(charArray68);
        org.jsoup.parser.Token.EndTag endTag70 = endTag63.asEndTag();
        char[] charArray76 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag63.appendAttributeValue(charArray76);
        startTag43.appendAttributeValue(charArray76);
        endTag0.appendAttributeValue(charArray76);
        endTag0.normalName = "</StartTag>";
        endTag0.selfClosing = true;
        endTag0.appendAttributeName('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eof" + "'", str15, "eof");
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag70);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
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
        boolean boolean38 = tag8.isSelfClosing();
        boolean boolean39 = tag8.isEndTag();
        boolean boolean40 = tag8.isDoctype();
        java.lang.String str41 = tag8.tagName;
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "</hi!>" + "'", str41, "</hi!>");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getName();
        doctype0.pubSysKey = "Doctype";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
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
        startTag43.tagName = "Doctype";
        org.jsoup.nodes.Attributes attributes46 = startTag43.attributes;
        java.lang.String str47 = startTag43.tagName;
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
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Doctype" + "'", str47, "Doctype");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token.Character character8 = character0.data("hi!EndTag");
        org.jsoup.parser.Token.Character character10 = character8.data("<#>");
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        endTag0.normalName = "</ >";
        org.jsoup.parser.Token token9 = endTag0.reset();
        boolean boolean10 = endTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag12 = endTag0.name("4");
        tag12.appendAttributeValue(' ');
        java.lang.String str15 = tag12.tagName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4" + "'", str15, "4");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token.Character character8 = character0.data("<!---->");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token.Character character11 = character8.data("EOF");
        org.jsoup.parser.Token.Character character13 = character8.data("hi!</hi!>");
        java.lang.String str14 = character8.getData();
        org.jsoup.parser.Token.Character character16 = character8.data("</</hi!#>>");
        java.lang.String str17 = character16.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!</hi!>" + "'", str14, "hi!</hi!>");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "</</hi!#>>" + "'", str17, "</</hi!#>>");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
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
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        endTag16.appendAttributeValue(' ');
        char[] charArray21 = new char[] { ' ', ' ' };
        endTag16.appendAttributeValue(charArray21);
        endTag16.selfClosing = true;
        org.jsoup.parser.Token.Tag tag26 = endTag16.name("hi!");
        boolean boolean27 = tag26.isEndTag();
        org.jsoup.parser.Token token28 = tag26.reset();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        boolean boolean30 = endTag29.isSelfClosing();
        endTag29.normalName = "";
        endTag29.finaliseTag();
        org.jsoup.nodes.Attributes attributes34 = endTag29.attributes;
        endTag29.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag37 = endTag29.reset();
        org.jsoup.parser.Token.Tag tag38 = endTag29.reset();
        org.jsoup.parser.Token.EndTag endTag39 = new org.jsoup.parser.Token.EndTag();
        boolean boolean40 = endTag39.isSelfClosing();
        endTag39.normalName = "";
        boolean boolean43 = endTag39.selfClosing;
        org.jsoup.parser.Token.Tag tag45 = endTag39.name("eof");
        org.jsoup.parser.Token.Tag tag47 = endTag39.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        endTag48.appendAttributeValue(' ');
        char[] charArray53 = new char[] { ' ', ' ' };
        endTag48.appendAttributeValue(charArray53);
        endTag48.selfClosing = true;
        org.jsoup.parser.Token.Tag tag58 = endTag48.name("hi!");
        endTag48.appendAttributeName('a');
        int[] intArray65 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag48.appendAttributeValue(intArray65);
        org.jsoup.parser.Token.EndTag endTag67 = new org.jsoup.parser.Token.EndTag();
        endTag67.finaliseTag();
        boolean boolean69 = endTag67.isCharacter();
        int[] intArray71 = new int[] { (short) 1 };
        endTag67.appendAttributeValue(intArray71);
        endTag48.appendAttributeValue(intArray71);
        tag47.appendAttributeValue(intArray71);
        tag38.appendAttributeValue(intArray71);
        tag26.appendAttributeValue(intArray71);
        tag13.appendAttributeValue(intArray71);
        tag13.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(token28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(attributes34);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1 });
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.jsoup.parser.Token.Doctype doctype11 = doctype0.asDoctype();
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
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
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
        startTag43.normalName = "<eof>";
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        endTag46.appendAttributeValue(' ');
        char[] charArray51 = new char[] { ' ', ' ' };
        endTag46.appendAttributeValue(charArray51);
        endTag46.selfClosing = true;
        org.jsoup.parser.Token.Tag tag56 = endTag46.name("hi!");
        boolean boolean57 = tag56.isEndTag();
        org.jsoup.parser.Token token58 = tag56.reset();
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes61 = null;
        org.jsoup.parser.Token.StartTag startTag62 = startTag59.nameAttr("EOF", attributes61);
        boolean boolean63 = startTag62.isDoctype();
        org.jsoup.nodes.Attributes attributes65 = null;
        org.jsoup.parser.Token.StartTag startTag66 = startTag62.nameAttr("", attributes65);
        org.jsoup.parser.Token.Tag tag67 = startTag66.reset();
        org.jsoup.parser.Token.EndTag endTag68 = new org.jsoup.parser.Token.EndTag();
        boolean boolean69 = endTag68.isSelfClosing();
        endTag68.normalName = "";
        java.lang.String str72 = endTag68.normalName();
        char[] charArray75 = new char[] { 'a', 'a' };
        endTag68.appendAttributeValue(charArray75);
        tag67.appendAttributeValue(charArray75);
        tag56.appendAttributeValue(charArray75);
        startTag43.appendAttributeValue(charArray75);
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
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(token58);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { 'a', 'a' });
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token token4 = comment0.reset();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.String str6 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isStartTag();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        boolean boolean13 = endTag0.selfClosing;
        boolean boolean14 = endTag0.isEndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag18 = endTag0.name("<Comment>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        comment0.bogus = false;
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.toString();
        boolean boolean7 = comment0.bogus;
        java.lang.String str8 = comment0.toString();
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        boolean boolean10 = doctype0.isCharacter();
        boolean boolean11 = doctype0.forceQuirks;
        org.jsoup.parser.Token token12 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
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
        startTag43.tagName = "Doctype";
        org.jsoup.nodes.Attributes attributes46 = startTag43.attributes;
        startTag43.appendAttributeValue('4');
        boolean boolean49 = startTag43.isComment();
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
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token11 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
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
        boolean boolean29 = endTag0.isCharacter();
        endTag0.appendAttributeName('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.isEOF();
        org.jsoup.parser.Token token10 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        boolean boolean10 = tag9.isComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = tag9.name();
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
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        org.jsoup.parser.Token.TokenType tokenType35 = null;
        startTag3.type = tokenType35;
        startTag3.selfClosing = false;
        org.jsoup.nodes.Attributes attributes39 = startTag3.attributes;
        java.lang.String str40 = startTag3.tagName;
        java.lang.String str41 = startTag3.name();
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
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EndTag" + "'", str40, "EndTag");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EndTag" + "'", str41, "EndTag");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag8 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        startTag8.appendAttributeName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        org.jsoup.parser.Token token33 = startTag6.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = startTag6.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(token33);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        int[] intArray4 = new int[] { (short) 1 };
        endTag0.appendAttributeValue(intArray4);
        endTag0.tagName = "<!---->";
        endTag0.finaliseTag();
        endTag0.appendTagName('4');
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag12.nameAttr("EOF", attributes17);
        startTag18.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag21.nameAttr("EOF", attributes23);
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag21.nameAttr("EOF", attributes26);
        org.jsoup.parser.Token.Tag tag28 = startTag21.reset();
        java.lang.String str29 = tag28.tagName;
        boolean boolean30 = tag28.isCharacter();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag31.nameAttr("EOF", attributes33);
        boolean boolean35 = startTag34.isDoctype();
        org.jsoup.parser.Token.Tag tag36 = startTag34.reset();
        java.lang.String str37 = startTag34.normalName;
        java.lang.String str38 = startTag34.normalName();
        boolean boolean39 = startTag34.selfClosing;
        java.lang.String str40 = startTag34.tagName;
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag42.nameAttr("EOF", attributes44);
        boolean boolean46 = startTag45.isDoctype();
        org.jsoup.parser.Token.Tag tag47 = startTag45.reset();
        org.jsoup.parser.Token.StartTag startTag48 = tag47.asStartTag();
        org.jsoup.parser.Token.Tag tag49 = tag47.reset();
        org.jsoup.nodes.Attributes attributes50 = tag47.attributes;
        org.jsoup.parser.Token.StartTag startTag51 = startTag34.nameAttr("", attributes50);
        startTag34.normalName = "";
        org.jsoup.parser.Token.EndTag endTag54 = new org.jsoup.parser.Token.EndTag();
        endTag54.appendAttributeValue(' ');
        char[] charArray59 = new char[] { ' ', ' ' };
        endTag54.appendAttributeValue(charArray59);
        org.jsoup.parser.Token.EndTag endTag61 = endTag54.asEndTag();
        char[] charArray67 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag54.appendAttributeValue(charArray67);
        startTag34.appendAttributeValue(charArray67);
        tag28.appendAttributeValue(charArray67);
        startTag18.appendAttributeValue(charArray67);
        endTag0.appendAttributeValue(charArray67);
        java.lang.String str73 = endTag0.toString();
        java.lang.String str74 = endTag0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag61);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '#', '#', ' ', 'a', ' ' });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "</<!---->4>" + "'", str73, "</<!---->4>");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "</<!---->4>" + "'", str74, "</<!---->4>");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.pubSysKey;
        boolean boolean9 = doctype0.isDoctype();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
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
        boolean boolean15 = startTag3.isStartTag();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag17.nameAttr("EOF", attributes19);
        boolean boolean21 = startTag20.isDoctype();
        org.jsoup.parser.Token.Tag tag22 = startTag20.reset();
        org.jsoup.parser.Token.StartTag startTag23 = tag22.asStartTag();
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag();
        endTag25.finaliseTag();
        endTag25.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = startTag29.nameAttr("EOF", attributes31);
        boolean boolean33 = startTag32.isDoctype();
        org.jsoup.parser.Token.EndTag endTag35 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        boolean boolean40 = startTag39.isDoctype();
        org.jsoup.parser.Token.Tag tag41 = startTag39.reset();
        startTag39.newAttribute();
        org.jsoup.nodes.Attributes attributes43 = startTag39.attributes;
        endTag35.attributes = attributes43;
        org.jsoup.parser.Token.StartTag startTag45 = startTag32.nameAttr("eof", attributes43);
        endTag25.attributes = attributes43;
        org.jsoup.parser.Token.StartTag startTag47 = startTag23.nameAttr("<!---->", attributes43);
        org.jsoup.parser.Token.StartTag startTag48 = startTag3.nameAttr("a", attributes43);
        org.jsoup.nodes.Attributes attributes49 = startTag48.attributes;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(attributes49);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPubSysKey();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getName();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype14 = doctype0.asDoctype();
        java.lang.String str15 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder16 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType17 = doctype0.type;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doctype14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isComment();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
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
        startTag3.tagName = "<<!---->>";
        startTag3.finaliseTag();
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
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        boolean boolean5 = startTag3.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag6 = startTag3.asStartTag();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag7.nameAttr("EOF", attributes12);
        startTag13.selfClosing = false;
        java.lang.String str16 = startTag13.tokenType();
        boolean boolean17 = startTag13.selfClosing;
        startTag13.appendAttributeName("");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag21.nameAttr("EOF", attributes23);
        boolean boolean25 = startTag24.isDoctype();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = startTag24.nameAttr("", attributes27);
        boolean boolean29 = startTag28.isSelfClosing();
        startTag28.normalName = "";
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag33.nameAttr("EOF", attributes35);
        boolean boolean37 = startTag36.isDoctype();
        org.jsoup.parser.Token.EndTag endTag39 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = startTag40.nameAttr("EOF", attributes42);
        boolean boolean44 = startTag43.isDoctype();
        org.jsoup.parser.Token.Tag tag45 = startTag43.reset();
        startTag43.newAttribute();
        org.jsoup.nodes.Attributes attributes47 = startTag43.attributes;
        endTag39.attributes = attributes47;
        org.jsoup.parser.Token.StartTag startTag49 = startTag36.nameAttr("eof", attributes47);
        org.jsoup.parser.Token.StartTag startTag50 = startTag28.nameAttr("<EOF>", attributes47);
        org.jsoup.parser.Token.StartTag startTag51 = startTag13.nameAttr("Doctype", attributes47);
        org.jsoup.parser.Token.Tag tag52 = startTag51.reset();
        org.jsoup.parser.Token.TokenType tokenType53 = tag52.type;
        startTag3.type = tokenType53;
        java.lang.String str55 = startTag3.tagName;
        org.jsoup.parser.Token.EndTag endTag56 = new org.jsoup.parser.Token.EndTag();
        boolean boolean57 = endTag56.isSelfClosing();
        endTag56.normalName = "";
        endTag56.finaliseTag();
        boolean boolean61 = endTag56.selfClosing;
        endTag56.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes66 = null;
        org.jsoup.parser.Token.StartTag startTag67 = startTag64.nameAttr("EOF", attributes66);
        org.jsoup.nodes.Attributes attributes69 = null;
        org.jsoup.parser.Token.StartTag startTag70 = startTag64.nameAttr("EOF", attributes69);
        java.lang.String str71 = startTag64.normalName();
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes74 = null;
        org.jsoup.parser.Token.StartTag startTag75 = startTag72.nameAttr("EOF", attributes74);
        boolean boolean76 = startTag75.isDoctype();
        org.jsoup.nodes.Attributes attributes78 = null;
        org.jsoup.parser.Token.StartTag startTag79 = startTag75.nameAttr("", attributes78);
        org.jsoup.parser.Token.TokenType tokenType80 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag75.type = tokenType80;
        startTag64.type = tokenType80;
        endTag56.type = tokenType80;
        startTag3.type = tokenType80;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "EOF" + "'", str55, "EOF");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(startTag67);
        org.junit.Assert.assertNotNull(startTag70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "eof" + "'", str71, "eof");
        org.junit.Assert.assertNotNull(startTag75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(startTag79);
        org.junit.Assert.assertTrue("'" + tokenType80 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType80.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        int[] intArray10 = new int[] { 1, 10, 10 };
        endTag0.appendAttributeValue(intArray10);
        org.jsoup.parser.Token.Tag tag13 = endTag0.name("StartTag");
        org.jsoup.nodes.Attributes attributes14 = endTag0.attributes;
        java.lang.String str15 = endTag0.toString();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</StartTag>" + "'", str15, "</StartTag>");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
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
        tag17.selfClosing = false;
        boolean boolean20 = tag17.selfClosing;
        tag17.tagName = "Doctype";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        tag42.appendTagName('4');
        boolean boolean50 = tag42.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        endTag0.appendTagName("StartTag");
        java.lang.String str7 = endTag0.name();
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>StartTag" + "'", str7, "</hi!>StartTag");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.getPubSysKey();
        boolean boolean10 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
        boolean boolean13 = tag12.isEOF();
        org.jsoup.parser.Token.Tag tag14 = tag12.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        boolean boolean9 = startTag6.isComment();
        startTag6.appendAttributeValue("");
        org.jsoup.parser.Token.Tag tag12 = startTag6.reset();
        org.jsoup.nodes.Attributes attributes13 = tag12.attributes;
        org.jsoup.nodes.Attributes attributes14 = tag12.attributes;
        tag12.normalName = "</hi!#>";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("hi!#");
        java.lang.String str7 = character6.getData();
        org.jsoup.parser.Token.Character character9 = character6.data("hi!#");
        org.jsoup.parser.Token token10 = character6.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!#" + "'", str7, "hi!#");
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        org.jsoup.nodes.Attributes attributes33 = tag32.attributes;
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
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        org.jsoup.parser.Token token7 = startTag3.reset();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag11 = endTag8.reset();
        tag11.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag15 = tag11.name("StartTag");
        org.jsoup.parser.Token token16 = tag11.reset();
        org.jsoup.parser.Token.TokenType tokenType17 = token16.type;
        startTag3.type = tokenType17;
        org.jsoup.nodes.Attributes attributes19 = startTag3.attributes;
        java.lang.Class<?> wildcardClass20 = attributes19.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
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
        endTag13.selfClosing = true;
        org.jsoup.parser.Token.Tag tag24 = endTag13.name("</eof>");
        java.lang.String str25 = endTag13.tagName;
        endTag13.appendAttributeValue("hi!EndTag");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1 });
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</eof>" + "'", str25, "</eof>");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
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
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        java.lang.String str14 = doctype0.pubSysKey;
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
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        tag9.appendAttributeName("<</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        boolean boolean44 = startTag43.selfClosing;
        org.jsoup.parser.Token.Tag tag45 = startTag43.reset();
        org.jsoup.parser.Token.Tag tag46 = startTag43.reset();
        boolean boolean47 = tag46.isStartTag();
        boolean boolean48 = tag46.selfClosing;
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.String str10 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype11 = doctype0.asDoctype();
        java.lang.String str12 = doctype11.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
        org.jsoup.parser.Token.Tag tag33 = startTag6.reset();
        tag33.tagName = "starttag";
        org.jsoup.parser.Token.Tag tag36 = tag33.reset();
        tag36.tagName = "<!---->";
        org.jsoup.parser.Token.StartTag startTag39 = tag36.asStartTag();
        startTag39.newAttribute();
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
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(startTag39);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        int[] intArray10 = new int[] { 1, 10, 10 };
        endTag0.appendAttributeValue(intArray10);
        org.jsoup.parser.Token.Tag tag13 = endTag0.name("StartTag");
        org.jsoup.parser.Token.TokenType tokenType14 = tag13.type;
        org.jsoup.parser.Token.EndTag endTag15 = tag13.asEndTag();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag15);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.String str10 = doctype0.getPubSysKey();
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getPublicIdentifier();
        java.lang.String str12 = doctype0.getPubSysKey();
        boolean boolean13 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        boolean boolean7 = comment0.bogus;
        java.lang.String str8 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        org.jsoup.parser.Token token8 = tag3.reset();
        java.lang.String str9 = tag3.tagName;
        tag3.normalName = "</</eof>>";
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        org.jsoup.parser.Token.Tag tag35 = startTag30.reset();
        tag35.finaliseTag();
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
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getName();
        boolean boolean10 = doctype0.isComment();
        org.jsoup.parser.Token token11 = doctype0.reset();
        boolean boolean12 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        java.lang.String str8 = startTag0.normalName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag7 = endTag0.name("</<!---->4>");
        boolean boolean8 = tag7.isComment();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        endTag0.tagName = "Doctype";
        boolean boolean18 = endTag0.isStartTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        int[] intArray10 = new int[] { 1, 10, 10 };
        endTag0.appendAttributeValue(intArray10);
        endTag0.appendAttributeName("</hi!>");
        org.jsoup.parser.Token.Tag tag14 = endTag0.reset();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
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
        tag13.appendAttributeValue('a');
        java.lang.String str18 = tag13.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#" + "'", str18, "#");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.String str7 = doctype0.pubSysKey;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        doctype0.pubSysKey = "hi!</hi!>";
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        boolean boolean12 = doctype0.forceQuirks;
        java.lang.String str13 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType14 = doctype0.type;
        boolean boolean15 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes3 = endTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag4.nameAttr("EOF", attributes6);
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag4.nameAttr("EOF", attributes9);
        startTag10.selfClosing = false;
        boolean boolean13 = startTag10.isComment();
        startTag10.appendAttributeValue("");
        org.jsoup.parser.Token.Tag tag16 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes17 = tag16.attributes;
        endTag0.attributes = attributes17;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype19 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.String str3 = comment0.toString();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
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
        java.lang.String str12 = startTag7.tagName;
        startTag7.setEmptyAttributeValue();
        startTag7.appendAttributeName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.appendAttributeName(' ');
        tag10.setEmptyAttributeValue();
        boolean boolean16 = tag10.isComment();
        org.jsoup.parser.Token token17 = tag10.reset();
        tag10.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(token17);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        org.jsoup.parser.Token.TokenType tokenType6 = comment0.type;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.normalName = "</<!---->4>";
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag9.nameAttr("EOF", attributes11);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag9.nameAttr("EOF", attributes14);
        org.jsoup.parser.Token.Tag tag16 = startTag9.reset();
        boolean boolean17 = startTag9.isSelfClosing();
        org.jsoup.parser.Token.Tag tag18 = startTag9.reset();
        boolean boolean19 = startTag9.isComment();
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag();
        endTag21.finaliseTag();
        endTag21.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = startTag25.nameAttr("EOF", attributes27);
        boolean boolean29 = startTag28.isDoctype();
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag32.nameAttr("EOF", attributes34);
        boolean boolean36 = startTag35.isDoctype();
        org.jsoup.parser.Token.Tag tag37 = startTag35.reset();
        startTag35.newAttribute();
        org.jsoup.nodes.Attributes attributes39 = startTag35.attributes;
        endTag31.attributes = attributes39;
        org.jsoup.parser.Token.StartTag startTag41 = startTag28.nameAttr("eof", attributes39);
        endTag21.attributes = attributes39;
        org.jsoup.parser.Token.StartTag startTag43 = startTag9.nameAttr("</hi!>", attributes39);
        org.jsoup.parser.Token.Tag tag44 = startTag9.reset();
        org.jsoup.parser.Token.Tag tag45 = startTag9.reset();
        org.jsoup.nodes.Attributes attributes46 = startTag9.getAttributes();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = startTag47.nameAttr("EOF", attributes49);
        boolean boolean51 = startTag50.isDoctype();
        org.jsoup.nodes.Attributes attributes53 = null;
        org.jsoup.parser.Token.StartTag startTag54 = startTag50.nameAttr("", attributes53);
        org.jsoup.parser.Token.Tag tag55 = startTag54.reset();
        org.jsoup.parser.Token.EndTag endTag56 = new org.jsoup.parser.Token.EndTag();
        boolean boolean57 = endTag56.isSelfClosing();
        endTag56.normalName = "";
        java.lang.String str60 = endTag56.normalName();
        char[] charArray63 = new char[] { 'a', 'a' };
        endTag56.appendAttributeValue(charArray63);
        tag55.appendAttributeValue(charArray63);
        startTag9.appendAttributeValue(charArray63);
        tag6.appendAttributeValue(charArray63);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { 'a', 'a' });
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "</</hi!>>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
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
        org.jsoup.parser.Token.Tag tag23 = startTag20.name("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = startTag20.toString();
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
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
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
        tag10.setEmptyAttributeValue();
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
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getName();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean13 = doctype0.isForceQuirks();
        java.lang.String str14 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character8 = character0.asCharacter();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character8);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("hi!#");
        java.lang.String str7 = character6.getData();
        org.jsoup.parser.Token.Character character9 = character6.data("hi!#");
        org.jsoup.parser.Token token10 = character6.reset();
        java.lang.String str11 = character6.getData();
        org.jsoup.parser.Token token12 = character6.reset();
        java.lang.String str13 = character6.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!#" + "'", str7, "hi!#");
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag11 = tag9.name("<!---->");
        tag11.appendAttributeValue('a');
        org.jsoup.parser.Token.Tag tag14 = tag11.reset();
        tag11.appendAttributeValue("endtag");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        org.jsoup.parser.Token token12 = tag11.reset();
        tag11.selfClosing = false;
        tag11.finaliseTag();
        tag11.normalName = "</4>";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.jsoup.parser.Token token8 = eOF0.reset();
        org.jsoup.parser.Token token9 = eOF0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        comment0.bogus = false;
        java.lang.String str10 = comment0.toString();
        boolean boolean11 = comment0.bogus;
        boolean boolean12 = comment0.isComment();
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
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
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        boolean boolean12 = doctype0.isForceQuirks();
        doctype0.pubSysKey = "</StartTag>";
        java.lang.StringBuilder stringBuilder15 = doctype0.name;
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
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        java.lang.String str8 = startTag0.tokenType();
        startTag0.appendAttributeValue("EndTag");
        boolean boolean11 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        org.jsoup.parser.Token.Tag tag16 = startTag14.reset();
        java.lang.String str17 = startTag14.normalName;
        java.lang.String str18 = startTag14.normalName();
        boolean boolean19 = startTag14.selfClosing;
        java.lang.String str20 = startTag14.tagName;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.isDoctype();
        org.jsoup.parser.Token.Tag tag27 = startTag25.reset();
        org.jsoup.parser.Token.StartTag startTag28 = tag27.asStartTag();
        org.jsoup.parser.Token.Tag tag29 = tag27.reset();
        org.jsoup.nodes.Attributes attributes30 = tag27.attributes;
        org.jsoup.parser.Token.StartTag startTag31 = startTag14.nameAttr("", attributes30);
        org.jsoup.parser.Token.StartTag startTag32 = startTag3.nameAttr("", attributes30);
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        boolean boolean34 = endTag33.isSelfClosing();
        endTag33.normalName = "";
        endTag33.finaliseTag();
        org.jsoup.nodes.Attributes attributes38 = endTag33.attributes;
        endTag33.appendAttributeValue('#');
        endTag33.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes43 = endTag33.getAttributes();
        java.lang.String str44 = endTag33.name();
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag();
        endTag45.appendAttributeValue(' ');
        char[] charArray50 = new char[] { ' ', ' ' };
        endTag45.appendAttributeValue(charArray50);
        endTag45.selfClosing = true;
        org.jsoup.parser.Token.Tag tag55 = endTag45.name("hi!");
        endTag45.appendAttributeName('a');
        int[] intArray62 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag45.appendAttributeValue(intArray62);
        endTag33.appendAttributeValue(intArray62);
        startTag3.appendAttributeValue(intArray62);
        boolean boolean66 = startTag3.isEOF();
        startTag3.appendAttributeValue("<<</hi!>>>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(attributes38);
        org.junit.Assert.assertNull(attributes43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        tag7.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = tag7.reset();
        tag10.newAttribute();
        java.lang.String str12 = tag10.normalName();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        comment0.bogus = true;
        java.lang.String str27 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype28 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        int[] intArray4 = new int[] { (short) 1 };
        endTag0.appendAttributeValue(intArray4);
        endTag0.tagName = "<!---->";
        endTag0.finaliseTag();
        endTag0.appendTagName('4');
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag12.nameAttr("EOF", attributes17);
        startTag18.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag21.nameAttr("EOF", attributes23);
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag21.nameAttr("EOF", attributes26);
        org.jsoup.parser.Token.Tag tag28 = startTag21.reset();
        java.lang.String str29 = tag28.tagName;
        boolean boolean30 = tag28.isCharacter();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag31.nameAttr("EOF", attributes33);
        boolean boolean35 = startTag34.isDoctype();
        org.jsoup.parser.Token.Tag tag36 = startTag34.reset();
        java.lang.String str37 = startTag34.normalName;
        java.lang.String str38 = startTag34.normalName();
        boolean boolean39 = startTag34.selfClosing;
        java.lang.String str40 = startTag34.tagName;
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag42.nameAttr("EOF", attributes44);
        boolean boolean46 = startTag45.isDoctype();
        org.jsoup.parser.Token.Tag tag47 = startTag45.reset();
        org.jsoup.parser.Token.StartTag startTag48 = tag47.asStartTag();
        org.jsoup.parser.Token.Tag tag49 = tag47.reset();
        org.jsoup.nodes.Attributes attributes50 = tag47.attributes;
        org.jsoup.parser.Token.StartTag startTag51 = startTag34.nameAttr("", attributes50);
        startTag34.normalName = "";
        org.jsoup.parser.Token.EndTag endTag54 = new org.jsoup.parser.Token.EndTag();
        endTag54.appendAttributeValue(' ');
        char[] charArray59 = new char[] { ' ', ' ' };
        endTag54.appendAttributeValue(charArray59);
        org.jsoup.parser.Token.EndTag endTag61 = endTag54.asEndTag();
        char[] charArray67 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag54.appendAttributeValue(charArray67);
        startTag34.appendAttributeValue(charArray67);
        tag28.appendAttributeValue(charArray67);
        startTag18.appendAttributeValue(charArray67);
        endTag0.appendAttributeValue(charArray67);
        org.jsoup.parser.Token.TokenType tokenType73 = org.jsoup.parser.Token.TokenType.EOF;
        endTag0.type = tokenType73;
        org.jsoup.parser.Token.EndTag endTag75 = new org.jsoup.parser.Token.EndTag();
        endTag75.appendAttributeValue(' ');
        char[] charArray80 = new char[] { ' ', ' ' };
        endTag75.appendAttributeValue(charArray80);
        endTag75.selfClosing = true;
        org.jsoup.parser.Token.Tag tag85 = endTag75.name("hi!");
        endTag75.appendAttributeValue("</ >");
        boolean boolean88 = endTag75.isEOF();
        org.jsoup.parser.Token.TokenType tokenType89 = endTag75.type;
        endTag0.type = tokenType89;
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag61);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '#', '#', ' ', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType73 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType73.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + tokenType89 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType89.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token.Character character5 = character0.data("</hi!>");
        org.jsoup.parser.Token.Character character7 = character5.data("<!---->4");
        boolean boolean8 = character5.isEndTag();
        org.jsoup.parser.Token token9 = character5.reset();
        org.jsoup.parser.Token.Character character11 = character5.data("</eof>");
        org.jsoup.parser.Token.Character character13 = character11.data("<a>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(character13);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        boolean boolean8 = tag5.selfClosing;
        tag5.appendAttributeValue("<starttag>");
        java.lang.String str11 = tag5.normalName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
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
        doctype0.pubSysKey = "Character";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("hi!#");
        org.jsoup.parser.Token.Character character8 = character0.data("</eof>");
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        java.lang.String str7 = character0.toString();
        org.jsoup.parser.Token token8 = character0.reset();
        org.jsoup.parser.Token token9 = character0.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
        boolean boolean12 = startTag3.selfClosing;
        java.lang.String str13 = startTag3.normalName();
        startTag3.appendTagName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token.Character character7 = character0.data("Character");
        org.jsoup.parser.Token.Character character9 = character0.data("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = character0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(character9);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getName();
        doctype0.pubSysKey = "<starttag>";
        java.lang.String str11 = doctype0.getName();
        java.lang.String str12 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
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
        startTag0.normalName = "<starttag>";
        startTag0.appendAttributeName("<#>");
        startTag0.newAttribute();
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
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        startTag0.normalName = "<starttag>";
        startTag0.normalName = "</##>";
        boolean boolean27 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        java.lang.String str8 = tag3.normalName;
        boolean boolean9 = tag3.isStartTag();
        java.lang.String str10 = tag3.normalName;
        org.jsoup.parser.Token token11 = tag3.reset();
        boolean boolean12 = token11.isEndTag();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "starttag" + "'", str8, "starttag");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "starttag" + "'", str10, "starttag");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
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
        startTag7.appendTagName('a');
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
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token.TokenType tokenType3 = null;
        eOF0.type = tokenType3;
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        boolean boolean7 = eOF0.isComment();
        org.jsoup.parser.Token token8 = eOF0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
    }
}

