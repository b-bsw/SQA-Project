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
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        java.io.Writer writer12 = strBuilder6.asWriter();
        java.io.Writer writer14 = writer12.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.ensureCapacity(0);
        java.lang.StringBuffer stringBuffer22 = strBuilder21.toStringBuffer();
        java.io.Writer writer23 = writer14.append((java.lang.CharSequence) stringBuffer22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst(' ', ' ');
        boolean boolean35 = strBuilder30.contains(' ');
        java.io.Writer writer36 = strBuilder30.asWriter();
        java.io.Writer writer38 = writer36.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.ensureCapacity(0);
        java.lang.StringBuffer stringBuffer46 = strBuilder45.toStringBuffer();
        java.io.Writer writer47 = writer38.append((java.lang.CharSequence) stringBuffer46);
        java.io.Writer writer48 = writer23.append((java.lang.CharSequence) stringBuffer46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer22 and stringBuffer46", (stringBuffer22.compareTo(stringBuffer46) == 0) == stringBuffer22.equals(stringBuffer46));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        java.io.Writer writer0 = java.io.Writer.nullWriter();
        java.io.Writer writer2 = writer0.append('i');
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.ensureCapacity(0);
        java.lang.StringBuffer stringBuffer12 = strBuilder11.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder4.append(stringBuffer12);
        java.io.Writer writer14 = writer2.append((java.lang.CharSequence) stringBuffer12);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.replaceAll("hi!", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.minimizeCapacity();
        java.lang.String str30 = strBuilder24.rightString(9);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceFirst('#', '4');
        int int39 = strBuilder37.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder51.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder51.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher67 = strTokenizer66.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder61.replaceFirst(strMatcher67, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder51.deleteFirst(strMatcher67);
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strTokenizer45.setQuoteMatcher(strMatcher67);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder41.replaceFirst(strMatcher67, "");
        int int75 = strBuilder32.indexOf(strMatcher67, (int) (short) -1);
        java.lang.StringBuffer stringBuffer76 = strBuilder32.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder24.append(stringBuffer76);
        java.io.Writer writer78 = writer2.append((java.lang.CharSequence) stringBuffer76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer12 and stringBuffer76", (stringBuffer12.compareTo(stringBuffer76) == 0) == stringBuffer12.equals(stringBuffer76));
    }
}

