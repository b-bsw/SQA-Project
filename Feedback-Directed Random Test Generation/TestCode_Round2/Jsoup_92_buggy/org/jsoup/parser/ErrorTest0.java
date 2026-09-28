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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = xmlTreeBuilder0.processStartTag("hi!", attributes2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.CData cData2 = new org.jsoup.parser.Token.CData("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) cData2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        boolean boolean5 = attributes2.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes2.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = xmlTreeBuilder0.processStartTag("<![CDATA[null]]>", attributes2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings4 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        org.jsoup.nodes.Attributes attributes7 = parseSettings4.normalizeAttributes(attributes5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes5.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = xmlTreeBuilder0.processStartTag("hi!", attributes5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment3 = new org.jsoup.parser.Token.Comment();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData3 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token4 = cData3.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.publicIdentifier;
        doctype2.forceQuirks = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(doctype2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<![CDATA[null]]>");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        boolean boolean5 = attributes2.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes2.spliterator();
        java.lang.String str8 = attributes2.getIgnoreCase(" ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.processStartTag("</<![CDATA[null]]>>", attributes2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("<![CDATA[hi!]]>", " ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceOnStack((org.jsoup.nodes.Element) document5, (org.jsoup.nodes.Element) document9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("<![CDATA[hi!]]>", " ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<![CDATA[null]]>");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        java.lang.String str3 = comment2.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        startTag3.finaliseTag();
        startTag3.appendAttributeValue(' ');
        java.lang.String str7 = startTag3.tokenType();
        org.jsoup.nodes.Attributes attributes8 = startTag3.attributes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = xmlTreeBuilder0.processStartTag(" ", attributes8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Comment comment1 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token2 = comment1.reset();
        boolean boolean3 = comment1.bogus;
        java.lang.String str4 = comment1.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        java.lang.String str2 = endTag1.normalName;
        endTag1.tagName = "<![CDATA[null]]>";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("<![CDATA[null]]>", strArray5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope("</<![cdata[null]]>>");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inSelectScope("<![cdata[null]]>");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inTableScope("<starttag>");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.CData cData3 = new org.jsoup.parser.Token.CData("</<![CDATA[null]]>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment3 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token4 = comment3.reset();
        boolean boolean5 = comment3.bogus;
        comment3.bogus = false;
        java.lang.String str8 = comment3.toString();
        org.jsoup.parser.Token token9 = comment3.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("</<![CDATA[null]]>>");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.CData cData7 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token8 = cData7.reset();
        boolean boolean9 = cData7.isComment();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inButtonScope("< >");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inTableScope("<!---->");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData3 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token4 = cData3.reset();
        java.lang.String str5 = cData3.toString();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag6.type = tokenType9;
        cData3.type = tokenType9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("StartTag");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inTableScope("StartTag");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder1.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        boolean boolean9 = doctype8.isEOF();
        boolean boolean10 = doctype8.isCharacter();
        boolean boolean11 = doctype8.isComment();
        xmlTreeBuilder1.insert(doctype8);
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        java.lang.String str14 = comment13.getData();
        xmlTreeBuilder1.insert(comment13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "</<![cdata[null]]>>", "< >", "<<![CDATA[null]]>>", "<![CDATA[null]]>", "<starttag>" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("</<![cdata[null]]>>");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String[] strArray2 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inScope(strArray2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = htmlTreeBuilder0.insertEmpty(startTag14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getActiveFormattingElement("<![CDATA[null]]>");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = htmlTreeBuilder0.inSelectScope("<<![CDATA[null]]>>");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.insertStartTag("<![CDATA[hi!]]>");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inTableScope("Doctype");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inButtonScope("starttag");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inScope("<![cdata[null]]>");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        org.jsoup.nodes.Attributes attributes16 = attributes12.put("", false);
        org.jsoup.parser.ParseSettings parseSettings17 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        org.jsoup.nodes.Attributes attributes20 = parseSettings17.normalizeAttributes(attributes18);
        attributes18.remove("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes18.put("hi!", false);
        attributes16.addAll(attributes25);
        int int27 = attributes25.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = htmlTreeBuilder0.processStartTag("</<![cdata[null]]>>", attributes25);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("<![CDATA[null]]></<![cdata[null]]>>");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("", "hi!");
        org.jsoup.nodes.Document document9 = xmlTreeBuilder3.parse("<![CDATA[hi!]]>", "<!---->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder15 = doctype14.publicIdentifier;
        doctype14.forceQuirks = true;
        xmlTreeBuilder7.insert(doctype14);
        org.jsoup.nodes.Document document21 = xmlTreeBuilder7.parse("starttag", "Comment");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document21);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String[] strArray34 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean35 = htmlTreeBuilder0.inScope("CData", strArray34);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getFromStack("<<![CDATA[null]]>>");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getFromStack("</<![CDATA[null]]>>");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("< >");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<![CDATA[StartTag]]>");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String[] strArray7 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope(strArray7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder1.insert((org.jsoup.parser.Token.Character) cData6);
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        boolean boolean9 = doctype8.isEOF();
        boolean boolean10 = doctype8.isCharacter();
        boolean boolean11 = doctype8.isComment();
        xmlTreeBuilder1.insert(doctype8);
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        java.lang.String str14 = comment13.getData();
        xmlTreeBuilder1.insert(comment13);
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        boolean boolean17 = doctype16.isStartTag();
        java.lang.StringBuilder stringBuilder18 = doctype16.name;
        java.lang.StringBuilder stringBuilder19 = doctype16.publicIdentifier;
        xmlTreeBuilder1.insert(doctype16);
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder1.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData27 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder22.insert((org.jsoup.parser.Token.Character) cData27);
        xmlTreeBuilder1.insert((org.jsoup.parser.Token.Character) cData27);
        org.jsoup.parser.Token.Doctype doctype30 = new org.jsoup.parser.Token.Doctype();
        boolean boolean31 = doctype30.isEOF();
        boolean boolean32 = doctype30.isCharacter();
        doctype30.forceQuirks = false;
        boolean boolean35 = doctype30.isComment();
        boolean boolean36 = doctype30.forceQuirks;
        xmlTreeBuilder1.insert(doctype30);
        org.jsoup.nodes.Document document40 = xmlTreeBuilder1.parse("Doctype", "<starttag>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document40);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        startTag3.finaliseTag();
        startTag3.appendAttributeValue(' ');
        java.lang.String str7 = startTag3.tokenType();
        org.jsoup.nodes.Attributes attributes8 = startTag3.attributes;
        org.jsoup.parser.ParseSettings parseSettings9 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        org.jsoup.nodes.Attributes attributes12 = parseSettings9.normalizeAttributes(attributes10);
        java.lang.String str13 = attributes12.toString();
        java.lang.String str14 = attributes12.html();
        java.lang.String str16 = attributes12.get("StartTag");
        attributes8.addAll(attributes12);
        int int18 = attributes12.size();
        boolean boolean20 = attributes12.hasKey("< >");
        java.util.List<org.jsoup.nodes.Attribute> attributeList21 = attributes12.asList();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = htmlTreeBuilder0.processStartTag("<Doctype>", attributes12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        java.lang.String[] strArray8 = new java.lang.String[] { "< >", "<![CDATA[null]]>", "<!---->", "Doctype", "Comment" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder0.getStack();
        java.lang.String[] strArray34 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray34);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getFromStack("<Doctype>");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token10 = comment9.reset();
        boolean boolean11 = comment9.bogus;
        xmlTreeBuilder5.insert(comment9);
        org.jsoup.nodes.Document document15 = xmlTreeBuilder5.parse("StartTag", "< >");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("<Doctype>");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("</<![CDATA[null]]>>");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<<![CDATA[null]]>>");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("</<![CDATA[null]]>>");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeName(' ');
        startTag5.appendTagName(' ');
        startTag5.newAttribute();
        boolean boolean11 = startTag5.selfClosing;
        startTag5.newAttribute();
        org.jsoup.nodes.Attributes attributes13 = startTag5.getAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = htmlTreeBuilder0.insert(startTag5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inSelectScope("<StartTaga>");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "hi!");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder32.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder40 = doctype39.publicIdentifier;
        doctype39.forceQuirks = true;
        xmlTreeBuilder32.insert(doctype39);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder32.parse("starttag", "Comment");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document46);
        java.lang.String[] strArray48 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray48);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getActiveFormattingElement("CData");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("StartTaga");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "hi!");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder32.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder40 = doctype39.publicIdentifier;
        doctype39.forceQuirks = true;
        xmlTreeBuilder32.insert(doctype39);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder32.parse("starttag", "Comment");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document46);
        org.jsoup.parser.Token.CData cData49 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token50 = cData49.reset();
        org.jsoup.parser.Token.Character character51 = token50.asCharacter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(character51);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getFromStack("<![CDATA[StartTag]]>");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("Comment");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inListItemScope("StartTaga");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.lang.String[] strArray2 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData7 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder2.insert((org.jsoup.parser.Token.Character) cData7);
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        boolean boolean10 = doctype9.isEOF();
        boolean boolean11 = doctype9.isCharacter();
        boolean boolean12 = doctype9.isComment();
        xmlTreeBuilder2.insert(doctype9);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.getData();
        xmlTreeBuilder2.insert(comment14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inButtonScope("<Doctype>");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getFromStack(" starttag=\"\" ");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("", strArray4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack(" starttag");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inListItemScope("Comment");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertStartTag("<![CDATA[StartTaga]]>");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean35 = htmlTreeBuilder0.inTableScope("<![CDATA[hi!]]>");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.Comment comment3 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder4 = comment3.data;
        java.lang.StringBuilder stringBuilder5 = comment3.data;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.CData cData7 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token8 = cData7.reset();
        java.lang.String str9 = cData7.toString();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag10.type = tokenType13;
        cData7.type = tokenType13;
        org.jsoup.parser.Token token16 = cData7.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData9 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData9);
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        boolean boolean12 = doctype11.isEOF();
        boolean boolean13 = doctype11.isCharacter();
        boolean boolean14 = doctype11.isComment();
        xmlTreeBuilder4.insert(doctype11);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        java.lang.String str17 = comment16.getData();
        xmlTreeBuilder4.insert(comment16);
        org.jsoup.parser.ParseSettings parseSettings20 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes21.iterator();
        org.jsoup.nodes.Attributes attributes23 = parseSettings20.normalizeAttributes(attributes21);
        attributes21.remove("hi!");
        org.jsoup.nodes.Attributes attributes26 = attributes21.clone();
        java.lang.String str27 = attributes21.html();
        boolean boolean28 = xmlTreeBuilder4.processStartTag("hi!", attributes21);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("<![CDATA[null]]>");
        boolean boolean32 = startTag29.selfClosing;
        org.jsoup.parser.Token.StartTag startTag33 = startTag29.asStartTag();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        startTag34.appendAttributeName(' ');
        startTag34.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        startTag39.appendAttributeName(' ');
        startTag39.appendTagName(' ');
        startTag39.newAttribute();
        boolean boolean45 = startTag39.selfClosing;
        startTag39.newAttribute();
        org.jsoup.nodes.Attributes attributes47 = startTag39.getAttributes();
        startTag34.attributes = attributes47;
        attributes47.remove("<![CDATA[null]]>");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = attributes47.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList52 = attributes47.asList();
        startTag29.attributes = attributes47;
        boolean boolean54 = xmlTreeBuilder4.process((org.jsoup.parser.Token) startTag29);
        org.jsoup.parser.Token.Comment comment55 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token56 = comment55.reset();
        boolean boolean57 = comment55.bogus;
        comment55.bogus = false;
        boolean boolean60 = comment55.bogus;
        xmlTreeBuilder4.insert(comment55);
        comment55.bogus = false;
        comment55.bogus = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment55);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inTableScope("<![CDATA[]]>");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement(" starttag=\"\" ");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.getData();
        java.lang.String str7 = comment5.toString();
        java.lang.String str8 = comment5.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.Character character3 = new org.jsoup.parser.Token.Character();
        boolean boolean4 = character3.isCharacter();
        org.jsoup.parser.Token token5 = character3.reset();
        java.lang.String str6 = character3.toString();
        org.jsoup.parser.Token token7 = character3.reset();
        java.lang.String str8 = character3.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(character3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character();
        boolean boolean2 = character1.isCharacter();
        org.jsoup.parser.Token token3 = character1.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(character1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeName(' ');
        startTag5.appendTagName(' ');
        startTag5.newAttribute();
        boolean boolean11 = startTag5.selfClosing;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendAttributeName(' ');
        startTag13.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendAttributeName(' ');
        startTag18.appendTagName(' ');
        startTag18.newAttribute();
        boolean boolean24 = startTag18.selfClosing;
        startTag18.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag18.getAttributes();
        startTag13.attributes = attributes26;
        attributes26.remove("<![CDATA[null]]>");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = attributes26.dataset();
        org.jsoup.parser.Token.StartTag startTag31 = startTag5.nameAttr("Doctype", attributes26);
        startTag5.finaliseTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.FormElement formElement34 = htmlTreeBuilder0.insertForm(startTag5, false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData3 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str4 = cData3.getData();
        boolean boolean5 = cData3.isCharacter();
        java.lang.String str6 = cData3.toString();
        java.lang.String str7 = cData3.getData();
        org.jsoup.parser.Token.Character character9 = cData3.data("StartTaga");
        org.jsoup.parser.Token.Character character11 = character9.data("<StartTaga>");
        org.jsoup.parser.Token.Character character13 = character9.data("starttag");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(character13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = htmlTreeBuilder0.inSelectScope("</<![CDATA[null]]>>");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("<![CDATA[hi!]]>", strArray3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<StartTaga>");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = htmlTreeBuilder0.getActiveFormattingElement("StartTag");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "hi!");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder32.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder40 = doctype39.publicIdentifier;
        doctype39.forceQuirks = true;
        xmlTreeBuilder32.insert(doctype39);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder32.parse("starttag", "Comment");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document46);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState48 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean52 = htmlTreeBuilder0.inSelectScope("<StartTaga>");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.framesetOk(false);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder5.parse("<!---->", "<!---->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.appendTagName("<![CDATA[null]]>");
        startTag4.newAttribute();
        java.lang.String str8 = startTag4.tokenType();
        startTag4.tagName = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.insertEmpty(startTag4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.finaliseTag();
        startTag9.tagName = "";
        org.jsoup.nodes.Attributes attributes13 = startTag9.attributes;
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.isEOF();
        boolean boolean16 = doctype14.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType17 = doctype14.type;
        startTag9.type = tokenType17;
        java.lang.String str19 = startTag9.normalName;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        org.jsoup.nodes.Attributes attributes27 = attributes23.put("", false);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes28.iterator();
        boolean boolean31 = attributes28.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes28.spliterator();
        attributes23.addAll(attributes28);
        org.jsoup.nodes.Attributes attributes34 = parseSettings22.normalizeAttributes(attributes23);
        org.jsoup.parser.Token.StartTag startTag35 = startTag9.nameAttr("StartTag", attributes23);
        startTag9.selfClosing = false;
        startTag9.appendTagName('a');
        boolean boolean40 = startTag9.isEOF();
        boolean boolean41 = startTag9.isDoctype();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.FormElement formElement43 = htmlTreeBuilder0.insertForm(startTag9, false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("", "hi!");
        org.jsoup.nodes.Document document9 = xmlTreeBuilder3.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder11 = doctype10.publicIdentifier;
        doctype10.forceQuirks = true;
        xmlTreeBuilder3.insert(doctype10);
        org.jsoup.nodes.Document document17 = xmlTreeBuilder3.parse("<![CDATA[null]]>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeName(' ');
        boolean boolean10 = startTag7.selfClosing;
        startTag7.newAttribute();
        org.jsoup.parser.Token.Tag tag13 = startTag7.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType17 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag14.type = tokenType17;
        startTag7.type = tokenType17;
        startTag7.newAttribute();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.finaliseTag();
        startTag22.appendAttributeValue(' ');
        java.lang.String str26 = startTag22.tokenType();
        org.jsoup.nodes.Attributes attributes27 = startTag22.attributes;
        org.jsoup.parser.ParseSettings parseSettings28 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        org.jsoup.nodes.Attributes attributes31 = parseSettings28.normalizeAttributes(attributes29);
        java.lang.String str32 = attributes31.toString();
        java.lang.String str33 = attributes31.html();
        java.lang.String str35 = attributes31.get("StartTag");
        attributes27.addAll(attributes31);
        int int37 = attributes31.size();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = attributes31.dataset();
        org.jsoup.parser.Token.StartTag startTag39 = startTag7.nameAttr("starttag", attributes31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = htmlTreeBuilder0.insert(startTag39);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<![CDATA[Doctype]]>");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("< >");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        org.jsoup.nodes.Attributes attributes14 = attributes11.put("", true);
        boolean boolean16 = attributes11.hasKeyIgnoreCase(" ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = htmlTreeBuilder0.processStartTag("CData", attributes11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.nodes.Document document8 = xmlTreeBuilder2.parse("<StartTaga>", "<![cdata[null]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inTableScope("hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "hi!");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder32.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder40 = doctype39.publicIdentifier;
        doctype39.forceQuirks = true;
        xmlTreeBuilder32.insert(doctype39);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder32.parse("starttag", "Comment");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document46);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState48 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.FormElement formElement51 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("starttaga");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token9 = comment8.reset();
        boolean boolean10 = comment8.bogus;
        xmlTreeBuilder4.insert(comment8);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        attributes16.normalize();
        org.jsoup.nodes.Attributes attributes21 = attributes16.put("", true);
        boolean boolean22 = xmlTreeBuilder4.processStartTag("<starttag>", attributes16);
        org.jsoup.nodes.Document document25 = xmlTreeBuilder4.parse("<![CDATA[</<![CDATA[null]]>>]]>", "cdata");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document25);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.publicIdentifier;
        org.jsoup.parser.Token token7 = doctype5.reset();
        boolean boolean8 = doctype5.isCData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("<![cdata[hi!]]>");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getFromStack("<StartTag>");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        htmlTreeBuilder4.setFosterInserts(true);
        boolean boolean8 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.nodes.Element element9 = htmlTreeBuilder4.getHeadElement();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("", "hi!");
        org.jsoup.nodes.Document document17 = xmlTreeBuilder11.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendAttributeName(' ');
        boolean boolean21 = startTag18.selfClosing;
        startTag18.newAttribute();
        org.jsoup.parser.Token.Tag tag24 = startTag18.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType28 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag25.type = tokenType28;
        startTag18.type = tokenType28;
        startTag18.newAttribute();
        startTag18.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element34 = xmlTreeBuilder11.insert(startTag18);
        htmlTreeBuilder4.maybeSetBaseUri(element34);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document39 = xmlTreeBuilder36.parse("", "hi!");
        org.jsoup.nodes.Document document42 = xmlTreeBuilder36.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype43 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder44 = doctype43.publicIdentifier;
        doctype43.forceQuirks = true;
        xmlTreeBuilder36.insert(doctype43);
        org.jsoup.nodes.Document document50 = xmlTreeBuilder36.parse("starttag", "Comment");
        htmlTreeBuilder4.maybeSetBaseUri((org.jsoup.nodes.Element) document50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean52 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document50);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendAttributeName(' ');
        boolean boolean12 = startTag9.selfClosing;
        startTag9.newAttribute();
        org.jsoup.parser.Token.Tag tag15 = startTag9.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag16.type = tokenType19;
        startTag9.type = tokenType19;
        startTag9.newAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = htmlTreeBuilder0.insert(startTag9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token11 = comment10.reset();
        boolean boolean12 = comment10.bogus;
        xmlTreeBuilder6.insert(comment10);
        org.jsoup.nodes.Document document16 = xmlTreeBuilder6.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        attributes18.normalize();
        org.jsoup.nodes.Attributes attributes23 = attributes18.put("", true);
        boolean boolean24 = xmlTreeBuilder6.processStartTag("<starttag>", attributes18);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token26 = comment25.reset();
        boolean boolean27 = comment25.bogus;
        comment25.bogus = true;
        boolean boolean30 = comment25.bogus;
        xmlTreeBuilder6.insert(comment25);
        comment25.bogus = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment25);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.finaliseTag();
        startTag33.appendAttributeValue(' ');
        startTag33.selfClosing = true;
        java.lang.String str39 = startTag33.tagName;
        org.jsoup.parser.Token.Tag tag41 = startTag33.name("</<![CDATA[null]]>>");
        startTag33.appendAttributeValue(' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element44 = htmlTreeBuilder0.insertEmpty(startTag33);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData14 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder9.insert((org.jsoup.parser.Token.Character) cData14);
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        boolean boolean17 = doctype16.isEOF();
        boolean boolean18 = doctype16.isCharacter();
        boolean boolean19 = doctype16.isComment();
        xmlTreeBuilder9.insert(doctype16);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.String str22 = comment21.getData();
        xmlTreeBuilder9.insert(comment21);
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        boolean boolean25 = doctype24.isStartTag();
        java.lang.StringBuilder stringBuilder26 = doctype24.name;
        java.lang.StringBuilder stringBuilder27 = doctype24.publicIdentifier;
        xmlTreeBuilder9.insert(doctype24);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder30.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData35 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder30.insert((org.jsoup.parser.Token.Character) cData35);
        xmlTreeBuilder9.insert((org.jsoup.parser.Token.Character) cData35);
        org.jsoup.parser.Token.Doctype doctype38 = new org.jsoup.parser.Token.Doctype();
        boolean boolean39 = doctype38.isEOF();
        boolean boolean40 = doctype38.isCharacter();
        doctype38.forceQuirks = false;
        boolean boolean43 = doctype38.isComment();
        boolean boolean44 = doctype38.forceQuirks;
        xmlTreeBuilder9.insert(doctype38);
        org.jsoup.nodes.Document document48 = xmlTreeBuilder9.parse("Doctype", "<starttag>");
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.Token.CData cData51 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str52 = cData51.getData();
        java.lang.String str53 = cData51.toString();
        org.jsoup.parser.Token.Character character55 = cData51.data("StartTag");
        boolean boolean56 = cData51.isCharacter();
        org.jsoup.parser.Token.Character character58 = cData51.data("<starttag>");
        xmlTreeBuilder9.insert((org.jsoup.parser.Token.Character) cData51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData51);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inButtonScope("<![CDATA[Doctype]]>");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        boolean boolean13 = doctype12.isEOF();
        boolean boolean14 = doctype12.isCharacter();
        boolean boolean15 = doctype12.isComment();
        xmlTreeBuilder5.insert(doctype12);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.String str18 = comment17.getData();
        xmlTreeBuilder5.insert(comment17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData25 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder20.insert((org.jsoup.parser.Token.Character) cData25);
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData25);
        org.jsoup.nodes.Document document30 = xmlTreeBuilder5.parse("<![cdata[</<![cdata[null]]>>]]>", "<Doctype>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document30);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings33 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        startTag3.finaliseTag();
        startTag3.tagName = "";
        int[] intArray11 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag3.appendAttributeValue(intArray11);
        startTag3.finaliseTag();
        startTag3.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes16 = startTag3.attributes;
        org.jsoup.parser.Token.Tag tag18 = startTag3.name("Doctype");
        tag18.appendAttributeName("CData");
        tag18.appendTagName('#');
        boolean boolean23 = tag18.isSelfClosing();
        tag18.setEmptyAttributeValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean25 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag18);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getFromStack("<![CDATA[ ]]>");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.setFosterInserts(true);
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope(strArray5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        boolean boolean32 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "hi!");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder32.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder40 = doctype39.publicIdentifier;
        doctype39.forceQuirks = true;
        xmlTreeBuilder32.insert(doctype39);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder32.parse("starttag", "Comment");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document46);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState48 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element51 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData8 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder3.insert((org.jsoup.parser.Token.Character) cData8);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token11 = comment10.reset();
        java.lang.String str12 = comment10.toString();
        xmlTreeBuilder3.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token15 = comment14.reset();
        boolean boolean16 = comment14.bogus;
        comment14.bogus = true;
        java.lang.String str19 = comment14.toString();
        java.lang.String str20 = comment14.toString();
        xmlTreeBuilder3.insert(comment14);
        org.jsoup.nodes.Document document24 = xmlTreeBuilder3.parse("<!---->", "Comment");
        org.jsoup.nodes.Document document27 = xmlTreeBuilder3.parse("</<![cdata[null]]>>", "<![cdata[null]]>");
        org.jsoup.nodes.Document document30 = xmlTreeBuilder3.parse("</<![cdata[null]]>>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document30);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        doctype4.pubSysKey = "hi!";
        org.jsoup.parser.Token token7 = doctype4.reset();
        boolean boolean8 = doctype4.forceQuirks;
        boolean boolean9 = doctype4.isCharacter();
        java.lang.String str10 = doctype4.pubSysKey;
        org.jsoup.parser.Token.Doctype doctype11 = doctype4.asDoctype();
        java.lang.String str12 = doctype4.pubSysKey;
        xmlTreeBuilder0.insert(doctype4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "hi!");
        org.jsoup.nodes.Document document20 = xmlTreeBuilder14.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype21 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder22 = doctype21.publicIdentifier;
        doctype21.forceQuirks = true;
        xmlTreeBuilder14.insert(doctype21);
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        doctype26.pubSysKey = "hi!";
        org.jsoup.parser.Token token29 = doctype26.reset();
        xmlTreeBuilder14.insert(doctype26);
        java.lang.StringBuilder stringBuilder31 = doctype26.publicIdentifier;
        java.lang.String str32 = doctype26.getSystemIdentifier();
        org.jsoup.parser.Token.Doctype doctype33 = doctype26.asDoctype();
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype26);
        org.jsoup.nodes.Document document37 = xmlTreeBuilder0.parse("CData", "<![CDATA[null]]>");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document41 = xmlTreeBuilder38.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        doctype42.pubSysKey = "hi!";
        org.jsoup.parser.Token token45 = doctype42.reset();
        boolean boolean46 = doctype42.forceQuirks;
        boolean boolean47 = doctype42.isCharacter();
        java.lang.String str48 = doctype42.pubSysKey;
        org.jsoup.parser.Token.Doctype doctype49 = doctype42.asDoctype();
        java.lang.String str50 = doctype42.pubSysKey;
        xmlTreeBuilder38.insert(doctype42);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document55 = xmlTreeBuilder52.parse("", "hi!");
        org.jsoup.nodes.Document document58 = xmlTreeBuilder52.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype59 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder60 = doctype59.publicIdentifier;
        doctype59.forceQuirks = true;
        xmlTreeBuilder52.insert(doctype59);
        org.jsoup.parser.Token.Doctype doctype64 = new org.jsoup.parser.Token.Doctype();
        doctype64.pubSysKey = "hi!";
        org.jsoup.parser.Token token67 = doctype64.reset();
        xmlTreeBuilder52.insert(doctype64);
        java.lang.StringBuilder stringBuilder69 = doctype64.publicIdentifier;
        java.lang.String str70 = doctype64.getSystemIdentifier();
        org.jsoup.parser.Token.Doctype doctype71 = doctype64.asDoctype();
        boolean boolean72 = xmlTreeBuilder38.process((org.jsoup.parser.Token) doctype64);
        xmlTreeBuilder0.insert(doctype64);
        org.jsoup.parser.Token.CData cData75 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str76 = cData75.getData();
        java.lang.String str77 = cData75.toString();
        org.jsoup.parser.Token.Character character79 = cData75.data("StartTag");
        java.lang.String str80 = cData75.toString();
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData75);
        org.jsoup.parser.Token.EndTag endTag82 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.Tag tag84 = endTag82.name("<![CDATA[null]]>");
        java.lang.String str85 = endTag82.toString();
        boolean boolean86 = endTag82.isComment();
        java.lang.String str87 = endTag82.normalName;
        org.jsoup.parser.Token.Tag tag88 = endTag82.reset();
        org.jsoup.parser.Token.Tag tag89 = tag88.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean90 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag89);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "</<![CDATA[null]]>>", " </<![CDATA[hi!]]>>=\"starttaga\"", "starttag </<![cdata[null]]>>", "CData", "<![cdata[hi!]]>" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = htmlTreeBuilder0.inScope("</<![CDATA[hi!]]>>", strArray13);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes6.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes6.iterator();
        org.jsoup.nodes.Attributes attributes9 = attributes6.clone();
        attributes9.removeIgnoreCase("<![CDATA[hi!]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = htmlTreeBuilder0.processStartTag("<![CDATA[null]]>", attributes9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inButtonScope("<![CDATA[]]>");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray6 = new java.lang.String[] { " <!---->=\"<![cdata[</<![cdata[null]]>>]]>\"", "< >", "starttag" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "hi!");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder32.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder40 = doctype39.publicIdentifier;
        doctype39.forceQuirks = true;
        xmlTreeBuilder32.insert(doctype39);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder32.parse("starttag", "Comment");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document46);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState48 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.FormElement formElement51 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray52 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray52);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeName(' ');
        boolean boolean10 = startTag7.selfClosing;
        startTag7.newAttribute();
        org.jsoup.parser.Token.Tag tag13 = startTag7.name("<![CDATA[null]]>");
        java.lang.String str14 = startTag7.toString();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("", "hi!");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder16.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.CData cData24 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str25 = cData24.getData();
        boolean boolean26 = cData24.isCharacter();
        xmlTreeBuilder16.insert((org.jsoup.parser.Token.Character) cData24);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        attributes29.normalize();
        org.jsoup.nodes.Attributes attributes34 = attributes29.put("", true);
        java.lang.String str35 = attributes34.toString();
        org.jsoup.parser.ParseSettings parseSettings36 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes37.iterator();
        org.jsoup.nodes.Attributes attributes39 = parseSettings36.normalizeAttributes(attributes37);
        boolean boolean41 = attributes37.hasKeyIgnoreCase("hi!");
        attributes34.addAll(attributes37);
        boolean boolean43 = xmlTreeBuilder16.processStartTag("< >", attributes37);
        org.jsoup.parser.Token.StartTag startTag44 = startTag7.nameAttr("Doctype", attributes37);
        boolean boolean45 = startTag44.isEOF();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean46 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag44);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inSelectScope(" </<![CDATA[null]]>>");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder15 = doctype14.publicIdentifier;
        doctype14.forceQuirks = true;
        xmlTreeBuilder7.insert(doctype14);
        org.jsoup.nodes.Document document21 = xmlTreeBuilder7.parse("<![CDATA[null]]>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document21);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        java.lang.String str9 = parseSettings7.normalizeTag("hi!");
        java.lang.String str11 = parseSettings7.normalizeTag("");
        org.jsoup.parser.ParseSettings parseSettings12 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        org.jsoup.nodes.Attributes attributes15 = parseSettings12.normalizeAttributes(attributes13);
        attributes13.remove("hi!");
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag18.type = tokenType19;
        boolean boolean21 = attributes13.equals((java.lang.Object) startTag18);
        org.jsoup.nodes.Attributes attributes22 = parseSettings7.normalizeAttributes(attributes13);
        java.lang.String str24 = attributes22.get("<![CDATA[Doctype]]>");
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        doctype25.pubSysKey = "hi!";
        org.jsoup.parser.Token token28 = doctype25.reset();
        boolean boolean29 = doctype25.forceQuirks;
        java.lang.String str30 = doctype25.getSystemIdentifier();
        java.lang.String str31 = doctype25.getPublicIdentifier();
        boolean boolean32 = attributes22.equals((java.lang.Object) str31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = htmlTreeBuilder0.processStartTag("<![cdata[</<![cdata[null]]>>]]>", attributes22);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope("", strArray6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token6 = comment5.reset();
        boolean boolean7 = comment5.bogus;
        xmlTreeBuilder1.insert(comment5);
        boolean boolean9 = comment5.bogus;
        comment5.bogus = false;
        java.lang.String str12 = comment5.toString();
        boolean boolean13 = comment5.bogus;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert(comment5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("starttag=\"\"");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData9 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token12 = comment11.reset();
        java.lang.String str13 = comment11.toString();
        xmlTreeBuilder4.insert(comment11);
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token16 = comment15.reset();
        boolean boolean17 = comment15.bogus;
        comment15.bogus = true;
        java.lang.String str20 = comment15.toString();
        java.lang.String str21 = comment15.toString();
        xmlTreeBuilder4.insert(comment15);
        org.jsoup.nodes.Document document25 = xmlTreeBuilder4.parse("<!---->", "Comment");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder4.parse("</<![cdata[null]]>>", "<![cdata[null]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document28);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.CData cData4 = new org.jsoup.parser.Token.CData("</<![CDATA[null]]>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inSelectScope("</<![CDATA[hi!]]>>");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore(" hi!=\"starttag\"");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.CData cData7 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str8 = cData7.getData();
        boolean boolean9 = cData7.isCharacter();
        java.lang.String str10 = cData7.toString();
        java.lang.String str11 = cData7.getData();
        org.jsoup.parser.Token.Character character13 = cData7.data("StartTaga");
        org.jsoup.parser.Token.TokenType tokenType14 = character13.type;
        org.jsoup.parser.Token token15 = character13.reset();
        org.jsoup.parser.Token.TokenType tokenType16 = character13.type;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(character13);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        boolean boolean32 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder33.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData38 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder33.insert((org.jsoup.parser.Token.Character) cData38);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token41 = comment40.reset();
        java.lang.String str42 = comment40.toString();
        xmlTreeBuilder33.insert(comment40);
        org.jsoup.parser.Token.Comment comment44 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token45 = comment44.reset();
        boolean boolean46 = comment44.bogus;
        comment44.bogus = true;
        java.lang.String str49 = comment44.toString();
        java.lang.String str50 = comment44.toString();
        xmlTreeBuilder33.insert(comment44);
        org.jsoup.parser.Token token52 = comment44.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean53 = htmlTreeBuilder0.process(token52);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes8 = attributes4.put("", false);
        attributes8.remove("<![CDATA[null]]>");
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        org.jsoup.nodes.Attributes attributes15 = attributes11.put("", false);
        org.jsoup.parser.ParseSettings parseSettings16 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        org.jsoup.nodes.Attributes attributes19 = parseSettings16.normalizeAttributes(attributes17);
        attributes17.remove("hi!");
        org.jsoup.nodes.Attributes attributes24 = attributes17.put("hi!", false);
        attributes15.addAll(attributes24);
        boolean boolean26 = attributes8.equals((java.lang.Object) attributes24);
        java.lang.String str27 = attributes8.html();
        org.jsoup.nodes.Attributes attributes28 = attributes8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = htmlTreeBuilder0.processStartTag("starttaga", attributes8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Token.CData cData11 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token12 = cData11.reset();
        java.lang.String str13 = cData11.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<StartTag>");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token13 = comment12.reset();
        java.lang.String str14 = comment12.toString();
        xmlTreeBuilder5.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token17 = comment16.reset();
        boolean boolean18 = comment16.bogus;
        comment16.bogus = true;
        java.lang.String str21 = comment16.toString();
        java.lang.String str22 = comment16.toString();
        xmlTreeBuilder5.insert(comment16);
        org.jsoup.nodes.Document document26 = xmlTreeBuilder5.parse("<!---->", "Comment");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder5.parse("</<![cdata[null]]>>", "<![cdata[null]]>");
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.finaliseTag();
        startTag30.tagName = "";
        org.jsoup.nodes.Attributes attributes34 = startTag30.attributes;
        org.jsoup.parser.Token.Doctype doctype35 = new org.jsoup.parser.Token.Doctype();
        boolean boolean36 = doctype35.isEOF();
        boolean boolean37 = doctype35.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType38 = doctype35.type;
        startTag30.type = tokenType38;
        java.lang.String str40 = startTag30.normalName;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder42.defaultSettings();
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor45 = attributes44.iterator();
        org.jsoup.nodes.Attributes attributes48 = attributes44.put("", false);
        org.jsoup.nodes.Attributes attributes49 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor50 = attributes49.iterator();
        boolean boolean52 = attributes49.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator53 = attributes49.spliterator();
        attributes44.addAll(attributes49);
        org.jsoup.nodes.Attributes attributes55 = parseSettings43.normalizeAttributes(attributes44);
        org.jsoup.parser.Token.StartTag startTag56 = startTag30.nameAttr("StartTag", attributes44);
        startTag30.selfClosing = false;
        startTag30.appendTagName('a');
        org.jsoup.nodes.Element element61 = xmlTreeBuilder5.insert(startTag30);
        org.jsoup.parser.ParseSettings parseSettings63 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes64 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor65 = attributes64.iterator();
        org.jsoup.nodes.Attributes attributes66 = parseSettings63.normalizeAttributes(attributes64);
        boolean boolean67 = parseSettings63.preserveTagCase();
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor69 = attributes68.iterator();
        org.jsoup.nodes.Attributes attributes70 = attributes68.clone();
        org.jsoup.nodes.Attributes attributes71 = parseSettings63.normalizeAttributes(attributes70);
        boolean boolean72 = xmlTreeBuilder5.processStartTag("<![CDATA[</<![CDATA[null]]>>]]>", attributes71);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder73 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder73.generateImpliedEndTags();
        boolean boolean75 = htmlTreeBuilder73.isFosterInserts();
        boolean boolean76 = attributes71.equals((java.lang.Object) htmlTreeBuilder73);
        org.jsoup.nodes.Attributes attributes79 = attributes71.put(" ", "starttag=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean80 = htmlTreeBuilder0.processStartTag("", attributes79);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        java.lang.String str15 = parseSettings13.normalizeAttribute("hi!");
        boolean boolean16 = parseSettings13.preserveTagCase();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        org.jsoup.nodes.Attributes attributes21 = attributes17.put("", false);
        attributes21.remove("<![CDATA[null]]>");
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        org.jsoup.nodes.Attributes attributes28 = attributes24.put("", false);
        org.jsoup.parser.ParseSettings parseSettings29 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor31 = attributes30.iterator();
        org.jsoup.nodes.Attributes attributes32 = parseSettings29.normalizeAttributes(attributes30);
        attributes30.remove("hi!");
        org.jsoup.nodes.Attributes attributes37 = attributes30.put("hi!", false);
        attributes28.addAll(attributes37);
        boolean boolean39 = attributes21.equals((java.lang.Object) attributes37);
        org.jsoup.nodes.Attributes attributes40 = parseSettings13.normalizeAttributes(attributes21);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor41 = attributes21.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = attributes21.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean43 = htmlTreeBuilder0.processStartTag(" StartTag </<![cdata[null]]>>", attributes21);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token8 = comment7.reset();
        boolean boolean9 = comment7.bogus;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "hi!");
        org.jsoup.nodes.Document document38 = xmlTreeBuilder32.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder40 = doctype39.publicIdentifier;
        doctype39.forceQuirks = true;
        xmlTreeBuilder32.insert(doctype39);
        org.jsoup.nodes.Document document46 = xmlTreeBuilder32.parse("starttag", "Comment");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document46);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState48 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings4 = xmlTreeBuilder3.defaultSettings();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder3.parse("<!---->", "<!---->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        java.lang.String[] strArray2 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inScope(strArray2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.insertStartTag("<![CDATA[CData]]>");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "hi!");
        org.jsoup.nodes.Document document8 = xmlTreeBuilder2.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendAttributeName(' ');
        boolean boolean12 = startTag9.selfClosing;
        startTag9.newAttribute();
        org.jsoup.parser.Token.Tag tag15 = startTag9.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag16.type = tokenType19;
        startTag9.type = tokenType19;
        startTag9.newAttribute();
        startTag9.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element25 = xmlTreeBuilder2.insert(startTag9);
        startTag9.appendAttributeValue("</<![CDATA[null]]>>");
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.finaliseTag();
        startTag28.appendAttributeName('#');
        char[] charArray32 = new char[] {};
        startTag28.appendAttributeValue(charArray32);
        org.jsoup.parser.Token.TokenType tokenType34 = startTag28.type;
        startTag9.type = tokenType34;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.FormElement formElement37 = htmlTreeBuilder0.insertForm(startTag9, true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope(strArray4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document38 = xmlTreeBuilder35.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData40 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder35.insert((org.jsoup.parser.Token.Character) cData40);
        org.jsoup.parser.Token.Comment comment42 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token43 = comment42.reset();
        java.lang.String str44 = comment42.toString();
        xmlTreeBuilder35.insert(comment42);
        org.jsoup.parser.Token.Comment comment46 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token47 = comment46.reset();
        boolean boolean48 = comment46.bogus;
        comment46.bogus = true;
        java.lang.String str51 = comment46.toString();
        java.lang.String str52 = comment46.toString();
        xmlTreeBuilder35.insert(comment46);
        org.jsoup.nodes.Document document56 = xmlTreeBuilder35.parse("<!---->", "Comment");
        org.jsoup.nodes.Document document59 = xmlTreeBuilder35.parse("<![CDATA[StartTag]]>", "endtag");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document59);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<StartTaga>", "<![cdata[null]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("</<![cdata[null]]>>");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inButtonScope("<starttaga>");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<![CDATA[null]]></<![cdata[null]]>>");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inButtonScope("<![cdata[null]]>");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inButtonScope(" </<![cdata[null]]>>=\"</<![CDATA[null]]>>\" hi!=\"<![cdata[hi!]]>\"");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inButtonScope("starttag </<![cdata[null]]>>");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope(" </<![CDATA[null]]>>=\"hi!\"", strArray5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getFromStack("<starttag#>");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getFromStack(" hi!=\"starttag\"");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("<![CDATA[</<![CDATA[null]]>>]]>", strArray3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token10 = comment9.reset();
        boolean boolean11 = comment9.bogus;
        comment9.bogus = true;
        boolean boolean14 = comment9.bogus;
        comment9.bogus = true;
        java.lang.StringBuilder stringBuilder17 = comment9.data;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inSelectScope("<![CDATA[<![CDATA[StartTag]]>]]>");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder2.state();
        htmlTreeBuilder2.setFosterInserts(true);
        boolean boolean6 = htmlTreeBuilder2.isFragmentParsing();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder2.getHeadElement();
        htmlTreeBuilder2.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.nodes.Document document15 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendAttributeName(' ');
        boolean boolean19 = startTag16.selfClosing;
        startTag16.newAttribute();
        org.jsoup.parser.Token.Tag tag22 = startTag16.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType26 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag23.type = tokenType26;
        startTag16.type = tokenType26;
        startTag16.newAttribute();
        startTag16.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element32 = xmlTreeBuilder9.insert(startTag16);
        htmlTreeBuilder2.maybeSetBaseUri(element32);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document37 = xmlTreeBuilder34.parse("", "hi!");
        org.jsoup.nodes.Document document40 = xmlTreeBuilder34.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype41 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder42 = doctype41.publicIdentifier;
        doctype41.forceQuirks = true;
        xmlTreeBuilder34.insert(doctype41);
        org.jsoup.nodes.Document document48 = xmlTreeBuilder34.parse("starttag", "Comment");
        htmlTreeBuilder2.maybeSetBaseUri((org.jsoup.nodes.Element) document48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean50 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document48);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.finaliseTag();
        org.jsoup.parser.ParseSettings parseSettings8 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        org.jsoup.nodes.Attributes attributes11 = parseSettings8.normalizeAttributes(attributes9);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        org.jsoup.parser.Token.StartTag startTag13 = startTag5.nameAttr("hi!", attributes9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = htmlTreeBuilder0.insertEmpty(startTag5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String[] strArray11 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = htmlTreeBuilder0.inScope("EndTag", strArray11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("", strArray4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Document document9 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token15 = comment14.reset();
        boolean boolean16 = comment14.bogus;
        xmlTreeBuilder10.insert(comment14);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder10.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes22.iterator();
        attributes22.normalize();
        org.jsoup.nodes.Attributes attributes27 = attributes22.put("", true);
        boolean boolean28 = xmlTreeBuilder10.processStartTag("<starttag>", attributes22);
        org.jsoup.nodes.Document document31 = xmlTreeBuilder10.parse("<StartTaga>", " hi!=\"starttag\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document31);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getFromStack("<![CDATA[<![cdata[null]]>]]>");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        boolean boolean6 = comment4.bogus;
        comment4.bogus = true;
        boolean boolean9 = comment4.bogus;
        java.lang.String str10 = comment4.tokenType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment4);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendAttributeName(' ');
        startTag8.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.Tag tag14 = startTag8.name("");
        startTag8.tagName = "</<![CDATA[null]]>>";
        java.lang.String str17 = startTag8.tokenType();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.finaliseTag();
        startTag18.appendAttributeValue(' ');
        java.lang.String str22 = startTag18.tokenType();
        org.jsoup.nodes.Attributes attributes23 = startTag18.attributes;
        org.jsoup.parser.ParseSettings parseSettings24 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes25.iterator();
        org.jsoup.nodes.Attributes attributes27 = parseSettings24.normalizeAttributes(attributes25);
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes28.iterator();
        org.jsoup.nodes.Attributes attributes32 = attributes28.put("", false);
        org.jsoup.nodes.Attributes attributes33 = parseSettings24.normalizeAttributes(attributes32);
        startTag18.attributes = attributes32;
        java.lang.String str36 = attributes32.get("<![CDATA[hi!]]>");
        startTag8.attributes = attributes32;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document41 = xmlTreeBuilder38.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData43 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder38.insert((org.jsoup.parser.Token.Character) cData43);
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        boolean boolean46 = doctype45.isEOF();
        boolean boolean47 = doctype45.isCharacter();
        boolean boolean48 = doctype45.isComment();
        xmlTreeBuilder38.insert(doctype45);
        org.jsoup.parser.Token.Comment comment50 = new org.jsoup.parser.Token.Comment();
        java.lang.String str51 = comment50.getData();
        xmlTreeBuilder38.insert(comment50);
        org.jsoup.parser.ParseSettings parseSettings54 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes55 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor56 = attributes55.iterator();
        org.jsoup.nodes.Attributes attributes57 = parseSettings54.normalizeAttributes(attributes55);
        attributes55.remove("hi!");
        org.jsoup.nodes.Attributes attributes60 = attributes55.clone();
        java.lang.String str61 = attributes55.html();
        boolean boolean62 = xmlTreeBuilder38.processStartTag("hi!", attributes55);
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        startTag63.finaliseTag();
        java.lang.String str65 = startTag63.normalName;
        boolean boolean66 = attributes55.equals((java.lang.Object) startTag63);
        boolean boolean67 = attributes32.equals((java.lang.Object) startTag63);
        org.jsoup.parser.Token.Tag tag68 = startTag63.reset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean69 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag68);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        boolean boolean6 = comment4.bogus;
        java.lang.String str7 = comment4.toString();
        comment4.bogus = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(comment4);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray7 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope(strArray7);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getFromStack("</<![cdata[starttag]]>>");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("<![CDATA[ StartTag </<![cdata[null]]>>]]>", strArray5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData9 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData9);
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        boolean boolean12 = doctype11.isEOF();
        boolean boolean13 = doctype11.isCharacter();
        boolean boolean14 = doctype11.isComment();
        xmlTreeBuilder4.insert(doctype11);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        java.lang.String str17 = comment16.getData();
        xmlTreeBuilder4.insert(comment16);
        org.jsoup.parser.ParseSettings parseSettings20 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes21.iterator();
        org.jsoup.nodes.Attributes attributes23 = parseSettings20.normalizeAttributes(attributes21);
        attributes21.remove("hi!");
        org.jsoup.nodes.Attributes attributes26 = attributes21.clone();
        java.lang.String str27 = attributes21.html();
        boolean boolean28 = xmlTreeBuilder4.processStartTag("hi!", attributes21);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendTagName("<![CDATA[null]]>");
        boolean boolean32 = startTag29.selfClosing;
        org.jsoup.parser.Token.StartTag startTag33 = startTag29.asStartTag();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        startTag34.appendAttributeName(' ');
        startTag34.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        startTag39.appendAttributeName(' ');
        startTag39.appendTagName(' ');
        startTag39.newAttribute();
        boolean boolean45 = startTag39.selfClosing;
        startTag39.newAttribute();
        org.jsoup.nodes.Attributes attributes47 = startTag39.getAttributes();
        startTag34.attributes = attributes47;
        attributes47.remove("<![CDATA[null]]>");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = attributes47.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList52 = attributes47.asList();
        startTag29.attributes = attributes47;
        boolean boolean54 = xmlTreeBuilder4.process((org.jsoup.parser.Token) startTag29);
        org.jsoup.parser.Token.Comment comment55 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token56 = comment55.reset();
        boolean boolean57 = comment55.bogus;
        comment55.bogus = false;
        boolean boolean60 = comment55.bogus;
        xmlTreeBuilder4.insert(comment55);
        org.jsoup.nodes.Document document64 = xmlTreeBuilder4.parse("Doctype", "<![cdata[starttaga]]>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document64);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList33 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<![CDATA[]]>");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertStartTag("EndTag");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.finaliseTag();
        java.lang.String str8 = startTag6.normalName();
        org.jsoup.nodes.Attributes attributes9 = startTag6.attributes;
        org.jsoup.parser.Token.Tag tag11 = startTag6.name("cdata");
        boolean boolean12 = tag11.isSelfClosing();
        boolean boolean13 = tag11.selfClosing;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag11);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope(" </<![CDATA[null]]>>=\"hi!\"");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getFromStack(" <!---->=\"<![cdata[</<![cdata[null]]>>]]>\"");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("<![cdata[null]]>");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.finaliseTag();
        startTag8.tagName = "";
        int[] intArray16 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag8.appendAttributeValue(intArray16);
        org.jsoup.nodes.Attributes attributes18 = startTag8.attributes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = htmlTreeBuilder0.processStartTag("<!---->=\"<![cdata[</<![cdata[null]]>>]]>\"", attributes18);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        java.lang.String[] strArray14 = new java.lang.String[] { "cdata", "</cdata>", "<![CDATA[< >]]>", "<hi!>", "<![CDATA[CData]]>", "</cdata>" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = htmlTreeBuilder0.inScope("<![CDATA[ hi!=\"starttag\"]]>", strArray14);
    }
}

