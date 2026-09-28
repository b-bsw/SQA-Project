package org.apache.commons.lang.text;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(".0");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean15 = strBuilder13.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder20.replaceFirst(strMatcher26, "hi!");
        int int29 = strBuilder13.lastIndexOf(strMatcher26);
        boolean boolean30 = strBuilder1.contains(strMatcher26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer32.setEmptyTokenAsNull(true);
        java.util.List list35 = strTokenizer34.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder1.appendWithSeparators((java.util.Collection) list35, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteAll('i');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.ensureCapacity((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder41.append("", 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.append((float) 5L);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer57.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer57.reset(".0");
        java.lang.String[] strArray61 = strTokenizer60.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder54.appendWithSeparators((java.lang.Object[]) strArray61, "0");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder41.appendWithSeparators((java.lang.Object[]) strArray61, "!ih0.097.05###################################################0");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { ".0" });
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.appendFixedWidthPadLeft(1, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder4.appendNewLine();
        java.lang.Object obj14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append(obj14);
        int int18 = strBuilder13.indexOf('#', 144);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str21 = strBuilder20.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.replaceAll('4', 'i');
        char[] charArray27 = strBuilder20.toCharArray((int) (short) 1, (int) (byte) 1);
        boolean boolean28 = strBuilder13.equalsIgnoreCase(strBuilder20);
        boolean boolean30 = strBuilder13.startsWith("hi!\ne");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str9 = strTokenizer8.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer10.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer8.setTrimmerMatcher(strMatcher11);
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer12.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder7.appendFixedWidthPadLeft((java.lang.Object) strTokenizer13, (int) (byte) -1, 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean30 = strBuilder28.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder35.replaceFirst(strMatcher41, "hi!");
        int int44 = strBuilder28.lastIndexOf(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer13.setQuoteMatcher(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str47 = strTokenizer46.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer46.setTrimmerMatcher(strMatcher49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer46.setIgnoredChar('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer54.setEmptyTokenAsNull(true);
        java.lang.String[] strArray57 = strTokenizer56.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strTokenizer56.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer56.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strTokenizer52.setDelimiterMatcher(strMatcher60);
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer45.setDelimiterMatcher(strMatcher60);
        java.lang.String str63 = strTokenizer62.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer62.setIgnoredChar('2');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strTokenizer65);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceFirst(strMatcher10, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean26 = strBuilder24.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder31.replaceFirst(strMatcher37, "hi!");
        int int40 = strBuilder24.lastIndexOf(strMatcher37);
        int int42 = strBuilder12.indexOf(strMatcher37, (int) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strBuilder12.asTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer43.setQuoteChar('#');
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer43.setTrimmerMatcher(strMatcher46);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer47.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer48.setEmptyTokenAsNull(false);
        boolean boolean51 = strTokenizer48.hasNext();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        boolean boolean13 = strTokenizer12.hasNext();
        boolean boolean14 = strTokenizer12.hasPrevious();
        java.lang.Object obj15 = strTokenizer12.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer12.setEmptyTokenAsNull(false);
        java.lang.String str18 = strTokenizer12.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.setDelimiterChar('e');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getIgnoredMatcher();
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceAll(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.appendFixedWidthPadRight((int) (short) 100, (int) 'i', '4');
        char char18 = strBuilder12.charAt(1);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.replaceFirst(strMatcher29, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder36.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder46.replaceFirst(strMatcher52, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder36.deleteFirst(strMatcher52);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher57 = strTokenizer56.getQuoteMatcher();
        boolean boolean58 = strBuilder36.contains(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder23.deleteFirst(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder23.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder62.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = strBuilder72.asTokenizer();
        boolean boolean74 = strTokenizer73.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher75 = strTokenizer73.getIgnoredMatcher();
        int int76 = strBuilder60.indexOf(strMatcher75);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder12.deleteFirst(strMatcher75);
        java.lang.String str78 = strBuilder12.toString();
        java.lang.String str80 = strBuilder12.rightString(49);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'i' + "'", char18 == 'i');
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strMatcher75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "!ih100444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str78, "!ih100444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "4444444444444444444444444444444444444444444444444" + "'", str80, "4444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        boolean boolean10 = strBuilder8.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.minimizeCapacity();
        java.io.Writer writer12 = strBuilder11.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setLength(147);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(writer12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        int int11 = strBuilder4.indexOf(' ', (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder4.append('#');
        boolean boolean15 = strBuilder4.contains('2');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder30.replaceFirst(strMatcher36, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder20.deleteFirst(strMatcher36);
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getQuoteMatcher();
        boolean boolean42 = strBuilder20.contains(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder20.append((float) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder20.append((double) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.appendFixedWidthPadRight(5, (int) '4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.append(0L);
        java.lang.String str54 = strBuilder50.substring(0);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder50.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.insert(32, false);
        boolean boolean61 = strBuilder4.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder66.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder66.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder71.appendFixedWidthPadRight((int) (byte) 10, 5, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder71.appendPadding((int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder78.append("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        boolean boolean82 = strTokenizer81.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer84 = strTokenizer81.setEmptyTokenAsNull(true);
        boolean boolean85 = strTokenizer84.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher86 = strTokenizer84.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder78.replaceAll(strMatcher86, "0.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer90 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("0");
        java.lang.String str91 = strTokenizer90.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher92 = strTokenizer90.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder78.appendFixedWidthPadLeft((java.lang.Object) strMatcher92, 2, 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder4.append((java.lang.Object) strMatcher92);
        java.lang.String str97 = strBuilder4.toString();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "!ih0.097.05###################################################0" + "'", str54, "!ih0.097.05###################################################0");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strMatcher86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strTokenizer90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "0" + "'", str91, "0");
        org.junit.Assert.assertNotNull(strMatcher92);
        org.junit.Assert.assertNotNull(strBuilder95);
        org.junit.Assert.assertNotNull(strBuilder96);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("10.");
        boolean boolean2 = strTokenizer1.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer1.setDelimiterChar('a');
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer1.getIgnoredMatcher();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceAll("hi!", "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str14 = strTokenizer13.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer13.setTrimmerMatcher(strMatcher16);
        java.lang.String[] strArray18 = strTokenizer17.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder12.appendWithSeparators((java.lang.Object[]) strArray18, "false10.0");
        java.util.Collection collection21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendWithSeparators(collection21, "");
        strBuilder20.size = 4;
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer27.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer29.setDelimiterString(".0");
        boolean boolean32 = strTokenizer29.isEmptyTokenAsNull();
        boolean boolean33 = strTokenizer29.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer29.setDelimiterString("hi!\0002         ");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder20.appendWithSeparators((java.util.Iterator) strTokenizer35, "a32");
        int int39 = strBuilder20.lastIndexOf(' ');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder6.deleteFirst(".0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer22.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher45 = strTokenizer44.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder39.replaceFirst(strMatcher45, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder29.deleteFirst(strMatcher45);
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher50 = strTokenizer49.getQuoteMatcher();
        boolean boolean51 = strBuilder29.contains(strMatcher50);
        char char53 = strBuilder29.charAt((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder29.appendPadding((int) (byte) 100, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str58 = strTokenizer57.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer59.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strTokenizer57.setTrimmerMatcher(strMatcher60);
        boolean boolean62 = strTokenizer61.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher63 = strTokenizer61.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder56.deleteAll(strMatcher63);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer24.setTrimmerMatcher(strMatcher63);
        org.apache.commons.lang.text.StrMatcher strMatcher66 = strTokenizer65.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder71.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder71.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder78.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder81.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder81.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher87 = strTokenizer86.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder81.replaceFirst(strMatcher87, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder71.deleteFirst(strMatcher87);
        org.apache.commons.lang.text.StrTokenizer strTokenizer91 = strTokenizer65.setDelimiterMatcher(strMatcher87);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder20.replaceAll(strMatcher87, "StrTokenizer[StrTokenizer[]]");
        int int94 = strBuilder20.size;
        org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder20.insert((int) '\000', 'f');
        boolean boolean99 = strBuilder97.contains('#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + 'i' + "'", char53 == 'i');
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 101 + "'", int94 == 101);
        org.junit.Assert.assertNotNull(strBuilder97);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 10);
        char[] charArray2 = strBuilder1.toCharArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.insert(0, (int) (byte) 10);
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        java.io.Reader reader13 = strBuilder12.asReader();
        java.nio.CharBuffer charBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = reader13.read(charBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strBuilder6.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder6.appendNewLine();
        boolean boolean46 = strBuilder44.endsWith("4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(writer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll("", "");
        char[] charArray15 = strBuilder14.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.append((float) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.insert(0, false);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer21 = strBuilder14.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str23 = strTokenizer22.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer22.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strBuilderTokenizer21.setQuoteMatcher(strMatcher24);
        java.lang.Object obj26 = strTokenizer25.next();
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "false10.0" + "'", obj26, "false10.0");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.insert(0, (int) (byte) 10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str12 = strTokenizer11.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = strTokenizer13.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strTokenizer11.setTrimmerMatcher(strMatcher14);
        int int17 = strBuilder7.lastIndexOf(strMatcher14, (int) 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder7.append((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder7.clear();
        boolean boolean22 = strBuilder20.startsWith("StrTokenizer[]");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str9 = strTokenizer8.toString();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer8.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.appendFixedWidthPadRight((java.lang.Object) strTokenizer8, 208, '2');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.insert(208, "!ih0.097.05###################################################01.0");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str9, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder14.replaceFirst(strMatcher20, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder4.deleteFirst(strMatcher20);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getQuoteMatcher();
        boolean boolean26 = strBuilder4.contains(strMatcher25);
        char char28 = strBuilder4.charAt((int) (short) 1);
        java.io.Writer writer29 = strBuilder4.asWriter();
        boolean boolean31 = strBuilder4.endsWith("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceFirst('#', '4');
        int int38 = strBuilder36.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.insert(1, (double) '#');
        int int47 = strBuilder46.size;
        int int50 = strBuilder46.lastIndexOf('4', (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder46.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.deleteAll("hi!\n");
        java.lang.StringBuffer stringBuffer54 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder51.append(stringBuffer54, (int) 'e', (int) (short) 10);
        boolean boolean58 = strBuilder4.equals(strBuilder57);
        int int59 = strBuilder57.size();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter60 = strBuilder57.new StrBuilderWriter();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'i' + "'", char28 == 'i');
        org.junit.Assert.assertNotNull(writer29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder18.replaceFirst(strMatcher24, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder8.deleteFirst(strMatcher24);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getQuoteMatcher();
        boolean boolean30 = strBuilder8.contains(strMatcher29);
        char char32 = strBuilder8.charAt((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder8.appendPadding((int) (byte) 100, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str37 = strTokenizer36.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = strTokenizer38.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer36.setTrimmerMatcher(strMatcher39);
        boolean boolean41 = strTokenizer40.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer40.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder35.deleteAll(strMatcher42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer3.setTrimmerMatcher(strMatcher42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer3.reset("StrTokenizer[not tokenized yet]");
        java.lang.String str47 = strTokenizer46.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer46.setIgnoredChar('i');
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + 'i' + "'", char32 == 'i');
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str47, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer49);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.appendFixedWidthPadRight((int) (byte) 10, 5, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.appendPadding((int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        boolean boolean20 = strTokenizer19.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strTokenizer19.setEmptyTokenAsNull(true);
        boolean boolean23 = strTokenizer22.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer22.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder16.replaceAll(strMatcher24, "0.0");
        java.lang.String str27 = strBuilder16.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder16.replaceFirst("!ih100444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-1e");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append((double) 15L);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceFirst(' ', ' ');
        boolean boolean44 = strBuilder39.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder39.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder39.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder51.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append((double) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder30.append(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder6.replaceAll(".0", ".0");
        int int24 = strBuilder21.indexOf('#', (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setLength((int) '4');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter27 = strBuilder26.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.replaceAll("StrTokenizer[StrTokenizer[]]", "!ih100444444444444444444444444444440.04444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(".0");
        strBuilder1.size = (-1);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.replaceAll('4', 'i');
        boolean boolean8 = strBuilder1.endsWith("");
        int int10 = strBuilder1.lastIndexOf('i');
        char[] charArray11 = strBuilder1.buffer;
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray11);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(strTokenizer12);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll("", "");
        int int16 = strBuilder14.indexOf('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer17.getQuoteMatcher();
        int int19 = strBuilder14.indexOf(strMatcher18);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer39.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder34.replaceFirst(strMatcher40, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder24.deleteFirst(strMatcher40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher45 = strTokenizer44.getQuoteMatcher();
        boolean boolean46 = strBuilder24.contains(strMatcher45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder14.append((java.lang.Object) strBuilder24);
        boolean boolean49 = strBuilder47.contains('0');
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str51 = strTokenizer50.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer50.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer50.setDelimiterString("11000");
        boolean boolean56 = strTokenizer55.hasPrevious();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder47.appendWithSeparators((java.util.Iterator) strTokenizer55, "!ih");
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.appendFixedWidthPadLeft(1, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.deleteFirst("");
        boolean boolean23 = strBuilder21.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadRight((int) ' ', 0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.appendFixedWidthPadLeft(3, (int) (short) 1, 'a');
        boolean boolean32 = strBuilder12.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder12.insert(0, (float) '2');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder35.trim();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder2.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(' ', ' ');
        boolean boolean12 = strBuilder7.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder7.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder7.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray28 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder21.buffer = charArray28;
        char[] charArray30 = strBuilder7.getChars(charArray28);
        int int31 = reader0.read(charArray30);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray30);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.replaceAll("", "");
        java.lang.String str48 = strBuilder47.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder53.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer58.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder53.replaceFirst(strMatcher59, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder66.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder66.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder76.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher82 = strTokenizer81.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder76.replaceFirst(strMatcher82, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder66.deleteFirst(strMatcher82);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher87 = strTokenizer86.getQuoteMatcher();
        boolean boolean88 = strBuilder66.contains(strMatcher87);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder53.deleteFirst(strMatcher87);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder47.deleteAll(strMatcher87);
        org.apache.commons.lang.text.StrTokenizer strTokenizer91 = strTokenizer32.setQuoteMatcher(strMatcher87);
        boolean boolean92 = strTokenizer91.hasPrevious();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(".0");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean15 = strBuilder13.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder20.replaceFirst(strMatcher26, "hi!");
        int int29 = strBuilder13.lastIndexOf(strMatcher26);
        boolean boolean30 = strBuilder1.contains(strMatcher26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer32.setEmptyTokenAsNull(true);
        java.util.List list35 = strTokenizer34.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder1.appendWithSeparators((java.util.Collection) list35, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.appendFixedWidthPadLeft((int) (byte) 1, (int) (byte) 1, ' ');
        int int43 = strBuilder37.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str46 = strBuilder45.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter47 = strBuilder45.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceFirst(' ', ' ');
        boolean boolean59 = strBuilder54.contains(' ');
        java.io.Writer writer60 = strBuilder54.asWriter();
        char[] charArray61 = strBuilder54.toCharArray();
        strBuilderWriter47.write(charArray61);
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray61);
        char[] charArray64 = strBuilder37.getChars(charArray61);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = strTokenizer66.setEmptyTokenAsNull(true);
        java.util.List list69 = strTokenizer68.getTokenList();
        java.lang.Object obj70 = strTokenizer68.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strTokenizer68.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strTokenizer71.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder37.append((java.lang.Object) strTokenizer72);
        java.lang.String str76 = strBuilder73.midString(49, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder73.minimizeCapacity();
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(writer60);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '.', '0', '1' });
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(strBuilder77);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder2.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(' ', ' ');
        boolean boolean12 = strBuilder7.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder7.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder7.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray28 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder21.buffer = charArray28;
        char[] charArray30 = strBuilder7.getChars(charArray28);
        int int31 = reader0.read(charArray30);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray30);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.replaceAll("", "");
        java.lang.String str48 = strBuilder47.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder53.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer58.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder53.replaceFirst(strMatcher59, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder66.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder66.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder76.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher82 = strTokenizer81.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder76.replaceFirst(strMatcher82, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder66.deleteFirst(strMatcher82);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher87 = strTokenizer86.getQuoteMatcher();
        boolean boolean88 = strBuilder66.contains(strMatcher87);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder53.deleteFirst(strMatcher87);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder47.deleteAll(strMatcher87);
        org.apache.commons.lang.text.StrTokenizer strTokenizer91 = strTokenizer32.setQuoteMatcher(strMatcher87);
        org.apache.commons.lang.text.StrTokenizer strTokenizer93 = strTokenizer91.setEmptyTokenAsNull(false);
        java.lang.String[] strArray94 = strTokenizer93.getTokenArray();
        boolean boolean95 = strTokenizer93.hasPrevious();
        org.apache.commons.lang.text.StrTokenizer strTokenizer97 = strTokenizer93.setDelimiterChar('e');
        org.apache.commons.lang.text.StrTokenizer strTokenizer99 = strTokenizer93.setDelimiterChar('2');
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertNotNull(strTokenizer93);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "0.010##################################################################################################" });
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(strTokenizer97);
        org.junit.Assert.assertNotNull(strTokenizer99);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll("", "");
        java.lang.String str15 = strBuilder14.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder20.replaceFirst(strMatcher26, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder33.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder43.replaceFirst(strMatcher49, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder33.deleteFirst(strMatcher49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer53.getQuoteMatcher();
        boolean boolean55 = strBuilder33.contains(strMatcher54);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder20.deleteFirst(strMatcher54);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder14.deleteAll(strMatcher54);
        boolean boolean59 = strBuilder57.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4true");
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder14.replaceFirst(strMatcher20, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder4.deleteFirst(strMatcher20);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getQuoteMatcher();
        boolean boolean26 = strBuilder4.contains(strMatcher25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder4.append((float) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strBuilder28.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.replaceFirst('#', '4');
        int int36 = strBuilder34.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder34.appendFixedWidthPadLeft(1, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder34.setNewLineText(".0");
        char[] charArray45 = strBuilder44.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder28.append(charArray45);
        int int48 = strBuilder28.indexOf("10.");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder28.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.replaceAll("hi!", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder60.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder64.trim();
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("10.");
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str70 = strTokenizer69.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher72 = strTokenizer71.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = strTokenizer69.setTrimmerMatcher(strMatcher72);
        java.io.Reader reader74 = java.io.Reader.nullReader();
        char[] charArray76 = new char[] { ' ' };
        int int77 = reader74.read(charArray76);
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = strTokenizer69.reset(charArray76);
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray76);
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strTokenizer68.reset(charArray76);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder64.insert((int) (byte) 0, charArray76);
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray76);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder28.appendWithSeparators((java.util.Iterator) strTokenizer82, "-1.0");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strMatcher72);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(reader74);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertNotNull(strBuilder84);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceAll("hi!", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.reverse();
        java.io.Writer writer14 = strBuilder9.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.append((double) 103L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.appendFixedWidthPadLeft((int) '#', 5, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.replaceFirst('#', '4');
        int int29 = strBuilder27.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.insert(0, (int) (byte) 10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str35 = strTokenizer34.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer34.setTrimmerMatcher(strMatcher37);
        int int40 = strBuilder30.lastIndexOf(strMatcher37, (int) 'i');
        boolean boolean41 = strBuilder22.contains(strMatcher37);
        boolean boolean42 = strBuilder16.contains(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder16.insert(0, (long) 'i');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strBuilder45);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str10 = strTokenizer9.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer9.setTrimmerMatcher(strMatcher12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.deleteAll(strMatcher12);
        java.lang.String str16 = strBuilder14.rightString((int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadRight((int) 'a', (int) '#', 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst("!ih52.0true", "10.");
        boolean boolean25 = strBuilder20.contains('f');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.ensureCapacity(64);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        boolean boolean1 = strTokenizer0.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer0.setEmptyTokenAsNull(true);
        boolean boolean4 = strTokenizer3.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer3.getDelimiterMatcher();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = strTokenizer3.getIgnoredMatcher();
        java.lang.String[] strArray7 = strTokenizer3.getTokenArray();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str9 = strTokenizer8.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer10.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer8.setTrimmerMatcher(strMatcher11);
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer12.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder7.appendFixedWidthPadLeft((java.lang.Object) strTokenizer13, (int) (byte) -1, 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean30 = strBuilder28.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder35.replaceFirst(strMatcher41, "hi!");
        int int44 = strBuilder28.lastIndexOf(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer13.setQuoteMatcher(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str47 = strTokenizer46.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer46.setTrimmerMatcher(strMatcher49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer46.setIgnoredChar('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer54.setEmptyTokenAsNull(true);
        java.lang.String[] strArray57 = strTokenizer56.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strTokenizer56.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer56.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strTokenizer52.setDelimiterMatcher(strMatcher60);
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer45.setDelimiterMatcher(strMatcher60);
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strTokenizer62.setQuoteChar('i');
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strTokenizer64.setDelimiterString("!ih100444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strTokenizer66);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.appendFixedWidthPadLeft(1, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.deleteFirst("");
        boolean boolean23 = strBuilder21.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadRight((int) ' ', 0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.appendFixedWidthPadLeft(3, (int) (short) 1, 'a');
        boolean boolean32 = strBuilder12.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer33 = strBuilder31.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader34 = strBuilder31.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.append((float) 104);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceFirst(strMatcher10, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder4.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.setNewLineText("StrTokenizer[not tokenized yet]");
        java.lang.String str16 = strBuilder15.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strBuilder15.asTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strTokenizer17.setIgnoreEmptyTokens(true);
        boolean boolean20 = strTokenizer19.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer19.getQuoteMatcher();
        int int22 = strTokenizer19.nextIndex();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder(".0");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean38 = strBuilder36.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder43.replaceFirst(strMatcher49, "hi!");
        int int52 = strBuilder36.lastIndexOf(strMatcher49);
        boolean boolean53 = strBuilder24.contains(strMatcher49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer55.setEmptyTokenAsNull(true);
        java.util.List list58 = strTokenizer57.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder24.appendWithSeparators((java.util.Collection) list58, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder60.appendFixedWidthPadLeft((int) (byte) 1, (int) (byte) 1, ' ');
        int int66 = strBuilder60.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str69 = strBuilder68.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter70 = strBuilder68.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder75.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder77.replaceFirst(' ', ' ');
        boolean boolean82 = strBuilder77.contains(' ');
        java.io.Writer writer83 = strBuilder77.asWriter();
        char[] charArray84 = strBuilder77.toCharArray();
        strBuilderWriter70.write(charArray84);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray84);
        char[] charArray87 = strBuilder60.getChars(charArray84);
        org.apache.commons.lang.text.StrTokenizer strTokenizer88 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray87);
        org.apache.commons.lang.text.StrTokenizer strTokenizer89 = strTokenizer19.reset(charArray87);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!\n" + "'", str16, "hi!\n");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(writer83);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertArrayEquals(charArray87, new char[] { '.', '0', '1' });
        org.junit.Assert.assertNotNull(strTokenizer88);
        org.junit.Assert.assertNotNull(strTokenizer89);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append("0");
        char[] charArray14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append(charArray14);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst(' ', ' ');
        boolean boolean28 = strBuilder23.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder23.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray44 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder37.buffer = charArray44;
        char[] charArray46 = strBuilder23.getChars(charArray44);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder15.insert((int) (short) 1, charArray44);
        int int50 = strBuilder15.lastIndexOf("!ih52.0true", (int) (byte) -1);
        java.lang.StringBuffer stringBuffer51 = strBuilder15.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder53.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.replaceAll("", "");
        char[] charArray67 = strBuilder66.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.append((float) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder74.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder74.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str80 = strTokenizer79.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher82 = strTokenizer81.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer83 = strTokenizer79.setTrimmerMatcher(strMatcher82);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder74.deleteAll(strMatcher82);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder66.append((java.lang.Object) strBuilder74);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder66.deleteAll("hi!97iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        int int88 = strBuilder87.size;
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder15.append(strBuilder87);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder89.delete((int) '9', 14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "!#4 a aih0");
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strMatcher82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 7 + "'", int88 == 7);
        org.junit.Assert.assertNotNull(strBuilder89);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("!ih0.097.05###################################################");
        boolean boolean2 = strTokenizer1.hasPrevious();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        boolean boolean8 = strBuilder4.contains("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder4.replaceFirst('a', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append(false);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        boolean boolean8 = strBuilder4.contains('i');
        int int9 = strBuilder4.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteAll("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceAll("", "");
        char[] charArray39 = strBuilder38.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray39);
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray39);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer23.reset(charArray39);
        char[] charArray43 = strBuilder19.getChars(charArray39);
        strBuilder4.buffer = charArray43;
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray43);
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getIgnoredMatcher();
        boolean boolean47 = strTokenizer45.hasNext();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strBuilder59.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer45.setDelimiterMatcher(strMatcher61);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '!', 'i', 'h' });
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer62);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.insert(1, (double) '#');
        int int15 = strBuilder14.size;
        int int18 = strBuilder14.lastIndexOf('4', (-1));
        java.io.Reader reader19 = java.io.Reader.nullReader();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.replaceFirst(' ', ' ');
        boolean boolean31 = strBuilder26.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder26.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder26.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray47 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder40.buffer = charArray47;
        char[] charArray49 = strBuilder26.getChars(charArray47);
        int int50 = reader19.read(charArray49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder14.append(charArray49, (int) (byte) 1, 9);
        boolean boolean55 = strBuilder54.isEmpty();
        int int56 = strBuilder54.length();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(reader19);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 18 + "'", int56 == 18);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceFirst(strMatcher10, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean26 = strBuilder24.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder31.replaceFirst(strMatcher37, "hi!");
        int int40 = strBuilder24.lastIndexOf(strMatcher37);
        int int42 = strBuilder12.indexOf(strMatcher37, (int) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strBuilder12.asTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer43.setDelimiterString("hi!");
        boolean boolean46 = strTokenizer45.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer45.getQuoteMatcher();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strMatcher47);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder6.replaceAll(".0", ".0");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append((int) (byte) -1);
        java.lang.StringBuffer stringBuffer24 = strBuilder23.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.insert(0, (long) 132);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "0.010##################################################################################################-1");
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteAll("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceAll("", "");
        char[] charArray29 = strBuilder28.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer13.reset(charArray29);
        char[] charArray33 = strBuilder9.getChars(charArray29);
        char[] charArray34 = strBuilder9.toCharArray();
        boolean boolean35 = strBuilder9.isEmpty();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '!', 'i', 'h' });
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '!', 'i', 'h' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("0");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteFirst("52StrTokenizer[not tokenized yet]a");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher3 = strTokenizer2.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer0.setTrimmerMatcher(strMatcher3);
        boolean boolean5 = strTokenizer4.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = strTokenizer4.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer4.reset();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strMatcher3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer7);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(".0");
        strBuilder1.size = (-1);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.replaceAll('4', 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str16 = strTokenizer15.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer17.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strTokenizer15.setTrimmerMatcher(strMatcher18);
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer19.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) strTokenizer20, (int) (byte) -1, 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean37 = strBuilder35.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer47.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder42.replaceFirst(strMatcher48, "hi!");
        int int51 = strBuilder35.lastIndexOf(strMatcher48);
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer20.setQuoteMatcher(strMatcher48);
        boolean boolean53 = strBuilder6.contains(strMatcher48);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder58.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder58.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder68.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher74 = strTokenizer73.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder68.replaceFirst(strMatcher74, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder58.deleteFirst(strMatcher74);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder58.append((float) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder58.deleteFirst(".0");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder81.appendPadding(5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder6.appendFixedWidthPadRight((java.lang.Object) strBuilder84, 7, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset -1, count 10, length 34");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strMatcher74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder84);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str2 = strBuilder1.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter3 = strBuilder1.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceFirst(' ', ' ');
        boolean boolean15 = strBuilder10.contains(' ');
        java.io.Writer writer16 = strBuilder10.asWriter();
        char[] charArray17 = strBuilder10.toCharArray();
        strBuilderWriter3.write(charArray17);
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray17);
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray17);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray17);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer21.reset("1000\000\000\000\000");
        int int24 = strTokenizer21.nextIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder11.reverse();
        java.lang.Object[] objArray13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendWithSeparators(objArray13, "0");
        boolean boolean17 = strBuilder12.startsWith("hi!###################################################3false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder12.insert(137, (long) 68);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 137");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        java.lang.String str11 = strBuilder4.substring((int) (short) 1, (int) (short) 10);
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.appendWithSeparators(collection12, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder31.replaceFirst(strMatcher37, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder21.deleteFirst(strMatcher37);
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer15.setQuoteMatcher(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) strTokenizer15, 62, 'i');
        java.lang.StringBuffer stringBuffer45 = strBuilder44.toStringBuffer();
        char[] charArray46 = strBuilder44.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".0" + "'", str11, ".0");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "0.0iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiStrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(charArray46);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.append(0.0d);
        java.lang.String str19 = strBuilder12.substring((int) (short) 1, (int) (short) 10);
        java.util.Collection collection20 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder12.appendWithSeparators(collection20, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder(".0");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean38 = strBuilder36.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder43.replaceFirst(strMatcher49, "hi!");
        int int52 = strBuilder36.lastIndexOf(strMatcher49);
        boolean boolean53 = strBuilder24.contains(strMatcher49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer55.setEmptyTokenAsNull(true);
        java.util.List list58 = strTokenizer57.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder24.appendWithSeparators((java.util.Collection) list58, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder12.appendWithSeparators((java.util.Collection) list58, "");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder7.appendFixedWidthPadLeft((java.lang.Object) strBuilder12, 3, 'a');
        java.lang.StringBuffer stringBuffer66 = strBuilder7.toStringBuffer();
        int int67 = strBuilder7.length();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".0" + "'", str19, ".0");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(stringBuffer66);
        org.junit.Assert.assertEquals(stringBuffer66.toString(), "0.0");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder14.replaceFirst(strMatcher20, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder4.deleteFirst(strMatcher20);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder4.append((float) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append(true);
        int int28 = strBuilder27.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.replaceFirst('a', '0');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.replaceAll('#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteFirst('.');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.append((double) 0.0f);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder6.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder6.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.replaceFirst(strMatcher22, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder6.deleteFirst(strMatcher22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer0.setQuoteMatcher(strMatcher22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer26.setQuoteChar('#');
        java.lang.String str29 = strTokenizer28.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer28.setDelimiterChar('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer28.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer28.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str29, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        int int11 = strBuilder4.indexOf(' ', (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder4.setNullText("0.010##################################################################################################-1");
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str16 = strTokenizer15.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer17.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strTokenizer15.setTrimmerMatcher(strMatcher18);
        boolean boolean20 = strTokenizer19.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer19.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strTokenizer14.setDelimiterMatcher(strMatcher21);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strTokenizer22);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll("", "");
        char[] charArray15 = strBuilder14.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray15);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray15);
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer18.setEmptyTokenAsNull(true);
        java.lang.Object obj21 = strTokenizer20.clone();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str24 = strBuilder23.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter25 = strBuilder23.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceFirst(' ', ' ');
        boolean boolean37 = strBuilder32.contains(' ');
        java.io.Writer writer38 = strBuilder32.asWriter();
        char[] charArray39 = strBuilder32.toCharArray();
        strBuilderWriter25.write(charArray39);
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray39);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray39);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer42.setIgnoredChar('e');
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer42.reset("######################################################################");
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer46.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer48.setDelimiterChar('2');
        org.apache.commons.lang.text.StrMatcher strMatcher51 = strTokenizer50.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer20.setQuoteMatcher(strMatcher51);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(writer38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strTokenizer52);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.insert(1, (double) '#');
        int int15 = strBuilder14.size;
        int int18 = strBuilder14.lastIndexOf('4', (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.minimizeCapacity();
        int int22 = strBuilder14.indexOf("!ih0.097.05###################################################0", 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        boolean boolean24 = strTokenizer23.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer23.setEmptyTokenAsNull(true);
        boolean boolean27 = strTokenizer26.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer26.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer26.setIgnoredChar('e');
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer26.setIgnoreEmptyTokens(true);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.appendFixedWidthPadRight((int) (byte) 10, 5, ' ');
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher72 = strTokenizer71.getQuoteMatcher();
        boolean boolean73 = strBuilder51.contains(strMatcher72);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder51.append((float) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder51.append((double) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder77.replaceFirst('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder46.appendFixedWidthPadRight((java.lang.Object) strBuilder77, 1, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer84 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str85 = strTokenizer84.toString();
        org.apache.commons.lang.text.StrMatcher strMatcher86 = strTokenizer84.getIgnoredMatcher();
        int int88 = strBuilder77.indexOf(strMatcher86, 7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer89 = strTokenizer26.setDelimiterMatcher(strMatcher86);
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder14.replaceAll(strMatcher86, "hi!###################################################3false");
        int int93 = strBuilder14.indexOf("hi!10##################################################################################################");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strMatcher72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str85, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strMatcher86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        java.lang.String str5 = strBuilder1.toString();
        int int6 = strBuilder1.size();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append((long) '#');
        int int9 = strBuilder1.capacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer10.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer31.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder26.replaceFirst(strMatcher32, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder16.deleteFirst(strMatcher32);
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strTokenizer10.setQuoteMatcher(strMatcher32);
        java.io.Reader reader37 = java.io.Reader.nullReader();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.replaceFirst(' ', ' ');
        boolean boolean49 = strBuilder44.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder44.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder44.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray65 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder58.buffer = charArray65;
        char[] charArray67 = strBuilder44.getChars(charArray65);
        int int68 = reader37.read(charArray67);
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray67);
        org.apache.commons.lang.text.StrMatcher strMatcher70 = strTokenizer69.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strTokenizer36.setIgnoredMatcher(strMatcher70);
        int int72 = strBuilder1.lastIndexOf(strMatcher70);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder1.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder1.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder76.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder79.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder79.append(0.0d);
        java.lang.String str86 = strBuilder79.substring((int) (short) 1, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder79.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder87.deleteAll("hi!");
        boolean boolean90 = strBuilder74.equalsIgnoreCase(strBuilder87);
        int int91 = strBuilder87.size();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(reader37);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + ".0" + "'", str86, ".0");
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 3 + "'", int91 == 3);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!\n");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.replaceFirst(' ', ' ');
        boolean boolean13 = strBuilder8.contains(' ');
        java.io.Writer writer14 = strBuilder8.asWriter();
        char[] charArray15 = strBuilder8.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer16, "!ih####################################################################################################");
        int int21 = strBuilder1.lastIndexOf('2', (int) '0');
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        java.lang.String str11 = strBuilder4.substring((int) (short) 1, (int) (short) 10);
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.appendWithSeparators(collection12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.insert((int) (byte) 0, 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.insert((int) (short) 0, false);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder14.ensureCapacity((int) (short) 100);
        java.lang.String str24 = strBuilder22.rightString(11);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".0" + "'", str11, ".0");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "falsei0.0" + "'", str24, "falsei0.0");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder14.replaceFirst(strMatcher20, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder4.deleteFirst(strMatcher20);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getQuoteMatcher();
        boolean boolean26 = strBuilder4.contains(strMatcher25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder4.append((float) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder4.append((double) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.appendFixedWidthPadRight(5, (int) '4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.replaceAll('4', 'a');
        int int41 = strBuilder39.indexOf("hi!10##################################################################################################");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder46.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder46.replaceAll(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder54.appendFixedWidthPadRight((int) (short) 100, (int) 'i', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.replaceFirst("0", ".0");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder58.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder58.insert((int) '0', (long) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str69 = strBuilder68.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder68.replaceAll('4', 'i');
        boolean boolean73 = strBuilder68.isEmpty();
        char[] charArray74 = strBuilder68.toCharArray();
        char[] charArray75 = strBuilder58.getChars(charArray74);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder39.append(charArray74);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertNotNull(strBuilder76);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str10 = strTokenizer9.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer9.setTrimmerMatcher(strMatcher12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.deleteAll(strMatcher12);
        java.lang.String str16 = strBuilder14.rightString((int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadRight((int) 'a', (int) '#', 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceAll('4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder26.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str30 = strBuilder29.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter31 = strBuilder29.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceFirst('#', '4');
        int int38 = strBuilder36.indexOf('#');
        boolean boolean40 = strBuilder36.contains("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder36.replaceFirst('a', 'a');
        java.lang.StringBuffer stringBuffer44 = strBuilder36.toStringBuffer();
        int int45 = strBuilder36.size();
        char[] charArray48 = strBuilder36.toCharArray((int) (byte) 0, 0);
        strBuilderWriter31.write(charArray48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder26.append((java.lang.Object) strBuilderWriter31);
        strBuilderWriter31.write("1000\000\000\000\000");
        strBuilderWriter31.write("!ih0.097.0");
        strBuilderWriter31.write(2);
        strBuilderWriter31.write(63);
        // The following exception was thrown during execution in test generation
        try {
            strBuilderWriter31.write("!ih10   !", (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder50);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setEmptyTokenAsNull(true);
        java.util.List list4 = strTokenizer3.getTokenList();
        java.lang.Object obj5 = strTokenizer3.clone();
        boolean boolean6 = strTokenizer3.isIgnoreEmptyTokens();
        boolean boolean7 = strTokenizer3.hasPrevious();
        boolean boolean8 = strTokenizer3.hasNext();
        java.util.List list9 = strTokenizer3.getTokenList();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(18);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.appendFixedWidthPadRight(5, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder4.setNewLineText("0");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder4.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = strTokenizer38.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder33.replaceFirst(strMatcher39, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder23.deleteFirst(strMatcher39);
        int int45 = strBuilder23.lastIndexOf('4', (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceFirst(' ', ' ');
        boolean boolean57 = strBuilder52.contains(' ');
        java.io.Writer writer58 = strBuilder52.asWriter();
        java.io.Writer writer60 = writer58.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.ensureCapacity(0);
        java.lang.StringBuffer stringBuffer68 = strBuilder67.toStringBuffer();
        java.io.Writer writer69 = writer60.append((java.lang.CharSequence) stringBuffer68);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder23.append(stringBuffer68);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder23.append(strBuilder71, 1, 5);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder23.deleteCharAt(0);
        boolean boolean77 = strBuilder18.equals(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(writer58);
        org.junit.Assert.assertNotNull(writer60);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(stringBuffer68);
        org.junit.Assert.assertEquals(stringBuffer68.toString(), "");
        org.junit.Assert.assertNotNull(writer69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        java.lang.String str11 = strBuilder4.substring((int) (short) 1, (int) (short) 10);
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.appendWithSeparators(collection12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.insert((int) (byte) 0, 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.append(0L);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".0" + "'", str11, ".0");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str10 = strTokenizer9.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer9.setTrimmerMatcher(strMatcher12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.deleteAll(strMatcher12);
        java.lang.String str16 = strBuilder14.rightString((int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadRight((int) 'a', (int) '#', 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceAll('4', '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer25.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer25.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder23.replaceFirst(strMatcher30, "#4");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder23.ensureCapacity(49);
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter35 = strBuilder34.new StrBuilderWriter();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(".0");
        boolean boolean2 = strTokenizer1.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer1.setEmptyTokenAsNull(false);
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder22.replaceFirst(strMatcher28, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder12.deleteFirst(strMatcher28);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder4.replaceAll(strMatcher28, "hi!");
        int int34 = strBuilder4.length();
        int int35 = strBuilder4.length();
        java.io.Reader reader36 = java.io.Reader.nullReader();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst(' ', ' ');
        boolean boolean48 = strBuilder43.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder43.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder43.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray64 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder57.buffer = charArray64;
        char[] charArray66 = strBuilder43.getChars(charArray64);
        int int67 = reader36.read(charArray66);
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray66);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder4.append(charArray66);
        java.lang.String str71 = strBuilder4.substring(38);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(reader36);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "#################################################################" + "'", str71, "#################################################################");
    }
}

