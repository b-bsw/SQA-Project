package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Character character2 = new org.jsoup.parser.Token.Character("EOF");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isStartTag();
        boolean boolean3 = eOF1.isDoctype();
        boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeName('a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = startTag0.toString();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = startTag0.name();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = startTag0.toString();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isStartTag();
        boolean boolean3 = eOF1.isDoctype();
        boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str7 = character6.getData();
        boolean boolean8 = character6.isComment();
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Comment;
        comment9.type = tokenType11;
        character6.type = tokenType11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        boolean boolean1 = startTag0.isDoctype();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = startTag0.toString();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = endTag0.toString();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Character character2 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str3 = character2.getData();
        boolean boolean4 = character2.isComment();
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        character2.type = tokenType7;
        java.lang.String str10 = character2.toString();
        java.lang.String str11 = character2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isStartTag();
        boolean boolean3 = eOF1.isDoctype();
        boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean7 = endTag6.selfClosing;
        org.jsoup.parser.Token.Tag tag9 = endTag6.name("");
        boolean boolean10 = endTag6.isEndTag();
        org.jsoup.parser.Token.Tag tag12 = endTag6.name("<4>");
        org.jsoup.nodes.Attributes attributes13 = endTag6.getAttributes();
        boolean boolean14 = endTag6.isSelfClosing();
        endTag6.finaliseTag();
        endTag6.appendTagName(' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = startTag0.toString();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.attributes;
        java.lang.String str2 = startTag0.tokenType();
        startTag0.appendAttributeValue('a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = startTag0.toString();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName('a');
        boolean boolean3 = endTag0.isCharacter();
        org.jsoup.nodes.Attributes attributes4 = endTag0.attributes;
        endTag0.appendAttributeName('a');
        endTag0.appendAttributeName("</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = endTag0.toString();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.newAttribute();
        boolean boolean2 = startTag0.selfClosing;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = startTag0.toString();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = startTag0.name();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = startTag0.name();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = startTag0.name();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType6 = startTag0.type;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = startTag0.toString();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.selfClosing;
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.nodes.Attributes attributes8 = startTag7.getAttributes();
        startTag0.attributes = attributes8;
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str12 = endTag11.toString();
        java.lang.String str13 = endTag11.toString();
        org.jsoup.parser.Token.TokenType tokenType14 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag11.type = tokenType14;
        boolean boolean16 = endTag11.isStartTag();
        boolean boolean17 = endTag11.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag19.appendAttributeValue("</hi!>");
        org.jsoup.nodes.Attributes attributes22 = startTag19.attributes;
        endTag11.attributes = attributes22;
        org.jsoup.nodes.Attributes attributes24 = endTag11.attributes;
        startTag0.attributes = attributes24;
        boolean boolean26 = startTag0.isComment();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = startTag0.toString();
    }
}

