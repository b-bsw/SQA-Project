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
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.wrap("hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE html>");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node9.siblingNodes();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.wrap("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        int int12 = node7.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node7.siblingNodes();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        int int12 = node7.siblingIndex();
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node7.siblingNodes();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node9.wrap("#doctype");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        int int6 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str6 = documentType4.absUrl("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node7.siblingNodes();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html>");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        int int13 = documentType4.siblingIndex();
        boolean boolean15 = documentType4.hasAttr("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str13 = documentType9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType9.siblingNodes();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = node7.attr("hi!", "#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("<!DOCTYPE html>");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.wrap("<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node11 = documentType4.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        org.jsoup.nodes.Node node32 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = node32.previousSibling();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.siblingNodes();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html>");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        node7.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node7.siblingNodes();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        org.jsoup.nodes.Node node23 = documentType21.parent();
        org.jsoup.nodes.Node node24 = documentType21.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType21.childNodes();
        boolean boolean26 = node11.equals((java.lang.Object) documentType21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = documentType21.wrap("<!DOCTYPE html>");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        java.lang.String str15 = node14.baseUri();
        node14.setBaseUri("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node14.siblingNodes();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        java.lang.String str17 = documentType11.toString();
        boolean boolean18 = documentType4.equals((java.lang.Object) documentType11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = documentType4.wrap("hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        int int10 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        java.lang.String str5 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = node7.attr("hi!", "#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node8.previousSibling();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        java.lang.String str7 = documentType4.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<!DOCTYPE html>");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = node5.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.siblingNodes();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node9.previousSibling();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        node9.setBaseUri("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node9.siblingNodes();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        java.lang.String str17 = node11.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node11.wrap("#doctype");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node12 = documentType9.attr("hi!", "hi!");
        org.jsoup.nodes.Node node14 = node12.removeAttr("hi!");
        java.lang.String str16 = node14.absUrl("hi!");
        node14.setBaseUri("");
        org.jsoup.nodes.Node node20 = node14.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node14.childNodes();
        boolean boolean22 = documentType4.equals((java.lang.Object) node14);
        org.jsoup.nodes.Attributes attributes23 = node14.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node14.siblingNodes();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        int int10 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str7 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node9.siblingNodes();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.siblingNodes();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.previousSibling();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str11 = documentType4.outerHtml();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node11.previousSibling();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        int int10 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node7.previousSibling();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        boolean boolean12 = documentType4.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.previousSibling();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node18 = documentType15.attr("hi!", "hi!");
        org.jsoup.nodes.Node node20 = node18.removeAttr("hi!");
        node20.setBaseUri("");
        boolean boolean23 = documentType4.equals((java.lang.Object) node20);
        org.jsoup.nodes.Node node24 = node20.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node20.siblingNodes();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        int int12 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.wrap("#doctype");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str10 = node7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node7.siblingNodes();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        boolean boolean12 = documentType4.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node14.previousSibling();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        org.jsoup.nodes.Node node12 = node9.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node9.previousSibling();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        int int12 = documentType4.siblingIndex();
        java.lang.String str13 = documentType4.toString();
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.siblingNodes();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = node15.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node15.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.Node node17 = node11.clone();
        int int18 = node17.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node17.previousSibling();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        org.jsoup.nodes.Node node20 = documentType17.parent();
        org.jsoup.nodes.Node node21 = documentType17.nextSibling();
        boolean boolean23 = documentType17.hasAttr("hi!");
        boolean boolean24 = node11.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node25 = node11.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node11.siblingNodes();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes17 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = documentType4.previousSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        java.lang.String str15 = node14.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node14.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.siblingNodes();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str6 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        java.lang.String str17 = documentType11.toString();
        boolean boolean18 = documentType4.equals((java.lang.Object) documentType11);
        org.jsoup.nodes.Node node19 = documentType4.parent();
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = documentType4.previousSibling();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node13 = node7.nextSibling();
        org.jsoup.nodes.Attributes attributes14 = node7.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node7.siblingNodes();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        org.jsoup.nodes.Node node32 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList33 = documentType4.siblingNodes();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node9.siblingNodes();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node9.previousSibling();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        java.lang.String str11 = documentType4.absUrl("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = node15.outerHtml();
        org.jsoup.nodes.Node node17 = node15.nextSibling();
        org.jsoup.nodes.Attributes attributes18 = node15.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node15.siblingNodes();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node7.siblingNodes();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str8 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node18 = documentType15.attr("hi!", "hi!");
        org.jsoup.nodes.Node node20 = node18.removeAttr("hi!");
        boolean boolean22 = node18.equals((java.lang.Object) 100);
        org.jsoup.nodes.Document document23 = node18.ownerDocument();
        boolean boolean24 = documentType4.equals((java.lang.Object) node18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node18.siblingNodes();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        int int12 = node7.siblingIndex();
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        org.jsoup.nodes.Node node14 = node7.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node7.siblingNodes();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        org.jsoup.nodes.Node node13 = node9.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node9.previousSibling();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node18 = documentType15.attr("hi!", "hi!");
        org.jsoup.nodes.Node node20 = node18.removeAttr("hi!");
        node20.setBaseUri("");
        boolean boolean23 = documentType4.equals((java.lang.Object) node20);
        java.lang.String str24 = node20.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node20.siblingNodes();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node10 = node8.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = node10.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node10.siblingNodes();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        java.lang.String str13 = node7.attr("hi!");
        org.jsoup.nodes.Document document14 = node7.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node7.wrap("hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        java.lang.String str17 = documentType11.toString();
        boolean boolean18 = documentType4.equals((java.lang.Object) documentType11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = documentType11.wrap("#doctype");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str10 = node7.toString();
        java.lang.String str11 = node7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node7.previousSibling();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        boolean boolean12 = documentType4.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        int int12 = documentType4.siblingIndex();
        java.lang.String str13 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node11 = documentType4.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        int int12 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        java.lang.String str14 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.previousSibling();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.String str6 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.Node node11 = node9.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node11.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        documentType4.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        org.jsoup.nodes.Node node16 = documentType13.parent();
        org.jsoup.nodes.Node node17 = documentType13.nextSibling();
        boolean boolean19 = documentType13.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = documentType13.clone();
        boolean boolean21 = documentType4.equals((java.lang.Object) node20);
        node20.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node20.siblingNodes();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.lang.String str11 = node9.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node9.siblingNodes();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node12 = documentType9.attr("hi!", "hi!");
        org.jsoup.nodes.Node node14 = node12.removeAttr("hi!");
        java.lang.String str16 = node14.absUrl("hi!");
        node14.setBaseUri("");
        org.jsoup.nodes.Node node20 = node14.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node14.childNodes();
        boolean boolean22 = documentType4.equals((java.lang.Object) node14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = documentType4.wrap("hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        org.jsoup.nodes.Node node12 = node9.parent();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str19 = documentType17.attr("");
        java.lang.String str21 = documentType17.attr("hi!");
        java.lang.String str22 = documentType17.toString();
        java.lang.String str23 = documentType17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType17.childNodes();
        org.jsoup.nodes.Node node25 = documentType17.nextSibling();
        java.lang.String str26 = documentType17.outerHtml();
        boolean boolean27 = node9.equals((java.lang.Object) str26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node9.siblingNodes();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.wrap("<!DOCTYPE html>");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        int int11 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        org.jsoup.nodes.Node node23 = documentType21.parent();
        org.jsoup.nodes.Node node24 = documentType21.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType21.childNodes();
        boolean boolean26 = node11.equals((java.lang.Object) documentType21);
        org.jsoup.nodes.Attributes attributes27 = documentType21.attributes();
        documentType21.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean31 = documentType21.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = documentType21.previousSibling();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.nodeName();
        java.lang.String str7 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node11.wrap("<!DOCTYPE html>");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.Node node13 = node11.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node11.siblingNodes();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        documentType4.setBaseUri("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = documentType4.wrap("hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = node8.siblingIndex();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node8.previousSibling();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = node15.outerHtml();
        org.jsoup.nodes.Node node17 = node15.nextSibling();
        org.jsoup.nodes.Attributes attributes18 = node15.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node15.previousSibling();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str6 = documentType4.absUrl("<!DOCTYPE html>");
        int int7 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype", "#doctype");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        java.lang.String str17 = node11.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node11.wrap("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.siblingNodes();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        java.lang.String str6 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.Node node13 = node11.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node12 = documentType9.attr("hi!", "hi!");
        org.jsoup.nodes.Node node14 = node12.removeAttr("hi!");
        java.lang.String str16 = node14.absUrl("hi!");
        node14.setBaseUri("");
        org.jsoup.nodes.Node node20 = node14.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node14.childNodes();
        boolean boolean22 = documentType4.equals((java.lang.Object) node14);
        org.jsoup.nodes.Attributes attributes23 = node14.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = node14.wrap("#doctype");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        java.lang.String str17 = documentType11.toString();
        boolean boolean18 = documentType4.equals((java.lang.Object) documentType11);
        org.jsoup.nodes.Node node19 = documentType4.parent();
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType4.siblingNodes();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        int int12 = node9.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.siblingNodes();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node9.siblingNodes();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str7 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.siblingNodes();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodes();
        org.jsoup.nodes.Node node15 = node12.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node12.wrap("<!DOCTYPE html hi!\">");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        org.jsoup.nodes.Node node20 = documentType17.parent();
        org.jsoup.nodes.Node node21 = documentType17.nextSibling();
        boolean boolean23 = documentType17.hasAttr("hi!");
        boolean boolean24 = node11.equals((java.lang.Object) "hi!");
        java.lang.String str25 = node11.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node11.siblingNodes();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.wrap("hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "#doctype");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        java.lang.String str11 = documentType4.absUrl("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.siblingNodes();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Node node14 = documentType9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = node14.removeAttr("hi!");
        boolean boolean18 = node16.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document19 = node16.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node16.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        int int11 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        org.jsoup.nodes.Node node23 = documentType21.parent();
        org.jsoup.nodes.Node node24 = documentType21.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType21.childNodes();
        boolean boolean26 = node11.equals((java.lang.Object) documentType21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = node11.wrap("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "hi!", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "", "<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node18 = documentType15.attr("hi!", "hi!");
        org.jsoup.nodes.Node node20 = node18.removeAttr("hi!");
        node20.setBaseUri("");
        boolean boolean23 = documentType4.equals((java.lang.Object) node20);
        java.lang.String str24 = node20.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = node20.previousSibling();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        int int10 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str18 = documentType16.attr("");
        int int19 = documentType16.siblingIndex();
        boolean boolean20 = node11.equals((java.lang.Object) documentType16);
        java.lang.String str21 = documentType16.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = documentType16.previousSibling();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.lang.String str6 = documentType4.baseUri();
        java.lang.String str7 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = node7.attr("hi!", "#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        documentType4.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        org.jsoup.nodes.Node node16 = documentType13.parent();
        org.jsoup.nodes.Node node17 = documentType13.nextSibling();
        boolean boolean19 = documentType13.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = documentType13.clone();
        boolean boolean21 = documentType4.equals((java.lang.Object) node20);
        node20.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = node20.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node15.previousSibling();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str9 = documentType4.nodeName();
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node13.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.Node node15 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.siblingNodes();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        int int13 = node7.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node7.siblingNodes();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node11 = node7.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node7.previousSibling();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.baseUri();
        java.lang.String str14 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.previousSibling();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        int int12 = node7.siblingIndex();
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        org.jsoup.nodes.Node node14 = node7.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node7.childNodes();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document21 = documentType20.ownerDocument();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Node node24 = documentType20.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node25 = documentType20.clone();
        java.lang.String str26 = documentType20.baseUri();
        boolean boolean28 = documentType20.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node30 = documentType20.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        boolean boolean31 = node7.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node32 = node7.previousSibling();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "#doctype");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node15.previousSibling();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "", "", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node7.previousSibling();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        int int13 = documentType4.siblingIndex();
        java.lang.String str14 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.previousSibling();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        int int13 = documentType4.siblingIndex();
        int int14 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean21 = documentType19.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType19.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean24 = documentType4.equals((java.lang.Object) node23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = node23.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str8 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node8.previousSibling();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document19 = documentType18.ownerDocument();
        org.jsoup.nodes.Attributes attributes20 = documentType18.attributes();
        org.jsoup.nodes.Node node23 = documentType18.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType18.childNodes();
        boolean boolean25 = documentType4.equals((java.lang.Object) documentType18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = documentType18.wrap("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "#doctype");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE html hi!\">");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        int int11 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("");
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        boolean boolean8 = documentType4.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "hi!", "<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        java.lang.String str18 = node16.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str20 = node16.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node16.previousSibling();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = node9.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.previousSibling();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document10 = documentType9.ownerDocument();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.nodes.Node node14 = documentType9.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType9.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType9.childNodes();
        boolean boolean17 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str19 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = documentType4.previousSibling();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("#doctype");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.baseUri();
        org.jsoup.nodes.Node node17 = documentType4.parent();
        java.lang.String str18 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = documentType4.wrap("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str11 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.Document document13 = node9.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node9.previousSibling();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        int int13 = documentType4.siblingIndex();
        java.lang.String str14 = documentType4.outerHtml();
        java.lang.String str15 = documentType4.outerHtml();
        java.lang.String str17 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = documentType4.previousSibling();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node12 = documentType9.attr("hi!", "hi!");
        org.jsoup.nodes.Node node14 = node12.removeAttr("hi!");
        java.lang.String str16 = node14.absUrl("hi!");
        node14.setBaseUri("");
        org.jsoup.nodes.Node node20 = node14.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node14.childNodes();
        boolean boolean22 = documentType4.equals((java.lang.Object) node14);
        org.jsoup.nodes.Attributes attributes23 = node14.attributes();
        java.lang.String str25 = node14.attr("");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int31 = documentType30.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType30.childNodes();
        java.lang.String str33 = documentType30.baseUri();
        java.lang.String str34 = documentType30.baseUri();
        java.lang.String str36 = documentType30.absUrl("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node37 = documentType30.nextSibling();
        org.jsoup.nodes.Node node38 = documentType30.parent();
        documentType30.setBaseUri("hi!");
        boolean boolean41 = node14.equals((java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList42 = node14.siblingNodes();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.wrap("hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        java.lang.String str17 = node11.toString();
        java.lang.String str18 = node11.outerHtml();
        org.jsoup.nodes.Node node20 = node11.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node20.siblingNodes();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node15.previousSibling();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.lang.Class<?> wildcardClass18 = documentType16.getClass();
        boolean boolean19 = documentType4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = documentType4.outerHtml();
        java.lang.String str21 = documentType4.toString();
        org.jsoup.nodes.Node node24 = documentType4.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node24.siblingNodes();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        boolean boolean11 = node9.hasAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str12 = node9.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.siblingNodes();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        int int8 = node7.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.previousSibling();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node9.previousSibling();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        org.jsoup.nodes.Node node20 = documentType17.parent();
        org.jsoup.nodes.Node node21 = documentType17.nextSibling();
        boolean boolean23 = documentType17.hasAttr("hi!");
        boolean boolean24 = node11.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node25 = node11.nextSibling();
        org.jsoup.nodes.Node node28 = node11.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str29 = node28.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node30 = node28.previousSibling();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        org.jsoup.nodes.Node node23 = documentType21.parent();
        org.jsoup.nodes.Node node24 = documentType21.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType21.childNodes();
        boolean boolean26 = node11.equals((java.lang.Object) documentType21);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType21.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = documentType21.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str9 = node8.outerHtml();
        node8.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node8.siblingNodes();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.lang.Class<?> wildcardClass18 = documentType16.getClass();
        boolean boolean19 = documentType4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = documentType4.outerHtml();
        org.jsoup.nodes.Node node21 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        int int6 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        int int12 = documentType4.siblingIndex();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.previousSibling();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node8.previousSibling();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node13 = node11.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node11.siblingNodes();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node8 = documentType4.parent();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.Node node17 = node11.clone();
        java.lang.String str18 = node11.toString();
        int int19 = node11.siblingIndex();
        java.lang.String str21 = node11.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = node11.previousSibling();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        int int12 = node7.siblingIndex();
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        org.jsoup.nodes.Node node14 = node7.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node7.childNodes();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document21 = documentType20.ownerDocument();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Node node24 = documentType20.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node25 = documentType20.clone();
        java.lang.String str26 = documentType20.baseUri();
        boolean boolean28 = documentType20.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node30 = documentType20.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        boolean boolean31 = node7.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        int int32 = node7.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node7.siblingNodes();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node11 = documentType4.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.Node node17 = node11.clone();
        java.lang.String str18 = node11.toString();
        int int19 = node11.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node11.siblingNodes();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        int int13 = node7.siblingIndex();
        org.jsoup.nodes.Node node16 = node7.attr("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node16.previousSibling();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node16 = node11.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node11.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node13 = node7.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str15 = node7.attr("");
        java.lang.String str16 = node7.baseUri();
        org.jsoup.nodes.Node node18 = node7.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node18.previousSibling();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html>");
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str12 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str5 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("#doctype");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        org.jsoup.nodes.Node node12 = documentType9.parent();
        documentType9.setBaseUri("");
        java.lang.String str15 = documentType9.toString();
        boolean boolean17 = documentType9.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node20 = documentType9.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str21 = node20.outerHtml();
        org.jsoup.nodes.Node node22 = node20.parent();
        boolean boolean23 = documentType4.equals((java.lang.Object) node20);
        org.jsoup.nodes.Node node25 = node20.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = node20.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("");
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = documentType4.wrap("<!DOCTYPE html hi!\">");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        java.lang.String str17 = documentType11.toString();
        boolean boolean18 = documentType4.equals((java.lang.Object) documentType11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
        java.lang.String str12 = node9.attr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.siblingNodes();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str8 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = node6.previousSibling();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str33 = documentType16.absUrl("hi!");
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str40 = documentType38.attr("");
        int int41 = documentType38.siblingIndex();
        org.jsoup.nodes.Node node42 = documentType38.nextSibling();
        org.jsoup.nodes.Node node45 = documentType38.attr("hi!", "hi!");
        boolean boolean46 = documentType16.equals((java.lang.Object) node45);
        int int47 = documentType16.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node48 = documentType16.previousSibling();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = node7.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
        node15.setBaseUri("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node15.previousSibling();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        boolean boolean11 = node9.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = node9.nextSibling();
        org.jsoup.nodes.Node node14 = node9.removeAttr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node9.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        node7.setBaseUri("");
        node7.setBaseUri("<!DOCTYPE html #doctype\">");
        java.lang.String str20 = node7.outerHtml();
        org.jsoup.nodes.Node node21 = node7.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node23 = node7.wrap("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.String str15 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        java.lang.String str8 = node6.baseUri();
        org.jsoup.nodes.Attributes attributes9 = node6.attributes();
        org.jsoup.nodes.Node node10 = node6.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node6.previousSibling();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        java.lang.String str18 = node11.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node19 = node11.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.siblingNodes();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.lang.String str8 = node7.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node7.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.toString();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("#doctype");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        java.lang.String str12 = node9.toString();
        java.lang.String str13 = node9.outerHtml();
        org.jsoup.nodes.Node node14 = node9.nextSibling();
        java.lang.String str16 = node9.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node9.previousSibling();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str6 = documentType4.attr("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.lang.Class<?> wildcardClass18 = documentType16.getClass();
        boolean boolean19 = documentType4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = documentType4.outerHtml();
        org.jsoup.nodes.Node node21 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = documentType4.previousSibling();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "#doctype", "<!DOCTYPE html hi!\">", "");
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        documentType4.setBaseUri("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = node7.attr("hi!", "#doctype");
        java.lang.String str12 = node10.absUrl("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node10.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "#doctype", "", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.toString();
        int int9 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node13 = node7.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node7.siblingNodes();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str6 = documentType4.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node13 = node11.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node13.previousSibling();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.nodeName();
        java.lang.String str7 = documentType4.nodeName();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node9.childNodes();
        org.jsoup.nodes.Document document17 = node9.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node9.previousSibling();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE html>", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.siblingNodes();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        java.lang.String str8 = node6.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node6.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str6 = documentType4.absUrl("<!DOCTYPE html>");
        int int7 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.String str9 = documentType4.outerHtml();
        int int10 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        int int12 = documentType4.siblingIndex();
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        boolean boolean14 = documentType4.hasAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.siblingNodes();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = node9.previousSibling();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str16 = documentType4.baseUri();
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.siblingNodes();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        int int8 = node7.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node7.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "hi!", "<!DOCTYPE html #doctype\">");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.nodeName();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.siblingNodes();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node13 = node7.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str15 = node7.attr("");
        org.jsoup.nodes.Document document16 = node7.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = node7.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        int int12 = node9.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node9.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str15 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.siblingNodes();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node13.previousSibling();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.lang.String str10 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        int int13 = documentType4.siblingIndex();
        int int14 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.siblingNodes();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = node9.parent();
        org.jsoup.nodes.Node node13 = node9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node13.previousSibling();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str33 = documentType16.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node35 = documentType16.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str14 = node9.absUrl("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node9.siblingNodes();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        documentType4.setBaseUri("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        documentType4.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.lang.String str8 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "#doctype", "", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "hi!", "<!DOCTYPE html #doctype\">");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "#doctype", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.toString();
        java.lang.String str8 = documentType4.toString();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.String str11 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str18 = documentType16.attr("");
        int int19 = documentType16.siblingIndex();
        boolean boolean20 = node11.equals((java.lang.Object) documentType16);
        int int21 = node11.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = node11.previousSibling();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        org.jsoup.nodes.Node node14 = node7.clone();
        java.lang.String str15 = node14.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = node14.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        org.jsoup.nodes.Node node18 = documentType11.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str25 = documentType23.attr("");
        int int26 = documentType23.siblingIndex();
        boolean boolean27 = node18.equals((java.lang.Object) documentType23);
        boolean boolean28 = documentType4.equals((java.lang.Object) boolean27);
        boolean boolean30 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType4.siblingNodes();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        java.lang.String str14 = node7.baseUri();
        node7.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str18 = node7.absUrl("hi!");
        org.jsoup.nodes.Document document19 = node7.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = node7.previousSibling();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.previousSibling();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        documentType4.setBaseUri("#doctype");
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = node14.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "<!DOCTYPE html>");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = node15.outerHtml();
        org.jsoup.nodes.Node node17 = node15.nextSibling();
        org.jsoup.nodes.Attributes attributes18 = node15.attributes();
        node15.setBaseUri("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node15.previousSibling();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node13 = node7.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = node7.previousSibling();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str6 = documentType4.attr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html #doctype\">");
        java.lang.String str12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = node10.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        boolean boolean12 = documentType4.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document18 = documentType4.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = documentType4.previousSibling();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.lang.Class<?> wildcardClass18 = documentType16.getClass();
        boolean boolean19 = documentType4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = documentType4.outerHtml();
        java.lang.String str21 = documentType4.toString();
        org.jsoup.nodes.Node node22 = documentType4.clone();
        org.jsoup.nodes.Node node23 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType4.siblingNodes();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        java.lang.String str12 = node9.toString();
        java.lang.String str13 = node9.outerHtml();
        org.jsoup.nodes.Node node14 = node9.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str20 = documentType19.nodeName();
        java.lang.String str21 = documentType19.nodeName();
        boolean boolean22 = node9.equals((java.lang.Object) documentType19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType19.siblingNodes();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node9.childNodes();
        org.jsoup.nodes.Document document17 = node9.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node9.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str16 = node9.baseUri();
        java.lang.String str17 = node9.toString();
        java.lang.String str18 = node9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node9.previousSibling();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        org.jsoup.nodes.Node node20 = documentType17.parent();
        org.jsoup.nodes.Node node21 = documentType17.nextSibling();
        boolean boolean23 = documentType17.hasAttr("hi!");
        boolean boolean24 = node11.equals((java.lang.Object) "hi!");
        java.lang.String str25 = node11.toString();
        int int26 = node11.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = node11.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document15 = documentType14.ownerDocument();
        documentType14.setBaseUri("#doctype");
        boolean boolean18 = documentType4.equals((java.lang.Object) "#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.wrap("<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        org.jsoup.nodes.Node node18 = documentType15.parent();
        org.jsoup.nodes.Node node19 = documentType15.nextSibling();
        boolean boolean21 = documentType15.hasAttr("hi!");
        org.jsoup.nodes.Document document22 = documentType15.ownerDocument();
        int int23 = documentType15.siblingIndex();
        org.jsoup.nodes.Node node24 = documentType15.clone();
        org.jsoup.nodes.Node node25 = documentType15.clone();
        boolean boolean26 = documentType4.equals((java.lang.Object) documentType15);
        java.lang.String str27 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        java.lang.String str17 = documentType11.toString();
        boolean boolean18 = documentType4.equals((java.lang.Object) documentType11);
        org.jsoup.nodes.Node node19 = documentType4.parent();
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        java.lang.String str23 = documentType4.absUrl("<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = documentType4.previousSibling();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node10.previousSibling();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str9 = documentType4.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        java.lang.String str14 = node13.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node13.siblingNodes();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "hi!", "<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        boolean boolean14 = documentType4.hasAttr("#doctype");
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.siblingNodes();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = node8.siblingIndex();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        int int12 = node8.siblingIndex();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        org.jsoup.nodes.Node node20 = documentType17.parent();
        documentType17.setBaseUri("");
        org.jsoup.nodes.Node node24 = documentType17.removeAttr("hi!");
        boolean boolean26 = node24.hasAttr("<!DOCTYPE html>");
        node24.setBaseUri("hi!");
        int int29 = node24.siblingIndex();
        org.jsoup.nodes.Node node30 = node24.clone();
        java.lang.String str31 = node24.toString();
        int int32 = node24.siblingIndex();
        java.lang.String str34 = node24.absUrl("hi!");
        java.lang.String str35 = node24.toString();
        boolean boolean36 = node8.equals((java.lang.Object) node24);
        org.jsoup.nodes.Node node39 = node8.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList40 = node39.siblingNodes();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.Node node17 = node11.clone();
        java.lang.String str18 = node11.toString();
        int int19 = node11.siblingIndex();
        boolean boolean21 = node11.hasAttr("");
        node11.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node25 = node11.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = node9.previousSibling();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "#doctype", "", "");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        int int11 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">", "#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        documentType4.setBaseUri("#doctype");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.String str15 = documentType4.baseUri();
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.siblingNodes();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        java.lang.String str18 = node11.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node19 = node11.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node19.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = node15.outerHtml();
        boolean boolean18 = node15.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str20 = node15.attr("<!DOCTYPE html hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node15.previousSibling();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        java.lang.String str11 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype", "#doctype");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document12 = documentType11.ownerDocument();
        org.jsoup.nodes.Attributes attributes13 = documentType11.attributes();
        org.jsoup.nodes.Node node16 = documentType11.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str17 = node16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.childNodes();
        boolean boolean19 = documentType4.equals((java.lang.Object) nodeList18);
        java.lang.String str20 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        int int11 = documentType4.siblingIndex();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str15 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node18 = documentType15.attr("hi!", "hi!");
        org.jsoup.nodes.Node node20 = node18.removeAttr("hi!");
        node20.setBaseUri("");
        boolean boolean23 = documentType4.equals((java.lang.Object) node20);
        java.lang.String str24 = node20.baseUri();
        node20.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList27 = node20.siblingNodes();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node13 = node7.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str15 = node7.attr("");
        java.lang.String str16 = node7.baseUri();
        org.jsoup.nodes.Node node18 = node7.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = node7.wrap("<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        int int12 = node7.siblingIndex();
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        org.jsoup.nodes.Node node14 = node7.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node7.childNodes();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document21 = documentType20.ownerDocument();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Node node24 = documentType20.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node25 = documentType20.clone();
        java.lang.String str26 = documentType20.baseUri();
        boolean boolean28 = documentType20.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node30 = documentType20.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        boolean boolean31 = node7.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node7.siblingNodes();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node18 = documentType15.attr("hi!", "hi!");
        org.jsoup.nodes.Node node20 = node18.removeAttr("hi!");
        node20.setBaseUri("");
        boolean boolean23 = documentType4.equals((java.lang.Object) node20);
        java.lang.String str25 = node20.absUrl("hi!");
        org.jsoup.nodes.Node node26 = node20.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = node26.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        org.jsoup.nodes.Node node17 = documentType14.parent();
        org.jsoup.nodes.Node node18 = documentType14.nextSibling();
        boolean boolean20 = documentType14.hasAttr("hi!");
        org.jsoup.nodes.Document document21 = documentType14.ownerDocument();
        int int22 = documentType14.siblingIndex();
        org.jsoup.nodes.Node node23 = documentType14.clone();
        org.jsoup.nodes.Node node24 = node23.clone();
        boolean boolean25 = documentType4.equals((java.lang.Object) node24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = node24.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
        java.lang.String str10 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "#doctype", "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "#doctype", "<!DOCTYPE html #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html>", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document12 = documentType11.ownerDocument();
        org.jsoup.nodes.Attributes attributes13 = documentType11.attributes();
        org.jsoup.nodes.Node node16 = documentType11.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str17 = node16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.childNodes();
        boolean boolean19 = documentType4.equals((java.lang.Object) node16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = documentType4.previousSibling();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str7 = documentType4.toString();
        java.lang.String str8 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node9.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.siblingNodes();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "", "", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = node6.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
        int int17 = node16.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.siblingNodes();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.String str6 = documentType4.baseUri();
        documentType4.setBaseUri("");
        java.lang.String str9 = documentType4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "hi!", "<!DOCTYPE html #doctype\">");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        int int12 = node7.siblingIndex();
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        org.jsoup.nodes.Node node14 = node7.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node7.childNodes();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document21 = documentType20.ownerDocument();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Node node24 = documentType20.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node25 = documentType20.clone();
        java.lang.String str26 = documentType20.baseUri();
        boolean boolean28 = documentType20.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node30 = documentType20.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        boolean boolean31 = node7.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str32 = node7.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node33 = node7.previousSibling();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = node9.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node24 = documentType21.attr("hi!", "hi!");
        org.jsoup.nodes.Node node26 = node24.removeAttr("hi!");
        java.lang.String str28 = node26.absUrl("hi!");
        node26.setBaseUri("");
        org.jsoup.nodes.Node node32 = node26.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node26.childNodes();
        boolean boolean34 = documentType16.equals((java.lang.Object) node26);
        boolean boolean35 = node11.equals((java.lang.Object) documentType16);
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int41 = documentType40.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType40.childNodes();
        int int43 = documentType40.siblingIndex();
        java.lang.String str44 = documentType40.baseUri();
        boolean boolean45 = node11.equals((java.lang.Object) documentType40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node46 = documentType40.previousSibling();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.siblingNodes();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        documentType4.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        org.jsoup.nodes.Node node16 = documentType13.parent();
        org.jsoup.nodes.Node node17 = documentType13.nextSibling();
        boolean boolean19 = documentType13.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = documentType13.clone();
        boolean boolean21 = documentType4.equals((java.lang.Object) node20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node20.siblingNodes();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        java.lang.String str14 = documentType4.outerHtml();
        java.lang.String str15 = documentType4.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        java.lang.String str18 = node16.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str20 = node16.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node16.siblingNodes();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = documentType4.previousSibling();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str33 = documentType16.absUrl("hi!");
        documentType16.setBaseUri("<!DOCTYPE html>");
        java.lang.String str36 = documentType16.outerHtml();
        org.jsoup.nodes.Node node37 = documentType16.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node39 = node37.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">\">");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = node12.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node24 = documentType21.attr("hi!", "hi!");
        org.jsoup.nodes.Node node26 = node24.removeAttr("hi!");
        java.lang.String str28 = node26.absUrl("hi!");
        node26.setBaseUri("");
        org.jsoup.nodes.Node node32 = node26.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node26.childNodes();
        boolean boolean34 = documentType16.equals((java.lang.Object) node26);
        boolean boolean35 = node11.equals((java.lang.Object) documentType16);
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int41 = documentType40.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType40.childNodes();
        int int43 = documentType40.siblingIndex();
        java.lang.String str44 = documentType40.baseUri();
        boolean boolean45 = node11.equals((java.lang.Object) documentType40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node47 = documentType40.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html #doctype\">");
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "", "");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.siblingNodes();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
    }
}

