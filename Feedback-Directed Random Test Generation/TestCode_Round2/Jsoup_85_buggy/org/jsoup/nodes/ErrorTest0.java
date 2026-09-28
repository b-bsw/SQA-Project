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
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute2.setKey("hi!");
        boolean boolean5 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str6 = attribute5.html();
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        attribute7.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str10 = attribute7.getKey();
        boolean boolean11 = attribute2.equals((java.lang.Object) str10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = attribute2.setValue("hi!=\"hi!\"");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        boolean boolean6 = attribute5.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute5.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute4.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute4.isDataAttribute();
        java.lang.String str8 = attribute4.html();
        attribute4.setKey("hi!=\"hi!\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = attribute4.setValue("hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute4.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str7 = attribute4.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute4.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.html();
        java.lang.String str5 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        boolean boolean8 = attribute2.equals((java.lang.Object) attribute6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute6.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        java.lang.String str5 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str9 = attribute8.html();
        org.jsoup.nodes.Attribute attribute10 = attribute8.clone();
        java.lang.String str11 = attribute10.getKey();
        org.jsoup.nodes.Attribute attribute12 = attribute10.clone();
        boolean boolean13 = attribute10.isBooleanAttribute();
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        boolean boolean6 = attribute5.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute5.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute7.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"\"");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        java.lang.String str6 = attribute4.getKey();
        java.lang.String str7 = attribute4.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute4.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        boolean boolean6 = attribute3.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute4.isDataAttribute();
        java.lang.String str8 = attribute4.html();
        attribute4.setKey("hi!=\"hi!\"=\"\"");
        boolean boolean11 = attribute4.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = attribute4.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str5 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str5 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute2.setKey("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str6 = attribute5.html();
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        attribute7.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str10 = attribute7.getKey();
        boolean boolean11 = attribute2.equals((java.lang.Object) str10);
        java.lang.String str12 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"");
        boolean boolean3 = attribute2.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes6 = attribute5.parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute5.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute2.getKey();
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str11 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.html();
        boolean boolean6 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute5.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        boolean boolean6 = attribute4.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute4.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str9 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute2.setKey("hi!");
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"\"");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute3.setValue("hi!=\"\"");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute6.isBooleanAttribute();
        java.lang.String str8 = attribute6.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute6.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        java.lang.String str6 = attribute4.getKey();
        org.jsoup.nodes.Attribute attribute7 = attribute4.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute7.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        java.lang.String str6 = attribute4.getKey();
        org.jsoup.nodes.Attribute attribute7 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute7.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.String str6 = attribute5.getValue();
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute5);
        org.jsoup.nodes.Attribute attribute8 = attribute5.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute5.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.getValue();
        java.lang.String str7 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        java.lang.String str5 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str7 = attribute4.getKey();
        boolean boolean8 = attribute4.isDataAttribute();
        java.lang.String str9 = attribute4.toString();
        java.lang.String str10 = attribute4.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = attribute4.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean8 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute2.setValue("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        boolean boolean6 = attribute5.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute5.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.html();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        org.jsoup.nodes.Attribute attribute9 = attribute7.clone();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.getValue();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!");
        java.lang.String str3 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        boolean boolean6 = attribute3.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute3.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute4.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.html();
        java.lang.String str5 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        boolean boolean4 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.getValue();
        java.lang.String str5 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"\"");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        boolean boolean6 = attribute5.isDataAttribute();
        java.lang.String str7 = attribute5.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute5.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute2.setKey("hi!");
        boolean boolean5 = attribute2.isBooleanAttribute();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        java.lang.String str8 = attribute2.html();
        java.lang.String str9 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = attribute2.setValue("");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        boolean boolean4 = attribute2.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
        java.lang.String str3 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute4.isDataAttribute();
        java.lang.String str8 = attribute4.html();
        attribute4.setKey("hi!=\"hi!\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = attribute4.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.getValue();
        java.lang.String str7 = attribute2.getKey();
        java.lang.String str8 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute4.isDataAttribute();
        java.lang.String str8 = attribute4.html();
        attribute4.setKey("hi!=\"hi!\"=\"\"");
        java.lang.String str11 = attribute4.getValue();
        java.lang.String str12 = attribute4.getKey();
        org.jsoup.nodes.Attributes attributes13 = attribute4.parent;
        attribute4.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str16 = attribute4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = attribute4.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute5.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "");
        boolean boolean6 = attribute2.equals((java.lang.Object) "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        boolean boolean8 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attribute attribute11 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str12 = attribute11.getValue();
        org.jsoup.nodes.Attribute attribute13 = attribute11.clone();
        org.jsoup.nodes.Attributes attributes14 = attribute13.parent;
        java.lang.String str15 = attribute13.getKey();
        java.lang.String str16 = attribute13.html();
        boolean boolean17 = attribute6.equals((java.lang.Object) attribute13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = attribute13.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str7 = attribute4.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute4.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getKey();
        boolean boolean8 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str10 = attribute9.getValue();
        java.lang.String str11 = attribute9.html();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "");
        java.lang.String str3 = attribute2.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute2.setKey("hi!");
        boolean boolean5 = attribute2.isBooleanAttribute();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        java.lang.String str8 = attribute7.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute7.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        boolean boolean6 = attribute5.isDataAttribute();
        java.lang.String str7 = attribute5.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute5.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        boolean boolean6 = attribute2.isDataAttribute();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        boolean boolean9 = attribute8.isDataAttribute();
        org.jsoup.nodes.Attribute attribute10 = attribute8.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = attribute8.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        org.jsoup.nodes.Attributes attributes6 = attribute4.parent;
        java.lang.String str7 = attribute4.toString();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str11 = attribute10.html();
        org.jsoup.nodes.Attribute attribute12 = attribute10.clone();
        boolean boolean13 = attribute10.isDataAttribute();
        java.lang.String str14 = attribute10.html();
        java.lang.String str15 = attribute10.getValue();
        org.jsoup.nodes.Attribute attribute16 = attribute10.clone();
        boolean boolean17 = attribute4.equals((java.lang.Object) attribute10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = attribute10.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        java.lang.String str8 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute5.setKey("hi!");
        boolean boolean8 = attribute5.isBooleanAttribute();
        java.lang.String str9 = attribute5.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute5);
        java.lang.String str11 = attribute5.toString();
        java.lang.String str12 = attribute5.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = attribute5.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"\"");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"=\"hi!=\"hi!\"=\"hi!\"\"");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = attribute3.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.html();
        boolean boolean6 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = attribute2.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = attribute2.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = attribute4.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        org.jsoup.nodes.Attributes attributes6 = attribute4.parent;
        java.lang.String str7 = attribute4.toString();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str11 = attribute10.html();
        org.jsoup.nodes.Attribute attribute12 = attribute10.clone();
        boolean boolean13 = attribute10.isDataAttribute();
        java.lang.String str14 = attribute10.html();
        java.lang.String str15 = attribute10.getValue();
        org.jsoup.nodes.Attribute attribute16 = attribute10.clone();
        boolean boolean17 = attribute4.equals((java.lang.Object) attribute10);
        java.lang.String str18 = attribute10.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = attribute10.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        boolean boolean6 = attribute2.isDataAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = attribute6.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }
}

