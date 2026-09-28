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
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getFromStack("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getFromStack("hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inScope("hi!", strArray2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope(strArray4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray1 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inSelectScope("");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope("hi!", strArray6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        java.lang.String[] strArray17 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = htmlTreeBuilder0.inScope(strArray17);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.nodes.Node[] nodeArray35 = new org.jsoup.nodes.Node[] { element27, element34 };
        org.jsoup.nodes.Element element36 = element19.insertChildren((int) (byte) 0, nodeArray35);
        boolean boolean37 = htmlTreeBuilder6.isSpecial(element19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean38 = htmlTreeBuilder0.removeFromStack(element19);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.select.Elements elements24 = element23.previousElementSiblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element23.firstElementSibling();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder7.getDocument();
        boolean boolean9 = htmlTreeBuilder7.framesetOk();
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder7.defaultSettings();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.nodes.Node[] nodeArray36 = new org.jsoup.nodes.Node[] { element28, element35 };
        org.jsoup.nodes.Element element37 = element20.insertChildren((int) (byte) 0, nodeArray36);
        boolean boolean38 = htmlTreeBuilder7.isSpecial(element20);
        org.jsoup.nodes.Element element40 = element20.text("hi!");
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean43 = tag42.isFormListed();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag42, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceActiveFormattingElement(element20, element45);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope(strArray5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inListItemScope("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope(strArray5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element33.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element33.firstElementSibling();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = htmlTreeBuilder0.inButtonScope("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        boolean boolean35 = element13.hasClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element13.lastElementSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        org.jsoup.nodes.Element element32 = element13.toggleClass("");
        org.jsoup.nodes.Element element34 = element13.addClass("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean37 = tag36.isFormListed();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag36, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceOnStack(element34, element39);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        boolean boolean6 = htmlTreeBuilder4.framesetOk();
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder4.state();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag27.isBlock();
        boolean boolean29 = tag27.isEmpty();
        boolean boolean30 = tag27.isFormListed();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Node[] nodeArray33 = new org.jsoup.nodes.Node[] { element25, element32 };
        org.jsoup.nodes.Element element34 = element17.insertChildren((int) (byte) 0, nodeArray33);
        boolean boolean35 = htmlTreeBuilder4.isSpecial(element17);
        org.jsoup.nodes.Element element37 = element17.text("hi!");
        org.jsoup.nodes.Element element38 = element37.shallowClone();
        org.jsoup.parser.Tag tag40 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean41 = tag40.isFormListed();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag40, "hi!");
        org.jsoup.nodes.Element element45 = element43.appendText("<hi!></hi!>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertOnStackAfter(element38, element43);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element6.lastElementSibling();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        boolean boolean35 = element13.hasClass("hi!");
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean39 = tag38.isBlock();
        boolean boolean40 = tag38.isEmpty();
        boolean boolean41 = tag38.isFormListed();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag38, "");
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean47 = tag46.isBlock();
        boolean boolean48 = tag46.isEmpty();
        boolean boolean49 = tag46.isFormListed();
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element(tag46, "");
        org.jsoup.parser.Tag tag53 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean54 = tag53.isBlock();
        boolean boolean55 = tag53.isEmpty();
        boolean boolean56 = tag53.isFormListed();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag53, "");
        org.jsoup.nodes.Node[] nodeArray59 = new org.jsoup.nodes.Node[] { element51, element58 };
        org.jsoup.nodes.Element element60 = element43.insertChildren((int) (byte) 0, nodeArray59);
        org.jsoup.select.Elements elements61 = element60.previousElementSiblings();
        org.jsoup.nodes.Element element62 = element13.insertChildren(1, (java.util.Collection<org.jsoup.nodes.Element>) elements61);
        org.jsoup.nodes.Element element64 = element13.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element65 = element13.firstElementSibling();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element26, element33 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((int) (byte) 0, nodeArray34);
        boolean boolean36 = htmlTreeBuilder5.isSpecial(element18);
        org.jsoup.nodes.Element element38 = element18.text("hi!");
        org.jsoup.nodes.Element element39 = element38.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = element39.dataset();
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean43 = tag42.isBlock();
        boolean boolean44 = tag42.isEmpty();
        boolean boolean45 = tag42.isFormListed();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag42, "");
        org.jsoup.parser.Tag tag50 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean51 = tag50.isBlock();
        boolean boolean52 = tag50.isEmpty();
        boolean boolean53 = tag50.isFormListed();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag50, "");
        org.jsoup.parser.Tag tag57 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean58 = tag57.isBlock();
        boolean boolean59 = tag57.isEmpty();
        boolean boolean60 = tag57.isFormListed();
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element(tag57, "");
        org.jsoup.nodes.Node[] nodeArray63 = new org.jsoup.nodes.Node[] { element55, element62 };
        org.jsoup.nodes.Element element64 = element47.insertChildren((int) (byte) 0, nodeArray63);
        org.jsoup.nodes.Element element66 = element64.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap67 = element66.dataset();
        org.jsoup.parser.Tag tag70 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean71 = tag70.isBlock();
        boolean boolean72 = tag70.isEmpty();
        boolean boolean73 = tag70.isFormListed();
        org.jsoup.nodes.Element element75 = new org.jsoup.nodes.Element(tag70, "");
        org.jsoup.parser.Tag tag78 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean79 = tag78.isBlock();
        boolean boolean80 = tag78.isEmpty();
        boolean boolean81 = tag78.isFormListed();
        org.jsoup.nodes.Element element83 = new org.jsoup.nodes.Element(tag78, "");
        org.jsoup.parser.Tag tag85 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean86 = tag85.isBlock();
        boolean boolean87 = tag85.isEmpty();
        boolean boolean88 = tag85.isFormListed();
        org.jsoup.nodes.Element element90 = new org.jsoup.nodes.Element(tag85, "");
        org.jsoup.nodes.Node[] nodeArray91 = new org.jsoup.nodes.Node[] { element83, element90 };
        org.jsoup.nodes.Element element92 = element75.insertChildren((int) (byte) 0, nodeArray91);
        org.jsoup.select.Elements elements93 = element92.previousElementSiblings();
        org.jsoup.nodes.Element element94 = element66.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements93);
        element94.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap97 = element94.dataset();
        org.jsoup.nodes.Element element98 = element39.appendChild((org.jsoup.nodes.Node) element94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element94);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        boolean boolean6 = htmlTreeBuilder4.framesetOk();
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder4.state();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag27.isBlock();
        boolean boolean29 = tag27.isEmpty();
        boolean boolean30 = tag27.isFormListed();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Node[] nodeArray33 = new org.jsoup.nodes.Node[] { element25, element32 };
        org.jsoup.nodes.Element element34 = element17.insertChildren((int) (byte) 0, nodeArray33);
        boolean boolean35 = htmlTreeBuilder4.isSpecial(element17);
        org.jsoup.nodes.Element element37 = element17.text("hi!");
        org.jsoup.nodes.Element element38 = element37.shallowClone();
        org.jsoup.nodes.Element element39 = element37.previousElementSibling();
        org.jsoup.nodes.Element element41 = element37.getElementById("hi!");
        org.jsoup.nodes.Element element43 = element37.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element44 = htmlTreeBuilder0.aboveOnStack(element37);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element26, element33 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((int) (byte) 0, nodeArray34);
        boolean boolean36 = htmlTreeBuilder5.isSpecial(element18);
        org.jsoup.nodes.Element element38 = element18.text("hi!");
        java.lang.String str39 = element38.baseUri();
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean43 = tag42.isBlock();
        boolean boolean44 = tag42.isEmpty();
        boolean boolean45 = tag42.isFormListed();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag42, "");
        org.jsoup.parser.Tag tag50 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean51 = tag50.isBlock();
        boolean boolean52 = tag50.isEmpty();
        boolean boolean53 = tag50.isFormListed();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag50, "");
        org.jsoup.parser.Tag tag57 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean58 = tag57.isBlock();
        boolean boolean59 = tag57.isEmpty();
        boolean boolean60 = tag57.isFormListed();
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element(tag57, "");
        org.jsoup.nodes.Node[] nodeArray63 = new org.jsoup.nodes.Node[] { element55, element62 };
        org.jsoup.nodes.Element element64 = element47.insertChildren((int) (byte) 0, nodeArray63);
        org.jsoup.select.Elements elements65 = element64.previousElementSiblings();
        org.jsoup.nodes.Element element66 = element38.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(element38);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = htmlTreeBuilder0.getActiveFormattingElement("");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element10.toggleClass("");
        java.lang.String str30 = element29.tagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document32 = htmlTreeBuilder31.getDocument();
        boolean boolean33 = htmlTreeBuilder31.framesetOk();
        boolean boolean34 = htmlTreeBuilder31.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState35 = htmlTreeBuilder31.state();
        htmlTreeBuilder31.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.Tag tag39 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean40 = tag39.isBlock();
        boolean boolean41 = tag39.isEmpty();
        boolean boolean42 = tag39.isFormListed();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag39, "");
        org.jsoup.parser.Tag tag47 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean48 = tag47.isBlock();
        boolean boolean49 = tag47.isEmpty();
        boolean boolean50 = tag47.isFormListed();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag47, "");
        org.jsoup.parser.Tag tag54 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean55 = tag54.isBlock();
        boolean boolean56 = tag54.isEmpty();
        boolean boolean57 = tag54.isFormListed();
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag54, "");
        org.jsoup.nodes.Node[] nodeArray60 = new org.jsoup.nodes.Node[] { element52, element59 };
        org.jsoup.nodes.Element element61 = element44.insertChildren((int) (byte) 0, nodeArray60);
        boolean boolean62 = htmlTreeBuilder31.isSpecial(element44);
        org.jsoup.nodes.Element element64 = element44.text("hi!");
        org.jsoup.nodes.Element element65 = element64.shallowClone();
        org.jsoup.nodes.Element element66 = element64.previousElementSibling();
        org.jsoup.nodes.Element element68 = element64.getElementById("hi!");
        org.jsoup.nodes.Element element70 = element64.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node71 = element70.root();
        org.jsoup.nodes.Element element73 = element70.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertOnStackAfter(element29, element70);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inListItemScope("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element4.lastElementSibling();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder3.getDocument();
        boolean boolean5 = htmlTreeBuilder3.framesetOk();
        boolean boolean6 = htmlTreeBuilder3.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder3.state();
        htmlTreeBuilder3.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder3.defaultSettings();
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag11.isBlock();
        boolean boolean13 = tag11.isEmpty();
        boolean boolean14 = tag11.isFormListed();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag11, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element24, element31 };
        org.jsoup.nodes.Element element33 = element16.insertChildren((int) (byte) 0, nodeArray32);
        boolean boolean34 = htmlTreeBuilder3.isSpecial(element16);
        org.jsoup.nodes.Element element36 = element16.text("hi!");
        boolean boolean38 = element16.hasClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean39 = htmlTreeBuilder0.isInActiveFormattingElements(element16);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag11.isBlock();
        boolean boolean13 = tag11.isEmpty();
        boolean boolean14 = tag11.isFormListed();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag11, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element24, element31 };
        org.jsoup.nodes.Element element33 = element16.insertChildren((int) (byte) 0, nodeArray32);
        org.jsoup.nodes.Element element35 = element33.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = element35.dataset();
        java.lang.String str38 = element35.attr("hi!");
        java.lang.String str39 = element35.wholeText();
        org.jsoup.select.Elements elements40 = element35.getAllElements();
        org.jsoup.select.Elements elements43 = element35.getElementsByAttributeValueMatching("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element35);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder18.getDocument();
        boolean boolean20 = htmlTreeBuilder18.framesetOk();
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder18.state();
        htmlTreeBuilder18.markInsertionMode();
        java.lang.String str24 = htmlTreeBuilder18.getBaseUri();
        htmlTreeBuilder18.setFosterInserts(true);
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        htmlTreeBuilder18.setHeadElement(element33);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element33.textNodes();
        org.jsoup.nodes.Element element37 = element33.tagName("hi!");
        org.jsoup.nodes.Element element39 = element37.text("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean40 = htmlTreeBuilder0.removeFromStack(element39);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder7.getDocument();
        boolean boolean9 = htmlTreeBuilder7.framesetOk();
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder7.defaultSettings();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.nodes.Node[] nodeArray36 = new org.jsoup.nodes.Node[] { element28, element35 };
        org.jsoup.nodes.Element element37 = element20.insertChildren((int) (byte) 0, nodeArray36);
        boolean boolean38 = htmlTreeBuilder7.isSpecial(element20);
        org.jsoup.nodes.Element element40 = element20.text("hi!");
        java.lang.String str41 = element40.baseUri();
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        boolean boolean54 = tag52.isEmpty();
        boolean boolean55 = tag52.isFormListed();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag52, "");
        org.jsoup.parser.Tag tag59 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean60 = tag59.isBlock();
        boolean boolean61 = tag59.isEmpty();
        boolean boolean62 = tag59.isFormListed();
        org.jsoup.nodes.Element element64 = new org.jsoup.nodes.Element(tag59, "");
        org.jsoup.nodes.Node[] nodeArray65 = new org.jsoup.nodes.Node[] { element57, element64 };
        org.jsoup.nodes.Element element66 = element49.insertChildren((int) (byte) 0, nodeArray65);
        org.jsoup.select.Elements elements67 = element66.previousElementSiblings();
        org.jsoup.nodes.Element element68 = element40.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements67);
        java.lang.String str69 = element68.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element68);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getActiveFormattingElement("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        org.jsoup.nodes.Element element37 = element34.attr("", "<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean39 = element34.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.select.Elements elements41 = element34.getElementsByIndexLessThan((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = element34.firstElementSibling();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        java.lang.String str12 = htmlTreeBuilder6.getBaseUri();
        htmlTreeBuilder6.setFosterInserts(true);
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        htmlTreeBuilder6.setHeadElement(element21);
        boolean boolean23 = element21.hasText();
        java.lang.String str24 = element21.tagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document26 = htmlTreeBuilder25.getDocument();
        boolean boolean27 = htmlTreeBuilder25.framesetOk();
        boolean boolean28 = htmlTreeBuilder25.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder25.state();
        htmlTreeBuilder25.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings31 = htmlTreeBuilder25.defaultSettings();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        boolean boolean56 = htmlTreeBuilder25.isSpecial(element38);
        org.jsoup.nodes.Element element58 = element38.text("hi!");
        java.lang.String str59 = element58.baseUri();
        org.jsoup.parser.Tag tag62 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean63 = tag62.isBlock();
        boolean boolean64 = tag62.isEmpty();
        boolean boolean65 = tag62.isFormListed();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag62, "");
        org.jsoup.parser.Tag tag70 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean71 = tag70.isBlock();
        boolean boolean72 = tag70.isEmpty();
        boolean boolean73 = tag70.isFormListed();
        org.jsoup.nodes.Element element75 = new org.jsoup.nodes.Element(tag70, "");
        org.jsoup.parser.Tag tag77 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean78 = tag77.isBlock();
        boolean boolean79 = tag77.isEmpty();
        boolean boolean80 = tag77.isFormListed();
        org.jsoup.nodes.Element element82 = new org.jsoup.nodes.Element(tag77, "");
        org.jsoup.nodes.Node[] nodeArray83 = new org.jsoup.nodes.Node[] { element75, element82 };
        org.jsoup.nodes.Element element84 = element67.insertChildren((int) (byte) 0, nodeArray83);
        org.jsoup.select.Elements elements85 = element84.previousElementSiblings();
        org.jsoup.nodes.Element element86 = element58.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertOnStackAfter(element21, element86);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder7.getDocument();
        boolean boolean9 = htmlTreeBuilder7.framesetOk();
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder7.defaultSettings();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.nodes.Node[] nodeArray36 = new org.jsoup.nodes.Node[] { element28, element35 };
        org.jsoup.nodes.Element element37 = element20.insertChildren((int) (byte) 0, nodeArray36);
        boolean boolean38 = htmlTreeBuilder7.isSpecial(element20);
        org.jsoup.nodes.Element element40 = element20.text("hi!");
        org.jsoup.nodes.Element element41 = element40.shallowClone();
        org.jsoup.nodes.Element element42 = element40.previousElementSibling();
        org.jsoup.nodes.Element element44 = element40.getElementById("hi!");
        int int45 = element40.childNodeSize();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList46 = element40.dataNodes();
        org.jsoup.select.Elements elements49 = element40.getElementsByAttributeValueContaining("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element40);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getActiveFormattingElement("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inButtonScope("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray10 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inSelectScope("<hi!></hi!>");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = element57.firstElementSibling();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        java.lang.String str21 = element15.html();
        java.lang.String str22 = element15.wholeText();
        java.lang.String str23 = element15.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element15.firstElementSibling();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = htmlTreeBuilder0.inButtonScope("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element26, element33 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((int) (byte) 0, nodeArray34);
        boolean boolean36 = htmlTreeBuilder5.isSpecial(element18);
        org.jsoup.nodes.Element element38 = element18.text("hi!");
        org.jsoup.nodes.Element element39 = element38.shallowClone();
        org.jsoup.nodes.Element element40 = element38.previousElementSibling();
        org.jsoup.nodes.Element element42 = element38.getElementById("hi!");
        org.jsoup.nodes.Element element44 = element38.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element46 = element44.prependText("");
        org.jsoup.select.Elements elements48 = element46.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.select.Elements elements49 = element46.siblingElements();
        boolean boolean50 = htmlTreeBuilder0.isSpecial(element46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.inScope("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        org.jsoup.nodes.Element element32 = element30.tagName("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements35 = element32.getElementsByAttributeValueStarting("<hi!></hi!>\n<hi!></hi!>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element32);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InCaption;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = htmlTreeBuilder0.insertStartTag("<hi!></hi!>");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.nodes.Node[] nodeArray35 = new org.jsoup.nodes.Node[] { element27, element34 };
        org.jsoup.nodes.Element element36 = element19.insertChildren((int) (byte) 0, nodeArray35);
        boolean boolean37 = htmlTreeBuilder6.isSpecial(element19);
        org.jsoup.nodes.Element element39 = element19.text("hi!");
        org.jsoup.nodes.Element element40 = element39.shallowClone();
        org.jsoup.select.Elements elements42 = element39.getElementsContainingOwnText("hi!");
        boolean boolean43 = htmlTreeBuilder0.isSpecial(element39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi!></hi!>");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = htmlTreeBuilder0.getFromStack("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        java.lang.String[] strArray3 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = htmlTreeBuilder0.inSelectScope("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getActiveFormattingElement("");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inListItemScope("<hi!></hi!>");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertStartTag("");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.ParseSettings parseSettings60 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String[] strArray2 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.ParseSettings parseSettings60 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getActiveFormattingElement("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.nodes.Node[] nodeArray35 = new org.jsoup.nodes.Node[] { element27, element34 };
        org.jsoup.nodes.Element element36 = element19.insertChildren((int) (byte) 0, nodeArray35);
        boolean boolean37 = htmlTreeBuilder6.isSpecial(element19);
        org.jsoup.nodes.Element element39 = element19.text("hi!");
        org.jsoup.nodes.Element element40 = element39.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = element40.dataset();
        int int42 = element40.elementSiblingIndex();
        org.jsoup.nodes.Node node43 = element40.previousSibling();
        org.jsoup.nodes.Element element45 = element40.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element40);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.ParseSettings parseSettings60 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        org.jsoup.nodes.Element element37 = element34.attr("", "<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean39 = element34.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.select.Elements elements41 = element34.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document42 = element34.ownerDocument();
        org.jsoup.nodes.Element element44 = element34.toggleClass("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element44.firstElementSibling();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = htmlTreeBuilder0.inTableScope("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray1 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inScope(strArray1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.isBlock();
        org.jsoup.select.Elements elements20 = element15.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements22 = element15.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element24 = element15.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element24.wrap("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        java.util.List<java.lang.String> strList18 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.List<java.lang.String> strList19 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        java.lang.String str12 = htmlTreeBuilder6.getBaseUri();
        htmlTreeBuilder6.setFosterInserts(true);
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        htmlTreeBuilder6.setHeadElement(element21);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList23 = element21.textNodes();
        java.lang.String str25 = element21.attr("");
        java.lang.String str26 = element21.cssSelector();
        int int27 = element21.siblingIndex();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document29 = htmlTreeBuilder28.getDocument();
        boolean boolean30 = htmlTreeBuilder28.framesetOk();
        boolean boolean31 = htmlTreeBuilder28.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder28.state();
        htmlTreeBuilder28.markInsertionMode();
        java.lang.String str34 = htmlTreeBuilder28.getBaseUri();
        htmlTreeBuilder28.setFosterInserts(true);
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean39 = tag38.isBlock();
        boolean boolean40 = tag38.isEmpty();
        boolean boolean41 = tag38.isFormListed();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag38, "");
        htmlTreeBuilder28.setHeadElement(element43);
        boolean boolean45 = element43.hasText();
        java.lang.String str46 = element43.tagName();
        java.lang.String str48 = element43.attr("");
        java.lang.String str49 = element43.html();
        java.lang.String str50 = element43.wholeText();
        org.jsoup.nodes.Element element52 = element43.toggleClass("");
        org.jsoup.select.Elements elements54 = element43.getElementsContainingText("");
        org.jsoup.nodes.Element element56 = element43.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element58 = element43.appendText("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertOnStackAfter(element21, element43);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document33 = htmlTreeBuilder32.getDocument();
        boolean boolean34 = htmlTreeBuilder32.framesetOk();
        boolean boolean35 = htmlTreeBuilder32.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState36 = htmlTreeBuilder32.state();
        htmlTreeBuilder32.markInsertionMode();
        java.lang.String str38 = htmlTreeBuilder32.getBaseUri();
        htmlTreeBuilder32.setFosterInserts(true);
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean43 = tag42.isBlock();
        boolean boolean44 = tag42.isEmpty();
        boolean boolean45 = tag42.isFormListed();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag42, "");
        htmlTreeBuilder32.setHeadElement(element47);
        boolean boolean49 = element47.hasText();
        java.lang.String str50 = element47.tagName();
        java.lang.String str52 = element47.attr("");
        java.lang.String str53 = element47.html();
        java.lang.String str54 = element47.wholeText();
        org.jsoup.nodes.Element element56 = element47.toggleClass("");
        org.jsoup.nodes.Element element58 = element56.prependElement("hi!");
        java.lang.String str59 = element58.data();
        org.jsoup.nodes.Element element61 = element58.toggleClass("<hi!></hi!>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element61);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        java.lang.String str28 = element25.attr("hi!");
        java.lang.String str29 = element25.wholeText();
        org.jsoup.select.Elements elements30 = element25.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element25.lastElementSibling();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element26, element33 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((int) (byte) 0, nodeArray34);
        boolean boolean36 = htmlTreeBuilder5.isSpecial(element18);
        org.jsoup.nodes.Element element38 = element18.text("hi!");
        org.jsoup.nodes.Element element39 = element38.shallowClone();
        org.jsoup.nodes.Element element40 = element38.previousElementSibling();
        org.jsoup.nodes.Element element42 = element38.getElementById("hi!");
        int int43 = element38.childNodeSize();
        org.jsoup.nodes.Element element45 = element38.val("hi!");
        org.jsoup.nodes.Attributes attributes46 = element38.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean47 = htmlTreeBuilder0.processStartTag("<hi!></hi!>", attributes46);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element6.toggleClass("");
        java.lang.String str26 = element6.html();
        org.jsoup.nodes.Element element28 = element6.getElementById("hi!");
        org.jsoup.select.Elements elements30 = element6.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.select.Elements elements33 = element6.getElementsByAttributeValueStarting("<hi!></hi!>\n<hi!></hi!>", "<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element6.wrap("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.nodes.Element element30 = element28.html("");
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element28);
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String[] strArray35 = new java.lang.String[] { "<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean36 = htmlTreeBuilder0.inScope(strArray35);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isFormListed();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag33, "hi!");
        org.jsoup.select.Elements elements38 = element36.getElementsMatchingText("hi!");
        org.jsoup.select.Elements elements39 = element36.nextElementSiblings();
        org.jsoup.nodes.Element element41 = element36.tagName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean42 = htmlTreeBuilder0.isInActiveFormattingElements(element41);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.nodes.Node[] nodeArray35 = new org.jsoup.nodes.Node[] { element27, element34 };
        org.jsoup.nodes.Element element36 = element19.insertChildren((int) (byte) 0, nodeArray35);
        boolean boolean37 = htmlTreeBuilder6.isSpecial(element19);
        org.jsoup.nodes.Element element39 = element19.text("hi!");
        org.jsoup.nodes.Element element40 = element39.shallowClone();
        org.jsoup.select.Elements elements42 = element39.getElementsContainingOwnText("hi!");
        java.lang.String str43 = element39.tagName();
        org.jsoup.select.Elements elements45 = element39.getElementsMatchingText("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element39);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.nodes.Node[] nodeArray35 = new org.jsoup.nodes.Node[] { element27, element34 };
        org.jsoup.nodes.Element element36 = element19.insertChildren((int) (byte) 0, nodeArray35);
        boolean boolean37 = htmlTreeBuilder6.isSpecial(element19);
        org.jsoup.nodes.Element element39 = element19.text("hi!");
        org.jsoup.nodes.Element element40 = element39.shallowClone();
        org.jsoup.select.Elements elements42 = element39.getElementsContainingOwnText("hi!");
        boolean boolean43 = htmlTreeBuilder0.isSpecial(element39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isEmpty();
        boolean boolean10 = tag7.isFormListed();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = htmlTreeBuilder0.aboveOnStack(element12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        htmlTreeBuilder0.transition(htmlTreeBuilderState33);
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray38 = new java.lang.String[] { "<hi! class=\"\">\n hi!\n</hi!>", "<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray38);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder2.getDocument();
        boolean boolean4 = htmlTreeBuilder2.framesetOk();
        boolean boolean5 = htmlTreeBuilder2.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder2.state();
        htmlTreeBuilder2.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder2.defaultSettings();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        boolean boolean20 = tag18.isEmpty();
        boolean boolean21 = tag18.isFormListed();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean26 = tag25.isBlock();
        boolean boolean27 = tag25.isEmpty();
        boolean boolean28 = tag25.isFormListed();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag25, "");
        org.jsoup.nodes.Node[] nodeArray31 = new org.jsoup.nodes.Node[] { element23, element30 };
        org.jsoup.nodes.Element element32 = element15.insertChildren((int) (byte) 0, nodeArray31);
        boolean boolean33 = htmlTreeBuilder2.isSpecial(element15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder2.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState35 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        htmlTreeBuilder2.transition(htmlTreeBuilderState35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState35);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        boolean boolean20 = tag18.isEmpty();
        boolean boolean21 = tag18.isFormListed();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean26 = tag25.isBlock();
        boolean boolean27 = tag25.isEmpty();
        boolean boolean28 = tag25.isFormListed();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag25, "");
        org.jsoup.nodes.Node[] nodeArray31 = new org.jsoup.nodes.Node[] { element23, element30 };
        org.jsoup.nodes.Element element32 = element15.insertChildren((int) (byte) 0, nodeArray31);
        org.jsoup.nodes.Element element34 = element32.tagName("<hi!></hi!>\n<hi!></hi!>");
        java.lang.String str35 = element32.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = htmlTreeBuilder0.aboveOnStack(element32);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.isBlock();
        org.jsoup.select.Elements elements20 = element15.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document22 = htmlTreeBuilder21.getDocument();
        boolean boolean23 = htmlTreeBuilder21.framesetOk();
        boolean boolean24 = htmlTreeBuilder21.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder21.state();
        htmlTreeBuilder21.markInsertionMode();
        java.lang.String str27 = htmlTreeBuilder21.getBaseUri();
        htmlTreeBuilder21.setFosterInserts(true);
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean32 = tag31.isBlock();
        boolean boolean33 = tag31.isEmpty();
        boolean boolean34 = tag31.isFormListed();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag31, "");
        htmlTreeBuilder21.setHeadElement(element36);
        boolean boolean38 = element36.hasText();
        java.lang.String str39 = element36.tagName();
        java.lang.String str41 = element36.attr("");
        java.lang.String str42 = element36.html();
        java.lang.String str43 = element36.wholeText();
        boolean boolean44 = element15.hasSameValue((java.lang.Object) element36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element36.firstElementSibling();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.select.Elements elements29 = element28.previousElementSiblings();
        org.jsoup.nodes.Element element31 = element28.removeClass("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements33 = element31.getElementsByAttribute("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element31.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = htmlTreeBuilder0.aboveOnStack(element31);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getFromStack("<hi!></hi!>");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray20 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = htmlTreeBuilder0.inScope("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>", strArray20);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        java.util.List<java.lang.String> strList18 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String[] strArray22 = new java.lang.String[] { "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi! class=\"\"></hi!>" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = htmlTreeBuilder0.inScope(strArray22);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        java.lang.String[] strArray33 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = htmlTreeBuilder0.inScope("<hi!>\n <hi!></hi!>\n</hi!>", strArray33);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inScope("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document12 = htmlTreeBuilder11.getDocument();
        boolean boolean13 = htmlTreeBuilder11.framesetOk();
        boolean boolean14 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder11.state();
        htmlTreeBuilder11.markInsertionMode();
        java.lang.String str17 = htmlTreeBuilder11.getBaseUri();
        htmlTreeBuilder11.setFosterInserts(true);
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        htmlTreeBuilder11.setHeadElement(element26);
        boolean boolean28 = element26.isBlock();
        org.jsoup.select.Elements elements31 = element26.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements33 = element26.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element35 = element26.text("<hi!></hi!>\n<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element35.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean37 = htmlTreeBuilder0.onStack(element35);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.nodes.Element element30 = element28.html("");
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element28);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder18.getDocument();
        boolean boolean20 = htmlTreeBuilder18.framesetOk();
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder18.state();
        htmlTreeBuilder18.markInsertionMode();
        java.lang.String str24 = htmlTreeBuilder18.getBaseUri();
        htmlTreeBuilder18.setFosterInserts(true);
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        htmlTreeBuilder18.setHeadElement(element33);
        boolean boolean35 = element33.isBlock();
        java.lang.String str36 = element33.data();
        org.jsoup.nodes.Element element39 = element33.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(element39);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inTableScope("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.isBlock();
        org.jsoup.select.Elements elements20 = element15.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements22 = element15.getElementsByIndexEquals((int) (byte) 100);
        int int23 = element15.siblingIndex();
        org.jsoup.select.Elements elements25 = element15.getElementsByAttribute("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element27 = element15.toggleClass("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element27.firstElementSibling();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder7.getDocument();
        boolean boolean9 = htmlTreeBuilder7.framesetOk();
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder7.defaultSettings();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.nodes.Node[] nodeArray36 = new org.jsoup.nodes.Node[] { element28, element35 };
        org.jsoup.nodes.Element element37 = element20.insertChildren((int) (byte) 0, nodeArray36);
        boolean boolean38 = htmlTreeBuilder7.isSpecial(element20);
        org.jsoup.nodes.Element element40 = element20.text("hi!");
        org.jsoup.nodes.Element element41 = element40.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = element41.dataset();
        boolean boolean43 = element6.hasSameValue((java.lang.Object) strMap42);
        org.jsoup.nodes.Node node44 = element6.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element6.lastElementSibling();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = htmlTreeBuilder0.getFromStack("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState61 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element26, element33 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((int) (byte) 0, nodeArray34);
        boolean boolean36 = htmlTreeBuilder5.isSpecial(element18);
        org.jsoup.nodes.Element element38 = element18.text("hi!");
        boolean boolean40 = element18.hasClass("hi!");
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag43.isEmpty();
        boolean boolean46 = tag43.isFormListed();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag43, "");
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag51.isBlock();
        boolean boolean53 = tag51.isEmpty();
        boolean boolean54 = tag51.isFormListed();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag51, "");
        org.jsoup.parser.Tag tag58 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean59 = tag58.isBlock();
        boolean boolean60 = tag58.isEmpty();
        boolean boolean61 = tag58.isFormListed();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element(tag58, "");
        org.jsoup.nodes.Node[] nodeArray64 = new org.jsoup.nodes.Node[] { element56, element63 };
        org.jsoup.nodes.Element element65 = element48.insertChildren((int) (byte) 0, nodeArray64);
        org.jsoup.select.Elements elements66 = element65.previousElementSiblings();
        org.jsoup.nodes.Element element67 = element18.insertChildren(1, (java.util.Collection<org.jsoup.nodes.Element>) elements66);
        java.lang.String str68 = element67.wholeText();
        org.jsoup.parser.Tag tag69 = element67.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = element67.childNodesCopy();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList71 = element67.textNodes();
        org.jsoup.nodes.Element element73 = element67.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean74 = htmlTreeBuilder0.removeFromStack(element67);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean18 = tag17.isBlock();
        boolean boolean19 = tag17.isEmpty();
        boolean boolean20 = tag17.isFormListed();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag17, "");
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        boolean boolean26 = tag24.isEmpty();
        boolean boolean27 = tag24.isFormListed();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag24, "");
        org.jsoup.nodes.Node[] nodeArray30 = new org.jsoup.nodes.Node[] { element22, element29 };
        org.jsoup.nodes.Element element31 = element14.insertChildren((int) (byte) 0, nodeArray30);
        org.jsoup.nodes.Element element33 = element31.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = element33.dataset();
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.isBlock();
        boolean boolean47 = tag45.isEmpty();
        boolean boolean48 = tag45.isFormListed();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "");
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        boolean boolean54 = tag52.isEmpty();
        boolean boolean55 = tag52.isFormListed();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag52, "");
        org.jsoup.nodes.Node[] nodeArray58 = new org.jsoup.nodes.Node[] { element50, element57 };
        org.jsoup.nodes.Element element59 = element42.insertChildren((int) (byte) 0, nodeArray58);
        org.jsoup.select.Elements elements60 = element59.previousElementSiblings();
        org.jsoup.nodes.Element element61 = element33.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements60);
        element61.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap64 = element61.dataset();
        org.jsoup.parser.Tag tag66 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean67 = tag66.isBlock();
        boolean boolean68 = tag66.isEmpty();
        boolean boolean69 = tag66.isFormListed();
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag66, "");
        org.jsoup.parser.Tag tag74 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean75 = tag74.isBlock();
        boolean boolean76 = tag74.isEmpty();
        boolean boolean77 = tag74.isFormListed();
        org.jsoup.nodes.Element element79 = new org.jsoup.nodes.Element(tag74, "");
        org.jsoup.parser.Tag tag81 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean82 = tag81.isBlock();
        boolean boolean83 = tag81.isEmpty();
        boolean boolean84 = tag81.isFormListed();
        org.jsoup.nodes.Element element86 = new org.jsoup.nodes.Element(tag81, "");
        org.jsoup.nodes.Node[] nodeArray87 = new org.jsoup.nodes.Node[] { element79, element86 };
        org.jsoup.nodes.Element element88 = element71.insertChildren((int) (byte) 0, nodeArray87);
        org.jsoup.select.Elements elements89 = element88.previousElementSiblings();
        java.lang.String str90 = element88.id();
        org.jsoup.nodes.Element element91 = element61.appendTo(element88);
        org.jsoup.nodes.Element element93 = element91.wrap("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element95 = element93.append("<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap96 = element95.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean97 = htmlTreeBuilder0.onStack(element95);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isSelfClosing();
        boolean boolean10 = tag6.formatAsBlock();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document12 = htmlTreeBuilder11.getDocument();
        boolean boolean13 = htmlTreeBuilder11.framesetOk();
        boolean boolean14 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder11.state();
        htmlTreeBuilder11.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder11.defaultSettings();
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag27.isBlock();
        boolean boolean29 = tag27.isEmpty();
        boolean boolean30 = tag27.isFormListed();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean35 = tag34.isBlock();
        boolean boolean36 = tag34.isEmpty();
        boolean boolean37 = tag34.isFormListed();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag34, "");
        org.jsoup.nodes.Node[] nodeArray40 = new org.jsoup.nodes.Node[] { element32, element39 };
        org.jsoup.nodes.Element element41 = element24.insertChildren((int) (byte) 0, nodeArray40);
        boolean boolean42 = htmlTreeBuilder11.isSpecial(element24);
        org.jsoup.nodes.Element element44 = element24.text("hi!");
        org.jsoup.nodes.Element element45 = element44.shallowClone();
        org.jsoup.nodes.Element element46 = element44.previousElementSibling();
        org.jsoup.select.Elements elements48 = element44.getElementsByIndexGreaterThan((int) (byte) 1);
        java.lang.String str49 = element44.className();
        boolean boolean50 = tag6.equals((java.lang.Object) element44);
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isFormListed();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag52, "hi!");
        org.jsoup.select.Elements elements57 = element55.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element59 = element55.addClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertOnStackAfter(element44, element59);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.nodes.Element element30 = element28.tagName("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements31 = element28.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element28);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inTableScope("<hi! class=\"\">\n hi!\n</hi!>");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element6.toggleClass("");
        org.jsoup.nodes.Element element27 = element6.addClass("<hi!></hi!>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element6.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.nodes.Element element30 = element28.html("");
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element28);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean36 = htmlTreeBuilder0.inButtonScope("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inTableScope("<hi!></hi!>");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isEmpty();
        boolean boolean10 = tag7.isFormListed();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.nodes.Node[] nodeArray28 = new org.jsoup.nodes.Node[] { element20, element27 };
        org.jsoup.nodes.Element element29 = element12.insertChildren((int) (byte) 0, nodeArray28);
        org.jsoup.nodes.Element element31 = element29.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = element31.dataset();
        org.jsoup.nodes.Element element33 = element31.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element33.childNodesCopy();
        org.jsoup.nodes.Element element36 = element33.append("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(element36);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.nodes.Node[] nodeArray35 = new org.jsoup.nodes.Node[] { element27, element34 };
        org.jsoup.nodes.Element element36 = element19.insertChildren((int) (byte) 0, nodeArray35);
        boolean boolean37 = htmlTreeBuilder6.isSpecial(element19);
        org.jsoup.nodes.Element element39 = element19.text("hi!");
        org.jsoup.nodes.Element element40 = element39.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = element40.dataset();
        int int42 = element40.elementSiblingIndex();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document44 = htmlTreeBuilder43.getDocument();
        boolean boolean45 = htmlTreeBuilder43.framesetOk();
        boolean boolean46 = htmlTreeBuilder43.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState47 = htmlTreeBuilder43.state();
        htmlTreeBuilder43.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings49 = htmlTreeBuilder43.defaultSettings();
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag51.isBlock();
        boolean boolean53 = tag51.isEmpty();
        boolean boolean54 = tag51.isFormListed();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag51, "");
        org.jsoup.parser.Tag tag59 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean60 = tag59.isBlock();
        boolean boolean61 = tag59.isEmpty();
        boolean boolean62 = tag59.isFormListed();
        org.jsoup.nodes.Element element64 = new org.jsoup.nodes.Element(tag59, "");
        org.jsoup.parser.Tag tag66 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean67 = tag66.isBlock();
        boolean boolean68 = tag66.isEmpty();
        boolean boolean69 = tag66.isFormListed();
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag66, "");
        org.jsoup.nodes.Node[] nodeArray72 = new org.jsoup.nodes.Node[] { element64, element71 };
        org.jsoup.nodes.Element element73 = element56.insertChildren((int) (byte) 0, nodeArray72);
        boolean boolean74 = htmlTreeBuilder43.isSpecial(element56);
        org.jsoup.nodes.Element element76 = element56.text("hi!");
        org.jsoup.nodes.Element element77 = element76.shallowClone();
        org.jsoup.nodes.Element element78 = element76.previousElementSibling();
        org.jsoup.nodes.Element element80 = element76.getElementById("hi!");
        org.jsoup.nodes.Element element82 = element76.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node83 = element82.root();
        org.jsoup.nodes.Element element85 = element82.text("hi!");
        org.jsoup.select.Elements elements87 = element85.getElementsByIndexLessThan(10);
        org.jsoup.select.Elements elements89 = element85.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Element element90 = element40.prependChild((org.jsoup.nodes.Node) element85);
        org.jsoup.select.Elements elements93 = element40.getElementsByAttributeValueNot("<hi!></hi!>\n<hi!></hi!>", "<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(element40);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder8.getDocument();
        boolean boolean10 = htmlTreeBuilder8.framesetOk();
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder8.defaultSettings();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        boolean boolean26 = tag24.isEmpty();
        boolean boolean27 = tag24.isFormListed();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag24, "");
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean32 = tag31.isBlock();
        boolean boolean33 = tag31.isEmpty();
        boolean boolean34 = tag31.isFormListed();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag31, "");
        org.jsoup.nodes.Node[] nodeArray37 = new org.jsoup.nodes.Node[] { element29, element36 };
        org.jsoup.nodes.Element element38 = element21.insertChildren((int) (byte) 0, nodeArray37);
        boolean boolean39 = htmlTreeBuilder8.isSpecial(element21);
        org.jsoup.nodes.Element element41 = element21.text("hi!");
        org.jsoup.nodes.Element element42 = element41.shallowClone();
        org.jsoup.nodes.Element element43 = element41.previousElementSibling();
        org.jsoup.nodes.Element element45 = element41.getElementById("hi!");
        int int46 = element41.childNodeSize();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList47 = element41.dataNodes();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document49 = htmlTreeBuilder48.getDocument();
        boolean boolean50 = htmlTreeBuilder48.framesetOk();
        boolean boolean51 = htmlTreeBuilder48.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState52 = htmlTreeBuilder48.state();
        htmlTreeBuilder48.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings54 = htmlTreeBuilder48.defaultSettings();
        org.jsoup.parser.Tag tag56 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean57 = tag56.isBlock();
        boolean boolean58 = tag56.isEmpty();
        boolean boolean59 = tag56.isFormListed();
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag56, "");
        org.jsoup.parser.Tag tag64 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean65 = tag64.isBlock();
        boolean boolean66 = tag64.isEmpty();
        boolean boolean67 = tag64.isFormListed();
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag64, "");
        org.jsoup.parser.Tag tag71 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean72 = tag71.isBlock();
        boolean boolean73 = tag71.isEmpty();
        boolean boolean74 = tag71.isFormListed();
        org.jsoup.nodes.Element element76 = new org.jsoup.nodes.Element(tag71, "");
        org.jsoup.nodes.Node[] nodeArray77 = new org.jsoup.nodes.Node[] { element69, element76 };
        org.jsoup.nodes.Element element78 = element61.insertChildren((int) (byte) 0, nodeArray77);
        boolean boolean79 = htmlTreeBuilder48.isSpecial(element61);
        org.jsoup.nodes.Element element81 = element61.text("hi!");
        org.jsoup.nodes.Element element82 = element81.shallowClone();
        org.jsoup.nodes.Element element85 = element82.attr("", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements87 = element85.getElementsContainingText("<hi!></hi!>\n<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList88 = element85.dataNodes();
        org.jsoup.nodes.Element element89 = element85.previousElementSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceOnStack(element41, element85);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inSelectScope("");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element15.lastElementSibling();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        htmlTreeBuilder0.transition(htmlTreeBuilderState33);
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean37 = tag36.isBlock();
        boolean boolean38 = tag36.isEmpty();
        boolean boolean39 = tag36.isFormListed();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag36, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag51.isBlock();
        boolean boolean53 = tag51.isEmpty();
        boolean boolean54 = tag51.isFormListed();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag51, "");
        org.jsoup.nodes.Node[] nodeArray57 = new org.jsoup.nodes.Node[] { element49, element56 };
        org.jsoup.nodes.Element element58 = element41.insertChildren((int) (byte) 0, nodeArray57);
        org.jsoup.select.Elements elements59 = element58.previousElementSiblings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder60 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document61 = htmlTreeBuilder60.getDocument();
        boolean boolean62 = htmlTreeBuilder60.framesetOk();
        boolean boolean63 = htmlTreeBuilder60.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState64 = htmlTreeBuilder60.state();
        htmlTreeBuilder60.markInsertionMode();
        java.lang.String str66 = htmlTreeBuilder60.getBaseUri();
        htmlTreeBuilder60.setFosterInserts(true);
        org.jsoup.parser.Tag tag70 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean71 = tag70.isBlock();
        boolean boolean72 = tag70.isEmpty();
        boolean boolean73 = tag70.isFormListed();
        org.jsoup.nodes.Element element75 = new org.jsoup.nodes.Element(tag70, "");
        htmlTreeBuilder60.setHeadElement(element75);
        boolean boolean77 = element75.hasText();
        java.lang.String str78 = element75.tagName();
        java.lang.String str80 = element75.attr("");
        java.lang.String str81 = element75.html();
        org.jsoup.nodes.Node node82 = element75.previousSibling();
        org.jsoup.nodes.Element element83 = element58.appendTo(element75);
        org.jsoup.nodes.Element element84 = element58.previousElementSibling();
        org.jsoup.nodes.Element element86 = element58.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList87 = element58.dataNodes();
        org.jsoup.parser.Tag tag90 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean91 = tag90.isBlock();
        boolean boolean92 = tag90.isEmpty();
        boolean boolean93 = tag90.isFormListed();
        org.jsoup.nodes.Element element95 = new org.jsoup.nodes.Element(tag90, "");
        org.jsoup.select.Elements elements96 = element95.nextElementSiblings();
        org.jsoup.nodes.Element element97 = element58.insertChildren((int) (byte) 1, (java.util.Collection<org.jsoup.nodes.Element>) elements96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements(element58);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder18.getDocument();
        boolean boolean20 = htmlTreeBuilder18.framesetOk();
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder18.state();
        htmlTreeBuilder18.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings24 = htmlTreeBuilder18.defaultSettings();
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean35 = tag34.isBlock();
        boolean boolean36 = tag34.isEmpty();
        boolean boolean37 = tag34.isFormListed();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag34, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.nodes.Node[] nodeArray47 = new org.jsoup.nodes.Node[] { element39, element46 };
        org.jsoup.nodes.Element element48 = element31.insertChildren((int) (byte) 0, nodeArray47);
        boolean boolean49 = htmlTreeBuilder18.isSpecial(element31);
        org.jsoup.nodes.Element element51 = element31.text("hi!");
        boolean boolean53 = element31.hasClass("hi!");
        org.jsoup.parser.Tag tag56 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean57 = tag56.isBlock();
        boolean boolean58 = tag56.isEmpty();
        boolean boolean59 = tag56.isFormListed();
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag56, "");
        org.jsoup.parser.Tag tag64 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean65 = tag64.isBlock();
        boolean boolean66 = tag64.isEmpty();
        boolean boolean67 = tag64.isFormListed();
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag64, "");
        org.jsoup.parser.Tag tag71 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean72 = tag71.isBlock();
        boolean boolean73 = tag71.isEmpty();
        boolean boolean74 = tag71.isFormListed();
        org.jsoup.nodes.Element element76 = new org.jsoup.nodes.Element(tag71, "");
        org.jsoup.nodes.Node[] nodeArray77 = new org.jsoup.nodes.Node[] { element69, element76 };
        org.jsoup.nodes.Element element78 = element61.insertChildren((int) (byte) 0, nodeArray77);
        org.jsoup.select.Elements elements79 = element78.previousElementSiblings();
        org.jsoup.nodes.Element element80 = element31.insertChildren(1, (java.util.Collection<org.jsoup.nodes.Element>) elements79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element81 = htmlTreeBuilder0.aboveOnStack(element31);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.isBlock();
        java.lang.String str18 = element15.data();
        org.jsoup.nodes.Element element21 = element15.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element15.lastElementSibling();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element4.previousElementSiblings();
        java.lang.String str8 = element4.tagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.setFosterInserts(false);
        java.lang.String str12 = htmlTreeBuilder9.getBaseUri();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder9.getDocument();
        boolean boolean14 = element4.hasSameValue((java.lang.Object) htmlTreeBuilder9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = htmlTreeBuilder9.pop();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.select.Elements elements29 = element28.previousElementSiblings();
        org.jsoup.nodes.Element element31 = element28.removeClass("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Node node32 = element28.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element28);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InCaption;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.inListItemScope("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element6.toggleClass("");
        org.jsoup.nodes.Element element27 = element6.addClass("<hi!></hi!>\n<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = element27.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element27.lastElementSibling();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder3.getDocument();
        boolean boolean5 = htmlTreeBuilder3.framesetOk();
        boolean boolean6 = htmlTreeBuilder3.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder3.state();
        htmlTreeBuilder3.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder3.defaultSettings();
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag11.isBlock();
        boolean boolean13 = tag11.isEmpty();
        boolean boolean14 = tag11.isFormListed();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag11, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element24, element31 };
        org.jsoup.nodes.Element element33 = element16.insertChildren((int) (byte) 0, nodeArray32);
        boolean boolean34 = htmlTreeBuilder3.isSpecial(element16);
        org.jsoup.nodes.Element element36 = element16.text("hi!");
        org.jsoup.nodes.Element element37 = element36.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = element37.dataset();
        int int39 = element37.elementSiblingIndex();
        org.jsoup.nodes.Node node40 = element37.previousSibling();
        java.lang.String str41 = element37.id();
        org.jsoup.select.Elements elements43 = element37.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean44 = htmlTreeBuilder0.isSpecial(element37);
        java.lang.String[] strArray45 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray45);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        boolean boolean35 = element13.hasClass("hi!");
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean39 = tag38.isBlock();
        boolean boolean40 = tag38.isEmpty();
        boolean boolean41 = tag38.isFormListed();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag38, "");
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean47 = tag46.isBlock();
        boolean boolean48 = tag46.isEmpty();
        boolean boolean49 = tag46.isFormListed();
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element(tag46, "");
        org.jsoup.parser.Tag tag53 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean54 = tag53.isBlock();
        boolean boolean55 = tag53.isEmpty();
        boolean boolean56 = tag53.isFormListed();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag53, "");
        org.jsoup.nodes.Node[] nodeArray59 = new org.jsoup.nodes.Node[] { element51, element58 };
        org.jsoup.nodes.Element element60 = element43.insertChildren((int) (byte) 0, nodeArray59);
        org.jsoup.select.Elements elements61 = element60.previousElementSiblings();
        org.jsoup.nodes.Element element62 = element13.insertChildren(1, (java.util.Collection<org.jsoup.nodes.Element>) elements61);
        java.lang.String str63 = element62.wholeText();
        org.jsoup.parser.Tag tag64 = element62.tag();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = element62.childNodesCopy();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList66 = element62.textNodes();
        org.jsoup.nodes.Element element68 = element62.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element70 = element62.wrap("<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean5 = tag4.isBlock();
        boolean boolean6 = tag4.isEmpty();
        boolean boolean7 = tag4.isFormListed();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag4, "");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.nodes.Node[] nodeArray25 = new org.jsoup.nodes.Node[] { element17, element24 };
        org.jsoup.nodes.Element element26 = element9.insertChildren((int) (byte) 0, nodeArray25);
        org.jsoup.nodes.Element element28 = element26.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = element28.dataset();
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean33 = tag32.isBlock();
        boolean boolean34 = tag32.isEmpty();
        boolean boolean35 = tag32.isFormListed();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag32, "");
        org.jsoup.parser.Tag tag40 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean41 = tag40.isBlock();
        boolean boolean42 = tag40.isEmpty();
        boolean boolean43 = tag40.isFormListed();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag40, "");
        org.jsoup.parser.Tag tag47 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean48 = tag47.isBlock();
        boolean boolean49 = tag47.isEmpty();
        boolean boolean50 = tag47.isFormListed();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag47, "");
        org.jsoup.nodes.Node[] nodeArray53 = new org.jsoup.nodes.Node[] { element45, element52 };
        org.jsoup.nodes.Element element54 = element37.insertChildren((int) (byte) 0, nodeArray53);
        org.jsoup.select.Elements elements55 = element54.previousElementSiblings();
        org.jsoup.nodes.Element element56 = element28.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements55);
        element56.setBaseUri("hi!");
        boolean boolean59 = element56.isBlock();
        org.jsoup.nodes.Element element61 = element56.prependElement("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements(element61);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inButtonScope("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isFormListed();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag5, "hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element12 = element8.addClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Attributes attributes13 = element8.attributes();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.nodes.Node[] nodeArray36 = new org.jsoup.nodes.Node[] { element28, element35 };
        org.jsoup.nodes.Element element37 = element20.insertChildren((int) (byte) 0, nodeArray36);
        org.jsoup.nodes.Element element39 = element37.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = element39.dataset();
        java.lang.String str42 = element39.attr("hi!");
        java.lang.String str43 = element39.wholeText();
        org.jsoup.select.Elements elements44 = element39.getAllElements();
        org.jsoup.select.Elements elements47 = element39.getElementsByAttributeValueMatching("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = element39.childNodesCopy();
        org.jsoup.select.Elements elements49 = element39.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertOnStackAfter(element8, element39);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("hi!.hi!.<hi!>.<hi!></hi!>.</hi!>");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder18.getDocument();
        boolean boolean20 = htmlTreeBuilder18.framesetOk();
        boolean boolean21 = htmlTreeBuilder18.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder18.state();
        htmlTreeBuilder18.markInsertionMode();
        java.lang.String str24 = htmlTreeBuilder18.getBaseUri();
        htmlTreeBuilder18.setFosterInserts(true);
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        htmlTreeBuilder18.setHeadElement(element33);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element33.textNodes();
        org.jsoup.nodes.Element element37 = element33.tagName("hi!");
        java.lang.String str38 = element33.wholeText();
        org.jsoup.nodes.Element element41 = element33.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element33);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isEmpty();
        boolean boolean7 = tag5.isData();
        boolean boolean8 = tag5.isFormListed();
        boolean boolean9 = tag5.isFormListed();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag12, "hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element19 = element15.addClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Attributes attributes20 = element15.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag5, "", attributes20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = htmlTreeBuilder0.processStartTag("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>", attributes20);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document34 = htmlTreeBuilder33.getDocument();
        boolean boolean35 = htmlTreeBuilder33.framesetOk();
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder33.state();
        htmlTreeBuilder33.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings39 = htmlTreeBuilder33.defaultSettings();
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag49 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean50 = tag49.isBlock();
        boolean boolean51 = tag49.isEmpty();
        boolean boolean52 = tag49.isFormListed();
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag49, "");
        org.jsoup.parser.Tag tag56 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean57 = tag56.isBlock();
        boolean boolean58 = tag56.isEmpty();
        boolean boolean59 = tag56.isFormListed();
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag56, "");
        org.jsoup.nodes.Node[] nodeArray62 = new org.jsoup.nodes.Node[] { element54, element61 };
        org.jsoup.nodes.Element element63 = element46.insertChildren((int) (byte) 0, nodeArray62);
        boolean boolean64 = htmlTreeBuilder33.isSpecial(element46);
        org.jsoup.nodes.Element element66 = element46.text("hi!");
        org.jsoup.nodes.Element element67 = element66.shallowClone();
        org.jsoup.select.Elements elements69 = element66.getElementsContainingOwnText("hi!");
        java.lang.String str70 = element66.tagName();
        org.jsoup.select.Elements elements72 = element66.getElementsMatchingOwnText("<hi!></hi!>\n<hi!></hi!>");
        java.lang.String str73 = element66.cssSelector();
        org.jsoup.select.Elements elements75 = element66.getElementsByIndexEquals(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element76 = htmlTreeBuilder0.aboveOnStack(element66);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder8.getDocument();
        boolean boolean10 = htmlTreeBuilder8.framesetOk();
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder8.defaultSettings();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        boolean boolean26 = tag24.isEmpty();
        boolean boolean27 = tag24.isFormListed();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag24, "");
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean32 = tag31.isBlock();
        boolean boolean33 = tag31.isEmpty();
        boolean boolean34 = tag31.isFormListed();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag31, "");
        org.jsoup.nodes.Node[] nodeArray37 = new org.jsoup.nodes.Node[] { element29, element36 };
        org.jsoup.nodes.Element element38 = element21.insertChildren((int) (byte) 0, nodeArray37);
        boolean boolean39 = htmlTreeBuilder8.isSpecial(element21);
        org.jsoup.nodes.Element element41 = element21.text("hi!");
        boolean boolean42 = element41.hasText();
        java.lang.String str43 = element41.html();
        org.jsoup.nodes.Element element45 = element41.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean46 = htmlTreeBuilder0.isInActiveFormattingElements(element41);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean9 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.nodes.Node[] nodeArray50 = new org.jsoup.nodes.Node[] { element42, element49 };
        org.jsoup.nodes.Element element51 = element34.insertChildren((int) (byte) 0, nodeArray50);
        org.jsoup.select.Elements elements52 = element51.previousElementSiblings();
        org.jsoup.nodes.Element element53 = element25.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements52);
        element53.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap56 = element53.dataset();
        java.lang.String str57 = element53.val();
        org.jsoup.nodes.Element element59 = element53.appendText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element61 = element59.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("<hi! class=\"\">\n hi!\n</hi!>");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean62 = htmlTreeBuilder0.inScope("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        java.lang.String str11 = htmlTreeBuilder5.getBaseUri();
        htmlTreeBuilder5.setFosterInserts(true);
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        htmlTreeBuilder5.setHeadElement(element20);
        boolean boolean22 = element20.isBlock();
        org.jsoup.select.Elements elements25 = element20.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements27 = element20.getElementsByIndexEquals((int) (byte) 100);
        int int28 = element20.siblingIndex();
        org.jsoup.select.Elements elements30 = element20.getElementsByAttribute("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = htmlTreeBuilder0.onStack(element20);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        boolean boolean34 = element33.hasText();
        java.lang.String str35 = element33.html();
        org.jsoup.nodes.Element element37 = element33.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element33.wrap("<hi!></hi!>");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element4.previousElementSiblings();
        java.lang.String str8 = element4.tagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.setFosterInserts(false);
        java.lang.String str12 = htmlTreeBuilder9.getBaseUri();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder9.getDocument();
        boolean boolean14 = element4.hasSameValue((java.lang.Object) htmlTreeBuilder9);
        org.jsoup.parser.ParseSettings parseSettings15 = htmlTreeBuilder9.defaultSettings();
        java.lang.String[] strArray16 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder9.popStackToClose(strArray16);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = htmlTreeBuilder0.inScope("<<hi! class=\"\">\n hi!\n</hi!>></<hi! class=\"\">\n hi!\n</hi!>>");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inTableScope("<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean5 = tag4.isBlock();
        boolean boolean6 = tag4.isEmpty();
        boolean boolean7 = tag4.isFormListed();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag4, "");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.nodes.Node[] nodeArray25 = new org.jsoup.nodes.Node[] { element17, element24 };
        org.jsoup.nodes.Element element26 = element9.insertChildren((int) (byte) 0, nodeArray25);
        org.jsoup.nodes.Element element28 = element26.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = element28.dataset();
        org.jsoup.nodes.Element element30 = element28.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element30.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element30.childNodes();
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = htmlTreeBuilder0.getActiveFormattingElement("<<hi! class=\"\">\n hi!\n</hi!>></<hi! class=\"\">\n hi!\n</hi!>>");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder7.getDocument();
        boolean boolean9 = htmlTreeBuilder7.framesetOk();
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder7.defaultSettings();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.nodes.Node[] nodeArray36 = new org.jsoup.nodes.Node[] { element28, element35 };
        org.jsoup.nodes.Element element37 = element20.insertChildren((int) (byte) 0, nodeArray36);
        boolean boolean38 = htmlTreeBuilder7.isSpecial(element20);
        org.jsoup.nodes.Element element40 = element20.text("hi!");
        org.jsoup.nodes.Element element41 = element40.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = element41.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = htmlTreeBuilder0.aboveOnStack(element41);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.select.Elements elements29 = element28.previousElementSiblings();
        java.lang.String str30 = element28.id();
        org.jsoup.select.Elements elements31 = element28.parents();
        int int32 = element28.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element28);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.nodes.Node[] nodeArray50 = new org.jsoup.nodes.Node[] { element42, element49 };
        org.jsoup.nodes.Element element51 = element34.insertChildren((int) (byte) 0, nodeArray50);
        org.jsoup.select.Elements elements52 = element51.previousElementSiblings();
        org.jsoup.nodes.Element element53 = element25.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements52);
        org.jsoup.nodes.Node node54 = element53.clearAttributes();
        org.jsoup.nodes.Element element56 = element53.removeClass("hi!");
        org.jsoup.nodes.Node node57 = element53.nextSibling();
        java.lang.String str59 = element53.absUrl("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element60 = element53.lastElementSibling();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Node node24 = element6.nextSibling();
        org.jsoup.select.Elements elements27 = element6.getElementsByAttributeValueMatching("", "hi!");
        org.jsoup.select.Elements elements29 = element6.getElementsByIndexGreaterThan(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element6.lastElementSibling();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        boolean boolean6 = htmlTreeBuilder4.framesetOk();
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder4.state();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag27.isBlock();
        boolean boolean29 = tag27.isEmpty();
        boolean boolean30 = tag27.isFormListed();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Node[] nodeArray33 = new org.jsoup.nodes.Node[] { element25, element32 };
        org.jsoup.nodes.Element element34 = element17.insertChildren((int) (byte) 0, nodeArray33);
        boolean boolean35 = htmlTreeBuilder4.isSpecial(element17);
        org.jsoup.nodes.Element element37 = element17.text("hi!");
        org.jsoup.nodes.Element element38 = element37.shallowClone();
        org.jsoup.nodes.Element element39 = element37.previousElementSibling();
        org.jsoup.select.Elements elements41 = element37.getElementsByIndexGreaterThan((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean42 = htmlTreeBuilder0.onStack(element37);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String[] strArray10 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.inScope("", strArray10);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean5 = tag4.isBlock();
        boolean boolean6 = tag4.isEmpty();
        boolean boolean7 = tag4.isFormListed();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag4, "");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.nodes.Node[] nodeArray25 = new org.jsoup.nodes.Node[] { element17, element24 };
        org.jsoup.nodes.Element element26 = element9.insertChildren((int) (byte) 0, nodeArray25);
        org.jsoup.nodes.Element element28 = element26.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = element28.dataset();
        org.jsoup.nodes.Element element30 = element28.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element30.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element30.childNodes();
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder34.getDocument();
        boolean boolean36 = htmlTreeBuilder34.framesetOk();
        boolean boolean37 = htmlTreeBuilder34.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState38 = htmlTreeBuilder34.state();
        htmlTreeBuilder34.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings40 = htmlTreeBuilder34.defaultSettings();
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean43 = tag42.isBlock();
        boolean boolean44 = tag42.isEmpty();
        boolean boolean45 = tag42.isFormListed();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag42, "");
        org.jsoup.parser.Tag tag50 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean51 = tag50.isBlock();
        boolean boolean52 = tag50.isEmpty();
        boolean boolean53 = tag50.isFormListed();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag50, "");
        org.jsoup.parser.Tag tag57 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean58 = tag57.isBlock();
        boolean boolean59 = tag57.isEmpty();
        boolean boolean60 = tag57.isFormListed();
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element(tag57, "");
        org.jsoup.nodes.Node[] nodeArray63 = new org.jsoup.nodes.Node[] { element55, element62 };
        org.jsoup.nodes.Element element64 = element47.insertChildren((int) (byte) 0, nodeArray63);
        boolean boolean65 = htmlTreeBuilder34.isSpecial(element47);
        org.jsoup.parser.Tag tag66 = element47.tag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder67 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document68 = htmlTreeBuilder67.getDocument();
        boolean boolean69 = htmlTreeBuilder67.framesetOk();
        boolean boolean70 = htmlTreeBuilder67.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState71 = htmlTreeBuilder67.state();
        htmlTreeBuilder67.markInsertionMode();
        java.lang.String str73 = htmlTreeBuilder67.getBaseUri();
        htmlTreeBuilder67.setFosterInserts(true);
        org.jsoup.parser.Tag tag77 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean78 = tag77.isBlock();
        boolean boolean79 = tag77.isEmpty();
        boolean boolean80 = tag77.isFormListed();
        org.jsoup.nodes.Element element82 = new org.jsoup.nodes.Element(tag77, "");
        htmlTreeBuilder67.setHeadElement(element82);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList84 = element82.textNodes();
        org.jsoup.nodes.Element element86 = element82.tagName("hi!");
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet91 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet91, strArray90);
        org.jsoup.nodes.Element element93 = element82.classNames((java.util.Set<java.lang.String>) strSet91);
        org.jsoup.nodes.Element element94 = element47.classNames((java.util.Set<java.lang.String>) strSet91);
        java.lang.String str95 = element47.nodeName();
        org.jsoup.nodes.Element element98 = element47.attr("hi!", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean99 = htmlTreeBuilder0.onStack(element47);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element18 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = htmlTreeBuilder0.getFromStack("<hi!>\n <hi! class=\"\"> \n  <hi!></hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element6.toggleClass("");
        org.jsoup.nodes.Element element27 = element6.addClass("<hi!></hi!>\n<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = element27.dataset();
        org.jsoup.nodes.Element element30 = element27.append("");
        org.jsoup.nodes.Element element32 = element30.child((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element30.firstElementSibling();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        htmlTreeBuilder0.transition(htmlTreeBuilderState33);
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        boolean boolean25 = element23.hasAttr("");
        int int26 = element23.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element23.wrap("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        boolean boolean6 = htmlTreeBuilder4.framesetOk();
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder4.state();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag27.isBlock();
        boolean boolean29 = tag27.isEmpty();
        boolean boolean30 = tag27.isFormListed();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Node[] nodeArray33 = new org.jsoup.nodes.Node[] { element25, element32 };
        org.jsoup.nodes.Element element34 = element17.insertChildren((int) (byte) 0, nodeArray33);
        boolean boolean35 = htmlTreeBuilder4.isSpecial(element17);
        org.jsoup.nodes.Element element37 = element17.text("hi!");
        org.jsoup.nodes.Element element38 = element37.shallowClone();
        org.jsoup.nodes.Element element39 = element37.previousElementSibling();
        org.jsoup.nodes.Element element41 = element37.getElementById("hi!");
        org.jsoup.nodes.Element element43 = element37.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        int int44 = element43.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = htmlTreeBuilder0.aboveOnStack(element43);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = htmlTreeBuilder0.inTableScope("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inButtonScope("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isEmpty();
        boolean boolean10 = tag7.isFormListed();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.nodes.Node[] nodeArray28 = new org.jsoup.nodes.Node[] { element20, element27 };
        org.jsoup.nodes.Element element29 = element12.insertChildren((int) (byte) 0, nodeArray28);
        org.jsoup.nodes.Element element31 = element29.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = element31.dataset();
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean36 = tag35.isBlock();
        boolean boolean37 = tag35.isEmpty();
        boolean boolean38 = tag35.isFormListed();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag35, "");
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag43.isEmpty();
        boolean boolean46 = tag43.isFormListed();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag43, "");
        org.jsoup.parser.Tag tag50 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean51 = tag50.isBlock();
        boolean boolean52 = tag50.isEmpty();
        boolean boolean53 = tag50.isFormListed();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag50, "");
        org.jsoup.nodes.Node[] nodeArray56 = new org.jsoup.nodes.Node[] { element48, element55 };
        org.jsoup.nodes.Element element57 = element40.insertChildren((int) (byte) 0, nodeArray56);
        org.jsoup.select.Elements elements58 = element57.previousElementSiblings();
        org.jsoup.nodes.Element element59 = element31.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements58);
        org.jsoup.nodes.Node node60 = element59.clearAttributes();
        boolean boolean62 = element59.hasAttr("");
        org.jsoup.nodes.Element element65 = element59.attr("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element59);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = org.jsoup.parser.HtmlTreeBuilderState.AfterHead;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState3);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertStartTag("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element6.toggleClass("");
        java.lang.String str26 = element6.html();
        boolean boolean28 = element6.hasClass("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element6.firstElementSibling();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.nodes.Node[] nodeArray35 = new org.jsoup.nodes.Node[] { element27, element34 };
        org.jsoup.nodes.Element element36 = element19.insertChildren((int) (byte) 0, nodeArray35);
        boolean boolean37 = htmlTreeBuilder6.isSpecial(element19);
        org.jsoup.nodes.Element element39 = element19.text("hi!");
        org.jsoup.nodes.Element element40 = element39.shallowClone();
        org.jsoup.nodes.Element element41 = element39.previousElementSibling();
        boolean boolean42 = element39.hasText();
        java.lang.String str43 = element39.tagName();
        org.jsoup.select.Elements elements44 = element39.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element39);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        element57.setBaseUri("hi!");
        boolean boolean60 = element57.isBlock();
        org.jsoup.nodes.Element element62 = element57.prependElement("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean63 = htmlTreeBuilder0.onStack(element57);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        boolean boolean35 = element13.hasClass("hi!");
        java.lang.String str36 = element13.html();
        java.lang.String str37 = element13.id();
        element13.setBaseUri("<hi!></hi!>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = element13.wrap("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document10 = htmlTreeBuilder9.getDocument();
        boolean boolean11 = htmlTreeBuilder9.framesetOk();
        boolean boolean12 = htmlTreeBuilder9.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder9.state();
        htmlTreeBuilder9.markInsertionMode();
        java.lang.String str15 = htmlTreeBuilder9.getBaseUri();
        htmlTreeBuilder9.setFosterInserts(true);
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        htmlTreeBuilder9.setHeadElement(element24);
        boolean boolean26 = element24.hasText();
        java.lang.String str27 = element24.tagName();
        java.lang.String str29 = element24.attr("");
        java.lang.String str30 = element24.html();
        java.lang.String str31 = element24.wholeText();
        org.jsoup.nodes.Element element33 = element24.toggleClass("");
        org.jsoup.select.Elements elements35 = element24.getElementsContainingText("");
        org.jsoup.nodes.Element element37 = element24.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element39 = element24.appendText("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements(element24);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.nodes.Element element30 = element28.html("");
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element28);
        java.lang.String str32 = element28.baseUri();
        boolean boolean34 = element28.hasAttr("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element28.wrap("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document10 = htmlTreeBuilder9.getDocument();
        boolean boolean11 = htmlTreeBuilder9.framesetOk();
        boolean boolean12 = htmlTreeBuilder9.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder9.state();
        htmlTreeBuilder9.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings15 = htmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean18 = tag17.isBlock();
        boolean boolean19 = tag17.isEmpty();
        boolean boolean20 = tag17.isFormListed();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag17, "");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean26 = tag25.isBlock();
        boolean boolean27 = tag25.isEmpty();
        boolean boolean28 = tag25.isFormListed();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag25, "");
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean33 = tag32.isBlock();
        boolean boolean34 = tag32.isEmpty();
        boolean boolean35 = tag32.isFormListed();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag32, "");
        org.jsoup.nodes.Node[] nodeArray38 = new org.jsoup.nodes.Node[] { element30, element37 };
        org.jsoup.nodes.Element element39 = element22.insertChildren((int) (byte) 0, nodeArray38);
        boolean boolean40 = htmlTreeBuilder9.isSpecial(element22);
        org.jsoup.nodes.Element element42 = element22.text("hi!");
        boolean boolean43 = element42.hasText();
        java.lang.String str44 = element42.html();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document46 = htmlTreeBuilder45.getDocument();
        boolean boolean47 = htmlTreeBuilder45.framesetOk();
        boolean boolean48 = htmlTreeBuilder45.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState49 = htmlTreeBuilder45.state();
        htmlTreeBuilder45.markInsertionMode();
        java.lang.String str51 = htmlTreeBuilder45.getBaseUri();
        htmlTreeBuilder45.setFosterInserts(true);
        org.jsoup.parser.Tag tag55 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean56 = tag55.isBlock();
        boolean boolean57 = tag55.isEmpty();
        boolean boolean58 = tag55.isFormListed();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag55, "");
        htmlTreeBuilder45.setHeadElement(element60);
        boolean boolean62 = element60.hasText();
        java.lang.String str63 = element60.tagName();
        java.lang.String str65 = element60.attr("");
        java.lang.String str66 = element60.html();
        java.lang.String str67 = element60.wholeText();
        org.jsoup.nodes.Element element69 = element60.toggleClass("");
        org.jsoup.nodes.Element element71 = element69.prependElement("hi!");
        org.jsoup.nodes.Element element72 = element42.prependChild((org.jsoup.nodes.Node) element69);
        org.jsoup.nodes.Element element74 = element69.wrap("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList75 = element69.dataNodes();
        org.jsoup.nodes.Element element76 = element69.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean77 = htmlTreeBuilder0.removeFromStack(element69);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.nodes.Element element30 = element28.html("");
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inScope("<<hi! class=\"\">\n hi!\n</hi!>></<hi! class=\"\">\n hi!\n</hi!>>", strArray9);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("hi!.hi!.<hi!>.<hi!></hi!>.</hi!>");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inSelectScope("<<hi! class=\"\">\n hi!\n</hi!>></<hi! class=\"\">\n hi!\n</hi!>>");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element26, element33 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((int) (byte) 0, nodeArray34);
        boolean boolean36 = htmlTreeBuilder5.isSpecial(element18);
        org.jsoup.nodes.Element element38 = element18.text("hi!");
        boolean boolean40 = element18.hasClass("hi!");
        java.lang.String str41 = element18.html();
        java.lang.String str42 = element18.id();
        org.jsoup.select.Elements elements43 = element18.previousElementSiblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean44 = htmlTreeBuilder0.onStack(element18);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inButtonScope("<hi! class=\"\">\n hi!\n</hi!>");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inTableScope("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        java.lang.String str14 = element13.ownText();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.select.Elements elements22 = element21.nextElementSiblings();
        org.jsoup.nodes.Element element24 = element21.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceOnStack(element13, element24);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        org.jsoup.nodes.Element element32 = element30.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = element32.dataset();
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean37 = tag36.isBlock();
        boolean boolean38 = tag36.isEmpty();
        boolean boolean39 = tag36.isFormListed();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag36, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag51.isBlock();
        boolean boolean53 = tag51.isEmpty();
        boolean boolean54 = tag51.isFormListed();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag51, "");
        org.jsoup.nodes.Node[] nodeArray57 = new org.jsoup.nodes.Node[] { element49, element56 };
        org.jsoup.nodes.Element element58 = element41.insertChildren((int) (byte) 0, nodeArray57);
        org.jsoup.select.Elements elements59 = element58.previousElementSiblings();
        org.jsoup.nodes.Element element60 = element32.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements59);
        org.jsoup.nodes.Node node61 = element60.clearAttributes();
        org.jsoup.nodes.Element element63 = element60.removeClass("hi!");
        java.lang.String str64 = element63.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(element63);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        boolean boolean6 = htmlTreeBuilder4.framesetOk();
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder4.state();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag27.isBlock();
        boolean boolean29 = tag27.isEmpty();
        boolean boolean30 = tag27.isFormListed();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Node[] nodeArray33 = new org.jsoup.nodes.Node[] { element25, element32 };
        org.jsoup.nodes.Element element34 = element17.insertChildren((int) (byte) 0, nodeArray33);
        boolean boolean35 = htmlTreeBuilder4.isSpecial(element17);
        int int36 = element17.siblingIndex();
        org.jsoup.nodes.Element element38 = element17.append("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document40 = htmlTreeBuilder39.getDocument();
        boolean boolean41 = htmlTreeBuilder39.framesetOk();
        boolean boolean42 = htmlTreeBuilder39.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState43 = htmlTreeBuilder39.state();
        htmlTreeBuilder39.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings45 = htmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.Tag tag47 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean48 = tag47.isBlock();
        boolean boolean49 = tag47.isEmpty();
        boolean boolean50 = tag47.isFormListed();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag47, "");
        org.jsoup.parser.Tag tag55 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean56 = tag55.isBlock();
        boolean boolean57 = tag55.isEmpty();
        boolean boolean58 = tag55.isFormListed();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag55, "");
        org.jsoup.parser.Tag tag62 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean63 = tag62.isBlock();
        boolean boolean64 = tag62.isEmpty();
        boolean boolean65 = tag62.isFormListed();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag62, "");
        org.jsoup.nodes.Node[] nodeArray68 = new org.jsoup.nodes.Node[] { element60, element67 };
        org.jsoup.nodes.Element element69 = element52.insertChildren((int) (byte) 0, nodeArray68);
        boolean boolean70 = htmlTreeBuilder39.isSpecial(element52);
        int int71 = element52.siblingIndex();
        org.jsoup.nodes.Element element73 = element52.appendElement("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements75 = element52.getElementsByIndexEquals((int) (short) 1);
        org.jsoup.nodes.Element element76 = element38.appendChild((org.jsoup.nodes.Node) element52);
        org.jsoup.nodes.Attributes attributes77 = element38.attributes();
        java.lang.String str78 = element38.wholeText();
        org.jsoup.select.Elements elements80 = element38.getElementsByIndexGreaterThan((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(element38);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getFromStack("hi!.hi!.<hi!>.<hi!></hi!>.</hi!>");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inButtonScope("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element4.previousElementSiblings();
        java.lang.String str8 = element4.tagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.setFosterInserts(false);
        java.lang.String str12 = htmlTreeBuilder9.getBaseUri();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder9.getDocument();
        boolean boolean14 = element4.hasSameValue((java.lang.Object) htmlTreeBuilder9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = htmlTreeBuilder9.inListItemScope("");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder8.getDocument();
        boolean boolean10 = htmlTreeBuilder8.framesetOk();
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element26, element33 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((int) (byte) 0, nodeArray34);
        org.jsoup.nodes.Element element37 = element35.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = element37.dataset();
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag49 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean50 = tag49.isBlock();
        boolean boolean51 = tag49.isEmpty();
        boolean boolean52 = tag49.isFormListed();
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag49, "");
        org.jsoup.parser.Tag tag56 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean57 = tag56.isBlock();
        boolean boolean58 = tag56.isEmpty();
        boolean boolean59 = tag56.isFormListed();
        org.jsoup.nodes.Element element61 = new org.jsoup.nodes.Element(tag56, "");
        org.jsoup.nodes.Node[] nodeArray62 = new org.jsoup.nodes.Node[] { element54, element61 };
        org.jsoup.nodes.Element element63 = element46.insertChildren((int) (byte) 0, nodeArray62);
        org.jsoup.select.Elements elements64 = element63.previousElementSiblings();
        org.jsoup.nodes.Element element65 = element37.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements64);
        boolean boolean66 = htmlTreeBuilder8.isSpecial(element65);
        org.jsoup.nodes.Element element67 = element65.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element68 = htmlTreeBuilder0.aboveOnStack(element67);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder7.getDocument();
        boolean boolean9 = htmlTreeBuilder7.framesetOk();
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.markInsertionMode();
        java.lang.String str13 = htmlTreeBuilder7.getBaseUri();
        htmlTreeBuilder7.setFosterInserts(true);
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean18 = tag17.isBlock();
        boolean boolean19 = tag17.isEmpty();
        boolean boolean20 = tag17.isFormListed();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag17, "");
        htmlTreeBuilder7.setHeadElement(element22);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = element22.textNodes();
        java.lang.String str26 = element22.attr("");
        org.jsoup.select.Elements elements28 = element22.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = htmlTreeBuilder0.aboveOnStack(element22);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder7.getDocument();
        boolean boolean9 = htmlTreeBuilder7.framesetOk();
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder7.defaultSettings();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.nodes.Node[] nodeArray36 = new org.jsoup.nodes.Node[] { element28, element35 };
        org.jsoup.nodes.Element element37 = element20.insertChildren((int) (byte) 0, nodeArray36);
        boolean boolean38 = htmlTreeBuilder7.isSpecial(element20);
        org.jsoup.parser.Tag tag39 = element20.tag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document41 = htmlTreeBuilder40.getDocument();
        boolean boolean42 = htmlTreeBuilder40.framesetOk();
        boolean boolean43 = htmlTreeBuilder40.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState44 = htmlTreeBuilder40.state();
        htmlTreeBuilder40.markInsertionMode();
        java.lang.String str46 = htmlTreeBuilder40.getBaseUri();
        htmlTreeBuilder40.setFosterInserts(true);
        org.jsoup.parser.Tag tag50 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean51 = tag50.isBlock();
        boolean boolean52 = tag50.isEmpty();
        boolean boolean53 = tag50.isFormListed();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag50, "");
        htmlTreeBuilder40.setHeadElement(element55);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList57 = element55.textNodes();
        org.jsoup.nodes.Element element59 = element55.tagName("hi!");
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        org.jsoup.nodes.Element element66 = element55.classNames((java.util.Set<java.lang.String>) strSet64);
        org.jsoup.nodes.Element element67 = element20.classNames((java.util.Set<java.lang.String>) strSet64);
        org.jsoup.nodes.Element element69 = element67.appendText("hi!");
        org.jsoup.nodes.Element element71 = element69.text("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element71);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<hi!> &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; </hi!><hi!></hi!>");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.ParseSettings parseSettings60 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        org.jsoup.nodes.Node node31 = element13.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element13.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = htmlTreeBuilder0.removeFromStack(element13);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.nodes.Element element30 = element28.html("");
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element26, element33 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((int) (byte) 0, nodeArray34);
        boolean boolean36 = htmlTreeBuilder5.isSpecial(element18);
        org.jsoup.nodes.Element element38 = element18.text("hi!");
        boolean boolean40 = element18.hasClass("hi!");
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag43.isEmpty();
        boolean boolean46 = tag43.isFormListed();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag43, "");
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag51.isBlock();
        boolean boolean53 = tag51.isEmpty();
        boolean boolean54 = tag51.isFormListed();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag51, "");
        org.jsoup.parser.Tag tag58 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean59 = tag58.isBlock();
        boolean boolean60 = tag58.isEmpty();
        boolean boolean61 = tag58.isFormListed();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element(tag58, "");
        org.jsoup.nodes.Node[] nodeArray64 = new org.jsoup.nodes.Node[] { element56, element63 };
        org.jsoup.nodes.Element element65 = element48.insertChildren((int) (byte) 0, nodeArray64);
        org.jsoup.select.Elements elements66 = element65.previousElementSiblings();
        org.jsoup.nodes.Element element67 = element18.insertChildren(1, (java.util.Collection<org.jsoup.nodes.Element>) elements66);
        java.lang.String str68 = element67.wholeText();
        org.jsoup.parser.Tag tag69 = element67.tag();
        org.jsoup.nodes.Element element70 = element67.shallowClone();
        int int71 = element67.siblingIndex();
        org.jsoup.nodes.Attributes attributes72 = element67.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean73 = htmlTreeBuilder0.removeFromStack(element67);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        java.lang.String str11 = htmlTreeBuilder5.getBaseUri();
        htmlTreeBuilder5.setFosterInserts(true);
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        htmlTreeBuilder5.setHeadElement(element20);
        boolean boolean22 = element20.hasText();
        java.lang.String str23 = element20.tagName();
        java.lang.String str25 = element20.attr("");
        java.lang.String str26 = element20.html();
        java.util.Set<java.lang.String> strSet27 = element20.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = htmlTreeBuilder0.removeFromStack(element20);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getActiveFormattingElement("");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("<hi! class=\"\">\n hi!\n</hi!>", strArray5);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inButtonScope("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inSelectScope("<hi!>\n <hi! class=\"\"> \n  <hi!></hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        htmlTreeBuilder0.transition(htmlTreeBuilderState33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element18 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        element57.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap60 = element57.dataset();
        org.jsoup.parser.Tag tag62 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean63 = tag62.isBlock();
        boolean boolean64 = tag62.isEmpty();
        boolean boolean65 = tag62.isFormListed();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag62, "");
        org.jsoup.parser.Tag tag70 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean71 = tag70.isBlock();
        boolean boolean72 = tag70.isEmpty();
        boolean boolean73 = tag70.isFormListed();
        org.jsoup.nodes.Element element75 = new org.jsoup.nodes.Element(tag70, "");
        org.jsoup.parser.Tag tag77 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean78 = tag77.isBlock();
        boolean boolean79 = tag77.isEmpty();
        boolean boolean80 = tag77.isFormListed();
        org.jsoup.nodes.Element element82 = new org.jsoup.nodes.Element(tag77, "");
        org.jsoup.nodes.Node[] nodeArray83 = new org.jsoup.nodes.Node[] { element75, element82 };
        org.jsoup.nodes.Element element84 = element67.insertChildren((int) (byte) 0, nodeArray83);
        org.jsoup.select.Elements elements85 = element84.previousElementSiblings();
        java.lang.String str86 = element84.id();
        org.jsoup.nodes.Element element87 = element57.appendTo(element84);
        org.jsoup.nodes.Element element89 = element87.wrap("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements91 = element89.getElementsMatchingOwnText("");
        org.jsoup.parser.Tag tag92 = element89.tag();
        boolean boolean93 = htmlTreeBuilder0.isSpecial(element89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document20 = htmlTreeBuilder19.getDocument();
        boolean boolean21 = htmlTreeBuilder19.framesetOk();
        boolean boolean22 = htmlTreeBuilder19.isFragmentParsing();
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        boolean boolean26 = tag24.isEmpty();
        boolean boolean27 = tag24.isFormListed();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag24, "");
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean33 = tag32.isBlock();
        boolean boolean34 = tag32.isEmpty();
        boolean boolean35 = tag32.isFormListed();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag32, "");
        org.jsoup.parser.Tag tag39 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean40 = tag39.isBlock();
        boolean boolean41 = tag39.isEmpty();
        boolean boolean42 = tag39.isFormListed();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag39, "");
        org.jsoup.nodes.Node[] nodeArray45 = new org.jsoup.nodes.Node[] { element37, element44 };
        org.jsoup.nodes.Element element46 = element29.insertChildren((int) (byte) 0, nodeArray45);
        org.jsoup.nodes.Element element48 = element46.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap49 = element48.dataset();
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        boolean boolean54 = tag52.isEmpty();
        boolean boolean55 = tag52.isFormListed();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag52, "");
        org.jsoup.parser.Tag tag60 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean61 = tag60.isBlock();
        boolean boolean62 = tag60.isEmpty();
        boolean boolean63 = tag60.isFormListed();
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag60, "");
        org.jsoup.parser.Tag tag67 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean68 = tag67.isBlock();
        boolean boolean69 = tag67.isEmpty();
        boolean boolean70 = tag67.isFormListed();
        org.jsoup.nodes.Element element72 = new org.jsoup.nodes.Element(tag67, "");
        org.jsoup.nodes.Node[] nodeArray73 = new org.jsoup.nodes.Node[] { element65, element72 };
        org.jsoup.nodes.Element element74 = element57.insertChildren((int) (byte) 0, nodeArray73);
        org.jsoup.select.Elements elements75 = element74.previousElementSiblings();
        org.jsoup.nodes.Element element76 = element48.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements75);
        boolean boolean77 = htmlTreeBuilder19.isSpecial(element76);
        org.jsoup.nodes.Element element78 = element76.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(element76);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        org.jsoup.nodes.Element element37 = element34.attr("", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements39 = element37.getElementsContainingText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element42 = element37.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element42.childNodes();
        org.jsoup.nodes.Element element46 = element42.attr("<hi!>\n hi!\n</hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element47 = element46.firstElementSibling();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        java.util.List<java.lang.String> strList18 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.List<java.lang.String> strList19 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope(strArray5);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        java.util.List<java.lang.String> strList18 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.List<java.lang.String> strList19 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String[] strArray21 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = htmlTreeBuilder0.inScope("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n</hi!>", strArray21);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        org.jsoup.select.Elements elements36 = element33.getElementsContainingOwnText("hi!");
        java.lang.String str37 = element33.tagName();
        org.jsoup.select.Elements elements39 = element33.getElementsMatchingOwnText("<hi!></hi!>\n<hi!></hi!>");
        java.lang.String str40 = element33.cssSelector();
        org.jsoup.select.Elements elements42 = element33.getElementsByIndexEquals(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element44 = element33.wrap("<hi!></hi!> \n<hi!></hi!>");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.select.Elements elements24 = element23.previousElementSiblings();
        org.jsoup.nodes.Element element26 = element23.removeClass("<hi!></hi!>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element26.wrap("<hi! class=\"\">\n hi!\n</hi!>");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getActiveFormattingElement("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element4.previousElementSiblings();
        java.lang.String str8 = element4.tagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.setFosterInserts(false);
        java.lang.String str12 = htmlTreeBuilder9.getBaseUri();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder9.getDocument();
        boolean boolean14 = element4.hasSameValue((java.lang.Object) htmlTreeBuilder9);
        org.jsoup.parser.ParseSettings parseSettings15 = htmlTreeBuilder9.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder9.reconstructFormattingElements();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState61 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element4.previousElementSiblings();
        java.lang.String str8 = element4.tagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.setFosterInserts(false);
        java.lang.String str12 = htmlTreeBuilder9.getBaseUri();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder9.getDocument();
        boolean boolean14 = element4.hasSameValue((java.lang.Object) htmlTreeBuilder9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = htmlTreeBuilder9.inSelectScope("hi!.hi!.<hi!>.<hi!></hi!>.</hi!>");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String[] strArray20 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray20);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isEmpty();
        boolean boolean10 = tag7.isFormListed();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.nodes.Node[] nodeArray28 = new org.jsoup.nodes.Node[] { element20, element27 };
        org.jsoup.nodes.Element element29 = element12.insertChildren((int) (byte) 0, nodeArray28);
        org.jsoup.nodes.Element element31 = element12.toggleClass("");
        org.jsoup.nodes.Element element33 = element12.addClass("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder34.getDocument();
        boolean boolean36 = htmlTreeBuilder34.framesetOk();
        boolean boolean37 = htmlTreeBuilder34.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState38 = htmlTreeBuilder34.state();
        htmlTreeBuilder34.markInsertionMode();
        java.lang.String str40 = htmlTreeBuilder34.getBaseUri();
        htmlTreeBuilder34.setFosterInserts(true);
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        htmlTreeBuilder34.setHeadElement(element49);
        org.jsoup.nodes.Element element51 = element12.prependChild((org.jsoup.nodes.Node) element49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean52 = htmlTreeBuilder0.onStack(element49);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InBody;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document10 = htmlTreeBuilder9.getDocument();
        boolean boolean11 = htmlTreeBuilder9.framesetOk();
        boolean boolean12 = htmlTreeBuilder9.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder9.state();
        htmlTreeBuilder9.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings15 = htmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean18 = tag17.isBlock();
        boolean boolean19 = tag17.isEmpty();
        boolean boolean20 = tag17.isFormListed();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag17, "");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean26 = tag25.isBlock();
        boolean boolean27 = tag25.isEmpty();
        boolean boolean28 = tag25.isFormListed();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag25, "");
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean33 = tag32.isBlock();
        boolean boolean34 = tag32.isEmpty();
        boolean boolean35 = tag32.isFormListed();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag32, "");
        org.jsoup.nodes.Node[] nodeArray38 = new org.jsoup.nodes.Node[] { element30, element37 };
        org.jsoup.nodes.Element element39 = element22.insertChildren((int) (byte) 0, nodeArray38);
        boolean boolean40 = htmlTreeBuilder9.isSpecial(element22);
        org.jsoup.nodes.Element element42 = element22.text("hi!");
        org.jsoup.nodes.Element element43 = element42.shallowClone();
        org.jsoup.nodes.Element element44 = element42.previousElementSibling();
        org.jsoup.nodes.Element element46 = element42.getElementById("hi!");
        org.jsoup.nodes.Element element48 = element42.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element50 = element48.prependText("");
        org.jsoup.select.Elements elements52 = element50.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.select.Elements elements54 = element50.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element56 = element50.html("");
        org.jsoup.select.Elements elements58 = element56.getElementsByAttribute("<hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element56);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        htmlTreeBuilder0.transition(htmlTreeBuilderState33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("<hi!></hi!> \n<hi!></hi!>");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getFromStack("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inSelectScope("");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean18 = tag17.isBlock();
        boolean boolean19 = tag17.isEmpty();
        boolean boolean20 = tag17.isFormListed();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag17, "");
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        boolean boolean26 = tag24.isEmpty();
        boolean boolean27 = tag24.isFormListed();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag24, "");
        org.jsoup.nodes.Node[] nodeArray30 = new org.jsoup.nodes.Node[] { element22, element29 };
        org.jsoup.nodes.Element element31 = element14.insertChildren((int) (byte) 0, nodeArray30);
        org.jsoup.nodes.Element element33 = element31.html("");
        org.jsoup.nodes.Element element35 = element31.prepend("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element35);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray7 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("", strArray7);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.ParseSettings parseSettings60 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element62 = htmlTreeBuilder0.insertStartTag("<hi!></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.select.Elements elements29 = element28.previousElementSiblings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document31 = htmlTreeBuilder30.getDocument();
        boolean boolean32 = htmlTreeBuilder30.framesetOk();
        boolean boolean33 = htmlTreeBuilder30.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder30.state();
        htmlTreeBuilder30.markInsertionMode();
        java.lang.String str36 = htmlTreeBuilder30.getBaseUri();
        htmlTreeBuilder30.setFosterInserts(true);
        org.jsoup.parser.Tag tag40 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean41 = tag40.isBlock();
        boolean boolean42 = tag40.isEmpty();
        boolean boolean43 = tag40.isFormListed();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag40, "");
        htmlTreeBuilder30.setHeadElement(element45);
        boolean boolean47 = element45.hasText();
        java.lang.String str48 = element45.tagName();
        java.lang.String str50 = element45.attr("");
        java.lang.String str51 = element45.html();
        org.jsoup.nodes.Node node52 = element45.previousSibling();
        org.jsoup.nodes.Element element53 = element28.appendTo(element45);
        org.jsoup.nodes.Element element54 = element28.previousElementSibling();
        org.jsoup.nodes.Element element56 = element28.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList57 = element28.dataNodes();
        org.jsoup.parser.Tag tag60 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean61 = tag60.isBlock();
        boolean boolean62 = tag60.isEmpty();
        boolean boolean63 = tag60.isFormListed();
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag60, "");
        org.jsoup.select.Elements elements66 = element65.nextElementSiblings();
        org.jsoup.nodes.Element element67 = element28.insertChildren((int) (byte) 1, (java.util.Collection<org.jsoup.nodes.Element>) elements66);
        org.jsoup.select.Elements elements69 = element28.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element70 = element28.shallowClone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element70);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope(strArray4);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.Tag tag32 = element13.tag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document34 = htmlTreeBuilder33.getDocument();
        boolean boolean35 = htmlTreeBuilder33.framesetOk();
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder33.state();
        htmlTreeBuilder33.markInsertionMode();
        java.lang.String str39 = htmlTreeBuilder33.getBaseUri();
        htmlTreeBuilder33.setFosterInserts(true);
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag43.isEmpty();
        boolean boolean46 = tag43.isFormListed();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag43, "");
        htmlTreeBuilder33.setHeadElement(element48);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList50 = element48.textNodes();
        org.jsoup.nodes.Element element52 = element48.tagName("hi!");
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.jsoup.nodes.Element element59 = element48.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element60 = element13.classNames((java.util.Set<java.lang.String>) strSet57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element61 = element13.lastElementSibling();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InRow;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        org.jsoup.select.Elements elements36 = element33.getElementsContainingOwnText("hi!");
        java.lang.String str37 = element33.tagName();
        org.jsoup.select.Elements elements39 = element33.getElementsMatchingOwnText("<hi!></hi!>\n<hi!></hi!>");
        java.lang.String str40 = element33.cssSelector();
        java.lang.String str41 = element33.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element43 = element33.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        java.util.List<java.lang.String> strList18 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray4);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        boolean boolean35 = element13.hasClass("hi!");
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean39 = tag38.isBlock();
        boolean boolean40 = tag38.isEmpty();
        boolean boolean41 = tag38.isFormListed();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag38, "");
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean47 = tag46.isBlock();
        boolean boolean48 = tag46.isEmpty();
        boolean boolean49 = tag46.isFormListed();
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element(tag46, "");
        org.jsoup.parser.Tag tag53 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean54 = tag53.isBlock();
        boolean boolean55 = tag53.isEmpty();
        boolean boolean56 = tag53.isFormListed();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag53, "");
        org.jsoup.nodes.Node[] nodeArray59 = new org.jsoup.nodes.Node[] { element51, element58 };
        org.jsoup.nodes.Element element60 = element43.insertChildren((int) (byte) 0, nodeArray59);
        org.jsoup.select.Elements elements61 = element60.previousElementSiblings();
        org.jsoup.nodes.Element element62 = element13.insertChildren(1, (java.util.Collection<org.jsoup.nodes.Element>) elements61);
        java.lang.String str63 = element62.wholeText();
        org.jsoup.parser.Tag tag64 = element62.tag();
        org.jsoup.nodes.Attributes attributes65 = element62.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element67 = element62.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element6.toggleClass("");
        java.lang.String str26 = element6.html();
        boolean boolean28 = element6.hasClass("<hi!></hi!>");
        java.lang.String str29 = element6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element6.lastElementSibling();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.nodes.Element element27 = element25.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = element27.childNodesCopy();
        org.jsoup.nodes.Element element30 = element27.append("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList31 = element30.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element30.firstElementSibling();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = htmlTreeBuilder0.insertStartTag("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.framesetOk(true);
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag27.isBlock();
        boolean boolean29 = tag27.isEmpty();
        boolean boolean30 = tag27.isFormListed();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Node[] nodeArray33 = new org.jsoup.nodes.Node[] { element25, element32 };
        org.jsoup.nodes.Element element34 = element17.insertChildren((int) (byte) 0, nodeArray33);
        org.jsoup.select.Elements elements35 = element34.previousElementSiblings();
        java.lang.String str36 = element34.id();
        org.jsoup.select.Elements elements37 = element34.parents();
        int int38 = element34.childNodeSize();
        java.lang.String str39 = element34.nodeName();
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isFormListed();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag41, "hi!");
        org.jsoup.nodes.Element element46 = element44.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element47 = element46.shallowClone();
        org.jsoup.nodes.Element element49 = element47.val("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceOnStack(element34, element49);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertStartTag("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = htmlTreeBuilder0.inListItemScope("<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray5);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InCaption;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.inSelectScope("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder10.getDocument();
        boolean boolean12 = htmlTreeBuilder10.framesetOk();
        boolean boolean13 = htmlTreeBuilder10.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder10.state();
        htmlTreeBuilder10.markInsertionMode();
        java.lang.String str16 = htmlTreeBuilder10.getBaseUri();
        htmlTreeBuilder10.setFosterInserts(true);
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        htmlTreeBuilder10.setHeadElement(element25);
        boolean boolean27 = element25.isBlock();
        java.lang.String str28 = element25.data();
        org.jsoup.nodes.Element element31 = element25.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements(element25);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InCaption;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element15.textNodes();
        java.lang.String str19 = element15.attr("");
        org.jsoup.select.Elements elements21 = element15.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document23 = htmlTreeBuilder22.getDocument();
        boolean boolean24 = htmlTreeBuilder22.framesetOk();
        boolean boolean25 = htmlTreeBuilder22.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = htmlTreeBuilder22.state();
        htmlTreeBuilder22.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings28 = htmlTreeBuilder22.defaultSettings();
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean39 = tag38.isBlock();
        boolean boolean40 = tag38.isEmpty();
        boolean boolean41 = tag38.isFormListed();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag38, "");
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.isBlock();
        boolean boolean47 = tag45.isEmpty();
        boolean boolean48 = tag45.isFormListed();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "");
        org.jsoup.nodes.Node[] nodeArray51 = new org.jsoup.nodes.Node[] { element43, element50 };
        org.jsoup.nodes.Element element52 = element35.insertChildren((int) (byte) 0, nodeArray51);
        boolean boolean53 = htmlTreeBuilder22.isSpecial(element35);
        org.jsoup.nodes.Element element55 = element35.text("hi!");
        java.lang.String str56 = element55.baseUri();
        org.jsoup.parser.Tag tag59 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean60 = tag59.isBlock();
        boolean boolean61 = tag59.isEmpty();
        boolean boolean62 = tag59.isFormListed();
        org.jsoup.nodes.Element element64 = new org.jsoup.nodes.Element(tag59, "");
        org.jsoup.parser.Tag tag67 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean68 = tag67.isBlock();
        boolean boolean69 = tag67.isEmpty();
        boolean boolean70 = tag67.isFormListed();
        org.jsoup.nodes.Element element72 = new org.jsoup.nodes.Element(tag67, "");
        org.jsoup.parser.Tag tag74 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean75 = tag74.isBlock();
        boolean boolean76 = tag74.isEmpty();
        boolean boolean77 = tag74.isFormListed();
        org.jsoup.nodes.Element element79 = new org.jsoup.nodes.Element(tag74, "");
        org.jsoup.nodes.Node[] nodeArray80 = new org.jsoup.nodes.Node[] { element72, element79 };
        org.jsoup.nodes.Element element81 = element64.insertChildren((int) (byte) 0, nodeArray80);
        org.jsoup.select.Elements elements82 = element81.previousElementSiblings();
        org.jsoup.nodes.Element element83 = element55.insertChildren((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements82);
        java.lang.String str84 = element83.html();
        org.jsoup.nodes.Node node85 = element83.root();
        java.util.Set<java.lang.String> strSet86 = element83.classNames();
        org.jsoup.nodes.Element element87 = element15.classNames(strSet86);
        org.jsoup.nodes.Element element89 = element15.addClass("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element90 = element15.firstElementSibling();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element18 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String str10 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState7);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = element1.lastElementSibling();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "&lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>", strArray6);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray5);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("<hi! class=\"\">\n hi!\n</hi!>");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        org.jsoup.parser.ParseSettings parseSettings17 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = htmlTreeBuilder0.inListItemScope("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = element34.dataset();
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.isBlock();
        boolean boolean47 = tag45.isEmpty();
        boolean boolean48 = tag45.isFormListed();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "");
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        boolean boolean54 = tag52.isEmpty();
        boolean boolean55 = tag52.isFormListed();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag52, "");
        org.jsoup.nodes.Node[] nodeArray58 = new org.jsoup.nodes.Node[] { element50, element57 };
        org.jsoup.nodes.Element element59 = element42.insertChildren((int) (byte) 0, nodeArray58);
        org.jsoup.nodes.Element element61 = element59.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = element61.dataset();
        org.jsoup.parser.Tag tag65 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean66 = tag65.isBlock();
        boolean boolean67 = tag65.isEmpty();
        boolean boolean68 = tag65.isFormListed();
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element(tag65, "");
        org.jsoup.parser.Tag tag73 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean74 = tag73.isBlock();
        boolean boolean75 = tag73.isEmpty();
        boolean boolean76 = tag73.isFormListed();
        org.jsoup.nodes.Element element78 = new org.jsoup.nodes.Element(tag73, "");
        org.jsoup.parser.Tag tag80 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean81 = tag80.isBlock();
        boolean boolean82 = tag80.isEmpty();
        boolean boolean83 = tag80.isFormListed();
        org.jsoup.nodes.Element element85 = new org.jsoup.nodes.Element(tag80, "");
        org.jsoup.nodes.Node[] nodeArray86 = new org.jsoup.nodes.Node[] { element78, element85 };
        org.jsoup.nodes.Element element87 = element70.insertChildren((int) (byte) 0, nodeArray86);
        org.jsoup.select.Elements elements88 = element87.previousElementSiblings();
        org.jsoup.nodes.Element element89 = element61.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements88);
        element89.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap92 = element89.dataset();
        org.jsoup.nodes.Element element93 = element34.appendChild((org.jsoup.nodes.Node) element89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element94 = element34.lastElementSibling();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        boolean boolean35 = element13.hasClass("hi!");
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean39 = tag38.isBlock();
        boolean boolean40 = tag38.isEmpty();
        boolean boolean41 = tag38.isFormListed();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag38, "");
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean47 = tag46.isBlock();
        boolean boolean48 = tag46.isEmpty();
        boolean boolean49 = tag46.isFormListed();
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element(tag46, "");
        org.jsoup.parser.Tag tag53 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean54 = tag53.isBlock();
        boolean boolean55 = tag53.isEmpty();
        boolean boolean56 = tag53.isFormListed();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag53, "");
        org.jsoup.nodes.Node[] nodeArray59 = new org.jsoup.nodes.Node[] { element51, element58 };
        org.jsoup.nodes.Element element60 = element43.insertChildren((int) (byte) 0, nodeArray59);
        org.jsoup.select.Elements elements61 = element60.previousElementSiblings();
        org.jsoup.nodes.Element element62 = element13.insertChildren(1, (java.util.Collection<org.jsoup.nodes.Element>) elements61);
        java.lang.String str63 = element62.wholeText();
        org.jsoup.parser.Tag tag64 = element62.tag();
        org.jsoup.nodes.Element element65 = element62.shallowClone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element66 = element65.lastElementSibling();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        java.lang.String str21 = element15.html();
        org.jsoup.nodes.Element element23 = element15.appendText("<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element23.childNodes();
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element29 = element23.attr("", "<hi!>\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document31 = htmlTreeBuilder30.getDocument();
        boolean boolean32 = htmlTreeBuilder30.framesetOk();
        boolean boolean33 = htmlTreeBuilder30.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder30.state();
        htmlTreeBuilder30.markInsertionMode();
        java.lang.String str36 = htmlTreeBuilder30.getBaseUri();
        htmlTreeBuilder30.setFosterInserts(true);
        org.jsoup.parser.Tag tag40 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean41 = tag40.isBlock();
        boolean boolean42 = tag40.isEmpty();
        boolean boolean43 = tag40.isFormListed();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag40, "");
        htmlTreeBuilder30.setHeadElement(element45);
        org.jsoup.parser.ParseSettings parseSettings47 = htmlTreeBuilder30.defaultSettings();
        boolean boolean48 = element29.hasSameValue((java.lang.Object) htmlTreeBuilder30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean50 = htmlTreeBuilder30.inScope("<<hi! class=\"\">\n hi!\n</hi!>></<hi! class=\"\">\n hi!\n</hi!>>");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getFromStack("<hi! class=\"\">\n hi!\n</hi!>");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        boolean boolean6 = htmlTreeBuilder4.framesetOk();
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder4.state();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag27.isBlock();
        boolean boolean29 = tag27.isEmpty();
        boolean boolean30 = tag27.isFormListed();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Node[] nodeArray33 = new org.jsoup.nodes.Node[] { element25, element32 };
        org.jsoup.nodes.Element element34 = element17.insertChildren((int) (byte) 0, nodeArray33);
        boolean boolean35 = htmlTreeBuilder4.isSpecial(element17);
        org.jsoup.nodes.Element element37 = element17.text("hi!");
        org.jsoup.nodes.Element element38 = element37.shallowClone();
        org.jsoup.nodes.Element element39 = element37.previousElementSibling();
        org.jsoup.nodes.Element element41 = element37.getElementById("hi!");
        org.jsoup.nodes.Element element43 = element37.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element45 = element43.prependText("");
        org.jsoup.select.Elements elements47 = element45.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.select.Elements elements48 = element45.siblingElements();
        org.jsoup.nodes.Element element50 = element45.text("");
        org.jsoup.nodes.Element element53 = element50.attr("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean54 = htmlTreeBuilder0.onStack(element50);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.ParseSettings parseSettings60 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getFromStack("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inScope("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>&lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inListItemScope("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder10.getDocument();
        boolean boolean12 = htmlTreeBuilder10.framesetOk();
        boolean boolean13 = htmlTreeBuilder10.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder10.state();
        htmlTreeBuilder10.markInsertionMode();
        java.lang.String str16 = htmlTreeBuilder10.getBaseUri();
        htmlTreeBuilder10.setFosterInserts(true);
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        htmlTreeBuilder10.setHeadElement(element25);
        boolean boolean27 = element25.hasText();
        java.lang.String str28 = element25.tagName();
        java.lang.String str30 = element25.attr("");
        java.lang.String str31 = element25.html();
        java.util.Set<java.lang.String> strSet32 = element25.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element25);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        org.jsoup.select.Elements elements28 = element23.getElementsByAttributeValueMatching("<hi!></hi!>\n<hi!></hi!>", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element23.firstElementSibling();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        java.lang.String str11 = htmlTreeBuilder5.getBaseUri();
        htmlTreeBuilder5.setFosterInserts(true);
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        htmlTreeBuilder5.setHeadElement(element20);
        boolean boolean22 = element20.hasText();
        java.lang.String str23 = element20.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(element20);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getActiveFormattingElement("<hi!>\n &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.tagName("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element25.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element25.lastElementSibling();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        org.jsoup.nodes.Element element36 = element34.append("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element38 = element36.append("<hi!></hi!>");
        java.lang.String str39 = element36.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element36.lastElementSibling();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        boolean boolean6 = htmlTreeBuilder4.framesetOk();
        boolean boolean7 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder4.state();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean28 = tag27.isBlock();
        boolean boolean29 = tag27.isEmpty();
        boolean boolean30 = tag27.isFormListed();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag27, "");
        org.jsoup.nodes.Node[] nodeArray33 = new org.jsoup.nodes.Node[] { element25, element32 };
        org.jsoup.nodes.Element element34 = element17.insertChildren((int) (byte) 0, nodeArray33);
        boolean boolean35 = htmlTreeBuilder4.isSpecial(element17);
        int int36 = element17.siblingIndex();
        org.jsoup.nodes.Element element38 = element17.appendElement("<hi!></hi!>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements(element17);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("&lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Node node24 = element6.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element6.siblingNodes();
        org.jsoup.nodes.Element element27 = element6.tagName("<hi!></hi!>");
        java.lang.String str28 = element6.cssSelector();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element6.wrap("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <<hi!></hi!> \n<hi!></hi!>></<hi!></hi!> \n<hi!></hi!>>\n</hi!>");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        boolean boolean20 = tag18.isEmpty();
        boolean boolean21 = tag18.isFormListed();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean26 = tag25.isBlock();
        boolean boolean27 = tag25.isEmpty();
        boolean boolean28 = tag25.isFormListed();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag25, "");
        org.jsoup.nodes.Node[] nodeArray31 = new org.jsoup.nodes.Node[] { element23, element30 };
        org.jsoup.nodes.Element element32 = element15.insertChildren((int) (byte) 0, nodeArray31);
        org.jsoup.nodes.Element element34 = element15.toggleClass("");
        java.lang.String str35 = element34.tagName();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList36 = element34.textNodes();
        org.jsoup.nodes.Element element38 = element34.appendElement("hi!");
        org.jsoup.nodes.Element element40 = element34.appendText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element42 = element40.appendText("<hi!></hi!>");
        org.jsoup.select.Elements elements45 = element42.getElementsByAttributeValueEnding("<hi!>\n <hi! class=\"\"> \n  <hi!></hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>", "<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements46 = element42.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element42);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        java.lang.String str21 = element15.html();
        java.lang.String str22 = element15.wholeText();
        org.jsoup.nodes.Element element24 = element15.toggleClass("");
        org.jsoup.select.Elements elements26 = element15.getElementsContainingText("");
        org.jsoup.nodes.Element element28 = element15.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element30 = element15.appendText("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element15.wrap("<hi!>\n &lt;hi! class=\"&lt;&lt;hi! class=&amp;quot;&amp;quot;&gt; hi! &lt;/hi!&gt;&gt;&lt;/&lt;hi! class=&amp;quot;&amp;quot;&gt; hi! &lt;/hi!&gt;&gt;\"&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray12 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = htmlTreeBuilder0.inScope("<hi! class=\"\"></hi!>", strArray12);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element26, element33 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((int) (byte) 0, nodeArray34);
        boolean boolean36 = htmlTreeBuilder5.isSpecial(element18);
        org.jsoup.parser.Tag tag37 = element18.tag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document39 = htmlTreeBuilder38.getDocument();
        boolean boolean40 = htmlTreeBuilder38.framesetOk();
        boolean boolean41 = htmlTreeBuilder38.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState42 = htmlTreeBuilder38.state();
        htmlTreeBuilder38.markInsertionMode();
        java.lang.String str44 = htmlTreeBuilder38.getBaseUri();
        htmlTreeBuilder38.setFosterInserts(true);
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        htmlTreeBuilder38.setHeadElement(element53);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList55 = element53.textNodes();
        org.jsoup.nodes.Element element57 = element53.tagName("hi!");
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        org.jsoup.nodes.Element element64 = element53.classNames((java.util.Set<java.lang.String>) strSet62);
        org.jsoup.nodes.Element element65 = element18.classNames((java.util.Set<java.lang.String>) strSet62);
        java.lang.String str66 = element18.nodeName();
        org.jsoup.nodes.Element element69 = element18.attr("hi!", true);
        org.jsoup.nodes.Element element70 = element69.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element70);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getActiveFormattingElement("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getFromStack("<hi!></hi!>");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray8 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope(strArray8);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        java.lang.String str21 = element15.html();
        org.jsoup.nodes.Element element23 = element15.appendText("<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element23.childNodes();
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element29 = element23.attr("", "<hi!>\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document31 = htmlTreeBuilder30.getDocument();
        boolean boolean32 = htmlTreeBuilder30.framesetOk();
        boolean boolean33 = htmlTreeBuilder30.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder30.state();
        htmlTreeBuilder30.markInsertionMode();
        java.lang.String str36 = htmlTreeBuilder30.getBaseUri();
        htmlTreeBuilder30.setFosterInserts(true);
        org.jsoup.parser.Tag tag40 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean41 = tag40.isBlock();
        boolean boolean42 = tag40.isEmpty();
        boolean boolean43 = tag40.isFormListed();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag40, "");
        htmlTreeBuilder30.setHeadElement(element45);
        org.jsoup.parser.ParseSettings parseSettings47 = htmlTreeBuilder30.defaultSettings();
        boolean boolean48 = element29.hasSameValue((java.lang.Object) htmlTreeBuilder30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element49 = htmlTreeBuilder30.pop();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean61 = htmlTreeBuilder0.inSelectScope("<<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getActiveFormattingElement("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        java.util.List<java.lang.String> strList18 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = htmlTreeBuilder0.inTableScope("<hi!></hi!>");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isEmpty();
        boolean boolean10 = tag7.isFormListed();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.nodes.Node[] nodeArray28 = new org.jsoup.nodes.Node[] { element20, element27 };
        org.jsoup.nodes.Element element29 = element12.insertChildren((int) (byte) 0, nodeArray28);
        org.jsoup.nodes.Element element31 = element29.tagName("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements32 = element29.getAllElements();
        org.jsoup.select.Elements elements34 = element29.getElementsByTag("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements37 = element29.getElementsByAttributeValueEnding("<hi!>\n <hi!></hi!>\n</hi!>", "<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element39 = element29.prepend("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element39);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean8 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        boolean boolean20 = tag18.isEmpty();
        boolean boolean21 = tag18.isFormListed();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean26 = tag25.isBlock();
        boolean boolean27 = tag25.isEmpty();
        boolean boolean28 = tag25.isFormListed();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag25, "");
        org.jsoup.nodes.Node[] nodeArray31 = new org.jsoup.nodes.Node[] { element23, element30 };
        org.jsoup.nodes.Element element32 = element15.insertChildren((int) (byte) 0, nodeArray31);
        org.jsoup.select.Elements elements33 = element32.previousElementSiblings();
        org.jsoup.nodes.Element element35 = element32.removeClass("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Node node37 = element35.removeAttr("<hi!></hi!>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element35);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inTableScope("<<hi!>\n <hi!></hi!>\n</hi!>>\n hi!\n</<hi!>\n <hi!></hi!>\n</hi!>>");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder8.getDocument();
        boolean boolean10 = htmlTreeBuilder8.framesetOk();
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.markInsertionMode();
        java.lang.String str14 = htmlTreeBuilder8.getBaseUri();
        htmlTreeBuilder8.setFosterInserts(true);
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        boolean boolean20 = tag18.isEmpty();
        boolean boolean21 = tag18.isFormListed();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "");
        htmlTreeBuilder8.setHeadElement(element23);
        boolean boolean25 = element23.isBlock();
        java.lang.String str26 = element23.data();
        org.jsoup.nodes.Element element29 = element23.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!></hi!>");
        java.lang.String str30 = element29.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element29);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.nodes.Element element30 = element28.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = element30.dataset();
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean35 = tag34.isBlock();
        boolean boolean36 = tag34.isEmpty();
        boolean boolean37 = tag34.isFormListed();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag34, "");
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean43 = tag42.isBlock();
        boolean boolean44 = tag42.isEmpty();
        boolean boolean45 = tag42.isFormListed();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag42, "");
        org.jsoup.parser.Tag tag49 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean50 = tag49.isBlock();
        boolean boolean51 = tag49.isEmpty();
        boolean boolean52 = tag49.isFormListed();
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag49, "");
        org.jsoup.nodes.Node[] nodeArray55 = new org.jsoup.nodes.Node[] { element47, element54 };
        org.jsoup.nodes.Element element56 = element39.insertChildren((int) (byte) 0, nodeArray55);
        org.jsoup.select.Elements elements57 = element56.previousElementSiblings();
        org.jsoup.nodes.Element element58 = element30.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements57);
        element58.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap61 = element58.dataset();
        org.jsoup.parser.Tag tag63 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean64 = tag63.isBlock();
        boolean boolean65 = tag63.isEmpty();
        boolean boolean66 = tag63.isFormListed();
        org.jsoup.nodes.Element element68 = new org.jsoup.nodes.Element(tag63, "");
        org.jsoup.parser.Tag tag71 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean72 = tag71.isBlock();
        boolean boolean73 = tag71.isEmpty();
        boolean boolean74 = tag71.isFormListed();
        org.jsoup.nodes.Element element76 = new org.jsoup.nodes.Element(tag71, "");
        org.jsoup.parser.Tag tag78 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean79 = tag78.isBlock();
        boolean boolean80 = tag78.isEmpty();
        boolean boolean81 = tag78.isFormListed();
        org.jsoup.nodes.Element element83 = new org.jsoup.nodes.Element(tag78, "");
        org.jsoup.nodes.Node[] nodeArray84 = new org.jsoup.nodes.Node[] { element76, element83 };
        org.jsoup.nodes.Element element85 = element68.insertChildren((int) (byte) 0, nodeArray84);
        org.jsoup.select.Elements elements86 = element85.previousElementSiblings();
        java.lang.String str87 = element85.id();
        org.jsoup.nodes.Element element88 = element58.appendTo(element85);
        org.jsoup.nodes.Element element90 = element88.removeClass("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean91 = htmlTreeBuilder0.isSpecial(element90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str92 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inListItemScope("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isEmpty();
        boolean boolean3 = tag1.isEmpty();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.nodes.Element element7 = element5.prependText("<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element7.wrap("<hi!>\n &lt;hi! class=\"&lt;&lt;hi! class=&amp;quot;&amp;quot;&gt; hi! &lt;/hi!&gt;&gt;&lt;/&lt;hi! class=&amp;quot;&amp;quot;&gt; hi! &lt;/hi!&gt;&gt;\"&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        java.lang.String str9 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.inTableScope("<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        java.lang.String[] strArray4 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope(strArray4);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        htmlTreeBuilder0.transition(htmlTreeBuilderState33);
        java.lang.String[] strArray36 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean37 = htmlTreeBuilder0.inScope("<hi!>\n <hi!></hi!>\n</hi!>", strArray36);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.nodes.Node[] nodeArray35 = new org.jsoup.nodes.Node[] { element27, element34 };
        org.jsoup.nodes.Element element36 = element19.insertChildren((int) (byte) 0, nodeArray35);
        boolean boolean37 = htmlTreeBuilder6.isSpecial(element19);
        org.jsoup.nodes.Element element39 = element19.text("hi!");
        org.jsoup.nodes.Element element40 = element39.shallowClone();
        org.jsoup.select.Elements elements42 = element39.getElementsContainingOwnText("hi!");
        boolean boolean43 = htmlTreeBuilder0.isSpecial(element39);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList44 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element46 = htmlTreeBuilder0.getFromStack("<hi!>\n &lt;hi! class=\"&lt;&lt;hi! class=&amp;quot;&amp;quot;&gt; hi! &lt;/hi!&gt;&gt;&lt;/&lt;hi! class=&amp;quot;&amp;quot;&gt; hi! &lt;/hi!&gt;&gt;\"&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inButtonScope("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(true);
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.nodes.Node[] nodeArray50 = new org.jsoup.nodes.Node[] { element42, element49 };
        org.jsoup.nodes.Element element51 = element34.insertChildren((int) (byte) 0, nodeArray50);
        org.jsoup.select.Elements elements52 = element51.previousElementSiblings();
        org.jsoup.nodes.Element element53 = element25.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements52);
        element53.setBaseUri("hi!");
        org.jsoup.nodes.Element element57 = element53.text("");
        org.jsoup.select.Elements elements59 = element53.getElementsMatchingOwnText("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements62 = element53.getElementsByAttributeValueEnding("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", "<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
        java.lang.String str63 = element53.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element64 = element53.firstElementSibling();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag11.isBlock();
        boolean boolean13 = tag11.isEmpty();
        boolean boolean14 = tag11.isFormListed();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag11, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element24, element31 };
        org.jsoup.nodes.Element element33 = element16.insertChildren((int) (byte) 0, nodeArray32);
        org.jsoup.nodes.Element element35 = element16.toggleClass("");
        java.lang.String str36 = element16.html();
        boolean boolean38 = element16.hasClass("<hi!></hi!>");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document40 = htmlTreeBuilder39.getDocument();
        boolean boolean41 = htmlTreeBuilder39.framesetOk();
        boolean boolean42 = htmlTreeBuilder39.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState43 = htmlTreeBuilder39.state();
        htmlTreeBuilder39.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings45 = htmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.Tag tag47 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean48 = tag47.isBlock();
        boolean boolean49 = tag47.isEmpty();
        boolean boolean50 = tag47.isFormListed();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag47, "");
        org.jsoup.parser.Tag tag55 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean56 = tag55.isBlock();
        boolean boolean57 = tag55.isEmpty();
        boolean boolean58 = tag55.isFormListed();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag55, "");
        org.jsoup.parser.Tag tag62 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean63 = tag62.isBlock();
        boolean boolean64 = tag62.isEmpty();
        boolean boolean65 = tag62.isFormListed();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag62, "");
        org.jsoup.nodes.Node[] nodeArray68 = new org.jsoup.nodes.Node[] { element60, element67 };
        org.jsoup.nodes.Element element69 = element52.insertChildren((int) (byte) 0, nodeArray68);
        boolean boolean70 = htmlTreeBuilder39.isSpecial(element52);
        org.jsoup.nodes.Element element72 = element52.text("hi!");
        org.jsoup.nodes.Element element73 = element72.shallowClone();
        org.jsoup.nodes.Element element74 = element72.previousElementSibling();
        org.jsoup.nodes.Element element76 = element72.getElementById("hi!");
        int int77 = element72.childNodeSize();
        org.jsoup.nodes.Element element79 = element72.val("hi!");
        java.lang.String str81 = element79.attr("hi!");
        boolean boolean82 = element16.hasSameValue((java.lang.Object) element79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements(element16);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope("<<hi! class=\"\">\n hi!\n</hi!>></<hi! class=\"\">\n hi!\n</hi!>>");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element18 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.select.Elements elements24 = element23.previousElementSiblings();
        java.lang.String str25 = element23.id();
        org.jsoup.select.Elements elements26 = element23.parents();
        int int27 = element23.childNodeSize();
        org.jsoup.nodes.Element element29 = element23.removeClass("hi!");
        java.lang.String str30 = element29.wholeText();
        org.jsoup.nodes.Element element31 = element29.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element31.firstElementSibling();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        org.jsoup.nodes.Element element32 = element13.toggleClass("");
        org.jsoup.select.Elements elements34 = element13.getElementsMatchingOwnText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element35 = element13.clone();
        htmlTreeBuilder0.maybeSetBaseUri(element13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = htmlTreeBuilder0.getFromStack("hi!");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isSelfClosing();
        boolean boolean24 = element15.hasSameValue((java.lang.Object) tag20);
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean35 = tag34.isBlock();
        boolean boolean36 = tag34.isEmpty();
        boolean boolean37 = tag34.isFormListed();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag34, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.nodes.Node[] nodeArray47 = new org.jsoup.nodes.Node[] { element39, element46 };
        org.jsoup.nodes.Element element48 = element31.insertChildren((int) (byte) 0, nodeArray47);
        org.jsoup.nodes.Element element50 = element31.toggleClass("");
        org.jsoup.nodes.Element element52 = element31.addClass("<hi!></hi!>\n<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap53 = element52.dataset();
        org.jsoup.nodes.Element element55 = element52.append("");
        boolean boolean56 = tag20.equals((java.lang.Object) element55);
        int int57 = element55.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = element55.wrap("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder8.getDocument();
        boolean boolean10 = htmlTreeBuilder8.framesetOk();
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.markInsertionMode();
        java.lang.String str14 = htmlTreeBuilder8.getBaseUri();
        htmlTreeBuilder8.setFosterInserts(true);
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        boolean boolean20 = tag18.isEmpty();
        boolean boolean21 = tag18.isFormListed();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "");
        htmlTreeBuilder8.setHeadElement(element23);
        boolean boolean25 = element23.hasText();
        java.lang.String str26 = element23.tagName();
        java.lang.String str28 = element23.attr("");
        java.lang.String str29 = element23.data();
        org.jsoup.nodes.Node node30 = element23.parentNode();
        htmlTreeBuilder0.maybeSetBaseUri(element23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = htmlTreeBuilder0.getFromStack("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean4 = tag3.isBlock();
        boolean boolean5 = tag3.isEmpty();
        boolean boolean6 = tag3.isFormListed();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element(tag3, "");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag11.isBlock();
        boolean boolean13 = tag11.isEmpty();
        boolean boolean14 = tag11.isFormListed();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag11, "");
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        boolean boolean20 = tag18.isEmpty();
        boolean boolean21 = tag18.isFormListed();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "");
        org.jsoup.nodes.Node[] nodeArray24 = new org.jsoup.nodes.Node[] { element16, element23 };
        org.jsoup.nodes.Element element25 = element8.insertChildren((int) (byte) 0, nodeArray24);
        org.jsoup.nodes.Element element27 = element25.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = element27.dataset();
        org.jsoup.nodes.Element element29 = element27.previousElementSibling();
        org.jsoup.select.Elements elements30 = element27.siblingElements();
        org.jsoup.nodes.Element element32 = element27.prependElement("hi!");
        java.lang.String str33 = element27.html();
        java.lang.String str34 = element27.wholeText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean35 = htmlTreeBuilder0.onStack(element27);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder8.getDocument();
        boolean boolean10 = htmlTreeBuilder8.framesetOk();
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder8.defaultSettings();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        boolean boolean26 = tag24.isEmpty();
        boolean boolean27 = tag24.isFormListed();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag24, "");
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean32 = tag31.isBlock();
        boolean boolean33 = tag31.isEmpty();
        boolean boolean34 = tag31.isFormListed();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag31, "");
        org.jsoup.nodes.Node[] nodeArray37 = new org.jsoup.nodes.Node[] { element29, element36 };
        org.jsoup.nodes.Element element38 = element21.insertChildren((int) (byte) 0, nodeArray37);
        boolean boolean39 = htmlTreeBuilder8.isSpecial(element21);
        org.jsoup.nodes.Element element41 = element21.text("hi!");
        org.jsoup.nodes.Element element42 = element41.shallowClone();
        org.jsoup.select.Elements elements44 = element41.getElementsContainingOwnText("hi!");
        java.lang.String str45 = element41.tagName();
        org.jsoup.select.Elements elements47 = element41.getElementsMatchingOwnText("<hi!></hi!>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = htmlTreeBuilder0.aboveOnStack(element41);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>", strArray6);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder8.getDocument();
        boolean boolean10 = htmlTreeBuilder8.framesetOk();
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.markInsertionMode();
        java.lang.String str14 = htmlTreeBuilder8.getBaseUri();
        htmlTreeBuilder8.setFosterInserts(true);
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        boolean boolean20 = tag18.isEmpty();
        boolean boolean21 = tag18.isFormListed();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "");
        htmlTreeBuilder8.setHeadElement(element23);
        boolean boolean25 = element23.hasText();
        java.lang.String str26 = element23.tagName();
        java.lang.String str28 = element23.attr("");
        java.lang.String str29 = element23.data();
        org.jsoup.nodes.Node node30 = element23.parentNode();
        htmlTreeBuilder0.maybeSetBaseUri(element23);
        java.lang.String[] strArray33 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = htmlTreeBuilder0.inScope("<hi!> <hi!></hi!> </hi!>", strArray33);
    }
}

