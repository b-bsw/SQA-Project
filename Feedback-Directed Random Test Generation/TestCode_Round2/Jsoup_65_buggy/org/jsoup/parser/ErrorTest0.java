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
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.insertStartTag("");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope(strArray8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("", strArray4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("", strArray7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inTableScope("hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope(strArray4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope(strArray7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getActiveFormattingElement("");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.insertStartTag("");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("hi!");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState5);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("hi!");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("hi!");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertStartTag("");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean6 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack("hi!");
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertStartTag("hi!");
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }
}

