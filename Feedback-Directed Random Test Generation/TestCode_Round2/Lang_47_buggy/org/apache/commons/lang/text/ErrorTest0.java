package org.apache.commons.lang.text;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder0.ensureCapacity(1);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append((double) 1);
        java.lang.String str13 = strBuilder11.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.appendFixedWidthPadRight(100, 0, '#');
        java.lang.StringBuffer stringBuffer19 = strBuilder18.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder4.append(stringBuffer19);
        java.lang.String str22 = strBuilder4.leftString(65);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding(0, '4');
        int int29 = strBuilder26.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.insert((int) (byte) 0, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.append((double) 1);
        java.lang.String str40 = strBuilder38.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder33.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder33.appendFixedWidthPadRight(100, 0, '#');
        java.lang.StringBuffer stringBuffer46 = strBuilder45.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder32.appendln(stringBuffer46);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.appendPadding(0, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher53 = null;
        int int55 = strBuilder52.indexOf(strMatcher53, (int) (byte) 10);
        int int56 = strBuilder52.size;
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder32.insert((int) (short) 0, (java.lang.Object) strBuilder52);
        char[] charArray60 = strBuilder52.toCharArray(0, (int) (byte) 0);
        char[] charArray61 = strBuilder4.getChars(charArray60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer19 and stringBuffer46", (stringBuffer19.compareTo(stringBuffer46) == 0) == stringBuffer19.equals(stringBuffer46));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder0.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder0.appendln("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.insert((int) (byte) 0, (int) (short) -1);
        java.lang.StringBuffer stringBuffer13 = strBuilder9.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.appendFixedWidthPadRight(0, 1, ' ');
        boolean boolean21 = strBuilder15.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding(0, '4');
        int int28 = strBuilder25.lastIndexOf("", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.insert((int) (byte) 0, "");
        boolean boolean33 = strBuilder31.startsWith("1.0");
        int int35 = strBuilder31.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.append((double) 1);
        java.lang.String str45 = strBuilder43.rightString((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder38.append((java.lang.Object) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder38.appendFixedWidthPadRight(100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.appendSeparator("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder53.appendln("", 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder53.appendln("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.insert((int) (byte) 0, (int) (short) -1);
        java.lang.StringBuffer stringBuffer66 = strBuilder62.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder52.append(stringBuffer66);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder31.append(stringBuffer66, 5, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder16.appendln(stringBuffer66);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder9.append(stringBuffer66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer66", (stringBuffer13.compareTo(stringBuffer66) == 0) == stringBuffer13.equals(stringBuffer66));
    }
}

