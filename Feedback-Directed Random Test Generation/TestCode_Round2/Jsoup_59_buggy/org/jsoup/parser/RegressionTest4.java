package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        java.lang.String str12 = endTag0.toString();
        boolean boolean13 = endTag0.isEOF();
        org.jsoup.parser.Token token14 = endTag0.reset();
        org.jsoup.parser.Token token15 = token14.reset();
        boolean boolean16 = token15.isDoctype();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        java.lang.String str14 = startTag3.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        tag10.appendAttributeName("starttag");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EndTag" + "'", str16, "EndTag");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isComment();
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.String str7 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        java.lang.String str18 = endTag0.normalName();
        org.jsoup.parser.Token.Tag tag20 = endTag0.name("<#>");
        boolean boolean21 = endTag0.isDoctype();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!#" + "'", str18, "hi!#");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token.Character character6 = character0.asCharacter();
        org.jsoup.parser.Token token7 = character0.reset();
        java.lang.String str8 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        java.lang.String str2 = comment0.getData();
        comment0.bogus = false;
        boolean boolean5 = comment0.bogus;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.lang.String str12 = comment0.getData();
        boolean boolean13 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.setEmptyAttributeValue();
        endTag0.finaliseTag();
        endTag0.appendAttributeValue("");
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        java.lang.String str10 = tag9.tagName;
        java.lang.String str11 = tag9.tokenType();
        boolean boolean12 = tag9.isEOF();
        tag9.setEmptyAttributeValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EndTag" + "'", str11, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        boolean boolean14 = tag10.isDoctype();
        tag10.appendAttributeName("starttag");
        java.lang.String str17 = tag10.name();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.jsoup.parser.Token.Tag tag33 = startTag3.reset();
        boolean boolean34 = tag33.selfClosing;
        tag33.appendAttributeValue(' ');
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
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character0.getData();
        java.lang.String str8 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype4.getName();
        boolean boolean6 = doctype4.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token9 = doctype0.reset();
        org.jsoup.parser.Token token10 = doctype0.reset();
        java.lang.String str11 = doctype0.pubSysKey;
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
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.getData();
        boolean boolean6 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        tag8.appendAttributeValue("a");
        tag8.appendAttributeName("<EOF >");
        tag8.appendTagName("</hi!>");
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
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data(" ");
        org.jsoup.parser.Token.Character character8 = character0.data("hi!#");
        java.lang.String str9 = character0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = character0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!#" + "'", str9, "hi!#");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        boolean boolean9 = startTag6.isComment();
        startTag6.appendTagName(' ');
        java.lang.String str12 = startTag6.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF " + "'", str12, "EOF ");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isEOF();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.String str7 = comment0.getData();
        boolean boolean8 = comment0.bogus;
        java.lang.String str9 = comment0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        comment0.bogus = false;
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        java.lang.Class<?> wildcardClass9 = stringBuilder8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        java.lang.String str12 = character11.tokenType();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Character" + "'", str12, "Character");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        boolean boolean13 = doctype0.isEndTag();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token9 = doctype0.reset();
        doctype0.forceQuirks = true;
        doctype0.pubSysKey = "<Comment>";
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
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        tag13.appendAttributeValue("</StartTag>");
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag33.nameAttr("EOF", attributes35);
        boolean boolean37 = startTag36.isDoctype();
        org.jsoup.parser.Token.Tag tag38 = startTag36.reset();
        org.jsoup.parser.Token.StartTag startTag39 = tag38.asStartTag();
        org.jsoup.parser.Token.EndTag endTag41 = new org.jsoup.parser.Token.EndTag();
        endTag41.finaliseTag();
        endTag41.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes47 = null;
        org.jsoup.parser.Token.StartTag startTag48 = startTag45.nameAttr("EOF", attributes47);
        boolean boolean49 = startTag48.isDoctype();
        org.jsoup.parser.Token.EndTag endTag51 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = startTag52.nameAttr("EOF", attributes54);
        boolean boolean56 = startTag55.isDoctype();
        org.jsoup.parser.Token.Tag tag57 = startTag55.reset();
        startTag55.newAttribute();
        org.jsoup.nodes.Attributes attributes59 = startTag55.attributes;
        endTag51.attributes = attributes59;
        org.jsoup.parser.Token.StartTag startTag61 = startTag48.nameAttr("eof", attributes59);
        endTag41.attributes = attributes59;
        org.jsoup.parser.Token.StartTag startTag63 = startTag39.nameAttr("<!---->", attributes59);
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = startTag65.nameAttr("EOF", attributes67);
        boolean boolean69 = startTag68.isDoctype();
        org.jsoup.parser.Token.EndTag endTag71 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes74 = null;
        org.jsoup.parser.Token.StartTag startTag75 = startTag72.nameAttr("EOF", attributes74);
        boolean boolean76 = startTag75.isDoctype();
        org.jsoup.parser.Token.Tag tag77 = startTag75.reset();
        startTag75.newAttribute();
        org.jsoup.nodes.Attributes attributes79 = startTag75.attributes;
        endTag71.attributes = attributes79;
        org.jsoup.parser.Token.StartTag startTag81 = startTag68.nameAttr("eof", attributes79);
        org.jsoup.parser.Token.StartTag startTag82 = startTag39.nameAttr("hi!", attributes79);
        java.lang.String str83 = startTag82.normalName();
        org.jsoup.parser.Token.TokenType tokenType84 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag82.type = tokenType84;
        tag13.type = tokenType84;
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
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(startTag75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(startTag81);
        org.junit.Assert.assertNotNull(startTag82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType84 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType84.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        boolean boolean9 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        boolean boolean25 = endTag0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token token8 = endTag0.reset();
        boolean boolean9 = endTag0.isStartTag();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.appendAttributeValue(' ');
        char[] charArray15 = new char[] { ' ', ' ' };
        endTag10.appendAttributeValue(charArray15);
        endTag10.selfClosing = true;
        endTag10.appendAttributeValue("<#>");
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag();
        boolean boolean22 = endTag21.isSelfClosing();
        endTag21.normalName = "";
        endTag21.finaliseTag();
        boolean boolean26 = endTag21.selfClosing;
        endTag21.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = startTag29.nameAttr("EOF", attributes31);
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag29.nameAttr("EOF", attributes34);
        java.lang.String str36 = startTag29.normalName();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = startTag37.nameAttr("EOF", attributes39);
        boolean boolean41 = startTag40.isDoctype();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag40.nameAttr("", attributes43);
        org.jsoup.parser.Token.TokenType tokenType45 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag40.type = tokenType45;
        startTag29.type = tokenType45;
        endTag21.type = tokenType45;
        endTag21.tagName = "";
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes53 = null;
        org.jsoup.parser.Token.StartTag startTag54 = startTag51.nameAttr("EOF", attributes53);
        boolean boolean55 = startTag54.isDoctype();
        org.jsoup.parser.Token.Tag tag56 = startTag54.reset();
        org.jsoup.parser.Token.StartTag startTag57 = tag56.asStartTag();
        org.jsoup.parser.Token.Tag tag58 = tag56.reset();
        org.jsoup.nodes.Attributes attributes59 = tag56.attributes;
        endTag21.attributes = attributes59;
        org.jsoup.nodes.Attributes attributes61 = endTag21.attributes;
        endTag10.attributes = attributes61;
        endTag0.attributes = attributes61;
        endTag0.appendTagName("</StartTag>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "eof" + "'", str36, "eof");
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(attributes61);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.lang.String str47 = startTag46.name();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes51 = null;
        org.jsoup.parser.Token.StartTag startTag52 = startTag49.nameAttr("EOF", attributes51);
        boolean boolean53 = startTag52.isDoctype();
        org.jsoup.parser.Token.Tag tag54 = startTag52.reset();
        startTag52.newAttribute();
        org.jsoup.nodes.Attributes attributes56 = startTag52.attributes;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes60 = null;
        org.jsoup.parser.Token.StartTag startTag61 = startTag58.nameAttr("EOF", attributes60);
        boolean boolean62 = startTag61.isDoctype();
        org.jsoup.nodes.Attributes attributes64 = null;
        org.jsoup.parser.Token.StartTag startTag65 = startTag61.nameAttr("", attributes64);
        boolean boolean66 = startTag65.isSelfClosing();
        startTag65.normalName = "";
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes72 = null;
        org.jsoup.parser.Token.StartTag startTag73 = startTag70.nameAttr("EOF", attributes72);
        boolean boolean74 = startTag73.isDoctype();
        org.jsoup.parser.Token.EndTag endTag76 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag77 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes79 = null;
        org.jsoup.parser.Token.StartTag startTag80 = startTag77.nameAttr("EOF", attributes79);
        boolean boolean81 = startTag80.isDoctype();
        org.jsoup.parser.Token.Tag tag82 = startTag80.reset();
        startTag80.newAttribute();
        org.jsoup.nodes.Attributes attributes84 = startTag80.attributes;
        endTag76.attributes = attributes84;
        org.jsoup.parser.Token.StartTag startTag86 = startTag73.nameAttr("eof", attributes84);
        org.jsoup.parser.Token.StartTag startTag87 = startTag65.nameAttr("<EOF>", attributes84);
        org.jsoup.parser.Token.StartTag startTag88 = startTag52.nameAttr("eof", attributes84);
        org.jsoup.parser.Token.StartTag startTag89 = startTag46.nameAttr("<<hi!>>", attributes84);
        java.lang.String str90 = startTag46.tagName;
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "< >" + "'", str47, "< >");
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(startTag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(startTag80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertNotNull(attributes84);
        org.junit.Assert.assertNotNull(startTag86);
        org.junit.Assert.assertNotNull(startTag87);
        org.junit.Assert.assertNotNull(startTag88);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "<<hi!>>" + "'", str90, "<<hi!>>");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        java.lang.String str12 = tag11.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPubSysKey();
        java.lang.String str6 = doctype0.tokenType();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        endTag0.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        java.lang.String str20 = endTag0.tagName;
        org.jsoup.parser.Token.EndTag endTag21 = endTag0.asEndTag();
        boolean boolean22 = endTag21.isDoctype();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#" + "'", str20, "#");
        org.junit.Assert.assertNotNull(endTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        org.jsoup.parser.Token token9 = startTag7.reset();
        boolean boolean10 = startTag7.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        startTag6.tagName = "<<<hi!>>>";
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
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        doctype0.pubSysKey = "hi! ";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        java.lang.String str12 = endTag0.toString();
        boolean boolean13 = endTag0.isEOF();
        org.jsoup.parser.Token token14 = endTag0.reset();
        org.jsoup.parser.Token token15 = token14.reset();
        boolean boolean16 = token15.isCharacter();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        startTag7.appendTagName('4');
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        boolean boolean13 = endTag12.isSelfClosing();
        endTag12.normalName = "";
        endTag12.finaliseTag();
        boolean boolean17 = endTag12.selfClosing;
        endTag12.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = startTag20.nameAttr("EOF", attributes22);
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag20.nameAttr("EOF", attributes25);
        java.lang.String str27 = startTag20.normalName();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag28.nameAttr("EOF", attributes30);
        boolean boolean32 = startTag31.isDoctype();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag31.nameAttr("", attributes34);
        org.jsoup.parser.Token.TokenType tokenType36 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag31.type = tokenType36;
        startTag20.type = tokenType36;
        endTag12.type = tokenType36;
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
        endTag12.attributes = attributes54;
        org.jsoup.parser.Token.StartTag startTag58 = startTag7.nameAttr("EOF", attributes54);
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes62 = null;
        org.jsoup.parser.Token.StartTag startTag63 = startTag60.nameAttr("EOF", attributes62);
        boolean boolean64 = startTag63.isDoctype();
        org.jsoup.parser.Token.Tag tag65 = startTag63.reset();
        startTag63.newAttribute();
        org.jsoup.nodes.Attributes attributes67 = startTag63.attributes;
        org.jsoup.parser.Token.StartTag startTag68 = startTag58.nameAttr("<hi!>", attributes67);
        org.jsoup.parser.Token.Tag tag69 = startTag58.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "eof" + "'", str27, "eof");
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertNotNull(tag69);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        comment0.bogus = false;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        org.jsoup.parser.Token.EndTag endTag39 = tag8.asEndTag();
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
        org.junit.Assert.assertNotNull(endTag39);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        org.jsoup.nodes.Attributes attributes55 = startTag6.getAttributes();
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
        org.junit.Assert.assertNotNull(attributes55);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        comment0.bogus = true;
        java.lang.String str8 = comment0.getData();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        java.lang.String str11 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        doctype0.pubSysKey = " ";
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        doctype0.forceQuirks = false;
        doctype0.pubSysKey = "</ >";
        boolean boolean13 = doctype0.isComment();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        boolean boolean5 = startTag3.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag6 = startTag3.asStartTag();
        startTag3.appendAttributeValue("Character");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        boolean boolean10 = comment0.bogus;
        java.lang.String str11 = comment0.toString();
        boolean boolean12 = comment0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        org.jsoup.parser.Token.TokenType tokenType4 = comment3.type;
        boolean boolean5 = comment3.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        boolean boolean17 = startTag16.isDoctype();
        startTag16.tagName = "<!---->";
        java.lang.String str20 = startTag16.tagName;
        boolean boolean21 = startTag16.isEOF();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        endTag22.appendAttributeValue(' ');
        char[] charArray27 = new char[] { ' ', ' ' };
        endTag22.appendAttributeValue(charArray27);
        endTag22.selfClosing = true;
        org.jsoup.parser.Token.Tag tag32 = endTag22.name("hi!");
        tag32.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag35 = tag32.asEndTag();
        org.jsoup.parser.Token.EndTag endTag36 = new org.jsoup.parser.Token.EndTag();
        endTag36.finaliseTag();
        boolean boolean38 = endTag36.isCharacter();
        int[] intArray40 = new int[] { (short) 1 };
        endTag36.appendAttributeValue(intArray40);
        endTag35.appendAttributeValue(intArray40);
        startTag16.appendAttributeValue(intArray40);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        boolean boolean45 = endTag44.isSelfClosing();
        endTag44.normalName = "";
        endTag44.finaliseTag();
        org.jsoup.nodes.Attributes attributes49 = endTag44.attributes;
        endTag44.appendAttributeValue('#');
        endTag44.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes54 = endTag44.getAttributes();
        java.lang.String str55 = endTag44.name();
        org.jsoup.parser.Token.EndTag endTag56 = new org.jsoup.parser.Token.EndTag();
        endTag56.appendAttributeValue(' ');
        char[] charArray61 = new char[] { ' ', ' ' };
        endTag56.appendAttributeValue(charArray61);
        endTag56.selfClosing = true;
        org.jsoup.parser.Token.Tag tag66 = endTag56.name("hi!");
        endTag56.appendAttributeName('a');
        int[] intArray73 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag56.appendAttributeValue(intArray73);
        endTag44.appendAttributeValue(intArray73);
        startTag16.appendAttributeValue(intArray73);
        startTag7.appendAttributeValue(intArray73);
        boolean boolean78 = startTag7.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(endTag35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(attributes49);
        org.junit.Assert.assertNull(attributes54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        boolean boolean22 = comment0.bogus;
        java.lang.String str23 = comment0.toString();
        boolean boolean24 = comment0.bogus;
        java.lang.String str25 = comment0.tokenType();
        boolean boolean26 = comment0.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Comment" + "'", str25, "Comment");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        java.lang.String str5 = startTag3.toString();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.appendAttributeValue(' ');
        endTag6.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = endTag11.name("hi!");
        endTag11.appendAttributeName('a');
        int[] intArray28 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag11.appendAttributeValue(intArray28);
        endTag6.appendAttributeValue(intArray28);
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.finaliseTag();
        boolean boolean33 = endTag31.isCharacter();
        int[] intArray35 = new int[] { (short) 1 };
        endTag31.appendAttributeValue(intArray35);
        endTag6.appendAttributeValue(intArray35);
        startTag3.appendAttributeValue(intArray35);
        java.lang.String str39 = startTag3.toString();
        boolean boolean40 = startTag3.isSelfClosing();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<EOF>" + "'", str5, "<EOF>");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<EOF>" + "'", str39, "<EOF>");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token token8 = character0.reset();
        org.jsoup.parser.Token.Character character10 = character0.data("</starttag>");
        java.lang.String str11 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</starttag>" + "'", str11, "</starttag>");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.String str10 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.selfClosing;
        org.jsoup.parser.Token.Tag tag9 = startTag7.reset();
        tag9.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("<starttag>");
        org.jsoup.parser.Token.Character character10 = character0.data("StartTag");
        java.lang.String str11 = character10.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.getData();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("hi!");
        boolean boolean10 = character0.isStartTag();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.setEmptyAttributeValue();
        org.jsoup.parser.Token token19 = endTag11.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = endTag11.type;
        character0.type = tokenType20;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        org.jsoup.parser.Token token2 = comment0.reset();
        boolean boolean3 = comment0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        java.lang.String str9 = endTag0.tagName;
        java.lang.String str10 = endTag0.tagName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        tag6.finaliseTag();
        boolean boolean9 = tag6.isStartTag();
        boolean boolean10 = tag6.isCharacter();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getPubSysKey();
        boolean boolean10 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        boolean boolean8 = endTag7.selfClosing;
        boolean boolean9 = endTag7.selfClosing;
        endTag7.setEmptyAttributeValue();
        endTag7.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token token7 = startTag3.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag3.reset();
        tag10.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        comment0.bogus = false;
        boolean boolean8 = comment0.isStartTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        comment0.bogus = true;
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        tag8.finaliseTag();
        java.lang.String str10 = tag8.tokenType();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.jsoup.nodes.Attributes attributes18 = endTag0.getAttributes();
        endTag0.normalName = "<!---->";
        endTag0.appendAttributeName("</</hi!>>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNull(attributes18);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype33 = startTag7.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        endTag46.appendAttributeValue(' ');
        endTag46.newAttribute();
        java.lang.String str50 = endTag46.tagName;
        org.jsoup.parser.Token.EndTag endTag51 = new org.jsoup.parser.Token.EndTag();
        endTag51.finaliseTag();
        endTag51.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = startTag55.nameAttr("EOF", attributes57);
        boolean boolean59 = startTag58.isDoctype();
        org.jsoup.parser.Token.EndTag endTag61 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes64 = null;
        org.jsoup.parser.Token.StartTag startTag65 = startTag62.nameAttr("EOF", attributes64);
        boolean boolean66 = startTag65.isDoctype();
        org.jsoup.parser.Token.Tag tag67 = startTag65.reset();
        startTag65.newAttribute();
        org.jsoup.nodes.Attributes attributes69 = startTag65.attributes;
        endTag61.attributes = attributes69;
        org.jsoup.parser.Token.StartTag startTag71 = startTag58.nameAttr("eof", attributes69);
        endTag51.attributes = attributes69;
        endTag46.attributes = attributes69;
        org.jsoup.parser.Token.StartTag startTag74 = startTag43.nameAttr("", attributes69);
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
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertNotNull(startTag71);
        org.junit.Assert.assertNotNull(startTag74);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        int[] intArray17 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag0.appendAttributeValue(intArray17);
        org.jsoup.parser.Token.Tag tag19 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character20 = tag19.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        boolean boolean10 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isCharacter();
        java.lang.String str8 = doctype0.pubSysKey;
        java.lang.String str9 = doctype0.getName();
        boolean boolean10 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.tagName = "hi!";
        boolean boolean13 = tag10.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.lang.String str70 = startTag3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment71 = startTag3.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "< >" + "'", str70, "< >");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1 });
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.jsoup.parser.Token token35 = startTag30.reset();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        boolean boolean40 = startTag39.isDoctype();
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = startTag39.nameAttr("", attributes42);
        boolean boolean44 = startTag43.isSelfClosing();
        startTag43.appendTagName('#');
        startTag43.selfClosing = false;
        java.lang.String str49 = startTag43.tagName;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = startTag50.nameAttr("EOF", attributes52);
        boolean boolean54 = startTag53.isDoctype();
        org.jsoup.nodes.Attributes attributes56 = null;
        org.jsoup.parser.Token.StartTag startTag57 = startTag53.nameAttr("", attributes56);
        org.jsoup.parser.Token.Tag tag58 = startTag57.reset();
        startTag57.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes61 = startTag57.attributes;
        startTag43.attributes = attributes61;
        startTag30.attributes = attributes61;
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
        org.junit.Assert.assertNotNull(token35);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#" + "'", str49, "#");
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(attributes61);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        boolean boolean2 = endTag0.selfClosing;
        boolean boolean3 = endTag0.selfClosing;
        java.lang.String str4 = endTag0.normalName();
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        boolean boolean24 = comment0.isEOF();
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
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        java.lang.Class<?> wildcardClass55 = attributes48.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag15.nameAttr("EOF", attributes17);
        boolean boolean19 = startTag18.isDoctype();
        org.jsoup.parser.Token.Tag tag20 = startTag18.reset();
        org.jsoup.parser.Token.Tag tag21 = tag20.reset();
        tag21.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag23 = tag21.asStartTag();
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(' ');
        char[] charArray29 = new char[] { ' ', ' ' };
        endTag24.appendAttributeValue(charArray29);
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.appendAttributeValue(' ');
        char[] charArray36 = new char[] { ' ', ' ' };
        endTag31.appendAttributeValue(charArray36);
        endTag24.appendAttributeValue(charArray36);
        tag21.appendAttributeValue(charArray36);
        startTag14.appendAttributeValue(charArray36);
        startTag14.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', ' ' });
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        boolean boolean17 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder18 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag3.type = tokenType8;
        startTag3.appendAttributeName("</StartTag>");
        startTag3.normalName = "<!---->";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        java.lang.String str9 = endTag0.normalName;
        endTag0.appendAttributeName("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype12 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EndTag" + "'", str9, "EndTag");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.toString();
        boolean boolean6 = comment0.isStartTag();
        java.lang.String str7 = comment0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Comment" + "'", str7, "Comment");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        java.lang.String str9 = character8.toString();
        java.lang.String str10 = character8.getData();
        org.jsoup.parser.Token.Character character11 = character8.asCharacter();
        boolean boolean12 = character11.isDoctype();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        boolean boolean19 = endTag0.isSelfClosing();
        java.lang.String str20 = endTag0.normalName();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = token4.tokenType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.tagName = "<!---->";
        java.lang.String str7 = startTag3.tagName;
        startTag3.appendAttributeName('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = startTag3.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        endTag0.attributes = attributes42;
        boolean boolean46 = endTag0.isEOF();
        endTag0.newAttribute();
        endTag0.appendTagName('a');
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
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        org.jsoup.nodes.Attributes attributes14 = tag10.getAttributes();
        tag10.normalName = "";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        java.lang.String str21 = comment0.getData();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        doctype0.forceQuirks = true;
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
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token.TokenType tokenType8 = comment7.type;
        org.jsoup.parser.Token token9 = comment7.reset();
        java.lang.StringBuilder stringBuilder10 = comment7.data;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        java.lang.String str40 = startTag3.toString();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag41.nameAttr("EOF", attributes43);
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.parser.Token.StartTag startTag47 = startTag41.nameAttr("EOF", attributes46);
        java.lang.String str48 = startTag41.normalName();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes51 = null;
        org.jsoup.parser.Token.StartTag startTag52 = startTag49.nameAttr("EOF", attributes51);
        boolean boolean53 = startTag52.isDoctype();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag52.nameAttr("", attributes55);
        org.jsoup.parser.Token.TokenType tokenType57 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag52.type = tokenType57;
        startTag41.type = tokenType57;
        org.jsoup.parser.Token.Tag tag60 = startTag41.reset();
        org.jsoup.nodes.Attributes attributes61 = startTag41.attributes;
        org.jsoup.nodes.Attributes attributes62 = startTag41.getAttributes();
        startTag3.attributes = attributes62;
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<EndTag>" + "'", str40, "<EndTag>");
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "eof" + "'", str48, "eof");
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertTrue("'" + tokenType57 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType57.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(attributes62);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        java.lang.String str74 = startTag6.tokenType();
        boolean boolean75 = startTag6.isCharacter();
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "StartTag" + "'", str74, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.pubSysKey = "</hi!#>";
        boolean boolean6 = doctype0.isStartTag();
        boolean boolean7 = doctype0.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        boolean boolean23 = comment0.isDoctype();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.lang.String str14 = tag9.tokenType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EndTag" + "'", str11, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EndTag" + "'", str14, "EndTag");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        org.jsoup.parser.Token.Tag tag84 = endTag0.reset();
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
        org.junit.Assert.assertNotNull(tag84);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        org.jsoup.nodes.Attributes attributes20 = startTag0.attributes;
        org.jsoup.nodes.Attributes attributes21 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag22 = startTag0.reset();
        startTag0.appendAttributeName("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = startTag0.toString();
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
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token token8 = character0.reset();
        org.jsoup.parser.Token token9 = character0.reset();
        org.jsoup.parser.Token token10 = character0.reset();
        org.jsoup.parser.Token token11 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        java.lang.String str17 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isEOF();
        org.jsoup.parser.Token token10 = doctype0.reset();
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.String str12 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character4 = character2.data("Doctype");
        java.lang.String str5 = character2.getData();
        boolean boolean6 = character2.isEOF();
        java.lang.String str7 = character2.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        tag18.normalName = "<hi!>";
        tag18.appendTagName("</ >");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        tag17.normalName = "StartTag";
        tag17.normalName = "StartTag";
        org.jsoup.parser.Token.EndTag endTag22 = tag17.asEndTag();
        boolean boolean23 = tag17.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(endTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.setEmptyAttributeValue();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("hi!#");
        java.lang.String str7 = character6.getData();
        java.lang.String str8 = character6.toString();
        org.jsoup.parser.Token token9 = character6.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!#" + "'", str7, "hi!#");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!#" + "'", str8, "hi!#");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        tag17.normalName = "StartTag";
        tag17.normalName = "StartTag";
        org.jsoup.parser.Token.EndTag endTag22 = tag17.asEndTag();
        org.jsoup.parser.Token.EndTag endTag23 = tag17.asEndTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(endTag22);
        org.junit.Assert.assertNotNull(endTag23);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        java.lang.String str20 = endTag0.tagName;
        org.jsoup.parser.Token.EndTag endTag21 = endTag0.asEndTag();
        endTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#" + "'", str20, "#");
        org.junit.Assert.assertNotNull(endTag21);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        tag46.selfClosing = false;
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
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.appendAttributeValue("4");
        boolean boolean9 = endTag0.isComment();
        org.jsoup.parser.Token.EndTag endTag10 = endTag0.asEndTag();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = endTag11.name("hi!");
        boolean boolean22 = endTag11.isStartTag();
        endTag11.normalName = "eof";
        org.jsoup.parser.Token.TokenType tokenType25 = endTag11.type;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        org.jsoup.parser.Token.StartTag startTag32 = tag31.asStartTag();
        org.jsoup.parser.Token.EndTag endTag34 = new org.jsoup.parser.Token.EndTag();
        endTag34.finaliseTag();
        endTag34.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes40 = null;
        org.jsoup.parser.Token.StartTag startTag41 = startTag38.nameAttr("EOF", attributes40);
        boolean boolean42 = startTag41.isDoctype();
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes47 = null;
        org.jsoup.parser.Token.StartTag startTag48 = startTag45.nameAttr("EOF", attributes47);
        boolean boolean49 = startTag48.isDoctype();
        org.jsoup.parser.Token.Tag tag50 = startTag48.reset();
        startTag48.newAttribute();
        org.jsoup.nodes.Attributes attributes52 = startTag48.attributes;
        endTag44.attributes = attributes52;
        org.jsoup.parser.Token.StartTag startTag54 = startTag41.nameAttr("eof", attributes52);
        endTag34.attributes = attributes52;
        org.jsoup.parser.Token.StartTag startTag56 = startTag32.nameAttr("<!---->", attributes52);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes60 = null;
        org.jsoup.parser.Token.StartTag startTag61 = startTag58.nameAttr("EOF", attributes60);
        boolean boolean62 = startTag61.isDoctype();
        org.jsoup.parser.Token.EndTag endTag64 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = startTag65.nameAttr("EOF", attributes67);
        boolean boolean69 = startTag68.isDoctype();
        org.jsoup.parser.Token.Tag tag70 = startTag68.reset();
        startTag68.newAttribute();
        org.jsoup.nodes.Attributes attributes72 = startTag68.attributes;
        endTag64.attributes = attributes72;
        org.jsoup.parser.Token.StartTag startTag74 = startTag61.nameAttr("eof", attributes72);
        org.jsoup.parser.Token.StartTag startTag75 = startTag32.nameAttr("hi!", attributes72);
        java.lang.String str76 = startTag75.normalName();
        org.jsoup.parser.Token.TokenType tokenType77 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag75.type = tokenType77;
        endTag11.type = tokenType77;
        endTag10.type = tokenType77;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(endTag10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertNotNull(startTag74);
        org.junit.Assert.assertNotNull(startTag75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType77 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType77.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        startTag6.appendAttributeValue('a');
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        java.lang.String str14 = character8.toString();
        java.lang.String str15 = character8.getData();
        boolean boolean16 = character8.isEndTag();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!</hi!>" + "'", str15, "hi!</hi!>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        boolean boolean2 = doctype0.isEndTag();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "";
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.isEOF();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        java.lang.String str11 = doctype0.pubSysKey;
        java.lang.String str12 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        int[] intArray17 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag0.appendAttributeValue(intArray17);
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes20 = endTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag8 = startTag6.reset();
        startTag6.appendTagName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        boolean boolean5 = character0.isDoctype();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("<EOF >");
        java.lang.String str10 = character9.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<EOF >" + "'", str10, "<EOF >");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        startTag30.normalName = "Character";
        java.lang.String str36 = startTag30.normalName;
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Character" + "'", str36, "Character");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        org.jsoup.parser.Token.TokenType tokenType12 = doctype0.type;
        boolean boolean13 = doctype0.isEOF();
        java.lang.String str14 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag15 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        org.jsoup.parser.Token.Tag tag35 = startTag0.reset();
        java.lang.String str36 = startTag0.normalName;
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
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.newAttribute();
        boolean boolean3 = endTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        org.jsoup.parser.Token.Character character18 = character16.data("hi! ");
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
        org.junit.Assert.assertNotNull(character18);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        java.lang.String str9 = startTag7.tagName;
        boolean boolean10 = startTag7.isEndTag();
        boolean boolean11 = startTag7.isEndTag();
        java.lang.String str12 = startTag7.tokenType();
        startTag7.tagName = "<!---->";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        endTag0.finaliseTag();
        java.lang.String str44 = endTag0.toString();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "</eof>" + "'", str44, "</eof>");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        org.jsoup.parser.Token.Tag tag16 = endTag0.reset();
        boolean boolean17 = tag16.isDoctype();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag18.nameAttr("EOF", attributes20);
        boolean boolean22 = startTag21.isDoctype();
        org.jsoup.parser.Token.Tag tag23 = startTag21.reset();
        java.lang.String str24 = startTag21.normalName;
        org.jsoup.parser.Token token25 = startTag21.reset();
        org.jsoup.parser.Token.TokenType tokenType26 = startTag21.type;
        org.jsoup.parser.Token.Tag tag27 = startTag21.reset();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = startTag29.nameAttr("EOF", attributes31);
        boolean boolean33 = startTag32.isDoctype();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag32.nameAttr("", attributes35);
        org.jsoup.parser.Token.Tag tag37 = startTag36.reset();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        boolean boolean39 = endTag38.isSelfClosing();
        endTag38.normalName = "";
        java.lang.String str42 = endTag38.normalName();
        char[] charArray45 = new char[] { 'a', 'a' };
        endTag38.appendAttributeValue(charArray45);
        startTag36.appendAttributeValue(charArray45);
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        endTag48.appendAttributeValue(' ');
        char[] charArray53 = new char[] { ' ', ' ' };
        endTag48.appendAttributeValue(charArray53);
        org.jsoup.parser.Token.TokenType tokenType55 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag48.type = tokenType55;
        org.jsoup.parser.Token.Tag tag58 = endTag48.name("eof");
        java.lang.String str59 = tag58.name();
        tag58.newAttribute();
        org.jsoup.parser.Token.EndTag endTag61 = new org.jsoup.parser.Token.EndTag();
        boolean boolean62 = endTag61.isSelfClosing();
        endTag61.normalName = "";
        boolean boolean65 = endTag61.isDoctype();
        endTag61.setEmptyAttributeValue();
        org.jsoup.parser.Token.EndTag endTag67 = new org.jsoup.parser.Token.EndTag();
        endTag67.finaliseTag();
        endTag67.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes73 = null;
        org.jsoup.parser.Token.StartTag startTag74 = startTag71.nameAttr("EOF", attributes73);
        boolean boolean75 = startTag74.isDoctype();
        org.jsoup.parser.Token.EndTag endTag77 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag78 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes80 = null;
        org.jsoup.parser.Token.StartTag startTag81 = startTag78.nameAttr("EOF", attributes80);
        boolean boolean82 = startTag81.isDoctype();
        org.jsoup.parser.Token.Tag tag83 = startTag81.reset();
        startTag81.newAttribute();
        org.jsoup.nodes.Attributes attributes85 = startTag81.attributes;
        endTag77.attributes = attributes85;
        org.jsoup.parser.Token.StartTag startTag87 = startTag74.nameAttr("eof", attributes85);
        endTag67.attributes = attributes85;
        endTag61.attributes = attributes85;
        tag58.attributes = attributes85;
        startTag36.attributes = attributes85;
        org.jsoup.parser.Token.StartTag startTag92 = startTag21.nameAttr("4", attributes85);
        tag16.attributes = attributes85;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(token25);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType55 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType55.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "eof" + "'", str59, "eof");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(startTag74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(startTag81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(tag83);
        org.junit.Assert.assertNotNull(attributes85);
        org.junit.Assert.assertNotNull(startTag87);
        org.junit.Assert.assertNotNull(startTag92);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag9 = endTag0.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType10 = endTag0.type;
        endTag0.appendAttributeName('a');
        endTag0.appendAttributeName("eof4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(endTag9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        java.lang.String str18 = endTag0.normalName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        java.lang.String str14 = doctype0.tokenType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        org.jsoup.nodes.Attributes attributes8 = tag5.attributes;
        tag5.appendAttributeValue('4');
        tag5.finaliseTag();
        tag5.appendAttributeName("");
        boolean boolean14 = tag5.isSelfClosing();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag3.appendTagName('4');
        org.jsoup.parser.Token.Tag tag6 = startTag3.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = startTag3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("hi!#");
        java.lang.String str7 = character6.getData();
        org.jsoup.parser.Token.Character character9 = character6.data("<#>");
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
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype38 = tag36.asDoctype();
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
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<starttag>" + "'", str37, "<starttag>");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.Character;
        startTag6.type = tokenType9;
        java.lang.String str11 = startTag6.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        startTag7.appendTagName('4');
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        boolean boolean13 = endTag12.isSelfClosing();
        endTag12.normalName = "";
        endTag12.finaliseTag();
        boolean boolean17 = endTag12.selfClosing;
        endTag12.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = startTag20.nameAttr("EOF", attributes22);
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag20.nameAttr("EOF", attributes25);
        java.lang.String str27 = startTag20.normalName();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag28.nameAttr("EOF", attributes30);
        boolean boolean32 = startTag31.isDoctype();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag31.nameAttr("", attributes34);
        org.jsoup.parser.Token.TokenType tokenType36 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag31.type = tokenType36;
        startTag20.type = tokenType36;
        endTag12.type = tokenType36;
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
        endTag12.attributes = attributes54;
        org.jsoup.parser.Token.StartTag startTag58 = startTag7.nameAttr("EOF", attributes54);
        java.lang.String str59 = startTag58.toString();
        org.jsoup.parser.Token.Tag tag60 = startTag58.reset();
        boolean boolean61 = startTag58.isSelfClosing();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "eof" + "'", str27, "eof");
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "<EOF>" + "'", str59, "<EOF>");
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag7 = tag6.asStartTag();
        org.jsoup.parser.Token.StartTag startTag8 = tag6.asStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        java.lang.StringBuilder stringBuilder13 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        org.jsoup.parser.Token token13 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        int[] intArray10 = new int[] { 1, 10, 10 };
        endTag0.appendAttributeValue(intArray10);
        org.jsoup.parser.Token.Tag tag13 = endTag0.name("StartTag");
        java.lang.String str14 = endTag0.name();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token.Character character8 = character0.data("hi!");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.getData();
        java.lang.StringBuilder stringBuilder12 = comment10.data;
        java.lang.String str13 = comment10.toString();
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag17.nameAttr("EOF", attributes19);
        boolean boolean21 = startTag20.isDoctype();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag20.nameAttr("", attributes23);
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag20.type = tokenType25;
        endTag14.type = tokenType25;
        comment10.type = tokenType25;
        comment10.bogus = true;
        java.lang.StringBuilder stringBuilder31 = comment10.data;
        org.jsoup.parser.Token token32 = comment10.reset();
        org.jsoup.parser.Token.TokenType tokenType33 = token32.type;
        token9.type = tokenType33;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(token32);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        boolean boolean8 = tag5.selfClosing;
        tag5.appendAttributeValue("<starttag>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = tag5.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        boolean boolean16 = doctype0.forceQuirks;
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token token9 = startTag0.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.appendAttributeValue(' ');
        char[] charArray18 = new char[] { ' ', ' ' };
        endTag13.appendAttributeValue(charArray18);
        endTag13.selfClosing = true;
        org.jsoup.parser.Token.Tag tag23 = endTag13.name("hi!");
        boolean boolean24 = endTag13.isStartTag();
        endTag13.selfClosing = true;
        endTag13.appendAttributeName("EOF");
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = startTag29.nameAttr("EOF", attributes31);
        boolean boolean33 = startTag32.isDoctype();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag32.nameAttr("", attributes35);
        org.jsoup.parser.Token.Tag tag37 = startTag36.reset();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        boolean boolean39 = endTag38.isSelfClosing();
        endTag38.normalName = "";
        java.lang.String str42 = endTag38.normalName();
        char[] charArray45 = new char[] { 'a', 'a' };
        endTag38.appendAttributeValue(charArray45);
        startTag36.appendAttributeValue(charArray45);
        endTag13.appendAttributeValue(charArray45);
        tag10.appendAttributeValue(charArray45);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag50 = tag10.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { 'a', 'a' });
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag8 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType11 = startTag8.type;
        java.lang.String str12 = startTag8.toString();
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        boolean boolean14 = tag13.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!>" + "'", str12, "<hi!>");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        endTag0.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(token16);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token token3 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(token3);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("#");
        boolean boolean10 = character0.isComment();
        java.lang.String str11 = character0.getData();
        org.jsoup.parser.Token token12 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#" + "'", str11, "#");
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = startTag25.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        boolean boolean9 = endTag0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token.TokenType tokenType3 = null;
        eOF0.type = tokenType3;
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.jsoup.parser.Token token8 = eOF0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = token8.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getName();
        java.lang.String str11 = doctype0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Doctype" + "'", str11, "Doctype");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token9 = doctype0.reset();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        java.lang.String str9 = startTag3.tagName;
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        doctype10.pubSysKey = "";
        boolean boolean13 = doctype10.isEOF();
        java.lang.String str14 = doctype10.getPubSysKey();
        java.lang.String str15 = doctype10.getPublicIdentifier();
        doctype10.pubSysKey = "eof";
        java.lang.String str18 = doctype10.getPubSysKey();
        java.lang.String str19 = doctype10.getSystemIdentifier();
        doctype10.forceQuirks = false;
        java.lang.String str22 = doctype10.pubSysKey;
        org.jsoup.parser.Token.EOF eOF23 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType24 = eOF23.type;
        doctype10.type = tokenType24;
        startTag3.type = tokenType24;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment27 = startTag3.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "eof" + "'", str18, "eof");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "eof" + "'", str22, "eof");
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isForceQuirks();
        doctype0.pubSysKey = "eof";
        java.lang.String str12 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        boolean boolean13 = doctype0.forceQuirks;
        java.lang.String str14 = doctype0.getName();
        boolean boolean15 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        java.lang.String str12 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        doctype0.pubSysKey = "";
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
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        boolean boolean9 = startTag3.isEOF();
        org.jsoup.nodes.Attributes attributes10 = startTag3.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        startTag6.appendAttributeValue("StartTag");
        startTag6.setEmptyAttributeValue();
        startTag6.newAttribute();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.nameAttr("EOF", attributes16);
        boolean boolean18 = startTag17.isDoctype();
        org.jsoup.parser.Token.Tag tag19 = startTag17.reset();
        org.jsoup.parser.Token.StartTag startTag20 = tag19.asStartTag();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        endTag22.finaliseTag();
        endTag22.appendAttributeName('#');
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
        endTag22.attributes = attributes40;
        org.jsoup.parser.Token.StartTag startTag44 = startTag20.nameAttr("<!---->", attributes40);
        java.lang.String str45 = startTag44.tokenType();
        startTag44.appendAttributeValue("Comment");
        org.jsoup.nodes.Attributes attributes48 = startTag44.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType49 = startTag44.type;
        startTag6.type = tokenType49;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "StartTag" + "'", str45, "StartTag");
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        org.jsoup.parser.Token token4 = doctype0.reset();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue(' ');
        char[] charArray10 = new char[] { ' ', ' ' };
        endTag5.appendAttributeValue(charArray10);
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.appendAttributeValue(' ');
        char[] charArray17 = new char[] { ' ', ' ' };
        endTag12.appendAttributeValue(charArray17);
        endTag5.appendAttributeValue(charArray17);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = startTag20.nameAttr("EOF", attributes22);
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag20.nameAttr("EOF", attributes25);
        startTag26.selfClosing = false;
        java.lang.String str29 = startTag26.tokenType();
        boolean boolean30 = startTag26.selfClosing;
        startTag26.appendAttributeName("");
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("EOF", attributes36);
        boolean boolean38 = startTag37.isDoctype();
        org.jsoup.nodes.Attributes attributes40 = null;
        org.jsoup.parser.Token.StartTag startTag41 = startTag37.nameAttr("", attributes40);
        boolean boolean42 = startTag41.isSelfClosing();
        startTag41.normalName = "";
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
        org.jsoup.parser.Token.StartTag startTag63 = startTag41.nameAttr("<EOF>", attributes60);
        org.jsoup.parser.Token.StartTag startTag64 = startTag26.nameAttr("Doctype", attributes60);
        endTag5.attributes = attributes60;
        org.jsoup.parser.Token.EndTag endTag66 = endTag5.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType67 = endTag5.type;
        doctype0.type = tokenType67;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "StartTag" + "'", str29, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(endTag66);
        org.junit.Assert.assertTrue("'" + tokenType67 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType67.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        org.jsoup.nodes.Attributes attributes13 = endTag0.getAttributes();
        boolean boolean14 = endTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character0.data("<hi!>");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token token10 = character8.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        org.jsoup.parser.Token.Tag tag35 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag36 = startTag0.reset();
        boolean boolean37 = startTag0.isSelfClosing();
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
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        boolean boolean9 = tag7.isCharacter();
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
        startTag13.normalName = "";
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        endTag33.appendAttributeValue(' ');
        char[] charArray38 = new char[] { ' ', ' ' };
        endTag33.appendAttributeValue(charArray38);
        org.jsoup.parser.Token.EndTag endTag40 = endTag33.asEndTag();
        char[] charArray46 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag33.appendAttributeValue(charArray46);
        startTag13.appendAttributeValue(charArray46);
        tag7.appendAttributeValue(charArray46);
        org.jsoup.parser.Token.EndTag endTag50 = new org.jsoup.parser.Token.EndTag();
        endTag50.finaliseTag();
        endTag50.appendAttributeName('#');
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
        endTag50.attributes = attributes68;
        tag7.attributes = attributes68;
        tag7.appendTagName(' ');
        boolean boolean75 = tag7.isStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag40);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '#', '#', ' ', 'a', ' ' });
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(startTag70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token token5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag7.setEmptyAttributeValue();
        org.jsoup.parser.Token token15 = endTag7.reset();
        org.jsoup.parser.Token.TokenType tokenType16 = endTag7.type;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag17.nameAttr("EOF", attributes19);
        boolean boolean21 = startTag20.isDoctype();
        java.lang.String str22 = startTag20.toString();
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        endTag23.appendAttributeValue(' ');
        endTag23.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.appendAttributeValue(' ');
        char[] charArray33 = new char[] { ' ', ' ' };
        endTag28.appendAttributeValue(charArray33);
        endTag28.selfClosing = true;
        org.jsoup.parser.Token.Tag tag38 = endTag28.name("hi!");
        endTag28.appendAttributeName('a');
        int[] intArray45 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag28.appendAttributeValue(intArray45);
        endTag23.appendAttributeValue(intArray45);
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        endTag48.finaliseTag();
        boolean boolean50 = endTag48.isCharacter();
        int[] intArray52 = new int[] { (short) 1 };
        endTag48.appendAttributeValue(intArray52);
        endTag23.appendAttributeValue(intArray52);
        startTag20.appendAttributeValue(intArray52);
        endTag7.appendAttributeValue(intArray52);
        startTag3.appendAttributeValue(intArray52);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<EOF>" + "'", str22, "<EOF>");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 1 });
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("4");
        java.lang.String str10 = tag9.tokenType();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag23 = endTag13.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1 });
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        java.lang.String str14 = doctype0.getName();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        org.jsoup.parser.Token.Tag tag35 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag36 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes37 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes40 = null;
        org.jsoup.parser.Token.StartTag startTag41 = startTag38.nameAttr("EOF", attributes40);
        boolean boolean42 = startTag41.isDoctype();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag41.nameAttr("", attributes44);
        org.jsoup.parser.Token.Tag tag46 = startTag45.reset();
        org.jsoup.parser.Token.EndTag endTag47 = new org.jsoup.parser.Token.EndTag();
        boolean boolean48 = endTag47.isSelfClosing();
        endTag47.normalName = "";
        java.lang.String str51 = endTag47.normalName();
        char[] charArray54 = new char[] { 'a', 'a' };
        endTag47.appendAttributeValue(charArray54);
        startTag45.appendAttributeValue(charArray54);
        startTag0.appendAttributeValue(charArray54);
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
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { 'a', 'a' });
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token.Character character5 = character0.data("</hi!>");
        org.jsoup.parser.Token.Character character7 = character5.data("<!---->4");
        boolean boolean8 = character5.isEndTag();
        org.jsoup.parser.Token token9 = character5.reset();
        org.jsoup.parser.Token.Character character11 = character5.data("<Comment>");
        java.lang.String str12 = character11.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<Comment>" + "'", str12, "<Comment>");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        tag6.appendAttributeValue("</eofa>");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        startTag7.appendAttributeValue(charArray16);
        startTag7.appendAttributeValue("eof4");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { 'a', 'a' });
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        startTag7.newAttribute();
        org.jsoup.parser.Token.Tag tag12 = startTag7.reset();
        tag12.appendTagName("character");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        java.lang.String str12 = comment0.toString();
        boolean boolean13 = comment0.isEndTag();
        boolean boolean14 = comment0.isEOF();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        startTag11.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName(' ');
        endTag0.appendAttributeName('a');
        boolean boolean6 = endTag0.selfClosing;
        endTag0.appendTagName('4');
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        endTag0.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype12 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        startTag0.appendTagName("Comment");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = tag10.name("<<!---->>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        tag10.tagName = "EOF";
        boolean boolean16 = tag10.isDoctype();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype4.getName();
        java.lang.StringBuilder stringBuilder6 = doctype4.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        boolean boolean18 = endTag0.isComment();
        endTag0.tagName = "</hi!>";
        boolean boolean21 = endTag0.isEndTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        org.jsoup.nodes.Attributes attributes9 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag10 = endTag0.reset();
        endTag0.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag3.type = tokenType8;
        org.jsoup.nodes.Attributes attributes10 = startTag3.getAttributes();
        boolean boolean11 = startTag3.isStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        endTag0.appendTagName('#');
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("</hi!>");
        java.lang.String str7 = character0.toString();
        org.jsoup.parser.Token.Character character9 = character0.data("#");
        java.lang.String str10 = character0.getData();
        boolean boolean11 = character0.isComment();
        org.jsoup.parser.Token.Character character13 = character0.data("</ >");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(character13);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        endTag0.appendTagName('#');
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
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.toString();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        comment0.bogus = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("eof");
        java.lang.String str11 = tag10.name();
        tag10.newAttribute();
        boolean boolean13 = tag10.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data(" ");
        org.jsoup.parser.Token.Character character8 = character0.data("hi!#");
        org.jsoup.parser.Token.Character character10 = character8.data("Comment");
        java.lang.Class<?> wildcardClass11 = character8.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        boolean boolean13 = comment0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        startTag7.appendAttributeValue("</StartTag>");
        org.jsoup.parser.Token.Tag tag47 = startTag7.name("Doctype");
        java.lang.String str48 = tag47.tagName;
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
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Doctype" + "'", str48, "Doctype");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        startTag0.appendTagName("Doctype");
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
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        org.jsoup.parser.Token.reset(stringBuilder16);
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
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        tag5.selfClosing = true;
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        boolean boolean16 = endTag15.isSelfClosing();
        endTag15.normalName = "";
        java.lang.String str19 = endTag15.normalName();
        char[] charArray22 = new char[] { 'a', 'a' };
        endTag15.appendAttributeValue(charArray22);
        tag5.appendAttributeValue(charArray22);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a', 'a' });
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        boolean boolean9 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        java.lang.String str11 = doctype0.tokenType();
        boolean boolean12 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Doctype" + "'", str11, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = character8.asDoctype();
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
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!</hi!>" + "'", str14, "hi!</hi!>");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token.TokenType tokenType3 = null;
        eOF0.type = tokenType3;
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        java.lang.String str8 = eOF0.tokenType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        endTag0.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes22 = endTag0.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(attributes22);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        tag6.normalName = "hi!";
        tag6.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = tag6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        comment0.bogus = false;
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.String str7 = comment0.toString();
        java.lang.String str8 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        java.lang.String str17 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        java.lang.String str15 = endTag13.tokenType();
        java.lang.String str16 = endTag13.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EndTag" + "'", str15, "EndTag");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "</hi!>" + "'", str16, "</hi!>");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        boolean boolean10 = tag9.isComment();
        tag9.newAttribute();
        org.jsoup.parser.Token token12 = tag9.reset();
        tag9.setEmptyAttributeValue();
        java.lang.String str14 = tag9.normalName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        org.jsoup.parser.Token token13 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = token13.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        org.jsoup.nodes.Attributes attributes14 = tag10.attributes;
        java.lang.String str15 = tag10.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag16 = tag10.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        boolean boolean15 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isComment();
        java.lang.String str6 = doctype0.getName();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        boolean boolean43 = tag42.isEOF();
        java.lang.String str44 = tag42.normalName;
        tag42.selfClosing = false;
        tag42.selfClosing = false;
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        boolean boolean13 = comment0.bogus;
        org.jsoup.parser.Token token14 = comment0.reset();
        java.lang.String str15 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getName();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes9 = startTag0.getAttributes();
        java.lang.String str10 = startTag0.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        org.jsoup.parser.Token.reset(stringBuilder11);
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
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        org.jsoup.parser.Token token18 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag19 = token18.asStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertNotNull(startTag19);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType6 = comment0.type;
        org.jsoup.parser.Token token7 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.newAttribute();
        boolean boolean6 = endTag0.isCharacter();
        boolean boolean7 = endTag0.isSelfClosing();
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        endTag0.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes10 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag12 = endTag0.name("character");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        boolean boolean11 = tag5.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = tag5.type;
        tag5.normalName = "eof";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        endTag0.setEmptyAttributeValue();
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
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.normalName = "";
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
        org.jsoup.parser.Token.StartTag startTag29 = startTag7.nameAttr("<EOF>", attributes26);
        boolean boolean30 = startTag29.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        boolean boolean10 = tag9.isStartTag();
        tag9.tagName = "<EndTag>";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        java.lang.String str25 = endTag13.name();
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
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        boolean boolean14 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        boolean boolean17 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        org.jsoup.parser.Token token9 = startTag7.reset();
        startTag7.appendAttributeName("EOF ");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("eof");
        java.lang.String str11 = tag10.name();
        java.lang.String str12 = tag10.tagName;
        tag10.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        org.jsoup.parser.Token.Tag tag32 = startTag0.reset();
        tag32.newAttribute();
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
        org.junit.Assert.assertNotNull(tag32);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        boolean boolean9 = endTag0.isDoctype();
        endTag0.finaliseTag();
        endTag0.appendAttributeName("EndTag");
        boolean boolean13 = endTag0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("eof");
        java.lang.String str11 = tag10.name();
        java.lang.String str12 = tag10.tagName;
        tag10.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        org.jsoup.parser.Token.StartTag startTag13 = tag10.asStartTag();
        startTag13.newAttribute();
        org.jsoup.nodes.Attributes attributes15 = startTag13.getAttributes();
        org.jsoup.parser.Token.StartTag startTag16 = startTag0.nameAttr("<a>", attributes15);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag16);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.getData();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("hi!");
        boolean boolean10 = character0.isStartTag();
        org.jsoup.parser.Token.Character character11 = character0.asCharacter();
        org.jsoup.parser.Token token12 = character11.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        boolean boolean36 = startTag30.isEOF();
        startTag30.finaliseTag();
        startTag30.selfClosing = false;
        boolean boolean40 = startTag30.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag6.toString();
        org.jsoup.parser.Token.Tag tag8 = startTag6.reset();
        tag8.appendTagName("</starttag>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<EOF>" + "'", str7, "<EOF>");
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token token7 = eOF0.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = eOF0.type;
        org.jsoup.parser.Token token9 = eOF0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        boolean boolean9 = startTag3.isDoctype();
        startTag3.appendTagName('4');
        boolean boolean12 = startTag3.isEndTag();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.appendAttributeValue(' ');
        char[] charArray18 = new char[] { ' ', ' ' };
        endTag13.appendAttributeValue(charArray18);
        endTag13.selfClosing = true;
        org.jsoup.parser.Token.Tag tag23 = endTag13.name("hi!");
        endTag13.appendAttributeName('a');
        endTag13.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.appendAttributeValue(' ');
        endTag28.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        endTag33.appendAttributeValue(' ');
        char[] charArray38 = new char[] { ' ', ' ' };
        endTag33.appendAttributeValue(charArray38);
        endTag33.selfClosing = true;
        org.jsoup.parser.Token.Tag tag43 = endTag33.name("hi!");
        endTag33.appendAttributeName('a');
        int[] intArray50 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag33.appendAttributeValue(intArray50);
        endTag28.appendAttributeValue(intArray50);
        endTag13.appendAttributeValue(intArray50);
        startTag3.appendAttributeValue(intArray50);
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        startTag56.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes59 = startTag56.attributes;
        org.jsoup.parser.Token.StartTag startTag60 = startTag3.nameAttr("Doctype", attributes59);
        startTag60.appendAttributeName('a');
        startTag60.appendAttributeName("");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(startTag60);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        boolean boolean5 = character0.isDoctype();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token token7 = character0.reset();
        java.lang.String str8 = character0.toString();
        org.jsoup.parser.Token.Character character10 = character0.data("starttag");
        org.jsoup.parser.Token.Character character12 = character0.data("</starttag>");
        java.lang.String str13 = character12.toString();
        java.lang.String str14 = character12.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</starttag>" + "'", str13, "</starttag>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</starttag>" + "'", str14, "</starttag>");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        boolean boolean12 = doctype0.isCharacter();
        java.lang.String str13 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        org.jsoup.parser.Token token28 = endTag0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eof" + "'", str15, "eof");
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token28);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        boolean boolean9 = endTag0.isDoctype();
        boolean boolean10 = endTag0.isComment();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        org.jsoup.parser.Token token2 = comment0.reset();
        comment0.bogus = true;
        boolean boolean5 = comment0.bogus;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
            java.lang.String str34 = startTag6.toString();
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
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        java.lang.String str12 = endTag0.toString();
        boolean boolean13 = endTag0.isEOF();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag0.type;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        boolean boolean11 = doctype0.isComment();
        java.lang.String str12 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag3.appendTagName('4');
        org.jsoup.parser.Token.Tag tag6 = startTag3.reset();
        startTag3.appendAttributeName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        startTag24.appendTagName("starttag");
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
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.toString();
        java.lang.String str7 = character0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = character0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        boolean boolean11 = doctype0.forceQuirks;
        org.jsoup.parser.Token token12 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        tag18.normalName = "<hi!>";
        org.jsoup.parser.Token.Tag tag21 = tag18.reset();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token token8 = endTag0.reset();
        boolean boolean9 = endTag0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        boolean boolean72 = endTag0.isSelfClosing();
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        java.lang.String str8 = tag6.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        boolean boolean14 = startTag11.isDoctype();
        startTag11.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        boolean boolean10 = doctype0.isForceQuirks();
        boolean boolean11 = doctype0.isEOF();
        java.lang.String str12 = doctype0.tokenType();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        java.lang.String str7 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isCharacter();
        org.jsoup.parser.Token token10 = doctype0.reset();
        java.lang.String str11 = doctype0.pubSysKey;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        boolean boolean11 = doctype0.forceQuirks;
        boolean boolean12 = doctype0.isEndTag();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        boolean boolean2 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.Class<?> wildcardClass7 = doctype0.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.Class<?> wildcardClass7 = token6.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isComment();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.toString();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = attributes5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        doctype0.pubSysKey = "eof";
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag9.nameAttr("EOF", attributes11);
        boolean boolean13 = startTag12.isDoctype();
        org.jsoup.parser.Token.Tag tag14 = startTag12.reset();
        org.jsoup.parser.Token.StartTag startTag15 = tag14.asStartTag();
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag();
        endTag17.finaliseTag();
        endTag17.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag21.nameAttr("EOF", attributes23);
        boolean boolean25 = startTag24.isDoctype();
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag28.nameAttr("EOF", attributes30);
        boolean boolean32 = startTag31.isDoctype();
        org.jsoup.parser.Token.Tag tag33 = startTag31.reset();
        startTag31.newAttribute();
        org.jsoup.nodes.Attributes attributes35 = startTag31.attributes;
        endTag27.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag37 = startTag24.nameAttr("eof", attributes35);
        endTag17.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag39 = startTag15.nameAttr("<!---->", attributes35);
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag41.nameAttr("EOF", attributes43);
        boolean boolean45 = startTag44.isDoctype();
        org.jsoup.parser.Token.EndTag endTag47 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = startTag48.nameAttr("EOF", attributes50);
        boolean boolean52 = startTag51.isDoctype();
        org.jsoup.parser.Token.Tag tag53 = startTag51.reset();
        startTag51.newAttribute();
        org.jsoup.nodes.Attributes attributes55 = startTag51.attributes;
        endTag47.attributes = attributes55;
        org.jsoup.parser.Token.StartTag startTag57 = startTag44.nameAttr("eof", attributes55);
        org.jsoup.parser.Token.StartTag startTag58 = startTag15.nameAttr("hi!", attributes55);
        org.jsoup.parser.Token.Doctype doctype59 = new org.jsoup.parser.Token.Doctype();
        doctype59.pubSysKey = "";
        java.lang.StringBuilder stringBuilder62 = doctype59.name;
        java.lang.String str63 = doctype59.getName();
        java.lang.StringBuilder stringBuilder64 = doctype59.systemIdentifier;
        java.lang.StringBuilder stringBuilder65 = doctype59.publicIdentifier;
        java.lang.StringBuilder stringBuilder66 = doctype59.publicIdentifier;
        org.jsoup.parser.Token token67 = doctype59.reset();
        doctype59.forceQuirks = false;
        java.lang.String str70 = doctype59.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType71 = doctype59.type;
        startTag58.type = tokenType71;
        doctype0.type = tokenType71;
        java.lang.String str74 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(stringBuilder62);
        org.junit.Assert.assertEquals(stringBuilder62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertEquals(stringBuilder66.toString(), "");
        org.junit.Assert.assertNotNull(token67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + tokenType71 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType71.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "eof" + "'", str74, "eof");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("hi!#");
        java.lang.String str7 = character6.getData();
        org.jsoup.parser.Token.Character character9 = character6.data("hi!#");
        org.jsoup.parser.Token token10 = character6.reset();
        java.lang.String str11 = character6.getData();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag17.nameAttr("EOF", attributes19);
        boolean boolean21 = startTag20.isDoctype();
        org.jsoup.parser.Token.Tag tag22 = startTag20.reset();
        org.jsoup.parser.Token.StartTag startTag23 = tag22.asStartTag();
        org.jsoup.parser.Token.Tag tag24 = tag22.reset();
        org.jsoup.nodes.Attributes attributes25 = tag22.attributes;
        org.jsoup.parser.Token.StartTag startTag26 = startTag15.nameAttr("starttag", attributes25);
        org.jsoup.parser.Token.TokenType tokenType27 = startTag26.type;
        character6.type = tokenType27;
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!#" + "'", str7, "hi!#");
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.newAttribute();
        org.jsoup.parser.Token.EndTag endTag6 = endTag0.asEndTag();
        endTag6.appendAttributeName("<starttag>");
        boolean boolean9 = endTag6.isSelfClosing();
        endTag6.normalName = "eof4";
        endTag6.appendAttributeName('4');
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertNotNull(endTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        java.lang.String str10 = startTag6.normalName();
        startTag6.finaliseTag();
        java.lang.String str12 = startTag6.toString();
        startTag6.selfClosing = true;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "eof" + "'", str10, "eof");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<EOF>" + "'", str12, "<EOF>");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        boolean boolean13 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token14 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        startTag3.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = startTag3.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
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
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        java.lang.String str12 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        java.lang.String str12 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag8.nameAttr("EOF", attributes10);
        boolean boolean12 = startTag11.isDoctype();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag11.nameAttr("", attributes14);
        boolean boolean16 = startTag15.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag18.nameAttr("EOF", attributes20);
        boolean boolean22 = startTag21.isDoctype();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag21.nameAttr("", attributes24);
        boolean boolean26 = startTag25.isSelfClosing();
        java.lang.String str27 = startTag25.tagName;
        boolean boolean28 = startTag25.isEndTag();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = startTag30.nameAttr("EOF", attributes32);
        boolean boolean34 = startTag33.isDoctype();
        org.jsoup.parser.Token.Tag tag35 = startTag33.reset();
        org.jsoup.parser.Token.StartTag startTag36 = tag35.asStartTag();
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
        org.jsoup.parser.Token.StartTag startTag60 = startTag36.nameAttr("<!---->", attributes56);
        org.jsoup.parser.Token.StartTag startTag61 = startTag25.nameAttr("starttag", attributes56);
        org.jsoup.parser.Token.StartTag startTag62 = startTag15.nameAttr("EOF", attributes56);
        org.jsoup.nodes.Attributes attributes63 = startTag15.getAttributes();
        endTag0.attributes = attributes63;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment65 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertNotNull(attributes63);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendTagName("EndTag");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("EndTag");
        endTag0.appendTagName("EOF");
        endTag0.normalName = "</StartTag>";
        java.lang.String str13 = endTag0.normalName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</StartTag>" + "'", str13, "</StartTag>");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        boolean boolean3 = comment0.bogus;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.getData();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.bogus;
        java.lang.Class<?> wildcardClass8 = comment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        org.jsoup.parser.Token.Tag tag36 = endTag0.reset();
        endTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tag36);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token token6 = doctype0.reset();
        boolean boolean7 = token6.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        boolean boolean16 = startTag15.isEndTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.reset();
        boolean boolean18 = tag17.isCharacter();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token token14 = endTag0.reset();
        endTag0.selfClosing = true;
        java.lang.String str17 = endTag0.normalName();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        java.lang.String str9 = startTag3.tagName;
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        doctype10.pubSysKey = "";
        boolean boolean13 = doctype10.isEOF();
        java.lang.String str14 = doctype10.getPubSysKey();
        java.lang.String str15 = doctype10.getPublicIdentifier();
        doctype10.pubSysKey = "eof";
        java.lang.String str18 = doctype10.getPubSysKey();
        java.lang.String str19 = doctype10.getSystemIdentifier();
        doctype10.forceQuirks = false;
        java.lang.String str22 = doctype10.pubSysKey;
        org.jsoup.parser.Token.EOF eOF23 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType24 = eOF23.type;
        doctype10.type = tokenType24;
        startTag3.type = tokenType24;
        boolean boolean27 = startTag3.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = startTag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "eof" + "'", str18, "eof");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "eof" + "'", str22, "eof");
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.toString();
        java.lang.String str9 = comment0.getData();
        boolean boolean10 = comment0.bogus;
        java.lang.StringBuilder stringBuilder11 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token.Character character5 = character0.data("</hi!>");
        org.jsoup.parser.Token.Character character7 = character5.data("<!---->4");
        boolean boolean8 = character5.isEndTag();
        boolean boolean9 = character5.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        java.lang.String str4 = endTag0.tagName;
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.finaliseTag();
        endTag5.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag9.nameAttr("EOF", attributes11);
        boolean boolean13 = startTag12.isDoctype();
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        boolean boolean20 = startTag19.isDoctype();
        org.jsoup.parser.Token.Tag tag21 = startTag19.reset();
        startTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes23 = startTag19.attributes;
        endTag15.attributes = attributes23;
        org.jsoup.parser.Token.StartTag startTag25 = startTag12.nameAttr("eof", attributes23);
        endTag5.attributes = attributes23;
        endTag0.attributes = attributes23;
        boolean boolean28 = endTag0.isEOF();
        boolean boolean29 = endTag0.isSelfClosing();
        endTag0.appendTagName('a');
        org.jsoup.nodes.Attributes attributes32 = endTag0.attributes;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        boolean boolean6 = endTag0.isEOF();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        org.jsoup.parser.Token token2 = comment0.reset();
        comment0.bogus = true;
        comment0.bogus = false;
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        endTag0.normalName = "Character";
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        boolean boolean3 = character2.isDoctype();
        java.lang.String str4 = character2.getData();
        org.jsoup.parser.Token.Character character6 = character2.data("");
        java.lang.String str7 = character6.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        java.lang.String str8 = comment0.getData();
        comment0.bogus = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        endTag0.appendTagName(' ');
        boolean boolean15 = endTag0.isDoctype();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        org.jsoup.parser.Token.Tag tag16 = endTag13.name("EndTag");
        java.lang.String str17 = tag16.normalName();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "endtag" + "'", str17, "endtag");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName("Doctype");
        startTag0.appendAttributeValue("<EOF>");
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendTagName('a');
        java.lang.String str8 = startTag0.name();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.String str10 = doctype0.tokenType();
        boolean boolean11 = doctype0.isCharacter();
        java.lang.String str12 = doctype0.getPublicIdentifier();
        boolean boolean13 = doctype0.isStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        comment0.bogus = false;
        boolean boolean10 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        boolean boolean3 = character2.isDoctype();
        java.lang.String str4 = character2.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        boolean boolean4 = tag3.isSelfClosing();
        tag3.setEmptyAttributeValue();
        boolean boolean6 = tag3.isEOF();
        boolean boolean7 = tag3.isComment();
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.finaliseTag();
        endTag14.setEmptyAttributeValue();
        endTag14.finaliseTag();
        endTag14.tagName = "</hi!#>";
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(' ');
        char[] charArray25 = new char[] { ' ', ' ' };
        endTag20.appendAttributeValue(charArray25);
        endTag20.selfClosing = true;
        org.jsoup.parser.Token.Tag tag30 = endTag20.name("hi!");
        endTag20.appendAttributeName('a');
        int[] intArray37 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag20.appendAttributeValue(intArray37);
        org.jsoup.parser.Token.EndTag endTag39 = new org.jsoup.parser.Token.EndTag();
        endTag39.finaliseTag();
        boolean boolean41 = endTag39.isCharacter();
        int[] intArray43 = new int[] { (short) 1 };
        endTag39.appendAttributeValue(intArray43);
        endTag20.appendAttributeValue(intArray43);
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        endTag46.appendAttributeValue(' ');
        char[] charArray51 = new char[] { ' ', ' ' };
        endTag46.appendAttributeValue(charArray51);
        endTag46.selfClosing = true;
        org.jsoup.parser.Token.Tag tag56 = endTag46.name("hi!");
        endTag46.appendAttributeName('a');
        int[] intArray63 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag46.appendAttributeValue(intArray63);
        org.jsoup.parser.Token.EndTag endTag65 = new org.jsoup.parser.Token.EndTag();
        endTag65.finaliseTag();
        boolean boolean67 = endTag65.isCharacter();
        int[] intArray69 = new int[] { (short) 1 };
        endTag65.appendAttributeValue(intArray69);
        endTag46.appendAttributeValue(intArray69);
        endTag20.appendAttributeValue(intArray69);
        endTag14.appendAttributeValue(intArray69);
        tag8.appendAttributeValue(intArray69);
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes77 = null;
        org.jsoup.parser.Token.StartTag startTag78 = startTag75.nameAttr("EOF", attributes77);
        boolean boolean79 = startTag78.isDoctype();
        org.jsoup.nodes.Attributes attributes81 = null;
        org.jsoup.parser.Token.StartTag startTag82 = startTag78.nameAttr("", attributes81);
        boolean boolean83 = startTag82.selfClosing;
        org.jsoup.parser.Token.Tag tag84 = startTag82.reset();
        org.jsoup.nodes.Attributes attributes85 = tag84.attributes;
        tag8.attributes = attributes85;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1 });
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 1 });
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(startTag82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertNotNull(attributes85);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        boolean boolean14 = tag10.isDoctype();
        tag10.appendAttributeName('a');
        tag10.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag0.newAttribute();
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        boolean boolean18 = endTag0.isComment();
        boolean boolean19 = endTag0.isComment();
        endTag0.newAttribute();
        java.lang.String str21 = endTag0.normalName;
        org.jsoup.parser.Token.Tag tag23 = endTag0.name("<StartTag>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        java.lang.String str14 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
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
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.tokenType();
        boolean boolean7 = doctype0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
        startTag0.appendAttributeName('#');
        boolean boolean24 = startTag0.isSelfClosing();
        java.lang.String str25 = startTag0.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        org.jsoup.nodes.Attributes attributes16 = tag14.getAttributes();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character6.data("<EndTag>");
        org.jsoup.parser.Token.Character character10 = character6.data("</</eofa>>");
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        boolean boolean18 = endTag0.isStartTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        boolean boolean10 = comment0.bogus;
        comment0.bogus = false;
        boolean boolean13 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character10 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character12 = character10.data("EndTag");
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
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        org.jsoup.parser.Token.EndTag endTag13 = endTag0.asEndTag();
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(endTag13);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        endTag0.appendAttributeName(' ');
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        org.jsoup.nodes.Attributes attributes19 = tag18.getAttributes();
        tag18.newAttribute();
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
        endTag21.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.parser.Token.StartTag startTag47 = startTag44.nameAttr("EOF", attributes46);
        boolean boolean48 = startTag47.isDoctype();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = startTag47.nameAttr("", attributes50);
        org.jsoup.parser.Token.Tag tag52 = startTag51.reset();
        org.jsoup.parser.Token.EndTag endTag53 = new org.jsoup.parser.Token.EndTag();
        boolean boolean54 = endTag53.isSelfClosing();
        endTag53.normalName = "";
        java.lang.String str57 = endTag53.normalName();
        char[] charArray60 = new char[] { 'a', 'a' };
        endTag53.appendAttributeValue(charArray60);
        tag52.appendAttributeValue(charArray60);
        endTag21.appendAttributeValue(charArray60);
        tag18.appendAttributeValue(charArray60);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(attributes19);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { 'a', 'a' });
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.tokenType();
        java.lang.String str7 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        boolean boolean11 = comment0.isStartTag();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        boolean boolean9 = tag7.isCharacter();
        org.jsoup.parser.Token.Tag tag10 = tag7.reset();
        boolean boolean11 = tag10.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        org.jsoup.parser.Token.EndTag endTag13 = endTag0.asEndTag();
        java.lang.String str14 = endTag0.tokenType();
        java.lang.String str15 = endTag0.tagName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EndTag" + "'", str14, "EndTag");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("hi!EndTag");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        org.jsoup.parser.Token token11 = doctype0.reset();
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
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        boolean boolean9 = endTag0.isDoctype();
        endTag0.finaliseTag();
        endTag0.appendAttributeName("EndTag");
        java.lang.String str13 = endTag0.normalName();
        org.jsoup.parser.Token.EndTag endTag14 = endTag0.asEndTag();
        endTag0.normalName = "<EOF>";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(endTag14);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.isEndTag();
        java.lang.String str6 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        boolean boolean20 = endTag0.isSelfClosing();
        endTag0.tagName = "</StartTag>";
        org.jsoup.nodes.Attributes attributes23 = endTag0.getAttributes();
        endTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(attributes23);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.String str6 = comment0.getData();
        java.lang.String str7 = comment0.getData();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        java.lang.Class<?> wildcardClass13 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.appendAttributeName(' ');
        tag10.setEmptyAttributeValue();
        tag10.appendTagName('#');
        tag10.appendTagName("<EOF >");
        tag10.normalName = "EndTag";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        org.jsoup.parser.Token.Tag tag17 = tag13.reset();
        org.jsoup.parser.Token token18 = tag13.reset();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(token18);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        java.lang.String str64 = startTag49.name();
        startTag49.appendAttributeName('4');
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        boolean boolean4 = character0.isEndTag();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.toString();
        boolean boolean7 = character0.isEndTag();
        java.lang.String str8 = character0.tokenType();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Character" + "'", str8, "Character");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        org.jsoup.parser.Token token8 = endTag0.reset();
        boolean boolean9 = endTag0.isEndTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        boolean boolean40 = startTag3.isEOF();
        startTag3.appendAttributeValue("hi!#");
        java.lang.String str43 = startTag3.normalName;
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        boolean boolean10 = comment0.bogus;
        java.lang.String str11 = comment0.toString();
        java.lang.String str12 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        boolean boolean20 = tag10.isComment();
        tag10.selfClosing = false;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!</hi!>" + "'", str19, "hi!</hi!>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        java.lang.String str15 = tag14.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        boolean boolean10 = startTag6.selfClosing;
        startTag6.appendAttributeName("");
        org.jsoup.parser.Token.Tag tag14 = startTag6.name("</ >");
        startTag6.tagName = "hi!EndTag";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        java.lang.String str11 = doctype6.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.Class<?> wildcardClass7 = doctype0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("</ >");
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token token6 = character0.reset();
        boolean boolean7 = character0.isEndTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</ >" + "'", str5, "</ >");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag9 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag11 = endTag9.name("starttag");
        endTag9.appendAttributeName("");
        boolean boolean14 = endTag9.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag15 = endTag9.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(endTag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        java.lang.String str13 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder14 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        java.lang.String str7 = comment6.toString();
        java.lang.StringBuilder stringBuilder8 = comment6.data;
        org.jsoup.parser.Token token9 = comment6.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        java.lang.Class<?> wildcardClass77 = endTag0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        startTag3.setEmptyAttributeValue();
        startTag3.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype28 = startTag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        java.lang.String str5 = startTag3.toString();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.appendAttributeValue(' ');
        endTag6.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = endTag11.name("hi!");
        endTag11.appendAttributeName('a');
        int[] intArray28 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag11.appendAttributeValue(intArray28);
        endTag6.appendAttributeValue(intArray28);
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.finaliseTag();
        boolean boolean33 = endTag31.isCharacter();
        int[] intArray35 = new int[] { (short) 1 };
        endTag31.appendAttributeValue(intArray35);
        endTag6.appendAttributeValue(intArray35);
        startTag3.appendAttributeValue(intArray35);
        java.lang.String str39 = startTag3.toString();
        org.jsoup.parser.Token.EndTag endTag40 = new org.jsoup.parser.Token.EndTag();
        endTag40.appendAttributeValue(' ');
        char[] charArray45 = new char[] { ' ', ' ' };
        endTag40.appendAttributeValue(charArray45);
        endTag40.selfClosing = true;
        org.jsoup.parser.Token.Tag tag50 = endTag40.name("hi!");
        boolean boolean51 = tag50.isEndTag();
        org.jsoup.parser.Token token52 = tag50.reset();
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag53.nameAttr("EOF", attributes55);
        boolean boolean57 = startTag56.isDoctype();
        org.jsoup.nodes.Attributes attributes59 = null;
        org.jsoup.parser.Token.StartTag startTag60 = startTag56.nameAttr("", attributes59);
        org.jsoup.parser.Token.Tag tag61 = startTag60.reset();
        org.jsoup.parser.Token.EndTag endTag62 = new org.jsoup.parser.Token.EndTag();
        boolean boolean63 = endTag62.isSelfClosing();
        endTag62.normalName = "";
        java.lang.String str66 = endTag62.normalName();
        char[] charArray69 = new char[] { 'a', 'a' };
        endTag62.appendAttributeValue(charArray69);
        tag61.appendAttributeValue(charArray69);
        tag50.appendAttributeValue(charArray69);
        startTag3.appendAttributeValue(charArray69);
        org.jsoup.parser.Token.Tag tag75 = startTag3.name("");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<EOF>" + "'", str5, "<EOF>");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<EOF>" + "'", str39, "<EOF>");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(token52);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(tag75);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        endTag0.newAttribute();
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        boolean boolean7 = tag5.isSelfClosing();
        org.jsoup.parser.Token token8 = tag5.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        startTag7.appendAttributeValue(charArray16);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        org.jsoup.parser.Token.TokenType tokenType26 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag19.type = tokenType26;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("eof");
        java.lang.String str30 = tag29.name();
        tag29.newAttribute();
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        boolean boolean33 = endTag32.isSelfClosing();
        endTag32.normalName = "";
        boolean boolean36 = endTag32.isDoctype();
        endTag32.setEmptyAttributeValue();
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
        endTag32.attributes = attributes56;
        tag29.attributes = attributes56;
        startTag7.attributes = attributes56;
        org.jsoup.parser.Token.Tag tag63 = startTag7.reset();
        startTag7.appendTagName("starttag");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "eof" + "'", str30, "eof");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertNotNull(tag63);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
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
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag5 = endTag0.name("<!---->4");
        endTag0.newAttribute();
        java.lang.String str7 = endTag0.toString();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->4>" + "'", str7, "</<!---->4>");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        startTag7.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        java.lang.String str17 = tag10.normalName();
        org.jsoup.nodes.Attributes attributes18 = tag10.getAttributes();
        java.lang.String str19 = tag10.name();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "</hi!>" + "'", str17, "</hi!>");
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token token8 = character0.reset();
        org.jsoup.parser.Token.Character character10 = character0.data("");
        org.jsoup.parser.Token token11 = character10.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        java.lang.String str13 = doctype0.getSystemIdentifier();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        boolean boolean14 = startTag7.selfClosing;
        org.jsoup.parser.Token.Tag tag15 = startTag7.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        boolean boolean27 = endTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        boolean boolean13 = doctype0.forceQuirks;
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        org.jsoup.nodes.Attributes attributes31 = endTag0.attributes;
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(attributes31);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        org.jsoup.parser.Token.Tag tag36 = startTag30.reset();
        startTag30.appendAttributeName("<<starttag>>");
        startTag30.newAttribute();
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
        org.junit.Assert.assertNotNull(tag36);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.nodes.Attributes attributes7 = startTag6.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        java.lang.String str13 = doctype0.pubSysKey;
        boolean boolean14 = doctype0.isForceQuirks();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eof" + "'", str13, "eof");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.toString();
        endTag0.appendAttributeName("<EndTag>");
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</</hi!>>" + "'", str6, "</</hi!>>");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        tag9.tagName = "</<!---->4>";
        tag9.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.TokenType tokenType6 = endTag0.type;
        endTag0.tagName = "Doctype";
        java.lang.String str9 = endTag0.normalName;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.bogus;
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        tag14.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        boolean boolean10 = startTag0.isComment();
        startTag0.appendTagName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        boolean boolean11 = endTag10.isSelfClosing();
        endTag10.normalName = "";
        boolean boolean14 = endTag10.selfClosing;
        org.jsoup.parser.Token.Tag tag16 = endTag10.name("eof");
        org.jsoup.parser.Token.Tag tag18 = endTag10.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag19.selfClosing = true;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("hi!");
        endTag19.appendAttributeName('a');
        int[] intArray36 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag19.appendAttributeValue(intArray36);
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.finaliseTag();
        boolean boolean40 = endTag38.isCharacter();
        int[] intArray42 = new int[] { (short) 1 };
        endTag38.appendAttributeValue(intArray42);
        endTag19.appendAttributeValue(intArray42);
        tag18.appendAttributeValue(intArray42);
        tag9.appendAttributeValue(intArray42);
        java.lang.String str47 = tag9.normalName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1 });
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        boolean boolean18 = endTag0.isComment();
        endTag0.tagName = "</hi!>";
        endTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
        doctype0.pubSysKey = "";
        doctype0.pubSysKey = "EOF";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        java.lang.String str20 = endTag0.tagName;
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#" + "'", str20, "#");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        java.lang.String str9 = character0.getData();
        org.jsoup.parser.Token token10 = character0.reset();
        java.lang.String str11 = character0.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType10 = comment0.type;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        java.lang.String str38 = tag8.name();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Character" + "'", str38, "Character");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        java.lang.String str4 = comment0.toString();
        org.jsoup.parser.Token.Comment comment5 = comment0.asComment();
        org.jsoup.parser.Token token6 = comment5.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(comment5);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
        boolean boolean15 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder16 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token token7 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        boolean boolean40 = startTag3.isEOF();
        startTag3.appendAttributeValue("hi!#");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = startTag3.toString();
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
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        endTag0.selfClosing = true;
        org.jsoup.parser.Token token6 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        org.jsoup.parser.Token.Tag tag36 = startTag34.reset();
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
        org.junit.Assert.assertNotNull(tag36);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token.TokenType tokenType8 = comment7.type;
        java.lang.String str9 = comment7.toString();
        java.lang.String str10 = comment7.getData();
        boolean boolean11 = comment7.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
        boolean boolean18 = tag10.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment19 = tag10.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        java.lang.String str4 = endTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.tokenType();
        java.lang.String str5 = doctype0.pubSysKey;
        java.lang.String str6 = doctype0.pubSysKey;
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        java.lang.String str19 = tag10.normalName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!endtag" + "'", str19, "hi!endtag");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        org.jsoup.parser.Token token20 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.isDoctype();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag25.nameAttr("", attributes28);
        org.jsoup.parser.Token.Tag tag30 = startTag29.reset();
        startTag29.newAttribute();
        org.jsoup.parser.Token.Tag tag32 = startTag29.reset();
        org.jsoup.nodes.Attributes attributes33 = startTag29.getAttributes();
        org.jsoup.parser.Token.StartTag startTag34 = startTag3.nameAttr("</ >", attributes33);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(startTag34);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
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
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("</ >");
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag10.nameAttr("EOF", attributes12);
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag10.nameAttr("EOF", attributes15);
        org.jsoup.parser.Token.Tag tag18 = startTag10.name("hi!");
        java.lang.String str19 = startTag10.toString();
        startTag10.newAttribute();
        org.jsoup.parser.Token.Tag tag21 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes22 = startTag10.getAttributes();
        org.jsoup.parser.Token.StartTag startTag23 = startTag0.nameAttr("eof4", attributes22);
        org.jsoup.parser.Token.StartTag startTag24 = startTag23.asStartTag();
        java.lang.String str25 = startTag23.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>" + "'", str19, "<hi!>");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<eof4>" + "'", str25, "<eof4>");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        startTag7.selfClosing = false;
        boolean boolean13 = startTag7.isCharacter();
        org.jsoup.parser.Token.Tag tag14 = startTag7.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        boolean boolean12 = doctype8.isEOF();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        boolean boolean7 = doctype0.isDoctype();
        boolean boolean8 = doctype0.isStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
        org.jsoup.parser.Token.Tag tag50 = startTag49.reset();
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
        org.junit.Assert.assertNotNull(tag50);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.appendAttributeValue("4");
        boolean boolean9 = endTag0.isComment();
        boolean boolean10 = endTag0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        org.jsoup.parser.Token token23 = comment0.reset();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag24.nameAttr("EOF", attributes26);
        boolean boolean28 = startTag27.isDoctype();
        org.jsoup.parser.Token.Tag tag29 = startTag27.reset();
        org.jsoup.parser.Token.StartTag startTag30 = tag29.asStartTag();
        org.jsoup.parser.Token.Tag tag31 = tag29.reset();
        boolean boolean32 = tag29.selfClosing;
        java.lang.String str33 = tag29.normalName;
        boolean boolean34 = tag29.isStartTag();
        boolean boolean35 = tag29.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType36 = tag29.type;
        comment0.type = tokenType36;
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
        org.junit.Assert.assertNotNull(token23);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.pubSysKey;
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        comment0.bogus = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.tagName = "a";
        endTag0.tagName = "</StartTag>";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.appendAttributeValue("</hi!>");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = token5.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token9 = doctype0.reset();
        doctype0.forceQuirks = false;
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
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag5 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        java.lang.String str7 = startTag5.tokenType();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        java.lang.String str34 = startTag0.normalName();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<hi!>#" + "'", str34, "<hi!>#");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        boolean boolean14 = tag13.selfClosing;
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        boolean boolean16 = endTag15.isSelfClosing();
        endTag15.normalName = "";
        endTag15.finaliseTag();
        boolean boolean20 = endTag15.selfClosing;
        endTag15.appendAttributeName('#');
        boolean boolean23 = endTag15.isEndTag();
        endTag15.selfClosing = false;
        org.jsoup.parser.Token.Tag tag27 = endTag15.name(" ");
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.appendAttributeValue(' ');
        char[] charArray33 = new char[] { ' ', ' ' };
        endTag28.appendAttributeValue(charArray33);
        endTag28.selfClosing = true;
        org.jsoup.parser.Token.Tag tag38 = endTag28.name("hi!");
        boolean boolean39 = endTag28.isStartTag();
        endTag28.normalName = "eof";
        endTag28.appendAttributeName("eof");
        endTag28.appendAttributeName('a');
        endTag28.tagName = "eof";
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag();
        endTag48.appendAttributeValue(' ');
        char[] charArray53 = new char[] { ' ', ' ' };
        endTag48.appendAttributeValue(charArray53);
        endTag48.selfClosing = true;
        org.jsoup.parser.Token.Tag tag58 = endTag48.name("hi!");
        endTag48.appendAttributeName('a');
        endTag48.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag63 = new org.jsoup.parser.Token.EndTag();
        endTag63.appendAttributeValue(' ');
        endTag63.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag68 = new org.jsoup.parser.Token.EndTag();
        endTag68.appendAttributeValue(' ');
        char[] charArray73 = new char[] { ' ', ' ' };
        endTag68.appendAttributeValue(charArray73);
        endTag68.selfClosing = true;
        org.jsoup.parser.Token.Tag tag78 = endTag68.name("hi!");
        endTag68.appendAttributeName('a');
        int[] intArray85 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag68.appendAttributeValue(intArray85);
        endTag63.appendAttributeValue(intArray85);
        endTag48.appendAttributeValue(intArray85);
        endTag28.appendAttributeValue(intArray85);
        tag27.appendAttributeValue(intArray85);
        tag13.appendAttributeValue(intArray85);
        tag13.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = startTag47.nameAttr("EOF", attributes49);
        boolean boolean51 = startTag50.isDoctype();
        org.jsoup.nodes.Attributes attributes53 = null;
        org.jsoup.parser.Token.StartTag startTag54 = startTag50.nameAttr("", attributes53);
        org.jsoup.parser.Token.Tag tag55 = startTag54.reset();
        org.jsoup.parser.Token.Tag tag56 = startTag54.reset();
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes60 = null;
        org.jsoup.parser.Token.StartTag startTag61 = startTag58.nameAttr("EOF", attributes60);
        org.jsoup.nodes.Attributes attributes63 = null;
        org.jsoup.parser.Token.StartTag startTag64 = startTag58.nameAttr("EOF", attributes63);
        java.lang.String str65 = startTag58.normalName();
        org.jsoup.parser.Token.StartTag startTag66 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes68 = null;
        org.jsoup.parser.Token.StartTag startTag69 = startTag66.nameAttr("EOF", attributes68);
        boolean boolean70 = startTag69.isDoctype();
        org.jsoup.nodes.Attributes attributes72 = null;
        org.jsoup.parser.Token.StartTag startTag73 = startTag69.nameAttr("", attributes72);
        org.jsoup.parser.Token.TokenType tokenType74 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag69.type = tokenType74;
        startTag58.type = tokenType74;
        org.jsoup.parser.Token.Tag tag77 = startTag58.reset();
        org.jsoup.nodes.Attributes attributes78 = startTag58.attributes;
        org.jsoup.parser.Token.StartTag startTag79 = startTag54.nameAttr("</hi!#>", attributes78);
        org.jsoup.parser.Token.StartTag startTag80 = startTag43.nameAttr("", attributes78);
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
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "eof" + "'", str65, "eof");
        org.junit.Assert.assertNotNull(startTag69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(startTag73);
        org.junit.Assert.assertTrue("'" + tokenType74 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType74.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(startTag79);
        org.junit.Assert.assertNotNull(startTag80);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.normalName;
        endTag0.finaliseTag();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        boolean boolean9 = doctype8.isForceQuirks();
        java.lang.String str10 = doctype8.getName();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = endTag11.name("hi!");
        tag21.appendAttributeValue("eof");
        boolean boolean24 = tag21.isEOF();
        tag21.normalName = "</hi!>";
        tag21.appendAttributeValue("</StartTag>");
        org.jsoup.parser.Token.TokenType tokenType29 = tag21.type;
        doctype8.type = tokenType29;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        tag9.selfClosing = false;
        tag9.tagName = "hi!</hi!>";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        java.lang.String str15 = comment0.getData();
        boolean boolean16 = comment0.bogus;
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("eof");
        java.lang.String str11 = tag10.name();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.appendAttributeValue(' ');
        char[] charArray17 = new char[] { ' ', ' ' };
        endTag12.appendAttributeValue(charArray17);
        endTag12.selfClosing = true;
        org.jsoup.parser.Token.Tag tag22 = endTag12.name("hi!");
        endTag12.appendAttributeName('a');
        boolean boolean25 = endTag12.selfClosing;
        boolean boolean26 = endTag12.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType27 = null;
        endTag12.type = tokenType27;
        org.jsoup.parser.Token token29 = endTag12.reset();
        org.jsoup.nodes.Attributes attributes30 = endTag12.getAttributes();
        endTag12.appendAttributeName("<!---->4");
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        endTag33.appendAttributeValue(' ');
        char[] charArray38 = new char[] { ' ', ' ' };
        endTag33.appendAttributeValue(charArray38);
        endTag33.selfClosing = true;
        org.jsoup.parser.Token.Tag tag43 = endTag33.name("hi!");
        boolean boolean44 = endTag33.isStartTag();
        endTag33.selfClosing = true;
        endTag33.appendTagName('4');
        org.jsoup.parser.Token.Tag tag49 = endTag33.reset();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = startTag50.nameAttr("EOF", attributes52);
        boolean boolean54 = startTag53.isDoctype();
        org.jsoup.parser.Token.Tag tag55 = startTag53.reset();
        java.lang.String str56 = startTag53.normalName;
        java.lang.String str57 = startTag53.normalName();
        boolean boolean58 = startTag53.selfClosing;
        org.jsoup.parser.Token.EndTag endTag59 = new org.jsoup.parser.Token.EndTag();
        endTag59.appendAttributeValue(' ');
        char[] charArray64 = new char[] { ' ', ' ' };
        endTag59.appendAttributeValue(charArray64);
        endTag59.selfClosing = true;
        org.jsoup.parser.Token.Tag tag69 = endTag59.name("hi!");
        boolean boolean70 = endTag59.isStartTag();
        endTag59.selfClosing = true;
        endTag59.appendAttributeName("EOF");
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes77 = null;
        org.jsoup.parser.Token.StartTag startTag78 = startTag75.nameAttr("EOF", attributes77);
        boolean boolean79 = startTag78.isDoctype();
        org.jsoup.nodes.Attributes attributes81 = null;
        org.jsoup.parser.Token.StartTag startTag82 = startTag78.nameAttr("", attributes81);
        org.jsoup.parser.Token.Tag tag83 = startTag82.reset();
        org.jsoup.parser.Token.EndTag endTag84 = new org.jsoup.parser.Token.EndTag();
        boolean boolean85 = endTag84.isSelfClosing();
        endTag84.normalName = "";
        java.lang.String str88 = endTag84.normalName();
        char[] charArray91 = new char[] { 'a', 'a' };
        endTag84.appendAttributeValue(charArray91);
        startTag82.appendAttributeValue(charArray91);
        endTag59.appendAttributeValue(charArray91);
        startTag53.appendAttributeValue(charArray91);
        endTag33.appendAttributeValue(charArray91);
        endTag12.appendAttributeValue(charArray91);
        tag10.appendAttributeValue(charArray91);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(token29);
        org.junit.Assert.assertNull(attributes30);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(startTag82);
        org.junit.Assert.assertNotNull(tag83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertArrayEquals(charArray91, new char[] { 'a', 'a' });
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        startTag0.appendAttributeName('a');
        boolean boolean10 = startTag0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        startTag3.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = startTag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
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
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        java.lang.String str8 = endTag0.toString();
        org.jsoup.nodes.Attributes attributes9 = endTag0.getAttributes();
        endTag0.tagName = "<<starttag>>";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype12 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</ >" + "'", str8, "</ >");
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token.Character character6 = character0.asCharacter();
        boolean boolean7 = character0.isEOF();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        java.lang.String str5 = startTag3.toString();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.appendAttributeValue(' ');
        endTag6.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = endTag11.name("hi!");
        endTag11.appendAttributeName('a');
        int[] intArray28 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag11.appendAttributeValue(intArray28);
        endTag6.appendAttributeValue(intArray28);
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.finaliseTag();
        boolean boolean33 = endTag31.isCharacter();
        int[] intArray35 = new int[] { (short) 1 };
        endTag31.appendAttributeValue(intArray35);
        endTag6.appendAttributeValue(intArray35);
        startTag3.appendAttributeValue(intArray35);
        java.lang.String str39 = startTag3.toString();
        java.lang.String str40 = startTag3.normalName();
        startTag3.appendAttributeName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<EOF>" + "'", str5, "<EOF>");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<EOF>" + "'", str39, "<EOF>");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "eof" + "'", str40, "eof");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        boolean boolean7 = startTag3.isComment();
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        org.jsoup.parser.Token.TokenType tokenType16 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag9.type = tokenType16;
        org.jsoup.parser.Token.Tag tag19 = endTag9.name("eof");
        java.lang.String str20 = tag19.name();
        tag19.newAttribute();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        boolean boolean23 = endTag22.isSelfClosing();
        endTag22.normalName = "";
        boolean boolean26 = endTag22.isDoctype();
        endTag22.setEmptyAttributeValue();
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
        endTag22.attributes = attributes46;
        tag19.attributes = attributes46;
        org.jsoup.parser.Token.StartTag startTag52 = startTag3.nameAttr("starttag", attributes46);
        startTag3.appendAttributeName("<<hi!>>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eof" + "'", str20, "eof");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(startTag52);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.jsoup.parser.Token token9 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token token8 = startTag7.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        java.lang.String str49 = endTag0.normalName();
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
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        boolean boolean7 = startTag6.isStartTag();
        startTag6.finaliseTag();
        java.lang.String str9 = startTag6.name();
        startTag6.appendAttributeName("");
        org.jsoup.parser.Token.Tag tag12 = startTag6.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType12 = endTag0.type;
        java.lang.String str13 = endTag0.name();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
        java.lang.String str14 = character13.toString();
        org.jsoup.parser.Token token15 = character13.reset();
        org.jsoup.parser.Token token16 = character13.reset();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertNotNull(token16);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        boolean boolean6 = doctype0.isCharacter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        comment0.bogus = false;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.bogus;
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.jsoup.parser.Token token9 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        org.jsoup.parser.Token token2 = comment0.reset();
        boolean boolean3 = token2.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token6 = doctype0.reset();
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        endTag0.normalName = "Character";
        org.jsoup.parser.Token.Tag tag11 = endTag0.name("<!---->");
        java.lang.String str12 = endTag0.normalName;
        endTag0.appendAttributeValue('#');
        endTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        java.lang.String str12 = doctype0.getSystemIdentifier();
        java.lang.String str13 = doctype0.getPublicIdentifier();
        java.lang.String str14 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder15 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag3.type = tokenType8;
        org.jsoup.nodes.Attributes attributes10 = startTag3.getAttributes();
        java.lang.String str11 = startTag3.tagName;
        startTag3.appendAttributeName('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype14 = startTag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        java.lang.String str8 = startTag0.tokenType();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag10.nameAttr("EOF", attributes12);
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag10.nameAttr("EOF", attributes15);
        startTag16.selfClosing = false;
        java.lang.String str19 = startTag16.tokenType();
        startTag16.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.Tag tag22 = startTag16.reset();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag24.nameAttr("EOF", attributes26);
        boolean boolean28 = startTag27.isDoctype();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag27.nameAttr("", attributes30);
        org.jsoup.parser.Token.Tag tag32 = startTag31.reset();
        startTag31.appendTagName('4');
        org.jsoup.parser.Token.EndTag endTag36 = new org.jsoup.parser.Token.EndTag();
        boolean boolean37 = endTag36.isSelfClosing();
        endTag36.normalName = "";
        endTag36.finaliseTag();
        boolean boolean41 = endTag36.selfClosing;
        endTag36.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.parser.Token.StartTag startTag47 = startTag44.nameAttr("EOF", attributes46);
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = startTag44.nameAttr("EOF", attributes49);
        java.lang.String str51 = startTag44.normalName();
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = startTag52.nameAttr("EOF", attributes54);
        boolean boolean56 = startTag55.isDoctype();
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = startTag55.nameAttr("", attributes58);
        org.jsoup.parser.Token.TokenType tokenType60 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag55.type = tokenType60;
        startTag44.type = tokenType60;
        endTag36.type = tokenType60;
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes66 = null;
        org.jsoup.parser.Token.StartTag startTag67 = startTag64.nameAttr("EOF", attributes66);
        boolean boolean68 = startTag67.isDoctype();
        org.jsoup.parser.Token.EndTag endTag70 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes73 = null;
        org.jsoup.parser.Token.StartTag startTag74 = startTag71.nameAttr("EOF", attributes73);
        boolean boolean75 = startTag74.isDoctype();
        org.jsoup.parser.Token.Tag tag76 = startTag74.reset();
        startTag74.newAttribute();
        org.jsoup.nodes.Attributes attributes78 = startTag74.attributes;
        endTag70.attributes = attributes78;
        org.jsoup.parser.Token.StartTag startTag80 = startTag67.nameAttr("eof", attributes78);
        endTag36.attributes = attributes78;
        org.jsoup.parser.Token.StartTag startTag82 = startTag31.nameAttr("EOF", attributes78);
        org.jsoup.parser.Token.StartTag startTag83 = startTag16.nameAttr("</ >", attributes78);
        org.jsoup.parser.Token.StartTag startTag84 = startTag0.nameAttr("", attributes78);
        boolean boolean85 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "StartTag" + "'", str19, "StartTag");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "eof" + "'", str51, "eof");
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertTrue("'" + tokenType60 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType60.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(startTag74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(startTag80);
        org.junit.Assert.assertNotNull(startTag82);
        org.junit.Assert.assertNotNull(startTag83);
        org.junit.Assert.assertNotNull(startTag84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        java.lang.String str7 = endTag0.toString();
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</ >" + "'", str7, "</ >");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        int[] intArray17 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag0.appendAttributeValue(intArray17);
        org.jsoup.parser.Token.EndTag endTag19 = endTag0.asEndTag();
        endTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(endTag19);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        boolean boolean11 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType6 = comment0.type;
        java.lang.String str7 = comment0.getData();
        org.jsoup.parser.Token token8 = comment0.reset();
        org.jsoup.parser.Token token9 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.pubSysKey;
        boolean boolean7 = doctype0.isStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        boolean boolean17 = comment16.bogus;
        comment16.bogus = true;
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
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        boolean boolean11 = tag5.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = tag5.type;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        boolean boolean17 = startTag16.isDoctype();
        org.jsoup.parser.Token.Tag tag18 = startTag16.reset();
        startTag16.newAttribute();
        org.jsoup.parser.Token token20 = startTag16.reset();
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag();
        endTag21.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag24 = endTag21.reset();
        tag24.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag28 = tag24.name("StartTag");
        org.jsoup.parser.Token token29 = tag24.reset();
        org.jsoup.parser.Token.TokenType tokenType30 = token29.type;
        startTag16.type = tokenType30;
        tag5.type = tokenType30;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(token29);
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendTagName("EndTag");
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        endTag7.appendAttributeValue("<<<hi!>>>");
        endTag7.appendAttributeName('#');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(endTag7);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.normalName = "";
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
        org.jsoup.parser.Token.StartTag startTag29 = startTag7.nameAttr("<EOF>", attributes26);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        org.jsoup.parser.Token.Tag tag32 = startTag29.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tag32);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token token7 = startTag3.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag3.reset();
        startTag3.finaliseTag();
        java.lang.String str12 = startTag3.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        boolean boolean49 = startTag43.selfClosing;
        boolean boolean50 = startTag43.isSelfClosing();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.String str10 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        comment0.bogus = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token.Character character5 = character0.data("</hi!>");
        org.jsoup.parser.Token.Character character7 = character5.data("<!---->4");
        boolean boolean8 = character5.isEndTag();
        org.jsoup.parser.Token.Character character10 = character5.data("<#>");
        java.lang.String str11 = character5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag12 = character5.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<#>" + "'", str11, "<#>");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        boolean boolean2 = comment0.bogus;
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        java.lang.String str82 = startTag43.toString();
        org.jsoup.nodes.Attributes attributes83 = startTag43.getAttributes();
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "<starttag>" + "'", str82, "<starttag>");
        org.junit.Assert.assertNotNull(attributes83);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag9 = startTag6.name("StartTag");
        startTag6.selfClosing = false;
        java.lang.String str12 = startTag6.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "starttag" + "'", str12, "starttag");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        org.junit.Assert.assertNotNull(token1);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        tag10.appendTagName("eof");
        org.jsoup.nodes.Attributes attributes18 = tag10.getAttributes();
        org.jsoup.nodes.Attributes attributes19 = tag10.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertNull(attributes19);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.jsoup.parser.Token token10 = doctype0.reset();
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
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        org.jsoup.parser.Token.EndTag endTag11 = endTag0.asEndTag();
        endTag11.appendAttributeValue("hi!</hi!>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag11);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        org.jsoup.parser.Token token2 = comment0.reset();
        comment0.bogus = false;
        boolean boolean5 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
        java.lang.String str18 = endTag0.normalName();
        org.jsoup.parser.Token.Tag tag20 = endTag0.name("<#>");
        tag20.normalName = "<hi!>";
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag26.nameAttr("", attributes29);
        org.jsoup.parser.Token.Tag tag31 = startTag30.reset();
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        boolean boolean33 = endTag32.isSelfClosing();
        endTag32.normalName = "";
        java.lang.String str36 = endTag32.normalName();
        char[] charArray39 = new char[] { 'a', 'a' };
        endTag32.appendAttributeValue(charArray39);
        tag31.appendAttributeValue(charArray39);
        org.jsoup.nodes.Attributes attributes42 = tag31.attributes;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = startTag43.nameAttr("EOF", attributes45);
        boolean boolean47 = startTag46.isDoctype();
        org.jsoup.parser.Token.Tag tag48 = startTag46.reset();
        java.lang.String str49 = startTag46.normalName;
        java.lang.String str50 = startTag46.normalName();
        boolean boolean51 = startTag46.selfClosing;
        boolean boolean52 = startTag46.isDoctype();
        startTag46.appendTagName('4');
        boolean boolean55 = startTag46.isEndTag();
        org.jsoup.parser.Token.EndTag endTag56 = new org.jsoup.parser.Token.EndTag();
        endTag56.appendAttributeValue(' ');
        char[] charArray61 = new char[] { ' ', ' ' };
        endTag56.appendAttributeValue(charArray61);
        endTag56.selfClosing = true;
        org.jsoup.parser.Token.Tag tag66 = endTag56.name("hi!");
        endTag56.appendAttributeName('a');
        endTag56.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag71 = new org.jsoup.parser.Token.EndTag();
        endTag71.appendAttributeValue(' ');
        endTag71.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag76 = new org.jsoup.parser.Token.EndTag();
        endTag76.appendAttributeValue(' ');
        char[] charArray81 = new char[] { ' ', ' ' };
        endTag76.appendAttributeValue(charArray81);
        endTag76.selfClosing = true;
        org.jsoup.parser.Token.Tag tag86 = endTag76.name("hi!");
        endTag76.appendAttributeName('a');
        int[] intArray93 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag76.appendAttributeValue(intArray93);
        endTag71.appendAttributeValue(intArray93);
        endTag56.appendAttributeValue(intArray93);
        startTag46.appendAttributeValue(intArray93);
        tag31.appendAttributeValue(intArray93);
        tag20.appendAttributeValue(intArray93);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!#" + "'", str18, "hi!#");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertArrayEquals(charArray81, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag86);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        boolean boolean7 = startTag6.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character4 = character2.data("Doctype");
        java.lang.String str5 = character4.toString();
        org.jsoup.parser.Token.Character character7 = character4.data("hi!</hi!>");
        org.jsoup.parser.Token.Character character9 = character7.data("4");
        org.jsoup.parser.Token token10 = character7.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        endTag0.finaliseTag();
        endTag0.tagName = "</hi!#>";
        org.jsoup.nodes.Attributes attributes6 = endTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes7 = endTag0.getAttributes();
        endTag0.finaliseTag();
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        org.jsoup.parser.Token.Tag tag33 = startTag30.reset();
        java.lang.String str34 = startTag30.normalName();
        startTag30.appendAttributeName('a');
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
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        boolean boolean33 = endTag32.isSelfClosing();
        endTag32.normalName = "";
        endTag32.finaliseTag();
        org.jsoup.nodes.Attributes attributes37 = endTag32.attributes;
        endTag32.appendAttributeValue('#');
        endTag32.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes42 = endTag32.getAttributes();
        java.lang.String str43 = endTag32.name();
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        endTag44.appendAttributeValue(' ');
        char[] charArray49 = new char[] { ' ', ' ' };
        endTag44.appendAttributeValue(charArray49);
        endTag44.selfClosing = true;
        org.jsoup.parser.Token.Tag tag54 = endTag44.name("hi!");
        endTag44.appendAttributeName('a');
        int[] intArray61 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag44.appendAttributeValue(intArray61);
        endTag32.appendAttributeValue(intArray61);
        endTag0.appendAttributeValue(intArray61);
        endTag0.normalName = "Comment";
        endTag0.finaliseTag();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(attributes37);
        org.junit.Assert.assertNull(attributes42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        tag10.appendAttributeValue("EOF");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EndTag" + "'", str16, "EndTag");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        org.jsoup.nodes.Attributes attributes20 = tag19.attributes;
        tag19.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str7 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str10 = doctype0.getPubSysKey();
        java.lang.String str11 = doctype0.getPublicIdentifier();
        boolean boolean12 = doctype0.isCharacter();
        boolean boolean13 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        endTag0.appendAttributeName("EndTag");
        endTag0.appendAttributeName(" ");
        boolean boolean21 = endTag0.selfClosing;
        endTag0.appendAttributeValue('a');
        endTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        java.lang.String str6 = endTag0.normalName();
        endTag0.appendTagName("</</eofa>>");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.Character;
        startTag6.type = tokenType9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        org.jsoup.parser.Token.Tag tag16 = startTag14.reset();
        org.jsoup.parser.Token.StartTag startTag17 = tag16.asStartTag();
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.finaliseTag();
        endTag19.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = startTag30.nameAttr("EOF", attributes32);
        boolean boolean34 = startTag33.isDoctype();
        org.jsoup.parser.Token.Tag tag35 = startTag33.reset();
        startTag33.newAttribute();
        org.jsoup.nodes.Attributes attributes37 = startTag33.attributes;
        endTag29.attributes = attributes37;
        org.jsoup.parser.Token.StartTag startTag39 = startTag26.nameAttr("eof", attributes37);
        endTag19.attributes = attributes37;
        org.jsoup.parser.Token.StartTag startTag41 = startTag17.nameAttr("<!---->", attributes37);
        startTag17.normalName = " ";
        org.jsoup.parser.Token.Tag tag44 = startTag17.reset();
        tag44.tagName = "starttag";
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = startTag47.nameAttr("EOF", attributes49);
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = startTag47.nameAttr("EOF", attributes52);
        startTag53.selfClosing = false;
        java.lang.String str56 = startTag53.tokenType();
        boolean boolean57 = startTag53.selfClosing;
        startTag53.appendAttributeName("");
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes63 = null;
        org.jsoup.parser.Token.StartTag startTag64 = startTag61.nameAttr("EOF", attributes63);
        boolean boolean65 = startTag64.isDoctype();
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = startTag64.nameAttr("", attributes67);
        boolean boolean69 = startTag68.isSelfClosing();
        startTag68.normalName = "";
        org.jsoup.parser.Token.StartTag startTag73 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes75 = null;
        org.jsoup.parser.Token.StartTag startTag76 = startTag73.nameAttr("EOF", attributes75);
        boolean boolean77 = startTag76.isDoctype();
        org.jsoup.parser.Token.EndTag endTag79 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag80 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes82 = null;
        org.jsoup.parser.Token.StartTag startTag83 = startTag80.nameAttr("EOF", attributes82);
        boolean boolean84 = startTag83.isDoctype();
        org.jsoup.parser.Token.Tag tag85 = startTag83.reset();
        startTag83.newAttribute();
        org.jsoup.nodes.Attributes attributes87 = startTag83.attributes;
        endTag79.attributes = attributes87;
        org.jsoup.parser.Token.StartTag startTag89 = startTag76.nameAttr("eof", attributes87);
        org.jsoup.parser.Token.StartTag startTag90 = startTag68.nameAttr("<EOF>", attributes87);
        org.jsoup.parser.Token.StartTag startTag91 = startTag53.nameAttr("Doctype", attributes87);
        tag44.attributes = attributes87;
        startTag6.attributes = attributes87;
        boolean boolean94 = startTag6.isStartTag();
        startTag6.appendTagName('4');
        org.jsoup.parser.Token.Tag tag98 = startTag6.name("</4>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "StartTag" + "'", str56, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(startTag76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(startTag83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertNotNull(startTag90);
        org.junit.Assert.assertNotNull(startTag91);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(tag98);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getPubSysKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = doctype0.asEndTag();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        boolean boolean5 = endTag0.isEndTag();
        boolean boolean6 = endTag0.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isEOF();
        comment0.bogus = true;
        org.jsoup.parser.Token token8 = comment0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        boolean boolean14 = endTag13.selfClosing;
        endTag13.appendAttributeName("StartTag");
        boolean boolean17 = endTag13.isCharacter();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag18.nameAttr("EOF", attributes20);
        boolean boolean22 = startTag21.isDoctype();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag21.nameAttr("", attributes24);
        org.jsoup.parser.Token.Tag tag26 = startTag25.reset();
        startTag25.appendTagName('4');
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        boolean boolean31 = endTag30.isSelfClosing();
        endTag30.normalName = "";
        endTag30.finaliseTag();
        boolean boolean35 = endTag30.selfClosing;
        endTag30.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes40 = null;
        org.jsoup.parser.Token.StartTag startTag41 = startTag38.nameAttr("EOF", attributes40);
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag38.nameAttr("EOF", attributes43);
        java.lang.String str45 = startTag38.normalName();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag46.nameAttr("EOF", attributes48);
        boolean boolean50 = startTag49.isDoctype();
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = startTag49.nameAttr("", attributes52);
        org.jsoup.parser.Token.TokenType tokenType54 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag49.type = tokenType54;
        startTag38.type = tokenType54;
        endTag30.type = tokenType54;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes60 = null;
        org.jsoup.parser.Token.StartTag startTag61 = startTag58.nameAttr("EOF", attributes60);
        boolean boolean62 = startTag61.isDoctype();
        org.jsoup.parser.Token.EndTag endTag64 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = startTag65.nameAttr("EOF", attributes67);
        boolean boolean69 = startTag68.isDoctype();
        org.jsoup.parser.Token.Tag tag70 = startTag68.reset();
        startTag68.newAttribute();
        org.jsoup.nodes.Attributes attributes72 = startTag68.attributes;
        endTag64.attributes = attributes72;
        org.jsoup.parser.Token.StartTag startTag74 = startTag61.nameAttr("eof", attributes72);
        endTag30.attributes = attributes72;
        org.jsoup.parser.Token.StartTag startTag76 = startTag25.nameAttr("EOF", attributes72);
        endTag13.attributes = attributes72;
        boolean boolean78 = endTag13.isComment();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "eof" + "'", str45, "eof");
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + tokenType54 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType54.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertNotNull(startTag74);
        org.junit.Assert.assertNotNull(startTag76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }
}

