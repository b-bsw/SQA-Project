package org.apache.commons.codec.language;

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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H", false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("", "A111111111");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("", "AA11111111", false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("", "4", false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!H");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("4hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "", true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str27 = doubleMetaphone0.encode("hi!H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        int int15 = doubleMetaphone0.maxCodeLen;
        int int16 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi! i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("", "#h");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "A111111111", true);
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "##a", "1111111111");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HIHH", true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray30);
        java.lang.Object obj33 = doubleMetaphone22.encode((java.lang.Object) "hi!");
        doubleMetaphone22.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult37 = doubleMetaphone22.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult37.append("", "hi!");
        doubleMetaphoneResult37.append('H');
        doubleMetaphoneResult37.append("hi!");
        doubleMetaphoneResult37.appendAlternate("");
        doubleMetaphoneResult37.appendAlternate("H");
        java.lang.Object obj49 = doubleMetaphone0.encode((java.lang.Object) "H");
        boolean boolean53 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "A", false);
        int int56 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        java.lang.String str59 = doubleMetaphone0.doubleMetaphone("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean62 = doubleMetaphone0.isDoubleMetaphoneEqual("", "Hhi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.String str6 = doubleMetaphone0.encode("");
        int int7 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HIHHI", true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        int int17 = doubleMetaphone0.maxCodeLen;
        int int18 = doubleMetaphone0.maxCodeLen;
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!H hi!\000", "\000hi!H hi!");
        char char24 = doubleMetaphone0.charAt(" A111111111A111111111", 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("", "Hhi!HH", true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "AA11111111", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "HIAA");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HI", "A");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIH", "4");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("HIHHI");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "a", false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "AA11111111", true);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "4hH");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "H", "HIH");
        int int21 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!H hi!\000");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.setMaxCodeLen((-1));
        char char18 = doubleMetaphone0.charAt("AA11111111", (int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        char char23 = doubleMetaphone0.charAt("", (int) 'H');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!Ha");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "H");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult32 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
        doubleMetaphone0.maxCodeLen = (short) 100;
        java.lang.String str37 = doubleMetaphone0.doubleMetaphone("hi!HH", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean40 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HII");
    }
}

