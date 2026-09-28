package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        org.jsoup.parser.Token.StartTag startTag8 = tag5.asStartTag();
        java.lang.String str9 = startTag8.tagName;
        startTag8.appendTagName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        boolean boolean44 = startTag43.isDoctype();
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.isDoctype();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        boolean boolean13 = tag12.selfClosing;
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        boolean boolean15 = endTag14.isSelfClosing();
        endTag14.normalName = "";
        endTag14.finaliseTag();
        boolean boolean19 = endTag14.selfClosing;
        endTag14.appendAttributeName('#');
        boolean boolean22 = endTag14.isEndTag();
        endTag14.selfClosing = false;
        org.jsoup.parser.Token.Tag tag26 = endTag14.name(" ");
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        endTag27.appendAttributeValue(' ');
        char[] charArray32 = new char[] { ' ', ' ' };
        endTag27.appendAttributeValue(charArray32);
        endTag27.selfClosing = true;
        org.jsoup.parser.Token.Tag tag37 = endTag27.name("hi!");
        boolean boolean38 = endTag27.isStartTag();
        endTag27.normalName = "eof";
        endTag27.appendAttributeName("eof");
        endTag27.appendAttributeName('a');
        endTag27.tagName = "eof";
        org.jsoup.parser.Token.EndTag endTag47 = new org.jsoup.parser.Token.EndTag();
        endTag47.appendAttributeValue(' ');
        char[] charArray52 = new char[] { ' ', ' ' };
        endTag47.appendAttributeValue(charArray52);
        endTag47.selfClosing = true;
        org.jsoup.parser.Token.Tag tag57 = endTag47.name("hi!");
        endTag47.appendAttributeName('a');
        endTag47.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag62 = new org.jsoup.parser.Token.EndTag();
        endTag62.appendAttributeValue(' ');
        endTag62.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag67 = new org.jsoup.parser.Token.EndTag();
        endTag67.appendAttributeValue(' ');
        char[] charArray72 = new char[] { ' ', ' ' };
        endTag67.appendAttributeValue(charArray72);
        endTag67.selfClosing = true;
        org.jsoup.parser.Token.Tag tag77 = endTag67.name("hi!");
        endTag67.appendAttributeName('a');
        int[] intArray84 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag67.appendAttributeValue(intArray84);
        endTag62.appendAttributeValue(intArray84);
        endTag47.appendAttributeValue(intArray84);
        endTag27.appendAttributeValue(intArray84);
        tag26.appendAttributeValue(intArray84);
        tag12.appendAttributeValue(intArray84);
        java.lang.String str91 = tag12.name();
        java.lang.String str92 = tag12.normalName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + " " + "'", str91, " ");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + " " + "'", str92, " ");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token6 = doctype0.reset();
        boolean boolean7 = doctype0.isEOF();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        boolean boolean10 = doctype0.isDoctype();
        java.lang.String str11 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        tag6.appendAttributeName("</eof>");
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        boolean boolean6 = comment0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data(" ");
        org.jsoup.parser.Token.Character character8 = character0.data("hi!#");
        java.lang.String str9 = character8.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!#" + "'", str9, "hi!#");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        doctype0.pubSysKey = "#";
        boolean boolean10 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        java.lang.String str46 = startTag43.name();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "</StartTag>" + "'", str46, "</StartTag>");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.String str10 = doctype0.getName();
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        java.lang.String str12 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        boolean boolean13 = endTag0.selfClosing;
        java.lang.String str14 = endTag0.toString();
        endTag0.appendAttributeValue(' ');
        boolean boolean17 = endTag0.isEOF();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</hi!>" + "'", str14, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        boolean boolean9 = startTag6.isComment();
        startTag6.appendAttributeValue("");
        org.jsoup.parser.Token.Tag tag12 = startTag6.reset();
        startTag6.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag3.type = tokenType8;
        startTag3.appendAttributeName("</StartTag>");
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
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        boolean boolean22 = comment0.bogus;
        java.lang.String str23 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        boolean boolean9 = startTag6.isComment();
        startTag6.appendTagName(' ');
        java.lang.String str12 = startTag6.toString();
        java.lang.String str13 = startTag6.tokenType();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<EOF >" + "'", str12, "<EOF >");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "StartTag" + "'", str13, "StartTag");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token.TokenType tokenType8 = comment7.type;
        org.jsoup.parser.Token token9 = comment7.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = token9.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        java.lang.String str8 = startTag0.tokenType();
        startTag0.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isComment();
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        boolean boolean11 = startTag3.selfClosing;
        java.lang.String str12 = startTag3.normalName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.newAttribute();
        boolean boolean6 = endTag0.isCharacter();
        endTag0.appendAttributeValue("</ >");
        endTag0.appendTagName("<<hi!>>");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes8 = endTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes9 = endTag0.getAttributes();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        org.jsoup.nodes.Attributes attributes10 = startTag3.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        java.lang.String str48 = endTag0.normalName;
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("</ >");
        java.lang.String str8 = tag7.tokenType();
        tag7.tagName = "hi! ";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        org.jsoup.parser.Token.Tag tag63 = startTag60.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character64 = tag63.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(tag63);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        java.lang.String str16 = endTag0.tokenType();
        org.jsoup.parser.Token token17 = endTag0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EndTag" + "'", str16, "EndTag");
        org.junit.Assert.assertNotNull(token17);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        comment0.bogus = true;
        boolean boolean11 = comment0.isComment();
        java.lang.StringBuilder stringBuilder12 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.lang.String str31 = endTag0.name();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "eof" + "'", str31, "eof");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag3.nameAttr("</ >", attributes11);
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype14 = startTag12.asDoctype();
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
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        org.jsoup.parser.Token token10 = comment0.reset();
        comment0.bogus = true;
        java.lang.String str13 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment50 = startTag3.asComment();
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
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        startTag7.appendAttributeValue("</eof>");
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
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        endTag33.appendAttributeValue(' ');
        endTag33.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.appendAttributeValue(' ');
        char[] charArray43 = new char[] { ' ', ' ' };
        endTag38.appendAttributeValue(charArray43);
        endTag38.selfClosing = true;
        org.jsoup.parser.Token.Tag tag48 = endTag38.name("hi!");
        endTag38.appendAttributeName('a');
        int[] intArray55 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag38.appendAttributeValue(intArray55);
        endTag33.appendAttributeValue(intArray55);
        startTag0.appendAttributeValue(intArray55);
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
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        doctype7.forceQuirks = true;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doctype7);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        org.jsoup.nodes.Attributes attributes16 = startTag11.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            startTag11.newAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        char[] charArray5 = new char[] { ' ', '#', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', ' ' });
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        java.lang.String str10 = startTag6.normalName();
        boolean boolean11 = startTag6.isEOF();
        boolean boolean12 = startTag6.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "eof" + "'", str10, "eof");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        boolean boolean49 = endTag0.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        java.lang.String str8 = endTag0.toString();
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        org.jsoup.parser.Token.Tag tag16 = endTag9.reset();
        org.jsoup.parser.Token token17 = endTag9.reset();
        endTag9.appendTagName('#');
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(' ');
        char[] charArray25 = new char[] { ' ', ' ' };
        endTag20.appendAttributeValue(charArray25);
        org.jsoup.parser.Token.EndTag endTag27 = endTag20.asEndTag();
        char[] charArray33 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag20.appendAttributeValue(charArray33);
        endTag9.appendAttributeValue(charArray33);
        endTag0.appendAttributeValue(charArray33);
        endTag0.selfClosing = false;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</ >" + "'", str8, "</ >");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag27);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.pubSysKey;
        org.jsoup.parser.Token token9 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        java.lang.String str17 = endTag0.normalName();
        java.lang.String str18 = endTag0.name();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        tag22.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes25 = tag22.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(attributes25);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        boolean boolean4 = comment3.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        boolean boolean13 = tag12.selfClosing;
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        boolean boolean15 = endTag14.isSelfClosing();
        endTag14.normalName = "";
        endTag14.finaliseTag();
        boolean boolean19 = endTag14.selfClosing;
        endTag14.appendAttributeName('#');
        boolean boolean22 = endTag14.isEndTag();
        endTag14.selfClosing = false;
        org.jsoup.parser.Token.Tag tag26 = endTag14.name(" ");
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        endTag27.appendAttributeValue(' ');
        char[] charArray32 = new char[] { ' ', ' ' };
        endTag27.appendAttributeValue(charArray32);
        endTag27.selfClosing = true;
        org.jsoup.parser.Token.Tag tag37 = endTag27.name("hi!");
        boolean boolean38 = endTag27.isStartTag();
        endTag27.normalName = "eof";
        endTag27.appendAttributeName("eof");
        endTag27.appendAttributeName('a');
        endTag27.tagName = "eof";
        org.jsoup.parser.Token.EndTag endTag47 = new org.jsoup.parser.Token.EndTag();
        endTag47.appendAttributeValue(' ');
        char[] charArray52 = new char[] { ' ', ' ' };
        endTag47.appendAttributeValue(charArray52);
        endTag47.selfClosing = true;
        org.jsoup.parser.Token.Tag tag57 = endTag47.name("hi!");
        endTag47.appendAttributeName('a');
        endTag47.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag62 = new org.jsoup.parser.Token.EndTag();
        endTag62.appendAttributeValue(' ');
        endTag62.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag67 = new org.jsoup.parser.Token.EndTag();
        endTag67.appendAttributeValue(' ');
        char[] charArray72 = new char[] { ' ', ' ' };
        endTag67.appendAttributeValue(charArray72);
        endTag67.selfClosing = true;
        org.jsoup.parser.Token.Tag tag77 = endTag67.name("hi!");
        endTag67.appendAttributeName('a');
        int[] intArray84 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag67.appendAttributeValue(intArray84);
        endTag62.appendAttributeValue(intArray84);
        endTag47.appendAttributeValue(intArray84);
        endTag27.appendAttributeValue(intArray84);
        tag26.appendAttributeValue(intArray84);
        tag12.appendAttributeValue(intArray84);
        tag12.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag92 = tag12.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        boolean boolean7 = comment0.isCharacter();
        java.lang.String str8 = comment0.getData();
        java.lang.String str9 = comment0.toString();
        boolean boolean10 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        endTag0.appendAttributeName("");
        endTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes7 = endTag0.getAttributes();
        java.lang.String str8 = endTag0.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        java.lang.String str39 = comment0.toString();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!---->" + "'", str39, "<!---->");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        java.lang.String str8 = tag3.normalName;
        org.jsoup.parser.Token.Tag tag9 = tag3.reset();
        org.jsoup.parser.Token.EndTag endTag10 = tag9.asEndTag();
        java.lang.String str11 = endTag10.tagName;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "starttag" + "'", str8, "starttag");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(endTag10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        boolean boolean7 = comment0.isCharacter();
        boolean boolean8 = comment0.bogus;
        comment0.bogus = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag11 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        endTag15.appendTagName('4');
        endTag15.finaliseTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(endTag15);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        endTag0.appendAttributeName("#");
        boolean boolean19 = endTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token token6 = doctype0.reset();
        java.lang.String str7 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.getName();
        boolean boolean10 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isForceQuirks();
        boolean boolean10 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("<starttag>");
        java.lang.String str9 = character0.getData();
        java.lang.String str10 = character0.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<starttag>" + "'", str9, "<starttag>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<starttag>" + "'", str10, "<starttag>");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        endTag0.appendTagName('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        endTag0.selfClosing = true;
        org.jsoup.parser.Token token6 = endTag0.reset();
        endTag0.finaliseTag();
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag();
        endTag17.appendAttributeValue(' ');
        char[] charArray22 = new char[] { ' ', ' ' };
        endTag17.appendAttributeValue(charArray22);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(' ');
        char[] charArray29 = new char[] { ' ', ' ' };
        endTag24.appendAttributeValue(charArray29);
        endTag17.appendAttributeValue(charArray29);
        endTag17.tagName = "eof";
        java.lang.String str34 = endTag17.name();
        org.jsoup.parser.Token.EndTag endTag35 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        boolean boolean40 = startTag39.isDoctype();
        org.jsoup.parser.Token.Tag tag41 = startTag39.reset();
        startTag39.newAttribute();
        org.jsoup.nodes.Attributes attributes43 = startTag39.attributes;
        endTag35.attributes = attributes43;
        endTag17.attributes = attributes43;
        endTag0.attributes = attributes43;
        endTag0.selfClosing = false;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "eof" + "'", str34, "eof");
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(attributes43);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        java.lang.Class<?> wildcardClass11 = character0.getClass();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        boolean boolean12 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.String str17 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        org.jsoup.parser.Token.Tag tag21 = startTag3.reset();
        startTag3.normalName = "Character";
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
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        tag10.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag18.nameAttr("EOF", attributes20);
        boolean boolean22 = startTag21.isDoctype();
        java.lang.String str23 = startTag21.toString();
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
        org.jsoup.parser.Token.EndTag endTag49 = new org.jsoup.parser.Token.EndTag();
        endTag49.finaliseTag();
        boolean boolean51 = endTag49.isCharacter();
        int[] intArray53 = new int[] { (short) 1 };
        endTag49.appendAttributeValue(intArray53);
        endTag24.appendAttributeValue(intArray53);
        startTag21.appendAttributeValue(intArray53);
        tag10.appendAttributeValue(intArray53);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<EOF>" + "'", str23, "<EOF>");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 1 });
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        tag7.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        startTag0.appendTagName("Comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        boolean boolean7 = startTag6.selfClosing;
        startTag6.finaliseTag();
        org.jsoup.nodes.Attributes attributes9 = startTag6.attributes;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.String str6 = comment0.getData();
        java.lang.String str7 = comment0.getData();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.String str8 = doctype0.pubSysKey;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        comment0.bogus = true;
        java.lang.String str8 = comment0.getData();
        boolean boolean9 = comment0.bogus;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = startTag1.nameAttr("EOF", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        org.jsoup.parser.Token.Tag tag6 = startTag4.reset();
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        endTag0.attributes = attributes8;
        java.lang.String str10 = endTag0.normalName();
        org.jsoup.parser.Token.Tag tag11 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes12 = tag11.getAttributes();
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        boolean boolean2 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        endTag0.tagName = "#";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getName();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype0.type;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("<hi!>");
        java.lang.String str10 = character9.getData();
        org.jsoup.parser.Token.TokenType tokenType11 = character9.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        java.lang.String str11 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        java.lang.StringBuilder stringBuilder4 = comment3.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        comment0.bogus = false;
        java.lang.String str16 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token9 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        startTag3.appendAttributeName(' ');
        startTag3.appendAttributeValue('a');
        startTag3.appendAttributeValue("</</hi!>>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag16);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        java.lang.String str6 = endTag0.tagName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isEOF();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag3.nameAttr("EOF", attributes11);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        org.jsoup.parser.Token.Tag tag43 = endTag0.name("");
        java.lang.String str44 = tag43.normalName();
        boolean boolean45 = tag43.isEndTag();
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
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.String str7 = comment0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.tagName;
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag10 = tag9.asEndTag();
        endTag10.tagName = "<<hi!>>";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(endTag10);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.jsoup.parser.Token.reset(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        java.lang.String str10 = startTag0.toString();
        startTag0.appendTagName("</eofa>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag5 = endTag0.reset();
        boolean boolean6 = endTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        boolean boolean20 = endTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        tag16.appendAttributeValue("#");
        tag16.selfClosing = true;
        tag16.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        boolean boolean4 = doctype0.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag53.nameAttr("EOF", attributes55);
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = startTag53.nameAttr("EOF", attributes58);
        startTag59.selfClosing = false;
        java.lang.String str62 = startTag59.tokenType();
        boolean boolean63 = startTag59.selfClosing;
        startTag59.appendAttributeName("");
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes69 = null;
        org.jsoup.parser.Token.StartTag startTag70 = startTag67.nameAttr("EOF", attributes69);
        boolean boolean71 = startTag70.isDoctype();
        org.jsoup.nodes.Attributes attributes73 = null;
        org.jsoup.parser.Token.StartTag startTag74 = startTag70.nameAttr("", attributes73);
        boolean boolean75 = startTag74.isSelfClosing();
        startTag74.normalName = "";
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes81 = null;
        org.jsoup.parser.Token.StartTag startTag82 = startTag79.nameAttr("EOF", attributes81);
        boolean boolean83 = startTag82.isDoctype();
        org.jsoup.parser.Token.EndTag endTag85 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag86 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes88 = null;
        org.jsoup.parser.Token.StartTag startTag89 = startTag86.nameAttr("EOF", attributes88);
        boolean boolean90 = startTag89.isDoctype();
        org.jsoup.parser.Token.Tag tag91 = startTag89.reset();
        startTag89.newAttribute();
        org.jsoup.nodes.Attributes attributes93 = startTag89.attributes;
        endTag85.attributes = attributes93;
        org.jsoup.parser.Token.StartTag startTag95 = startTag82.nameAttr("eof", attributes93);
        org.jsoup.parser.Token.StartTag startTag96 = startTag74.nameAttr("<EOF>", attributes93);
        org.jsoup.parser.Token.StartTag startTag97 = startTag59.nameAttr("Doctype", attributes93);
        org.jsoup.parser.Token.StartTag startTag98 = startTag49.nameAttr("", attributes93);
        startTag98.finaliseTag();
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
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "StartTag" + "'", str62, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(startTag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(startTag74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(startTag82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(tag91);
        org.junit.Assert.assertNotNull(attributes93);
        org.junit.Assert.assertNotNull(startTag95);
        org.junit.Assert.assertNotNull(startTag96);
        org.junit.Assert.assertNotNull(startTag97);
        org.junit.Assert.assertNotNull(startTag98);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        boolean boolean13 = endTag0.selfClosing;
        java.lang.String str14 = endTag0.toString();
        boolean boolean15 = endTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</hi!>" + "'", str14, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        startTag3.appendAttributeName("</hi!#>");
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(' ');
        char[] charArray29 = new char[] { ' ', ' ' };
        endTag24.appendAttributeValue(charArray29);
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.appendAttributeValue(' ');
        char[] charArray36 = new char[] { ' ', ' ' };
        endTag31.appendAttributeValue(charArray36);
        endTag24.appendAttributeValue(charArray36);
        endTag24.tagName = "eof";
        java.lang.String str41 = endTag24.name();
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = startTag43.nameAttr("EOF", attributes45);
        boolean boolean47 = startTag46.isDoctype();
        org.jsoup.parser.Token.Tag tag48 = startTag46.reset();
        startTag46.newAttribute();
        org.jsoup.nodes.Attributes attributes50 = startTag46.attributes;
        endTag42.attributes = attributes50;
        endTag24.attributes = attributes50;
        boolean boolean53 = endTag24.isCharacter();
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes56 = null;
        org.jsoup.parser.Token.StartTag startTag57 = startTag54.nameAttr("EOF", attributes56);
        boolean boolean58 = startTag57.isDoctype();
        org.jsoup.parser.Token.Tag tag59 = startTag57.reset();
        java.lang.String str60 = startTag57.normalName;
        java.lang.String str61 = startTag57.normalName();
        boolean boolean62 = startTag57.selfClosing;
        java.lang.String str63 = startTag57.tagName;
        boolean boolean64 = startTag57.isEOF();
        org.jsoup.parser.Token.StartTag startTag66 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes68 = null;
        org.jsoup.parser.Token.StartTag startTag69 = startTag66.nameAttr("EOF", attributes68);
        boolean boolean70 = startTag69.isDoctype();
        org.jsoup.nodes.Attributes attributes72 = null;
        org.jsoup.parser.Token.StartTag startTag73 = startTag69.nameAttr("", attributes72);
        boolean boolean74 = startTag73.isSelfClosing();
        java.lang.String str75 = startTag73.tagName;
        boolean boolean76 = startTag73.isEndTag();
        boolean boolean77 = startTag73.isEndTag();
        org.jsoup.parser.Token.EndTag endTag79 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag80 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes82 = null;
        org.jsoup.parser.Token.StartTag startTag83 = startTag80.nameAttr("EOF", attributes82);
        boolean boolean84 = startTag83.isDoctype();
        org.jsoup.parser.Token.Tag tag85 = startTag83.reset();
        startTag83.newAttribute();
        org.jsoup.nodes.Attributes attributes87 = startTag83.attributes;
        endTag79.attributes = attributes87;
        org.jsoup.parser.Token.StartTag startTag89 = startTag73.nameAttr("<!---->4", attributes87);
        org.jsoup.parser.Token.StartTag startTag90 = startTag57.nameAttr("<<!---->>", attributes87);
        endTag24.attributes = attributes87;
        org.jsoup.parser.Token.StartTag startTag92 = startTag3.nameAttr("<</hi!>>", attributes87);
        startTag3.finaliseTag();
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
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "eof" + "'", str41, "eof");
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(startTag69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(startTag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(startTag83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertNotNull(startTag90);
        org.junit.Assert.assertNotNull(startTag92);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        boolean boolean12 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder15 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        java.lang.Class<?> wildcardClass25 = comment0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isEndTag();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes8 = endTag7.getAttributes();
        endTag7.selfClosing = true;
        endTag7.finaliseTag();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        doctype12.pubSysKey = "";
        java.lang.String str15 = doctype12.pubSysKey;
        java.lang.String str16 = doctype12.getPublicIdentifier();
        boolean boolean17 = doctype12.isForceQuirks();
        doctype12.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype20 = doctype12.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType21 = doctype12.type;
        endTag7.type = tokenType21;
        token6.type = tokenType21;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doctype20);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        boolean boolean28 = endTag0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        boolean boolean2 = endTag0.selfClosing;
        endTag0.appendAttributeValue("Comment");
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName("<<hi!>>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        java.lang.String str38 = startTag30.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character39 = startTag30.asCharacter();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<</hi!>>" + "'", str38, "<</hi!>>");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        boolean boolean14 = tag8.isCharacter();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = tag10.isEndTag();
        org.jsoup.parser.Token token12 = tag10.reset();
        boolean boolean13 = token12.isStartTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.String str6 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        java.lang.Class<?> wildcardClass35 = endTag0.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isComment();
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.jsoup.parser.Token token10 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token token7 = character0.reset();
        java.lang.String str8 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        boolean boolean17 = endTag0.selfClosing;
        endTag0.normalName = "<<!---->>";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        java.lang.String str12 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag3.toString();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = startTag3.reset();
        tag8.appendAttributeValue("<!---->4");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<EOF>" + "'", str4, "<EOF>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        comment0.bogus = false;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.String str7 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        boolean boolean7 = comment0.isCharacter();
        boolean boolean8 = comment0.bogus;
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder11 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        java.lang.String str8 = tag3.normalName;
        org.jsoup.parser.Token.Tag tag9 = tag3.reset();
        org.jsoup.parser.Token.EndTag endTag10 = tag9.asEndTag();
        java.lang.String str11 = endTag10.tokenType();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag12.nameAttr("EOF", attributes17);
        boolean boolean19 = startTag18.isStartTag();
        startTag18.finaliseTag();
        java.lang.String str21 = startTag18.name();
        java.lang.String str22 = startTag18.toString();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag24.nameAttr("EOF", attributes26);
        boolean boolean28 = startTag27.isDoctype();
        org.jsoup.parser.Token.Tag tag29 = startTag27.reset();
        org.jsoup.parser.Token.StartTag startTag30 = tag29.asStartTag();
        org.jsoup.parser.Token.Tag tag31 = tag29.reset();
        org.jsoup.nodes.Attributes attributes32 = tag29.attributes;
        org.jsoup.parser.Token.StartTag startTag33 = startTag18.nameAttr("", attributes32);
        endTag10.attributes = attributes32;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "starttag" + "'", str8, "starttag");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(endTag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EndTag" + "'", str11, "EndTag");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<EOF>" + "'", str22, "<EOF>");
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(startTag33);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("StartTag");
        java.lang.String str7 = character6.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag15.nameAttr("", attributes18);
        boolean boolean20 = startTag19.isSelfClosing();
        java.lang.String str21 = startTag19.tagName;
        boolean boolean22 = startTag19.isEndTag();
        boolean boolean23 = startTag19.isEndTag();
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        startTag29.newAttribute();
        org.jsoup.nodes.Attributes attributes33 = startTag29.attributes;
        endTag25.attributes = attributes33;
        org.jsoup.parser.Token.StartTag startTag35 = startTag19.nameAttr("<!---->4", attributes33);
        org.jsoup.parser.Token.StartTag startTag36 = startTag3.nameAttr("<<!---->>", attributes33);
        startTag3.appendAttributeValue("hi!#");
        startTag3.appendTagName("<<!---->>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertNotNull(startTag36);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        startTag6.appendAttributeValue("StartTag");
        org.jsoup.nodes.Attributes attributes12 = startTag6.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        java.lang.String str30 = endTag0.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "</eof>" + "'", str30, "</eof>");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        java.lang.String str8 = tag3.normalName;
        org.jsoup.parser.Token.Tag tag9 = tag3.reset();
        tag9.setEmptyAttributeValue();
        tag9.appendAttributeValue("EOF");
        tag9.appendAttributeName('4');
        boolean boolean15 = tag9.selfClosing;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "starttag" + "'", str8, "starttag");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        tag17.normalName = "";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        tag6.finaliseTag();
        boolean boolean9 = tag6.isStartTag();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag10.nameAttr("EOF", attributes12);
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag10.nameAttr("EOF", attributes15);
        org.jsoup.parser.Token.Tag tag17 = startTag10.reset();
        java.lang.String str18 = tag17.tagName;
        boolean boolean19 = tag17.isCharacter();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = startTag20.nameAttr("EOF", attributes22);
        boolean boolean24 = startTag23.isDoctype();
        org.jsoup.parser.Token.Tag tag25 = startTag23.reset();
        java.lang.String str26 = startTag23.normalName;
        java.lang.String str27 = startTag23.normalName();
        boolean boolean28 = startTag23.selfClosing;
        java.lang.String str29 = startTag23.tagName;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag31.nameAttr("EOF", attributes33);
        boolean boolean35 = startTag34.isDoctype();
        org.jsoup.parser.Token.Tag tag36 = startTag34.reset();
        org.jsoup.parser.Token.StartTag startTag37 = tag36.asStartTag();
        org.jsoup.parser.Token.Tag tag38 = tag36.reset();
        org.jsoup.nodes.Attributes attributes39 = tag36.attributes;
        org.jsoup.parser.Token.StartTag startTag40 = startTag23.nameAttr("", attributes39);
        startTag23.normalName = "";
        org.jsoup.parser.Token.EndTag endTag43 = new org.jsoup.parser.Token.EndTag();
        endTag43.appendAttributeValue(' ');
        char[] charArray48 = new char[] { ' ', ' ' };
        endTag43.appendAttributeValue(charArray48);
        org.jsoup.parser.Token.EndTag endTag50 = endTag43.asEndTag();
        char[] charArray56 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag43.appendAttributeValue(charArray56);
        startTag23.appendAttributeValue(charArray56);
        tag17.appendAttributeValue(charArray56);
        tag6.appendAttributeValue(charArray56);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag50);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag3.toString();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag9 = startTag3.name("<<!---->>");
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag3.nameAttr("</starttag>", attributes11);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<EOF>" + "'", str4, "<EOF>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        org.jsoup.parser.Token.Tag tag18 = tag13.name("#");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        boolean boolean8 = doctype6.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype9 = doctype6.asDoctype();
        java.lang.String str10 = doctype9.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        boolean boolean17 = startTag16.isDoctype();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag16.nameAttr("", attributes19);
        org.jsoup.parser.Token.Tag tag21 = startTag20.reset();
        org.jsoup.parser.Token.Tag tag22 = startTag20.reset();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag24.nameAttr("EOF", attributes26);
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag24.nameAttr("EOF", attributes29);
        java.lang.String str31 = startTag24.normalName();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = startTag32.nameAttr("EOF", attributes34);
        boolean boolean36 = startTag35.isDoctype();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag35.nameAttr("", attributes38);
        org.jsoup.parser.Token.TokenType tokenType40 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag35.type = tokenType40;
        startTag24.type = tokenType40;
        org.jsoup.parser.Token.Tag tag43 = startTag24.reset();
        org.jsoup.nodes.Attributes attributes44 = startTag24.attributes;
        org.jsoup.parser.Token.StartTag startTag45 = startTag20.nameAttr("</hi!#>", attributes44);
        startTag20.selfClosing = false;
        startTag20.newAttribute();
        startTag20.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes53 = null;
        org.jsoup.parser.Token.StartTag startTag54 = startTag51.nameAttr("EOF", attributes53);
        boolean boolean55 = startTag54.isDoctype();
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = startTag54.nameAttr("", attributes57);
        boolean boolean59 = startTag58.isSelfClosing();
        org.jsoup.parser.Token token60 = startTag58.reset();
        org.jsoup.nodes.Attributes attributes61 = startTag58.attributes;
        org.jsoup.parser.Token.StartTag startTag62 = startTag20.nameAttr("<<!---->>", attributes61);
        org.jsoup.parser.Token.StartTag startTag63 = startTag7.nameAttr("</StartTag>", attributes61);
        org.jsoup.parser.Token token64 = startTag63.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "eof" + "'", str31, "eof");
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + tokenType40 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType40.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(token60);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertNotNull(token64);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag3.toString();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("EOF", attributes8);
        java.lang.String str10 = startTag9.toString();
        org.jsoup.parser.Token.Tag tag11 = startTag9.reset();
        org.jsoup.nodes.Attributes attributes12 = startTag9.getAttributes();
        org.jsoup.parser.Token.StartTag startTag13 = startTag3.nameAttr("starttag", attributes12);
        java.lang.String str14 = startTag3.toString();
        boolean boolean15 = startTag3.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<EOF>" + "'", str4, "<EOF>");
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<EOF>" + "'", str10, "<EOF>");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<starttag>" + "'", str14, "<starttag>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        doctype0.pubSysKey = "";
        org.jsoup.parser.Token token9 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.newAttribute();
        startTag7.appendAttributeName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        tag8.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.parser.Token.Tag tag10 = startTag6.reset();
        org.jsoup.parser.Token.StartTag startTag11 = tag10.asStartTag();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag13.nameAttr("EOF", attributes18);
        java.lang.String str20 = startTag13.normalName();
        java.lang.String str21 = startTag13.tokenType();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag23.nameAttr("EOF", attributes28);
        startTag29.selfClosing = false;
        java.lang.String str32 = startTag29.tokenType();
        startTag29.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.Tag tag35 = startTag29.reset();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = startTag37.nameAttr("EOF", attributes39);
        boolean boolean41 = startTag40.isDoctype();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = startTag40.nameAttr("", attributes43);
        org.jsoup.parser.Token.Tag tag45 = startTag44.reset();
        startTag44.appendTagName('4');
        org.jsoup.parser.Token.EndTag endTag49 = new org.jsoup.parser.Token.EndTag();
        boolean boolean50 = endTag49.isSelfClosing();
        endTag49.normalName = "";
        endTag49.finaliseTag();
        boolean boolean54 = endTag49.selfClosing;
        endTag49.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes59 = null;
        org.jsoup.parser.Token.StartTag startTag60 = startTag57.nameAttr("EOF", attributes59);
        org.jsoup.nodes.Attributes attributes62 = null;
        org.jsoup.parser.Token.StartTag startTag63 = startTag57.nameAttr("EOF", attributes62);
        java.lang.String str64 = startTag57.normalName();
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = startTag65.nameAttr("EOF", attributes67);
        boolean boolean69 = startTag68.isDoctype();
        org.jsoup.nodes.Attributes attributes71 = null;
        org.jsoup.parser.Token.StartTag startTag72 = startTag68.nameAttr("", attributes71);
        org.jsoup.parser.Token.TokenType tokenType73 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag68.type = tokenType73;
        startTag57.type = tokenType73;
        endTag49.type = tokenType73;
        org.jsoup.parser.Token.StartTag startTag77 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes79 = null;
        org.jsoup.parser.Token.StartTag startTag80 = startTag77.nameAttr("EOF", attributes79);
        boolean boolean81 = startTag80.isDoctype();
        org.jsoup.parser.Token.EndTag endTag83 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag84 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes86 = null;
        org.jsoup.parser.Token.StartTag startTag87 = startTag84.nameAttr("EOF", attributes86);
        boolean boolean88 = startTag87.isDoctype();
        org.jsoup.parser.Token.Tag tag89 = startTag87.reset();
        startTag87.newAttribute();
        org.jsoup.nodes.Attributes attributes91 = startTag87.attributes;
        endTag83.attributes = attributes91;
        org.jsoup.parser.Token.StartTag startTag93 = startTag80.nameAttr("eof", attributes91);
        endTag49.attributes = attributes91;
        org.jsoup.parser.Token.StartTag startTag95 = startTag44.nameAttr("EOF", attributes91);
        org.jsoup.parser.Token.StartTag startTag96 = startTag29.nameAttr("</ >", attributes91);
        org.jsoup.parser.Token.StartTag startTag97 = startTag13.nameAttr("", attributes91);
        org.jsoup.parser.Token.StartTag startTag98 = startTag11.nameAttr("<hi!>", attributes91);
        startTag98.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eof" + "'", str20, "eof");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "StartTag" + "'", str21, "StartTag");
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "StartTag" + "'", str32, "StartTag");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "eof" + "'", str64, "eof");
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(startTag72);
        org.junit.Assert.assertTrue("'" + tokenType73 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType73.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(startTag87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(tag89);
        org.junit.Assert.assertNotNull(attributes91);
        org.junit.Assert.assertNotNull(startTag93);
        org.junit.Assert.assertNotNull(startTag95);
        org.junit.Assert.assertNotNull(startTag96);
        org.junit.Assert.assertNotNull(startTag97);
        org.junit.Assert.assertNotNull(startTag98);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        doctype0.pubSysKey = "#";
        boolean boolean10 = doctype0.isComment();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        org.jsoup.nodes.Attributes attributes8 = endTag0.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType9 = endTag0.type;
        boolean boolean10 = endTag0.isEndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeValue("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.toString();
        java.lang.String str9 = comment0.getData();
        comment0.bogus = false;
        boolean boolean12 = comment0.isComment();
        org.jsoup.parser.Token token13 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        endTag0.normalName = "Character";
        org.jsoup.parser.Token.Tag tag11 = endTag0.name("<!---->");
        org.jsoup.parser.Token token12 = tag11.reset();
        boolean boolean13 = tag11.isComment();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.appendAttributeName(' ');
        java.lang.String str15 = tag10.tokenType();
        boolean boolean16 = tag10.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EndTag" + "'", str15, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        java.lang.String str9 = endTag0.normalName;
        endTag0.normalName = "hi!";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag0.isComment();
        boolean boolean5 = startTag0.isDoctype();
        startTag0.appendAttributeName("hi!#");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        tag13.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        boolean boolean2 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        java.lang.String str12 = comment0.getData();
        java.lang.StringBuilder stringBuilder13 = comment0.data;
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        java.lang.String str2 = endTag0.tagName;
        endTag0.appendTagName('#');
        java.lang.String str5 = endTag0.tokenType();
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag7.selfClosing = true;
        org.jsoup.parser.Token.Tag tag17 = endTag7.name("hi!");
        boolean boolean18 = endTag7.isStartTag();
        endTag7.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag();
        endTag21.appendAttributeValue(' ');
        endTag21.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        endTag26.appendAttributeValue(' ');
        char[] charArray31 = new char[] { ' ', ' ' };
        endTag26.appendAttributeValue(charArray31);
        endTag26.selfClosing = true;
        org.jsoup.parser.Token.Tag tag36 = endTag26.name("hi!");
        endTag26.appendAttributeName('a');
        int[] intArray43 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag26.appendAttributeValue(intArray43);
        endTag21.appendAttributeValue(intArray43);
        endTag7.appendAttributeValue(intArray43);
        org.jsoup.parser.Token token47 = endTag7.reset();
        java.lang.String str48 = endTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes51 = null;
        org.jsoup.parser.Token.StartTag startTag52 = startTag49.nameAttr("EOF", attributes51);
        boolean boolean53 = startTag52.isDoctype();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag52.nameAttr("", attributes55);
        org.jsoup.parser.Token.Tag tag57 = startTag56.reset();
        org.jsoup.parser.Token.EndTag endTag58 = new org.jsoup.parser.Token.EndTag();
        boolean boolean59 = endTag58.isSelfClosing();
        endTag58.normalName = "";
        java.lang.String str62 = endTag58.normalName();
        char[] charArray65 = new char[] { 'a', 'a' };
        endTag58.appendAttributeValue(charArray65);
        tag57.appendAttributeValue(charArray65);
        endTag7.appendAttributeValue(charArray65);
        endTag0.appendAttributeValue(charArray65);
        endTag0.tagName = "<</hi!>>";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { 'a', 'a' });
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.Tag tag17 = startTag15.reset();
        org.jsoup.parser.Token.StartTag startTag18 = tag17.asStartTag();
        org.jsoup.parser.Token.Tag tag19 = tag17.reset();
        org.jsoup.nodes.Attributes attributes20 = tag17.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = startTag10.nameAttr("starttag", attributes20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.isDoctype();
        org.jsoup.parser.Token.Tag tag27 = startTag25.reset();
        org.jsoup.parser.Token.Tag tag28 = tag27.reset();
        tag28.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag30 = tag28.asStartTag();
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.appendAttributeValue(' ');
        char[] charArray36 = new char[] { ' ', ' ' };
        endTag31.appendAttributeValue(charArray36);
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.appendAttributeValue(' ');
        char[] charArray43 = new char[] { ' ', ' ' };
        endTag38.appendAttributeValue(charArray43);
        endTag31.appendAttributeValue(charArray43);
        tag28.appendAttributeValue(charArray43);
        startTag21.appendAttributeValue(charArray43);
        endTag0.appendAttributeValue(charArray43);
        boolean boolean49 = endTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.newAttribute();
        boolean boolean6 = endTag0.isCharacter();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.parser.Token.Tag tag12 = startTag10.reset();
        org.jsoup.parser.Token.StartTag startTag13 = tag12.asStartTag();
        startTag13.selfClosing = false;
        org.jsoup.parser.Token.Tag tag16 = startTag13.reset();
        org.jsoup.parser.Token.Tag tag17 = startTag13.reset();
        startTag13.appendTagName('a');
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(' ');
        char[] charArray25 = new char[] { ' ', ' ' };
        endTag20.appendAttributeValue(charArray25);
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        endTag27.appendAttributeValue(' ');
        char[] charArray32 = new char[] { ' ', ' ' };
        endTag27.appendAttributeValue(charArray32);
        endTag20.appendAttributeValue(charArray32);
        startTag13.appendAttributeValue(charArray32);
        endTag0.appendAttributeValue(charArray32);
        java.lang.String str37 = endTag0.tagName;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        endTag0.appendAttributeValue("eof");
        endTag0.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        endTag0.newAttribute();
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
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        org.jsoup.parser.Token.Character character11 = character0.data("Doctype");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        boolean boolean32 = startTag30.isEndTag();
        boolean boolean33 = startTag30.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.forceQuirks;
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder10);
        org.jsoup.parser.Token.reset(stringBuilder10);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.finaliseTag();
        tag10.normalName = "</4>";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        int[] intArray4 = new int[] { (short) 1 };
        endTag0.appendAttributeValue(intArray4);
        endTag0.tagName = "<!---->";
        endTag0.finaliseTag();
        endTag0.appendAttributeValue("</4>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        startTag0.appendAttributeName("<!---->4");
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
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(doctype11);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag8.nameAttr("EOF", attributes10);
        boolean boolean12 = startTag11.isDoctype();
        org.jsoup.parser.Token.Tag tag13 = startTag11.reset();
        org.jsoup.parser.Token.StartTag startTag14 = tag13.asStartTag();
        org.jsoup.parser.Token.Tag tag15 = tag13.reset();
        boolean boolean16 = tag13.selfClosing;
        java.lang.String str17 = tag13.normalName;
        boolean boolean18 = tag13.isStartTag();
        boolean boolean19 = tag13.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType20 = tag13.type;
        doctype0.type = tokenType20;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        endTag0.appendTagName('#');
        boolean boolean11 = endTag0.isEndTag();
        boolean boolean12 = endTag0.isEOF();
        org.jsoup.parser.Token.Tag tag13 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        startTag6.appendTagName("<eof>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType9 = endTag0.type;
        boolean boolean10 = endTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        boolean boolean13 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.String str9 = doctype0.getName();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        boolean boolean11 = startTag3.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str12 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        startTag7.newAttribute();
        startTag7.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes40 = null;
        org.jsoup.parser.Token.StartTag startTag41 = startTag38.nameAttr("EOF", attributes40);
        boolean boolean42 = startTag41.isDoctype();
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = startTag41.nameAttr("", attributes44);
        boolean boolean46 = startTag45.isSelfClosing();
        org.jsoup.parser.Token token47 = startTag45.reset();
        org.jsoup.nodes.Attributes attributes48 = startTag45.attributes;
        org.jsoup.parser.Token.StartTag startTag49 = startTag7.nameAttr("<<!---->>", attributes48);
        java.lang.String str50 = startTag7.tagName;
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
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(token47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<<!---->>" + "'", str50, "<<!---->>");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment18 = startTag3.asComment();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(startTag17);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = startTag56.nameAttr("EOF", attributes58);
        org.jsoup.nodes.Attributes attributes61 = null;
        org.jsoup.parser.Token.StartTag startTag62 = startTag56.nameAttr("EOF", attributes61);
        startTag62.selfClosing = false;
        java.lang.String str65 = startTag62.tokenType();
        startTag62.appendAttributeValue("StartTag");
        org.jsoup.parser.Token.Tag tag68 = startTag62.reset();
        tag68.setEmptyAttributeValue();
        org.jsoup.parser.Token.TokenType tokenType70 = org.jsoup.parser.Token.TokenType.Doctype;
        tag68.type = tokenType70;
        endTag0.type = tokenType70;
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
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "StartTag" + "'", str65, "StartTag");
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertTrue("'" + tokenType70 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType70.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = tag10.isEndTag();
        org.jsoup.parser.Token token12 = tag10.reset();
        tag10.tagName = "<#>";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        java.lang.String str44 = startTag7.tokenType();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "StartTag" + "'", str44, "StartTag");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag();
        endTag45.appendAttributeValue(' ');
        char[] charArray50 = new char[] { ' ', ' ' };
        endTag45.appendAttributeValue(charArray50);
        startTag43.appendAttributeValue(charArray50);
        java.lang.String str53 = startTag43.toString();
        org.jsoup.nodes.Attributes attributes54 = startTag43.attributes;
        startTag43.appendAttributeValue('a');
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
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<starttag>" + "'", str53, "<starttag>");
        org.junit.Assert.assertNotNull(attributes54);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        endTag0.normalName = "eof";
        endTag0.appendAttributeName("<starttag>");
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        java.lang.String str39 = startTag3.normalName;
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        org.jsoup.parser.Token.StartTag startTag13 = tag8.asStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(startTag13);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        tag6.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag3.type = tokenType8;
        org.jsoup.nodes.Attributes attributes10 = startTag3.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType11 = startTag3.type;
        boolean boolean12 = startTag3.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype13 = startTag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        java.lang.String str15 = doctype0.getPubSysKey();
        java.lang.String str16 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eof" + "'", str12, "eof");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "eof" + "'", str14, "eof");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eof" + "'", str15, "eof");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "eof" + "'", str16, "eof");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token token8 = character0.reset();
        org.jsoup.parser.Token token9 = character0.reset();
        java.lang.String str10 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        startTag7.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag13 = startTag7.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        boolean boolean11 = startTag3.selfClosing;
        startTag3.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token7 = doctype0.reset();
        org.jsoup.parser.Token token8 = doctype0.reset();
        boolean boolean9 = doctype0.isStartTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("</ >");
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</ >" + "'", str5, "</ >");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</ >" + "'", str6, "</ >");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        boolean boolean13 = tag12.selfClosing;
        org.jsoup.nodes.Attributes attributes14 = tag12.getAttributes();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag15.nameAttr("EOF", attributes17);
        boolean boolean19 = startTag18.isDoctype();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag18.nameAttr("", attributes21);
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag18.type = tokenType23;
        org.jsoup.nodes.Attributes attributes25 = startTag18.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType26 = startTag18.type;
        tag12.type = tokenType26;
        org.jsoup.nodes.Attributes attributes28 = tag12.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes25);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes28);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        boolean boolean12 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.String str15 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder16 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        java.lang.String str12 = comment0.getData();
        java.lang.String str13 = comment0.toString();
        java.lang.String str14 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str7 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str10 = doctype0.getPubSysKey();
        java.lang.String str11 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        java.lang.String str13 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        boolean boolean10 = tag9.isCharacter();
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        endTag11.appendAttributeValue(' ');
        char[] charArray16 = new char[] { ' ', ' ' };
        endTag11.appendAttributeValue(charArray16);
        endTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag21 = endTag11.name("hi!");
        endTag11.appendAttributeName('a');
        boolean boolean24 = endTag11.selfClosing;
        boolean boolean25 = endTag11.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType26 = null;
        endTag11.type = tokenType26;
        org.jsoup.parser.Token token28 = endTag11.reset();
        org.jsoup.nodes.Attributes attributes29 = endTag11.getAttributes();
        endTag11.appendAttributeName("<!---->4");
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        endTag32.appendAttributeValue(' ');
        char[] charArray37 = new char[] { ' ', ' ' };
        endTag32.appendAttributeValue(charArray37);
        endTag32.selfClosing = true;
        org.jsoup.parser.Token.Tag tag42 = endTag32.name("hi!");
        boolean boolean43 = endTag32.isStartTag();
        endTag32.selfClosing = true;
        endTag32.appendTagName('4');
        org.jsoup.parser.Token.Tag tag48 = endTag32.reset();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes51 = null;
        org.jsoup.parser.Token.StartTag startTag52 = startTag49.nameAttr("EOF", attributes51);
        boolean boolean53 = startTag52.isDoctype();
        org.jsoup.parser.Token.Tag tag54 = startTag52.reset();
        java.lang.String str55 = startTag52.normalName;
        java.lang.String str56 = startTag52.normalName();
        boolean boolean57 = startTag52.selfClosing;
        org.jsoup.parser.Token.EndTag endTag58 = new org.jsoup.parser.Token.EndTag();
        endTag58.appendAttributeValue(' ');
        char[] charArray63 = new char[] { ' ', ' ' };
        endTag58.appendAttributeValue(charArray63);
        endTag58.selfClosing = true;
        org.jsoup.parser.Token.Tag tag68 = endTag58.name("hi!");
        boolean boolean69 = endTag58.isStartTag();
        endTag58.selfClosing = true;
        endTag58.appendAttributeName("EOF");
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes76 = null;
        org.jsoup.parser.Token.StartTag startTag77 = startTag74.nameAttr("EOF", attributes76);
        boolean boolean78 = startTag77.isDoctype();
        org.jsoup.nodes.Attributes attributes80 = null;
        org.jsoup.parser.Token.StartTag startTag81 = startTag77.nameAttr("", attributes80);
        org.jsoup.parser.Token.Tag tag82 = startTag81.reset();
        org.jsoup.parser.Token.EndTag endTag83 = new org.jsoup.parser.Token.EndTag();
        boolean boolean84 = endTag83.isSelfClosing();
        endTag83.normalName = "";
        java.lang.String str87 = endTag83.normalName();
        char[] charArray90 = new char[] { 'a', 'a' };
        endTag83.appendAttributeValue(charArray90);
        startTag81.appendAttributeValue(charArray90);
        endTag58.appendAttributeValue(charArray90);
        startTag52.appendAttributeValue(charArray90);
        endTag32.appendAttributeValue(charArray90);
        endTag11.appendAttributeValue(charArray90);
        tag9.appendAttributeValue(charArray90);
        org.jsoup.parser.Token.Tag tag98 = tag9.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(token28);
        org.junit.Assert.assertNull(attributes29);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(startTag81);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertArrayEquals(charArray90, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(tag98);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag4.nameAttr("EOF", attributes6);
        boolean boolean8 = startTag7.isDoctype();
        org.jsoup.parser.Token.Tag tag9 = startTag7.reset();
        java.lang.String str10 = startTag7.normalName;
        java.lang.String str11 = startTag7.normalName();
        startTag7.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag13 = startTag7.reset();
        startTag7.setEmptyAttributeValue();
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.Character;
        startTag7.type = tokenType15;
        token3.type = tokenType15;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag18 = token3.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes51 = null;
        org.jsoup.parser.Token.StartTag startTag52 = startTag49.nameAttr("EOF", attributes51);
        boolean boolean53 = startTag52.isDoctype();
        org.jsoup.parser.Token.EndTag endTag55 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = startTag56.nameAttr("EOF", attributes58);
        boolean boolean60 = startTag59.isDoctype();
        org.jsoup.parser.Token.Tag tag61 = startTag59.reset();
        startTag59.newAttribute();
        org.jsoup.nodes.Attributes attributes63 = startTag59.attributes;
        endTag55.attributes = attributes63;
        org.jsoup.parser.Token.StartTag startTag65 = startTag52.nameAttr("eof", attributes63);
        endTag21.attributes = attributes63;
        boolean boolean67 = endTag21.isEOF();
        org.jsoup.nodes.Attributes attributes68 = endTag21.attributes;
        endTag13.attributes = attributes68;
        boolean boolean70 = endTag13.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "eof" + "'", str36, "eof");
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        boolean boolean7 = startTag3.isComment();
        startTag3.normalName = "<#>";
        org.jsoup.nodes.Attributes attributes10 = startTag3.attributes;
        org.jsoup.parser.Token.Tag tag11 = startTag3.reset();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        doctype12.pubSysKey = "";
        boolean boolean15 = doctype12.isEOF();
        java.lang.String str16 = doctype12.getPubSysKey();
        java.lang.String str17 = doctype12.getPublicIdentifier();
        doctype12.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype12.type = tokenType20;
        tag11.type = tokenType20;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        comment0.bogus = false;
        comment0.bogus = true;
        boolean boolean12 = comment0.isStartTag();
        boolean boolean13 = comment0.isEOF();
        java.lang.String str14 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.Tag tag88 = startTag0.name("comment");
        org.jsoup.nodes.Attributes attributes89 = tag88.getAttributes();
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
        org.junit.Assert.assertNotNull(tag88);
        org.junit.Assert.assertNotNull(attributes89);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        boolean boolean12 = doctype0.isComment();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.pubSysKey;
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag5 = endTag0.name("<!---->4");
        endTag0.newAttribute();
        boolean boolean7 = endTag0.isCharacter();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        boolean boolean10 = doctype0.forceQuirks;
        java.lang.String str11 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder12 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        boolean boolean7 = doctype0.isEndTag();
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        boolean boolean10 = doctype0.isDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.Class<?> wildcardClass6 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        boolean boolean13 = tag12.isComment();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("hi!#");
        java.lang.String str7 = character6.getData();
        org.jsoup.parser.Token.Character character9 = character6.data("hi!#");
        org.jsoup.parser.Token token10 = character6.reset();
        org.jsoup.parser.Token.Character character12 = character6.data("<<<hi!>>>");
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!#" + "'", str7, "hi!#");
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(character12);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        endTag0.tagName = "hi!";
        endTag0.finaliseTag();
        java.lang.String str11 = endTag0.normalName();
        endTag0.tagName = "hi! ";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        startTag14.normalName = "a";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment17 = startTag14.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        startTag7.appendAttributeName("<<hi!>>");
        org.jsoup.parser.Token.StartTag startTag17 = startTag7.asStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(startTag17);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        java.lang.String str14 = doctype0.getPublicIdentifier();
        java.lang.String str15 = doctype0.pubSysKey;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeName('#');
        endTag0.selfClosing = true;
        java.lang.String str8 = endTag0.tokenType();
        endTag0.normalName = "<eof>";
        java.lang.String str11 = endTag0.normalName;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EndTag" + "'", str8, "EndTag");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<eof>" + "'", str11, "<eof>");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.appendTagName("eof");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = startTag7.nameAttr("EOF", attributes9);
        boolean boolean11 = startTag10.isDoctype();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag10.nameAttr("", attributes13);
        boolean boolean15 = startTag14.isSelfClosing();
        java.lang.String str16 = startTag14.tagName;
        boolean boolean17 = startTag14.isEndTag();
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
        org.jsoup.parser.Token.StartTag startTag50 = startTag14.nameAttr("starttag", attributes45);
        boolean boolean51 = startTag50.selfClosing;
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag();
        endTag52.appendAttributeValue(' ');
        char[] charArray57 = new char[] { ' ', ' ' };
        endTag52.appendAttributeValue(charArray57);
        startTag50.appendAttributeValue(charArray57);
        endTag0.appendAttributeValue(charArray57);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { ' ', ' ' });
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        endTag0.appendAttributeValue("<starttag>");
        boolean boolean22 = endTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        startTag0.newAttribute();
        boolean boolean9 = startTag0.isStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder12 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        java.lang.String str9 = character0.getData();
        java.lang.String str10 = character0.tokenType();
        org.jsoup.parser.Token token11 = character0.reset();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        org.jsoup.parser.Token.EndTag endTag56 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype57 = endTag56.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(endTag56);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag15 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        int[] intArray8 = new int[] { 10, 100, ' ' };
        endTag0.appendAttributeValue(intArray8);
        org.jsoup.nodes.Attributes attributes10 = endTag0.getAttributes();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 10, 100, 32 });
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        java.lang.String str4 = comment0.toString();
        comment0.bogus = false;
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        java.lang.StringBuilder stringBuilder26 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder26);
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
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag12 = character11.asStartTag();
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
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag15.nameAttr("EOF", attributes17);
        boolean boolean19 = startTag18.isDoctype();
        org.jsoup.parser.Token.Tag tag20 = startTag18.reset();
        java.lang.String str21 = startTag18.normalName;
        java.lang.String str22 = startTag18.normalName();
        boolean boolean23 = startTag18.selfClosing;
        java.lang.String str24 = startTag18.tagName;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        org.jsoup.parser.Token.StartTag startTag32 = tag31.asStartTag();
        org.jsoup.parser.Token.Tag tag33 = tag31.reset();
        org.jsoup.nodes.Attributes attributes34 = tag31.attributes;
        org.jsoup.parser.Token.StartTag startTag35 = startTag18.nameAttr("", attributes34);
        startTag18.normalName = "";
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.appendAttributeValue(' ');
        char[] charArray43 = new char[] { ' ', ' ' };
        endTag38.appendAttributeValue(charArray43);
        org.jsoup.parser.Token.EndTag endTag45 = endTag38.asEndTag();
        char[] charArray51 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag38.appendAttributeValue(charArray51);
        startTag18.appendAttributeValue(charArray51);
        endTag0.appendAttributeValue(charArray51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag45);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        java.lang.String str9 = endTag0.tagName;
        org.jsoup.parser.Token.Tag tag10 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = tag10.name("Doctype");
        tag12.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character14 = tag12.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag3.toString();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.nodes.Attributes attributes6 = startTag3.getAttributes();
        org.jsoup.parser.Token.Tag tag7 = startTag3.reset();
        boolean boolean8 = tag7.isCharacter();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<EOF>" + "'", str4, "<EOF>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.finaliseTag();
        endTag0.finaliseTag();
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag9 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag11 = endTag9.name("starttag");
        endTag9.setEmptyAttributeValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(endTag9);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        boolean boolean13 = doctype0.isEOF();
        doctype0.pubSysKey = "<<EOF>>";
        java.lang.Class<?> wildcardClass16 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        java.lang.String str33 = endTag0.tagName;
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        boolean boolean40 = startTag39.isDoctype();
        org.jsoup.parser.Token.Tag tag41 = startTag39.reset();
        org.jsoup.parser.Token.StartTag startTag42 = tag41.asStartTag();
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        endTag44.finaliseTag();
        endTag44.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = startTag48.nameAttr("EOF", attributes50);
        boolean boolean52 = startTag51.isDoctype();
        org.jsoup.parser.Token.EndTag endTag54 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = startTag55.nameAttr("EOF", attributes57);
        boolean boolean59 = startTag58.isDoctype();
        org.jsoup.parser.Token.Tag tag60 = startTag58.reset();
        startTag58.newAttribute();
        org.jsoup.nodes.Attributes attributes62 = startTag58.attributes;
        endTag54.attributes = attributes62;
        org.jsoup.parser.Token.StartTag startTag64 = startTag51.nameAttr("eof", attributes62);
        endTag44.attributes = attributes62;
        org.jsoup.parser.Token.StartTag startTag66 = startTag42.nameAttr("<!---->", attributes62);
        java.lang.String str67 = startTag66.tokenType();
        startTag66.appendAttributeValue("Comment");
        java.lang.String str70 = startTag66.name();
        java.lang.String str71 = startTag66.toString();
        org.jsoup.nodes.Attributes attributes72 = startTag66.attributes;
        tag35.attributes = attributes72;
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
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "StartTag" + "'", str67, "StartTag");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<!---->" + "'", str70, "<!---->");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "<<!---->>" + "'", str71, "<<!---->>");
        org.junit.Assert.assertNotNull(attributes72);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        endTag0.tagName = "hi!";
        endTag0.finaliseTag();
        boolean boolean11 = endTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        int[] intArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertNull(attributes19);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        endTag0.appendAttributeName('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token17);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        startTag3.finaliseTag();
        startTag3.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        endTag0.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        org.jsoup.parser.Token.Tag tag43 = endTag0.name("");
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        endTag44.appendAttributeValue(' ');
        org.jsoup.parser.Token.TokenType tokenType47 = endTag44.type;
        tag43.type = tokenType47;
        java.lang.String str49 = tag43.normalName();
        org.jsoup.parser.Token.EndTag endTag50 = tag43.asEndTag();
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
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + tokenType47 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType47.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(endTag50);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        tag9.appendTagName("EndTag");
        java.lang.String str12 = tag9.name();
        tag9.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EndTag" + "'", str12, "EndTag");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        java.lang.String str4 = endTag0.toString();
        boolean boolean5 = endTag0.isStartTag();
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</</hi!>>" + "'", str4, "</</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.TokenType tokenType6 = endTag0.type;
        endTag0.tagName = "Doctype";
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag9.nameAttr("EOF", attributes11);
        boolean boolean13 = startTag12.isDoctype();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag12.nameAttr("", attributes15);
        org.jsoup.parser.Token.Tag tag17 = startTag16.reset();
        startTag16.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        endTag0.attributes = attributes20;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        boolean boolean6 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag0.tagName = "<starttag>";
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("EOF", attributes8);
        boolean boolean10 = startTag9.isDoctype();
        startTag9.tagName = "<!---->";
        java.lang.String str13 = startTag9.tagName;
        boolean boolean14 = startTag9.isEOF();
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        endTag15.appendAttributeValue(' ');
        char[] charArray20 = new char[] { ' ', ' ' };
        endTag15.appendAttributeValue(charArray20);
        endTag15.selfClosing = true;
        org.jsoup.parser.Token.Tag tag25 = endTag15.name("hi!");
        tag25.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag28 = tag25.asEndTag();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.finaliseTag();
        boolean boolean31 = endTag29.isCharacter();
        int[] intArray33 = new int[] { (short) 1 };
        endTag29.appendAttributeValue(intArray33);
        endTag28.appendAttributeValue(intArray33);
        startTag9.appendAttributeValue(intArray33);
        startTag0.appendAttributeValue(intArray33);
        java.lang.Class<?> wildcardClass38 = intArray33.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(endTag28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        java.lang.String str35 = startTag3.tagName;
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EndTag" + "'", str35, "EndTag");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag8 = tag6.asStartTag();
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.appendAttributeValue(' ');
        char[] charArray14 = new char[] { ' ', ' ' };
        endTag9.appendAttributeValue(charArray14);
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        endTag16.appendAttributeValue(' ');
        char[] charArray21 = new char[] { ' ', ' ' };
        endTag16.appendAttributeValue(charArray21);
        endTag9.appendAttributeValue(charArray21);
        tag6.appendAttributeValue(charArray21);
        tag6.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes26 = tag6.attributes;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = true;
        java.lang.String str6 = comment0.toString();
        boolean boolean7 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        endTag13.appendAttributeName("hi!#");
        boolean boolean80 = endTag13.isSelfClosing();
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
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        startTag3.appendAttributeValue("<</hi!>>");
        startTag3.appendAttributeValue('a');
        startTag3.newAttribute();
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        endTag42.appendAttributeValue(' ');
        char[] charArray47 = new char[] { ' ', ' ' };
        endTag42.appendAttributeValue(charArray47);
        org.jsoup.parser.Token.TokenType tokenType49 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag42.type = tokenType49;
        org.jsoup.parser.Token.Tag tag52 = endTag42.name("eof");
        java.lang.String str53 = tag52.name();
        java.lang.String str54 = tag52.tagName;
        org.jsoup.parser.Token.EndTag endTag55 = new org.jsoup.parser.Token.EndTag();
        endTag55.appendAttributeValue(' ');
        char[] charArray60 = new char[] { ' ', ' ' };
        endTag55.appendAttributeValue(charArray60);
        org.jsoup.parser.Token.EndTag endTag62 = new org.jsoup.parser.Token.EndTag();
        endTag62.appendAttributeValue(' ');
        char[] charArray67 = new char[] { ' ', ' ' };
        endTag62.appendAttributeValue(charArray67);
        endTag55.appendAttributeValue(charArray67);
        endTag55.tagName = "eof";
        java.lang.String str72 = endTag55.name();
        org.jsoup.parser.Token.EndTag endTag73 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes76 = null;
        org.jsoup.parser.Token.StartTag startTag77 = startTag74.nameAttr("EOF", attributes76);
        boolean boolean78 = startTag77.isDoctype();
        org.jsoup.parser.Token.Tag tag79 = startTag77.reset();
        startTag77.newAttribute();
        org.jsoup.nodes.Attributes attributes81 = startTag77.attributes;
        endTag73.attributes = attributes81;
        endTag55.attributes = attributes81;
        tag52.attributes = attributes81;
        org.jsoup.parser.Token.StartTag startTag85 = startTag3.nameAttr("</</hi!>>", attributes81);
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
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "eof" + "'", str53, "eof");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "eof" + "'", str54, "eof");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "eof" + "'", str72, "eof");
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(attributes81);
        org.junit.Assert.assertNotNull(startTag85);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        tag10.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        endTag0.appendAttributeValue('#');
        java.lang.String str7 = endTag0.toString();
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</</hi!>>" + "'", str7, "</</hi!>>");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        endTag7.selfClosing = true;
        org.jsoup.parser.Token.Tag tag17 = endTag7.name("hi!");
        boolean boolean18 = endTag7.isStartTag();
        endTag7.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag();
        endTag21.appendAttributeValue(' ');
        endTag21.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        endTag26.appendAttributeValue(' ');
        char[] charArray31 = new char[] { ' ', ' ' };
        endTag26.appendAttributeValue(charArray31);
        endTag26.selfClosing = true;
        org.jsoup.parser.Token.Tag tag36 = endTag26.name("hi!");
        endTag26.appendAttributeName('a');
        int[] intArray43 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag26.appendAttributeValue(intArray43);
        endTag21.appendAttributeValue(intArray43);
        endTag7.appendAttributeValue(intArray43);
        org.jsoup.parser.Token token47 = endTag7.reset();
        java.lang.String str48 = endTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes51 = null;
        org.jsoup.parser.Token.StartTag startTag52 = startTag49.nameAttr("EOF", attributes51);
        boolean boolean53 = startTag52.isDoctype();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag52.nameAttr("", attributes55);
        org.jsoup.parser.Token.Tag tag57 = startTag56.reset();
        org.jsoup.parser.Token.EndTag endTag58 = new org.jsoup.parser.Token.EndTag();
        boolean boolean59 = endTag58.isSelfClosing();
        endTag58.normalName = "";
        java.lang.String str62 = endTag58.normalName();
        char[] charArray65 = new char[] { 'a', 'a' };
        endTag58.appendAttributeValue(charArray65);
        tag57.appendAttributeValue(charArray65);
        endTag7.appendAttributeValue(charArray65);
        endTag0.appendAttributeValue(charArray65);
        boolean boolean70 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag71 = endTag0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(tag71);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.pubSysKey = "< >";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        startTag6.appendTagName("<!---->4");
        java.lang.Class<?> wildcardClass11 = startTag6.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        doctype0.pubSysKey = "</</hi!>>";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.TokenType tokenType3 = endTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = endTag0.type;
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        boolean boolean26 = startTag3.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.appendAttributeValue(' ');
        char[] charArray18 = new char[] { ' ', ' ' };
        endTag13.appendAttributeValue(charArray18);
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.appendAttributeValue(' ');
        char[] charArray25 = new char[] { ' ', ' ' };
        endTag20.appendAttributeValue(charArray25);
        endTag13.appendAttributeValue(charArray25);
        org.jsoup.parser.Token.TokenType tokenType28 = org.jsoup.parser.Token.TokenType.Comment;
        endTag13.type = tokenType28;
        doctype0.type = tokenType28;
        java.lang.StringBuilder stringBuilder31 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.tagName = "hi!";
        tag10.appendTagName("<<hi!>>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token token8 = endTag0.reset();
        endTag0.appendAttributeValue('4');
        java.lang.String str11 = endTag0.normalName();
        endTag0.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        tag10.appendAttributeValue("</<<starttag>>>");
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
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        org.jsoup.parser.Token.Tag tag46 = startTag6.name("<starttag>");
        tag46.appendAttributeValue("4");
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
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Character;
        startTag3.type = tokenType11;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.nameAttr("EOF", attributes16);
        boolean boolean18 = startTag17.isDoctype();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag17.nameAttr("", attributes20);
        boolean boolean22 = startTag21.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag24.nameAttr("EOF", attributes26);
        boolean boolean28 = startTag27.isDoctype();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag27.nameAttr("", attributes30);
        boolean boolean32 = startTag31.isSelfClosing();
        java.lang.String str33 = startTag31.tagName;
        boolean boolean34 = startTag31.isEndTag();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        boolean boolean40 = startTag39.isDoctype();
        org.jsoup.parser.Token.Tag tag41 = startTag39.reset();
        org.jsoup.parser.Token.StartTag startTag42 = tag41.asStartTag();
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        endTag44.finaliseTag();
        endTag44.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = startTag48.nameAttr("EOF", attributes50);
        boolean boolean52 = startTag51.isDoctype();
        org.jsoup.parser.Token.EndTag endTag54 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = startTag55.nameAttr("EOF", attributes57);
        boolean boolean59 = startTag58.isDoctype();
        org.jsoup.parser.Token.Tag tag60 = startTag58.reset();
        startTag58.newAttribute();
        org.jsoup.nodes.Attributes attributes62 = startTag58.attributes;
        endTag54.attributes = attributes62;
        org.jsoup.parser.Token.StartTag startTag64 = startTag51.nameAttr("eof", attributes62);
        endTag44.attributes = attributes62;
        org.jsoup.parser.Token.StartTag startTag66 = startTag42.nameAttr("<!---->", attributes62);
        org.jsoup.parser.Token.StartTag startTag67 = startTag31.nameAttr("starttag", attributes62);
        org.jsoup.parser.Token.StartTag startTag68 = startTag21.nameAttr("EOF", attributes62);
        org.jsoup.parser.Token.StartTag startTag69 = startTag3.nameAttr("</</hi!>>", attributes62);
        startTag69.appendAttributeName("<<!---->>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertNotNull(startTag67);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertNotNull(startTag69);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        boolean boolean7 = endTag0.isDoctype();
        endTag0.tagName = "<hi!>";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        boolean boolean23 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        java.lang.String str18 = startTag3.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "character" + "'", str18, "character");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        java.lang.String str8 = tag3.normalName;
        org.jsoup.parser.Token.Tag tag9 = tag3.reset();
        org.jsoup.parser.Token.EndTag endTag10 = tag9.asEndTag();
        java.lang.String str11 = endTag10.tokenType();
        boolean boolean12 = endTag10.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = endTag10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "starttag" + "'", str8, "starttag");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(endTag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EndTag" + "'", str11, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag12.nameAttr("EOF", attributes17);
        java.lang.String str19 = startTag12.normalName();
        startTag12.newAttribute();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.isDoctype();
        org.jsoup.parser.Token.Tag tag27 = startTag25.reset();
        java.lang.String str28 = startTag25.normalName;
        java.lang.String str29 = startTag25.normalName();
        boolean boolean30 = startTag25.selfClosing;
        java.lang.String str31 = startTag25.tagName;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag33.nameAttr("EOF", attributes35);
        boolean boolean37 = startTag36.isDoctype();
        org.jsoup.parser.Token.Tag tag38 = startTag36.reset();
        org.jsoup.parser.Token.StartTag startTag39 = tag38.asStartTag();
        org.jsoup.parser.Token.Tag tag40 = tag38.reset();
        org.jsoup.nodes.Attributes attributes41 = tag38.attributes;
        org.jsoup.parser.Token.StartTag startTag42 = startTag25.nameAttr("", attributes41);
        org.jsoup.parser.Token.StartTag startTag43 = startTag12.nameAttr("eof", attributes41);
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag46.nameAttr("EOF", attributes48);
        boolean boolean50 = startTag49.isDoctype();
        org.jsoup.parser.Token.Tag tag51 = startTag49.reset();
        startTag49.newAttribute();
        org.jsoup.nodes.Attributes attributes53 = startTag49.attributes;
        endTag45.attributes = attributes53;
        org.jsoup.parser.Token.StartTag startTag55 = startTag43.nameAttr("</StartTag>", attributes53);
        tag10.attributes = attributes53;
        boolean boolean57 = tag10.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "eof" + "'", str19, "eof");
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        boolean boolean13 = tag12.selfClosing;
        org.jsoup.nodes.Attributes attributes14 = tag12.getAttributes();
        tag12.appendTagName('#');
        boolean boolean17 = tag12.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeValue("</ >");
        boolean boolean13 = endTag0.isEOF();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag0.type;
        boolean boolean15 = endTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        tag6.finaliseTag();
        boolean boolean9 = tag6.isStartTag();
        tag6.newAttribute();
        boolean boolean11 = tag6.selfClosing;
        tag6.appendTagName("hi!EndTag");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        tag33.appendAttributeName("eof");
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
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        boolean boolean8 = doctype6.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype9 = doctype6.asDoctype();
        java.lang.String str10 = doctype9.pubSysKey;
        doctype9.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        boolean boolean7 = startTag6.isStartTag();
        startTag6.finaliseTag();
        java.lang.String str9 = startTag6.name();
        startTag6.appendAttributeName("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        java.lang.String str35 = startTag34.toString();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = startTag37.nameAttr("EOF", attributes39);
        boolean boolean41 = startTag40.isDoctype();
        org.jsoup.parser.Token.Tag tag42 = startTag40.reset();
        org.jsoup.parser.Token.Tag tag43 = tag42.reset();
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        endTag44.appendAttributeValue(' ');
        char[] charArray49 = new char[] { ' ', ' ' };
        endTag44.appendAttributeValue(charArray49);
        org.jsoup.parser.Token.Tag tag51 = endTag44.reset();
        org.jsoup.parser.Token token52 = endTag44.reset();
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag53.nameAttr("EOF", attributes55);
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = startTag53.nameAttr("EOF", attributes58);
        java.lang.String str60 = startTag53.normalName();
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes63 = null;
        org.jsoup.parser.Token.StartTag startTag64 = startTag61.nameAttr("EOF", attributes63);
        boolean boolean65 = startTag64.isDoctype();
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = startTag64.nameAttr("", attributes67);
        org.jsoup.parser.Token.TokenType tokenType69 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag64.type = tokenType69;
        startTag53.type = tokenType69;
        org.jsoup.parser.Token.Tag tag72 = startTag53.reset();
        org.jsoup.nodes.Attributes attributes73 = startTag53.attributes;
        org.jsoup.nodes.Attributes attributes74 = startTag53.getAttributes();
        endTag44.attributes = attributes74;
        tag43.attributes = attributes74;
        org.jsoup.parser.Token.StartTag startTag77 = startTag34.nameAttr("4", attributes74);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<</hi!>>" + "'", str35, "<</hi!>>");
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(token52);
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "eof" + "'", str60, "eof");
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertTrue("'" + tokenType69 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType69.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertNotNull(startTag77);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag2 = token1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        org.jsoup.parser.Token token5 = doctype0.reset();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        doctype0.pubSysKey = "</<!---->4>";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        java.lang.Class<?> wildcardClass13 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        tag9.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        java.lang.StringBuilder stringBuilder26 = comment0.data;
        org.jsoup.parser.Token token27 = comment0.reset();
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
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(token27);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        java.lang.String str17 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Doctype" + "'", str17, "Doctype");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.Tag tag10 = tag8.name("<starttag>");
        boolean boolean11 = tag10.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = tag10.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.isDoctype();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        org.jsoup.nodes.Attributes attributes19 = tag18.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(attributes19);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        boolean boolean12 = character11.isComment();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        boolean boolean18 = comment16.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        boolean boolean7 = comment0.isCharacter();
        boolean boolean8 = comment0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        java.lang.String str8 = tag3.normalName;
        tag3.appendTagName("<eof>");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "starttag" + "'", str8, "starttag");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = tag10.isEndTag();
        org.jsoup.parser.Token token12 = tag10.reset();
        tag10.appendAttributeValue("</hi!#>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        boolean boolean18 = startTag3.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getName();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype0.type;
        boolean boolean11 = doctype0.isCharacter();
        java.lang.String str12 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype10 = doctype0.asDoctype();
        doctype0.forceQuirks = false;
        java.lang.String str13 = doctype0.getPublicIdentifier();
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
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        boolean boolean60 = startTag6.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        org.jsoup.parser.Token.Tag tag46 = startTag6.name("<starttag>");
        startTag6.appendTagName("a");
        startTag6.tagName = "</StartTag>";
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
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        boolean boolean9 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType10 = doctype0.type;
        doctype0.pubSysKey = "<starttag>";
        java.lang.String str13 = doctype0.getName();
        java.lang.String str14 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        java.lang.String str4 = startTag3.toString();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("EOF", attributes8);
        java.lang.String str10 = startTag9.toString();
        org.jsoup.parser.Token.Tag tag11 = startTag9.reset();
        org.jsoup.nodes.Attributes attributes12 = startTag9.getAttributes();
        org.jsoup.parser.Token.StartTag startTag13 = startTag3.nameAttr("starttag", attributes12);
        java.lang.String str14 = startTag3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = startTag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<EOF>" + "'", str4, "<EOF>");
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<EOF>" + "'", str10, "<EOF>");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<starttag>" + "'", str14, "<starttag>");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        endTag0.setEmptyAttributeValue();
        boolean boolean3 = endTag0.isCharacter();
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        boolean boolean13 = tag12.selfClosing;
        tag12.tagName = "</</hi!>>";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        org.jsoup.parser.Token token3 = comment0.reset();
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        comment0.bogus = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        boolean boolean7 = comment0.isCharacter();
        java.lang.String str8 = comment0.getData();
        java.lang.String str9 = comment0.toString();
        boolean boolean10 = comment0.isComment();
        java.lang.String str11 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character0.data("<hi!>");
        java.lang.String str9 = character8.toString();
        org.jsoup.parser.Token.Character character11 = character8.data("<EOF>");
        java.lang.String str12 = character11.getData();
        org.jsoup.parser.Token.Character character14 = character11.data("");
        java.lang.String str15 = character14.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<EOF>" + "'", str12, "<EOF>");
        org.junit.Assert.assertNotNull(character14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        java.lang.String str14 = startTag6.name();
        java.lang.String str15 = startTag6.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eof" + "'", str15, "eof");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        org.jsoup.parser.Token token14 = tag10.reset();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        java.lang.StringBuilder stringBuilder8 = doctype6.name;
        doctype6.forceQuirks = true;
        java.lang.String str11 = doctype6.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        char[] charArray5 = new char[] { ' ', '#', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', ' ' });
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character8 = character0.data("<hi!>");
        java.lang.String str9 = character8.toString();
        org.jsoup.parser.Token.Character character11 = character8.data("<EOF>");
        java.lang.String str12 = character11.getData();
        org.jsoup.parser.Token.Character character14 = character11.data("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment15 = character14.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<EOF>" + "'", str12, "<EOF>");
        org.junit.Assert.assertNotNull(character14);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        java.lang.String str30 = endTag0.tokenType();
        endTag0.appendAttributeName('a');
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EndTag" + "'", str30, "EndTag");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        java.lang.String str10 = startTag6.normalName();
        startTag6.finaliseTag();
        org.jsoup.parser.Token.Tag tag13 = startTag6.name("</StartTag>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "eof" + "'", str10, "eof");
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        org.jsoup.nodes.Attributes attributes33 = startTag3.attributes;
        startTag3.appendTagName("<hi!>");
        java.lang.String str36 = startTag3.normalName();
        org.jsoup.parser.Token.Tag tag37 = startTag3.reset();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.appendAttributeValue(' ');
        char[] charArray43 = new char[] { ' ', ' ' };
        endTag38.appendAttributeValue(charArray43);
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag();
        endTag45.appendAttributeValue(' ');
        char[] charArray50 = new char[] { ' ', ' ' };
        endTag45.appendAttributeValue(charArray50);
        endTag38.appendAttributeValue(charArray50);
        endTag38.tagName = "eof";
        org.jsoup.parser.Token token55 = endTag38.reset();
        boolean boolean56 = endTag38.isComment();
        boolean boolean57 = endTag38.isComment();
        boolean boolean58 = endTag38.selfClosing;
        org.jsoup.parser.Token.TokenType tokenType59 = endTag38.type;
        tag37.type = tokenType59;
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
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<hi!>" + "'", str36, "<hi!>");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + tokenType59 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType59.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = startTag48.nameAttr("EOF", attributes50);
        boolean boolean52 = startTag51.isDoctype();
        org.jsoup.parser.Token.Tag tag53 = startTag51.reset();
        java.lang.String str54 = startTag51.normalName;
        java.lang.String str55 = startTag51.normalName();
        boolean boolean56 = startTag51.selfClosing;
        boolean boolean57 = startTag51.isEOF();
        org.jsoup.parser.Token.EndTag endTag59 = new org.jsoup.parser.Token.EndTag();
        endTag59.appendAttributeValue(' ');
        char[] charArray64 = new char[] { ' ', ' ' };
        endTag59.appendAttributeValue(charArray64);
        endTag59.selfClosing = true;
        org.jsoup.parser.Token.Tag tag69 = endTag59.name("hi!");
        tag69.appendAttributeValue("eof");
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes74 = null;
        org.jsoup.parser.Token.StartTag startTag75 = startTag72.nameAttr("EOF", attributes74);
        boolean boolean76 = startTag75.isDoctype();
        org.jsoup.parser.Token.Tag tag77 = startTag75.reset();
        org.jsoup.parser.Token.StartTag startTag78 = tag77.asStartTag();
        org.jsoup.parser.Token.Tag tag79 = tag77.reset();
        org.jsoup.nodes.Attributes attributes80 = tag77.attributes;
        tag69.attributes = attributes80;
        org.jsoup.parser.Token.StartTag startTag82 = startTag51.nameAttr("EndTag", attributes80);
        org.jsoup.parser.Token.StartTag startTag83 = startTag43.nameAttr("</ >", attributes80);
        java.lang.String str84 = startTag83.toString();
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
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(startTag75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(attributes80);
        org.junit.Assert.assertNotNull(startTag82);
        org.junit.Assert.assertNotNull(startTag83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "<</ >>" + "'", str84, "<</ >>");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        tag10.tagName = "EOF";
        tag10.appendAttributeValue("EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag18 = tag10.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        org.jsoup.parser.Token token14 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character15 = token14.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        org.jsoup.nodes.Attributes attributes40 = endTag0.attributes;
        org.jsoup.parser.Token.Tag tag41 = endTag0.reset();
        boolean boolean42 = tag41.isCharacter();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNull(attributes40);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        boolean boolean17 = endTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        java.lang.String str10 = startTag0.toString();
        startTag0.appendAttributeName('a');
        boolean boolean13 = startTag0.isSelfClosing();
        java.lang.String str14 = startTag0.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        java.lang.String str17 = endTag0.tagName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        startTag7.appendAttributeValue('4');
        boolean boolean11 = startTag7.isDoctype();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype26 = endTag13.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</eof>" + "'", str25, "</eof>");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        endTag0.appendAttributeName("<</ >>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        org.jsoup.parser.Token.Character character4 = character2.data("Doctype");
        java.lang.String str5 = character2.getData();
        boolean boolean6 = character2.isEndTag();
        java.lang.String str7 = character2.tokenType();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Character" + "'", str7, "Character");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        char[] charArray53 = new char[] { ' ', 'a', '#', 'a', 'a', '4' };
        tag9.appendAttributeValue(charArray53);
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
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', 'a', '#', 'a', 'a', '4' });
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag4 = endTag0.name("StartTag");
        org.jsoup.nodes.Attributes attributes5 = endTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes6 = endTag0.getAttributes();
        boolean boolean7 = endTag0.isCharacter();
        boolean boolean8 = endTag0.isEndTag();
        boolean boolean9 = endTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
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
        startTag7.appendAttributeValue(intArray27);
        startTag7.tagName = "";
        boolean boolean33 = startTag7.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character34 = startTag7.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(endTag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag9 = endTag6.reset();
        endTag6.appendAttributeValue(' ');
        endTag6.newAttribute();
        int[] intArray16 = new int[] { 1, 10, 10 };
        endTag6.appendAttributeValue(intArray16);
        org.jsoup.parser.Token.Tag tag19 = endTag6.name("StartTag");
        org.jsoup.parser.Token.TokenType tokenType20 = tag19.type;
        tag5.type = tokenType20;
        tag5.appendAttributeName(' ');
        boolean boolean24 = tag5.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        startTag0.appendTagName(' ');
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        boolean boolean18 = endTag0.isComment();
        endTag0.normalName = "<!---->4";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag12 = endTag0.name(" ");
        java.lang.String str13 = tag12.name();
        org.jsoup.nodes.Attributes attributes14 = tag12.attributes;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isCharacter();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.String str10 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        boolean boolean12 = doctype0.isForceQuirks();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.appendAttributeValue(' ');
        char[] charArray17 = new char[] { ' ', ' ' };
        endTag12.appendAttributeValue(charArray17);
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag12.appendAttributeValue(charArray24);
        endTag12.tagName = "eof";
        java.lang.String str29 = endTag12.name();
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag31.nameAttr("EOF", attributes33);
        boolean boolean35 = startTag34.isDoctype();
        org.jsoup.parser.Token.Tag tag36 = startTag34.reset();
        startTag34.newAttribute();
        org.jsoup.nodes.Attributes attributes38 = startTag34.attributes;
        endTag30.attributes = attributes38;
        endTag12.attributes = attributes38;
        org.jsoup.parser.Token.TokenType tokenType41 = endTag12.type;
        endTag12.appendTagName(' ');
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
        endTag12.appendAttributeValue(intArray73);
        startTag3.appendAttributeValue(intArray73);
        org.jsoup.nodes.Attributes attributes78 = startTag3.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character79 = startTag3.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "eof" + "'", str29, "eof");
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(attributes49);
        org.junit.Assert.assertNull(attributes54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(attributes78);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        tag10.normalName = "</hi!>";
        boolean boolean16 = tag10.isEOF();
        org.jsoup.parser.Token.Tag tag18 = tag10.name("<EOF>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        boolean boolean3 = comment0.bogus;
        java.lang.String str4 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.Class<?> wildcardClass10 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("</ >");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = character0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.getData();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("hi!");
        java.lang.String str10 = character0.getData();
        org.jsoup.parser.Token token11 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.String str9 = doctype0.getName();
        org.jsoup.parser.Token token10 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.tagName;
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        tag9.appendAttributeName("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.Class<?> wildcardClass10 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.tokenType();
        boolean boolean7 = doctype0.isEndTag();
        boolean boolean8 = doctype0.isEOF();
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.String str10 = doctype0.getPubSysKey();
        org.jsoup.parser.Token.Doctype doctype11 = doctype0.asDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doctype11);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.pubSysKey;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        boolean boolean9 = doctype8.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = doctype8.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        boolean boolean7 = tag5.selfClosing;
        org.jsoup.parser.Token.StartTag startTag8 = tag5.asStartTag();
        boolean boolean9 = tag5.isSelfClosing();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        org.jsoup.parser.Token.Tag tag19 = tag10.name("<<hi!>>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        boolean boolean9 = tag7.isCharacter();
        org.jsoup.parser.Token.Tag tag10 = tag7.reset();
        tag10.appendTagName('4');
        java.lang.String str13 = tag10.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag46.nameAttr("EOF", attributes48);
        boolean boolean50 = startTag49.isDoctype();
        org.jsoup.parser.Token.Tag tag51 = startTag49.reset();
        org.jsoup.parser.Token.StartTag startTag52 = tag51.asStartTag();
        startTag52.selfClosing = false;
        org.jsoup.parser.Token.Tag tag55 = startTag52.reset();
        org.jsoup.parser.Token.Tag tag56 = startTag52.reset();
        startTag52.appendTagName('a');
        org.jsoup.parser.Token.EndTag endTag59 = new org.jsoup.parser.Token.EndTag();
        endTag59.appendAttributeValue(' ');
        char[] charArray64 = new char[] { ' ', ' ' };
        endTag59.appendAttributeValue(charArray64);
        endTag59.selfClosing = true;
        org.jsoup.parser.Token.Tag tag69 = endTag59.name("hi!");
        tag69.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag72 = tag69.asEndTag();
        org.jsoup.parser.Token.EndTag endTag73 = new org.jsoup.parser.Token.EndTag();
        endTag73.finaliseTag();
        boolean boolean75 = endTag73.isCharacter();
        int[] intArray77 = new int[] { (short) 1 };
        endTag73.appendAttributeValue(intArray77);
        endTag72.appendAttributeValue(intArray77);
        startTag52.appendAttributeValue(intArray77);
        startTag7.appendAttributeValue(intArray77);
        boolean boolean82 = startTag7.isStartTag();
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
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(startTag52);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(endTag72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        java.lang.String str8 = tag3.normalName;
        boolean boolean9 = tag3.isStartTag();
        tag3.setEmptyAttributeValue();
        tag3.appendAttributeValue("a");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "starttag" + "'", str8, "starttag");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        tag13.appendTagName('#');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag7.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag7.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        tag11.setEmptyAttributeValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(endTag12);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        org.jsoup.parser.Token token36 = tag35.reset();
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
        org.junit.Assert.assertNotNull(token36);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        java.lang.String str10 = doctype9.getPublicIdentifier();
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
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        startTag3.appendTagName('a');
        startTag3.selfClosing = false;
        org.jsoup.parser.Token.Tag tag13 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag14 = startTag3.reset();
        tag14.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag9.nameAttr("EOF", attributes11);
        boolean boolean13 = startTag12.isDoctype();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag12.nameAttr("", attributes15);
        boolean boolean17 = startTag16.isSelfClosing();
        startTag16.normalName = "";
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
        org.jsoup.parser.Token.StartTag startTag38 = startTag16.nameAttr("<EOF>", attributes35);
        org.jsoup.parser.Token.StartTag startTag39 = startTag3.nameAttr("eof", attributes35);
        org.jsoup.parser.Token.Tag tag40 = startTag3.reset();
        tag40.appendTagName("<starttag>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(tag40);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        endTag0.finaliseTag();
        endTag0.selfClosing = false;
        endTag0.tagName = "<eof>";
        endTag0.appendTagName("starttag");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        org.jsoup.parser.Token.reset(stringBuilder12);
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
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        char[] charArray5 = new char[] { ' ', '#', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        endTag0.appendAttributeName('a');
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', ' ' });
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        boolean boolean10 = doctype0.forceQuirks;
        org.jsoup.parser.Token token11 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag12 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        tag6.setEmptyAttributeValue();
        tag6.finaliseTag();
        boolean boolean9 = tag6.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = tag6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        org.jsoup.parser.Token.EndTag endTag9 = endTag0.asEndTag();
        endTag9.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(endTag9);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        endTag0.appendTagName('a');
        boolean boolean12 = endTag0.isCharacter();
        endTag0.appendAttributeName("StartTag");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        endTag0.appendAttributeValue("</<<starttag>>>");
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
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("<<!---->>");
        java.lang.String str10 = character9.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        doctype0.pubSysKey = "#";
        java.lang.String str10 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token token8 = comment0.reset();
        boolean boolean9 = token8.isCharacter();
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character12 = character10.data("<!---->");
        java.lang.String str13 = character10.toString();
        org.jsoup.parser.Token token14 = character10.reset();
        org.jsoup.parser.Token.Character character16 = character10.data("hi!#");
        org.jsoup.parser.Token.Character character18 = character16.data("EOF");
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        endTag19.appendAttributeValue(' ');
        char[] charArray24 = new char[] { ' ', ' ' };
        endTag19.appendAttributeValue(charArray24);
        endTag19.selfClosing = true;
        org.jsoup.parser.Token.Tag tag29 = endTag19.name("hi!");
        boolean boolean30 = endTag19.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType31 = endTag19.type;
        character18.type = tokenType31;
        token8.type = tokenType31;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertNotNull(character18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.tokenType();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.appendAttributeValue(' ');
        char[] charArray15 = new char[] { ' ', ' ' };
        endTag10.appendAttributeValue(charArray15);
        endTag10.selfClosing = true;
        org.jsoup.parser.Token.Tag tag20 = endTag10.name("hi!");
        tag20.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag23 = tag20.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType24 = endTag23.type;
        doctype0.type = tokenType24;
        java.lang.StringBuilder stringBuilder26 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(endTag23);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag18 = tag10.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        boolean boolean35 = startTag3.isEndTag();
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag();
        boolean boolean38 = endTag37.isSelfClosing();
        endTag37.normalName = "";
        endTag37.finaliseTag();
        boolean boolean42 = endTag37.selfClosing;
        endTag37.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes47 = null;
        org.jsoup.parser.Token.StartTag startTag48 = startTag45.nameAttr("EOF", attributes47);
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = startTag45.nameAttr("EOF", attributes50);
        java.lang.String str52 = startTag45.normalName();
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = startTag53.nameAttr("EOF", attributes55);
        boolean boolean57 = startTag56.isDoctype();
        org.jsoup.nodes.Attributes attributes59 = null;
        org.jsoup.parser.Token.StartTag startTag60 = startTag56.nameAttr("", attributes59);
        org.jsoup.parser.Token.TokenType tokenType61 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag56.type = tokenType61;
        startTag45.type = tokenType61;
        endTag37.type = tokenType61;
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = startTag65.nameAttr("EOF", attributes67);
        boolean boolean69 = startTag68.isDoctype();
        org.jsoup.parser.Token.Tag tag70 = startTag68.reset();
        java.lang.String str71 = startTag68.normalName;
        java.lang.String str72 = startTag68.normalName();
        startTag68.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes77 = null;
        org.jsoup.parser.Token.StartTag startTag78 = startTag75.nameAttr("EOF", attributes77);
        org.jsoup.parser.Token.StartTag startTag80 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes82 = null;
        org.jsoup.parser.Token.StartTag startTag83 = startTag80.nameAttr("EOF", attributes82);
        boolean boolean84 = startTag83.isDoctype();
        org.jsoup.parser.Token.Tag tag85 = startTag83.reset();
        org.jsoup.parser.Token.StartTag startTag86 = tag85.asStartTag();
        org.jsoup.parser.Token.Tag tag87 = tag85.reset();
        org.jsoup.nodes.Attributes attributes88 = tag85.attributes;
        org.jsoup.parser.Token.StartTag startTag89 = startTag78.nameAttr("starttag", attributes88);
        org.jsoup.parser.Token.StartTag startTag90 = startTag68.nameAttr("", attributes88);
        endTag37.attributes = attributes88;
        org.jsoup.parser.Token.StartTag startTag92 = startTag3.nameAttr("<eof>", attributes88);
        startTag92.appendAttributeName('#');
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "eof" + "'", str52, "eof");
        org.junit.Assert.assertNotNull(startTag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertTrue("'" + tokenType61 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType61.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertNotNull(startTag83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertNotNull(startTag86);
        org.junit.Assert.assertNotNull(tag87);
        org.junit.Assert.assertNotNull(attributes88);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertNotNull(startTag90);
        org.junit.Assert.assertNotNull(startTag92);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        java.lang.String str12 = character8.toString();
        org.jsoup.parser.Token.Character character14 = character8.data("</<<starttag>>>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertNotNull(character14);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag15.nameAttr("", attributes18);
        boolean boolean20 = startTag19.isSelfClosing();
        java.lang.String str21 = startTag19.tagName;
        boolean boolean22 = startTag19.isEndTag();
        boolean boolean23 = startTag19.isEndTag();
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        startTag29.newAttribute();
        org.jsoup.nodes.Attributes attributes33 = startTag29.attributes;
        endTag25.attributes = attributes33;
        org.jsoup.parser.Token.StartTag startTag35 = startTag19.nameAttr("<!---->4", attributes33);
        org.jsoup.parser.Token.StartTag startTag36 = startTag3.nameAttr("<<!---->>", attributes33);
        boolean boolean37 = startTag3.isStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        tag6.setEmptyAttributeValue();
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
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        endTag0.setEmptyAttributeValue();
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
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        tag5.appendAttributeName("#");
        java.lang.String str15 = tag5.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4" + "'", str15, "4");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag5 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        java.lang.String str19 = endTag0.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "</hi!>" + "'", str19, "</hi!>");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        boolean boolean3 = comment0.bogus;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.appendTagName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag7.reset();
        tag11.appendAttributeName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token.Character character9 = character0.data("</<<starttag>>>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(character9);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        startTag6.setEmptyAttributeValue();
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
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.getData();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = character9.asComment();
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
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        int[] intArray4 = new int[] { (short) 1 };
        endTag0.appendAttributeValue(intArray4);
        endTag0.tagName = "<!---->";
        endTag0.finaliseTag();
        endTag0.appendTagName('4');
        endTag0.tagName = "Comment";
        endTag0.appendAttributeValue("</<!---->4>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        boolean boolean8 = doctype6.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype9 = doctype6.asDoctype();
        java.lang.String str10 = doctype9.pubSysKey;
        org.jsoup.parser.Token.EOF eOF11 = new org.jsoup.parser.Token.EOF();
        java.lang.String str12 = eOF11.tokenType();
        org.jsoup.parser.Token token13 = eOF11.reset();
        org.jsoup.parser.Token token14 = eOF11.reset();
        boolean boolean15 = token14.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType16 = org.jsoup.parser.Token.TokenType.Character;
        token14.type = tokenType16;
        doctype9.type = tokenType16;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        boolean boolean9 = startTag6.isComment();
        startTag6.appendTagName(' ');
        java.lang.String str12 = startTag6.toString();
        startTag6.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<EOF >" + "'", str12, "<EOF >");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        endTag0.selfClosing = true;
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
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendTagName("EndTag");
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        endTag7.appendAttributeValue("<<<hi!>>>");
        boolean boolean10 = endTag7.isSelfClosing();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName(' ');
        endTag0.appendAttributeName('a');
        boolean boolean6 = endTag0.selfClosing;
        endTag0.appendTagName('4');
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        java.lang.String str10 = tag9.normalName();
        tag9.appendAttributeName('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        java.lang.String str32 = endTag0.tagName;
        endTag0.finaliseTag();
        java.lang.Class<?> wildcardClass34 = endTag0.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1 });
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        endTag0.appendTagName('a');
        java.lang.String str11 = endTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        org.jsoup.parser.Token.Tag tag17 = startTag15.reset();
        java.lang.String str18 = startTag15.normalName;
        java.lang.String str19 = startTag15.normalName();
        boolean boolean20 = startTag15.selfClosing;
        boolean boolean21 = startTag15.isDoctype();
        startTag15.appendTagName('4');
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(' ');
        char[] charArray29 = new char[] { ' ', ' ' };
        endTag24.appendAttributeValue(charArray29);
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.appendAttributeValue(' ');
        char[] charArray36 = new char[] { ' ', ' ' };
        endTag31.appendAttributeValue(charArray36);
        endTag24.appendAttributeValue(charArray36);
        endTag24.tagName = "eof";
        java.lang.String str41 = endTag24.name();
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = startTag43.nameAttr("EOF", attributes45);
        boolean boolean47 = startTag46.isDoctype();
        org.jsoup.parser.Token.Tag tag48 = startTag46.reset();
        startTag46.newAttribute();
        org.jsoup.nodes.Attributes attributes50 = startTag46.attributes;
        endTag42.attributes = attributes50;
        endTag24.attributes = attributes50;
        org.jsoup.parser.Token.TokenType tokenType53 = endTag24.type;
        endTag24.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag56 = new org.jsoup.parser.Token.EndTag();
        boolean boolean57 = endTag56.isSelfClosing();
        endTag56.normalName = "";
        endTag56.finaliseTag();
        org.jsoup.nodes.Attributes attributes61 = endTag56.attributes;
        endTag56.appendAttributeValue('#');
        endTag56.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes66 = endTag56.getAttributes();
        java.lang.String str67 = endTag56.name();
        org.jsoup.parser.Token.EndTag endTag68 = new org.jsoup.parser.Token.EndTag();
        endTag68.appendAttributeValue(' ');
        char[] charArray73 = new char[] { ' ', ' ' };
        endTag68.appendAttributeValue(charArray73);
        endTag68.selfClosing = true;
        org.jsoup.parser.Token.Tag tag78 = endTag68.name("hi!");
        endTag68.appendAttributeName('a');
        int[] intArray85 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag68.appendAttributeValue(intArray85);
        endTag56.appendAttributeValue(intArray85);
        endTag24.appendAttributeValue(intArray85);
        startTag15.appendAttributeValue(intArray85);
        endTag0.appendAttributeValue(intArray85);
        java.lang.String str91 = endTag0.tagName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "eof" + "'", str41, "eof");
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(attributes61);
        org.junit.Assert.assertNull(attributes66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "a" + "'", str91, "a");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        startTag0.tagName = "#";
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        boolean boolean39 = startTag3.isStartTag();
        java.lang.String str40 = startTag3.tagName;
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EOF" + "'", str40, "EOF");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        java.lang.String str9 = endTag0.tagName;
        org.jsoup.parser.Token.Tag tag10 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = tag10.name("Doctype");
        tag10.appendAttributeValue("<<<hi!>>>");
        tag10.tagName = "<<!---->>";
        tag10.tagName = "</<!---->4>";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        boolean boolean8 = doctype6.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype9 = doctype6.asDoctype();
        doctype9.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doctype9);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        org.jsoup.parser.Token.Tag tag33 = startTag31.name("<<starttag>>");
        boolean boolean34 = startTag31.isSelfClosing();
        org.jsoup.nodes.Attributes attributes35 = startTag31.attributes;
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
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes35);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        boolean boolean9 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.tokenType();
        org.jsoup.parser.Token token5 = doctype0.reset();
        doctype0.pubSysKey = "<!---->";
        java.lang.String str8 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        java.lang.String str12 = endTag0.toString();
        boolean boolean13 = endTag0.isEOF();
        boolean boolean14 = endTag0.isStartTag();
        endTag0.tagName = "<</ >>";
        endTag0.appendAttributeName('#');
        java.lang.Class<?> wildcardClass19 = endTag0.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        org.jsoup.parser.Token.TokenType tokenType43 = startTag7.type;
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
        org.junit.Assert.assertTrue("'" + tokenType43 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType43.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        startTag0.appendAttributeValue("");
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
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.selfClosing = true;
        java.lang.String str6 = endTag0.tagName;
        endTag0.appendAttributeValue("#");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendTagName("EndTag");
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        java.lang.String str8 = endTag0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</EndTag>" + "'", str8, "</EndTag>");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        org.jsoup.nodes.Attributes attributes10 = startTag6.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = startTag6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        startTag3.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        org.jsoup.nodes.Attributes attributes12 = startTag3.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        org.jsoup.nodes.Attributes attributes9 = endTag0.getAttributes();
        endTag0.appendAttributeValue('a');
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
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.pubSysKey;
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        boolean boolean12 = tag5.isComment();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        boolean boolean3 = character0.isComment();
        org.jsoup.parser.Token token4 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        java.lang.String str12 = endTag0.toString();
        boolean boolean13 = endTag0.isEOF();
        boolean boolean14 = endTag0.isStartTag();
        endTag0.tagName = "<</ >>";
        endTag0.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.parser.Token.Tag tag24 = startTag22.reset();
        java.lang.String str25 = startTag22.normalName;
        java.lang.String str26 = startTag22.normalName();
        startTag22.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag28 = startTag22.reset();
        startTag22.tagName = "EndTag";
        boolean boolean31 = startTag22.selfClosing;
        java.lang.String str32 = startTag22.normalName();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag33.nameAttr("EOF", attributes35);
        boolean boolean37 = startTag36.isDoctype();
        org.jsoup.parser.Token.Tag tag38 = startTag36.reset();
        org.jsoup.parser.Token.StartTag startTag39 = tag38.asStartTag();
        startTag39.selfClosing = false;
        org.jsoup.parser.Token.Tag tag42 = startTag39.reset();
        org.jsoup.parser.Token.Tag tag43 = startTag39.reset();
        startTag39.appendTagName('a');
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        endTag46.appendAttributeValue(' ');
        char[] charArray51 = new char[] { ' ', ' ' };
        endTag46.appendAttributeValue(charArray51);
        endTag46.selfClosing = true;
        org.jsoup.parser.Token.Tag tag56 = endTag46.name("hi!");
        tag56.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag59 = tag56.asEndTag();
        org.jsoup.parser.Token.EndTag endTag60 = new org.jsoup.parser.Token.EndTag();
        endTag60.finaliseTag();
        boolean boolean62 = endTag60.isCharacter();
        int[] intArray64 = new int[] { (short) 1 };
        endTag60.appendAttributeValue(intArray64);
        endTag59.appendAttributeValue(intArray64);
        startTag39.appendAttributeValue(intArray64);
        startTag22.appendAttributeValue(intArray64);
        endTag0.appendAttributeValue(intArray64);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(endTag59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1 });
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        comment0.bogus = false;
        java.lang.String str8 = comment0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        startTag3.finaliseTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        org.jsoup.nodes.Attributes attributes14 = null;
        endTag0.attributes = attributes14;
        endTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        boolean boolean17 = tag10.isStartTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EndTag" + "'", str16, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isComment();
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        comment0.bogus = false;
        org.jsoup.parser.Token token10 = comment0.reset();
        java.lang.String str11 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        startTag6.appendAttributeValue("hi!</hi!>");
        java.lang.Class<?> wildcardClass12 = startTag6.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        startTag3.appendAttributeValue("</hi!#>");
        java.lang.String str25 = startTag3.tagName;
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        doctype0.pubSysKey = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Doctype" + "'", str11, "Doctype");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        endTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes17);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getName();
        boolean boolean10 = doctype0.isForceQuirks();
        doctype0.pubSysKey = "";
        java.lang.String str13 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "EOF";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        boolean boolean28 = endTag14.isEOF();
        java.lang.String str29 = endTag14.tokenType();
        org.jsoup.parser.Token.Doctype doctype30 = new org.jsoup.parser.Token.Doctype();
        doctype30.pubSysKey = "";
        java.lang.String str33 = doctype30.pubSysKey;
        doctype30.forceQuirks = true;
        java.lang.StringBuilder stringBuilder36 = doctype30.systemIdentifier;
        org.jsoup.parser.Token token37 = doctype30.reset();
        org.jsoup.parser.Token.Doctype doctype38 = new org.jsoup.parser.Token.Doctype();
        doctype38.pubSysKey = "";
        java.lang.StringBuilder stringBuilder41 = doctype38.name;
        java.lang.String str42 = doctype38.getPublicIdentifier();
        java.lang.String str43 = doctype38.getPubSysKey();
        java.lang.String str44 = doctype38.pubSysKey;
        java.lang.String str45 = doctype38.getPublicIdentifier();
        java.lang.String str46 = doctype38.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType47 = doctype38.type;
        token37.type = tokenType47;
        endTag14.type = tokenType47;
        tag13.type = tokenType47;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EndTag" + "'", str29, "EndTag");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertNotNull(token37);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + tokenType47 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType47.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = character6.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        boolean boolean10 = doctype0.isForceQuirks();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        boolean boolean2 = doctype0.isEndTag();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        endTag0.tagName = "<!---->";
        org.jsoup.parser.Token.TokenType tokenType31 = endTag0.type;
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
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        endTag0.tagName = "hi!";
        java.lang.String str10 = endTag0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag11 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        doctype0.pubSysKey = "starttag";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        org.jsoup.nodes.Attributes attributes81 = startTag43.attributes;
        org.jsoup.parser.Token token82 = startTag43.reset();
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
        org.junit.Assert.assertNotNull(attributes81);
        org.junit.Assert.assertNotNull(token82);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        boolean boolean12 = comment0.bogus;
        boolean boolean13 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        boolean boolean9 = tag8.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        java.lang.String str6 = comment0.getData();
        boolean boolean7 = comment0.isDoctype();
        boolean boolean8 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        boolean boolean7 = comment0.isCharacter();
        boolean boolean8 = comment0.bogus;
        comment0.bogus = false;
        boolean boolean11 = comment0.isStartTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        boolean boolean5 = character0.isDoctype();
        org.jsoup.parser.Token.Character character7 = character0.data("");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(character7);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
            org.jsoup.parser.Token.Doctype doctype20 = startTag3.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
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
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str11 = doctype0.tokenType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Doctype" + "'", str11, "Doctype");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        java.lang.String str9 = endTag0.normalName;
        endTag0.setEmptyAttributeValue();
        boolean boolean11 = endTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EndTag" + "'", str9, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag14 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data(" ");
        java.lang.String str7 = character0.tokenType();
        java.lang.String str8 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Character" + "'", str7, "Character");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        endTag0.appendTagName('a');
        java.lang.String str11 = endTag0.normalName;
        endTag0.appendTagName("Comment");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        startTag3.appendTagName('a');
        org.jsoup.parser.Token.TokenType tokenType15 = startTag3.type;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        boolean boolean17 = startTag16.isDoctype();
        org.jsoup.parser.Token.Tag tag18 = startTag16.reset();
        java.lang.String str19 = startTag16.normalName;
        java.lang.String str20 = startTag16.normalName();
        boolean boolean21 = startTag16.selfClosing;
        boolean boolean22 = startTag16.isDoctype();
        startTag16.appendTagName('4');
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag();
        endTag25.appendAttributeValue(' ');
        char[] charArray30 = new char[] { ' ', ' ' };
        endTag25.appendAttributeValue(charArray30);
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        endTag32.appendAttributeValue(' ');
        char[] charArray37 = new char[] { ' ', ' ' };
        endTag32.appendAttributeValue(charArray37);
        endTag25.appendAttributeValue(charArray37);
        endTag25.tagName = "eof";
        java.lang.String str42 = endTag25.name();
        org.jsoup.parser.Token.EndTag endTag43 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.parser.Token.StartTag startTag47 = startTag44.nameAttr("EOF", attributes46);
        boolean boolean48 = startTag47.isDoctype();
        org.jsoup.parser.Token.Tag tag49 = startTag47.reset();
        startTag47.newAttribute();
        org.jsoup.nodes.Attributes attributes51 = startTag47.attributes;
        endTag43.attributes = attributes51;
        endTag25.attributes = attributes51;
        org.jsoup.parser.Token.TokenType tokenType54 = endTag25.type;
        endTag25.appendTagName(' ');
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        boolean boolean58 = endTag57.isSelfClosing();
        endTag57.normalName = "";
        endTag57.finaliseTag();
        org.jsoup.nodes.Attributes attributes62 = endTag57.attributes;
        endTag57.appendAttributeValue('#');
        endTag57.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes67 = endTag57.getAttributes();
        java.lang.String str68 = endTag57.name();
        org.jsoup.parser.Token.EndTag endTag69 = new org.jsoup.parser.Token.EndTag();
        endTag69.appendAttributeValue(' ');
        char[] charArray74 = new char[] { ' ', ' ' };
        endTag69.appendAttributeValue(charArray74);
        endTag69.selfClosing = true;
        org.jsoup.parser.Token.Tag tag79 = endTag69.name("hi!");
        endTag69.appendAttributeName('a');
        int[] intArray86 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag69.appendAttributeValue(intArray86);
        endTag57.appendAttributeValue(intArray86);
        endTag25.appendAttributeValue(intArray86);
        startTag16.appendAttributeValue(intArray86);
        startTag7.appendAttributeValue(intArray86);
        org.jsoup.parser.Token.TokenType tokenType92 = startTag7.type;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "eof" + "'", str42, "eof");
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertTrue("'" + tokenType54 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType54.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(attributes62);
        org.junit.Assert.assertNull(attributes67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + tokenType92 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType92.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        endTag0.appendAttributeName("");
        endTag0.appendAttributeName('a');
        java.lang.String str7 = endTag0.normalName;
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.EndTag endTag10 = endTag0.asEndTag();
        boolean boolean11 = endTag0.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(endTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        java.lang.String str10 = startTag0.toString();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        startTag11.tagName = "";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        boolean boolean10 = doctype0.forceQuirks;
        java.lang.String str11 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder12 = doctype0.name;
        org.jsoup.parser.Token token13 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        startTag3.appendTagName('4');
        org.jsoup.parser.Token.Tag tag6 = startTag3.reset();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        doctype7.pubSysKey = "";
        boolean boolean10 = doctype7.isEOF();
        java.lang.String str11 = doctype7.getPubSysKey();
        java.lang.String str12 = doctype7.getPublicIdentifier();
        doctype7.pubSysKey = "eof";
        java.lang.String str15 = doctype7.getPubSysKey();
        java.lang.String str16 = doctype7.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder17 = doctype7.name;
        java.lang.String str18 = doctype7.getPublicIdentifier();
        org.jsoup.parser.Token token19 = doctype7.reset();
        boolean boolean20 = doctype7.forceQuirks;
        java.lang.String str21 = doctype7.getPublicIdentifier();
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        endTag22.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag25 = endTag22.reset();
        endTag22.appendTagName(' ');
        java.lang.String str28 = endTag22.normalName;
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
        org.jsoup.parser.Token.TokenType tokenType44 = startTag43.type;
        endTag22.type = tokenType44;
        doctype7.type = tokenType44;
        startTag3.type = tokenType44;
        startTag3.selfClosing = true;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eof" + "'", str15, "eof");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " " + "'", str28, " ");
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder3);
        org.jsoup.parser.Token.reset(stringBuilder3);
        org.jsoup.parser.Token.reset(stringBuilder3);
        org.jsoup.parser.Token.reset(stringBuilder3);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        boolean boolean17 = endTag0.isEOF();
        endTag0.selfClosing = false;
        endTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag22 = endTag0.reset();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        endTag0.selfClosing = false;
        endTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        boolean boolean8 = endTag7.selfClosing;
        boolean boolean9 = endTag7.selfClosing;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag10.nameAttr("EOF", attributes12);
        java.lang.String str14 = startTag13.toString();
        org.jsoup.parser.Token.Tag tag15 = startTag13.reset();
        org.jsoup.nodes.Attributes attributes16 = startTag13.getAttributes();
        endTag7.attributes = attributes16;
        java.lang.Class<?> wildcardClass18 = attributes16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<EOF>" + "'", str14, "<EOF>");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.tokenType();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.appendAttributeValue(' ');
        char[] charArray15 = new char[] { ' ', ' ' };
        endTag10.appendAttributeValue(charArray15);
        endTag10.selfClosing = true;
        org.jsoup.parser.Token.Tag tag20 = endTag10.name("hi!");
        tag20.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag23 = tag20.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType24 = endTag23.type;
        doctype0.type = tokenType24;
        org.jsoup.parser.Token.Doctype doctype26 = doctype0.asDoctype();
        java.lang.String str27 = doctype26.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(endTag23);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(doctype26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        endTag0.appendAttributeName("a");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(attributes33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EndTag" + "'", str34, "EndTag");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        tag14.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        boolean boolean41 = tag8.isSelfClosing();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        boolean boolean9 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
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
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.pubSysKey;
        org.jsoup.parser.Token token7 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        startTag6.appendAttributeValue('#');
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
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.isSelfClosing();
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.tagName;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag12.nameAttr("EOF", attributes14);
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag12.nameAttr("EOF", attributes17);
        org.jsoup.parser.Token.Tag tag20 = startTag12.name("hi!");
        java.lang.String str21 = startTag12.toString();
        java.lang.String str22 = startTag12.toString();
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
        org.jsoup.parser.Token.StartTag startTag41 = startTag12.nameAttr("<hi!>", attributes38);
        org.jsoup.parser.Token.StartTag startTag42 = startTag7.nameAttr("</eof>", attributes38);
        org.jsoup.parser.Token.TokenType tokenType43 = null;
        startTag7.type = tokenType43;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<hi!>" + "'", str21, "<hi!>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<hi!>" + "'", str22, "<hi!>");
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNotNull(startTag42);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag14 = endTag0.reset();
        boolean boolean15 = endTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes16 = endTag0.attributes;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        boolean boolean5 = startTag3.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag6 = startTag3.asStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        endTag9.finaliseTag();
        boolean boolean11 = endTag9.isCharacter();
        int[] intArray13 = new int[] { (short) 1 };
        endTag9.appendAttributeValue(intArray13);
        endTag9.tagName = "<!---->";
        endTag9.finaliseTag();
        endTag9.appendTagName('4');
        boolean boolean20 = endTag9.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType21 = org.jsoup.parser.Token.TokenType.EOF;
        endTag9.type = tokenType21;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("EOF", attributes25);
        boolean boolean27 = startTag26.isDoctype();
        org.jsoup.parser.Token.Tag tag28 = startTag26.reset();
        org.jsoup.parser.Token.StartTag startTag29 = tag28.asStartTag();
        startTag29.selfClosing = false;
        org.jsoup.parser.Token.Tag tag32 = startTag29.reset();
        org.jsoup.parser.Token.Tag tag33 = startTag29.reset();
        org.jsoup.nodes.Attributes attributes34 = tag33.getAttributes();
        endTag9.attributes = attributes34;
        org.jsoup.parser.Token.StartTag startTag36 = startTag6.nameAttr("comment", attributes34);
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        boolean boolean39 = endTag38.isSelfClosing();
        endTag38.normalName = "";
        boolean boolean42 = endTag38.selfClosing;
        endTag38.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag45 = endTag38.asEndTag();
        boolean boolean46 = endTag45.selfClosing;
        boolean boolean47 = endTag45.selfClosing;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = startTag48.nameAttr("EOF", attributes50);
        java.lang.String str52 = startTag51.toString();
        org.jsoup.parser.Token.Tag tag53 = startTag51.reset();
        org.jsoup.nodes.Attributes attributes54 = startTag51.getAttributes();
        endTag45.attributes = attributes54;
        org.jsoup.parser.Token.StartTag startTag56 = startTag36.nameAttr("<<<hi!>>>", attributes54);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(endTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<EOF>" + "'", str52, "<EOF>");
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(startTag56);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        org.jsoup.parser.Token.Tag tag14 = tag5.name("comment");
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
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName(' ');
        endTag0.appendAttributeName('a');
        boolean boolean6 = endTag0.selfClosing;
        endTag0.appendTagName('4');
        endTag0.appendAttributeName("");
        endTag0.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        doctype0.pubSysKey = "eof";
        org.jsoup.parser.Token token9 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        java.lang.String str7 = character0.getData();
        java.lang.String str8 = character0.toString();
        java.lang.String str9 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }
}

