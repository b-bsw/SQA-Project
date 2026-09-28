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
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str2 = strBuilder1.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.replaceAll('4', 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.append(10L);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("StrTokenizer[]");
        java.lang.String str11 = strTokenizer10.previousToken();
        java.lang.Object obj12 = strTokenizer10.next();
        java.util.List list13 = strTokenizer10.getTokenList();
        boolean boolean14 = strTokenizer10.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer10.reset("false");
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getDelimiterMatcher();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder1.replace(strMatcher17, " ", (int) '#', 11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "StrTokenizer[]" + "'", obj12, "StrTokenizer[]");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceAll("", "");
        char[] charArray23 = strBuilder22.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray23);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder7.append(charArray23);
        int int27 = strBuilder26.capacity();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.appendFixedWidthPadRight((int) (byte) 10, 5, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder28.replaceFirst(strMatcher34, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder18.deleteFirst(strMatcher34);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = strTokenizer38.getQuoteMatcher();
        boolean boolean40 = strBuilder18.contains(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder18.append((float) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder18.append((double) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.replaceFirst('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder13.appendFixedWidthPadRight((java.lang.Object) strBuilder44, 1, 'a');
        java.lang.String str52 = strBuilder44.rightString((int) (byte) 1);
        java.lang.String str54 = strBuilder44.leftString(0);
        java.lang.String str55 = strBuilder44.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer56 = strBuilder44.new StrBuilderTokenizer();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "!ih0.097.0" + "'", str55, "!ih0.097.0");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("0");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = strTokenizer1.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer1.reset("St.00.010##################################################################################################");
        int int5 = strTokenizer1.previousIndex();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strMatcher2);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        int int26 = strBuilder4.lastIndexOf('4', (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceFirst(' ', ' ');
        boolean boolean38 = strBuilder33.contains(' ');
        java.io.Writer writer39 = strBuilder33.asWriter();
        java.io.Writer writer41 = writer39.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.ensureCapacity(0);
        java.lang.StringBuffer stringBuffer49 = strBuilder48.toStringBuffer();
        java.io.Writer writer50 = writer41.append((java.lang.CharSequence) stringBuffer49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder4.append(stringBuffer49);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.appendPadding(112, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.deleteFirst("0");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.append("0.0");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.ensureCapacity((int) ' ');
        boolean boolean63 = strBuilder54.equals((java.lang.Object) strBuilder62);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(writer39);
        org.junit.Assert.assertNotNull(writer41);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "");
        org.junit.Assert.assertNotNull(writer50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.appendFixedWidthPadRight(5, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder4.setNewLineText("0");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder4.append('4');
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        int int21 = strBuilder18.lastIndexOf(strMatcher19, (int) '#');
        char[] charArray24 = strBuilder18.toCharArray(1, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder18.replaceAll('.', 'S');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.ensureCapacity((int) (byte) 10);
        int int9 = strBuilder4.size();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceFirst('#', '4');
        int int18 = strBuilder16.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder40.replaceFirst(strMatcher46, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder30.deleteFirst(strMatcher46);
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer24.setQuoteMatcher(strMatcher46);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder20.replaceFirst(strMatcher46, "");
        int int54 = strBuilder11.indexOf(strMatcher46, (int) (short) -1);
        java.lang.StringBuffer stringBuffer55 = strBuilder11.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder4.append(stringBuffer55);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher67 = strTokenizer66.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder61.replaceFirst(strMatcher67, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder61.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder61.setNewLineText("StrTokenizer[not tokenized yet]");
        boolean boolean73 = strBuilder4.equalsIgnoreCase(strBuilder72);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray76 = strBuilder72.toCharArray(83, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setEmptyTokenAsNull(true);
        java.lang.String[] strArray4 = strTokenizer3.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = strTokenizer3.setDelimiterChar('i');
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer8.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder25.replaceFirst(strMatcher31, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder15.deleteFirst(strMatcher31);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getQuoteMatcher();
        boolean boolean37 = strBuilder15.contains(strMatcher36);
        char char39 = strBuilder15.charAt((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder15.appendPadding((int) (byte) 100, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str44 = strTokenizer43.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer43.setTrimmerMatcher(strMatcher46);
        boolean boolean48 = strTokenizer47.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer47.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder42.deleteAll(strMatcher49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer10.setTrimmerMatcher(strMatcher49);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer6.setDelimiterMatcher(strMatcher52);
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strTokenizer53.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer54.setDelimiterString("#4");
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + 'i' + "'", char39 == 'i');
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strTokenizer56);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceAll("", "hi!");
        java.io.Reader reader10 = strBuilder6.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append(0.0f);
        java.io.Writer writer23 = strBuilder22.asWriter();
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
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder6.append(stringBuffer46);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.insert(3, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(writer36);
        org.junit.Assert.assertNotNull(writer38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "");
        org.junit.Assert.assertNotNull(writer47);
        org.junit.Assert.assertNotNull(writer48);
        org.junit.Assert.assertNotNull(strBuilder49);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.replaceAll("!ih0.097.05###################################################0", "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strBuilder22.asTokenizer();
        java.io.Reader reader24 = java.io.Reader.nullReader();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceAll("", "");
        char[] charArray40 = strBuilder39.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray40);
        int int43 = reader24.read(charArray40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer23.reset(charArray40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer44.reset("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer46.setDelimiterString("135.01000");
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder10.deleteFirst(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(reader24);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder50);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("144.0");
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer0.reset("");
        java.lang.String str4 = strTokenizer0.nextToken();
        int int5 = strTokenizer0.nextIndex();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = strTokenizer0.getTrimmerMatcher();
        java.lang.String str7 = strTokenizer0.nextToken();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer43.reset();
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
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.appendFixedWidthPadLeft(1, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.setNewLineText(".0");
        char[] charArray15 = strBuilder14.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) strBuilder17, (int) '4', 'i');
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer25.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer25.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer29.setIgnoreEmptyTokens(true);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean45 = strBuilder43.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceFirst('#', '4');
        java.lang.Object[] objArray51 = new java.lang.Object[] { strBuilder47 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder43.appendWithSeparators(objArray51, ".0");
        char[] charArray54 = strBuilder43.buffer;
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer31.reset(charArray54);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder17.appendWithSeparators((java.util.Iterator) strTokenizer31, "!");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strBuilder57);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.replaceFirst("StrTokenizer[]", ".0");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.append((float) 'e');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder15.appendNewLine();
        boolean boolean17 = strBuilder16.isEmpty();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str20 = strTokenizer19.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer19.setTrimmerMatcher(strMatcher22);
        boolean boolean24 = strTokenizer23.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.replaceFirst(' ', ' ');
        boolean boolean36 = strBuilder31.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder31.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder31.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray52 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder45.buffer = charArray52;
        char[] charArray54 = strBuilder31.getChars(charArray52);
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer23.reset(charArray54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray54);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder16.insert((int) 'h', charArray54, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 104");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strTokenizer57);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder4.setCharAt((int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceFirst(' ', ' ');
        boolean boolean43 = strBuilder38.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder38.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder38.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray59 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder52.buffer = charArray59;
        char[] charArray61 = strBuilder38.getChars(charArray59);
        strBuilder31.buffer = charArray59;
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray59);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer63.setQuoteChar('4');
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strTokenizer65);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceFirst(' ', ' ');
        boolean boolean20 = strBuilder15.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder15.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray36 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder29.buffer = charArray36;
        char[] charArray38 = strBuilder15.getChars(charArray36);
        char[] charArray39 = strBuilder8.getChars(charArray38);
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray39);
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray39);
        boolean boolean42 = strTokenizer41.isIgnoreEmptyTokens();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.ensureCapacity((int) (byte) 10);
        int int9 = strBuilder4.size();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst('#', '4');
        int int16 = strBuilder14.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.insert((int) (byte) 1, (long) 100);
        int int22 = strBuilder18.capacity();
        boolean boolean24 = strBuilder18.endsWith("0");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader25 = strBuilder18.new StrBuilderReader();
        int int26 = strBuilderReader25.read();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder4.append((java.lang.Object) strBuilderReader25);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('#', '4');
        int int35 = strBuilder33.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.insert(1, (double) '#');
        int int44 = strBuilder43.size;
        int int47 = strBuilder43.lastIndexOf('4', (-1));
        java.io.Reader reader48 = java.io.Reader.nullReader();
        char[] charArray50 = new char[] { ' ' };
        int int51 = reader48.read(charArray50);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.replaceFirst(' ', ' ');
        boolean boolean63 = strBuilder58.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder58.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder58.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray79 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder72.buffer = charArray79;
        char[] charArray81 = strBuilder58.getChars(charArray79);
        int int82 = reader48.read(charArray81);
        strBuilder43.buffer = charArray81;
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder27.insert((int) (byte) 1, charArray81, (int) ' ', 9);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder27.replaceAll("", "h7.0i!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer90 = strBuilder89.new StrBuilderTokenizer();
        java.lang.String str91 = strBuilderTokenizer90.getContent();
        boolean boolean92 = strBuilderTokenizer90.hasNext();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 49 + "'", int26 == 49);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(reader48);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.appendFixedWidthPadRight(5, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder19.replaceFirst(strMatcher25, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder29.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean41 = strBuilder39.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder46.replaceFirst(strMatcher52, "hi!");
        int int55 = strBuilder39.lastIndexOf(strMatcher52);
        int int57 = strBuilder27.indexOf(strMatcher52, (int) (byte) 100);
        int int58 = strBuilder14.indexOf(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder14.append((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray63 = strBuilder60.toCharArray((int) 'i', 83);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceFirst(strMatcher10, "hi!");
        boolean boolean14 = strBuilder12.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.setNullText("");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher3 = strTokenizer2.getQuoteMatcher();
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer2.setQuoteMatcher(strMatcher24);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer28.setQuoteChar('4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer28.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str34 = strTokenizer33.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer33.setTrimmerMatcher(strMatcher36);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder42.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder52.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer57.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder52.replaceFirst(strMatcher58, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder42.deleteFirst(strMatcher58);
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher63 = strTokenizer62.getQuoteMatcher();
        boolean boolean64 = strBuilder42.contains(strMatcher63);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer37.setDelimiterMatcher(strMatcher63);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strTokenizer32.setIgnoredMatcher(strMatcher63);
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strTokenizer1.setDelimiterMatcher(strMatcher63);
        int int68 = strTokenizer67.size();
        java.lang.String[] strArray69 = strTokenizer67.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strTokenizer67.setDelimiterChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher72 = strTokenizer71.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strMatcher3);
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
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strMatcher72);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder16.setNullText("144.0");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder16.append("htruei!97iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        strBuilder30.size = '8';
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.appendFixedWidthPadRight(5, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder4.setNewLineText("0");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.ensureCapacity(0);
        java.lang.StringBuffer stringBuffer24 = strBuilder23.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder4.append(stringBuffer24);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str27 = strTokenizer26.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer26.setTrimmerMatcher(strMatcher29);
        java.io.Reader reader31 = java.io.Reader.nullReader();
        char[] charArray33 = new char[] { ' ' };
        int int34 = reader31.read(charArray33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer26.reset(charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder4.append(charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder42.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder52.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer57.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder52.replaceFirst(strMatcher58, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder42.deleteFirst(strMatcher58);
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher63 = strTokenizer62.getQuoteMatcher();
        boolean boolean64 = strBuilder42.contains(strMatcher63);
        char char66 = strBuilder42.charAt((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder42.appendPadding((int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder69.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.deleteCharAt((int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder36.insert(7, (java.lang.Object) strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.setNullText("#4");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder75.append(208);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder77.minimizeCapacity();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(reader31);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + char66 + "' != '" + 'i' + "'", char66 == 'i');
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder78);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        java.lang.String str11 = strBuilder4.substring((int) (short) 1, (int) (short) 10);
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.appendWithSeparators(collection12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder(".0");
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
        boolean boolean45 = strBuilder16.contains(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer47.setEmptyTokenAsNull(true);
        java.util.List list50 = strTokenizer49.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder16.appendWithSeparators((java.util.Collection) list50, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder4.appendWithSeparators((java.util.Collection) list50, "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder54.reverse();
        int int57 = strBuilder55.lastIndexOf("0");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder55.insert((int) (byte) 1, (float) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder55.append("-1e");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".0" + "'", str11, ".0");
        org.junit.Assert.assertNotNull(strBuilder14);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.replaceFirst('#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.setNullText("!ih52.0true");
        char[] charArray34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.insert(3, charArray34);
        boolean boolean37 = strBuilder32.startsWith("0");
        boolean boolean38 = strBuilder32.isEmpty();
        java.lang.StringBuffer stringBuffer39 = strBuilder32.toStringBuffer();
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(stringBuffer39);
        org.junit.Assert.assertEquals(stringBuffer39.toString(), "!ih!ih52.0true52.0true");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.replaceAll("", "");
        int int36 = strBuilder34.indexOf('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getQuoteMatcher();
        int int39 = strBuilder34.indexOf(strMatcher38);
        int int40 = strBuilder14.lastIndexOf(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.append(0.0d);
        java.lang.String str52 = strBuilder45.substring((int) (short) 1, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder45.minimizeCapacity();
        boolean boolean54 = strBuilder14.equalsIgnoreCase(strBuilder45);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder45.setCharAt(52, '5');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ".0" + "'", str52, ".0");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('#', '4');
        int int28 = strBuilder26.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer34.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder50.replaceFirst(strMatcher56, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder40.deleteFirst(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer34.setQuoteMatcher(strMatcher56);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder30.replaceFirst(strMatcher56, "");
        int int64 = strBuilder21.indexOf(strMatcher56, (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder19.deleteFirst(strMatcher56);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder70.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder70.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder77.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder80.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder80.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher86 = strTokenizer85.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder80.replaceFirst(strMatcher86, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder70.deleteFirst(strMatcher86);
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder70.append((float) '4');
        int int94 = strBuilder91.indexOf(".0", 0);
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder65.append((java.lang.Object) strBuilder91);
        org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder91.append('4');
        java.lang.String str98 = strBuilder91.getNewLineText();
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strMatcher86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 5 + "'", int94 == 5);
        org.junit.Assert.assertNotNull(strBuilder95);
        org.junit.Assert.assertNotNull(strBuilder97);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder11.reverse();
        java.lang.Object[] objArray13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendWithSeparators(objArray13, "0");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader16 = strBuilder15.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.replaceFirst("false10.0", "false10.0");
        int int20 = strBuilder19.size;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.ensureCapacity(8);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        int int10 = strBuilder8.indexOf('a');
        int int13 = strBuilder8.indexOf(".0", (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceAll("", "");
        char[] charArray31 = strBuilder30.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray31);
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer32.setDelimiterChar('4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strTokenizer32.reset("!ih");
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer32.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder8.deleteFirst(strMatcher37);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        java.io.Reader reader7 = strBuilder4.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.appendPadding((int) ' ', '8');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        strBuilder4.validateIndex(0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.replaceFirst('4', '4');
        int int28 = strBuilder26.lastIndexOf("0.0");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder33.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder40.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder53.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer58.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder53.replaceFirst(strMatcher59, "hi!");
        int int63 = strBuilder48.indexOf(strMatcher59, 5);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder40.deleteAll(strMatcher59);
        boolean boolean66 = strBuilder64.endsWith("");
        java.lang.StringBuffer stringBuffer67 = strBuilder64.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder26.append(stringBuffer67);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder4.append(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder69.appendFixedWidthPadRight((int) (short) 10, 83, ' ');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(stringBuffer67);
        org.junit.Assert.assertEquals(stringBuffer67.toString(), "!ihtrue");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder73);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.clear();
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
        org.junit.Assert.assertNotNull(strBuilder37);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder4.append((double) 41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = strBuilder46.substring(104, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.ensureCapacity((int) (byte) 10);
        int int9 = strBuilder8.size();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.setNullText("0");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder37.appendFixedWidthPadLeft(24, 35, 'S');
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
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.replaceFirst('a', '4');
        java.lang.String str41 = strBuilder39.rightString((int) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "!ih0.097.05###################################################0" + "'", str41, "!ih0.097.05###################################################0");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceFirst(strMatcher10, "hi!");
        boolean boolean14 = strBuilder12.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendNewLine();
        int int18 = strBuilder12.lastIndexOf("hi!97iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder12.deleteFirst("! ih0.097.05##################################################");
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
        org.apache.commons.lang.text.StrMatcher strMatcher66 = strTokenizer65.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder12.replaceAll(strMatcher66, "hi!97iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        int int71 = strBuilder68.indexOf("\n", 17);
        char[] charArray72 = strBuilder68.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { 'h', 'i', '!', '\n' });
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoredChar('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strTokenizer1.setIgnoreEmptyTokens(false);
        java.lang.String str6 = strTokenizer1.previousToken();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        java.lang.String str34 = strBuilderTokenizer33.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strBuilderTokenizer33.reset("#4");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!3" + "'", str34, "hi!3");
        org.junit.Assert.assertNotNull(strTokenizer36);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher3 = strTokenizer2.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer0.setTrimmerMatcher(strMatcher3);
        boolean boolean5 = strTokenizer4.hasPrevious();
        boolean boolean6 = strTokenizer4.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer4.setIgnoreEmptyTokens(true);
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strMatcher3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.clear();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteFirst('#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray27 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder20.buffer = charArray27;
        char[] charArray29 = strBuilder6.getChars(charArray27);
        strBuilder6.validateIndex(32);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder6.append((float) 6L);
        boolean boolean34 = strBuilder6.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder6.appendNull();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceFirst(strMatcher10, "hi!");
        char[] charArray13 = strBuilder12.buffer;
        java.io.Writer writer14 = strBuilder12.asWriter();
        java.io.Writer writer16 = writer14.append('i');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(writer16);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer35.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strTokenizer35.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer35.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder4.deleteAll(strMatcher40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str43 = strTokenizer42.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher45 = strTokenizer44.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer42.setTrimmerMatcher(strMatcher45);
        java.io.Reader reader47 = java.io.Reader.nullReader();
        char[] charArray49 = new char[] { ' ' };
        int int50 = reader47.read(charArray49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer42.reset(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder41.append(charArray49);
        org.apache.commons.lang.text.StrMatcher strMatcher53 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceAll(strMatcher53, ".0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.replace(10, 72, "-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        java.util.List list47 = strTokenizer3.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        boolean boolean49 = strTokenizer48.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer48.setEmptyTokenAsNull(true);
        boolean boolean52 = strTokenizer51.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher53 = strTokenizer51.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer51.setIgnoredChar('e');
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.add((java.lang.Object) strTokenizer55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer55);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendNull();
        int int17 = strBuilder4.indexOf('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer19.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer19.setIgnoreEmptyTokens(false);
        boolean boolean24 = strTokenizer23.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer23.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder4.replaceAll(strMatcher25, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader28 = strBuilder4.new StrBuilderReader();
        strBuilderReader28.close();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher3 = strTokenizer2.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer0.setTrimmerMatcher(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder19.replaceFirst(strMatcher25, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder9.deleteFirst(strMatcher25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getQuoteMatcher();
        boolean boolean31 = strBuilder9.contains(strMatcher30);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer4.setDelimiterMatcher(strMatcher30);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer32.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getDelimiterMatcher();
        boolean boolean37 = strTokenizer35.hasNext();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strMatcher3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder6.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.setLength((int) '0');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str2 = strBuilder1.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.replaceAll('4', 'i');
        java.lang.String str8 = strBuilder1.midString(5, 2);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strBuilder22.asTokenizer();
        boolean boolean24 = strTokenizer23.hasNext();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer34.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder29.replaceFirst(strMatcher35, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer47.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder42.replaceFirst(strMatcher48, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder55.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder65.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = strTokenizer70.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder65.replaceFirst(strMatcher71, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder55.deleteFirst(strMatcher71);
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher76 = strTokenizer75.getQuoteMatcher();
        boolean boolean77 = strBuilder55.contains(strMatcher76);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder42.deleteFirst(strMatcher76);
        int int79 = strBuilder29.lastIndexOf(strMatcher76);
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strTokenizer23.setIgnoredMatcher(strMatcher76);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder1.replaceAll(strMatcher76, "144.0");
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder82.clear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strMatcher76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('4', '4');
        int int33 = strBuilder27.lastIndexOf("hi!\n", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder27.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append('i');
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        java.lang.String str38 = strBuilder34.substring(0);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder34.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder44.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strBuilder54.asTokenizer();
        java.io.Reader reader56 = java.io.Reader.nullReader();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder58.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.replaceAll("", "");
        char[] charArray72 = strBuilder71.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray72);
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray72);
        int int75 = reader56.read(charArray72);
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = strTokenizer55.reset(charArray72);
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = strTokenizer76.reset("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strTokenizer78.setDelimiterString("135.01000");
        org.apache.commons.lang.text.StrMatcher strMatcher81 = strTokenizer80.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) strTokenizer80, 208, 'S');
        int int86 = strBuilder34.lastIndexOf("0.033.0");
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "!ih0.097.05###################################################0" + "'", str38, "!ih0.097.05###################################################0");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(reader56);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        strBuilderWriter3.flush();
        strBuilderWriter3.write("0.0\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("######################################################################");
        int int2 = strBuilder1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder6.insert((int) (short) 1, 0.0d);
        char[] charArray23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.insert(52, charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.deleteFirst('#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder6.replaceAll(".0", ".0");
        char[] charArray24 = strBuilder21.toCharArray((int) (byte) 100, (int) 'e');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.deleteAll("144.0");
        java.lang.StringBuffer stringBuffer27 = strBuilder26.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.insert((int) (short) 1, "");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#' });
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "0.010##################################################################################################");
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray35 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder28.buffer = charArray35;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder41.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getQuoteMatcher();
        int int48 = strBuilder45.lastIndexOf(strMatcher47);
        int int50 = strBuilder28.lastIndexOf(strMatcher47, (int) (short) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer26.setQuoteMatcher(strMatcher47);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer51.reset("hi!\n");
        boolean boolean54 = strTokenizer51.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer51.setEmptyTokenAsNull(false);
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
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strTokenizer56);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceAll("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceFirst('#', '4');
        int int18 = strBuilder16.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder40.replaceFirst(strMatcher46, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder30.deleteFirst(strMatcher46);
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer24.setQuoteMatcher(strMatcher46);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder20.replaceFirst(strMatcher46, "");
        int int54 = strBuilder11.indexOf(strMatcher46, (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder6.replaceFirst(strMatcher46, "");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.deleteAll('i');
        char[] charArray59 = strBuilder58.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray59);
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray59);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strTokenizer61);
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
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.setLength((int) (short) 0);
        int int41 = strBuilder38.indexOf("hi!\n", (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.clear();
        java.lang.StringBuffer stringBuffer44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.append(stringBuffer44, (int) '2', 4);
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
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder11.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.replaceFirst(strMatcher30, "hi!");
        int int34 = strBuilder19.indexOf(strMatcher30, 5);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder11.deleteAll(strMatcher30);
        int int37 = strBuilder11.indexOf('2');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        int int51 = strBuilder39.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer52 = strBuilder39.new StrBuilderTokenizer();
        java.io.Reader reader53 = java.io.Reader.nullReader();
        char[] charArray55 = new char[] { ' ' };
        int int56 = reader53.read(charArray55);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.replaceFirst(' ', ' ');
        boolean boolean68 = strBuilder63.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder63.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder63.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray84 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder77.buffer = charArray84;
        char[] charArray86 = strBuilder63.getChars(charArray84);
        int int87 = reader53.read(charArray86);
        java.util.List list90 = strBuilderTokenizer52.tokenize(charArray86, 10, 10);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder11.appendWithSeparators((java.util.Collection) list90, "hi!3");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(reader53);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(list90);
        org.junit.Assert.assertNotNull(strBuilder92);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder65.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.deleteFirst('a');
        java.lang.String str70 = strBuilder68.leftString(17);
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
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "0.0" + "'", str70, "0.0");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder32.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.replaceAll("", "");
        char[] charArray46 = strBuilder45.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.append((float) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder53.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str59 = strTokenizer58.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer58.setTrimmerMatcher(strMatcher61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder53.deleteAll(strMatcher61);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder45.append((java.lang.Object) strBuilder53);
        char[] charArray65 = strBuilder53.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder1.append(charArray65);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder1.deleteFirst('i');
        java.lang.String str69 = strBuilder1.getNullText();
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.replaceFirst('#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.setNullText("!ih52.0true");
        char[] charArray34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.insert(3, charArray34);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder40.replaceFirst(strMatcher46, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.insert(2, true);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder48.append((int) '5');
        boolean boolean54 = strBuilder35.equals((java.lang.Object) strBuilder53);
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll("", "");
        java.lang.String str15 = strBuilder14.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.appendFixedWidthPadLeft((int) ' ', 3, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.setNewLineText("!ih0.097.05###################################################0");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.ensureCapacity((int) (byte) 10);
        int int31 = strBuilder26.size();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceFirst('#', '4');
        int int40 = strBuilder38.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder52.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder52.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder62.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher68 = strTokenizer67.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder62.replaceFirst(strMatcher68, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder52.deleteFirst(strMatcher68);
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strTokenizer46.setQuoteMatcher(strMatcher68);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder42.replaceFirst(strMatcher68, "");
        int int76 = strBuilder33.indexOf(strMatcher68, (int) (short) -1);
        java.lang.StringBuffer stringBuffer77 = strBuilder33.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder26.append(stringBuffer77);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder26.deleteFirst('e');
        boolean boolean82 = strBuilder80.endsWith("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.apache.commons.lang.text.StrTokenizer strTokenizer84 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer84.setEmptyTokenAsNull(true);
        java.lang.String[] strArray87 = strTokenizer86.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer89 = strTokenizer86.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer91 = strTokenizer86.setDelimiterString("");
        java.lang.String[] strArray92 = strTokenizer86.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder80.appendWithSeparators((java.lang.Object[]) strArray92, "");
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder21.appendWithSeparators((java.lang.Object[]) strArray92, ".01");
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(stringBuffer77);
        org.junit.Assert.assertEquals(stringBuffer77.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strBuilder96);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int5 = strBuilder4.size;
        boolean boolean7 = strBuilder4.startsWith("#############################################################################################falseeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee10");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.setLength(63);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.setLength((int) (short) 0);
        int int41 = strBuilder38.indexOf("hi!\n", (int) '4');
        int int44 = strBuilder38.indexOf('i', 60);
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
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        java.io.Reader reader13 = java.io.Reader.nullReader();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceAll("", "");
        char[] charArray29 = strBuilder28.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray29);
        int int32 = reader13.read(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer12.reset(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer33.reset("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer35.setDelimiterString("135.01000");
        int int38 = strTokenizer37.size();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer37.reset("StrTokenizer[]");
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer37.getQuoteMatcher();
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.appendFixedWidthPadLeft(1, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.setNewLineText(".0");
        char[] charArray15 = strBuilder14.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) strBuilder17, (int) '4', 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst("StrTokenizer[]", "0");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.setNewLineText(".0");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.replaceFirst("StrTokenizer[]", ".0");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.deleteFirst('#');
        int int16 = strBuilder8.lastIndexOf("StrTokenizer[]", (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.minimizeCapacity();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.insert(0, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder19.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder19.replace(0, (int) 'h', "!ih");
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
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder29.append((float) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder29.replaceFirst('#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder19.append(strBuilder29, (int) (byte) 0, 1);
        char[] charArray61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.insert((int) '7', charArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 55");
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
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
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
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher3 = strTokenizer2.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer0.setTrimmerMatcher(strMatcher3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder19.replaceFirst(strMatcher25, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder9.deleteFirst(strMatcher25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getQuoteMatcher();
        boolean boolean31 = strBuilder9.contains(strMatcher30);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer4.setDelimiterMatcher(strMatcher30);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer32.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getDelimiterMatcher();
        int int37 = strTokenizer35.nextIndex();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strMatcher3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceFirst(strMatcher10, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder4.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.append('e');
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer16 = strBuilder4.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder4.replace(0, 17, "#############################################################################################falseeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee10");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer34 = strBuilder33.new StrBuilderTokenizer();
        int int35 = strBuilder33.size();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray27 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder20.buffer = charArray27;
        char[] charArray29 = strBuilder6.getChars(charArray27);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        int int45 = strBuilder33.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer46 = strBuilder33.new StrBuilderTokenizer();
        java.io.Reader reader47 = java.io.Reader.nullReader();
        char[] charArray49 = new char[] { ' ' };
        int int50 = reader47.read(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.replaceFirst(' ', ' ');
        boolean boolean62 = strBuilder57.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder57.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder57.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray78 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder71.buffer = charArray78;
        char[] charArray80 = strBuilder57.getChars(charArray78);
        int int81 = reader47.read(charArray80);
        java.util.List list84 = strBuilderTokenizer46.tokenize(charArray80, 10, 10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strTokenizer31.reset(charArray80);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer85.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer88 = strTokenizer86.setIgnoreEmptyTokens(true);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strTokenizer88);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(103);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.appendFixedWidthPadRight((int) (byte) 10, 5, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder13.appendPadding((int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        boolean boolean24 = strTokenizer23.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer23.setEmptyTokenAsNull(true);
        boolean boolean27 = strTokenizer26.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer26.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder20.replaceAll(strMatcher28, "0.0");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder1.append(strBuilder20, 100, 7);
        boolean boolean35 = strBuilder33.contains('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.replace(52, 67, "hi!10##################################################################################################108hhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.ensureCapacity((int) (byte) 10);
        int int9 = strBuilder4.size();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceFirst('#', '4');
        int int18 = strBuilder16.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (byte) 1, (long) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder40.replaceFirst(strMatcher46, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder30.deleteFirst(strMatcher46);
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer24.setQuoteMatcher(strMatcher46);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder20.replaceFirst(strMatcher46, "");
        int int54 = strBuilder11.indexOf(strMatcher46, (int) (short) -1);
        java.lang.StringBuffer stringBuffer55 = strBuilder11.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder4.append(stringBuffer55);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder4.deleteFirst('e');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder4.replaceFirst("1000\000\000\000\000", "hi!");
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
        char char90 = strBuilder66.charAt((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder66.appendPadding((int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder66.append(false);
        java.lang.StringBuffer stringBuffer96 = strBuilder66.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder4.append(stringBuffer96);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
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
        org.junit.Assert.assertTrue("'" + char90 + "' != '" + 'i' + "'", char90 == 'i');
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertNotNull(strBuilder95);
        org.junit.Assert.assertNotNull(stringBuffer96);
        org.junit.Assert.assertEquals(stringBuffer96.toString(), "!ih####################################################################################################false");
        org.junit.Assert.assertNotNull(strBuilder97);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str13 = strTokenizer12.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer14.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer12.setTrimmerMatcher(strMatcher15);
        java.util.List list17 = strTokenizer12.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder1.appendWithSeparators((java.util.Collection) list17, "StrTokenizer[not tokenized yet]");
        int int21 = strBuilder1.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strBuilder1.asTokenizer();
        java.lang.String str24 = strBuilder1.rightString(109);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        boolean boolean2 = strTokenizer1.hasPrevious();
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str4 = strTokenizer3.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = strTokenizer5.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer3.setTrimmerMatcher(strMatcher6);
        boolean boolean8 = strTokenizer7.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer7.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer1.setTrimmerMatcher(strMatcher9);
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer1.setIgnoredChar('a');
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer1.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = strTokenizer1.reset();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(strTokenizer14);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceFirst(' ', ' ');
        boolean boolean20 = strBuilder15.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder15.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray36 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder29.buffer = charArray36;
        char[] charArray38 = strBuilder15.getChars(charArray36);
        char[] charArray39 = strBuilder8.getChars(charArray38);
        int int41 = strBuilder8.indexOf("hi!\n");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder8.deleteAll("144.0");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder8.append((float) '#');
        java.lang.String str48 = strBuilder8.midString(42, (-1));
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.insert((int) '#', ".01");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder41.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder41.replaceFirst(strMatcher47, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder31.deleteFirst(strMatcher47);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getQuoteMatcher();
        boolean boolean53 = strBuilder31.contains(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder31.append((float) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder31.append((double) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder57.appendFixedWidthPadRight(5, (int) '4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder65.appendNewLine();
        int int67 = strBuilder65.size;
        int int70 = strBuilder65.indexOf("StrTokenizer[not tokenized yet]", 0);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder65.append(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder23.append(strBuilder72, 112, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strBuilder72);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str2 = strBuilder1.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter3 = strBuilder1.new StrBuilderWriter();
        strBuilderWriter3.close();
        strBuilderWriter3.write(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str8 = strTokenizer7.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strTokenizer7.setTrimmerMatcher(strMatcher10);
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { ' ' };
        int int15 = reader12.read(charArray14);
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer7.reset(charArray14);
        strBuilderWriter3.write(charArray14);
        java.lang.CharSequence charSequence18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer21 = strBuilderWriter3.append(charSequence18, (int) '8', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 56, end 13, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer16);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        boolean boolean1 = strTokenizer0.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer0.setEmptyTokenAsNull(true);
        java.lang.String str4 = strTokenizer3.previousToken();
        java.lang.String str5 = strTokenizer3.previousToken();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = strTokenizer3.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMatcher6);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        java.lang.String str11 = strBuilder4.substring((int) (short) 1, (int) (short) 10);
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.appendWithSeparators(collection12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder(".0");
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
        boolean boolean45 = strBuilder16.contains(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer47.setEmptyTokenAsNull(true);
        java.util.List list50 = strTokenizer49.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder16.appendWithSeparators((java.util.Collection) list50, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder4.appendWithSeparators((java.util.Collection) list50, "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder54.reverse();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader56 = strBuilder54.new StrBuilderReader();
        strBuilderReader56.reset();
        strBuilderReader56.reset();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".0" + "'", str11, ".0");
        org.junit.Assert.assertNotNull(strBuilder14);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.delete((int) (short) 0, 9);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder54.setNewLineText("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder54.append((float) 29);
        int int64 = strBuilder61.lastIndexOf("0.010##################################################################################################-110hi!hi!hi!hi!10hi!StrTokenizer[]hi!!ih", 60);
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
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str2 = strBuilder1.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter3 = strBuilder1.new StrBuilderWriter();
        strBuilderWriter3.close();
        strBuilderWriter3.write(0);
        strBuilderWriter3.write(1);
        // The following exception was thrown during execution in test generation
        try {
            strBuilderWriter3.write(".0", (int) 'h', 42);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer26.setQuoteChar('4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer26.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str32 = strTokenizer31.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer31.setTrimmerMatcher(strMatcher34);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder50.replaceFirst(strMatcher56, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder40.deleteFirst(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getQuoteMatcher();
        boolean boolean62 = strBuilder40.contains(strMatcher61);
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = strTokenizer35.setDelimiterMatcher(strMatcher61);
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strTokenizer30.setIgnoredMatcher(strMatcher61);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strTokenizer30.setDelimiterString("!ih0.097.0\n##################################################-1");
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
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strTokenizer66);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.insert((int) (short) 0, (long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.appendFixedWidthPadRight((int) (byte) 10, 5, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder27.appendPadding((int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        boolean boolean38 = strTokenizer37.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer37.setEmptyTokenAsNull(true);
        boolean boolean41 = strTokenizer40.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer40.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder34.replaceAll(strMatcher42, "0.0");
        boolean boolean46 = strBuilder34.contains("!ih10   !");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder14.appendFixedWidthPadRight((java.lang.Object) strBuilder34, (int) (byte) -1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.replaceFirst('#', '4');
        int int56 = strBuilder54.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder54.replaceFirst('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str62 = strBuilder61.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.replaceAll('4', 'i');
        boolean boolean66 = strBuilder61.isEmpty();
        char[] charArray67 = strBuilder61.toCharArray();
        char[] charArray68 = strBuilder59.getChars(charArray67);
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray68);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder14.append((java.lang.Object) strTokenizer69);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strBuilder70);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll("", "");
        char[] charArray15 = strBuilder14.toCharArray();
        boolean boolean17 = strBuilder14.contains("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.append('a');
        boolean boolean21 = strBuilder14.contains("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder14.append((float) 49);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder14.appendNull();
        char[] charArray25 = strBuilder14.buffer;
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray25);
    }
}

