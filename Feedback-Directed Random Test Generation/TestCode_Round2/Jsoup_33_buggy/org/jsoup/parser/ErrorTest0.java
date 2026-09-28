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
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.getFromStack("hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inTableScope("");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inSelectScope("");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inButtonScope("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inScope("hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inScope("hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inScope("");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inSelectScope("");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.util.List<org.jsoup.parser.Token.Character> characterList2 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getFromStack("");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.util.List<org.jsoup.parser.Token.Character> characterList2 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.List<org.jsoup.parser.Token.Character> characterList3 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inSelectScope("hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        java.util.List<org.jsoup.parser.Token.Character> characterList2 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.List<org.jsoup.parser.Token.Character> characterList3 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inScope("hi!");
    }
}

