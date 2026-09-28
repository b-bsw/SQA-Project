package org.jsoup.nodes;

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
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element1.lastElementSibling();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element5 = element1.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.firstElementSibling();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element6.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.lastElementSibling();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.firstElementSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element7.firstElementSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.wrap("<hi! class=\"hi!\"></hi!>");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        boolean boolean7 = element1.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element1.firstElementSibling();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        java.lang.Integer int7 = element5.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element5.lastElementSibling();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element16.wrap("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = element1.firstElementSibling();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element24 = element20.tagName("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element20.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element31.lastElementSibling();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element5.firstElementSibling();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.lang.String str12 = element1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element1.wrap("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node10 = element1.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element1.lastElementSibling();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = element1.firstElementSibling();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements10 = element2.children();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.append("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element16.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        org.jsoup.nodes.Element element26 = element24.val("");
        org.jsoup.nodes.Element element27 = element18.prependChild((org.jsoup.nodes.Node) element26);
        java.lang.String[] strArray30 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element18.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = element2.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.select.Elements elements36 = element2.getElementsByAttribute("<hi! class=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element2.lastElementSibling();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element9.tagName("hi!");
        org.jsoup.select.Elements elements12 = element11.parents();
        org.jsoup.nodes.Node node13 = element11.nextSibling();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = element15.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = element11.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element27 = element2.classNames((java.util.Set<java.lang.String>) strSet23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element2.firstElementSibling();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        org.jsoup.nodes.Element element20 = element18.val("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element18.lastElementSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingText("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element5.prepend("hi!");
        org.jsoup.nodes.Element element12 = element5.appendText("");
        org.jsoup.nodes.Element element14 = element12.toggleClass("<>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.lastElementSibling();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        boolean boolean21 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element5);
        org.jsoup.select.Elements elements24 = element5.getElementsByAttributeValueStarting("hi!", "<hi! class=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element5.lastElementSibling();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        element12.setBaseUri("<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.lastElementSibling();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.nodes.Element element9 = element2.appendElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element2.wrap("hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element24 = element20.tagName("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element20.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element16.lastElementSibling();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        java.lang.String str9 = element8.nodeName();
        java.lang.String str10 = element8.cssSelector();
        org.jsoup.nodes.Element element12 = element8.addClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element8.firstElementSibling();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        int int6 = element3.siblingIndex();
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.select.Elements elements10 = element3.getElementsContainingText("<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element3.lastElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        org.jsoup.nodes.Node node15 = element9.removeAttr("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element9.lastElementSibling();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.children();
        org.jsoup.select.Elements elements8 = element2.getElementsByTag("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element10 = element2.tagName("<hi! class=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element2.firstElementSibling();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.lastElementSibling();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element1.childNodes();
        org.jsoup.nodes.Element element13 = element1.val("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        boolean boolean14 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element1.firstElementSibling();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        java.lang.Integer int6 = element2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element12 = element9.append("<hi!></hi!>");
        org.jsoup.nodes.Element element13 = element2.appendChild((org.jsoup.nodes.Node) element9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element2.firstElementSibling();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element14 = element10.removeClass("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element14.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.lang.String str12 = element1.toString();
        boolean boolean14 = element1.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element1.firstElementSibling();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str10 = element5.outerHtml();
        org.jsoup.select.Elements elements12 = element5.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.select.Elements elements14 = element5.getElementsByAttributeStarting("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element5.firstElementSibling();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.select.Elements elements5 = element1.children();
        org.jsoup.nodes.Node node6 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsMatchingText("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        java.util.Set<java.lang.String> strSet9 = element1.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element1.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        org.jsoup.nodes.Element element12 = element10.tagName("<>>");
        org.jsoup.nodes.Element element14 = element12.text("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element12.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        org.jsoup.nodes.Element element11 = element9.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element9.lastElementSibling();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        int int8 = element5.childNodeSize();
        boolean boolean10 = element5.hasAttr("<hi! class=\"hi!\"></hi!>");
        int int11 = element5.childNodeSize();
        java.lang.String str12 = element5.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element5.firstElementSibling();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.firstElementSibling();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element5.firstElementSibling();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.select.Elements elements5 = element1.children();
        org.jsoup.nodes.Node node6 = element1.parentNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element1.firstElementSibling();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element5.wrap("hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.outerHtml();
        element5.setBaseUri("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element5.wrap("hi!.<hi!></hi!>");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element5.wrap("hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        boolean boolean6 = element3.isBlock();
        org.jsoup.select.Elements elements7 = element3.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element3.firstElementSibling();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.select.Elements elements21 = element20.siblingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.firstElementSibling();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        org.jsoup.nodes.Element element20 = element16.prepend("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.lastElementSibling();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        java.lang.String str4 = element1.cssSelector();
        java.lang.String str5 = element1.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element1.lastElementSibling();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element10.clone();
        boolean boolean14 = element2.equals((java.lang.Object) element10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element10.firstElementSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Document document13 = element10.ownerDocument();
        java.lang.String str14 = element10.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element10.lastElementSibling();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        java.lang.String str4 = element3.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element3.wrap("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        java.lang.String str6 = element2.ownText();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        java.lang.String str10 = element8.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = element8.attributes();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element17 = element14.prepend("");
        org.jsoup.select.Elements elements19 = element14.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element20 = element8.appendChild((org.jsoup.nodes.Node) element14);
        boolean boolean21 = element2.hasSameValue((java.lang.Object) element20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element2.lastElementSibling();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        java.lang.Integer int6 = element2.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element2.lastElementSibling();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        boolean boolean11 = element2.hasAttr("");
        org.jsoup.nodes.Element element13 = element2.append("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element15 = element13.prepend("<<hi!></hi!>></<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.lastElementSibling();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.nodes.Node node13 = element12.parentNode();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.select.Elements elements21 = element19.siblingElements();
        org.jsoup.nodes.Element element23 = element19.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str24 = element19.outerHtml();
        org.jsoup.nodes.Element element25 = element12.appendChild((org.jsoup.nodes.Node) element19);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element12.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element12.lastElementSibling();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueEnding("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<hi! class=\"hi!\"></hi!>");
        java.lang.String str12 = element8.nodeName();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element14.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Element element26 = element14.removeClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element26.childNodes();
        java.lang.String str28 = element26.data();
        org.jsoup.nodes.Element element29 = element8.appendChild((org.jsoup.nodes.Node) element26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element8.firstElementSibling();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element10.prepend("");
        org.jsoup.select.Elements elements14 = element10.siblingElements();
        org.jsoup.select.Elements elements15 = element10.getAllElements();
        org.jsoup.select.Elements elements17 = element10.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements18 = element10.children();
        org.jsoup.nodes.Attributes attributes19 = element10.attributes();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag6, "<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>", attributes19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element20.lastElementSibling();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element11.val("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element11.firstElementSibling();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.cssSelector();
        org.jsoup.nodes.Element element15 = element9.html("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element17 = element9.child(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element9.firstElementSibling();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.jsoup.nodes.Element element9 = element6.removeClass("<hi! class=\"hi!\"></hi!>");
        java.lang.String str11 = element9.attr("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element9.wrap("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        boolean boolean4 = element2.equals((java.lang.Object) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element2.firstElementSibling();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        java.lang.String str5 = element3.attr("hi!");
        org.jsoup.nodes.Element element7 = element3.addClass("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.firstElementSibling();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        org.jsoup.nodes.Element element15 = element13.val("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element17 = element13.append("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element19 = element17.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element17.firstElementSibling();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element24 = element20.tagName("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element20.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element33 = element16.prepend("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Node node35 = element33.removeAttr("hi!.hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element33.wrap("<hi!></hi!>");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element10.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Node node14 = element10.removeAttr("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element10.wrap("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        boolean boolean10 = element1.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.wrap("<hi!.<hi!></hi!>></hi!.<hi!></hi!>>");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element1.removeClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        org.jsoup.nodes.Element element17 = element13.attr("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>", true);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = element17.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element17.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element17.firstElementSibling();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.parser.Tag tag8 = element2.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "<hi!></hi!>");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element14 = element10.appendText("hi!");
        org.jsoup.nodes.Node node15 = element10.previousSibling();
        org.jsoup.nodes.Element element17 = element10.appendText("<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element10.firstElementSibling();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element15 = element12.attr("<hi!>\n hi!\n</hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element15.append("<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements18 = element17.siblingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element17.firstElementSibling();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "hi!", attributes13);
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.nodes.Document document17 = element16.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.lastElementSibling();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.jsoup.nodes.Element element9 = element6.val("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.lastElementSibling();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueMatching("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        boolean boolean13 = element5.isBlock();
        java.lang.String str14 = element5.outerHtml();
        org.jsoup.nodes.Element element16 = element5.prepend("<>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element16.lastElementSibling();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.wrap("<hi!>\n &lt;\n <hi! class=\"hi!\"></hi!>&gt;\n <!--<hi! class=\"hi!\"-->&gt;\n</hi!>");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        java.lang.String[] strArray19 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element7.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element24 = element22.toggleClass("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element22.lastElementSibling();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.select.Elements elements8 = element1.getElementsByClass("hi!");
        org.jsoup.nodes.Element element10 = element1.appendText("<<hi!></hi!>></<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element1.firstElementSibling();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        java.lang.String str12 = element11.html();
        java.lang.String str13 = element11.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element11.lastElementSibling();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements15 = element13.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueContaining("hi!", "<hi! class=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element13.wrap("<hi!>\n &lt;\n <hi! class=\"hi!\"></hi!>&gt;\n <!--<hi! class=\"hi!\"-->&gt;\n</hi!>");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.appendText("<hi!></hi!>");
        java.lang.String str10 = element5.cssSelector();
        java.lang.String str11 = element5.id();
        org.jsoup.select.Elements elements13 = element5.getElementsByAttribute("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element5.wrap("hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.select.Elements elements21 = element7.getAllElements();
        org.jsoup.nodes.Element element23 = element7.prepend("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element23.lastElementSibling();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.children();
        org.jsoup.nodes.Element element8 = element2.text("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element9 = element2.previousElementSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element2.firstElementSibling();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        java.lang.String str14 = element9.toString();
        org.jsoup.nodes.Element element16 = element9.prependText("hi!.<hi!></hi!>");
        org.jsoup.nodes.Node node17 = element16.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element16.wrap("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.root();
        java.lang.String str8 = element5.data();
        org.jsoup.nodes.Element element10 = element5.removeClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        java.lang.String str11 = element5.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element5.wrap("<hi! class=\"<hi!></hi!>\">\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt;&lt;/hi!&gt;&gt;\n</hi!>");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.append("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element15.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element20 = element19.empty();
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element23 = element21.tagName("hi!");
        org.jsoup.nodes.Element element25 = element23.val("");
        org.jsoup.nodes.Element element26 = element17.prependChild((org.jsoup.nodes.Node) element25);
        boolean boolean28 = element17.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element30 = element17.prependText("");
        org.jsoup.nodes.Element element32 = element30.prepend("");
        int int33 = element32.siblingIndex();
        org.jsoup.nodes.Element element34 = element1.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements38 = element36.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element40 = element36.tagName("hi!");
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.jsoup.nodes.Element element46 = element36.classNames((java.util.Set<java.lang.String>) strSet44);
        org.jsoup.nodes.Element element47 = element1.classNames((java.util.Set<java.lang.String>) strSet44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = element1.lastElementSibling();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsMatchingOwnText("hi!");
        org.jsoup.nodes.Element element14 = element8.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.lastElementSibling();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = element1.toggleClass("<hi!></hi!>");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueMatching("<hi! class=\"<hi!></hi!>\"></hi!>", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        java.lang.String str12 = element8.html();
        org.jsoup.nodes.Element element14 = element8.html("<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element8.wrap("<hi! class=\"hi!\"></hi!>");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        int int12 = element9.siblingIndex();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = element9.dataset();
        org.jsoup.nodes.Element element15 = element9.val("<hi!></hi!>");
        java.lang.String str16 = element15.ownText();
        org.jsoup.nodes.Element element18 = element15.val("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element15.lastElementSibling();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsMatchingOwnText("<hi!></hi!>");
        java.lang.Integer int9 = element5.elementSiblingIndex();
        org.jsoup.nodes.Element element11 = element5.text("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element16 = element11.attr("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements20 = element18.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element22 = element18.tagName("hi!");
        org.jsoup.parser.Tag tag23 = element22.tag();
        org.jsoup.select.Elements elements24 = element22.siblingElements();
        org.jsoup.nodes.Element element26 = element22.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str27 = element22.outerHtml();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element30 = element29.empty();
        org.jsoup.select.Elements elements31 = element29.parents();
        org.jsoup.nodes.Node node32 = element29.nextSibling();
        org.jsoup.nodes.Element element34 = element29.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList35 = element29.dataNodes();
        org.jsoup.nodes.Element element37 = element29.val("hi!");
        java.lang.String str38 = element29.val();
        int int39 = element29.siblingIndex();
        org.jsoup.nodes.Element element40 = element22.prependChild((org.jsoup.nodes.Node) element29);
        org.jsoup.select.Elements elements41 = element40.getAllElements();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList42 = element40.dataNodes();
        boolean boolean43 = element16.hasSameValue((java.lang.Object) dataNodeList42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element44 = element16.firstElementSibling();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.parser.Tag tag13 = element2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element2.firstElementSibling();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        java.lang.Integer int7 = element5.elementSiblingIndex();
        java.lang.String str8 = element5.val();
        boolean boolean10 = element5.hasClass("");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttribute("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element5.firstElementSibling();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        java.lang.String str6 = element2.ownText();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        java.lang.String str10 = element8.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = element8.attributes();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element17 = element14.prepend("");
        org.jsoup.select.Elements elements19 = element14.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element20 = element8.appendChild((org.jsoup.nodes.Node) element14);
        boolean boolean21 = element2.hasSameValue((java.lang.Object) element20);
        org.jsoup.nodes.Element element24 = element20.attr("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>", "<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element20.firstElementSibling();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingText("<hi!></hi!>");
        int int9 = element5.childNodeSize();
        java.lang.String str10 = element5.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element5.wrap("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = element5.addClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node10 = element9.root();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element9.lastElementSibling();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.select.Elements elements15 = element2.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element16 = element2.previousElementSibling();
        boolean boolean18 = element2.hasAttr("<<hi!></hi!>>\n <hi! value=\"\"></hi!>\n <hi!></hi!>\n</<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element2.lastElementSibling();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        boolean boolean4 = element2.equals((java.lang.Object) (byte) 10);
        org.jsoup.select.Elements elements6 = element2.getElementsContainingOwnText("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element2.wrap("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        java.lang.String str11 = element2.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element2.wrap("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        org.jsoup.nodes.Element element11 = element9.html("");
        java.lang.String str12 = element9.toString();
        boolean boolean13 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element9);
        org.jsoup.select.Elements elements15 = element9.getElementsByClass("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element9.firstElementSibling();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element12 = element8.tagName("hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element8.classNames((java.util.Set<java.lang.String>) strSet16);
        java.util.Set<java.lang.String> strSet19 = element8.classNames();
        org.jsoup.nodes.Element element20 = element6.classNames(strSet19);
        boolean boolean22 = element20.hasAttr("");
        org.jsoup.nodes.Element element24 = element20.append("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element26 = element20.toggleClass("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element20.wrap("<<hi! class=\"\"></hi!> class=\"<hi!></hi!>\"></<hi! class=\"\"></hi!>>");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsContainingText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element10 = element2.parent();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element14.tagName("hi!");
        org.jsoup.select.Elements elements17 = element16.parents();
        java.lang.String str18 = element16.cssSelector();
        org.jsoup.select.Elements elements19 = element16.parents();
        java.lang.String str20 = element16.outerHtml();
        org.jsoup.nodes.Element element22 = element16.appendText("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        boolean boolean23 = element2.hasSameValue((java.lang.Object) element16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element2.wrap("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsMatchingOwnText("<hi!></hi!>");
        java.lang.Integer int9 = element5.elementSiblingIndex();
        org.jsoup.nodes.Element element11 = element5.text("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element16 = element11.attr("<hi!></hi!>", "<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element11.firstElementSibling();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.prependElement("hi!");
        org.jsoup.parser.Tag tag8 = element7.tag();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        org.jsoup.select.Elements elements16 = element12.siblingElements();
        org.jsoup.select.Elements elements17 = element12.getAllElements();
        org.jsoup.select.Elements elements19 = element12.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements20 = element12.children();
        org.jsoup.nodes.Attributes attributes21 = element12.attributes();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag8, "", attributes21);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element26 = element25.empty();
        org.jsoup.nodes.Element element27 = element26.empty();
        org.jsoup.nodes.Element element29 = element26.prepend("");
        org.jsoup.select.Elements elements30 = element26.siblingElements();
        org.jsoup.select.Elements elements31 = element26.getAllElements();
        org.jsoup.parser.Tag tag32 = element26.tag();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag32, "<hi!></hi!>");
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag32, "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag32, "<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element42 = element41.empty();
        org.jsoup.nodes.Element element43 = element42.empty();
        org.jsoup.nodes.Attributes attributes44 = element42.attributes();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag32, "<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>", attributes44);
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element49 = element48.empty();
        org.jsoup.nodes.Element element50 = element49.empty();
        org.jsoup.nodes.Element element52 = element49.prepend("");
        org.jsoup.select.Elements elements53 = element49.siblingElements();
        org.jsoup.select.Elements elements54 = element49.getAllElements();
        org.jsoup.nodes.Attributes attributes55 = element49.attributes();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag32, "<>>", attributes55);
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag8, "<hi!.<hi!></hi!>></hi!.<hi!></hi!>>", attributes55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element59 = element57.wrap("<hi! class=\"<hi!></hi!> hi!\" value=\"<hi! class=&quot;hi!&quot;></hi!>\"></hi!>");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        java.lang.String str21 = element5.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element5.firstElementSibling();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element12.outerHtml();
        java.lang.String str15 = element12.attr("<<hi!></hi!>></<hi!></hi!>>");
        java.lang.String str16 = element12.ownText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element12.wrap("<hi! class=\"<hi!></hi!>\">\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt;&lt;/hi!&gt;&gt;\n</hi!>");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        java.lang.String str10 = element9.cssSelector();
        org.jsoup.select.Elements elements11 = element9.parents();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element17 = element14.append("<hi!></hi!>");
        java.lang.String str18 = element14.ownText();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        java.lang.String str22 = element20.outerHtml();
        org.jsoup.nodes.Attributes attributes23 = element20.attributes();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element26 = element25.empty();
        org.jsoup.nodes.Element element27 = element26.empty();
        org.jsoup.nodes.Element element29 = element26.prepend("");
        org.jsoup.select.Elements elements31 = element26.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element32 = element20.appendChild((org.jsoup.nodes.Node) element26);
        boolean boolean33 = element14.hasSameValue((java.lang.Object) element32);
        boolean boolean34 = element9.equals((java.lang.Object) element32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element9.lastElementSibling();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.select.Elements elements21 = element20.siblingElements();
        org.jsoup.nodes.Element element22 = element20.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element22.lastElementSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element22 = element5.text("");
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element28 = element24.tagName("hi!");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element24.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element36 = element34.val("<hi!></hi!>");
        org.jsoup.select.Elements elements39 = element34.getElementsByAttributeValueStarting("hi!", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element40 = element22.prependChild((org.jsoup.nodes.Node) element34);
        org.jsoup.nodes.Element element43 = element22.attr("<hi! class=\"<hi!></hi!>\"></hi!>", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element22.wrap("<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.val("");
        java.lang.String str8 = element7.className();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueNot("<hi! class=\"<hi!></hi!>\"></hi!>", "<hi! class=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements12 = element7.siblingElements();
        org.jsoup.select.Elements elements14 = element7.getElementsByAttributeStarting("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element15 = element7.nextElementSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element7.wrap("hi!.hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        boolean boolean8 = element3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node9 = element3.previousSibling();
        org.jsoup.nodes.Element element11 = element3.appendText("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements12 = element3.children();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element15 = element14.empty();
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element15.append("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = element18.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.nodes.Element element24 = element23.empty();
        org.jsoup.nodes.Element element26 = element24.tagName("hi!");
        org.jsoup.nodes.Element element28 = element26.val("");
        org.jsoup.nodes.Element element29 = element20.prependChild((org.jsoup.nodes.Node) element28);
        boolean boolean31 = element20.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element33 = element20.prependText("");
        org.jsoup.nodes.Element element35 = element33.prepend("");
        org.jsoup.select.Elements elements38 = element35.getElementsByAttributeValueMatching("", "<hi!></hi!>");
        boolean boolean39 = element3.hasSameValue((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element40 = element3.lastElementSibling();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        boolean boolean8 = element3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node9 = element3.previousSibling();
        org.jsoup.nodes.Element element11 = element3.appendText("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements12 = element3.children();
        boolean boolean14 = element3.hasClass("<<hi! class=\"\"></hi!>></<hi! class=\"\"></hi!>>");
        org.jsoup.nodes.Element element16 = element3.appendText("hi!.<hi!></hi!>.hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element16.wrap("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        boolean boolean8 = element3.equals((java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element3.wrap("<hi!>\n &lt;\n <hi! class=\"hi!\"></hi!>&gt;\n <!--<hi! class=\"hi!\"-->&gt;\n</hi!>");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.select.Elements elements10 = element8.parents();
        org.jsoup.nodes.Node node11 = element8.nextSibling();
        org.jsoup.nodes.Element element13 = element8.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = element8.dataNodes();
        org.jsoup.nodes.Element element16 = element8.val("hi!");
        java.lang.String str17 = element8.val();
        org.jsoup.nodes.Element element19 = element8.prependText("");
        org.jsoup.select.Elements elements21 = element19.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element22 = element1.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element1.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element1.lastElementSibling();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.select.Elements elements13 = element2.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element2.firstElementSibling();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.children();
        org.jsoup.nodes.Element element8 = element2.text("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element9 = element2.previousElementSibling();
        org.jsoup.nodes.Element element11 = element2.appendText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element2.wrap("<<hi! class=\"\"></hi!>></<hi! class=\"\"></hi!>>");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = element5.getElementById("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element11 = element5.toggleClass("<<hi! class=\"\"></hi!>></<hi! class=\"\"></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element11.firstElementSibling();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        java.lang.String str11 = element10.cssSelector();
        org.jsoup.parser.Tag tag12 = element10.tag();
        org.jsoup.select.Elements elements13 = element10.siblingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element10.lastElementSibling();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.empty();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.lastElementSibling();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = element8.dataset();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element20 = element17.prepend("");
        element17.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = element17.prepend("hi!");
        java.util.Set<java.lang.String> strSet25 = element24.classNames();
        org.jsoup.nodes.Element element26 = element8.classNames(strSet25);
        java.lang.String str28 = element8.attr("<hi! value=\"\"></hi!>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element8.wrap("<hi! class=\"hi!\" <hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>></hi!>");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "hi!", attributes13);
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.nodes.Element element18 = element16.append("hi!.<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element16.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element16.firstElementSibling();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = element5.addClass("<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element9.wrap("&lt;\n<hi! class=\"\"></hi!>&gt;\n<!--<hi! class=\"\"-->&gt;");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        java.lang.Integer int11 = element10.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element10.wrap("<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element9 = element2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element2.lastElementSibling();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element11 = element5.append("<hi! class=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element5.lastElementSibling();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        java.lang.String str11 = element10.cssSelector();
        org.jsoup.parser.Tag tag12 = element10.tag();
        org.jsoup.select.Elements elements14 = element10.getElementsByAttribute("<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element10.lastElementSibling();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        java.lang.String[] strArray19 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element7.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.select.Elements elements23 = element22.parents();
        org.jsoup.nodes.Node node24 = element22.nextSibling();
        org.jsoup.select.Elements elements26 = element22.getElementsContainingText("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element28 = element22.prependElement("<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element22.firstElementSibling();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element9.firstElementSibling();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        element12.setBaseUri("<hi! class=\"<hi!></hi!>\"></hi!>");
        boolean boolean15 = element12.hasText();
        org.jsoup.nodes.Element element17 = element12.removeClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element12.lastElementSibling();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.nodes.Node node13 = element12.parentNode();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.select.Elements elements21 = element19.siblingElements();
        org.jsoup.nodes.Element element23 = element19.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str24 = element19.outerHtml();
        org.jsoup.nodes.Element element25 = element12.appendChild((org.jsoup.nodes.Node) element19);
        org.jsoup.nodes.Element element27 = element12.appendElement("<<hi!></hi!>>\n <hi! value=\"\"></hi!>\n <hi!></hi!>\n</<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element29 = element12.wrap("hi!.<hi!>.hi!.</hi!>");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element12 = element8.tagName("hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = element8.classNames((java.util.Set<java.lang.String>) strSet16);
        java.util.Set<java.lang.String> strSet19 = element8.classNames();
        org.jsoup.nodes.Element element20 = element6.classNames(strSet19);
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueMatching("<hi! class=\"hi!\"></hi!>", "<hi! class=\"hi!\"></hi!>");
        java.lang.String str24 = element20.cssSelector();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element20.lastElementSibling();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        boolean boolean18 = element7.hasClass("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element20 = element7.prependText("");
        org.jsoup.select.Elements elements21 = element7.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element7.wrap("<<hi!></hi!>>\n <hi! value=\"\"></hi!>\n <hi!></hi!>\n</<hi!></hi!>>");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.jsoup.nodes.Element element12 = element1.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element15 = element12.attr("<hi!>\n hi!\n</hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element17 = element15.addClass("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.nodes.Element element19 = element15.append("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        java.lang.String str21 = element19.absUrl("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element19.wrap("<hi! class=\"<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements12 = element8.getElementsByAttribute("<>>");
        java.lang.String str13 = element8.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element8.firstElementSibling();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements5 = element1.getElementsByTag("hi!.<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeStarting("hi!");
        org.jsoup.select.Elements elements10 = element1.getElementsByAttributeValueMatching("hi!", "hi!.hi!");
        org.jsoup.nodes.Element element12 = element1.val("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element12.wrap("hi!.<hi!>.hi!.</hi!>");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.outerHtml();
        java.util.Set<java.lang.String> strSet8 = element5.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element5.wrap("<hi!.<hi!></hi!>></hi!.<hi!></hi!>>");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        java.lang.String str8 = element6.absUrl("<hi!>\n hi!\n</hi!>");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node13 = element10.root();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element19 = element16.prepend("");
        org.jsoup.nodes.Node node20 = element19.previousSibling();
        org.jsoup.nodes.Element element21 = element10.appendChild((org.jsoup.nodes.Node) element19);
        org.jsoup.nodes.Element element22 = element10.parent();
        boolean boolean23 = element6.hasSameValue((java.lang.Object) element10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element10.wrap("<hi!>\n &lt;&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;\n <hi! class=\"\"> \n  <hi!></hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.nodes.Element element11 = element9.prepend("");
        int int12 = element9.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element9.wrap("<hi! class=\"\">\n hi!\n</hi!>");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Element element7 = element2.text("hi!");
        java.lang.String str8 = element7.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element7.lastElementSibling();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.cssSelector();
        org.jsoup.select.Elements elements9 = element5.getElementsByTag("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.lang.String str10 = element5.tagName();
        org.jsoup.select.Elements elements11 = element5.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element5.firstElementSibling();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element11.val("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element11.prepend("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        java.lang.String str16 = element11.val();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList17 = element11.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element11.firstElementSibling();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element24 = element20.tagName("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element20.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.select.Elements elements33 = element31.getElementsByIndexGreaterThan(0);
        boolean boolean34 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element31.wrap("<hi! <hi!>\n hi!\n</hi!>=\"<hi!></hi!>\" class=\"\">\n <hi!></hi!>\n <hi! class=\"hi!\"></hi!>\n</hi!>");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element9 = element7.tagName("hi!");
        org.jsoup.select.Elements elements10 = element9.parents();
        org.jsoup.nodes.Node node11 = element9.nextSibling();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements15 = element13.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element17 = element13.tagName("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = element13.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = element9.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element26 = element9.text("");
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements30 = element28.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element32 = element28.tagName("hi!");
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.jsoup.nodes.Element element38 = element28.classNames((java.util.Set<java.lang.String>) strSet36);
        org.jsoup.nodes.Element element40 = element38.val("<hi!></hi!>");
        org.jsoup.select.Elements elements43 = element38.getElementsByAttributeValueStarting("hi!", "<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element44 = element26.prependChild((org.jsoup.nodes.Node) element38);
        org.jsoup.nodes.Element element47 = element26.attr("<hi! class=\"<hi!></hi!>\"></hi!>", false);
        boolean boolean48 = element3.equals((java.lang.Object) element47);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList49 = element47.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element51 = element47.wrap("<hi!.<hi!></hi!>></hi!.<hi!></hi!>>");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        java.util.Set<java.lang.String> strSet12 = element1.classNames();
        org.jsoup.nodes.Element element14 = element1.getElementById("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element1.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element1.firstElementSibling();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        java.lang.String str4 = element1.cssSelector();
        org.jsoup.nodes.Element element6 = element1.prependText("<hi!></hi!>");
        java.lang.String str8 = element6.absUrl("<hi!>\n hi!\n</hi!>");
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeStarting("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element6.wrap("<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.select.Elements elements21 = element20.siblingElements();
        org.jsoup.nodes.Element element22 = element20.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element20.wrap("&lt;\n<hi! class=\"\"></hi!>&gt;\n<!--<hi! class=\"\"-->&gt;");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element9.firstElementSibling();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        boolean boolean5 = element2.hasClass("hi!");
        java.lang.Integer int6 = element2.elementSiblingIndex();
        org.jsoup.nodes.Element element8 = element2.tagName("hi!.hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element2.wrap("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element2.textNodes();
        org.jsoup.select.Elements elements8 = element2.parents();
        org.jsoup.nodes.Element element10 = element2.prependText("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element10.lastElementSibling();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "hi!", attributes13);
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.nodes.Element element18 = element16.append("hi!.<hi!></hi!>");
        java.lang.String str19 = element16.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element16.wrap("hi!.<hi!></hi!>");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "hi!", attributes13);
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        org.jsoup.nodes.Element element17 = element14.removeClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element14.childNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = element14.textNodes();
        java.lang.String str20 = element14.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element21 = element14.lastElementSibling();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element1.removeClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        org.jsoup.nodes.Element element17 = element13.attr("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>", true);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!.<hi!></hi!>", "hi!.hi!", "<hi!>\n <hi! class=\"\"></hi!>\n</hi!>", "", "<hi! class=\"<hi!></hi!> hi!\" value=\"<hi! class=&quot;hi!&quot;></hi!>\"></hi!>", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<<hi!></hi!>></<hi!></hi!>>", "<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<hi! class=\"hi!\"></hi!>", "<>>", "", "hi!.<hi!></hi!>", "<hi! class=\"<hi!></hi!> hi!\" value=\"<hi! class=&quot;hi!&quot;></hi!>\"></hi!>", "<<hi!></hi!>>\n <hi! value=\"\"></hi!>\n <hi!></hi!>\n</<hi!></hi!>>" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        org.jsoup.nodes.Element element35 = element17.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element37 = element17.appendElement("<<hi!></hi!>>\n <hi! value=\"\"></hi!>\n <hi!></hi!>\n</<hi!></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element17.wrap("<hi! hi!=\"\"></hi!>");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "hi!", attributes13);
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        java.lang.String str16 = element14.tagName();
        org.jsoup.nodes.Element element18 = element14.appendText("hi!");
        boolean boolean19 = element18.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element18.firstElementSibling();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi! class=\"hi!\" value=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = element1.wrap("<hi!>\n &lt;&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;\n <hi! class=\"\"> \n  <hi!></hi!> \n </hi!>\n</hi!>");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        boolean boolean11 = element2.hasAttr("");
        org.jsoup.nodes.Element element13 = element2.append("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element13.wrap("<hi! class=\"\" <hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>=\"<hi! class=&quot;<hi! class=&amp;quot;<hi!></hi!>&amp;quot; value=&amp;quot;hi!&amp;quot;></hi!>&quot;>\n hi!\n</hi!>\"></hi!>");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        java.lang.String[] strArray19 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = element7.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.select.Elements elements23 = element22.parents();
        org.jsoup.nodes.Node node24 = element22.nextSibling();
        org.jsoup.select.Elements elements26 = element22.getElementsMatchingText("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = element22.wrap("<>>");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element7.prepend("");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element13 = element1.appendChild((org.jsoup.nodes.Node) element7);
        org.jsoup.select.Elements elements15 = element13.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueContaining("hi!", "<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element19 = element13.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element13.lastElementSibling();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        java.lang.String str3 = element1.outerHtml();
        org.jsoup.nodes.Attributes attributes4 = element1.attributes();
        org.jsoup.nodes.Element element5 = element1.empty();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = element5.wrap("<<hi! class=\"hi!\"></hi!>>\n <hi! class=\"<hi!></hi!>\"></hi!>\n <hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>\n</<hi! class=\"hi!\"></hi!>>");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        java.lang.String str5 = element1.attr("hi!");
        org.jsoup.nodes.Element element7 = element1.prepend("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element9 = element1.html("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element11 = element9.append("hi!");
        org.jsoup.select.Elements elements12 = element11.siblingElements();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element18.dataset();
        org.jsoup.nodes.Element element21 = element18.tagName("hi!");
        org.jsoup.nodes.Element element23 = element21.prepend("hi!");
        org.jsoup.nodes.Element element25 = element23.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Node node27 = element23.removeAttr("<hi! class=\"\"></hi!>");
        java.lang.String str28 = element23.nodeName();
        boolean boolean30 = element23.hasAttr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element31 = element11.prependChild((org.jsoup.nodes.Node) element23);
        org.jsoup.select.Elements elements33 = element11.getElementsContainingText("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        org.jsoup.select.Elements elements34 = element11.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element11.wrap("<hi! class=\"hi!\" value=\"<hi!></hi!>\"></hi!>");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element11.val("<hi!></hi!>");
        java.lang.String str14 = element11.val();
        org.jsoup.nodes.Element element16 = element11.prepend("<hi! class=\"<hi!></hi!>\">\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element11.lastElementSibling();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str10 = element5.outerHtml();
        org.jsoup.nodes.Document document11 = element5.ownerDocument();
        java.lang.String str12 = element5.ownText();
        org.jsoup.select.Elements elements14 = element5.getElementsByIndexGreaterThan(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element5.firstElementSibling();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        org.jsoup.select.Elements elements7 = element2.siblingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element2.lastElementSibling();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = element8.dataset();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element20 = element17.prepend("");
        element17.setBaseUri("hi!");
        org.jsoup.nodes.Element element24 = element17.prepend("hi!");
        java.util.Set<java.lang.String> strSet25 = element24.classNames();
        org.jsoup.nodes.Element element26 = element8.classNames(strSet25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element26.firstElementSibling();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        org.jsoup.parser.Tag tag6 = element5.tag();
        org.jsoup.select.Elements elements7 = element5.siblingElements();
        org.jsoup.nodes.Element element9 = element5.tagName("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element11 = element5.append("<hi! class=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element5.wrap("<hi! class=\"<hi!></hi!>\">\n &lt;&lt;hi!&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi!&gt;&lt;/hi!&gt;&gt;\n</hi!>");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        java.lang.String str7 = element5.outerHtml();
        element5.setBaseUri("<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element5.wrap("<hi! value=\"\"></hi!>\n<hi!></hi!>");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element6 = element5.clone();
        java.lang.String str7 = element6.ownText();
        org.jsoup.select.Elements elements9 = element6.getElementsContainingOwnText("<>>");
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element15 = element12.prepend("");
        org.jsoup.select.Elements elements17 = element12.getElementsByIndexGreaterThan(10);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element12.childNodes();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element21.prepend("");
        org.jsoup.select.Elements elements25 = element21.siblingElements();
        org.jsoup.select.Elements elements26 = element21.getAllElements();
        org.jsoup.select.Elements elements28 = element21.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element31 = element21.attr("hi!", "");
        org.jsoup.nodes.Node node32 = element31.parentNode();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements36 = element34.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element38 = element34.tagName("hi!");
        org.jsoup.parser.Tag tag39 = element38.tag();
        org.jsoup.select.Elements elements40 = element38.siblingElements();
        org.jsoup.nodes.Element element42 = element38.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str43 = element38.outerHtml();
        org.jsoup.nodes.Element element44 = element31.appendChild((org.jsoup.nodes.Node) element38);
        java.lang.String str45 = element31.tagName();
        org.jsoup.nodes.Element element46 = element12.appendChild((org.jsoup.nodes.Node) element31);
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements50 = element48.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element52 = element48.tagName("hi!");
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = element48.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element element60 = element58.val("<hi!></hi!>");
        org.jsoup.nodes.Element element61 = element46.prependChild((org.jsoup.nodes.Node) element58);
        java.lang.String str62 = element58.nodeName();
        org.jsoup.nodes.Element element63 = element6.prependChild((org.jsoup.nodes.Node) element58);
        org.jsoup.nodes.Element element66 = element6.attr("<hi!.<hi!></hi!>></hi!.<hi!></hi!>>", "&lt;\n<hi! class=\"\"></hi!>&gt;\n<!--<hi! class=\"\"-->&gt;");
        org.jsoup.nodes.Node node67 = element66.previousSibling();
        org.jsoup.nodes.Element element68 = element66.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element69 = element68.lastElementSibling();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        java.lang.Integer int7 = element5.elementSiblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.nodes.Element element7 = element5.val("");
        org.jsoup.nodes.Element element9 = element5.removeClass("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element11 = element5.tagName("<hi!>\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element5.wrap("&lt;\n<hi! class=\"\"></hi!>&gt;\n<!--<hi! class=\"\"-->&gt;");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueMatching("<hi!></hi!>", "<hi!></hi!>");
        java.lang.String str13 = element9.cssSelector();
        org.jsoup.select.Elements elements15 = element9.getElementsByAttribute("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element9.lastElementSibling();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        int int8 = element5.childNodeSize();
        boolean boolean10 = element5.hasAttr("<hi! class=\"hi!\"></hi!>");
        java.lang.String str11 = element5.toString();
        java.lang.String str12 = element5.tagName();
        org.jsoup.nodes.Element element14 = element5.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element14.wrap("hi!.<hi!.class=\"<hi!.class=&quot;<hi!></hi!>&quot;.value=&quot;hi!&quot;></hi!>\">.hi!.</hi!>");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element5.dataNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element5.wrap("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element3.tagName("hi!");
        org.jsoup.select.Elements elements6 = element5.parents();
        org.jsoup.nodes.Node node7 = element5.nextSibling();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element23 = element5.attr("<hi! class=\"hi!\"></hi!>", false);
        org.jsoup.select.Elements elements25 = element5.getElementsMatchingText("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element5.firstElementSibling();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element8.tagName("hi!");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.nodes.Node node12 = element10.nextSibling();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element14.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Element element25 = element10.classNames((java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = element1.equals((java.lang.Object) strSet22);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element1.childNodesCopy();
        org.jsoup.select.Elements elements30 = element1.getElementsByAttributeValue("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>", "<hi! class=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element31 = element1.firstElementSibling();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = element1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = element1.removeClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element16 = element13.attr("<hi!></hi!>", false);
        org.jsoup.nodes.Element element18 = element13.text("<hi!></hi!>");
        org.jsoup.nodes.Element element19 = element13.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element13.lastElementSibling();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.nodes.Node node13 = element12.parentNode();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        org.jsoup.parser.Tag tag20 = element19.tag();
        org.jsoup.select.Elements elements21 = element19.siblingElements();
        org.jsoup.nodes.Element element23 = element19.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str24 = element19.outerHtml();
        org.jsoup.nodes.Element element25 = element12.appendChild((org.jsoup.nodes.Node) element19);
        int int26 = element25.siblingIndex();
        java.lang.String str27 = element25.val();
        org.jsoup.nodes.Element element29 = element25.addClass("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element29.lastElementSibling();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.nodes.Element element8 = element6.prependText("hi!");
        org.jsoup.nodes.Node node9 = element6.nextSibling();
        org.jsoup.nodes.Element element11 = element6.prependElement("<hi! class=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element6.firstElementSibling();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        boolean boolean4 = element2.equals((java.lang.Object) (byte) 10);
        org.jsoup.select.Elements elements6 = element2.getElementsContainingOwnText("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element2.textNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element2.lastElementSibling();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element9 = element2.attr("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>", true);
        java.lang.String str10 = element9.cssSelector();
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeStarting("<>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element9.lastElementSibling();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        int int8 = element5.childNodeSize();
        boolean boolean10 = element5.hasAttr("<hi! class=\"hi!\"></hi!>");
        java.lang.String str11 = element5.toString();
        java.lang.String str12 = element5.tagName();
        org.jsoup.nodes.Element element13 = element5.previousElementSibling();
        org.jsoup.select.Elements elements14 = element5.parents();
        java.lang.String str16 = element5.attr("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element18 = element5.tagName("<hi! class=\"\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element20 = element18.prependText("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element22 = element20.text("hi!.<hi!></hi!>.hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element20.firstElementSibling();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.nodes.Element element8 = element1.toggleClass("<hi!></hi!>");
        org.jsoup.nodes.Element element10 = element1.append("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element14.tagName("hi!");
        boolean boolean17 = element14.isBlock();
        org.jsoup.nodes.Element element18 = element10.appendChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element20 = element18.append("<hi!>\n <hi! class=\"\"></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element22 = element20.wrap("<hi!>\n &lt;hi!&gt; &lt;hi! class=\"\"&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        java.lang.String str8 = element5.nodeName();
        org.jsoup.nodes.Node node10 = element5.removeAttr("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element11 = element5.nextElementSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element5.firstElementSibling();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("<hi!></hi!>");
        org.jsoup.nodes.Element element3 = element1.val("");
        org.jsoup.select.Elements elements5 = element3.getElementsMatchingText("<hi! class=\"<hi!></hi!>\">\n hi!\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element3.lastElementSibling();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element12 = element2.attr("hi!", "");
        org.jsoup.parser.Tag tag13 = element2.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Attributes attributes19 = element17.attributes();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag13, "<hi! class=\"hi!\"></hi!>", attributes19);
        boolean boolean22 = element20.equals((java.lang.Object) 1L);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = element20.dataset();
        boolean boolean24 = org.jsoup.nodes.Element.preserveWhitespace((org.jsoup.nodes.Node) element20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element20.firstElementSibling();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element2.textNodes();
        boolean boolean8 = element2.isBlock();
        java.lang.String str9 = element2.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element2.wrap("<hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        org.jsoup.nodes.Element element10 = element8.prepend("hi!");
        org.jsoup.nodes.Element element12 = element8.html("");
        java.lang.String str13 = element8.nodeName();
        java.lang.String str14 = element8.baseUri();
        java.lang.String str16 = element8.absUrl("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element8.wrap("&lt;&gt;&gt;");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.prepend("");
        org.jsoup.select.Elements elements17 = element13.siblingElements();
        org.jsoup.select.Elements elements18 = element13.getAllElements();
        org.jsoup.parser.Tag tag19 = element13.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag19, "<hi!></hi!>");
        org.jsoup.select.Elements elements23 = element21.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements25 = element21.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.nodes.Node node26 = element21.root();
        org.jsoup.nodes.Element element27 = element9.appendChild(node26);
        java.lang.String str28 = element9.text();
        org.jsoup.select.Elements elements29 = element9.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element9.lastElementSibling();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.lang.String str6 = element1.toString();
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node9 = element1.nextSibling();
        java.lang.String str10 = element1.html();
        org.jsoup.nodes.Element element13 = element1.attr("<<hi! class=\"hi!\"></hi!>>\n <hi! class=\"<hi!></hi!>\"></hi!>\n <hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>\n</<hi! class=\"hi!\"></hi!>>", "<hi!>\n &lt;&gt;&gt;\n</hi!>");
        org.jsoup.select.Elements elements15 = element1.getElementsMatchingText("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.nodes.Element element21 = element18.prepend("");
        org.jsoup.select.Elements elements23 = element21.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element25 = element21.addClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Node node26 = element21.root();
        org.jsoup.nodes.Element element28 = element21.val("<hi!></hi!>");
        org.jsoup.nodes.Element element30 = element21.removeClass("<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element31 = element1.prependChild((org.jsoup.nodes.Node) element21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element31.wrap("<hi! class=\"\">\n <<hi! class=\"\"></hi!>></<hi! class=\"\"></hi!>>\n</hi!>");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        java.lang.String str4 = element1.cssSelector();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element1.firstElementSibling();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.select.Elements elements7 = element2.getAllElements();
        org.jsoup.select.Elements elements9 = element2.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements10 = element2.children();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.nodes.Element element14 = element13.empty();
        org.jsoup.nodes.Element element16 = element13.append("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element16.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element21 = element20.empty();
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.nodes.Element element24 = element22.tagName("hi!");
        org.jsoup.nodes.Element element26 = element24.val("");
        org.jsoup.nodes.Element element27 = element18.prependChild((org.jsoup.nodes.Node) element26);
        java.lang.String[] strArray30 = new java.lang.String[] { "<hi! class=\"hi!\"></hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = element18.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = element2.classNames((java.util.Set<java.lang.String>) strSet31);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList35 = element2.dataNodes();
        boolean boolean36 = element2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element2.firstElementSibling();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String str14 = element9.toString();
        org.jsoup.nodes.Element element15 = element5.appendChild((org.jsoup.nodes.Node) element9);
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.jsoup.select.Elements elements17 = element15.getAllElements();
        java.lang.String str18 = element15.html();
        java.lang.String str19 = element15.ownText();
        org.jsoup.nodes.Element element22 = element15.attr("<>>", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element22.lastElementSibling();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.select.Elements elements10 = element8.parents();
        org.jsoup.nodes.Node node11 = element8.nextSibling();
        org.jsoup.nodes.Element element13 = element8.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = element8.dataNodes();
        org.jsoup.nodes.Element element16 = element8.val("hi!");
        java.lang.String str17 = element8.val();
        org.jsoup.nodes.Element element19 = element8.prependText("");
        org.jsoup.select.Elements elements21 = element19.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element22 = element1.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element22.lastElementSibling();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element3 = element1.removeClass("");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        boolean boolean8 = element3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node9 = element3.previousSibling();
        org.jsoup.nodes.Element element11 = element3.appendText("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.select.Elements elements13 = element11.getElementsContainingOwnText("<hi!></hi!>");
        org.jsoup.nodes.Element element15 = element11.tagName("<hi! class=\"<hi!></hi!>\"></hi!>");
        org.jsoup.nodes.Element element17 = element15.tagName("<hi! hi!=\"\">\n <<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>\n</hi!>");
        org.jsoup.nodes.Element element19 = element17.prepend("<hi! class=\"<hi!></hi!>\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element17.firstElementSibling();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        java.lang.String str14 = element9.toString();
        org.jsoup.nodes.Element element16 = element9.prependText("hi!.<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = element9.firstElementSibling();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element2.lastElementSibling();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        java.lang.Integer int7 = element5.elementSiblingIndex();
        java.lang.String str8 = element5.val();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element14 = element11.prepend("");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.addClass("<hi! class=\"\"></hi!>");
        org.jsoup.nodes.Element element20 = element14.appendElement("<hi! class=\"\"></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList21 = element20.dataNodes();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element24 = element23.empty();
        org.jsoup.nodes.Element element25 = element24.empty();
        org.jsoup.nodes.Element element27 = element24.prepend("");
        org.jsoup.select.Elements elements28 = element24.siblingElements();
        org.jsoup.nodes.Element element30 = element24.appendText("hi!");
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValueEnding("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<hi! class=\"hi!\"></hi!>");
        java.lang.String str34 = element30.nodeName();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements38 = element36.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element40 = element36.tagName("hi!");
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.jsoup.nodes.Element element46 = element36.classNames((java.util.Set<java.lang.String>) strSet44);
        org.jsoup.nodes.Element element48 = element36.removeClass("<hi! class=\"<hi!></hi!>\"></hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = element48.childNodes();
        java.lang.String str50 = element48.data();
        org.jsoup.nodes.Element element51 = element30.appendChild((org.jsoup.nodes.Node) element48);
        boolean boolean52 = element20.equals((java.lang.Object) element51);
        org.jsoup.nodes.Element element53 = element5.appendChild((org.jsoup.nodes.Node) element51);
        org.jsoup.nodes.Node node55 = element53.removeAttr("<<hi!></hi!>>\n <hi! value=\"\"></hi!>\n <hi!></hi!>\n</<hi!></hi!>>");
        org.jsoup.nodes.Element element57 = element53.prependElement("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>");
        org.jsoup.nodes.Element element59 = element53.toggleClass("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element61 = element53.wrap("<hi! class=\"<hi!></hi!>\">\n hi!\n</hi!>");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element2.getElementsByIndexGreaterThan(10);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element2.childNodes();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element14 = element11.prepend("");
        org.jsoup.select.Elements elements15 = element11.siblingElements();
        org.jsoup.select.Elements elements16 = element11.getAllElements();
        org.jsoup.select.Elements elements18 = element11.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element21 = element11.attr("hi!", "");
        org.jsoup.nodes.Node node22 = element21.parentNode();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element28 = element24.tagName("hi!");
        org.jsoup.parser.Tag tag29 = element28.tag();
        org.jsoup.select.Elements elements30 = element28.siblingElements();
        org.jsoup.nodes.Element element32 = element28.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str33 = element28.outerHtml();
        org.jsoup.nodes.Element element34 = element21.appendChild((org.jsoup.nodes.Node) element28);
        java.lang.String str35 = element21.tagName();
        org.jsoup.nodes.Element element36 = element2.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element38.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element42 = element38.tagName("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.jsoup.nodes.Element element48 = element38.classNames((java.util.Set<java.lang.String>) strSet46);
        org.jsoup.nodes.Element element50 = element48.val("<hi!></hi!>");
        org.jsoup.nodes.Element element51 = element36.prependChild((org.jsoup.nodes.Node) element48);
        org.jsoup.parser.Tag tag52 = element36.tag();
        java.lang.String str53 = element36.tagName();
        org.jsoup.select.Elements elements56 = element36.getElementsByAttributeValue("<<hi!></hi!>></<hi!></hi!>>", "<hi! class=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element57 = element36.lastElementSibling();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.append("<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element5.tagName("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element13 = element11.tagName("hi!");
        org.jsoup.nodes.Element element15 = element13.val("");
        org.jsoup.nodes.Element element16 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element18 = element16.toggleClass("");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements22 = element20.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element24 = element20.tagName("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element20.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.select.Elements elements32 = element31.parents();
        element31.setBaseUri("<hi! class=\"<hi!></hi!>\" value=\"hi!\"></hi!>");
        org.jsoup.nodes.Node node35 = element31.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = element31.wrap("hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element2.getElementsByIndexGreaterThan(10);
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element2.childNodes();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        org.jsoup.nodes.Element element14 = element11.prepend("");
        org.jsoup.select.Elements elements15 = element11.siblingElements();
        org.jsoup.select.Elements elements16 = element11.getAllElements();
        org.jsoup.select.Elements elements18 = element11.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Element element21 = element11.attr("hi!", "");
        org.jsoup.nodes.Node node22 = element21.parentNode();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements26 = element24.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element28 = element24.tagName("hi!");
        org.jsoup.parser.Tag tag29 = element28.tag();
        org.jsoup.select.Elements elements30 = element28.siblingElements();
        org.jsoup.nodes.Element element32 = element28.tagName("<hi! class=\"hi!\"></hi!>");
        java.lang.String str33 = element28.outerHtml();
        org.jsoup.nodes.Element element34 = element21.appendChild((org.jsoup.nodes.Node) element28);
        java.lang.String str35 = element21.tagName();
        org.jsoup.nodes.Element element36 = element2.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements40 = element38.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element42 = element38.tagName("hi!");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.jsoup.nodes.Element element48 = element38.classNames((java.util.Set<java.lang.String>) strSet46);
        org.jsoup.nodes.Element element50 = element48.val("<hi!></hi!>");
        org.jsoup.nodes.Element element51 = element36.prependChild((org.jsoup.nodes.Node) element48);
        java.lang.String str52 = element51.text();
        java.lang.String str53 = element51.baseUri();
        boolean boolean55 = element51.hasClass("<hi!>\n &lt;&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;\n <hi! class=\"\"> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element57 = element51.wrap("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.children();
        org.jsoup.nodes.Element element8 = element2.text("<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element10 = element8.prependText("hi!.<hi!></hi!>");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element10.firstElementSibling();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!.");
        org.jsoup.nodes.Element element3 = element1.prepend("<hi!>\n hi!.\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = element1.lastElementSibling();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        boolean boolean4 = element1.hasText();
        org.jsoup.nodes.Node node5 = element1.parentNode();
        org.jsoup.select.Elements elements8 = element1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element10 = element1.empty();
        java.lang.String str11 = element1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element1.firstElementSibling();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = element1.dataNodes();
        org.jsoup.nodes.Element element9 = element1.val("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = element9.toggleClass("hi!");
        java.lang.String str14 = element9.toString();
        org.jsoup.nodes.Element element16 = element9.prependText("hi!.<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element9.addClass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.lastElementSibling();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        java.lang.String str6 = element2.tagName();
        java.lang.String str8 = element2.attr("hi!");
        org.jsoup.nodes.Element element10 = element2.removeClass("<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element2.html("<hi! class=\"\">\n &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element2.firstElementSibling();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.select.Elements elements3 = element1.parents();
        org.jsoup.nodes.Node node4 = element1.nextSibling();
        org.jsoup.nodes.Element element6 = element1.addClass("<hi!></hi!>");
        org.jsoup.parser.Tag tag7 = element1.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element10.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = element10.attributes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag7, "hi!", attributes13);
        java.lang.String str15 = element14.className();
        org.jsoup.nodes.Element element16 = element14.clone();
        org.jsoup.nodes.Node node17 = element14.root();
        org.jsoup.select.Elements elements19 = element14.getElementsMatchingText("<hi! class=\"\"></hi!>");
        java.lang.Integer int20 = element14.elementSiblingIndex();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element23 = element22.empty();
        org.jsoup.nodes.Element element24 = element23.empty();
        org.jsoup.nodes.Element element26 = element23.prepend("");
        org.jsoup.select.Elements elements27 = element23.siblingElements();
        org.jsoup.nodes.Element element29 = element23.appendText("hi!");
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueEnding("<<hi! class=\"hi!\"></hi!>></<hi! class=\"hi!\"></hi!>>", "<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element34 = element29.tagName("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = element34.childNodes();
        java.util.Set<java.lang.String> strSet36 = element34.classNames();
        org.jsoup.nodes.Element element37 = element14.classNames(strSet36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element37.firstElementSibling();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Node node4 = element1.root();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Element element10 = element8.tagName("hi!");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.nodes.Node node12 = element10.nextSibling();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element18 = element14.tagName("hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element14.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Element element25 = element10.classNames((java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = element1.equals((java.lang.Object) strSet22);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = element1.childNodesCopy();
        org.jsoup.select.Elements elements30 = element1.getElementsByAttributeValue("<hi! class=\"<hi! class=&quot;hi!&quot;></hi!> \"></hi!>", "<hi! class=\"hi!\"></hi!>");
        org.jsoup.nodes.Element element33 = element1.attr("&lt;hi! class=\"\"&gt;&lt;/hi!&gt;", "<<hi!></hi!>></<hi!></hi!>>");
        org.jsoup.nodes.Element element35 = element33.removeClass("<hi! class=\"<hi! class=&quot;<hi!></hi!>&quot; value=&quot;hi!&quot;></hi!>\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element37 = element35.appendText("<hi! class=\"<hi!></hi!> hi!\" value=\"hi!\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element39 = element35.wrap("<<hi!.<hi!></hi!>></hi!.<hi!></hi!>>></<hi!.<hi!></hi!>></hi!.<hi!></hi!>>>");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements6 = element2.siblingElements();
        org.jsoup.nodes.Element element8 = element2.appendText("hi!");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element10.clone();
        boolean boolean14 = element2.equals((java.lang.Object) element10);
        boolean boolean15 = element2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element2.lastElementSibling();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements3 = element1.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element5 = element1.tagName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Element element8 = element5.tagName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.firstElementSibling();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.nodes.Element element2 = element1.empty();
        org.jsoup.nodes.Element element3 = element2.empty();
        org.jsoup.nodes.Element element5 = element2.prepend("");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("hi!");
        org.jsoup.nodes.Element element13 = element9.tagName("hi!");
        java.lang.String str14 = element9.toString();
        org.jsoup.nodes.Element element15 = element5.appendChild((org.jsoup.nodes.Node) element9);
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.jsoup.select.Elements elements17 = element15.getAllElements();
        java.lang.String str18 = element15.html();
        java.lang.String str19 = element15.ownText();
        org.jsoup.nodes.Element element22 = element15.attr("<>>", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element15.wrap("<hi! <hi!>\n <hi!>\n  <hi!></hi!>\n </hi!>\n</hi!>>\n &lt;&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;&lt;/&lt;hi! class=\"hi!\"&gt;&lt;/hi!&gt;&gt;\n <hi! class=\"\"> \n  <hi!></hi!> \n </hi!>\n</hi!>");
    }
}

