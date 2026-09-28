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
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.append(1.0d);
        boolean boolean38 = strBuilder36.endsWith("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.deleteAll("eeeeeeeeeeeeeeeeeeee0");
        java.lang.String str41 = strBuilder36.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendNull();
        int int44 = strBuilder36.lastIndexOf("#4");
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!31001.0" + "'", str41, "hi!31001.0");
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceFirst(strMatcher10, "hi!");
        boolean boolean14 = strBuilder12.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.append(0.0d);
        java.lang.String str26 = strBuilder19.substring((int) (short) 1, (int) (short) 10);
        boolean boolean27 = strBuilder12.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder12.setNullText("0");
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter30 = strBuilder12.new StrBuilderWriter();
        java.io.Writer writer32 = strBuilderWriter30.append((java.lang.CharSequence) "2");
        strBuilderWriter30.flush();
        strBuilderWriter30.write("StrTokenizer[not tokenized yet]");
        strBuilderWriter30.write("hi!\0002         ");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ".0" + "'", str26, ".0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(writer32);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str2 = strBuilder1.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.setNewLineText("StrTokenizer[not tokenized yet]");
        java.io.Writer writer5 = strBuilder1.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.append(0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.append('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer18.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder35.replaceFirst(strMatcher41, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder25.deleteFirst(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getQuoteMatcher();
        boolean boolean47 = strBuilder25.contains(strMatcher46);
        char char49 = strBuilder25.charAt((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder25.appendPadding((int) (byte) 100, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str54 = strTokenizer53.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer53.setTrimmerMatcher(strMatcher56);
        boolean boolean58 = strTokenizer57.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer57.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder52.deleteAll(strMatcher59);
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strTokenizer20.setTrimmerMatcher(strMatcher59);
        org.apache.commons.lang.text.StrMatcher strMatcher62 = strTokenizer61.getTrimmerMatcher();
        int int63 = strBuilder10.lastIndexOf(strMatcher62);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder10, 2, '#');
        int int69 = strBuilder10.indexOf("hi!97iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder10.deleteAll("!ih0.0");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder10.setLength(68);
        int int74 = strBuilder10.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(writer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + 'i' + "'", char49 == 'i');
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 68 + "'", int74 == 68);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder6.deleteFirst(".0");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append("0");
        char[] charArray35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append(charArray35);
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
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder36.insert((int) (short) 1, charArray65);
        int int71 = strBuilder36.lastIndexOf("!ih52.0true", (int) (byte) -1);
        java.lang.StringBuffer stringBuffer72 = strBuilder36.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder20.append(stringBuffer72);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder73.setNewLineText("hi!97ii");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(stringBuffer72);
        org.junit.Assert.assertEquals(stringBuffer72.toString(), "!#4 a aih0");
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder7.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.replaceFirst('i', '\000');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strBuilder11.validateRange(50, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.insert((int) (byte) 1, (long) 100);
        int int12 = strBuilder8.capacity();
        boolean boolean14 = strBuilder8.endsWith("0");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader15 = strBuilder8.new StrBuilderReader();
        strBuilderReader15.mark(0);
        java.io.Writer writer18 = java.io.Writer.nullWriter();
        java.io.Writer writer20 = writer18.append('a');
        long long21 = strBuilderReader15.transferTo(writer18);
        boolean boolean22 = strBuilderReader15.markSupported();
        int int23 = strBuilderReader15.read();
        long long25 = strBuilderReader15.skip((long) 63);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(writer18);
        org.junit.Assert.assertNotNull(writer20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5L + "'", long21 == 5L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer45.setQuoteChar('e');
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer45.setQuoteChar('2');
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer49.setEmptyTokenAsNull(true);
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
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strTokenizer51);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.append((long) 98);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append((int) '2');
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
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setEmptyTokenAsNull(true);
        java.util.List list4 = strTokenizer3.getTokenList();
        java.lang.Object obj5 = strTokenizer3.clone();
        boolean boolean6 = strTokenizer3.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder8.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceAll("", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strTokenizer23.setEmptyTokenAsNull(true);
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher51 = strTokenizer50.getQuoteMatcher();
        boolean boolean52 = strBuilder30.contains(strMatcher51);
        char char54 = strBuilder30.charAt((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder30.appendPadding((int) (byte) 100, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str59 = strTokenizer58.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer58.setTrimmerMatcher(strMatcher61);
        boolean boolean63 = strTokenizer62.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher64 = strTokenizer62.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder57.deleteAll(strMatcher64);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strTokenizer25.setTrimmerMatcher(strMatcher64);
        org.apache.commons.lang.text.StrMatcher strMatcher67 = strTokenizer66.getIgnoredMatcher();
        int int69 = strBuilder18.lastIndexOf(strMatcher67, (int) (short) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = strTokenizer3.setIgnoredMatcher(strMatcher67);
        boolean boolean71 = strTokenizer70.hasPrevious();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer25);
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
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + 'i' + "'", char54 == 'i');
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder6.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder18.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.appendNull();
        strBuilder18.size = (byte) 0;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.setNewLineText("StrTokenizer[not tokenized yet]a");
        int int27 = strBuilder18.indexOf("100.010", (int) 'h');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("0.010##################################################################################################-1");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceFirst(strMatcher10, "hi!");
        boolean boolean14 = strBuilder12.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.append(0.0d);
        java.lang.String str26 = strBuilder19.substring((int) (short) 1, (int) (short) 10);
        boolean boolean27 = strBuilder12.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder12.setNullText("0");
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter30 = strBuilder12.new StrBuilderWriter();
        java.io.Writer writer32 = strBuilderWriter30.append((java.lang.CharSequence) "2");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str35 = strBuilder34.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter36 = strBuilder34.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst(' ', ' ');
        boolean boolean48 = strBuilder43.contains(' ');
        java.io.Writer writer49 = strBuilder43.asWriter();
        char[] charArray50 = strBuilder43.toCharArray();
        strBuilderWriter36.write(charArray50);
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray50);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray50);
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray50);
        // The following exception was thrown during execution in test generation
        try {
            strBuilderWriter30.write(charArray50, 50, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: 42");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ".0" + "'", str26, ".0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(writer32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(writer49);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer54);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceAll("", "hi!");
        java.io.Reader reader10 = strBuilder6.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.append(0.0d);
        int int22 = strBuilder15.indexOf(' ', (int) ' ');
        int int25 = strBuilder15.lastIndexOf(".0", (int) (short) -1);
        strBuilder15.size = (short) 1;
        java.lang.String str30 = strBuilder15.midString(108, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder6.append(strBuilder15, 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter31 = strBuilder4.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder4.delete((int) (byte) 0, (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder4.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceAll('0', 'a');
        java.io.Writer writer39 = strBuilder35.asWriter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder35.insert((int) '7', (double) 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 55");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(writer39);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append((java.lang.Object) 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setLength(6);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder6.append((long) 108);
        java.io.Reader reader17 = strBuilder6.asReader();
        strBuilder6.size = (byte) 10;
        boolean boolean20 = strBuilder6.isEmpty();
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strBuilder6.asTokenizer();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strTokenizer21);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder2.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceAll("", "");
        char[] charArray16 = strBuilder15.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray16);
        int int19 = reader0.read(charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.replaceFirst(' ', ' ');
        boolean boolean31 = strBuilder26.contains(' ');
        java.io.Writer writer32 = strBuilder26.asWriter();
        java.io.Writer writer34 = writer32.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.ensureCapacity(0);
        java.lang.StringBuffer stringBuffer42 = strBuilder41.toStringBuffer();
        java.io.Writer writer43 = writer34.append((java.lang.CharSequence) stringBuffer42);
        long long44 = reader0.transferTo(writer43);
        java.io.Writer writer46 = writer43.append('a');
        java.io.Writer writer48 = writer46.append('4');
        java.lang.CharSequence charSequence49 = null;
        java.io.Writer writer50 = writer48.append(charSequence49);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(writer32);
        org.junit.Assert.assertNotNull(writer34);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(stringBuffer42);
        org.junit.Assert.assertEquals(stringBuffer42.toString(), "");
        org.junit.Assert.assertNotNull(writer43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(writer46);
        org.junit.Assert.assertNotNull(writer48);
        org.junit.Assert.assertNotNull(writer50);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("0.0#5aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll("", "");
        char[] charArray15 = strBuilder14.toCharArray();
        boolean boolean17 = strBuilder14.contains("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean33 = strBuilder31.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceFirst('#', '4');
        java.lang.Object[] objArray39 = new java.lang.Object[] { strBuilder35 };
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder31.appendWithSeparators(objArray39, ".0");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder31.appendFixedWidthPadRight((int) (byte) 1, 3, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.setNullText("");
        int int49 = strBuilder47.lastIndexOf("! ih0.097.05##################################################");
        boolean boolean50 = strBuilder14.equalsIgnoreCase(strBuilder47);
        int int53 = strBuilder14.indexOf('#', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
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
        char[] charArray53 = strBuilder26.toCharArray(3, 20);
        int int54 = strBuilder26.capacity();
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
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '.', 'a', 'p', 'a', 'c', 'h', 'e', '.', 'c', 'o', 'm', 'm', 'o', 'n', 's', '.', 'l' });
// flaky "1) test3520(org.apache.commons.lang.text.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 64 + "'", int54 == 64);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.appendFixedWidthPadRight(0, 108, 'e');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.setNullText("! ih0.097.05##################################################");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder31.minimizeCapacity();
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
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("#################################################################################################100");
        int int2 = strTokenizer1.previousIndex();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder12.deleteAll("");
        boolean boolean45 = strBuilder44.isEmpty();
        int int48 = strBuilder44.indexOf("11 000", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder44.reverse();
        java.lang.String str50 = strBuilder44.getNullText();
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
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.insert((int) (short) 1, ' ');
        boolean boolean44 = strBuilder39.contains("false10.0");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.replaceAll('4', '0');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteAll("!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder55.replaceFirst(strMatcher61, "hi!");
        int int65 = strBuilder55.lastIndexOf("StrTokenizer[not tokenized yet]a");
        boolean boolean66 = strBuilder50.equalsIgnoreCase(strBuilder55);
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
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder20.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder23.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strBuilder33.asTokenizer();
        boolean boolean35 = strTokenizer34.hasNext();
        boolean boolean36 = strTokenizer34.hasPrevious();
        java.lang.Object obj37 = strTokenizer34.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strTokenizer34.setEmptyTokenAsNull(false);
        java.lang.String str40 = strTokenizer34.nextToken();
        java.lang.String str41 = strTokenizer34.toString();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer34.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder20.replaceFirst(strMatcher42, "!ih0.0");
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
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "StrTokenizer[]" + "'", str41, "StrTokenizer[]");
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        int int10 = strBuilder8.indexOf('a');
        int int13 = strBuilder8.indexOf(".0", (int) '4');
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.append(stringBuffer14, 1, (int) '4');
        boolean boolean19 = strBuilder17.contains("########################################################################################falsetrue");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer28.setQuoteChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        boolean boolean33 = strTokenizer32.hasPrevious();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str35 = strTokenizer34.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer34.setTrimmerMatcher(strMatcher37);
        boolean boolean39 = strTokenizer38.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer38.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer32.setTrimmerMatcher(strMatcher40);
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer41.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strTokenizer28.setQuoteMatcher(strMatcher42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer43.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer43.reset();
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
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer46);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str1 = strTokenizer0.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer0.setDelimiterChar('a');
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strTokenizer3.setQuoteMatcher(strMatcher4);
        boolean boolean6 = strTokenizer3.isEmptyTokenAsNull();
        java.lang.String str7 = strTokenizer3.previousToken();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.insert(2, ' ');
        int int8 = strBuilder1.indexOf(".0");
        int int9 = strBuilder1.size();
        char[] charArray10 = strBuilder1.buffer;
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        java.lang.String str27 = strTokenizer26.toString();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer26.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder(".0");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder32.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean44 = strBuilder42.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder49.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer54.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder49.replaceFirst(strMatcher55, "hi!");
        int int58 = strBuilder42.lastIndexOf(strMatcher55);
        boolean boolean59 = strBuilder30.contains(strMatcher55);
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = strTokenizer61.setEmptyTokenAsNull(true);
        java.util.List list64 = strTokenizer63.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder30.appendWithSeparators((java.util.Collection) list64, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder66.appendFixedWidthPadLeft((int) (byte) 1, (int) (byte) 1, ' ');
        int int72 = strBuilder66.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str75 = strBuilder74.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter76 = strBuilder74.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder78.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder81.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder83.replaceFirst(' ', ' ');
        boolean boolean88 = strBuilder83.contains(' ');
        java.io.Writer writer89 = strBuilder83.asWriter();
        char[] charArray90 = strBuilder83.toCharArray();
        strBuilderWriter76.write(charArray90);
        org.apache.commons.lang.text.StrTokenizer strTokenizer92 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray90);
        char[] charArray93 = strBuilder66.getChars(charArray90);
        org.apache.commons.lang.text.StrTokenizer strTokenizer94 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray93);
        org.apache.commons.lang.text.StrTokenizer strTokenizer95 = strTokenizer26.reset(charArray93);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str27, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(writer89);
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertArrayEquals(charArray90, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer92);
        org.junit.Assert.assertNotNull(charArray93);
        org.junit.Assert.assertArrayEquals(charArray93, new char[] { '.', '0', '1' });
        org.junit.Assert.assertNotNull(strTokenizer94);
        org.junit.Assert.assertNotNull(strTokenizer95);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.append(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer15.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder32.replaceFirst(strMatcher38, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder22.deleteFirst(strMatcher38);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer42.getQuoteMatcher();
        boolean boolean44 = strBuilder22.contains(strMatcher43);
        char char46 = strBuilder22.charAt((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder22.appendPadding((int) (byte) 100, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str51 = strTokenizer50.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher53 = strTokenizer52.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strTokenizer50.setTrimmerMatcher(strMatcher53);
        boolean boolean55 = strTokenizer54.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer54.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder49.deleteAll(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer17.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer58.getIgnoredMatcher();
        int int60 = strBuilder13.lastIndexOf(strMatcher59);
        java.io.Reader reader61 = java.io.Reader.nullReader();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.replaceFirst(' ', ' ');
        boolean boolean73 = strBuilder68.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder68.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder68.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder82 = new org.apache.commons.lang.text.StrBuilder(".0");
        char[] charArray89 = new char[] { '#', '4', ' ', 'a', ' ', 'a' };
        strBuilder82.buffer = charArray89;
        char[] charArray91 = strBuilder68.getChars(charArray89);
        int int92 = reader61.read(charArray91);
        org.apache.commons.lang.text.StrTokenizer strTokenizer93 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray91);
        java.lang.String[] strArray94 = strTokenizer93.getTokenArray();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder13.appendFixedWidthPadRight((java.lang.Object) strTokenizer93, 33, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 117, length 34");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + 'i' + "'", char46 == 'i');
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(reader61);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertArrayEquals(charArray89, new char[] { '#', '4', ' ', 'a', ' ', 'a' });
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer93);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertArrayEquals(strArray94, new java.lang.String[] { "0.010##################################################################################################" });
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.replaceFirst(strMatcher10, "hi!");
        java.lang.String str13 = strBuilder12.getNewLineText();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strTokenizer1.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        boolean boolean18 = strTokenizer17.hasPrevious();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str20 = strTokenizer19.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer19.setTrimmerMatcher(strMatcher22);
        boolean boolean24 = strTokenizer23.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer23.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer17.setTrimmerMatcher(strMatcher25);
        int int28 = strBuilder15.indexOf(strMatcher25, 9);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer5.setQuoteMatcher(strMatcher25);
        boolean boolean30 = strTokenizer5.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer5.setDelimiterChar('e');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strTokenizer34.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer34.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        boolean boolean51 = strTokenizer50.hasPrevious();
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str53 = strTokenizer52.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer54.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer52.setTrimmerMatcher(strMatcher55);
        boolean boolean57 = strTokenizer56.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer56.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strTokenizer50.setTrimmerMatcher(strMatcher58);
        int int61 = strBuilder48.indexOf(strMatcher58, 9);
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer38.setQuoteMatcher(strMatcher58);
        org.apache.commons.lang.text.StrMatcher strMatcher63 = strTokenizer62.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strTokenizer5.setDelimiterMatcher(strMatcher63);
        boolean boolean65 = strTokenizer5.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("2");
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("iiii");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.replaceFirst(' ', ' ');
        boolean boolean13 = strBuilder8.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder8.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder8.replaceAll(".0", ".0");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.append((int) (byte) -1);
        boolean boolean27 = strBuilder23.endsWith("0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str29 = strTokenizer28.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer28.setTrimmerMatcher(strMatcher31);
        int int33 = strBuilder23.indexOf(strMatcher31);
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer1.setIgnoredMatcher(strMatcher31);
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer34);
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder4.append((float) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst("!ih", "135.01000");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer31 = strBuilder30.new StrBuilderTokenizer();
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
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst(' ', ' ');
        boolean boolean11 = strBuilder6.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.replaceFirst(strMatcher22, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder16.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder6.append(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.String str29 = strBuilder28.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder31.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean43 = strBuilder41.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer53.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder48.replaceFirst(strMatcher54, "hi!");
        int int57 = strBuilder41.lastIndexOf(strMatcher54);
        int int59 = strBuilder28.indexOf(strMatcher54, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder25.deleteAll(strMatcher54);
        int int63 = strBuilder60.lastIndexOf(".0hi!\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 100);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(0.0d);
        java.lang.String str11 = strBuilder4.substring((int) (short) 1, (int) (short) 10);
        int int12 = strBuilder4.size();
        char char14 = strBuilder4.charAt((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str24 = strTokenizer23.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer23.setTrimmerMatcher(strMatcher26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer27.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) strTokenizer28, (int) (byte) -1, 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder4.appendFixedWidthPadRight((java.lang.Object) (byte) -1, 3, 'e');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter35 = strBuilder4.new StrBuilderWriter();
        strBuilderWriter35.write(4);
        strBuilderWriter35.write(8);
        java.io.Writer writer41 = strBuilderWriter35.append('4');
        strBuilderWriter35.close();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".0" + "'", str11, ".0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '0' + "'", char14 == '0');
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(writer41);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        strBuilder44.validateIndex(3);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.replaceFirst(' ', ' ');
        boolean boolean64 = strBuilder59.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder59.insert(0, (float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder59.appendFixedWidthPadRight(10, (int) (byte) 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder59.replaceAll(".0", ".0");
        int int77 = strBuilder74.indexOf('#', (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder74.reverse();
        boolean boolean79 = strBuilder44.equals((java.lang.Object) strBuilder78);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder44.replace(4, (int) (byte) 10, "!ih");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder83.append((long) 208);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = new org.apache.commons.lang.text.StrBuilder("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder87.append('a');
        char char91 = strBuilder87.charAt((int) (short) 10);
        java.lang.String str92 = strBuilder87.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder83.append((java.lang.Object) str92);
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
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 52 + "'", int77 == 52);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertTrue("'" + char91 + "' != '" + 'e' + "'", char91 == 'e');
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "StrTokenizer[not tokenized yet]a" + "'", str92, "StrTokenizer[not tokenized yet]a");
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('#', '4');
        int int6 = strBuilder4.indexOf('#');
        boolean boolean8 = strBuilder4.contains("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder4.replaceFirst('a', 'a');
        java.lang.StringBuffer stringBuffer12 = strBuilder4.toStringBuffer();
        int int15 = strBuilder4.validateRange((int) (short) 0, 10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder32.replaceFirst(strMatcher38, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder22.deleteFirst(strMatcher38);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer16.setQuoteMatcher(strMatcher38);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer42.setQuoteChar('4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer42.setEmptyTokenAsNull(false);
        int int47 = strTokenizer42.nextIndex();
        java.util.List list48 = strTokenizer42.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder4.appendWithSeparators((java.util.Collection) list48, "hi!\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder4.replaceFirst('4', '3');
        char[] charArray54 = strBuilder4.buffer;
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(charArray54);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll("", "");
        char[] charArray15 = strBuilder14.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray15);
        boolean boolean17 = strTokenizer16.hasPrevious();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.append(0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder22.appendFixedWidthPadRight(5, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer42.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder37.replaceFirst(strMatcher43, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder47.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) (byte) -1, ' ');
        boolean boolean59 = strBuilder57.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder64.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher70 = strTokenizer69.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder64.replaceFirst(strMatcher70, "hi!");
        int int73 = strBuilder57.lastIndexOf(strMatcher70);
        int int75 = strBuilder45.indexOf(strMatcher70, (int) (byte) 100);
        int int76 = strBuilder32.indexOf(strMatcher70);
        org.apache.commons.lang.text.StrTokenizer strTokenizer77 = strTokenizer16.setQuoteMatcher(strMatcher70);
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = strTokenizer16.setEmptyTokenAsNull(true);
        java.lang.String[] strArray80 = strTokenizer79.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strTokenizer79.setEmptyTokenAsNull(false);
        java.util.List list83 = strTokenizer82.getTokenList();
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertNotNull(list83);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        int int32 = strBuilder30.lastIndexOf('a');
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        int int35 = strBuilder30.lastIndexOf(strMatcher33, 10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        java.lang.String str37 = strTokenizer36.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = strTokenizer38.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer36.setTrimmerMatcher(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder45.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder55.replaceFirst(strMatcher61, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder45.deleteFirst(strMatcher61);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher66 = strTokenizer65.getQuoteMatcher();
        boolean boolean67 = strBuilder45.contains(strMatcher66);
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = strTokenizer40.setDelimiterMatcher(strMatcher66);
        boolean boolean69 = strTokenizer40.isEmptyTokenAsNull();
        java.lang.String[] strArray70 = strTokenizer40.getTokenArray();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = strTokenizer40.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder30.replaceFirst(strMatcher71, "11 000");
        int int75 = strBuilder73.indexOf('4');
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }
}
