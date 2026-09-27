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
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!", false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\u6800\u6900\u2100");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\u6800\u6900\u2100");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\377\375", true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) "H");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\u4800\u6100");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\u6148\000");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        java.lang.String str7 = doubleMetaphone0.encode("\u0164\u0a01\ufffd");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!a\000\u6148\000", "\000");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd", false);
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000h\000i\000!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\u0164\u0a01\ufffd\u6869");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\u3f3f");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", true);
        char char6 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("\u3f3f", true);
        char char14 = doubleMetaphone0.charAt("\000\376\377\000h\000i\000!\000a", (int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\ufffd\ufffda", true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("i ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\000\000h\000\000\000i\000\000\000!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\ufffd", "\u6869\u2161");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("i ", false);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "\u4800\u6100");
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\u3f3f\u3f3fhi!a", "hi!\000", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\u0164\u0a01\ufffd\u6869");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str6 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.encode("h\000i\000!\000");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "aH");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str16 = doubleMetaphone0.encode("\u3f3fhi!a");
        char char19 = doubleMetaphone0.charAt("\376\377\000h\000i\000!", (int) '\ufffd');
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("hi!i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\u3f3f???");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("hi!a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        char char12 = doubleMetaphone0.charAt("\u6148\000", 10);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\u0164\u0a01\ufffd\000", "\u6869");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("??", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\ufffdh", false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str5 = doubleMetaphone0.encode("\u6800\u6900\u2100");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "\001d\n\001\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\ufffd", false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\000\000\377\375\000\000\377\375\000\000\377\375");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        char char10 = doubleMetaphone0.charAt("A", (int) (short) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\ufffd\ufffd\000H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str16 = doubleMetaphone0.encode("\u3f3fhi!a");
        char char19 = doubleMetaphone0.charAt("\376\377\000h\000i\000!", (int) '\ufffd');
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("\ufeff\u3f3f\ufffd", false);
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("???", "\u3f3f\u3f00", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\000h\000i\000!\000\000", false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", 4);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!\000", "hi!a", false);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        int int15 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\346\205\210", false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("hi!a");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\ufffd", false);
        java.lang.String str8 = doubleMetaphone0.encode("i ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\377\375h\000i\000!\000a\000");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", (int) (short) 1);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\377\375");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\346\205\210", "i#", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str21 = doubleMetaphone18.doubleMetaphone("", false);
        int int22 = doubleMetaphone18.getMaxCodeLen();
        int int23 = doubleMetaphone18.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone18.new DoubleMetaphoneResult((int) '\000');
        char char28 = doubleMetaphone18.charAt("A", (int) (short) 100);
        java.lang.String str30 = doubleMetaphone18.doubleMetaphone("\ufffd\ufffd\000H");
        java.lang.String str32 = doubleMetaphone18.encode("\u6148");
        java.lang.Object obj33 = doubleMetaphone0.encode((java.lang.Object) "\u6148");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean37 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\ufffd\ufffd\ufffd\ufffd\000\000h\000\000\000i\000\000\000!\000", true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\ufffd\ufffd\000H");
    }
}

