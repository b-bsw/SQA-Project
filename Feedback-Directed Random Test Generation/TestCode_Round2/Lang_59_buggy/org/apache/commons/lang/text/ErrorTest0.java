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
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder(".0");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean25 = strBuilder23.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder30.replaceFirst(strMatcher36, "hi!");
        int int39 = strBuilder23.lastIndexOf(strMatcher36);
        boolean boolean40 = strBuilder11.contains(strMatcher36);
        boolean boolean41 = strBuilder6.equalsIgnoreCase(strBuilder11);
        java.io.Writer writer42 = strBuilder6.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder47.append(0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder47.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder47.appendFixedWidthPadRight(5, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder47.setNewLineText("0");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.ensureCapacity(0);
        java.lang.StringBuffer stringBuffer67 = strBuilder66.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder47.append(stringBuffer67);
        java.io.Writer writer69 = writer42.append((java.lang.CharSequence) stringBuffer67);
        java.io.Writer writer71 = writer69.append('e');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder78.setNewLineText(".0");
        java.lang.StringBuffer stringBuffer81 = strBuilder80.toStringBuffer();
        java.io.Writer writer82 = writer71.append((java.lang.CharSequence) stringBuffer81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer67 and stringBuffer81", (stringBuffer67.compareTo(stringBuffer81) == 0) == stringBuffer67.equals(stringBuffer81));
    }
}

