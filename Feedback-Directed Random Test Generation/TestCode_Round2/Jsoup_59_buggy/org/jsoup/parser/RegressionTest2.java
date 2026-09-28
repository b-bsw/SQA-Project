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
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token.Character character7 = character0.data("Character");
        org.jsoup.parser.Token.Character character9 = character0.data("StartTag");
        java.lang.String str10 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("<starttag>");
        org.jsoup.parser.Token.Character character10 = character8.data("");
        boolean boolean11 = character8.isEOF();
        org.jsoup.parser.Token.Character character13 = character8.data("</eof>");
        java.lang.String str14 = character8.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</eof>" + "'", str14, "</eof>");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = startTag6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.String str14 = tag12.name();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("eof");
        java.lang.String str11 = tag10.name();
        tag10.newAttribute();
        java.lang.String str13 = tag10.normalName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eof" + "'", str13, "eof");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        java.lang.String str14 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token8 = doctype0.reset();
        doctype0.forceQuirks = false;
        doctype0.pubSysKey = "</hi!#>";
        doctype0.pubSysKey = "<starttag>";
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
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        doctype0.pubSysKey = "hi! ";
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        tag17.normalName = "EOF";
        tag17.appendAttributeName("<<!---->>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = startTag3.toString();
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
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        java.lang.String str8 = startTag0.tokenType();
        startTag0.appendAttributeValue("EndTag");
        boolean boolean11 = startTag0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        java.lang.String str27 = startTag3.tagName;
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        boolean boolean14 = doctype0.isEOF();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment19 = startTag3.asComment();
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
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        java.lang.String str8 = tag7.tagName;
        org.jsoup.parser.Token.Tag tag9 = tag7.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = tag7.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.lang.String str12 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder10 = comment0.data;
        org.jsoup.parser.Token token11 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        boolean boolean11 = doctype10.forceQuirks;
        boolean boolean12 = doctype10.isForceQuirks();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getName();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.Tag tag14 = endTag7.reset();
        org.jsoup.parser.Token token15 = endTag7.reset();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("EOF", attributes18);
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag16.nameAttr("EOF", attributes21);
        java.lang.String str23 = startTag16.normalName();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag24.nameAttr("EOF", attributes26);
        boolean boolean28 = startTag27.isDoctype();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = startTag27.nameAttr("", attributes30);
        org.jsoup.parser.Token.TokenType tokenType32 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag27.type = tokenType32;
        startTag16.type = tokenType32;
        org.jsoup.parser.Token.Tag tag35 = startTag16.reset();
        org.jsoup.nodes.Attributes attributes36 = startTag16.attributes;
        org.jsoup.nodes.Attributes attributes37 = startTag16.getAttributes();
        endTag7.attributes = attributes37;
        tag6.attributes = attributes37;
        org.jsoup.nodes.Attributes attributes40 = tag6.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "eof" + "'", str23, "eof");
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(attributes40);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.finaliseTag();
        tag10.appendTagName("<<!---->>");
        tag10.appendAttributeName("<</hi!>>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        org.jsoup.parser.Token token12 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        boolean boolean13 = doctype0.isForceQuirks();
        java.lang.String str14 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        boolean boolean3 = comment0.bogus;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.getData();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        boolean boolean7 = comment0.bogus;
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean12 = doctype0.isForceQuirks();
        boolean boolean13 = doctype0.forceQuirks;
        boolean boolean14 = doctype0.isEndTag();
        java.lang.String str15 = doctype0.pubSysKey;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
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
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        java.lang.String str8 = comment7.getData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        startTag7.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        org.jsoup.parser.Token.Tag tag19 = endTag0.name("</hi!#>");
        java.lang.String str20 = endTag0.normalName();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "</hi!#>" + "'", str20, "</hi!#>");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        comment0.bogus = false;
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        boolean boolean10 = startTag3.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("<EOF >");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.lang.String str55 = endTag0.tagName;
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
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        tag10.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token token8 = character0.reset();
        org.jsoup.parser.Token token9 = character0.reset();
        java.lang.String str10 = character0.getData();
        org.jsoup.parser.Token.Character character12 = character0.data("<starttag>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(character12);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        java.lang.String str12 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        startTag58.appendAttributeName(' ');
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
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder9);
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
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        org.jsoup.parser.Token.Doctype doctype34 = new org.jsoup.parser.Token.Doctype();
        doctype34.pubSysKey = "";
        java.lang.String str37 = doctype34.getPubSysKey();
        java.lang.String str38 = doctype34.getPubSysKey();
        boolean boolean39 = doctype34.forceQuirks;
        org.jsoup.parser.Token.EndTag endTag40 = new org.jsoup.parser.Token.EndTag();
        boolean boolean41 = endTag40.isSelfClosing();
        endTag40.normalName = "";
        endTag40.finaliseTag();
        boolean boolean45 = endTag40.selfClosing;
        endTag40.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = startTag48.nameAttr("EOF", attributes50);
        org.jsoup.nodes.Attributes attributes53 = null;
        org.jsoup.parser.Token.StartTag startTag54 = startTag48.nameAttr("EOF", attributes53);
        java.lang.String str55 = startTag48.normalName();
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = startTag56.nameAttr("EOF", attributes58);
        boolean boolean60 = startTag59.isDoctype();
        org.jsoup.nodes.Attributes attributes62 = null;
        org.jsoup.parser.Token.StartTag startTag63 = startTag59.nameAttr("", attributes62);
        org.jsoup.parser.Token.TokenType tokenType64 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag59.type = tokenType64;
        startTag48.type = tokenType64;
        endTag40.type = tokenType64;
        doctype34.type = tokenType64;
        startTag0.type = tokenType64;
        org.jsoup.nodes.Attributes attributes70 = startTag0.getAttributes();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "eof" + "'", str55, "eof");
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertTrue("'" + tokenType64 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType64.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes70);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        endTag0.appendAttributeName('4');
        java.lang.String str9 = endTag0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</eof>" + "'", str9, "</eof>");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        boolean boolean31 = startTag29.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = startTag29.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        java.lang.String str9 = endTag0.tagName;
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName("EOF");
        java.lang.String str13 = endTag0.normalName;
        java.lang.String str14 = endTag0.tagName;
        endTag0.newAttribute();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        comment0.bogus = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        java.lang.String str9 = character0.getData();
        boolean boolean10 = character0.isComment();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment16 = startTag11.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        comment0.bogus = false;
        comment0.bogus = true;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        comment0.bogus = false;
        java.lang.Class<?> wildcardClass9 = comment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        endTag0.newAttribute();
        java.lang.String str20 = endTag0.normalName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        org.jsoup.parser.Token token4 = comment3.reset();
        boolean boolean5 = comment3.isComment();
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token.TokenType tokenType8 = comment7.type;
        org.jsoup.parser.Token token9 = comment7.reset();
        java.lang.String str10 = comment7.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        comment0.bogus = false;
        org.jsoup.parser.Token token10 = comment0.reset();
        org.jsoup.parser.Token token11 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        boolean boolean9 = endTag0.isDoctype();
        endTag0.finaliseTag();
        endTag0.appendAttributeName("EndTag");
        boolean boolean13 = endTag0.isCharacter();
        org.jsoup.parser.Token.Tag tag15 = endTag0.name("#");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        endTag0.appendTagName(' ');
        endTag0.appendTagName('a');
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.nodes.Attributes attributes7 = endTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.String str66 = startTag3.normalName();
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
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        java.lang.String str8 = comment0.getData();
        boolean boolean9 = comment0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        org.jsoup.parser.Token.Character character10 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character12 = character10.data("<hi!>");
        java.lang.String str13 = character10.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!>" + "'", str13, "<hi!>");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
            org.jsoup.parser.Token.EndTag endTag13 = startTag3.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        java.lang.String str8 = startTag0.tokenType();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag9.nameAttr("EOF", attributes11);
        boolean boolean13 = startTag12.isDoctype();
        org.jsoup.parser.Token.Tag tag14 = startTag12.reset();
        java.lang.String str15 = startTag12.normalName;
        java.lang.String str16 = startTag12.normalName();
        boolean boolean17 = startTag12.selfClosing;
        java.lang.String str18 = startTag12.tagName;
        boolean boolean19 = startTag12.isEOF();
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
        startTag12.appendAttributeValue(intArray43);
        startTag0.appendAttributeValue(intArray43);
        java.lang.String str48 = startTag0.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<EOF>" + "'", str48, "<EOF>");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        endTag0.appendTagName(' ');
        endTag0.newAttribute();
        endTag0.appendTagName("4");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.lang.String str33 = endTag0.tokenType();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EndTag" + "'", str33, "EndTag");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.finaliseTag();
        endTag0.appendAttributeName("<!---->");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token10 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.appendTagName("<<hi!>>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.getData();
        java.lang.String str7 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPubSysKey();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getSystemIdentifier();
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
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        tag10.newAttribute();
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.appendTagName('a');
        startTag3.appendTagName("hi!</hi!>");
        startTag3.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        int[] intArray10 = new int[] { 1, 10, 10 };
        endTag0.appendAttributeValue(intArray10);
        org.jsoup.parser.Token.Tag tag13 = endTag0.name("StartTag");
        endTag0.appendAttributeValue("eof");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment16 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        boolean boolean5 = endTag0.isEndTag();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.appendAttributeValue(' ');
        char[] charArray11 = new char[] { ' ', ' ' };
        endTag6.appendAttributeValue(charArray11);
        endTag6.selfClosing = true;
        org.jsoup.parser.Token.Tag tag16 = endTag6.name("hi!");
        tag16.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag19 = tag16.asEndTag();
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        endTag20.finaliseTag();
        boolean boolean22 = endTag20.isCharacter();
        int[] intArray24 = new int[] { (short) 1 };
        endTag20.appendAttributeValue(intArray24);
        endTag19.appendAttributeValue(intArray24);
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        endTag27.appendAttributeValue(' ');
        char[] charArray32 = new char[] { ' ', ' ' };
        endTag27.appendAttributeValue(charArray32);
        endTag27.selfClosing = true;
        org.jsoup.parser.Token.Tag tag37 = endTag27.name("hi!");
        boolean boolean38 = endTag27.isStartTag();
        endTag27.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag41 = new org.jsoup.parser.Token.EndTag();
        endTag41.appendAttributeValue(' ');
        endTag41.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        endTag46.appendAttributeValue(' ');
        char[] charArray51 = new char[] { ' ', ' ' };
        endTag46.appendAttributeValue(charArray51);
        endTag46.selfClosing = true;
        org.jsoup.parser.Token.Tag tag56 = endTag46.name("hi!");
        endTag46.appendAttributeName('a');
        int[] intArray63 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag46.appendAttributeValue(intArray63);
        endTag41.appendAttributeValue(intArray63);
        endTag27.appendAttributeValue(intArray63);
        org.jsoup.parser.Token token67 = endTag27.reset();
        java.lang.String str68 = endTag27.normalName();
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes71 = null;
        org.jsoup.parser.Token.StartTag startTag72 = startTag69.nameAttr("EOF", attributes71);
        boolean boolean73 = startTag72.isDoctype();
        org.jsoup.nodes.Attributes attributes75 = null;
        org.jsoup.parser.Token.StartTag startTag76 = startTag72.nameAttr("", attributes75);
        org.jsoup.parser.Token.Tag tag77 = startTag76.reset();
        org.jsoup.parser.Token.EndTag endTag78 = new org.jsoup.parser.Token.EndTag();
        boolean boolean79 = endTag78.isSelfClosing();
        endTag78.normalName = "";
        java.lang.String str82 = endTag78.normalName();
        char[] charArray85 = new char[] { 'a', 'a' };
        endTag78.appendAttributeValue(charArray85);
        tag77.appendAttributeValue(charArray85);
        endTag27.appendAttributeValue(charArray85);
        endTag19.appendAttributeValue(charArray85);
        endTag0.appendAttributeValue(charArray85);
        boolean boolean91 = endTag0.isEOF();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(endTag19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1 });
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(startTag72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(startTag76);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertArrayEquals(charArray85, new char[] { 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        doctype0.forceQuirks = true;
        java.lang.String str5 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        boolean boolean13 = comment0.isDoctype();
        org.jsoup.parser.Token token14 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        int[] intArray17 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag0.appendAttributeValue(intArray17);
        endTag0.normalName = "starttag";
        org.jsoup.parser.Token.Tag tag21 = endTag0.reset();
        java.lang.String str22 = tag21.normalName();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
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
        org.jsoup.parser.Token.StartTag startTag34 = startTag3.nameAttr("hi!#", attributes32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype35 = startTag3.asDoctype();
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
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype47 = tag46.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.isStartTag();
        java.lang.String str8 = endTag0.tokenType();
        boolean boolean9 = endTag0.isEOF();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EndTag" + "'", str8, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        boolean boolean8 = endTag0.isEndTag();
        endTag0.selfClosing = false;
        endTag0.appendAttributeValue("EOF");
        endTag0.appendTagName(' ');
        endTag0.setEmptyAttributeValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        startTag7.newAttribute();
        startTag7.appendAttributeName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPubSysKey();
        boolean boolean8 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        boolean boolean9 = doctype0.isCharacter();
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        boolean boolean16 = tag10.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment17 = tag10.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token token14 = endTag0.reset();
        boolean boolean15 = endTag0.isDoctype();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean12 = doctype0.isForceQuirks();
        boolean boolean13 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        boolean boolean7 = tag5.isSelfClosing();
        tag5.appendTagName("<#>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        startTag58.tagName = "<EOF >";
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
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
            org.jsoup.parser.Token.EndTag endTag8 = token7.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(token16);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        boolean boolean11 = character0.isStartTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag6 = endTag0.name("eof");
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</hi!>");
        endTag0.tagName = "EndTag";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        java.lang.StringBuilder stringBuilder16 = comment15.data;
        java.lang.StringBuilder stringBuilder17 = comment15.data;
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
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        boolean boolean10 = startTag3.isSelfClosing();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        tag5.selfClosing = false;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        startTag3.appendAttributeName('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = startTag3.asComment();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getSystemIdentifier();
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
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        doctype0.pubSysKey = "<!---->4";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag6.reset();
        startTag6.appendAttributeValue('a');
        startTag6.appendAttributeName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType5 = doctype0.type;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        java.lang.Class<?> wildcardClass19 = tag18.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.selfClosing;
        org.jsoup.parser.Token.Tag tag9 = startTag7.reset();
        startTag7.appendAttributeName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        org.jsoup.parser.Token.Tag tag14 = tag13.reset();
        tag13.appendAttributeName("Comment");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        java.lang.Class<?> wildcardClass43 = endTag0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeValue("</ >");
        boolean boolean13 = endTag0.isEOF();
        boolean boolean14 = endTag0.isSelfClosing();
        boolean boolean15 = endTag0.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = startTag17.nameAttr("EOF", attributes19);
        boolean boolean21 = startTag20.isDoctype();
        org.jsoup.parser.Token.Tag tag22 = startTag20.reset();
        java.lang.String str23 = startTag20.normalName;
        java.lang.String str24 = startTag20.normalName();
        boolean boolean25 = startTag20.selfClosing;
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        endTag26.appendAttributeValue(' ');
        char[] charArray31 = new char[] { ' ', ' ' };
        endTag26.appendAttributeValue(charArray31);
        endTag26.selfClosing = true;
        org.jsoup.parser.Token.Tag tag36 = endTag26.name("hi!");
        boolean boolean37 = endTag26.isStartTag();
        endTag26.selfClosing = true;
        endTag26.appendAttributeName("EOF");
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
        startTag49.appendAttributeValue(charArray58);
        endTag26.appendAttributeValue(charArray58);
        startTag20.appendAttributeValue(charArray58);
        endTag0.appendAttributeValue(charArray58);
        endTag0.appendAttributeName('4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { 'a', 'a' });
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        java.lang.String str13 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        boolean boolean8 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        doctype0.forceQuirks = true;
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        boolean boolean3 = comment0.bogus;
        boolean boolean4 = comment0.bogus;
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        org.jsoup.parser.Token.TokenType tokenType11 = endTag0.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.String str8 = doctype0.getName();
        java.lang.Class<?> wildcardClass9 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        java.lang.String str4 = comment0.toString();
        org.jsoup.parser.Token token5 = comment0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        tag36.appendTagName(" ");
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
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = startTag58.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeName('#');
        endTag0.selfClosing = true;
        java.lang.String str8 = endTag0.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EndTag" + "'", str8, "EndTag");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        endTag0.appendAttributeName("");
        endTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes7 = endTag0.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        tag16.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag22.nameAttr("", attributes25);
        boolean boolean27 = startTag26.isSelfClosing();
        java.lang.String str28 = startTag26.tagName;
        boolean boolean29 = startTag26.isEndTag();
        boolean boolean30 = startTag26.isEndTag();
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag33.nameAttr("EOF", attributes35);
        boolean boolean37 = startTag36.isDoctype();
        org.jsoup.parser.Token.Tag tag38 = startTag36.reset();
        startTag36.newAttribute();
        org.jsoup.nodes.Attributes attributes40 = startTag36.attributes;
        endTag32.attributes = attributes40;
        org.jsoup.parser.Token.StartTag startTag42 = startTag26.nameAttr("<!---->4", attributes40);
        tag16.attributes = attributes40;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(startTag42);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        tag11.normalName = "eof";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        org.jsoup.nodes.Attributes attributes64 = startTag49.attributes;
        startTag49.appendAttributeValue("4");
        org.jsoup.parser.Token.TokenType tokenType67 = startTag49.type;
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
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertTrue("'" + tokenType67 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType67.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        boolean boolean16 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        org.jsoup.parser.Token.Tag tag23 = startTag21.reset();
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag27 = endTag24.reset();
        endTag24.appendAttributeValue(' ');
        endTag24.newAttribute();
        int[] intArray34 = new int[] { 1, 10, 10 };
        endTag24.appendAttributeValue(intArray34);
        org.jsoup.parser.Token.Tag tag37 = endTag24.name("StartTag");
        org.jsoup.parser.Token.TokenType tokenType38 = tag37.type;
        tag23.type = tokenType38;
        endTag0.type = tokenType38;
        org.jsoup.parser.Token.Tag tag41 = endTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag42 = tag41.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag41);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder13 = doctype0.name;
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
        doctype0.type = tokenType49;
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
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token token1 = doctype0.reset();
        boolean boolean2 = token1.isCharacter();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
            org.jsoup.parser.Token.Character character15 = endTag0.asCharacter();
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        org.jsoup.parser.Token.Tag tag85 = startTag84.reset();
        java.lang.String str86 = tag85.tagName;
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
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        org.jsoup.parser.Token token38 = comment0.reset();
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
        org.junit.Assert.assertNotNull(token38);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        java.lang.String str29 = endTag0.tagName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        endTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNull(attributes18);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        int[] intArray4 = new int[] { (short) 1 };
        endTag0.appendAttributeValue(intArray4);
        endTag0.tagName = "<!---->";
        endTag0.finaliseTag();
        endTag0.appendTagName('4');
        endTag0.tagName = "<<!---->>";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.pubSysKey;
        boolean boolean10 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName('#');
        endTag0.appendTagName("StartTag");
        java.lang.String str6 = endTag0.normalName();
        org.jsoup.parser.Token.TokenType tokenType7 = endTag0.type;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "starttag" + "'", str6, "starttag");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        startTag3.appendAttributeName("<EOF>");
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        startTag7.appendAttributeValue('#');
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
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        boolean boolean25 = tag22.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.String str12 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character13 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        tag5.newAttribute();
        boolean boolean9 = tag5.isSelfClosing();
        boolean boolean10 = tag5.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        java.lang.String str11 = doctype0.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        doctype0.pubSysKey = "";
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        endTag0.normalName = "Character";
        org.jsoup.parser.Token.Tag tag11 = endTag0.name("<!---->");
        boolean boolean12 = tag11.isEndTag();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("EOF", attributes15);
        boolean boolean17 = startTag16.isDoctype();
        org.jsoup.parser.Token.Tag tag18 = startTag16.reset();
        java.lang.String str19 = startTag16.normalName;
        java.lang.String str20 = startTag16.normalName();
        boolean boolean21 = startTag16.selfClosing;
        boolean boolean22 = startTag16.isEOF();
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.appendAttributeValue(' ');
        char[] charArray29 = new char[] { ' ', ' ' };
        endTag24.appendAttributeValue(charArray29);
        endTag24.selfClosing = true;
        org.jsoup.parser.Token.Tag tag34 = endTag24.name("hi!");
        tag34.appendAttributeValue("eof");
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = startTag37.nameAttr("EOF", attributes39);
        boolean boolean41 = startTag40.isDoctype();
        org.jsoup.parser.Token.Tag tag42 = startTag40.reset();
        org.jsoup.parser.Token.StartTag startTag43 = tag42.asStartTag();
        org.jsoup.parser.Token.Tag tag44 = tag42.reset();
        org.jsoup.nodes.Attributes attributes45 = tag42.attributes;
        tag34.attributes = attributes45;
        org.jsoup.parser.Token.StartTag startTag47 = startTag16.nameAttr("EndTag", attributes45);
        tag11.attributes = attributes45;
        tag11.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag50 = tag11.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(startTag47);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        endTag0.appendTagName("4");
        java.lang.String str35 = endTag0.tokenType();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EndTag" + "'", str35, "EndTag");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        java.lang.String str44 = tag42.name();
        tag42.appendAttributeValue("</eof>");
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Comment" + "'", str44, "Comment");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        startTag7.tagName = "</eof>";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        java.lang.String str15 = character11.getData();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<EOF>" + "'", str15, "<EOF>");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.isDoctype();
        endTag0.normalName = "<!---->";
        endTag0.normalName = "EndTag";
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        boolean boolean10 = tag9.isCharacter();
        boolean boolean11 = tag9.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        comment0.bogus = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        java.lang.String str11 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        org.jsoup.parser.Token.EndTag endTag30 = endTag0.asEndTag();
        endTag30.appendAttributeValue(' ');
        endTag30.finaliseTag();
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
        org.junit.Assert.assertNotNull(endTag30);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        boolean boolean7 = tag6.isEndTag();
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str92 = startTag7.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        java.lang.String str12 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype13 = doctype0.asDoctype();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        org.jsoup.parser.Token.reset(stringBuilder12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isStartTag();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.Class<?> wildcardClass9 = doctype0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        org.jsoup.nodes.Attributes attributes17 = endTag0.getAttributes();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(attributes17);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = doctype0.asComment();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        tag8.appendAttributeName(' ');
        org.jsoup.parser.Token.Tag tag22 = tag8.name("<<!---->>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype21 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eof" + "'", str17, "eof");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isEndTag();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        boolean boolean7 = eOF0.isEOF();
        org.jsoup.parser.Token token8 = eOF0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.pubSysKey;
        doctype0.pubSysKey = "hi!#";
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.lang.String str17 = startTag16.toString();
        boolean boolean18 = startTag16.selfClosing;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag19.nameAttr("EOF", attributes24);
        org.jsoup.parser.Token.Tag tag26 = startTag19.reset();
        boolean boolean27 = startTag19.isSelfClosing();
        org.jsoup.parser.Token.Tag tag28 = startTag19.reset();
        boolean boolean29 = startTag19.isComment();
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
        org.jsoup.parser.Token.StartTag startTag53 = startTag19.nameAttr("</hi!>", attributes49);
        org.jsoup.parser.Token.Comment comment54 = new org.jsoup.parser.Token.Comment();
        java.lang.String str55 = comment54.getData();
        java.lang.StringBuilder stringBuilder56 = comment54.data;
        java.lang.String str57 = comment54.toString();
        org.jsoup.parser.Token.EndTag endTag58 = new org.jsoup.parser.Token.EndTag();
        endTag58.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes63 = null;
        org.jsoup.parser.Token.StartTag startTag64 = startTag61.nameAttr("EOF", attributes63);
        boolean boolean65 = startTag64.isDoctype();
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = startTag64.nameAttr("", attributes67);
        org.jsoup.parser.Token.TokenType tokenType69 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag64.type = tokenType69;
        endTag58.type = tokenType69;
        comment54.type = tokenType69;
        org.jsoup.parser.Token token73 = comment54.reset();
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes76 = null;
        org.jsoup.parser.Token.StartTag startTag77 = startTag74.nameAttr("EOF", attributes76);
        org.jsoup.nodes.Attributes attributes79 = null;
        org.jsoup.parser.Token.StartTag startTag80 = startTag74.nameAttr("EOF", attributes79);
        java.lang.String str81 = startTag74.normalName();
        org.jsoup.parser.Token.StartTag startTag82 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes84 = null;
        org.jsoup.parser.Token.StartTag startTag85 = startTag82.nameAttr("EOF", attributes84);
        boolean boolean86 = startTag85.isDoctype();
        org.jsoup.nodes.Attributes attributes88 = null;
        org.jsoup.parser.Token.StartTag startTag89 = startTag85.nameAttr("", attributes88);
        org.jsoup.parser.Token.TokenType tokenType90 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag85.type = tokenType90;
        startTag74.type = tokenType90;
        token73.type = tokenType90;
        startTag19.type = tokenType90;
        startTag16.type = tokenType90;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<eof>" + "'", str17, "<eof>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!---->" + "'", str57, "<!---->");
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertTrue("'" + tokenType69 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType69.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token73);
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertNotNull(startTag80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "eof" + "'", str81, "eof");
        org.junit.Assert.assertNotNull(startTag85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertTrue("'" + tokenType90 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType90.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeName('#');
        boolean boolean6 = endTag0.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        endTag7.appendAttributeValue(' ');
        char[] charArray12 = new char[] { ' ', ' ' };
        endTag7.appendAttributeValue(charArray12);
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.appendAttributeValue(' ');
        char[] charArray19 = new char[] { ' ', ' ' };
        endTag14.appendAttributeValue(charArray19);
        endTag7.appendAttributeValue(charArray19);
        endTag7.tagName = "eof";
        org.jsoup.parser.Token token24 = endTag7.reset();
        boolean boolean25 = endTag7.isComment();
        boolean boolean26 = endTag7.isComment();
        boolean boolean27 = endTag7.selfClosing;
        org.jsoup.parser.Token.TokenType tokenType28 = endTag7.type;
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
        endTag7.appendAttributeValue(charArray45);
        endTag0.appendAttributeValue(charArray45);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.EndTag));
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        endTag0.appendAttributeName('4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        endTag0.finaliseTag();
        endTag0.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        startTag83.appendAttributeValue("starttag");
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
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.isStartTag();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str9 = doctype0.tokenType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        tag10.appendAttributeName(' ');
        tag10.setEmptyAttributeValue();
        tag10.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        boolean boolean4 = comment0.bogus;
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag13 = tag10.asEndTag();
        org.jsoup.nodes.Attributes attributes14 = tag10.attributes;
        org.jsoup.nodes.Attributes attributes15 = tag10.attributes;
        java.lang.String str16 = tag10.tagName;
        boolean boolean17 = tag10.selfClosing;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        startTag0.appendTagName("Comment");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.String str6 = comment0.getData();
        comment0.bogus = true;
        java.lang.String str9 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        boolean boolean8 = endTag0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        tag3.selfClosing = false;
        tag3.normalName = "</StartTag>";
        tag3.appendAttributeName("<starttag>");
        boolean boolean14 = tag3.selfClosing;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        org.jsoup.parser.Token token8 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType9 = token8.type;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes8 = endTag0.getAttributes();
        endTag0.selfClosing = true;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        startTag3.appendAttributeValue('#');
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
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        endTag0.appendAttributeName("</hi!>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        endTag0.appendTagName("hi!</hi!>");
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        boolean boolean7 = doctype6.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype8 = doctype6.asDoctype();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        boolean boolean2 = comment0.bogus;
        boolean boolean3 = comment0.isEndTag();
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = token4.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag8 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = endTag0.reset();
        boolean boolean10 = tag9.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.tokenType();
        java.lang.String str5 = doctype0.pubSysKey;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Doctype" + "'", str4, "Doctype");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.forceQuirks;
        boolean boolean7 = doctype0.isEOF();
        java.lang.String str8 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("</ >");
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token token7 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</ >" + "'", str5, "</ >");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.lang.String str84 = startTag43.toString();
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        doctype0.pubSysKey = "<starttag>";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        tag13.appendAttributeName('a');
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
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        boolean boolean8 = tag7.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data(" ");
        org.jsoup.parser.Token token7 = character6.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        startTag0.finaliseTag();
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
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        endTag0.normalName = "<<starttag>>";
        endTag0.appendAttributeName('#');
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        java.lang.String str8 = startTag0.tokenType();
        startTag0.appendAttributeValue("EndTag");
        boolean boolean11 = startTag0.isComment();
        startTag0.appendTagName('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("</hi!>");
        java.lang.String str7 = character0.toString();
        org.jsoup.parser.Token.Character character9 = character0.data("#");
        java.lang.String str10 = character0.getData();
        org.jsoup.parser.Token.TokenType tokenType11 = character0.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.Class<?> wildcardClass4 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.pubSysKey;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        endTag0.newAttribute();
        endTag0.appendAttributeValue("<eof>");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        java.lang.String str16 = doctype0.pubSysKey;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        java.lang.String str14 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        comment0.bogus = false;
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        java.lang.String str4 = comment0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag0.type = tokenType7;
        org.jsoup.parser.Token.TokenType tokenType9 = endTag0.type;
        endTag0.normalName = "eof4";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token.Character character8 = character0.data("<!---->");
        org.jsoup.parser.Token token9 = character0.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        endTag8.appendAttributeValue(' ');
        char[] charArray13 = new char[] { ' ', ' ' };
        endTag8.appendAttributeValue(charArray13);
        endTag8.selfClosing = true;
        org.jsoup.parser.Token.Tag tag18 = endTag8.name("hi!");
        endTag8.appendAttributeName('a');
        endTag8.appendTagName(' ');
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
        endTag8.appendAttributeValue(intArray45);
        tag7.appendAttributeValue(intArray45);
        org.jsoup.parser.Token.Tag tag50 = tag7.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag50);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        tag10.appendAttributeValue("eof");
        boolean boolean13 = tag10.isEOF();
        tag10.normalName = "</hi!>";
        tag10.appendTagName('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        boolean boolean13 = doctype0.forceQuirks;
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
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        boolean boolean8 = startTag7.selfClosing;
        org.jsoup.parser.Token.Tag tag9 = startTag7.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token.Character character8 = character0.data("<<starttag>>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(character8);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.String str6 = comment0.getData();
        java.lang.String str7 = comment0.getData();
        comment0.bogus = true;
        org.jsoup.parser.Token token10 = comment0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag11 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.setEmptyAttributeValue();
        boolean boolean6 = endTag0.isSelfClosing();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag27.nameAttr("EOF", attributes29);
        boolean boolean31 = startTag30.isDoctype();
        org.jsoup.parser.Token.Tag tag32 = startTag30.reset();
        startTag30.newAttribute();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("EOF", attributes36);
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = startTag34.nameAttr("EOF", attributes39);
        java.lang.String str41 = startTag34.normalName();
        startTag34.newAttribute();
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.parser.Token.StartTag startTag47 = startTag44.nameAttr("EOF", attributes46);
        boolean boolean48 = startTag47.isDoctype();
        org.jsoup.parser.Token.Tag tag49 = startTag47.reset();
        java.lang.String str50 = startTag47.normalName;
        java.lang.String str51 = startTag47.normalName();
        boolean boolean52 = startTag47.selfClosing;
        java.lang.String str53 = startTag47.tagName;
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = startTag55.nameAttr("EOF", attributes57);
        boolean boolean59 = startTag58.isDoctype();
        org.jsoup.parser.Token.Tag tag60 = startTag58.reset();
        org.jsoup.parser.Token.StartTag startTag61 = tag60.asStartTag();
        org.jsoup.parser.Token.Tag tag62 = tag60.reset();
        org.jsoup.nodes.Attributes attributes63 = tag60.attributes;
        org.jsoup.parser.Token.StartTag startTag64 = startTag47.nameAttr("", attributes63);
        org.jsoup.parser.Token.StartTag startTag65 = startTag34.nameAttr("eof", attributes63);
        startTag30.attributes = attributes63;
        startTag3.attributes = attributes63;
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
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "eof" + "'", str41, "eof");
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(startTag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(startTag65);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        java.lang.Class<?> wildcardClass15 = endTag0.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(endTag14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("hi!EndTag");
        boolean boolean10 = tag9.isComment();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        endTag0.normalName = "hi!";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</hi!>" + "'", str14, "</hi!>");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        org.jsoup.parser.Token.Tag tag13 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes14 = tag13.getAttributes();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype4.getName();
        java.lang.String str6 = doctype4.getPubSysKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token.Character character8 = character0.data("<!---->");
        java.lang.String str9 = character0.getData();
        java.lang.String str10 = character0.getData();
        java.lang.String str11 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isEndTag();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = eOF0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        java.lang.String str13 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token14 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("hi!EndTag");
        startTag0.appendTagName("</</eof>>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        endTag0.appendAttributeName(' ');
        java.lang.String str6 = endTag0.tokenType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EndTag" + "'", str6, "EndTag");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        boolean boolean23 = endTag0.isEOF();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        boolean boolean85 = tag9.isSelfClosing();
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
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        boolean boolean15 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        java.lang.String str18 = doctype0.getPublicIdentifier();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        java.lang.String str41 = startTag14.tagName;
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "starttag" + "'", str41, "starttag");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        java.lang.StringBuilder stringBuilder74 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        java.lang.String str23 = comment0.tokenType();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Comment" + "'", str23, "Comment");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        java.lang.String str11 = doctype0.pubSysKey;
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
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        boolean boolean10 = startTag6.selfClosing;
        java.lang.String str11 = startTag6.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eof" + "'", str11, "eof");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        java.lang.String str11 = doctype0.getPublicIdentifier();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        org.jsoup.parser.Token.Character character7 = new org.jsoup.parser.Token.Character();
        java.lang.String str8 = character7.getData();
        org.jsoup.parser.Token.TokenType tokenType9 = character7.type;
        token6.type = tokenType9;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        org.jsoup.parser.Token token3 = comment0.reset();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token token3 = character0.reset();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("<!---->");
        java.lang.String str7 = character0.getData();
        org.jsoup.parser.Token token8 = character0.reset();
        org.jsoup.parser.Token token9 = character0.reset();
        boolean boolean10 = token9.isEndTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        java.lang.String str8 = startTag0.tokenType();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag9.nameAttr("EOF", attributes11);
        boolean boolean13 = startTag12.isDoctype();
        org.jsoup.parser.Token.Tag tag14 = startTag12.reset();
        java.lang.String str15 = startTag12.normalName;
        java.lang.String str16 = startTag12.normalName();
        boolean boolean17 = startTag12.selfClosing;
        java.lang.String str18 = startTag12.tagName;
        boolean boolean19 = startTag12.isEOF();
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
        startTag12.appendAttributeValue(intArray43);
        startTag0.appendAttributeValue(intArray43);
        boolean boolean48 = startTag0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag49 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes1 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("</hi!>");
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        java.lang.String str5 = endTag0.name();
        org.junit.Assert.assertNull(attributes1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        tag9.setEmptyAttributeValue();
        boolean boolean17 = tag9.isSelfClosing();
        int[] intArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tag9.appendAttributeValue(intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        endTag0.finaliseTag();
        endTag0.tagName = "</hi!#>";
        org.jsoup.nodes.Attributes attributes6 = endTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes7 = endTag0.getAttributes();
        java.lang.String str8 = endTag0.toString();
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</</hi!#>>" + "'", str8, "</</hi!#>>");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.pubSysKey;
        doctype0.pubSysKey = "hi!#";
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        java.lang.String str48 = endTag0.toString();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "</eofa>" + "'", str48, "</eofa>");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        tag10.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes16 = tag10.getAttributes();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        org.jsoup.parser.Token.TokenType tokenType13 = doctype0.type;
        java.lang.StringBuilder stringBuilder14 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        boolean boolean18 = endTag0.isComment();
        org.jsoup.parser.Token.Tag tag19 = endTag0.reset();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        boolean boolean87 = startTag0.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token8 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = startTag47.nameAttr("EOF", attributes49);
        boolean boolean51 = startTag50.isDoctype();
        org.jsoup.parser.Token.Tag tag52 = startTag50.reset();
        org.jsoup.parser.Token.StartTag startTag53 = tag52.asStartTag();
        org.jsoup.parser.Token.Tag tag54 = tag52.reset();
        org.jsoup.nodes.Attributes attributes55 = tag52.attributes;
        endTag0.attributes = attributes55;
        org.jsoup.nodes.Attributes attributes57 = endTag0.getAttributes();
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
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertNotNull(attributes57);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment16 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        boolean boolean35 = startTag6.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = tag10.isEndTag();
        java.lang.String str12 = tag10.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag13 = tag10.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        java.lang.String str13 = doctype0.getSystemIdentifier();
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
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        tag12.appendAttributeName("<<!---->>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        startTag7.tagName = "hi! ";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<EOF>" + "'", str7, "<EOF>");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag47 = startTag44.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        java.lang.String str18 = tag17.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character19 = tag17.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.getData();
        comment0.bogus = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        org.jsoup.parser.Token.EndTag endTag20 = tag17.asEndTag();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(endTag20);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        tag20.appendAttributeName("</eofa>");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!#" + "'", str18, "hi!#");
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getName();
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.String str8 = doctype0.getPubSysKey();
        boolean boolean9 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        java.lang.String str11 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eof" + "'", str8, "eof");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        org.jsoup.parser.Token.Character character10 = character0.data("<hi!>");
        java.lang.String str11 = character0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = character0.asEndTag();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!>" + "'", str11, "<hi!>");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        tag14.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getPubSysKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        java.lang.String str3 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendAttributeValue('4');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.toString();
        java.lang.String str7 = character0.getData();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        java.lang.String str6 = character0.toString();
        java.lang.String str7 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        tag6.appendTagName("starttag");
        org.jsoup.parser.Token.Tag tag10 = tag6.name("</ >");
        org.jsoup.nodes.Attributes attributes11 = tag10.getAttributes();
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        boolean boolean9 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        startTag8.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype14 = startTag8.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!>" + "'", str12, "<hi!>");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', ' ' };
        endTag4.appendAttributeValue(charArray9);
        endTag4.selfClosing = true;
        org.jsoup.parser.Token.Tag tag14 = endTag4.name("hi!");
        endTag4.appendAttributeName('a');
        endTag4.appendTagName(' ');
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = startTag19.nameAttr("EOF", attributes21);
        boolean boolean23 = startTag22.isDoctype();
        startTag22.tagName = "<!---->";
        java.lang.String str26 = startTag22.tagName;
        boolean boolean27 = startTag22.isEOF();
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        endTag28.appendAttributeValue(' ');
        char[] charArray33 = new char[] { ' ', ' ' };
        endTag28.appendAttributeValue(charArray33);
        endTag28.selfClosing = true;
        org.jsoup.parser.Token.Tag tag38 = endTag28.name("hi!");
        tag38.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag41 = tag38.asEndTag();
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        endTag42.finaliseTag();
        boolean boolean44 = endTag42.isCharacter();
        int[] intArray46 = new int[] { (short) 1 };
        endTag42.appendAttributeValue(intArray46);
        endTag41.appendAttributeValue(intArray46);
        startTag22.appendAttributeValue(intArray46);
        org.jsoup.parser.Token.EndTag endTag50 = new org.jsoup.parser.Token.EndTag();
        boolean boolean51 = endTag50.isSelfClosing();
        endTag50.normalName = "";
        endTag50.finaliseTag();
        org.jsoup.nodes.Attributes attributes55 = endTag50.attributes;
        endTag50.appendAttributeValue('#');
        endTag50.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes60 = endTag50.getAttributes();
        java.lang.String str61 = endTag50.name();
        org.jsoup.parser.Token.EndTag endTag62 = new org.jsoup.parser.Token.EndTag();
        endTag62.appendAttributeValue(' ');
        char[] charArray67 = new char[] { ' ', ' ' };
        endTag62.appendAttributeValue(charArray67);
        endTag62.selfClosing = true;
        org.jsoup.parser.Token.Tag tag72 = endTag62.name("hi!");
        endTag62.appendAttributeName('a');
        int[] intArray79 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag62.appendAttributeValue(intArray79);
        endTag50.appendAttributeValue(intArray79);
        startTag22.appendAttributeValue(intArray79);
        endTag4.appendAttributeValue(intArray79);
        tag3.appendAttributeValue(intArray79);
        org.jsoup.parser.Token.Tag tag85 = tag3.reset();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(endTag41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(attributes55);
        org.junit.Assert.assertNull(attributes60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag85);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        doctype0.pubSysKey = "";
        java.lang.String str9 = doctype0.getSystemIdentifier();
        boolean boolean10 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        boolean boolean14 = character13.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        org.jsoup.parser.Token token14 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        endTag0.normalName = "</ >";
        org.jsoup.parser.Token token9 = endTag0.reset();
        org.jsoup.parser.Token.Tag tag11 = endTag0.name("hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        java.lang.String str4 = comment3.getData();
        org.jsoup.parser.Token token5 = comment3.reset();
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        tag10.newAttribute();
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data(" ");
        org.jsoup.parser.Token.Character character8 = character0.data("hi!#");
        java.lang.String str9 = character0.toString();
        java.lang.String str10 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!#" + "'", str9, "hi!#");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!#" + "'", str10, "hi!#");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token.Character character8 = character0.data("<!---->");
        org.jsoup.parser.Token token9 = character8.reset();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.appendAttributeValue(' ');
        char[] charArray15 = new char[] { ' ', ' ' };
        endTag10.appendAttributeValue(charArray15);
        org.jsoup.parser.Token.TokenType tokenType17 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag10.type = tokenType17;
        token9.type = tokenType17;
        org.jsoup.parser.Token.TokenType tokenType20 = token9.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token8 = doctype0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = token8.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        tag16.normalName = "hi!#";
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        org.jsoup.parser.Token token13 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Comment" + "'", str12, "Comment");
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        org.jsoup.parser.Token.Tag tag12 = startTag7.reset();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.nameAttr("EOF", attributes16);
        boolean boolean18 = startTag17.isDoctype();
        org.jsoup.parser.Token.Tag tag19 = startTag17.reset();
        java.lang.String str20 = startTag17.normalName;
        java.lang.String str21 = startTag17.normalName();
        boolean boolean22 = startTag17.selfClosing;
        java.lang.String str23 = startTag17.tagName;
        boolean boolean24 = startTag17.isEOF();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = startTag29.nameAttr("", attributes32);
        boolean boolean34 = startTag33.isSelfClosing();
        java.lang.String str35 = startTag33.tagName;
        boolean boolean36 = startTag33.isEndTag();
        boolean boolean37 = startTag33.isEndTag();
        org.jsoup.parser.Token.EndTag endTag39 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = startTag40.nameAttr("EOF", attributes42);
        boolean boolean44 = startTag43.isDoctype();
        org.jsoup.parser.Token.Tag tag45 = startTag43.reset();
        startTag43.newAttribute();
        org.jsoup.nodes.Attributes attributes47 = startTag43.attributes;
        endTag39.attributes = attributes47;
        org.jsoup.parser.Token.StartTag startTag49 = startTag33.nameAttr("<!---->4", attributes47);
        org.jsoup.parser.Token.StartTag startTag50 = startTag17.nameAttr("<<!---->>", attributes47);
        org.jsoup.parser.Token.StartTag startTag51 = startTag7.nameAttr("StartTag", attributes47);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertNotNull(startTag51);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType8;
        boolean boolean10 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendAttributeName('#');
        endTag0.selfClosing = true;
        java.lang.String str8 = endTag0.tokenType();
        endTag0.normalName = "<eof>";
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = startTag11.nameAttr("EOF", attributes13);
        boolean boolean15 = startTag14.isDoctype();
        org.jsoup.parser.Token.Tag tag16 = startTag14.reset();
        java.lang.String str17 = startTag14.normalName;
        java.lang.String str18 = startTag14.normalName();
        startTag14.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag20 = startTag14.reset();
        startTag14.setEmptyAttributeValue();
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Character;
        startTag14.type = tokenType22;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = startTag25.nameAttr("EOF", attributes27);
        boolean boolean29 = startTag28.isDoctype();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = startTag28.nameAttr("", attributes31);
        boolean boolean33 = startTag32.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = startTag35.nameAttr("EOF", attributes37);
        boolean boolean39 = startTag38.isDoctype();
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag38.nameAttr("", attributes41);
        boolean boolean43 = startTag42.isSelfClosing();
        java.lang.String str44 = startTag42.tagName;
        boolean boolean45 = startTag42.isEndTag();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = startTag47.nameAttr("EOF", attributes49);
        boolean boolean51 = startTag50.isDoctype();
        org.jsoup.parser.Token.Tag tag52 = startTag50.reset();
        org.jsoup.parser.Token.StartTag startTag53 = tag52.asStartTag();
        org.jsoup.parser.Token.EndTag endTag55 = new org.jsoup.parser.Token.EndTag();
        endTag55.finaliseTag();
        endTag55.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes61 = null;
        org.jsoup.parser.Token.StartTag startTag62 = startTag59.nameAttr("EOF", attributes61);
        boolean boolean63 = startTag62.isDoctype();
        org.jsoup.parser.Token.EndTag endTag65 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag66 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes68 = null;
        org.jsoup.parser.Token.StartTag startTag69 = startTag66.nameAttr("EOF", attributes68);
        boolean boolean70 = startTag69.isDoctype();
        org.jsoup.parser.Token.Tag tag71 = startTag69.reset();
        startTag69.newAttribute();
        org.jsoup.nodes.Attributes attributes73 = startTag69.attributes;
        endTag65.attributes = attributes73;
        org.jsoup.parser.Token.StartTag startTag75 = startTag62.nameAttr("eof", attributes73);
        endTag55.attributes = attributes73;
        org.jsoup.parser.Token.StartTag startTag77 = startTag53.nameAttr("<!---->", attributes73);
        org.jsoup.parser.Token.StartTag startTag78 = startTag42.nameAttr("starttag", attributes73);
        org.jsoup.parser.Token.StartTag startTag79 = startTag32.nameAttr("EOF", attributes73);
        org.jsoup.parser.Token.StartTag startTag80 = startTag14.nameAttr("</</hi!>>", attributes73);
        endTag0.attributes = attributes73;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EndTag" + "'", str8, "EndTag");
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(startTag69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(startTag75);
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertNotNull(startTag79);
        org.junit.Assert.assertNotNull(startTag80);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token8 = doctype0.reset();
        doctype0.forceQuirks = false;
        boolean boolean11 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = doctype0.asComment();
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
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.String str7 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        boolean boolean7 = startTag6.isStartTag();
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isSelfClosing();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        org.jsoup.nodes.Attributes attributes99 = tag10.getAttributes();
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
        org.junit.Assert.assertNull(attributes99);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        boolean boolean10 = doctype0.isComment();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.String str12 = comment11.getData();
        java.lang.StringBuilder stringBuilder13 = comment11.data;
        java.lang.String str14 = comment11.toString();
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        endTag15.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = startTag18.nameAttr("EOF", attributes20);
        boolean boolean22 = startTag21.isDoctype();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag21.nameAttr("", attributes24);
        org.jsoup.parser.Token.TokenType tokenType26 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag21.type = tokenType26;
        endTag15.type = tokenType26;
        comment11.type = tokenType26;
        org.jsoup.parser.Token token30 = comment11.reset();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = startTag31.nameAttr("EOF", attributes33);
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag31.nameAttr("EOF", attributes36);
        java.lang.String str38 = startTag31.normalName();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = startTag39.nameAttr("EOF", attributes41);
        boolean boolean43 = startTag42.isDoctype();
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = startTag42.nameAttr("", attributes45);
        org.jsoup.parser.Token.TokenType tokenType47 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag42.type = tokenType47;
        startTag31.type = tokenType47;
        token30.type = tokenType47;
        doctype0.type = tokenType47;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token30);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "eof" + "'", str38, "eof");
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertTrue("'" + tokenType47 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType47.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        org.jsoup.parser.Token.Character character17 = character8.data("starttag");
        org.jsoup.parser.Token token18 = character8.reset();
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
        org.junit.Assert.assertNotNull(character17);
        org.junit.Assert.assertNotNull(token18);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        endTag0.appendAttributeName("");
        endTag0.appendAttributeValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isDoctype();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        java.lang.String str24 = startTag20.tagName;
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.String str10 = doctype0.getPublicIdentifier();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        boolean boolean13 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Comment" + "'", str12, "Comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        org.jsoup.parser.Token.Tag tag10 = startTag3.name("<starttag>");
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
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data("</hi!>");
        org.jsoup.parser.Token token7 = character6.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = character6.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        org.jsoup.parser.Token.Comment comment3 = comment0.asComment();
        java.lang.String str4 = comment3.getData();
        boolean boolean5 = comment3.bogus;
        org.junit.Assert.assertNotNull(comment3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.String str7 = doctype0.pubSysKey;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        tag11.appendAttributeValue("EndTag");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.appendAttributeName('a');
        boolean boolean13 = endTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.nameAttr("EOF", attributes16);
        java.lang.String str18 = startTag14.normalName();
        startTag14.tagName = "hi!";
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = startTag21.nameAttr("EOF", attributes23);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = startTag26.nameAttr("EOF", attributes28);
        boolean boolean30 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag31 = startTag29.reset();
        org.jsoup.parser.Token.StartTag startTag32 = tag31.asStartTag();
        org.jsoup.parser.Token.Tag tag33 = tag31.reset();
        org.jsoup.nodes.Attributes attributes34 = tag31.attributes;
        org.jsoup.parser.Token.StartTag startTag35 = startTag24.nameAttr("starttag", attributes34);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = startTag36.nameAttr("EOF", attributes38);
        boolean boolean40 = startTag39.isDoctype();
        org.jsoup.parser.Token.Tag tag41 = startTag39.reset();
        org.jsoup.parser.Token.Tag tag42 = tag41.reset();
        tag42.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag44 = tag42.asStartTag();
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag();
        endTag45.appendAttributeValue(' ');
        char[] charArray50 = new char[] { ' ', ' ' };
        endTag45.appendAttributeValue(charArray50);
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag();
        endTag52.appendAttributeValue(' ');
        char[] charArray57 = new char[] { ' ', ' ' };
        endTag52.appendAttributeValue(charArray57);
        endTag45.appendAttributeValue(charArray57);
        tag42.appendAttributeValue(charArray57);
        startTag35.appendAttributeValue(charArray57);
        startTag14.appendAttributeValue(charArray57);
        endTag0.appendAttributeValue(charArray57);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "eof" + "'", str18, "eof");
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { ' ', ' ' });
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        java.lang.String str9 = character0.getData();
        boolean boolean10 = character0.isCharacter();
        boolean boolean11 = character0.isEOF();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        java.lang.Class<?> wildcardClass78 = endTag13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        comment0.bogus = true;
        boolean boolean8 = comment0.bogus;
        java.lang.String str9 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        java.lang.String str47 = startTag44.normalName();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<<hi!>>" + "'", str47, "<<hi!>>");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        tag17.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 10, 10 });
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        java.lang.String str81 = startTag43.normalName();
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
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "starttag" + "'", str81, "starttag");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        boolean boolean64 = endTag0.isSelfClosing();
        java.lang.String str65 = endTag0.tokenType();
        org.jsoup.parser.Token.EndTag endTag66 = new org.jsoup.parser.Token.EndTag();
        boolean boolean67 = endTag66.isSelfClosing();
        endTag66.normalName = "";
        boolean boolean70 = endTag66.selfClosing;
        endTag66.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag73 = endTag66.asEndTag();
        boolean boolean74 = endTag73.selfClosing;
        boolean boolean75 = endTag73.selfClosing;
        org.jsoup.parser.Token.StartTag startTag76 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes78 = null;
        org.jsoup.parser.Token.StartTag startTag79 = startTag76.nameAttr("EOF", attributes78);
        java.lang.String str80 = startTag79.toString();
        org.jsoup.parser.Token.Tag tag81 = startTag79.reset();
        org.jsoup.nodes.Attributes attributes82 = startTag79.getAttributes();
        endTag73.attributes = attributes82;
        endTag0.attributes = attributes82;
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "EndTag" + "'", str65, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(endTag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(startTag79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "<EOF>" + "'", str80, "<EOF>");
        org.junit.Assert.assertNotNull(tag81);
        org.junit.Assert.assertNotNull(attributes82);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        startTag3.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        endTag10.appendAttributeValue(' ');
        char[] charArray15 = new char[] { ' ', ' ' };
        endTag10.appendAttributeValue(charArray15);
        endTag10.selfClosing = true;
        org.jsoup.parser.Token.Tag tag20 = endTag10.name("hi!");
        boolean boolean21 = tag20.isEndTag();
        org.jsoup.parser.Token token22 = tag20.reset();
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
        tag20.appendAttributeValue(charArray39);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = startTag43.nameAttr("EOF", attributes45);
        boolean boolean47 = startTag46.isDoctype();
        org.jsoup.parser.Token.Tag tag48 = startTag46.reset();
        java.lang.String str49 = startTag46.normalName;
        java.lang.String str50 = startTag46.normalName();
        boolean boolean51 = startTag46.selfClosing;
        java.lang.String str52 = startTag46.tagName;
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes56 = null;
        org.jsoup.parser.Token.StartTag startTag57 = startTag54.nameAttr("EOF", attributes56);
        boolean boolean58 = startTag57.isDoctype();
        org.jsoup.parser.Token.Tag tag59 = startTag57.reset();
        org.jsoup.parser.Token.StartTag startTag60 = tag59.asStartTag();
        org.jsoup.parser.Token.Tag tag61 = tag59.reset();
        org.jsoup.nodes.Attributes attributes62 = tag59.attributes;
        org.jsoup.parser.Token.StartTag startTag63 = startTag46.nameAttr("", attributes62);
        startTag46.normalName = "";
        org.jsoup.parser.Token.EndTag endTag66 = new org.jsoup.parser.Token.EndTag();
        endTag66.appendAttributeValue(' ');
        char[] charArray71 = new char[] { ' ', ' ' };
        endTag66.appendAttributeValue(charArray71);
        org.jsoup.parser.Token.EndTag endTag73 = endTag66.asEndTag();
        char[] charArray79 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag66.appendAttributeValue(charArray79);
        startTag46.appendAttributeValue(charArray79);
        tag20.appendAttributeValue(charArray79);
        startTag3.appendAttributeValue(charArray79);
        startTag3.appendTagName("#");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(token22);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag73);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data(" ");
        java.lang.String str7 = character0.tokenType();
        org.jsoup.parser.Token.TokenType tokenType8 = character0.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Character" + "'", str7, "Character");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        java.lang.StringBuilder stringBuilder8 = doctype6.name;
        doctype6.forceQuirks = true;
        doctype6.forceQuirks = false;
        org.jsoup.parser.Token token13 = doctype6.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(token13);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        tag9.selfClosing = false;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        doctype0.pubSysKey = "";
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token8 = doctype0.reset();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        startTag43.appendAttributeValue(' ');
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
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        tag10.appendTagName("hi!</hi!>");
        tag10.normalName = "";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        java.lang.String str9 = comment0.getData();
        java.lang.String str10 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token token2 = comment0.reset();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPubSysKey();
        boolean boolean5 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        endTag0.normalName = "Character";
        org.jsoup.parser.Token.Tag tag11 = endTag0.name("<!---->");
        java.lang.String str12 = endTag0.normalName;
        endTag0.appendTagName("eof");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        boolean boolean5 = character0.isDoctype();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token token7 = character0.reset();
        org.jsoup.parser.Token.Character character9 = character0.data("<<starttag>>");
        java.lang.String str10 = character0.getData();
        boolean boolean11 = character0.isEndTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<starttag>>" + "'", str10, "<<starttag>>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        boolean boolean33 = startTag3.selfClosing;
        org.jsoup.nodes.Attributes attributes34 = startTag3.getAttributes();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes34);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        startTag7.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        boolean boolean12 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token13 = doctype0.reset();
        java.lang.String str14 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        startTag7.normalName = "<<!---->>";
        org.jsoup.nodes.Attributes attributes64 = startTag7.attributes;
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
        org.junit.Assert.assertNotNull(attributes64);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        org.jsoup.parser.Token.Character character8 = character0.data("<!---->");
        org.jsoup.parser.Token token9 = character8.reset();
        java.lang.String str10 = character8.toString();
        org.jsoup.parser.Token token11 = character8.reset();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "eof";
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder13 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.Tag tag6 = endTag0.name(" ");
        endTag0.tagName = "eof";
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = startTag9.nameAttr("EOF", attributes11);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = startTag9.nameAttr("EOF", attributes14);
        org.jsoup.parser.Token.Tag tag16 = startTag9.reset();
        java.lang.String str17 = tag16.tagName;
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        endTag18.appendAttributeValue(' ');
        char[] charArray23 = new char[] { ' ', ' ' };
        endTag18.appendAttributeValue(charArray23);
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag18.type = tokenType25;
        org.jsoup.parser.Token.Tag tag28 = endTag18.name("eof");
        java.lang.String str29 = tag28.name();
        java.lang.String str30 = tag28.tagName;
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.appendAttributeValue(' ');
        char[] charArray36 = new char[] { ' ', ' ' };
        endTag31.appendAttributeValue(charArray36);
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.appendAttributeValue(' ');
        char[] charArray43 = new char[] { ' ', ' ' };
        endTag38.appendAttributeValue(charArray43);
        endTag31.appendAttributeValue(charArray43);
        endTag31.tagName = "eof";
        java.lang.String str48 = endTag31.name();
        org.jsoup.parser.Token.EndTag endTag49 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = startTag50.nameAttr("EOF", attributes52);
        boolean boolean54 = startTag53.isDoctype();
        org.jsoup.parser.Token.Tag tag55 = startTag53.reset();
        startTag53.newAttribute();
        org.jsoup.nodes.Attributes attributes57 = startTag53.attributes;
        endTag49.attributes = attributes57;
        endTag31.attributes = attributes57;
        tag28.attributes = attributes57;
        tag16.attributes = attributes57;
        endTag0.attributes = attributes57;
        boolean boolean63 = endTag0.isDoctype();
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "eof" + "'", str29, "eof");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "eof" + "'", str30, "eof");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { ' ', ' ' });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "eof" + "'", str48, "eof");
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isComment();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        doctype0.pubSysKey = "";
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        startTag36.normalName = "";
        org.jsoup.parser.Token.EndTag endTag56 = new org.jsoup.parser.Token.EndTag();
        endTag56.appendAttributeValue(' ');
        char[] charArray61 = new char[] { ' ', ' ' };
        endTag56.appendAttributeValue(charArray61);
        org.jsoup.parser.Token.EndTag endTag63 = endTag56.asEndTag();
        char[] charArray69 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag56.appendAttributeValue(charArray69);
        startTag36.appendAttributeValue(charArray69);
        tag10.appendAttributeValue(charArray69);
        tag10.appendTagName(' ');
        java.lang.String str75 = tag10.tokenType();
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
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag63);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '#', '#', ' ', 'a', ' ' });
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "EndTag" + "'", str75, "EndTag");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        boolean boolean7 = comment0.isCharacter();
        boolean boolean8 = comment0.bogus;
        java.lang.String str9 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        java.lang.String str34 = startTag3.tagName;
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
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.jsoup.nodes.Attributes attributes45 = startTag43.attributes;
        startTag43.appendAttributeName("EndTag");
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
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        comment0.bogus = true;
        boolean boolean14 = comment0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        boolean boolean4 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        java.lang.String str14 = comment0.getData();
        java.lang.String str15 = comment0.toString();
        java.lang.String str16 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        boolean boolean7 = startTag6.isStartTag();
        startTag6.finaliseTag();
        java.lang.String str9 = startTag6.name();
        startTag6.appendAttributeName("");
        boolean boolean12 = startTag6.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.appendTagName("eof");
        endTag0.appendAttributeValue("<StartTag>");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        startTag74.setEmptyAttributeValue();
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
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        org.jsoup.nodes.Attributes attributes36 = tag8.attributes;
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
        org.junit.Assert.assertNull(attributes36);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        tag10.appendAttributeName("hi!EndTag");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        startTag43.selfClosing = false;
        startTag43.appendTagName('4');
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
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        org.jsoup.parser.Token.reset(stringBuilder5);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token.TokenType tokenType8 = comment7.type;
        comment7.bogus = false;
        java.lang.String str11 = comment7.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token token7 = startTag3.reset();
        startTag3.appendAttributeName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("<starttag>");
        org.jsoup.parser.Token.Character character10 = character8.data("");
        boolean boolean11 = character8.isEOF();
        org.jsoup.parser.Token.Character character13 = character8.data("eof");
        java.lang.String str14 = character8.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "eof" + "'", str14, "eof");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        java.lang.String str12 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        endTag0.tagName = "comment";
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
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        java.lang.String str31 = startTag29.normalName();
        startTag29.finaliseTag();
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
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.setEmptyAttributeValue();
        endTag0.appendAttributeName("</ >");
        java.lang.String str10 = endTag0.tagName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        org.jsoup.parser.Token.Tag tag8 = startTag3.reset();
        tag8.selfClosing = true;
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
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        endTag32.appendAttributeValue(' ');
        char[] charArray37 = new char[] { ' ', ' ' };
        endTag32.appendAttributeValue(charArray37);
        endTag32.selfClosing = true;
        org.jsoup.parser.Token.Tag tag42 = endTag32.name("hi!");
        boolean boolean43 = endTag32.isStartTag();
        endTag32.normalName = "eof";
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        endTag46.appendAttributeValue(' ');
        endTag46.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag51 = new org.jsoup.parser.Token.EndTag();
        endTag51.appendAttributeValue(' ');
        char[] charArray56 = new char[] { ' ', ' ' };
        endTag51.appendAttributeValue(charArray56);
        endTag51.selfClosing = true;
        org.jsoup.parser.Token.Tag tag61 = endTag51.name("hi!");
        endTag51.appendAttributeName('a');
        int[] intArray68 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag51.appendAttributeValue(intArray68);
        endTag46.appendAttributeValue(intArray68);
        endTag32.appendAttributeValue(intArray68);
        org.jsoup.parser.Token token72 = endTag32.reset();
        java.lang.String str73 = endTag32.normalName();
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
        tag82.appendAttributeValue(charArray90);
        endTag32.appendAttributeValue(charArray90);
        endTag24.appendAttributeValue(charArray90);
        tag8.appendAttributeValue(charArray90);
        boolean boolean96 = tag8.isEOF();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(endTag24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1 });
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(token72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(startTag81);
        org.junit.Assert.assertNotNull(tag82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertArrayEquals(charArray90, new char[] { 'a', 'a' });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        java.lang.String str23 = startTag3.tokenType();
        boolean boolean24 = startTag3.isDoctype();
        boolean boolean25 = startTag3.isDoctype();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        org.jsoup.parser.Token.Character character17 = character8.data("starttag");
        java.lang.String str18 = character8.toString();
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
        org.junit.Assert.assertNotNull(character17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "starttag" + "'", str18, "starttag");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        boolean boolean4 = comment0.bogus;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        boolean boolean7 = comment0.isEndTag();
        org.jsoup.parser.Token token8 = comment0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = tag10.isEndTag();
        org.jsoup.parser.Token token12 = tag10.reset();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        boolean boolean14 = endTag13.isSelfClosing();
        endTag13.normalName = "";
        endTag13.finaliseTag();
        org.jsoup.nodes.Attributes attributes18 = endTag13.attributes;
        endTag13.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag21 = endTag13.reset();
        org.jsoup.parser.Token.Tag tag22 = endTag13.reset();
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        boolean boolean24 = endTag23.isSelfClosing();
        endTag23.normalName = "";
        boolean boolean27 = endTag23.selfClosing;
        org.jsoup.parser.Token.Tag tag29 = endTag23.name("eof");
        org.jsoup.parser.Token.Tag tag31 = endTag23.name("</hi!>");
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        endTag32.appendAttributeValue(' ');
        char[] charArray37 = new char[] { ' ', ' ' };
        endTag32.appendAttributeValue(charArray37);
        endTag32.selfClosing = true;
        org.jsoup.parser.Token.Tag tag42 = endTag32.name("hi!");
        endTag32.appendAttributeName('a');
        int[] intArray49 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag32.appendAttributeValue(intArray49);
        org.jsoup.parser.Token.EndTag endTag51 = new org.jsoup.parser.Token.EndTag();
        endTag51.finaliseTag();
        boolean boolean53 = endTag51.isCharacter();
        int[] intArray55 = new int[] { (short) 1 };
        endTag51.appendAttributeValue(intArray55);
        endTag32.appendAttributeValue(intArray55);
        tag31.appendAttributeValue(intArray55);
        tag22.appendAttributeValue(intArray55);
        tag10.appendAttributeValue(intArray55);
        java.lang.String str61 = tag10.tagName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 1 });
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        org.jsoup.parser.Token token7 = startTag3.reset();
        org.jsoup.parser.Token.TokenType tokenType8 = startTag3.type;
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        tag9.appendAttributeName('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        boolean boolean12 = doctype0.isForceQuirks();
        org.jsoup.parser.Token token13 = doctype0.reset();
        org.jsoup.parser.Token token14 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.String str7 = comment0.getData();
        boolean boolean8 = comment0.bogus;
        org.jsoup.parser.Token token9 = comment0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.pubSysKey;
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.jsoup.parser.Token token9 = doctype0.reset();
        boolean boolean10 = token9.isEndTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.pubSysKey;
        java.lang.String str5 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        org.jsoup.parser.Token token7 = doctype6.reset();
        java.lang.StringBuilder stringBuilder8 = doctype6.name;
        doctype6.forceQuirks = true;
        java.lang.StringBuilder stringBuilder11 = doctype6.name;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doctype6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        org.jsoup.nodes.Attributes attributes11 = startTag3.attributes;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        java.lang.String str37 = startTag36.tagName;
        java.lang.String str38 = startTag36.normalName();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<<!---->>" + "'", str37, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<<!---->>" + "'", str38, "<<!---->>");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        boolean boolean6 = tag5.selfClosing;
        boolean boolean7 = tag5.isSelfClosing();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        startTag30.tagName = "<<!---->>";
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
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        boolean boolean18 = endTag0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment19 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token token6 = character0.reset();
        java.lang.String str7 = character0.toString();
        java.lang.String str8 = character0.getData();
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

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        org.jsoup.parser.Token.Tag tag82 = startTag43.reset();
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
        org.junit.Assert.assertNotNull(tag82);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        startTag3.newAttribute();
        startTag3.appendTagName("<hi!>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        doctype0.pubSysKey = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        org.jsoup.nodes.Attributes attributes69 = startTag68.getAttributes();
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
        org.junit.Assert.assertNotNull(attributes69);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        endTag0.newAttribute();
        org.jsoup.parser.Token.EndTag endTag4 = endTag0.asEndTag();
        boolean boolean5 = endTag4.selfClosing;
        endTag4.appendTagName('4');
        org.junit.Assert.assertNotNull(endTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        boolean boolean4 = endTag0.selfClosing;
        endTag0.appendAttributeName(' ');
        org.jsoup.parser.Token.EndTag endTag7 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = endTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(endTag7);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPubSysKey();
        java.lang.String str6 = doctype0.pubSysKey;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isStartTag();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.pubSysKey;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        org.jsoup.parser.Token.Character character10 = character0.data("<hi!>");
        boolean boolean11 = character10.isCharacter();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        comment0.bogus = false;
        org.jsoup.parser.Token token4 = comment0.reset();
        boolean boolean5 = comment0.isCharacter();
        boolean boolean6 = comment0.isComment();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        comment0.bogus = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        java.lang.String str1 = eOF0.tokenType();
        org.jsoup.parser.Token token2 = eOF0.reset();
        boolean boolean3 = eOF0.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType4 = eOF0.type;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EOF" + "'", str1, "EOF");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        endTag0.appendAttributeName("");
        endTag0.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes7 = endTag0.getAttributes();
        boolean boolean8 = endTag0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        boolean boolean14 = endTag9.isStartTag();
        endTag9.appendAttributeName('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(endTag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        boolean boolean15 = startTag3.isCharacter();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.lang.String str75 = startTag73.normalName;
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "</ >" + "'", str75, "</ >");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        boolean boolean15 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        boolean boolean3 = comment0.bogus;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.getData();
        boolean boolean6 = comment0.bogus;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        startTag3.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag3.reset();
        startTag3.appendAttributeName("hi!");
        java.lang.String str12 = startTag3.normalName();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = tag5.reset();
        tag5.newAttribute();
        boolean boolean9 = tag5.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = tag5.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag23 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeName(' ');
        endTag0.appendAttributeName('a');
        boolean boolean6 = endTag0.selfClosing;
        endTag0.appendTagName('4');
        java.lang.String str9 = endTag0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</4>" + "'", str9, "</4>");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.lang.String str17 = startTag16.toString();
        boolean boolean18 = startTag16.selfClosing;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = startTag20.nameAttr("EOF", attributes22);
        boolean boolean24 = startTag23.isDoctype();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = startTag23.nameAttr("", attributes26);
        org.jsoup.parser.Token.Tag tag28 = startTag27.reset();
        startTag27.appendTagName('4');
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag();
        boolean boolean33 = endTag32.isSelfClosing();
        endTag32.normalName = "";
        endTag32.finaliseTag();
        boolean boolean37 = endTag32.selfClosing;
        endTag32.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = startTag40.nameAttr("EOF", attributes42);
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = startTag40.nameAttr("EOF", attributes45);
        java.lang.String str47 = startTag40.normalName();
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = startTag48.nameAttr("EOF", attributes50);
        boolean boolean52 = startTag51.isDoctype();
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = startTag51.nameAttr("", attributes54);
        org.jsoup.parser.Token.TokenType tokenType56 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag51.type = tokenType56;
        startTag40.type = tokenType56;
        endTag32.type = tokenType56;
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes62 = null;
        org.jsoup.parser.Token.StartTag startTag63 = startTag60.nameAttr("EOF", attributes62);
        boolean boolean64 = startTag63.isDoctype();
        org.jsoup.parser.Token.EndTag endTag66 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes69 = null;
        org.jsoup.parser.Token.StartTag startTag70 = startTag67.nameAttr("EOF", attributes69);
        boolean boolean71 = startTag70.isDoctype();
        org.jsoup.parser.Token.Tag tag72 = startTag70.reset();
        startTag70.newAttribute();
        org.jsoup.nodes.Attributes attributes74 = startTag70.attributes;
        endTag66.attributes = attributes74;
        org.jsoup.parser.Token.StartTag startTag76 = startTag63.nameAttr("eof", attributes74);
        endTag32.attributes = attributes74;
        org.jsoup.parser.Token.StartTag startTag78 = startTag27.nameAttr("EOF", attributes74);
        org.jsoup.parser.Token.StartTag startTag80 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes82 = null;
        org.jsoup.parser.Token.StartTag startTag83 = startTag80.nameAttr("EOF", attributes82);
        boolean boolean84 = startTag83.isDoctype();
        org.jsoup.parser.Token.Tag tag85 = startTag83.reset();
        startTag83.newAttribute();
        org.jsoup.nodes.Attributes attributes87 = startTag83.attributes;
        org.jsoup.parser.Token.StartTag startTag88 = startTag78.nameAttr("<hi!>", attributes87);
        org.jsoup.parser.Token.StartTag startTag89 = startTag16.nameAttr("Character", attributes87);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<eof>" + "'", str17, "<eof>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "eof" + "'", str47, "eof");
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertTrue("'" + tokenType56 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType56.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(startTag70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertNotNull(startTag76);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertNotNull(startTag83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(startTag88);
        org.junit.Assert.assertNotNull(startTag89);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.lang.String str36 = tag35.tagName;
        java.lang.String str37 = tag35.normalName;
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
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes3 = endTag0.getAttributes();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType5 = endTag0.type;
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        org.jsoup.parser.Token.Character character4 = character0.data("</ >");
        java.lang.String str5 = character0.getData();
        java.lang.String str6 = character0.toString();
        org.jsoup.parser.Token.Character character8 = character0.data("4");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</ >" + "'", str5, "</ >");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</ >" + "'", str6, "</ >");
        org.junit.Assert.assertNotNull(character8);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        org.jsoup.parser.Token token9 = doctype0.reset();
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
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag55 = startTag7.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        java.lang.String str9 = startTag6.tokenType();
        boolean boolean10 = startTag6.selfClosing;
        startTag6.appendAttributeName("");
        java.lang.String str13 = startTag6.toString();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<EOF>" + "'", str13, "<EOF>");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        java.lang.String str7 = startTag3.normalName();
        boolean boolean8 = startTag3.selfClosing;
        startTag3.tagName = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = startTag3.toString();
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
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        java.lang.String str19 = endTag0.tagName;
        java.lang.String str20 = endTag0.toString();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!#" + "'", str19, "hi!#");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "</hi!#>" + "'", str20, "</hi!#>");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        java.lang.String str62 = endTag0.normalName;
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
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        org.jsoup.parser.Token.Character character6 = character0.data(" ");
        java.lang.String str7 = character0.tokenType();
        boolean boolean8 = character0.isEOF();
        org.jsoup.parser.Token.Character character10 = character0.data("hi!</hi!>");
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Character" + "'", str7, "Character");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(character10);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        endTag0.appendTagName(' ');
        java.lang.String str6 = endTag0.normalName;
        boolean boolean7 = endTag0.selfClosing;
        java.lang.String str8 = endTag0.toString();
        org.jsoup.nodes.Attributes attributes9 = endTag0.getAttributes();
        endTag0.tagName = "<<starttag>>";
        java.lang.String str12 = endTag0.toString();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</ >" + "'", str8, "</ >");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</<<starttag>>>" + "'", str12, "</<<starttag>>>");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        boolean boolean20 = tag19.isCharacter();
        tag19.selfClosing = false;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        tag8.finaliseTag();
        tag8.appendTagName("</hi!>");
        tag8.selfClosing = true;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        startTag0.appendAttributeName('4');
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
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        java.lang.String str33 = endTag0.normalName;
        boolean boolean34 = endTag0.isStartTag();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "eof4" + "'", str33, "eof4");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        boolean boolean7 = doctype0.isCharacter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        boolean boolean10 = doctype0.forceQuirks;
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
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("4");
        org.jsoup.parser.Token.TokenType tokenType10 = tag9.type;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eof" + "'", str7, "eof");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        java.lang.String str14 = startTag3.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EndTag" + "'", str14, "EndTag");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.appendAttributeName("");
        org.jsoup.parser.Token.TokenType tokenType14 = endTag0.type;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        int[] intArray4 = new int[] { (short) 1 };
        endTag0.appendAttributeValue(intArray4);
        endTag0.tagName = "<!---->";
        endTag0.finaliseTag();
        endTag0.appendTagName('4');
        endTag0.setEmptyAttributeValue();
        endTag0.normalName = "#";
        endTag0.appendAttributeName("EOF");
        java.lang.String str16 = endTag0.normalName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#" + "'", str16, "#");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = true;
        boolean boolean3 = comment0.isEOF();
        org.jsoup.parser.Token token4 = comment0.reset();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue(' ');
        char[] charArray10 = new char[] { ' ', ' ' };
        endTag5.appendAttributeValue(charArray10);
        endTag5.selfClosing = true;
        org.jsoup.parser.Token.Tag tag15 = endTag5.name("hi!");
        tag15.appendAttributeValue("eof");
        org.jsoup.parser.Token.EndTag endTag18 = tag15.asEndTag();
        org.jsoup.parser.Token.TokenType tokenType19 = endTag18.type;
        comment0.type = tokenType19;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag21 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(endTag18);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        org.jsoup.parser.Token.Tag tag47 = tag46.reset();
        tag47.finaliseTag();
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
        org.junit.Assert.assertNotNull(tag47);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        org.jsoup.parser.Token token4 = endTag0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token4);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        tag8.appendAttributeName('a');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.isCharacter();
        int[] intArray4 = new int[] { (short) 1 };
        endTag0.appendAttributeValue(intArray4);
        endTag0.tagName = "<!---->";
        endTag0.finaliseTag();
        endTag0.appendTagName('4');
        boolean boolean11 = endTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes12 = endTag0.getAttributes();
        endTag0.appendAttributeValue('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        java.lang.String str6 = startTag3.normalName;
        boolean boolean7 = startTag3.isComment();
        startTag3.normalName = "eof";
        org.jsoup.parser.Token.Tag tag10 = startTag3.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        endTag0.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes12 = endTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag14 = endTag0.name("starttag");
        java.lang.String str15 = endTag0.normalName;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "starttag" + "'", str15, "starttag");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.lang.String str11 = doctype0.getPublicIdentifier();
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
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        startTag6.selfClosing = false;
        startTag6.normalName = "</starttag>";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        tag11.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        java.lang.String str35 = startTag0.toString();
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
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        boolean boolean25 = comment0.bogus;
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        boolean boolean47 = endTag46.isSelfClosing();
        endTag46.normalName = "";
        endTag46.finaliseTag();
        org.jsoup.nodes.Attributes attributes51 = endTag46.attributes;
        endTag46.appendAttributeValue('#');
        endTag46.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes56 = endTag46.getAttributes();
        java.lang.String str57 = endTag46.name();
        org.jsoup.parser.Token.EndTag endTag58 = new org.jsoup.parser.Token.EndTag();
        endTag58.appendAttributeValue(' ');
        char[] charArray63 = new char[] { ' ', ' ' };
        endTag58.appendAttributeValue(charArray63);
        endTag58.selfClosing = true;
        org.jsoup.parser.Token.Tag tag68 = endTag58.name("hi!");
        endTag58.appendAttributeName('a');
        int[] intArray75 = new int[] { 0, 'a', (byte) 0, (short) 0 };
        endTag58.appendAttributeValue(intArray75);
        endTag46.appendAttributeValue(intArray75);
        startTag7.appendAttributeValue(intArray75);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(attributes51);
        org.junit.Assert.assertNull(attributes56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 0, 97, 0, 0 });
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("hi!");
        java.lang.String str9 = startTag0.toString();
        java.lang.String str10 = startTag0.toString();
        startTag0.appendAttributeName('a');
        java.lang.Class<?> wildcardClass13 = startTag0.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.tokenType();
        java.lang.String str10 = doctype0.getSystemIdentifier();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        boolean boolean9 = character8.isEndTag();
        org.jsoup.parser.Token.Character character10 = character8.asCharacter();
        java.lang.String str11 = character10.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        java.lang.String str4 = endTag0.tokenType();
        endTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        java.lang.String str15 = doctype0.getPubSysKey();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</StartTag>" + "'", str15, "</StartTag>");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        java.lang.String str13 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        java.lang.String str38 = comment0.toString();
        java.lang.StringBuilder stringBuilder39 = comment0.data;
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        endTag0.appendAttributeName('a');
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        endTag38.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag41 = endTag38.reset();
        tag41.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag45 = tag41.name("StartTag");
        java.lang.String str46 = tag41.normalName;
        org.jsoup.parser.Token.Tag tag47 = tag41.reset();
        org.jsoup.parser.Token.EndTag endTag48 = tag47.asEndTag();
        java.lang.String str49 = endTag48.tokenType();
        org.jsoup.parser.Token.EndTag endTag50 = new org.jsoup.parser.Token.EndTag();
        endTag50.appendAttributeValue(' ');
        char[] charArray55 = new char[] { ' ', ' ' };
        endTag50.appendAttributeValue(charArray55);
        org.jsoup.parser.Token.EndTag endTag57 = endTag50.asEndTag();
        char[] charArray63 = new char[] { '#', '#', ' ', 'a', ' ' };
        endTag50.appendAttributeValue(charArray63);
        endTag48.appendAttributeValue(charArray63);
        endTag0.appendAttributeValue(charArray63);
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
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "starttag" + "'", str46, "starttag");
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(endTag48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "EndTag" + "'", str49, "EndTag");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(endTag57);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '#', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isSelfClosing();
        endTag0.normalName = "";
        endTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag0.attributes;
        endTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag8 = endTag0.asEndTag();
        endTag0.appendAttributeValue("</<!---->4>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(endTag8);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        org.jsoup.nodes.Attributes attributes36 = tag35.attributes;
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
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        java.lang.String str11 = doctype0.getName();
        boolean boolean12 = doctype0.forceQuirks;
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        java.lang.String str11 = doctype0.getName();
        java.lang.StringBuilder stringBuilder12 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        boolean boolean20 = endTag0.selfClosing;
        org.jsoup.parser.Token.TokenType tokenType21 = endTag0.type;
        org.jsoup.parser.Token.Tag tag23 = endTag0.name("<EOF >");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        startTag3.tagName = "<!---->";
        java.lang.String str7 = startTag3.tagName;
        org.jsoup.parser.Token.Tag tag9 = startTag3.name("<</ >>");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag7 = tag3.name("StartTag");
        java.lang.String str8 = tag3.normalName;
        org.jsoup.parser.Token.Tag tag9 = tag3.reset();
        tag9.setEmptyAttributeValue();
        tag9.appendAttributeValue("EOF");
        tag9.normalName = "<!---->";
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        endTag15.appendAttributeValue(' ');
        char[] charArray20 = new char[] { ' ', ' ' };
        endTag15.appendAttributeValue(charArray20);
        endTag15.selfClosing = true;
        org.jsoup.parser.Token.Tag tag25 = endTag15.name("hi!");
        boolean boolean26 = endTag15.isStartTag();
        endTag15.normalName = "eof";
        org.jsoup.parser.Token.TokenType tokenType29 = endTag15.type;
        tag9.type = tokenType29;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "starttag" + "'", str8, "starttag");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("<!---->");
        java.lang.String str3 = character0.toString();
        java.lang.String str4 = character0.toString();
        org.jsoup.parser.Token.Character character6 = character0.data("Doctype");
        org.jsoup.parser.Token.Character character8 = character0.data("</hi!>");
        org.jsoup.parser.Token.Character character10 = character0.data("<hi!>");
        org.jsoup.parser.Token.Character character12 = character10.data("<hi!>");
        java.lang.String str13 = character12.tokenType();
        java.lang.String str14 = character12.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Character" + "'", str13, "Character");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!>" + "'", str14, "<hi!>");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        java.lang.String str11 = startTag3.tagName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        startTag34.appendAttributeName("</ >");
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
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.String str2 = comment0.getData();
        comment0.bogus = false;
        java.lang.String str5 = comment0.getData();
        boolean boolean6 = comment0.bogus;
        java.lang.Class<?> wildcardClass7 = comment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        java.lang.StringBuilder stringBuilder17 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder17);
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
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        boolean boolean16 = character13.isEOF();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isStartTag();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        startTag3.appendAttributeValue("hi!</hi!>");
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
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("EOF", attributes5);
        java.lang.String str7 = startTag6.toString();
        startTag6.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<EOF>" + "'", str7, "<EOF>");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        org.jsoup.parser.Token.Tag tag23 = startTag3.reset();
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
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        org.jsoup.parser.Token.Tag tag34 = startTag30.reset();
        org.jsoup.parser.Token.Tag tag35 = startTag30.reset();
        startTag30.tagName = "<<EOF>>";
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
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tag35);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        java.lang.String str2 = character0.toString();
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        org.jsoup.parser.Token token6 = character0.reset();
        boolean boolean7 = character0.isEOF();
        java.lang.String str8 = character0.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("EOF", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.nameAttr("", attributes6);
        startTag3.normalName = "eof";
        org.jsoup.parser.Token.Tag tag11 = startTag3.name("</ >");
        tag11.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype13 = tag11.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.pubSysKey;
        java.lang.String str8 = doctype0.getPubSysKey();
        java.lang.String str9 = doctype0.getPubSysKey();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = startTag30.toString();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        endTag0.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = endTag0.name("hi!");
        boolean boolean11 = endTag0.isStartTag();
        endTag0.normalName = "eof";
        boolean boolean14 = endTag0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag13 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.String str3 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getName();
        doctype0.forceQuirks = true;
        java.lang.String str8 = doctype0.getName();
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token10 = doctype0.reset();
        org.jsoup.parser.Token token11 = doctype0.reset();
        java.lang.String str12 = doctype0.pubSysKey;
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
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getPubSysKey();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.String str10 = doctype0.pubSysKey;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment33 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, 97, 0, 0 });
        org.junit.Assert.assertNotNull(tag30);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        boolean boolean98 = tag9.selfClosing;
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isComment();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        comment0.bogus = false;
        boolean boolean6 = comment0.isEndTag();
        org.jsoup.parser.Token.Comment comment7 = comment0.asComment();
        org.jsoup.parser.Token token8 = comment7.reset();
        boolean boolean9 = comment7.bogus;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comment7);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        boolean boolean71 = endTag0.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue(' ');
        char[] charArray5 = new char[] { ' ', ' ' };
        endTag0.appendAttributeValue(charArray5);
        org.jsoup.parser.Token.Tag tag7 = endTag0.reset();
        tag7.appendTagName("EndTag");
        tag7.finaliseTag();
        tag7.selfClosing = false;
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ' });
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.nodes.Attributes attributes26 = endTag25.getAttributes();
        endTag25.selfClosing = true;
        endTag25.finaliseTag();
        org.jsoup.parser.Token.Doctype doctype30 = new org.jsoup.parser.Token.Doctype();
        doctype30.pubSysKey = "";
        java.lang.String str33 = doctype30.pubSysKey;
        java.lang.String str34 = doctype30.getPublicIdentifier();
        boolean boolean35 = doctype30.isForceQuirks();
        doctype30.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype38 = doctype30.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType39 = doctype30.type;
        endTag25.type = tokenType39;
        comment0.type = tokenType39;
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
        org.junit.Assert.assertNull(attributes26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doctype38);
        org.junit.Assert.assertTrue("'" + tokenType39 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType39.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        org.jsoup.parser.Token token24 = comment0.reset();
        comment0.bogus = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(token24);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        tag32.appendAttributeName("StartTag");
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
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "";
        boolean boolean3 = doctype0.isEOF();
        java.lang.String str4 = doctype0.getPubSysKey();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPubSysKey();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype40 = startTag39.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        java.lang.StringBuilder stringBuilder13 = doctype0.name;
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
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        startTag0.appendTagName("<EOF >");
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
    }
}

