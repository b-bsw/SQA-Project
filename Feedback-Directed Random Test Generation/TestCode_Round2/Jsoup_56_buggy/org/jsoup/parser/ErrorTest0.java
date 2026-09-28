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
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character3 = character1.data("hi!");
        java.lang.String str4 = character3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character3 = character1.data("hi!");
        java.lang.String str4 = character1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        boolean boolean5 = doctype4.forceQuirks;
        java.lang.String str6 = doctype4.tokenType();
        boolean boolean7 = doctype4.forceQuirks;
        java.lang.String str8 = doctype4.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character4 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character6 = character4.data("hi!");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.getData();
        org.jsoup.parser.Token.Character character10 = character6.data("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        int int9 = document6.siblingIndex();
        java.lang.String str10 = document6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = document6.wrap("EndTag");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        boolean boolean2 = doctype1.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        boolean boolean4 = doctype1.forceQuirks;
        boolean boolean5 = doctype1.forceQuirks;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        boolean boolean2 = doctype1.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType3 = doctype1.type;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character4 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character6 = character4.data("hi!");
        java.lang.String str7 = character6.getData();
        org.jsoup.parser.Token.Character character9 = character6.data("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag3 = startTag2.asStartTag();
        boolean boolean4 = startTag2.selfClosing;
        java.lang.String str5 = startTag2.normalName();
        org.jsoup.parser.Token token6 = startTag2.reset();
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = xmlTreeBuilder0.processStartTag("Comment", attributes7);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.absUrl("PUBLIC");
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.wrap("<Comment   name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.wrap("</SYSTEM>");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype3 = new org.jsoup.parser.Token.Doctype();
        boolean boolean4 = doctype3.forceQuirks;
        doctype3.forceQuirks = false;
        java.lang.String str7 = doctype3.getName();
        java.lang.StringBuilder stringBuilder8 = doctype3.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("Character", "#endtag", "PUBLIC", "comment");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("Comment");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "StartTag", "<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        java.lang.String str5 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("a");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        boolean boolean2 = doctype1.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        boolean boolean4 = doctype1.forceQuirks;
        doctype1.forceQuirks = false;
        doctype1.forceQuirks = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        java.lang.String str6 = documentType4.toString();
        boolean boolean8 = documentType4.hasAttr("Comment");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<Comment   name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#EndTag", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">", "Doctype", "<PUBLIC>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("4");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<PUBLIC>");
        node6.setBaseUri("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node6.wrap("4");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        int int7 = documentType4.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<a>");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        int int22 = documentType4.siblingIndex();
        boolean boolean24 = documentType4.hasAttr("EndTag");
        java.lang.String str25 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = documentType4.wrap("a");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#EndTag", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">", "Doctype", "<PUBLIC>");
        java.lang.String str5 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("<SYSTEM>");
        org.jsoup.nodes.Node node19 = documentType4.removeAttr("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = documentType4.wrap("<<!DOCTYPE hi! PUBLIC \"hi!\">  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("#EndTag");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<public>");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        boolean boolean9 = documentType4.hasAttr("SYSTEM");
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment11 = comment10.asComment();
        org.jsoup.parser.Token token12 = comment11.reset();
        org.jsoup.parser.Token token13 = comment11.reset();
        boolean boolean14 = documentType4.hasSameValue((java.lang.Object) comment11);
        org.jsoup.nodes.Node node17 = documentType4.attr("<!doctype hi! public \"hi!\">", "<!DOCTYPE EndTag PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = documentType4.wrap("SYSTEM");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        java.lang.String str6 = documentType4.toString();
        boolean boolean8 = documentType4.hasAttr("Comment");
        java.lang.String str10 = documentType4.absUrl("EndTag");
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        org.jsoup.nodes.Node node14 = documentType4.attr("<Comment>", "</4<PUBLIC>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = documentType4.wrap("<public>");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("Character", "<!DOCTYPE hi! PUBLIC \"hi!\">", "StartTag", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.attr("PUBLIC", "<PUBLIC>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("</Doctype>");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.absUrl("a");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!---->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.wrap("<Comment   name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        java.lang.String str6 = documentType4.toString();
        int int7 = documentType4.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("comment ");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        org.jsoup.nodes.Node node23 = documentType4.removeAttr("a");
        org.jsoup.nodes.Node node24 = documentType4.previousSibling();
        org.jsoup.nodes.Node node25 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = node25.wrap("</EndTag>");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "StartTag", "<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype6.systemIdentifier;
        boolean boolean9 = doctype6.forceQuirks;
        doctype6.forceQuirks = false;
        java.lang.StringBuilder stringBuilder12 = doctype6.name;
        org.jsoup.parser.Token.reset(stringBuilder12);
        java.lang.Appendable appendable14 = documentType4.html((java.lang.Appendable) stringBuilder12);
        java.lang.String str15 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE EndTag PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node19.wrap("public#endtag");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        org.jsoup.nodes.Node node23 = documentType4.removeAttr("a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = documentType4.wrap(" ");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<PUBLIC>");
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.lang.String str8 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<<public>>");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.attr("<!---->", "<<!---->>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("<SYSTEM  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node15 = node13.removeAttr("a");
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        org.jsoup.nodes.Node node17 = node15.clone();
        int int18 = node15.childNodeSize();
        org.jsoup.nodes.Node node19 = node15.previousSibling();
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        boolean boolean21 = doctype20.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.EOF;
        doctype20.type = tokenType22;
        org.jsoup.parser.Token token24 = doctype20.reset();
        java.lang.String str25 = doctype20.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder26 = doctype20.systemIdentifier;
        boolean boolean27 = doctype20.isForceQuirks();
        java.lang.String str28 = doctype20.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder29 = doctype20.systemIdentifier;
        java.lang.Appendable appendable30 = node15.html((java.lang.Appendable) stringBuilder29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = node15.wrap("StartTag");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node15 = node13.removeAttr("a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("<<!doctype hi! public \"hi!\">>");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.attr("<!---->", "<<!---->>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<endtag  name=\"hi!\" publicid=\"hi!\" systemid=\"\">");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("<SYSTEM>");
        org.jsoup.nodes.Node node19 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node22 = node19.attr("<<!DOCTYPE hi! PUBLIC \"hi!\">  name=\"hi!\" publicId=\"hi!\" systemId=\"\">", "Character");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = node22.wrap("<<!---->>");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        boolean boolean9 = documentType4.hasAttr("SYSTEM");
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment11 = comment10.asComment();
        org.jsoup.parser.Token token12 = comment11.reset();
        org.jsoup.parser.Token token13 = comment11.reset();
        boolean boolean14 = documentType4.hasSameValue((java.lang.Object) comment11);
        org.jsoup.nodes.Node node17 = documentType4.attr("<!doctype hi! public \"hi!\">", "<!DOCTYPE EndTag PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int18 = node17.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = node17.wrap("<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.clone();
        org.jsoup.nodes.Node node11 = node8.attr("4", "<!doctype hi! public \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node8.wrap("<hi!  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        int int22 = documentType4.siblingIndex();
        boolean boolean24 = documentType4.hasAttr("EndTag");
        java.lang.String str25 = documentType4.toString();
        int int26 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node27 = documentType4.parent();
        java.lang.String str28 = documentType4.outerHtml();
        java.lang.String str29 = documentType4.baseUri();
        org.jsoup.nodes.Node node31 = documentType4.removeAttr("Doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = documentType4.wrap("#endtag");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character4 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character6 = character4.data("SYSTEM");
        org.jsoup.parser.Token token7 = character6.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character6);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("comment", "EndTag", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("4<PUBLIC>");
        java.lang.String str9 = node7.absUrl("<Comment>");
        org.jsoup.nodes.Node node10 = node7.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node7.wrap("<PUBLIC>");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings4 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag7 = endTag5.asEndTag();
        endTag5.tagName = "";
        org.jsoup.parser.Token token10 = endTag5.reset();
        endTag5.appendTagName("PUBLIC");
        endTag5.selfClosing = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag5);
    }
}

