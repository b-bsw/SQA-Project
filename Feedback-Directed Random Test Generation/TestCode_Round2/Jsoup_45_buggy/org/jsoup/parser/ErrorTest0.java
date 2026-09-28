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
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inSelectScope("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray1 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inTableScope("hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray1 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inScope(strArray1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        htmlTreeBuilder3.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getActiveFormattingElement("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("", strArray4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inSelectScope("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inSelectScope("hi!");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        htmlTreeBuilder3.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getActiveFormattingElement("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder2.setFosterInserts(true);
        boolean boolean5 = htmlTreeBuilder2.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder6.getPendingTableCharacters();
        htmlTreeBuilder2.setPendingTableCharacters(strList8);
        htmlTreeBuilder0.setPendingTableCharacters(strList8);
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder2.setFosterInserts(true);
        boolean boolean5 = htmlTreeBuilder2.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder6.getPendingTableCharacters();
        htmlTreeBuilder2.setPendingTableCharacters(strList8);
        htmlTreeBuilder0.setPendingTableCharacters(strList8);
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        htmlTreeBuilder3.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        htmlTreeBuilder3.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder4.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("hi!");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder4.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList6);
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inSelectScope("");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inScope("hi!");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inSelectScope("hi!");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inSelectScope("hi!");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder4.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList6);
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        htmlTreeBuilder3.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = htmlTreeBuilder0.inSelectScope("hi!");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder4.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList6);
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        boolean boolean10 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder4.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList6);
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        htmlTreeBuilder3.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getActiveFormattingElement("");
        htmlTreeBuilder0.reconstructFormattingElements();
        boolean boolean14 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("hi!");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getActiveFormattingElement("");
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList6 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inScope("hi!");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getFromStack("hi!");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getActiveFormattingElement("");
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList6 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        htmlTreeBuilder3.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList7);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getActiveFormattingElement("");
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = htmlTreeBuilder0.inScope("hi!");
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.FormElement formElement5 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList6 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("hi!");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder4.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList6);
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getFromStack("hi!");
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder2.setFosterInserts(true);
        boolean boolean5 = htmlTreeBuilder2.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder6.getPendingTableCharacters();
        htmlTreeBuilder2.setPendingTableCharacters(strList8);
        htmlTreeBuilder0.setPendingTableCharacters(strList8);
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.reconstructFormattingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inButtonScope("hi!");
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inSelectScope("hi!");
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getFromStack("hi!");
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder4.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList6);
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        boolean boolean10 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder4.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList6);
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder2.setFosterInserts(true);
        boolean boolean5 = htmlTreeBuilder2.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        java.util.List<java.lang.String> strList8 = htmlTreeBuilder6.getPendingTableCharacters();
        htmlTreeBuilder2.setPendingTableCharacters(strList8);
        htmlTreeBuilder0.setPendingTableCharacters(strList8);
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element13 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("");
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("hi!");
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.removeLastFormattingElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("hi!");
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder4.getDocument();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder4.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList6);
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableRowContext();
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test95");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.lastFormattingElement();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.removeLastFormattingElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inListItemScope("hi!");
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test96");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("");
    }
}

